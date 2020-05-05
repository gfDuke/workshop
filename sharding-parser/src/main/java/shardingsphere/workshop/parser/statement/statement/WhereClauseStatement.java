package shardingsphere.workshop.parser.statement.statement;

import java.util.List;
import java.util.Map;
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
public class WhereClauseStatement implements ASTNode {

    private IdentifierSegment columnSegment;

    private String where;

    private IdentifierSegment valueSegment;

    @Override
    public String toString() {

        return columnSegment.getValue() + where + valueSegment.getValue();
    }

}
