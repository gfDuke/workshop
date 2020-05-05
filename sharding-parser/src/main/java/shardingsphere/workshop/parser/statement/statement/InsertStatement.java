package shardingsphere.workshop.parser.statement.statement;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import shardingsphere.workshop.parser.statement.ASTNode;
import shardingsphere.workshop.parser.statement.segment.IdentifierSegment;

/**
 * InsertStatement
 *
 * @author gaofeng
 */
@AllArgsConstructor
@Getter
public class InsertStatement implements ASTNode {

    private IdentifierSegment tableNameSegment;

    private List<IdentifierSegment> columnNameSegmentList;

    private List<IdentifierSegment> valueSegmentList;

}
