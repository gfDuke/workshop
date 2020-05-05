// Generated from autogen\MySQLStatement.g4 by ANTLR 4.7.2
package autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, OR_=2, NOT_=3, TILDE_=4, VERTICAL_BAR_=5, AMPERSAND_=6, SIGNED_LEFT_SHIFT_=7, 
		SIGNED_RIGHT_SHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOT_ASTERISK_=18, SAFE_EQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, BQ_=37, QUESTION_=38, AT_=39, SEMI_=40, WS=41, USE=42, INSERT=43, 
		SELECT=44, TABLE=45, COLUMN=46, INTO=47, VALUES=48, VALUE=49, FROM=50, 
		WHERE=51, AND=52, OR=53, NOT=54, BETWEEN=55, IN=56, IDENTIFIER_=57, STRING_=58, 
		NUMBER_=59, HEX_DIGIT_=60, BIT_NUM_=61, INT_=62, HEX_=63;
	public static final int
		RULE_execute = 0, RULE_use = 1, RULE_schemaName = 2, RULE_select = 3, 
		RULE_insert = 4, RULE_assignmentValues = 5, RULE_assignmentValue = 6, 
		RULE_columnNames = 7, RULE_columnName = 8, RULE_tableName = 9, RULE_identifier = 10, 
		RULE_selectElements = 11, RULE_selectElement = 12, RULE_whereClause = 13, 
		RULE_logicExpression = 14, RULE_logicalOperator = 15, RULE_comparisonOperator = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"execute", "use", "schemaName", "select", "insert", "assignmentValues", 
			"assignmentValue", "columnNames", "columnName", "tableName", "identifier", 
			"selectElements", "selectElement", "whereClause", "logicExpression", 
			"logicalOperator", "comparisonOperator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "WS", "USE", "INSERT", "SELECT", 
			"TABLE", "COLUMN", "INTO", "VALUES", "VALUE", "FROM", "WHERE", "AND", 
			"OR", "NOT", "BETWEEN", "IN", "IDENTIFIER_", "STRING_", "NUMBER_", "HEX_DIGIT_", 
			"BIT_NUM_", "INT_", "HEX_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MySQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExecuteContext extends ParserRuleContext {
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode SEMI_() { return getToken(MySQLStatementParser.SEMI_, 0); }
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				{
				setState(34);
				use();
				}
				break;
			case INSERT:
				{
				setState(35);
				insert();
				}
				break;
			case SELECT:
				{
				setState(36);
				select();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_) {
				{
				setState(39);
				match(SEMI_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLStatementParser.USE, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(USE);
			setState(43);
			schemaName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(MySQLStatementParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLStatementParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(SELECT);
			setState(48);
			selectElements();
			setState(49);
			match(FROM);
			setState(50);
			tableName();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(51);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLStatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLStatementParser.VALUES, 0); }
		public AssignmentValuesContext assignmentValues() {
			return getRuleContext(AssignmentValuesContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLStatementParser.INTO, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(INSERT);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(55);
				match(INTO);
				}
			}

			setState(58);
			tableName();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(59);
				columnNames();
				}
			}

			setState(62);
			match(VALUES);
			setState(63);
			assignmentValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValuesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LP_);
			setState(66);
			assignmentValue();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(67);
				match(COMMA_);
				setState(68);
				assignmentValue();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignmentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LP_);
			setState(79);
			columnName();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(80);
				match(COMMA_);
				setState(81);
				columnName();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(MySQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(MySQLStatementParser.STRING_, 0); }
		public TerminalNode NUMBER_() { return getToken(MySQLStatementParser.NUMBER_, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER_) | (1L << STRING_) | (1L << NUMBER_))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(MySQLStatementParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK_:
				{
				setState(95);
				((SelectElementsContext)_localctx).star = match(ASTERISK_);
				}
				break;
			case IDENTIFIER_:
			case STRING_:
			case NUMBER_:
				{
				setState(96);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(99);
				match(COMMA_);
				setState(100);
				selectElement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLStatementParser.WHERE, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(WHERE);
			setState(109);
			logicExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExpressionContext extends ParserRuleContext {
		public SelectElementContext selectElement() {
			return getRuleContext(SelectElementContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLStatementParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public TerminalNode IN() { return getToken(MySQLStatementParser.IN, 0); }
		public TerminalNode LP_() { return getToken(MySQLStatementParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(MySQLStatementParser.RP_, 0); }
		public TerminalNode NOT() { return getToken(MySQLStatementParser.NOT, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(MySQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(MySQLStatementParser.COMMA_, i);
		}
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		return logicExpression(0);
	}

	private LogicExpressionContext logicExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, _parentState);
		LogicExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_logicExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(112);
				selectElement();
				setState(113);
				comparisonOperator();
				setState(114);
				identifier();
				}
				break;
			case 2:
				{
				setState(116);
				selectElement();
				setState(117);
				match(BETWEEN);
				setState(118);
				identifier();
				setState(119);
				match(AND);
				setState(120);
				identifier();
				}
				break;
			case 3:
				{
				setState(122);
				selectElement();
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(123);
					match(NOT);
					}
				}

				setState(126);
				match(IN);
				setState(127);
				match(LP_);
				setState(128);
				identifier();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(129);
					match(COMMA_);
					setState(130);
					identifier();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(136);
				match(RP_);
				}
				break;
			case 4:
				{
				setState(138);
				match(LP_);
				setState(139);
				logicExpression(0);
				setState(140);
				match(RP_);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpression);
					setState(144);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(145);
					logicalOperator();
					setState(146);
					logicExpression(6);
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MySQLStatementParser.AND, 0); }
		public List<TerminalNode> AMPERSAND_() { return getTokens(MySQLStatementParser.AMPERSAND_); }
		public TerminalNode AMPERSAND_(int i) {
			return getToken(MySQLStatementParser.AMPERSAND_, i);
		}
		public TerminalNode OR() { return getToken(MySQLStatementParser.OR, 0); }
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(MySQLStatementParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(MySQLStatementParser.VERTICAL_BAR_, i);
		}
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalOperator);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(AND);
				}
				break;
			case AMPERSAND_:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(AMPERSAND_);
				setState(155);
				match(AMPERSAND_);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(OR);
				}
				break;
			case VERTICAL_BAR_:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				match(VERTICAL_BAR_);
				setState(158);
				match(VERTICAL_BAR_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(MySQLStatementParser.EQ_, 0); }
		public TerminalNode GT_() { return getToken(MySQLStatementParser.GT_, 0); }
		public TerminalNode LT_() { return getToken(MySQLStatementParser.LT_, 0); }
		public TerminalNode NOT_() { return getToken(MySQLStatementParser.NOT_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLStatementVisitor ) return ((MySQLStatementVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparisonOperator);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(EQ_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(GT_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(LT_);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				match(LT_);
				setState(165);
				match(EQ_);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				match(GT_);
				setState(167);
				match(EQ_);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				match(LT_);
				setState(169);
				match(GT_);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(NOT_);
				setState(171);
				match(EQ_);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(LT_);
				setState(173);
				match(EQ_);
				setState(174);
				match(GT_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return logicExpression_sempred((LogicExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicExpression_sempred(LogicExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u00b4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\5\2(\n\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\67\n\5\3\6\3\6\5\6;\n\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\tU"+
		"\n\t\f\t\16\tX\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\rd\n\r"+
		"\3\r\3\r\7\rh\n\r\f\r\16\rk\13\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\177\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u0086\n\20\f\20\16\20\u0089\13\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0091\n\20\3\20\3\20\3\20\3\20\7\20\u0097"+
		"\n\20\f\20\16\20\u009a\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a2"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00b2\n\22\3\22\2\3\36\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\3\3\2;=\2\u00bc\2\'\3\2\2\2\4,\3\2\2\2\6/\3\2\2\2\b\61\3\2"+
		"\2\2\n8\3\2\2\2\fC\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22[\3\2\2\2\24]\3\2"+
		"\2\2\26_\3\2\2\2\30c\3\2\2\2\32l\3\2\2\2\34n\3\2\2\2\36\u0090\3\2\2\2"+
		" \u00a1\3\2\2\2\"\u00b1\3\2\2\2$(\5\4\3\2%(\5\n\6\2&(\5\b\5\2\'$\3\2\2"+
		"\2\'%\3\2\2\2\'&\3\2\2\2(*\3\2\2\2)+\7*\2\2*)\3\2\2\2*+\3\2\2\2+\3\3\2"+
		"\2\2,-\7,\2\2-.\5\6\4\2.\5\3\2\2\2/\60\5\26\f\2\60\7\3\2\2\2\61\62\7."+
		"\2\2\62\63\5\30\r\2\63\64\7\64\2\2\64\66\5\24\13\2\65\67\5\34\17\2\66"+
		"\65\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\28:\7-\2\29;\7\61\2\2:9\3\2\2\2:"+
		";\3\2\2\2;<\3\2\2\2<>\5\24\13\2=?\5\20\t\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2"+
		"\2@A\7\62\2\2AB\5\f\7\2B\13\3\2\2\2CD\7\36\2\2DI\5\16\b\2EF\7$\2\2FH\5"+
		"\16\b\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM"+
		"\7\37\2\2M\r\3\2\2\2NO\5\26\f\2O\17\3\2\2\2PQ\7\36\2\2QV\5\22\n\2RS\7"+
		"$\2\2SU\5\22\n\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3"+
		"\2\2\2YZ\7\37\2\2Z\21\3\2\2\2[\\\5\26\f\2\\\23\3\2\2\2]^\5\26\f\2^\25"+
		"\3\2\2\2_`\t\2\2\2`\27\3\2\2\2ad\7\20\2\2bd\5\32\16\2ca\3\2\2\2cb\3\2"+
		"\2\2di\3\2\2\2ef\7$\2\2fh\5\32\16\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2j\31\3\2\2\2ki\3\2\2\2lm\5\26\f\2m\33\3\2\2\2no\7\65\2\2op\5\36"+
		"\20\2p\35\3\2\2\2qr\b\20\1\2rs\5\32\16\2st\5\"\22\2tu\5\26\f\2u\u0091"+
		"\3\2\2\2vw\5\32\16\2wx\79\2\2xy\5\26\f\2yz\7\66\2\2z{\5\26\f\2{\u0091"+
		"\3\2\2\2|~\5\32\16\2}\177\78\2\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\7:\2\2\u0081\u0082\7\36\2\2\u0082\u0087\5\26\f\2\u0083"+
		"\u0084\7$\2\2\u0084\u0086\5\26\f\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\37\2\2\u008b\u0091\3\2\2\2\u008c\u008d\7"+
		"\36\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7\37\2\2\u008f\u0091\3\2\2\2"+
		"\u0090q\3\2\2\2\u0090v\3\2\2\2\u0090|\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\u0098\3\2\2\2\u0092\u0093\f\7\2\2\u0093\u0094\5 \21\2\u0094\u0095\5\36"+
		"\20\b\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\37\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u00a2\7\66\2\2\u009c\u009d\7\b\2\2\u009d\u00a2\7\b\2\2\u009e"+
		"\u00a2\7\67\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a2\7\7\2\2\u00a1\u009b\3"+
		"\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"!\3\2\2\2\u00a3\u00b2\7\27\2\2\u00a4\u00b2\7\31\2\2\u00a5\u00b2\7\33\2"+
		"\2\u00a6\u00a7\7\33\2\2\u00a7\u00b2\7\27\2\2\u00a8\u00a9\7\31\2\2\u00a9"+
		"\u00b2\7\27\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00b2\7\31\2\2\u00ac\u00ad"+
		"\7\5\2\2\u00ad\u00b2\7\27\2\2\u00ae\u00af\7\33\2\2\u00af\u00b0\7\27\2"+
		"\2\u00b0\u00b2\7\31\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1"+
		"\u00a5\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00aa\3\2"+
		"\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2#\3\2\2\2\21\'*\66:"+
		">IVci~\u0087\u0090\u0098\u00a1\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}