// Generated from D:/code/workshop20200415/sharding-parser/src/main/antlr4/imports\SQLStatement.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLStatementParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		RULE_use = 0, RULE_schemaName = 1, RULE_insert = 2, RULE_assignmentValues = 3, 
		RULE_assignmentValue = 4, RULE_columnNames = 5, RULE_columnName = 6, RULE_tableName = 7, 
		RULE_identifier = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"use", "schemaName", "insert", "assignmentValues", "assignmentValue", 
			"columnNames", "columnName", "tableName", "identifier"
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
	public String getGrammarFileName() { return "SQLStatement.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLStatementParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class UseContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLStatementParser.USE, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(USE);
			setState(19);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLStatementParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(SQLStatementParser.VALUE, 0); }
		public AssignmentValuesContext assignmentValues() {
			return getRuleContext(AssignmentValuesContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SQLStatementParser.INTO, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(INSERT);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(24);
				match(INTO);
				}
			}

			setState(27);
			tableName();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(28);
				columnNames();
				}
			}

			setState(31);
			match(VALUE);
			setState(32);
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
		public TerminalNode LP_() { return getToken(SQLStatementParser.LP_, 0); }
		public List<AssignmentValueContext> assignmentValue() {
			return getRuleContexts(AssignmentValueContext.class);
		}
		public AssignmentValueContext assignmentValue(int i) {
			return getRuleContext(AssignmentValueContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLStatementParser.COMMA_, i);
		}
		public AssignmentValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterAssignmentValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitAssignmentValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitAssignmentValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValuesContext assignmentValues() throws RecognitionException {
		AssignmentValuesContext _localctx = new AssignmentValuesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(LP_);
			setState(35);
			assignmentValue();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(36);
				match(COMMA_);
				setState(37);
				assignmentValue();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterAssignmentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitAssignmentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitAssignmentValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentValueContext assignmentValue() throws RecognitionException {
		AssignmentValueContext _localctx = new AssignmentValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentValue);
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

	public static class ColumnNamesContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(SQLStatementParser.LP_, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RP_() { return getToken(SQLStatementParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(SQLStatementParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(SQLStatementParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(LP_);
			setState(48);
			columnName();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(49);
				match(COMMA_);
				setState(50);
				columnName();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		public TerminalNode IDENTIFIER_() { return getToken(SQLStatementParser.IDENTIFIER_, 0); }
		public TerminalNode STRING_() { return getToken(SQLStatementParser.STRING_, 0); }
		public TerminalNode NUMBER_() { return getToken(SQLStatementParser.NUMBER_, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLStatementListener ) ((SQLStatementListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLStatementVisitor ) return ((SQLStatementVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3AC\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\5\4\34\n\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5)\n\5\f\5\16\5,\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\66\n\7\f"+
		"\7\16\79\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16"+
		"\20\22\2\3\3\2;=\2=\2\24\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b$\3\2\2\2"+
		"\n/\3\2\2\2\f\61\3\2\2\2\16<\3\2\2\2\20>\3\2\2\2\22@\3\2\2\2\24\25\7,"+
		"\2\2\25\26\5\4\3\2\26\3\3\2\2\2\27\30\5\22\n\2\30\5\3\2\2\2\31\33\7-\2"+
		"\2\32\34\7\61\2\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\37\5\20"+
		"\t\2\36 \5\f\7\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\63\2\2\"#\5"+
		"\b\5\2#\7\3\2\2\2$%\7\36\2\2%*\5\n\6\2&\'\7$\2\2\')\5\n\6\2(&\3\2\2\2"+
		"),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7\37\2\2.\t\3\2\2"+
		"\2/\60\5\22\n\2\60\13\3\2\2\2\61\62\7\36\2\2\62\67\5\16\b\2\63\64\7$\2"+
		"\2\64\66\5\16\b\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8:\3\2\2\29\67\3\2\2\2:;\7\37\2\2;\r\3\2\2\2<=\5\22\n\2=\17\3\2\2\2>?"+
		"\5\22\n\2?\21\3\2\2\2@A\t\2\2\2A\23\3\2\2\2\6\33\37*\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}