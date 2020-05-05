// Generated from D:/code/workshop20200415/sharding-parser/src/main/antlr4/imports\SQLStatement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLStatementParser}.
 */
public interface SQLStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(SQLStatementParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(SQLStatementParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(SQLStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(SQLStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQLStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQLStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(SQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(SQLStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(SQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(SQLStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(SQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(SQLStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(SQLStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(SQLStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLStatementParser.IdentifierContext ctx);
}