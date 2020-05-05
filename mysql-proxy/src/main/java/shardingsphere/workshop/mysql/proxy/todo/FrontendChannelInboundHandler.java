
package shardingsphere.workshop.mysql.proxy.todo;

import static autogen.MySQLStatementParser.FROM;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import shardingsphere.workshop.mysql.proxy.fixture.MySQLAuthenticationHandler;
import shardingsphere.workshop.mysql.proxy.fixture.packet.MySQLErrPacketFactory;
import shardingsphere.workshop.mysql.proxy.fixture.packet.MySQLPacketPayload;
import shardingsphere.workshop.mysql.proxy.fixture.packet.constant.MySQLColumnType;
import shardingsphere.workshop.mysql.proxy.todo.packet.MySQLColumnDefinition41Packet;
import shardingsphere.workshop.mysql.proxy.todo.packet.MySQLEofPacket;
import shardingsphere.workshop.mysql.proxy.todo.packet.MySQLFieldCountPacket;
import shardingsphere.workshop.mysql.proxy.todo.packet.MySQLTextResultSetRowPacket;
import shardingsphere.workshop.mysql.proxy.utils.JdbcUtils;
import shardingsphere.workshop.parser.engine.ParseEngine;
import shardingsphere.workshop.parser.statement.segment.IdentifierSegment;
import shardingsphere.workshop.parser.statement.statement.SelectStatement;
import shardingsphere.workshop.parser.statement.statement.WhereClauseStatement;

/**
 * Frontend channel inbound handler.
 */
@RequiredArgsConstructor
@Slf4j
public final class FrontendChannelInboundHandler extends ChannelInboundHandlerAdapter {

    private final MySQLAuthenticationHandler authHandler = new MySQLAuthenticationHandler();

    private boolean authorized;

    @Override
    public void channelActive(final ChannelHandlerContext context) {
        authHandler.handshake(context);
    }

    @Override
    public void channelRead(final ChannelHandlerContext context, final Object message) {
        if (!authorized) {
            authorized = auth(context, (ByteBuf) message);
            return;
        }
        try (MySQLPacketPayload payload = new MySQLPacketPayload((ByteBuf) message)) {
            executeCommand(context, payload);
        } catch (final Exception ex) {
            log.error("Exception occur: ", ex);
            context.writeAndFlush(MySQLErrPacketFactory.newInstance(1, ex));
        }
    }

    @Override
    public void channelInactive(final ChannelHandlerContext context) {
        context.fireChannelInactive();
    }

    private boolean auth(final ChannelHandlerContext context, final ByteBuf message) {
        try (MySQLPacketPayload payload = new MySQLPacketPayload(message)) {
            return authHandler.auth(context, payload);
        } catch (final Exception ex) {
            log.error("Exception occur: ", ex);
            context.write(MySQLErrPacketFactory.newInstance(1, ex));
        }
        return false;
    }

    private void executeCommand(final ChannelHandlerContext context, final MySQLPacketPayload payload)
        throws SQLException {
        Preconditions.checkState(0x03 == payload.readInt1(), "only support COM_QUERY command type");
        String sql = payload.readStringEOF();
        log.info("clint slq :{}", sql);
        context.write(new MySQLFieldCountPacket(1, 3));
        //解析sql
        SelectStatement selectStatement = (SelectStatement) ParseEngine.parse(sql);

        //列的定义
        List<IdentifierSegment> columnNameSegmentList = selectStatement.getColumnNameSegmentList();
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<String> columnList = new ArrayList<>();
        int j = 2;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();
            //可以处理为更复杂的sql,将普通sql转换成其他
            if (columnNameSegmentList != null && columnNameSegmentList.size() > 0) {
                for (IdentifierSegment columnNameSegment : columnNameSegmentList) {
                    columnList.add(columnNameSegment.getValue());
                    context.write(new MySQLColumnDefinition41Packet(j++, 0, "sharding_db",
                        selectStatement.getTableNameSegment().getValue(),
                        selectStatement.getTableNameSegment().getValue(),
                        columnNameSegment.getValue(), columnNameSegment.getValue(), 100,
                        MySQLColumnType.MYSQL_TYPE_STRING, 0));
                }

                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("select").append(" ").append(String.join(",", columnList)).append(" ")
                    .append("from")
                    .append(" ")
                    .append(selectStatement.getTableNameSegment().getValue());
                List<WhereClauseStatement> whereClauseStatementList = selectStatement
                    .getWhereClauseStatementList();
                if (whereClauseStatementList != null && whereClauseStatementList.size() > 0) {
                    stringBuilder.append(" where").append(" ");
                    List<String> collect = whereClauseStatementList.stream()
                        .map(whereClauseStatement -> whereClauseStatement.toString()).collect(
                            Collectors.toList());
                    String join = String.join(" and ", collect);
                    stringBuilder.append(join);
                }
                log.info("解析之后的sql，{}", stringBuilder.toString());
                rs = st.executeQuery(stringBuilder.toString());
            } else {
                rs = st.executeQuery(sql);
                //可以直接使用发过来的sql
            }
            context.write(new MySQLEofPacket(j));
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnLabel = metaData.getColumnLabel(i);
                columnList.add(columnLabel);
            }
            while (rs.next()) {
                List<Object> objectList = new ArrayList<>();
                for (String column : columnList) {
                    Object object = rs.getObject(column);
                    objectList.add(object);
                }
                context.write(new MySQLTextResultSetRowPacket(++j, objectList));
            }
            context.write(new MySQLEofPacket(++j));
            context.flush();
        } finally {
            JdbcUtils.release(conn, st, rs);
        }
    }

}