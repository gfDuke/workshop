package shardingsphere.workshop.parser.statement.statement;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import shardingsphere.workshop.parser.statement.ASTNode;
import shardingsphere.workshop.parser.statement.segment.IdentifierSegment;

/**
 * SelectStatement
 *
 * @author gaofeng
 */
@Getter
@AllArgsConstructor
public class SelectStatement implements ASTNode {

    private IdentifierSegment tableNameSegment;

    private List<IdentifierSegment> columnNameSegmentList;

    private List<WhereClauseStatement> whereClauseStatementList;

}
