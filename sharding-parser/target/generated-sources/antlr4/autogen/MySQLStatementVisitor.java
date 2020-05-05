// Generated from autogen\MySQLStatement.g4 by ANTLR 4.7.2
package autogen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(MySQLStatementParser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(MySQLStatementParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(MySQLStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MySQLStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(MySQLStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(MySQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(MySQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(MySQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySQLStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MySQLStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(MySQLStatementParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElement(MySQLStatementParser.SelectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySQLStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#logicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpression(MySQLStatementParser.LogicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(MySQLStatementParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySQLStatementParser.ComparisonOperatorContext ctx);
}