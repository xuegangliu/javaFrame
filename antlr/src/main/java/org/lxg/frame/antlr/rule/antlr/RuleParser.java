// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Rule.g4 by ANTLR 4.7

package org.lxg.frame.antlr.rule.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUATION_KEY=1, REGU_KEY=2, SQL_KEY=3, NUMBER=4, STRING=5, BOOLEAN=6, 
		ID=7, WS=8, DOUBLE=9, INT=10, ID_BASICQUERY=11, COMMA=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, DELIMITER=15, EQUAL=16, UNDERLINE=17, COLON=18, CONTRARY=19, 
		ADDSUB=20, MULDIV=21, EQUALOPERATION=22, COMPAREOPERATION=23;
	public static final int
		RULE_regulation = 0, RULE_equation = 1, RULE_regular = 2, RULE_sql = 3, 
		RULE_equationModule = 4, RULE_equExpression = 5, RULE_regularModule = 6, 
		RULE_regularExpression = 7, RULE_sqlModule = 8, RULE_sqlExpression = 9;
	public static final String[] ruleNames = {
		"regulation", "equation", "regular", "sql", "equationModule", "equExpression", 
		"regularModule", "regularExpression", "sqlModule", "sqlExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'*'", 
		"','", "'('", "')'", "'|'", "'='", "'_'", "':'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUATION_KEY", "REGU_KEY", "SQL_KEY", "NUMBER", "STRING", "BOOLEAN", 
		"ID", "WS", "DOUBLE", "INT", "ID_BASICQUERY", "COMMA", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "DELIMITER", "EQUAL", "UNDERLINE", "COLON", "CONTRARY", 
		"ADDSUB", "MULDIV", "EQUALOPERATION", "COMPAREOPERATION"
	};
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
	public String getGrammarFileName() { return "com/lxg/samplej/antlr/rule/Rule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RegulationContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public RegulationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regulation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRegulation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRegulation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRegulation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegulationContext regulation() throws RecognitionException {
		RegulationContext _localctx = new RegulationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_regulation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			equation();
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

	public static class EquationContext extends ParserRuleContext {
		public EquationModuleContext equationModule() {
			return getRuleContext(EquationModuleContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			equationModule();
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

	public static class RegularContext extends ParserRuleContext {
		public RegularModuleContext regularModule() {
			return getRuleContext(RegularModuleContext.class,0);
		}
		public RegularContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regular; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRegular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRegular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRegular(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularContext regular() throws RecognitionException {
		RegularContext _localctx = new RegularContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regular);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			regularModule();
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

	public static class SqlContext extends ParserRuleContext {
		public SqlModuleContext sqlModule() {
			return getRuleContext(SqlModuleContext.class,0);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			sqlModule();
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

	public static class EquationModuleContext extends ParserRuleContext {
		public TerminalNode EQUATION_KEY() { return getToken(RuleParser.EQUATION_KEY, 0); }
		public TerminalNode ID() { return getToken(RuleParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RuleParser.EQUAL, 0); }
		public EquExpressionContext equExpression() {
			return getRuleContext(EquExpressionContext.class,0);
		}
		public EquationModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquationModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquationModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquationModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationModuleContext equationModule() throws RecognitionException {
		EquationModuleContext _localctx = new EquationModuleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equationModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(EQUATION_KEY);
			setState(29);
			match(ID);
			setState(30);
			match(EQUAL);
			setState(31);
			equExpression(0);
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

	public static class EquExpressionContext extends ParserRuleContext {
		public EquExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equExpression; }
	 
		public EquExpressionContext() { }
		public void copyFrom(EquExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EquStringFunContext extends EquExpressionContext {
		public TerminalNode STRING() { return getToken(RuleParser.STRING, 0); }
		public EquStringFunContext(EquExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquStringFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquStringFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquStringFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquAddSubFunContext extends EquExpressionContext {
		public List<EquExpressionContext> equExpression() {
			return getRuleContexts(EquExpressionContext.class);
		}
		public EquExpressionContext equExpression(int i) {
			return getRuleContext(EquExpressionContext.class,i);
		}
		public TerminalNode ADDSUB() { return getToken(RuleParser.ADDSUB, 0); }
		public EquAddSubFunContext(EquExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquAddSubFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquAddSubFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquAddSubFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquMulDivFunContext extends EquExpressionContext {
		public List<EquExpressionContext> equExpression() {
			return getRuleContexts(EquExpressionContext.class);
		}
		public EquExpressionContext equExpression(int i) {
			return getRuleContext(EquExpressionContext.class,i);
		}
		public TerminalNode MULDIV() { return getToken(RuleParser.MULDIV, 0); }
		public EquMulDivFunContext(EquExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquMulDivFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquMulDivFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquMulDivFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquIdFunContext extends EquExpressionContext {
		public TerminalNode ID() { return getToken(RuleParser.ID, 0); }
		public EquIdFunContext(EquExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquIdFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquIdFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquIdFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquNumberFunContext extends EquExpressionContext {
		public TerminalNode NUMBER() { return getToken(RuleParser.NUMBER, 0); }
		public EquNumberFunContext(EquExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterEquNumberFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitEquNumberFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitEquNumberFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquExpressionContext equExpression() throws RecognitionException {
		return equExpression(0);
	}

	private EquExpressionContext equExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EquExpressionContext _localctx = new EquExpressionContext(_ctx, _parentState);
		EquExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_equExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new EquIdFunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(34);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new EquStringFunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				_localctx = new EquNumberFunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new EquAddSubFunContext(new EquExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equExpression);
						setState(39);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(40);
						match(ADDSUB);
						setState(41);
						equExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new EquMulDivFunContext(new EquExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equExpression);
						setState(42);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(43);
						match(MULDIV);
						setState(44);
						equExpression(5);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class RegularModuleContext extends ParserRuleContext {
		public TerminalNode REGU_KEY() { return getToken(RuleParser.REGU_KEY, 0); }
		public TerminalNode ID() { return getToken(RuleParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RuleParser.EQUAL, 0); }
		public RegularExpressionContext regularExpression() {
			return getRuleContext(RegularExpressionContext.class,0);
		}
		public RegularModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRegularModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRegularModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRegularModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularModuleContext regularModule() throws RecognitionException {
		RegularModuleContext _localctx = new RegularModuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regularModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(REGU_KEY);
			setState(51);
			match(ID);
			setState(52);
			match(EQUAL);
			setState(53);
			regularExpression();
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

	public static class RegularExpressionContext extends ParserRuleContext {
		public RegularExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularExpression; }
	 
		public RegularExpressionContext() { }
		public void copyFrom(RegularExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularStringContext extends RegularExpressionContext {
		public TerminalNode STRING() { return getToken(RuleParser.STRING, 0); }
		public RegularStringContext(RegularExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterRegularString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitRegularString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitRegularString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularExpressionContext regularExpression() throws RecognitionException {
		RegularExpressionContext _localctx = new RegularExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_regularExpression);
		try {
			_localctx = new RegularStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STRING);
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

	public static class SqlModuleContext extends ParserRuleContext {
		public TerminalNode SQL_KEY() { return getToken(RuleParser.SQL_KEY, 0); }
		public TerminalNode ID() { return getToken(RuleParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(RuleParser.EQUAL, 0); }
		public SqlExpressionContext sqlExpression() {
			return getRuleContext(SqlExpressionContext.class,0);
		}
		public SqlModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSqlModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSqlModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSqlModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlModuleContext sqlModule() throws RecognitionException {
		SqlModuleContext _localctx = new SqlModuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sqlModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(SQL_KEY);
			setState(58);
			match(ID);
			setState(59);
			match(EQUAL);
			setState(60);
			sqlExpression();
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

	public static class SqlExpressionContext extends ParserRuleContext {
		public SqlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpression; }
	 
		public SqlExpressionContext() { }
		public void copyFrom(SqlExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlStringContext extends SqlExpressionContext {
		public TerminalNode STRING() { return getToken(RuleParser.STRING, 0); }
		public SqlStringContext(SqlExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).enterSqlString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RuleListener ) ((RuleListener)listener).exitSqlString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RuleVisitor ) return ((RuleVisitor<? extends T>)visitor).visitSqlString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlExpressionContext sqlExpression() throws RecognitionException {
		SqlExpressionContext _localctx = new SqlExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sqlExpression);
		try {
			_localctx = new SqlStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(STRING);
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
		case 5:
			return equExpression_sempred((EquExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean equExpression_sempred(EquExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7"+
		"(\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\2\3\f\f\2\4\6\b\n"+
		"\f\16\20\22\24\2\2\2<\2\26\3\2\2\2\4\30\3\2\2\2\6\32\3\2\2\2\b\34\3\2"+
		"\2\2\n\36\3\2\2\2\f\'\3\2\2\2\16\64\3\2\2\2\209\3\2\2\2\22;\3\2\2\2\24"+
		"@\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\31\5\n\6\2\31\5\3\2\2\2\32\33"+
		"\5\16\b\2\33\7\3\2\2\2\34\35\5\22\n\2\35\t\3\2\2\2\36\37\7\3\2\2\37 \7"+
		"\t\2\2 !\7\22\2\2!\"\5\f\7\2\"\13\3\2\2\2#$\b\7\1\2$(\7\t\2\2%(\7\7\2"+
		"\2&(\7\6\2\2\'#\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\61\3\2\2\2)*\f\7\2\2*+"+
		"\7\26\2\2+\60\5\f\7\b,-\f\6\2\2-.\7\27\2\2.\60\5\f\7\7/)\3\2\2\2/,\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\r\3\2\2\2\63\61\3\2\2"+
		"\2\64\65\7\4\2\2\65\66\7\t\2\2\66\67\7\22\2\2\678\5\20\t\28\17\3\2\2\2"+
		"9:\7\7\2\2:\21\3\2\2\2;<\7\5\2\2<=\7\t\2\2=>\7\22\2\2>?\5\24\13\2?\23"+
		"\3\2\2\2@A\7\7\2\2A\25\3\2\2\2\5\'/\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}