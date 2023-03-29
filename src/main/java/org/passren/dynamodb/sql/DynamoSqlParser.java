// Generated from DynamoSqlParser.g4 by ANTLR 4.12.0
package org.passren.dynamodb.sql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DynamoSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, COMMENT_INPUT=2, LINE_COMMENT=3, ALTER=4, AND=5, AS=6, ASC=7, 
		BETWEEN=8, BY=9, COLUMN=10, CONDITION=11, CONSTRAINT=12, CONTINUE=13, 
		CREATE=14, CURSOR=15, DATABASE=16, DATABASES=17, DEFAULT=18, DELETE=19, 
		DESC=20, DESCRIBE=21, DISTINCT=22, DISTINCTROW=23, DROP=24, EXISTS=25, 
		FROM=26, IN=27, INDEX=28, INSERT=29, INTO=30, IS=31, LIKE=32, LIMIT=33, 
		NOT=34, NULL_LITERAL=35, NUMBER=36, ON=37, OR=38, ORDER=39, PARTITION=40, 
		PRIMARY=41, PURGE=42, SELECT=43, SET=44, SEPARATOR=45, SHOW=46, STATEMENT=47, 
		TABLE=48, UNION=49, UPDATE=50, VALUES=51, VALUE=52, WHERE=53, TRUE=54, 
		FALSE=55, MISSING=56, INT=57, INTEGER=58, BIGINT=59, REAL=60, DOUBLE=61, 
		FLOAT=62, DECIMAL=63, NUMERIC=64, DATE=65, TIME=66, TIMESTAMP=67, DATETIME=68, 
		YEAR=69, CHAR=70, VARCHAR=71, BEGIN=72, CONTAINS=73, COMPRESSION=74, QUARTER=75, 
		MONTH=76, DAY=77, HOUR=78, MINUTE=79, WEEK=80, SECOND=81, MICROSECOND=82, 
		STAR=83, DIVIDE=84, MODULE=85, PLUS=86, MINUS=87, DIV=88, MOD=89, EQUAL_SYMBOL=90, 
		GREATER_SYMBOL=91, LESS_SYMBOL=92, EXCLAMATION_SYMBOL=93, BIT_NOT_OP=94, 
		BIT_OR_OP=95, BIT_AND_OP=96, BIT_XOR_OP=97, DOT=98, LR_BRACKET=99, RR_BRACKET=100, 
		LR_BRACE=101, RR_BRACE=102, COMMA=103, SEMI=104, AT_SIGN=105, ZERO_DECIMAL=106, 
		ONE_DECIMAL=107, TWO_DECIMAL=108, SINGLE_QUOTE_SYMB=109, DOUBLE_QUOTE_SYMB=110, 
		REVERSE_QUOTE_SYMB=111, COLON_SYMB=112, QUESTION_MARK_SYMB=113, STRING_LITERAL=114, 
		DECIMAL_LITERAL=115, REAL_LITERAL=116, BIT_STRING=117, ID=118, SINGLE_QUOTE_ID=119, 
		DOUBLE_QUOTE_ID=120, ERROR_RECONGNIGION=121;
	public static final int
		RULE_root = 0, RULE_sqlStatements = 1, RULE_sqlStatement = 2, RULE_emptyStatement_ = 3, 
		RULE_dmlStatement = 4, RULE_selectStatement = 5, RULE_selectElements = 6, 
		RULE_selectElement = 7, RULE_fromClause = 8, RULE_expression = 9, RULE_predicate = 10, 
		RULE_expressionAtom = 11, RULE_insertStatement = 12, RULE_insertStatementValues = 13, 
		RULE_insertValuePair = 14, RULE_updateStatement = 15, RULE_deleteStatement = 16, 
		RULE_singleDeleteStatement = 17, RULE_singleUpdateStatement = 18, RULE_updatedElement = 19, 
		RULE_fullColumnName = 20, RULE_constant = 21, RULE_decimalLiteral = 22, 
		RULE_booleanLiteral = 23, RULE_stringLiteral = 24, RULE_nullNotnull = 25, 
		RULE_comparisonOperator = 26, RULE_logicalOperator = 27, RULE_limitClause = 28, 
		RULE_limitClauseAtom = 29, RULE_fullId = 30, RULE_tableName = 31, RULE_uid = 32, 
		RULE_dotted_id = 33, RULE_fullColumnNameList = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "sqlStatements", "sqlStatement", "emptyStatement_", "dmlStatement", 
			"selectStatement", "selectElements", "selectElement", "fromClause", "expression", 
			"predicate", "expressionAtom", "insertStatement", "insertStatementValues", 
			"insertValuePair", "updateStatement", "deleteStatement", "singleDeleteStatement", 
			"singleUpdateStatement", "updatedElement", "fullColumnName", "constant", 
			"decimalLiteral", "booleanLiteral", "stringLiteral", "nullNotnull", "comparisonOperator", 
			"logicalOperator", "limitClause", "limitClauseAtom", "fullId", "tableName", 
			"uid", "dotted_id", "fullColumnNameList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'ALTER'", "'AND'", "'AS'", "'ASC'", "'BETWEEN'", 
			"'BY'", "'COLUMN'", "'CONDITION'", "'CONSTRAINT'", "'CONTINUE'", "'CREATE'", 
			"'CURSOR'", "'DATABASE'", "'DATABASES'", "'DEFAULT'", "'DELETE'", "'DESC'", 
			"'DESCRIBE'", "'DISTINCT'", "'DISTINCTROW'", "'DROP'", "'EXISTS'", "'FROM'", 
			"'IN'", "'INDEX'", "'INSERT'", "'INTO'", "'IS'", "'LIKE'", "'LIMIT'", 
			"'NOT'", "'NULL'", "'NUMBER'", "'ON'", "'OR'", "'ORDER'", "'PARTITION'", 
			"'PRIMARY'", "'PURGE'", "'SELECT'", "'SET'", "'SEPARATOR'", "'SHOW'", 
			"'STATEMENT'", "'TABLE'", "'UNION'", "'UPDATE'", "'VALUES'", "'VALUE'", 
			"'WHERE'", "'TRUE'", "'FALSE'", "'MISSING'", "'INT'", "'INTEGER'", "'BIGINT'", 
			"'REAL'", "'DOUBLE'", "'FLOAT'", "'DECIMAL'", "'NUMERIC'", "'DATE'", 
			"'TIME'", "'TIMESTAMP'", "'DATETIME'", "'YEAR'", "'CHAR'", "'VARCHAR'", 
			"'BEGIN'", "'CONTAINS'", null, "'QUARTER'", "'MONTH'", "'DAY'", "'HOUR'", 
			"'MINUTE'", "'WEEK'", "'SECOND'", "'MICROSECOND'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'DIV'", "'MOD'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", 
			"'&'", "'^'", "'.'", "'('", "')'", "'{'", "'}'", "','", "';'", "'@'", 
			"'0'", "'1'", "'2'", "'''", "'\"'", "'`'", "':'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "COMMENT_INPUT", "LINE_COMMENT", "ALTER", "AND", "AS", 
			"ASC", "BETWEEN", "BY", "COLUMN", "CONDITION", "CONSTRAINT", "CONTINUE", 
			"CREATE", "CURSOR", "DATABASE", "DATABASES", "DEFAULT", "DELETE", "DESC", 
			"DESCRIBE", "DISTINCT", "DISTINCTROW", "DROP", "EXISTS", "FROM", "IN", 
			"INDEX", "INSERT", "INTO", "IS", "LIKE", "LIMIT", "NOT", "NULL_LITERAL", 
			"NUMBER", "ON", "OR", "ORDER", "PARTITION", "PRIMARY", "PURGE", "SELECT", 
			"SET", "SEPARATOR", "SHOW", "STATEMENT", "TABLE", "UNION", "UPDATE", 
			"VALUES", "VALUE", "WHERE", "TRUE", "FALSE", "MISSING", "INT", "INTEGER", 
			"BIGINT", "REAL", "DOUBLE", "FLOAT", "DECIMAL", "NUMERIC", "DATE", "TIME", 
			"TIMESTAMP", "DATETIME", "YEAR", "CHAR", "VARCHAR", "BEGIN", "CONTAINS", 
			"COMPRESSION", "QUARTER", "MONTH", "DAY", "HOUR", "MINUTE", "WEEK", "SECOND", 
			"MICROSECOND", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "DIV", "MOD", 
			"EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", 
			"RR_BRACKET", "LR_BRACE", "RR_BRACE", "COMMA", "SEMI", "AT_SIGN", "ZERO_DECIMAL", 
			"ONE_DECIMAL", "TWO_DECIMAL", "SINGLE_QUOTE_SYMB", "DOUBLE_QUOTE_SYMB", 
			"REVERSE_QUOTE_SYMB", "COLON_SYMB", "QUESTION_MARK_SYMB", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "REAL_LITERAL", "BIT_STRING", "ID", "SINGLE_QUOTE_ID", 
			"DOUBLE_QUOTE_ID", "ERROR_RECONGNIGION"
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
	public String getGrammarFileName() { return "DynamoSqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DynamoSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DynamoSqlParser.EOF, 0); }
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(DynamoSqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DynamoSqlParser.MINUS, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134696537260032L) != 0) || _la==SEMI) {
				{
				setState(70);
				sqlStatements();
				}
			}

			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(73);
				match(MINUS);
				setState(74);
				match(MINUS);
				}
			}

			setState(77);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementsContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<EmptyStatement_Context> emptyStatement_() {
			return getRuleContexts(EmptyStatement_Context.class);
		}
		public EmptyStatement_Context emptyStatement_(int i) {
			return getRuleContext(EmptyStatement_Context.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(DynamoSqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(DynamoSqlParser.SEMI, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(DynamoSqlParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(DynamoSqlParser.MINUS, i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DELETE:
					case INSERT:
					case SELECT:
					case UPDATE:
						{
						setState(79);
						sqlStatement();
						setState(82);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUS) {
							{
							setState(80);
							match(MINUS);
							setState(81);
							match(MINUS);
							}
						}

						setState(85);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
						case 1:
							{
							setState(84);
							match(SEMI);
							}
							break;
						}
						}
						break;
					case SEMI:
						{
						setState(87);
						emptyStatement_();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
			case INSERT:
			case SELECT:
			case UPDATE:
				{
				setState(93);
				sqlStatement();
				setState(99);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUS) {
						{
						setState(94);
						match(MINUS);
						setState(95);
						match(MINUS);
						}
					}

					setState(98);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(101);
				emptyStatement_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SqlStatementContext extends ParserRuleContext {
		public DmlStatementContext dmlStatement() {
			return getRuleContext(DmlStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			dmlStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EmptyStatement_Context extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(DynamoSqlParser.SEMI, 0); }
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DmlStatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public DmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementContext dmlStatement() throws RecognitionException {
		DmlStatementContext _localctx = new DmlStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dmlStatement);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				selectStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				insertStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				updateStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				deleteStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DynamoSqlParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(SELECT);
			setState(115);
			selectElements();
			setState(116);
			fromClause();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(117);
				limitClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementsContext extends ParserRuleContext {
		public Token star;
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public TerminalNode STAR() { return getToken(DynamoSqlParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DynamoSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamoSqlParser.COMMA, i);
		}
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSelectElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSelectElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSelectElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(120);
				((SelectElementsContext)_localctx).star = match(STAR);
				}
				break;
			case ID:
			case SINGLE_QUOTE_ID:
			case DOUBLE_QUOTE_ID:
				{
				setState(121);
				selectElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				selectElement();
				}
				}
				setState(130);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementContext extends ParserRuleContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(DynamoSqlParser.AS, 0); }
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSelectElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSelectElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			fullId();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 7L) != 0)) {
				{
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(132);
					match(AS);
					}
				}

				setState(135);
				uid();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public ExpressionContext whereExpr;
		public TerminalNode FROM() { return getToken(DynamoSqlParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DynamoSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(FROM);
			setState(139);
			tableName();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(140);
				match(WHERE);
				setState(141);
				((FromClauseContext)_localctx).whereExpr = expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsExpressionContext extends ExpressionContext {
		public Token testValue;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(DynamoSqlParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(DynamoSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DynamoSqlParser.FALSE, 0); }
		public TerminalNode MISSING() { return getToken(DynamoSqlParser.MISSING, 0); }
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitIsExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitIsExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public Token notOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(DynamoSqlParser.EXCLAMATION_SYMBOL, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicateExpressionContext extends ExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterPredicateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitPredicateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitPredicateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(145);
				((NotExpressionContext)_localctx).notOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==EXCLAMATION_SYMBOL) ) {
					((NotExpressionContext)_localctx).notOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				expression(4);
				}
				break;
			case 2:
				{
				_localctx = new IsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				predicate(0);
				setState(148);
				match(IS);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(149);
					match(NOT);
					}
				}

				setState(152);
				((IsExpressionContext)_localctx).testValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126100789566373888L) != 0)) ) {
					((IsExpressionContext)_localctx).testValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				predicate(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(157);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(158);
					logicalOperator();
					setState(159);
					expression(4);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomPredicateContext extends PredicateContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public ExpressionAtomPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterExpressionAtomPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitExpressionAtomPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitExpressionAtomPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryComparisonPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public BinaryComparisonPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterBinaryComparisonPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitBinaryComparisonPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitBinaryComparisonPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BetweenPredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(DynamoSqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(DynamoSqlParser.AND, 0); }
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public BetweenPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterBetweenPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitBetweenPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitBetweenPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullPredicateContext extends PredicateContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(DynamoSqlParser.IS, 0); }
		public NullNotnullContext nullNotnull() {
			return getRuleContext(NullNotnullContext.class,0);
		}
		public IsNullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterIsNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitIsNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitIsNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(DynamoSqlParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitLikePredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpressionAtomPredicateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(167);
			expressionAtom();
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryComparisonPredicateContext(new PredicateContext(_parentctx, _parentState));
						((BinaryComparisonPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(170);
						comparisonOperator();
						setState(171);
						((BinaryComparisonPredicateContext)_localctx).right = predicate(5);
						}
						break;
					case 2:
						{
						_localctx = new BetweenPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(174);
							match(NOT);
							}
						}

						setState(177);
						match(BETWEEN);
						setState(178);
						predicate(0);
						setState(179);
						match(AND);
						setState(180);
						predicate(4);
						}
						break;
					case 3:
						{
						_localctx = new LikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(183);
							match(NOT);
							}
						}

						setState(186);
						match(LIKE);
						setState(187);
						predicate(3);
						}
						break;
					case 4:
						{
						_localctx = new IsNullPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(IS);
						setState(190);
						nullNotnull();
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
	 
		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionAtomContext extends ExpressionAtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterConstantExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitConstantExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitConstantExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullColumnNameExpressionAtomContext extends ExpressionAtomContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FullColumnNameExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterFullColumnNameExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitFullColumnNameExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitFullColumnNameExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlaceholderExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode QUESTION_MARK_SYMB() { return getToken(DynamoSqlParser.QUESTION_MARK_SYMB, 0); }
		public PlaceholderExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterPlaceholderExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitPlaceholderExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitPlaceholderExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionAtom);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL_LITERAL:
			case TRUE:
			case FALSE:
			case MINUS:
			case ZERO_DECIMAL:
			case ONE_DECIMAL:
			case TWO_DECIMAL:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case REAL_LITERAL:
			case BIT_STRING:
				_localctx = new ConstantExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				constant();
				}
				break;
			case ID:
			case SINGLE_QUOTE_ID:
			case DOUBLE_QUOTE_ID:
				_localctx = new FullColumnNameExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				fullColumnName();
				}
				break;
			case QUESTION_MARK_SYMB:
				_localctx = new PlaceholderExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(QUESTION_MARK_SYMB);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(DynamoSqlParser.INSERT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public InsertStatementValuesContext insertStatementValues() {
			return getRuleContext(InsertStatementValuesContext.class,0);
		}
		public TerminalNode INTO() { return getToken(DynamoSqlParser.INTO, 0); }
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(INSERT);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(202);
				match(INTO);
				}
			}

			setState(205);
			tableName();
			setState(206);
			insertStatementValues();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStatementValuesContext extends ParserRuleContext {
		public Token insertFormat;
		public TerminalNode LR_BRACE() { return getToken(DynamoSqlParser.LR_BRACE, 0); }
		public List<InsertValuePairContext> insertValuePair() {
			return getRuleContexts(InsertValuePairContext.class);
		}
		public InsertValuePairContext insertValuePair(int i) {
			return getRuleContext(InsertValuePairContext.class,i);
		}
		public TerminalNode RR_BRACE() { return getToken(DynamoSqlParser.RR_BRACE, 0); }
		public TerminalNode VALUES() { return getToken(DynamoSqlParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(DynamoSqlParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DynamoSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamoSqlParser.COMMA, i);
		}
		public InsertStatementValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatementValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterInsertStatementValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitInsertStatementValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitInsertStatementValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementValuesContext insertStatementValues() throws RecognitionException {
		InsertStatementValuesContext _localctx = new InsertStatementValuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insertStatementValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			((InsertStatementValuesContext)_localctx).insertFormat = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
				((InsertStatementValuesContext)_localctx).insertFormat = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(209);
			match(LR_BRACE);
			setState(210);
			insertValuePair();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(211);
				match(COMMA);
				setState(212);
				insertValuePair();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(RR_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertValuePairContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COLON_SYMB() { return getToken(DynamoSqlParser.COLON_SYMB, 0); }
		public TerminalNode QUESTION_MARK_SYMB() { return getToken(DynamoSqlParser.QUESTION_MARK_SYMB, 0); }
		public InsertValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterInsertValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitInsertValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitInsertValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertValuePairContext insertValuePair() throws RecognitionException {
		InsertValuePairContext _localctx = new InsertValuePairContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_insertValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			constant();
			setState(221);
			match(COLON_SYMB);
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NULL_LITERAL:
			case TRUE:
			case FALSE:
			case MINUS:
			case ZERO_DECIMAL:
			case ONE_DECIMAL:
			case TWO_DECIMAL:
			case STRING_LITERAL:
			case DECIMAL_LITERAL:
			case REAL_LITERAL:
			case BIT_STRING:
				{
				setState(222);
				constant();
				}
				break;
			case QUESTION_MARK_SYMB:
				{
				setState(223);
				match(QUESTION_MARK_SYMB);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStatementContext extends ParserRuleContext {
		public SingleUpdateStatementContext singleUpdateStatement() {
			return getRuleContext(SingleUpdateStatementContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_updateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			singleUpdateStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends ParserRuleContext {
		public SingleDeleteStatementContext singleDeleteStatement() {
			return getRuleContext(SingleDeleteStatementContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_deleteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			singleDeleteStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(DynamoSqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(DynamoSqlParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(DynamoSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleDeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSingleDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSingleDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSingleDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeleteStatementContext singleDeleteStatement() throws RecognitionException {
		SingleDeleteStatementContext _localctx = new SingleDeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_singleDeleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(DELETE);
			setState(231);
			match(FROM);
			setState(232);
			tableName();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(233);
				match(WHERE);
				setState(234);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleUpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DynamoSqlParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(DynamoSqlParser.SET, 0); }
		public List<UpdatedElementContext> updatedElement() {
			return getRuleContexts(UpdatedElementContext.class);
		}
		public UpdatedElementContext updatedElement(int i) {
			return getRuleContext(UpdatedElementContext.class,i);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamoSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamoSqlParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(DynamoSqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode AS() { return getToken(DynamoSqlParser.AS, 0); }
		public SingleUpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleUpdateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterSingleUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitSingleUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitSingleUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleUpdateStatementContext singleUpdateStatement() throws RecognitionException {
		SingleUpdateStatementContext _localctx = new SingleUpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleUpdateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(UPDATE);
			setState(238);
			tableName();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 7L) != 0)) {
				{
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(239);
					match(AS);
					}
				}

				setState(242);
				uid();
				}
			}

			setState(245);
			match(SET);
			setState(246);
			updatedElement();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247);
				match(COMMA);
				setState(248);
				updatedElement();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(254);
				match(WHERE);
				setState(255);
				expression(0);
				}
			}

			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(258);
				limitClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatedElementContext extends ParserRuleContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(DynamoSqlParser.EQUAL_SYMBOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdatedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterUpdatedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitUpdatedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitUpdatedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatedElementContext updatedElement() throws RecognitionException {
		UpdatedElementContext _localctx = new UpdatedElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_updatedElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			fullColumnName();
			setState(262);
			match(EQUAL_SYMBOL);
			setState(263);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FullColumnNameContext extends ParserRuleContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitFullColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitFullColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fullColumnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			fullId();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Token nullLiteral;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DynamoSqlParser.MINUS, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(DynamoSqlParser.REAL_LITERAL, 0); }
		public TerminalNode BIT_STRING() { return getToken(DynamoSqlParser.BIT_STRING, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(DynamoSqlParser.NULL_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_constant);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(MINUS);
				setState(270);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				booleanLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(REAL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				match(BIT_STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(274);
					match(NOT);
					}
				}

				setState(277);
				((ConstantContext)_localctx).nullLiteral = match(NULL_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(DynamoSqlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode ZERO_DECIMAL() { return getToken(DynamoSqlParser.ZERO_DECIMAL, 0); }
		public TerminalNode ONE_DECIMAL() { return getToken(DynamoSqlParser.ONE_DECIMAL, 0); }
		public TerminalNode TWO_DECIMAL() { return getToken(DynamoSqlParser.TWO_DECIMAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(DynamoSqlParser.REAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 1543L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(DynamoSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DynamoSqlParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(DynamoSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(DynamoSqlParser.STRING_LITERAL, i);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringLiteral);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(284);
					match(STRING_LITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(287); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullNotnullContext extends ParserRuleContext {
		public TerminalNode NULL_LITERAL() { return getToken(DynamoSqlParser.NULL_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(DynamoSqlParser.NOT, 0); }
		public NullNotnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullNotnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterNullNotnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitNullNotnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitNullNotnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullNotnullContext nullNotnull() throws RecognitionException {
		NullNotnullContext _localctx = new NullNotnullContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_nullNotnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(289);
				match(NOT);
				}
			}

			setState(292);
			match(NULL_LITERAL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_SYMBOL() { return getToken(DynamoSqlParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(DynamoSqlParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(DynamoSqlParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(DynamoSqlParser.EXCLAMATION_SYMBOL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparisonOperator);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(EQUAL_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(GREATER_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(LESS_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(LESS_SYMBOL);
				setState(298);
				match(EQUAL_SYMBOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				match(GREATER_SYMBOL);
				setState(300);
				match(EQUAL_SYMBOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				match(LESS_SYMBOL);
				setState(302);
				match(GREATER_SYMBOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				match(EXCLAMATION_SYMBOL);
				setState(304);
				match(EQUAL_SYMBOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				match(LESS_SYMBOL);
				setState(306);
				match(EQUAL_SYMBOL);
				setState(307);
				match(GREATER_SYMBOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(DynamoSqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(DynamoSqlParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitLogicalOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public LimitClauseAtomContext limit;
		public TerminalNode LIMIT() { return getToken(DynamoSqlParser.LIMIT, 0); }
		public LimitClauseAtomContext limitClauseAtom() {
			return getRuleContext(LimitClauseAtomContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LIMIT);
			setState(313);
			((LimitClauseContext)_localctx).limit = limitClauseAtom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseAtomContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public LimitClauseAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClauseAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterLimitClauseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitLimitClauseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitLimitClauseAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseAtomContext limitClauseAtom() throws RecognitionException {
		LimitClauseAtomContext _localctx = new LimitClauseAtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_limitClauseAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			decimalLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FullIdContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public Dotted_idContext dotted_id() {
			return getRuleContext(Dotted_idContext.class,0);
		}
		public FullIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterFullId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitFullId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitFullId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdContext fullId() throws RecognitionException {
		FullIdContext _localctx = new FullIdContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fullId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			uid();
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(318);
				dotted_id();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			uid();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DynamoSqlParser.ID, 0); }
		public TerminalNode SINGLE_QUOTE_ID() { return getToken(DynamoSqlParser.SINGLE_QUOTE_ID, 0); }
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(DynamoSqlParser.DOUBLE_QUOTE_ID, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitUid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitUid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_uid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_la = _input.LA(1);
			if ( !(((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Dotted_idContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(DynamoSqlParser.DOT, 0); }
		public TerminalNode ID() { return getToken(DynamoSqlParser.ID, 0); }
		public TerminalNode SINGLE_QUOTE_ID() { return getToken(DynamoSqlParser.SINGLE_QUOTE_ID, 0); }
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(DynamoSqlParser.DOUBLE_QUOTE_ID, 0); }
		public Dotted_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterDotted_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitDotted_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitDotted_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_idContext dotted_id() throws RecognitionException {
		Dotted_idContext _localctx = new Dotted_idContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dotted_id);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(DOT);
				setState(326);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(DOT);
				setState(328);
				match(SINGLE_QUOTE_ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(DOT);
				setState(330);
				match(DOUBLE_QUOTE_ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FullColumnNameListContext extends ParserRuleContext {
		public List<FullColumnNameContext> fullColumnName() {
			return getRuleContexts(FullColumnNameContext.class);
		}
		public FullColumnNameContext fullColumnName(int i) {
			return getRuleContext(FullColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DynamoSqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DynamoSqlParser.COMMA, i);
		}
		public FullColumnNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).enterFullColumnNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DynamoSqlParserListener ) ((DynamoSqlParserListener)listener).exitFullColumnNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DynamoSqlParserVisitor ) return ((DynamoSqlParserVisitor<? extends T>)visitor).visitFullColumnNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullColumnNameListContext fullColumnNameList() throws RecognitionException {
		FullColumnNameListContext _localctx = new FullColumnNameListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fullColumnNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			fullColumnName();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(334);
				match(COMMA);
				setState(335);
				fullColumnName();
				}
				}
				setState(340);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 10:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001y\u0156\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0003\u0000H\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000L\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"S\b\u0001\u0001\u0001\u0003\u0001V\b\u0001\u0001\u0001\u0005\u0001Y\b"+
		"\u0001\n\u0001\f\u0001\\\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001a\b\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0001\u0003\u0001"+
		"g\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004q\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005w\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006{\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u007f\b\u0006\n\u0006\f\u0006\u0082\t\u0006\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0086\b\u0007\u0001\u0007\u0003\u0007\u0089\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0097\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u009c\b\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a2\b\t\n\t\f\t\u00a5\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b0\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00b9\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c0\b\n"+
		"\n\n\f\n\u00c3\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c8"+
		"\b\u000b\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00d6\b\r\n\r\f\r\u00d9\t\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e1\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ec"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f1\b\u0012"+
		"\u0001\u0012\u0003\u0012\u00f4\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00fa\b\u0012\n\u0012\f\u0012\u00fd\t\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0101\b\u0012\u0001\u0012\u0003\u0012\u0104"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0114\b\u0015\u0001\u0015\u0003"+
		"\u0015\u0117\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0004\u0018\u011e\b\u0018\u000b\u0018\f\u0018\u011f\u0001\u0019"+
		"\u0003\u0019\u0123\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0135\b\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0140\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u014c\b!\u0001\"\u0001\"\u0001\"\u0005\""+
		"\u0151\b\"\n\"\f\"\u0154\t\"\u0001\"\u0000\u0002\u0012\u0014#\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BD\u0000\u0007\u0002\u0000\"\"]]\u0001\u000068\u0001"+
		"\u000034\u0002\u0000jlst\u0001\u000067\u0002\u0000\u0005\u0005&&\u0001"+
		"\u0000vx\u016d\u0000G\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000"+
		"\u0000\u0004h\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\b"+
		"p\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\fz\u0001\u0000\u0000"+
		"\u0000\u000e\u0083\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000"+
		"\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000"+
		"\u0000\u0016\u00c7\u0001\u0000\u0000\u0000\u0018\u00c9\u0001\u0000\u0000"+
		"\u0000\u001a\u00d0\u0001\u0000\u0000\u0000\u001c\u00dc\u0001\u0000\u0000"+
		"\u0000\u001e\u00e2\u0001\u0000\u0000\u0000 \u00e4\u0001\u0000\u0000\u0000"+
		"\"\u00e6\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u0105"+
		"\u0001\u0000\u0000\u0000(\u0109\u0001\u0000\u0000\u0000*\u0116\u0001\u0000"+
		"\u0000\u0000,\u0118\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u0000"+
		"0\u011d\u0001\u0000\u0000\u00002\u0122\u0001\u0000\u0000\u00004\u0134"+
		"\u0001\u0000\u0000\u00006\u0136\u0001\u0000\u0000\u00008\u0138\u0001\u0000"+
		"\u0000\u0000:\u013b\u0001\u0000\u0000\u0000<\u013d\u0001\u0000\u0000\u0000"+
		">\u0141\u0001\u0000\u0000\u0000@\u0143\u0001\u0000\u0000\u0000B\u014b"+
		"\u0001\u0000\u0000\u0000D\u014d\u0001\u0000\u0000\u0000FH\u0003\u0002"+
		"\u0001\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HK\u0001"+
		"\u0000\u0000\u0000IJ\u0005W\u0000\u0000JL\u0005W\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0000\u0000\u0001N\u0001\u0001\u0000\u0000\u0000OR\u0003\u0004\u0002"+
		"\u0000PQ\u0005W\u0000\u0000QS\u0005W\u0000\u0000RP\u0001\u0000\u0000\u0000"+
		"RS\u0001\u0000\u0000\u0000SU\u0001\u0000\u0000\u0000TV\u0005h\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WY\u0003\u0006\u0003\u0000XO\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[f\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000"+
		"]c\u0003\u0004\u0002\u0000^_\u0005W\u0000\u0000_a\u0005W\u0000\u0000`"+
		"^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bd\u0005h\u0000\u0000c`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000eg\u0003\u0006\u0003\u0000f]\u0001\u0000"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0003\u0001\u0000\u0000\u0000"+
		"hi\u0003\b\u0004\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0005h\u0000\u0000"+
		"k\u0007\u0001\u0000\u0000\u0000lq\u0003\n\u0005\u0000mq\u0003\u0018\f"+
		"\u0000nq\u0003\u001e\u000f\u0000oq\u0003 \u0010\u0000pl\u0001\u0000\u0000"+
		"\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\t\u0001\u0000\u0000\u0000rs\u0005+\u0000\u0000st\u0003\f"+
		"\u0006\u0000tv\u0003\u0010\b\u0000uw\u00038\u001c\u0000vu\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000\u0000"+
		"x{\u0005S\u0000\u0000y{\u0003\u000e\u0007\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\u0080\u0001\u0000\u0000\u0000|}\u0005g\u0000"+
		"\u0000}\u007f\u0003\u000e\u0007\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082\u0080\u0001"+
		"\u0000\u0000\u0000\u0083\u0088\u0003<\u001e\u0000\u0084\u0086\u0005\u0006"+
		"\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0003@ \u0000"+
		"\u0088\u0085\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u001a\u0000\u0000"+
		"\u008b\u008e\u0003>\u001f\u0000\u008c\u008d\u00055\u0000\u0000\u008d\u008f"+
		"\u0003\u0012\t\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u0091\u0006"+
		"\t\uffff\uffff\u0000\u0091\u0092\u0007\u0000\u0000\u0000\u0092\u009c\u0003"+
		"\u0012\t\u0004\u0093\u0094\u0003\u0014\n\u0000\u0094\u0096\u0005\u001f"+
		"\u0000\u0000\u0095\u0097\u0005\"\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0007\u0001\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\u0014\n\u0000\u009b\u0090\u0001\u0000\u0000\u0000"+
		"\u009b\u0093\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u00a3\u0001\u0000\u0000\u0000\u009d\u009e\n\u0003\u0000\u0000\u009e"+
		"\u009f\u00036\u001b\u0000\u009f\u00a0\u0003\u0012\t\u0004\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000\u00a2\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u0013\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0006\n\uffff\uffff\u0000\u00a7\u00a8"+
		"\u0003\u0016\u000b\u0000\u00a8\u00c1\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\n\u0004\u0000\u0000\u00aa\u00ab\u00034\u001a\u0000\u00ab\u00ac\u0003"+
		"\u0014\n\u0005\u00ac\u00c0\u0001\u0000\u0000\u0000\u00ad\u00af\n\u0003"+
		"\u0000\u0000\u00ae\u00b0\u0005\"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b3\u0003\u0014\n\u0000"+
		"\u00b3\u00b4\u0005\u0005\u0000\u0000\u00b4\u00b5\u0003\u0014\n\u0004\u00b5"+
		"\u00c0\u0001\u0000\u0000\u0000\u00b6\u00b8\n\u0002\u0000\u0000\u00b7\u00b9"+
		"\u0005\"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		" \u0000\u0000\u00bb\u00c0\u0003\u0014\n\u0003\u00bc\u00bd\n\u0005\u0000"+
		"\u0000\u00bd\u00be\u0005\u001f\u0000\u0000\u00be\u00c0\u00032\u0019\u0000"+
		"\u00bf\u00a9\u0001\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000"+
		"\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0015\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c8\u0003*\u0015\u0000\u00c5"+
		"\u00c8\u0003(\u0014\u0000\u00c6\u00c8\u0005q\u0000\u0000\u00c7\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u0017\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005"+
		"\u001d\u0000\u0000\u00ca\u00cc\u0005\u001e\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0003>\u001f\u0000\u00ce\u00cf\u0003\u001a"+
		"\r\u0000\u00cf\u0019\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007\u0002\u0000"+
		"\u0000\u00d1\u00d2\u0005e\u0000\u0000\u00d2\u00d7\u0003\u001c\u000e\u0000"+
		"\u00d3\u00d4\u0005g\u0000\u0000\u00d4\u00d6\u0003\u001c\u000e\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005f\u0000\u0000\u00db\u001b\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0003*\u0015\u0000\u00dd\u00e0\u0005p\u0000\u0000\u00de\u00e1\u0003*"+
		"\u0015\u0000\u00df\u00e1\u0005q\u0000\u0000\u00e0\u00de\u0001\u0000\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u001d\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0003$\u0012\u0000\u00e3\u001f\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0003\"\u0011\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0005\u0013\u0000\u0000\u00e7\u00e8\u0005\u001a\u0000\u0000\u00e8"+
		"\u00eb\u0003>\u001f\u0000\u00e9\u00ea\u00055\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0012\t\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec#\u0001\u0000\u0000\u0000\u00ed\u00ee\u00052\u0000\u0000"+
		"\u00ee\u00f3\u0003>\u001f\u0000\u00ef\u00f1\u0005\u0006\u0000\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003@ \u0000\u00f3\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005,\u0000\u0000\u00f6\u00fb\u0003&\u0013"+
		"\u0000\u00f7\u00f8\u0005g\u0000\u0000\u00f8\u00fa\u0003&\u0013\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u0100\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u00055\u0000\u0000\u00ff\u0101\u0003\u0012\t\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103"+
		"\u0001\u0000\u0000\u0000\u0102\u0104\u00038\u001c\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104%\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0003(\u0014\u0000\u0106\u0107\u0005Z\u0000\u0000"+
		"\u0107\u0108\u0003\u0012\t\u0000\u0108\'\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0003<\u001e\u0000\u010a)\u0001\u0000\u0000\u0000\u010b\u0117\u0003"+
		"0\u0018\u0000\u010c\u0117\u0003,\u0016\u0000\u010d\u010e\u0005W\u0000"+
		"\u0000\u010e\u0117\u0003,\u0016\u0000\u010f\u0117\u0003.\u0017\u0000\u0110"+
		"\u0117\u0005t\u0000\u0000\u0111\u0117\u0005u\u0000\u0000\u0112\u0114\u0005"+
		"\"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0005#\u0000"+
		"\u0000\u0116\u010b\u0001\u0000\u0000\u0000\u0116\u010c\u0001\u0000\u0000"+
		"\u0000\u0116\u010d\u0001\u0000\u0000\u0000\u0116\u010f\u0001\u0000\u0000"+
		"\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0111\u0001\u0000\u0000"+
		"\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0117+\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0007\u0003\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0007\u0004\u0000\u0000\u011b/\u0001\u0000\u0000\u0000\u011c\u011e"+
		"\u0005r\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001"+
		"\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001"+
		"\u0000\u0000\u0000\u01201\u0001\u0000\u0000\u0000\u0121\u0123\u0005\""+
		"\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005#\u0000"+
		"\u0000\u01253\u0001\u0000\u0000\u0000\u0126\u0135\u0005Z\u0000\u0000\u0127"+
		"\u0135\u0005[\u0000\u0000\u0128\u0135\u0005\\\u0000\u0000\u0129\u012a"+
		"\u0005\\\u0000\u0000\u012a\u0135\u0005Z\u0000\u0000\u012b\u012c\u0005"+
		"[\u0000\u0000\u012c\u0135\u0005Z\u0000\u0000\u012d\u012e\u0005\\\u0000"+
		"\u0000\u012e\u0135\u0005[\u0000\u0000\u012f\u0130\u0005]\u0000\u0000\u0130"+
		"\u0135\u0005Z\u0000\u0000\u0131\u0132\u0005\\\u0000\u0000\u0132\u0133"+
		"\u0005Z\u0000\u0000\u0133\u0135\u0005[\u0000\u0000\u0134\u0126\u0001\u0000"+
		"\u0000\u0000\u0134\u0127\u0001\u0000\u0000\u0000\u0134\u0128\u0001\u0000"+
		"\u0000\u0000\u0134\u0129\u0001\u0000\u0000\u0000\u0134\u012b\u0001\u0000"+
		"\u0000\u0000\u0134\u012d\u0001\u0000\u0000\u0000\u0134\u012f\u0001\u0000"+
		"\u0000\u0000\u0134\u0131\u0001\u0000\u0000\u0000\u01355\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0007\u0005\u0000\u0000\u01377\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0005!\u0000\u0000\u0139\u013a\u0003:\u001d\u0000\u013a9"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0003,\u0016\u0000\u013c;\u0001\u0000"+
		"\u0000\u0000\u013d\u013f\u0003@ \u0000\u013e\u0140\u0003B!\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"=\u0001\u0000\u0000\u0000\u0141\u0142\u0003@ \u0000\u0142?\u0001\u0000"+
		"\u0000\u0000\u0143\u0144\u0007\u0006\u0000\u0000\u0144A\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005b\u0000\u0000\u0146\u014c\u0005v\u0000\u0000\u0147"+
		"\u0148\u0005b\u0000\u0000\u0148\u014c\u0005w\u0000\u0000\u0149\u014a\u0005"+
		"b\u0000\u0000\u014a\u014c\u0005x\u0000\u0000\u014b\u0145\u0001\u0000\u0000"+
		"\u0000\u014b\u0147\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014cC\u0001\u0000\u0000\u0000\u014d\u0152\u0003(\u0014\u0000\u014e"+
		"\u014f\u0005g\u0000\u0000\u014f\u0151\u0003(\u0014\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153E\u0001\u0000"+
		"\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000)GKRUXZ`cfpvz\u0080\u0085"+
		"\u0088\u008e\u0096\u009b\u00a3\u00af\u00b8\u00bf\u00c1\u00c7\u00cb\u00d7"+
		"\u00e0\u00eb\u00f0\u00f3\u00fb\u0100\u0103\u0113\u0116\u011f\u0122\u0134"+
		"\u013f\u014b\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}