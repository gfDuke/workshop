
package shardingsphere.workshop.parser.engine.visitor;

import autogen.MySQLStatementBaseVisitor;
import autogen.MySQLStatementParser.AssignmentValueContext;
import autogen.MySQLStatementParser.AssignmentValuesContext;
import autogen.MySQLStatementParser.ColumnNameContext;
import autogen.MySQLStatementParser.ColumnNamesContext;
import autogen.MySQLStatementParser.ComparisonOperatorContext;
import autogen.MySQLStatementParser.IdentifierContext;
import autogen.MySQLStatementParser.InsertContext;
import autogen.MySQLStatementParser.LogicExpressionContext;
import autogen.MySQLStatementParser.SchemaNameContext;
import autogen.MySQLStatementParser.SelectContext;
import autogen.MySQLStatementParser.SelectElementContext;
import autogen.MySQLStatementParser.SelectElementsContext;
import autogen.MySQLStatementParser.TableNameContext;
import autogen.MySQLStatementParser.UseContext;
import autogen.MySQLStatementParser.WhereClauseContext;
import com.google.common.collect.Collections2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import shardingsphere.workshop.parser.statement.ASTNode;
import shardingsphere.workshop.parser.statement.segment.IdentifierSegment;
import shardingsphere.workshop.parser.statement.segment.SchemeNameSegment;
import shardingsphere.workshop.parser.statement.statement.InsertStatement;
import shardingsphere.workshop.parser.statement.statement.SelectStatement;
import shardingsphere.workshop.parser.statement.statement.UseStatement;
import shardingsphere.workshop.parser.statement.statement.WhereClauseStatement;

/**
 * MySQL visitor.
 */
public final class SQLVisitor extends MySQLStatementBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitUse(final UseContext ctx) {
        SchemeNameSegment schemeName = (SchemeNameSegment) visit(ctx.schemaName());
        return new UseStatement(schemeName);
    }

    @Override
    public ASTNode visitSchemaName(final SchemaNameContext ctx) {
        IdentifierSegment identifier = (IdentifierSegment) visit(ctx.identifier());
        return new SchemeNameSegment(identifier);
    }

    @Override
    public ASTNode visitIdentifier(final IdentifierContext ctx) {
        return new IdentifierSegment(ctx.getText());
    }

    @Override
    public ASTNode visitInsert(InsertContext ctx) {
        IdentifierSegment tableSegment = (IdentifierSegment) visit(ctx.tableName());

        ColumnNamesContext columnNamesContext = ctx.columnNames();
        List<ColumnNameContext> columnNameContextList = columnNamesContext.columnName();
        List<IdentifierSegment> columnSegmentList = new ArrayList<>();
        for (ColumnNameContext columnNameContext : columnNameContextList) {
            IdentifierSegment columnNameSegment = (IdentifierSegment) visit(columnNameContext);
            columnSegmentList.add(columnNameSegment);
        }
        AssignmentValuesContext assignmentValuesContext = ctx.assignmentValues();
        List<AssignmentValueContext> assignmentValueContextList = assignmentValuesContext.assignmentValue();
        List<IdentifierSegment> valueSegmentList = new ArrayList<>();
        for (AssignmentValueContext valueContext : assignmentValueContextList) {
            IdentifierSegment valueSegment = (IdentifierSegment) visit(valueContext);
            valueSegmentList.add(valueSegment);
        }

        InsertStatement insertStatement = new InsertStatement(tableSegment, columnSegmentList,
            valueSegmentList);
        return insertStatement;
    }

    @Override
    public ASTNode visitTableName(TableNameContext ctx) {
        return visitIdentifier(ctx.identifier());
    }


    @Override
    public ASTNode visitColumnName(ColumnNameContext ctx) {
        return visitIdentifier(ctx.identifier());
    }

    @Override
    public ASTNode visitAssignmentValue(AssignmentValueContext ctx) {
        return visitIdentifier(ctx.identifier());
    }

    @Override
    public ASTNode visitSelect(SelectContext ctx) {
        IdentifierSegment tableSegment = (IdentifierSegment) visit(ctx.tableName());

        SelectElementsContext selectElementsContext = ctx.selectElements();
        List<SelectElementContext> selectElementContexts = selectElementsContext.selectElement();
        List<IdentifierSegment> columnSegmentList = new ArrayList<>();
        for (SelectElementContext columnNameContext : selectElementContexts) {
            IdentifierSegment columnNameSegment = (IdentifierSegment) visit(columnNameContext);
            columnSegmentList.add(columnNameSegment);
        }

        WhereClauseContext whereClauseContext = ctx.whereClause();
        List<WhereClauseStatement> whereClauseStatements = new ArrayList<>();
        if(whereClauseContext!=null) {
            LogicExpressionContext logicExpressionContext = whereClauseContext.logicExpression();
            List<LogicExpressionContext> logicExpressionContexts = logicExpressionContext.logicExpression();
            if (logicExpressionContexts != null && logicExpressionContexts.size() > 0) {
                for (LogicExpressionContext context : logicExpressionContexts) {
                    List<WhereClauseStatement> whereClauseStatement = getWhereClauseStatement(context);
                    whereClauseStatements.addAll(whereClauseStatement);
                }
            } else {
                List<WhereClauseStatement> whereClauseStatement = getWhereClauseStatement(
                    logicExpressionContext);
                whereClauseStatements.addAll(whereClauseStatement);
            }

        }


        SelectStatement selectStatement = new SelectStatement(tableSegment, columnSegmentList,
            whereClauseStatements);

        return selectStatement;
    }


    private List<WhereClauseStatement> getWhereClauseStatement( LogicExpressionContext logicExpressionContext){
        List<WhereClauseStatement> whereClauseStatements = new ArrayList<>();
        SelectElementContext selectElementContext = logicExpressionContext.selectElement();
        IdentifierSegment clauseColumn = (IdentifierSegment) visit(selectElementContext);
        ComparisonOperatorContext comparisonOperatorContext = logicExpressionContext.comparisonOperator();
        String where = ((ArrayList) comparisonOperatorContext.children).get(0).toString();
        List<IdentifierContext> identifier = logicExpressionContext.identifier();
        for (IdentifierContext identifierContext : identifier) {
            IdentifierSegment value = (IdentifierSegment) visit(identifierContext);
            WhereClauseStatement whereClauseStatement = new WhereClauseStatement(clauseColumn, where, value);
            whereClauseStatements.add(whereClauseStatement);
        }

        return whereClauseStatements;
    }

}
