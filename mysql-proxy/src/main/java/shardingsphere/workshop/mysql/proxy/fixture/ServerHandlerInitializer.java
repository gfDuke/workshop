
package shardingsphere.workshop.mysql.proxy.fixture;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import shardingsphere.workshop.mysql.proxy.todo.FrontendChannelInboundHandler;

/**
 * Channel initializer.
 */
@RequiredArgsConstructor
public final class ServerHandlerInitializer extends ChannelInitializer<SocketChannel> {

    private JdbcTemplate jdbcTemplate;
    
    @Override
    protected void initChannel(final SocketChannel socketChannel) {
        ChannelPipeline pipeline = socketChannel.pipeline();
        pipeline.addLast(new MySQLPacketCodec());
        pipeline.addLast(new FrontendChannelInboundHandler());
    }
}
