// Generated from Maplang.g4 by ANTLR 4.7.2
package com.github.crhunter.maplang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaplangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, COMPUTE=2, END_COMPUTE=3, OR=4, IF=5, END_IF=6, ELSE=7, MOVE=8, 
		THEN=9, TO=10, CONCAT=11, AS=12, NOT=13, POS=14, THRU=15, EQUALCHAR=16, 
		NOTEQUAL=17, GREATERTHAN=18, LESSTHAN=19, GREATEREQUAL=20, LESSEQUAL=21, 
		PLUSCHAR=22, MINUSCHAR=23, ASTERISK=24, DOUBLEASTERISK=25, SLASHCHAR=26, 
		LEFTPAREN=27, RIGHTPAREN=28, DOT=29, STRINGLITERAL=30, INTEGERLITERAL=31, 
		NUMERICLITERAL=32, IDENTIFIER=33, NEWLINE=34, WS=35;
	public static final int
		RULE_topUnit = 0, RULE_statement = 1, RULE_moveStatement = 2, RULE_moveToStatement = 3, 
		RULE_moveToSendingArea = 4, RULE_concatStatement = 5, RULE_concatToStatement = 6, 
		RULE_concatExtraToStatement = 7, RULE_concatToSendingArea = 8, RULE_concatAsStatement = 9, 
		RULE_concatAsSendingArea = 10, RULE_ifStatement = 11, RULE_ifThen = 12, 
		RULE_ifElse = 13, RULE_condition = 14, RULE_andOrCondition = 15, RULE_simpleCondition = 16, 
		RULE_relationCondition = 17, RULE_relationArithmeticComparison = 18, RULE_relationCombinedComparison = 19, 
		RULE_relationCombinedCondition = 20, RULE_relationalOperator = 21, RULE_computeStatement = 22, 
		RULE_arithmeticExpression = 23, RULE_plusMinus = 24, RULE_multDivs = 25, 
		RULE_multDiv = 26, RULE_powers = 27, RULE_power = 28, RULE_basis = 29, 
		RULE_identifier = 30, RULE_refIdentifier = 31, RULE_arrayIdentifier = 32, 
		RULE_literal = 33, RULE_numericLiteral = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"topUnit", "statement", "moveStatement", "moveToStatement", "moveToSendingArea", 
			"concatStatement", "concatToStatement", "concatExtraToStatement", "concatToSendingArea", 
			"concatAsStatement", "concatAsSendingArea", "ifStatement", "ifThen", 
			"ifElse", "condition", "andOrCondition", "simpleCondition", "relationCondition", 
			"relationArithmeticComparison", "relationCombinedComparison", "relationCombinedCondition", 
			"relationalOperator", "computeStatement", "arithmeticExpression", "plusMinus", 
			"multDivs", "multDiv", "powers", "power", "basis", "identifier", "refIdentifier", 
			"arrayIdentifier", "literal", "numericLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'='", null, "'>'", "'<'", "'>='", "'<='", "'+'", 
			"'-'", "'*'", "'**'", "'/'", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "COMPUTE", "END_COMPUTE", "OR", "IF", "END_IF", "ELSE", 
			"MOVE", "THEN", "TO", "CONCAT", "AS", "NOT", "POS", "THRU", "EQUALCHAR", 
			"NOTEQUAL", "GREATERTHAN", "LESSTHAN", "GREATEREQUAL", "LESSEQUAL", "PLUSCHAR", 
			"MINUSCHAR", "ASTERISK", "DOUBLEASTERISK", "SLASHCHAR", "LEFTPAREN", 
			"RIGHTPAREN", "DOT", "STRINGLITERAL", "INTEGERLITERAL", "NUMERICLITERAL", 
			"IDENTIFIER", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Maplang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaplangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TopUnitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TopUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterTopUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitTopUnit(this);
		}
	}

	public final TopUnitContext topUnit() throws RecognitionException {
		TopUnitContext _localctx = new TopUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << MOVE) | (1L << CONCAT))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public ConcatStatementContext concatStatement() {
			return getRuleContext(ConcatStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				{
				setState(75);
				moveStatement();
				}
				break;
			case CONCAT:
				{
				setState(76);
				concatStatement();
				}
				break;
			case IF:
				{
				setState(77);
				ifStatement();
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

	public static class MoveStatementContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(MaplangParser.MOVE, 0); }
		public MoveToStatementContext moveToStatement() {
			return getRuleContext(MoveToStatementContext.class,0);
		}
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterMoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitMoveStatement(this);
		}
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(MOVE);
			setState(81);
			moveToStatement();
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

	public static class MoveToStatementContext extends ParserRuleContext {
		public MoveToSendingAreaContext moveToSendingArea() {
			return getRuleContext(MoveToSendingAreaContext.class,0);
		}
		public TerminalNode TO() { return getToken(MaplangParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MoveToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterMoveToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitMoveToStatement(this);
		}
	}

	public final MoveToStatementContext moveToStatement() throws RecognitionException {
		MoveToStatementContext _localctx = new MoveToStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moveToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			moveToSendingArea();
			setState(84);
			match(TO);
			setState(85);
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

	public static class MoveToSendingAreaContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MoveToSendingAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveToSendingArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterMoveToSendingArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitMoveToSendingArea(this);
		}
	}

	public final MoveToSendingAreaContext moveToSendingArea() throws RecognitionException {
		MoveToSendingAreaContext _localctx = new MoveToSendingAreaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_moveToSendingArea);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				identifier();
				}
				break;
			case STRINGLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				literal();
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

	public static class ConcatStatementContext extends ParserRuleContext {
		public TerminalNode CONCAT() { return getToken(MaplangParser.CONCAT, 0); }
		public ConcatToStatementContext concatToStatement() {
			return getRuleContext(ConcatToStatementContext.class,0);
		}
		public ConcatAsStatementContext concatAsStatement() {
			return getRuleContext(ConcatAsStatementContext.class,0);
		}
		public List<ConcatExtraToStatementContext> concatExtraToStatement() {
			return getRuleContexts(ConcatExtraToStatementContext.class);
		}
		public ConcatExtraToStatementContext concatExtraToStatement(int i) {
			return getRuleContext(ConcatExtraToStatementContext.class,i);
		}
		public ConcatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatStatement(this);
		}
	}

	public final ConcatStatementContext concatStatement() throws RecognitionException {
		ConcatStatementContext _localctx = new ConcatStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concatStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CONCAT);
			setState(92);
			concatToStatement();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TO) {
				{
				{
				setState(93);
				concatExtraToStatement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			concatAsStatement();
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

	public static class ConcatToStatementContext extends ParserRuleContext {
		public List<ConcatToSendingAreaContext> concatToSendingArea() {
			return getRuleContexts(ConcatToSendingAreaContext.class);
		}
		public ConcatToSendingAreaContext concatToSendingArea(int i) {
			return getRuleContext(ConcatToSendingAreaContext.class,i);
		}
		public TerminalNode TO() { return getToken(MaplangParser.TO, 0); }
		public ConcatToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatToStatement(this);
		}
	}

	public final ConcatToStatementContext concatToStatement() throws RecognitionException {
		ConcatToStatementContext _localctx = new ConcatToStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_concatToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			concatToSendingArea();
			setState(102);
			match(TO);
			setState(103);
			concatToSendingArea();
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

	public static class ConcatExtraToStatementContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(MaplangParser.TO, 0); }
		public ConcatToSendingAreaContext concatToSendingArea() {
			return getRuleContext(ConcatToSendingAreaContext.class,0);
		}
		public ConcatExtraToStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatExtraToStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatExtraToStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatExtraToStatement(this);
		}
	}

	public final ConcatExtraToStatementContext concatExtraToStatement() throws RecognitionException {
		ConcatExtraToStatementContext _localctx = new ConcatExtraToStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_concatExtraToStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(TO);
			setState(106);
			concatToSendingArea();
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

	public static class ConcatToSendingAreaContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ConcatToSendingAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatToSendingArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatToSendingArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatToSendingArea(this);
		}
	}

	public final ConcatToSendingAreaContext concatToSendingArea() throws RecognitionException {
		ConcatToSendingAreaContext _localctx = new ConcatToSendingAreaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_concatToSendingArea);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				identifier();
				}
				break;
			case STRINGLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				literal();
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

	public static class ConcatAsStatementContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(MaplangParser.AS, 0); }
		public ConcatAsSendingAreaContext concatAsSendingArea() {
			return getRuleContext(ConcatAsSendingAreaContext.class,0);
		}
		public ConcatAsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatAsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatAsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatAsStatement(this);
		}
	}

	public final ConcatAsStatementContext concatAsStatement() throws RecognitionException {
		ConcatAsStatementContext _localctx = new ConcatAsStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_concatAsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(AS);
			setState(113);
			concatAsSendingArea();
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

	public static class ConcatAsSendingAreaContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConcatAsSendingAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatAsSendingArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterConcatAsSendingArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitConcatAsSendingArea(this);
		}
	}

	public final ConcatAsSendingAreaContext concatAsSendingArea() throws RecognitionException {
		ConcatAsSendingAreaContext _localctx = new ConcatAsSendingAreaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_concatAsSendingArea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MaplangParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfThenContext ifThen() {
			return getRuleContext(IfThenContext.class,0);
		}
		public TerminalNode END_IF() { return getToken(MaplangParser.END_IF, 0); }
		public IfElseContext ifElse() {
			return getRuleContext(IfElseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(IF);
			setState(118);
			condition();
			setState(119);
			ifThen();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(120);
				ifElse();
				}
			}

			setState(123);
			match(END_IF);
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

	public static class IfThenContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(MaplangParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitIfThen(this);
		}
	}

	public final IfThenContext ifThen() throws RecognitionException {
		IfThenContext _localctx = new IfThenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifThen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THEN) {
				{
				setState(125);
				match(THEN);
				}
			}

			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				statement();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << MOVE) | (1L << CONCAT))) != 0) );
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

	public static class IfElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MaplangParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitIfElse(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ELSE);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << MOVE) | (1L << CONCAT))) != 0)) {
				{
				{
				setState(134);
				statement();
				}
				}
				setState(139);
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

	public static class ConditionContext extends ParserRuleContext {
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public List<AndOrConditionContext> andOrCondition() {
			return getRuleContexts(AndOrConditionContext.class);
		}
		public AndOrConditionContext andOrCondition(int i) {
			return getRuleContext(AndOrConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			simpleCondition();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(141);
				andOrCondition();
				}
				}
				setState(146);
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

	public static class AndOrConditionContext extends ParserRuleContext {
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MaplangParser.AND, 0); }
		public TerminalNode OR() { return getToken(MaplangParser.OR, 0); }
		public AndOrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOrCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterAndOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitAndOrCondition(this);
		}
	}

	public final AndOrConditionContext andOrCondition() throws RecognitionException {
		AndOrConditionContext _localctx = new AndOrConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_andOrCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			simpleCondition();
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

	public static class SimpleConditionContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(MaplangParser.LEFTPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MaplangParser.RIGHTPAREN, 0); }
		public RelationConditionContext relationCondition() {
			return getRuleContext(RelationConditionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MaplangParser.NOT, 0); }
		public SimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitSimpleCondition(this);
		}
	}

	public final SimpleConditionContext simpleCondition() throws RecognitionException {
		SimpleConditionContext _localctx = new SimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(150);
				match(NOT);
				}
			}

			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(153);
				match(LEFTPAREN);
				setState(154);
				condition();
				setState(155);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				setState(157);
				relationCondition();
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

	public static class RelationConditionContext extends ParserRuleContext {
		public RelationArithmeticComparisonContext relationArithmeticComparison() {
			return getRuleContext(RelationArithmeticComparisonContext.class,0);
		}
		public RelationCombinedComparisonContext relationCombinedComparison() {
			return getRuleContext(RelationCombinedComparisonContext.class,0);
		}
		public RelationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRelationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRelationCondition(this);
		}
	}

	public final RelationConditionContext relationCondition() throws RecognitionException {
		RelationConditionContext _localctx = new RelationConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationCondition);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				relationArithmeticComparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				relationCombinedComparison();
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

	public static class RelationArithmeticComparisonContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public RelationArithmeticComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationArithmeticComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRelationArithmeticComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRelationArithmeticComparison(this);
		}
	}

	public final RelationArithmeticComparisonContext relationArithmeticComparison() throws RecognitionException {
		RelationArithmeticComparisonContext _localctx = new RelationArithmeticComparisonContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationArithmeticComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			arithmeticExpression();
			setState(165);
			relationalOperator();
			setState(166);
			arithmeticExpression();
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

	public static class RelationCombinedComparisonContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(MaplangParser.LEFTPAREN, 0); }
		public RelationCombinedConditionContext relationCombinedCondition() {
			return getRuleContext(RelationCombinedConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MaplangParser.RIGHTPAREN, 0); }
		public RelationCombinedComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationCombinedComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRelationCombinedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRelationCombinedComparison(this);
		}
	}

	public final RelationCombinedComparisonContext relationCombinedComparison() throws RecognitionException {
		RelationCombinedComparisonContext _localctx = new RelationCombinedComparisonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relationCombinedComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			arithmeticExpression();
			setState(169);
			relationalOperator();
			setState(170);
			match(LEFTPAREN);
			setState(171);
			relationCombinedCondition();
			setState(172);
			match(RIGHTPAREN);
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

	public static class RelationCombinedConditionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MaplangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MaplangParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(MaplangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MaplangParser.OR, i);
		}
		public RelationCombinedConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationCombinedCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRelationCombinedCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRelationCombinedCondition(this);
		}
	}

	public final RelationCombinedConditionContext relationCombinedCondition() throws RecognitionException {
		RelationCombinedConditionContext _localctx = new RelationCombinedConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relationCombinedCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			arithmeticExpression();
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				arithmeticExpression();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND || _la==OR );
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode GREATERTHAN() { return getToken(MaplangParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(MaplangParser.LESSTHAN, 0); }
		public TerminalNode EQUALCHAR() { return getToken(MaplangParser.EQUALCHAR, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(MaplangParser.GREATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(MaplangParser.LESSEQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(MaplangParser.NOTEQUAL, 0); }
		public TerminalNode NOT() { return getToken(MaplangParser.NOT, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(181);
				match(NOT);
				}
			}

			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALCHAR) | (1L << NOTEQUAL) | (1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << GREATEREQUAL) | (1L << LESSEQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComputeStatementContext extends ParserRuleContext {
		public TerminalNode COMPUTE() { return getToken(MaplangParser.COMPUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALCHAR() { return getToken(MaplangParser.EQUALCHAR, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode END_COMPUTE() { return getToken(MaplangParser.END_COMPUTE, 0); }
		public ComputeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterComputeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitComputeStatement(this);
		}
	}

	public final ComputeStatementContext computeStatement() throws RecognitionException {
		ComputeStatementContext _localctx = new ComputeStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_computeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(COMPUTE);
			setState(187);
			identifier();
			setState(188);
			match(EQUALCHAR);
			setState(189);
			arithmeticExpression();
			setState(190);
			match(END_COMPUTE);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public MultDivsContext multDivs() {
			return getRuleContext(MultDivsContext.class,0);
		}
		public List<PlusMinusContext> plusMinus() {
			return getRuleContexts(PlusMinusContext.class);
		}
		public PlusMinusContext plusMinus(int i) {
			return getRuleContext(PlusMinusContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitArithmeticExpression(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			multDivs();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUSCHAR || _la==MINUSCHAR) {
				{
				{
				setState(193);
				plusMinus();
				}
				}
				setState(198);
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

	public static class PlusMinusContext extends ParserRuleContext {
		public MultDivsContext multDivs() {
			return getRuleContext(MultDivsContext.class,0);
		}
		public TerminalNode PLUSCHAR() { return getToken(MaplangParser.PLUSCHAR, 0); }
		public TerminalNode MINUSCHAR() { return getToken(MaplangParser.MINUSCHAR, 0); }
		public PlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitPlusMinus(this);
		}
	}

	public final PlusMinusContext plusMinus() throws RecognitionException {
		PlusMinusContext _localctx = new PlusMinusContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_plusMinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==PLUSCHAR || _la==MINUSCHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			multDivs();
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

	public static class MultDivsContext extends ParserRuleContext {
		public PowersContext powers() {
			return getRuleContext(PowersContext.class,0);
		}
		public List<MultDivContext> multDiv() {
			return getRuleContexts(MultDivContext.class);
		}
		public MultDivContext multDiv(int i) {
			return getRuleContext(MultDivContext.class,i);
		}
		public MultDivsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDivs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterMultDivs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitMultDivs(this);
		}
	}

	public final MultDivsContext multDivs() throws RecognitionException {
		MultDivsContext _localctx = new MultDivsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multDivs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			powers();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==SLASHCHAR) {
				{
				{
				setState(203);
				multDiv();
				}
				}
				setState(208);
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

	public static class MultDivContext extends ParserRuleContext {
		public PowersContext powers() {
			return getRuleContext(PowersContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(MaplangParser.ASTERISK, 0); }
		public TerminalNode SLASHCHAR() { return getToken(MaplangParser.SLASHCHAR, 0); }
		public MultDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitMultDiv(this);
		}
	}

	public final MultDivContext multDiv() throws RecognitionException {
		MultDivContext _localctx = new MultDivContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==ASTERISK || _la==SLASHCHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(210);
			powers();
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

	public static class PowersContext extends ParserRuleContext {
		public BasisContext basis() {
			return getRuleContext(BasisContext.class,0);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public TerminalNode PLUSCHAR() { return getToken(MaplangParser.PLUSCHAR, 0); }
		public TerminalNode MINUSCHAR() { return getToken(MaplangParser.MINUSCHAR, 0); }
		public PowersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterPowers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitPowers(this);
		}
	}

	public final PowersContext powers() throws RecognitionException {
		PowersContext _localctx = new PowersContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_powers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUSCHAR || _la==MINUSCHAR) {
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==PLUSCHAR || _la==MINUSCHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(215);
			basis();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLEASTERISK) {
				{
				{
				setState(216);
				power();
				}
				}
				setState(221);
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

	public static class PowerContext extends ParserRuleContext {
		public TerminalNode DOUBLEASTERISK() { return getToken(MaplangParser.DOUBLEASTERISK, 0); }
		public BasisContext basis() {
			return getRuleContext(BasisContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(DOUBLEASTERISK);
			setState(223);
			basis();
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

	public static class BasisContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(MaplangParser.LEFTPAREN, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MaplangParser.RIGHTPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public BasisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterBasis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitBasis(this);
		}
	}

	public final BasisContext basis() throws RecognitionException {
		BasisContext _localctx = new BasisContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_basis);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(LEFTPAREN);
				setState(226);
				arithmeticExpression();
				setState(227);
				match(RIGHTPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				identifier();
				}
				break;
			case STRINGLITERAL:
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				literal();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MaplangParser.IDENTIFIER, 0); }
		public RefIdentifierContext refIdentifier() {
			return getRuleContext(RefIdentifierContext.class,0);
		}
		public ArrayIdentifierContext arrayIdentifier() {
			return getRuleContext(ArrayIdentifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifier);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				refIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				arrayIdentifier();
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

	public static class RefIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MaplangParser.IDENTIFIER, 0); }
		public TerminalNode POS() { return getToken(MaplangParser.POS, 0); }
		public List<TerminalNode> INTEGERLITERAL() { return getTokens(MaplangParser.INTEGERLITERAL); }
		public TerminalNode INTEGERLITERAL(int i) {
			return getToken(MaplangParser.INTEGERLITERAL, i);
		}
		public TerminalNode THRU() { return getToken(MaplangParser.THRU, 0); }
		public RefIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterRefIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitRefIdentifier(this);
		}
	}

	public final RefIdentifierContext refIdentifier() throws RecognitionException {
		RefIdentifierContext _localctx = new RefIdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_refIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(IDENTIFIER);
			setState(239);
			match(POS);
			setState(240);
			match(INTEGERLITERAL);
			setState(241);
			match(THRU);
			setState(242);
			match(INTEGERLITERAL);
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

	public static class ArrayIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MaplangParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MaplangParser.LEFTPAREN, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(MaplangParser.INTEGERLITERAL, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MaplangParser.RIGHTPAREN, 0); }
		public ArrayIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterArrayIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitArrayIdentifier(this);
		}
	}

	public final ArrayIdentifierContext arrayIdentifier() throws RecognitionException {
		ArrayIdentifierContext _localctx = new ArrayIdentifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arrayIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENTIFIER);
			setState(245);
			match(LEFTPAREN);
			setState(246);
			match(INTEGERLITERAL);
			setState(247);
			match(RIGHTPAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(MaplangParser.STRINGLITERAL, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(STRINGLITERAL);
				}
				break;
			case INTEGERLITERAL:
			case NUMERICLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode NUMERICLITERAL() { return getToken(MaplangParser.NUMERICLITERAL, 0); }
		public TerminalNode INTEGERLITERAL() { return getToken(MaplangParser.INTEGERLITERAL, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaplangListener ) ((MaplangListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !(_la==INTEGERLITERAL || _la==NUMERICLITERAL) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\3\3\3\3\3\5\3Q\n\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\7\7a\n\7\f\7"+
		"\16\7d\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\5\nq\n\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r|\n\r\3\r\3\r\3\16\5\16\u0081\n"+
		"\16\3\16\6\16\u0084\n\16\r\16\16\16\u0085\3\17\3\17\7\17\u008a\n\17\f"+
		"\17\16\17\u008d\13\17\3\20\3\20\7\20\u0091\n\20\f\20\16\20\u0094\13\20"+
		"\3\21\3\21\3\21\3\22\5\22\u009a\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a1"+
		"\n\22\3\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\6\26\u00b4\n\26\r\26\16\26\u00b5\3\27\5\27\u00b9"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00c5\n\31"+
		"\f\31\16\31\u00c8\13\31\3\32\3\32\3\32\3\33\3\33\7\33\u00cf\n\33\f\33"+
		"\16\33\u00d2\13\33\3\34\3\34\3\34\3\35\5\35\u00d8\n\35\3\35\3\35\7\35"+
		"\u00dc\n\35\f\35\16\35\u00df\13\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u00ea\n\37\3 \3 \3 \5 \u00ef\n \3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\5#\u00fe\n#\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7\4\2\3\3\6\6\3\2\22"+
		"\27\3\2\30\31\4\2\32\32\34\34\3\2!\"\2\u00f7\2I\3\2\2\2\4P\3\2\2\2\6R"+
		"\3\2\2\2\bU\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16g\3\2\2\2\20k\3\2\2\2\22p"+
		"\3\2\2\2\24r\3\2\2\2\26u\3\2\2\2\30w\3\2\2\2\32\u0080\3\2\2\2\34\u0087"+
		"\3\2\2\2\36\u008e\3\2\2\2 \u0095\3\2\2\2\"\u0099\3\2\2\2$\u00a4\3\2\2"+
		"\2&\u00a6\3\2\2\2(\u00aa\3\2\2\2*\u00b0\3\2\2\2,\u00b8\3\2\2\2.\u00bc"+
		"\3\2\2\2\60\u00c2\3\2\2\2\62\u00c9\3\2\2\2\64\u00cc\3\2\2\2\66\u00d3\3"+
		"\2\2\28\u00d7\3\2\2\2:\u00e0\3\2\2\2<\u00e9\3\2\2\2>\u00ee\3\2\2\2@\u00f0"+
		"\3\2\2\2B\u00f6\3\2\2\2D\u00fd\3\2\2\2F\u00ff\3\2\2\2HJ\5\4\3\2IH\3\2"+
		"\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MQ\5\6\4\2NQ\5\f\7\2OQ\5"+
		"\30\r\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\5\3\2\2\2RS\7\n\2\2ST\5\b\5\2T"+
		"\7\3\2\2\2UV\5\n\6\2VW\7\f\2\2WX\5> \2X\t\3\2\2\2Y\\\5> \2Z\\\5D#\2[Y"+
		"\3\2\2\2[Z\3\2\2\2\\\13\3\2\2\2]^\7\r\2\2^b\5\16\b\2_a\5\20\t\2`_\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\5\24\13\2f\r"+
		"\3\2\2\2gh\5\22\n\2hi\7\f\2\2ij\5\22\n\2j\17\3\2\2\2kl\7\f\2\2lm\5\22"+
		"\n\2m\21\3\2\2\2nq\5> \2oq\5D#\2pn\3\2\2\2po\3\2\2\2q\23\3\2\2\2rs\7\16"+
		"\2\2st\5\26\f\2t\25\3\2\2\2uv\5> \2v\27\3\2\2\2wx\7\7\2\2xy\5\36\20\2"+
		"y{\5\32\16\2z|\5\34\17\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\b\2\2~\31\3"+
		"\2\2\2\177\u0081\7\13\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\33\3\2\2\2\u0087\u008b"+
		"\7\t\2\2\u0088\u008a\5\4\3\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\35\3\2\2\2\u008d\u008b\3\2\2"+
		"\2\u008e\u0092\5\"\22\2\u008f\u0091\5 \21\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\37\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0096\t\2\2\2\u0096\u0097\5\"\22\2\u0097"+
		"!\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u009a\u00a0\3\2\2\2\u009b\u009c\7\35\2\2\u009c\u009d\5\36\20\2\u009d"+
		"\u009e\7\36\2\2\u009e\u00a1\3\2\2\2\u009f\u00a1\5$\23\2\u00a0\u009b\3"+
		"\2\2\2\u00a0\u009f\3\2\2\2\u00a1#\3\2\2\2\u00a2\u00a5\5&\24\2\u00a3\u00a5"+
		"\5(\25\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5%\3\2\2\2\u00a6"+
		"\u00a7\5\60\31\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\5\60\31\2\u00a9\'\3\2"+
		"\2\2\u00aa\u00ab\5\60\31\2\u00ab\u00ac\5,\27\2\u00ac\u00ad\7\35\2\2\u00ad"+
		"\u00ae\5*\26\2\u00ae\u00af\7\36\2\2\u00af)\3\2\2\2\u00b0\u00b3\5\60\31"+
		"\2\u00b1\u00b2\t\2\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6+\3\2\2\2"+
		"\u00b7\u00b9\7\17\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb-\3\2\2\2\u00bc\u00bd\7\4\2\2\u00bd"+
		"\u00be\5> \2\u00be\u00bf\7\22\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\7"+
		"\5\2\2\u00c1/\3\2\2\2\u00c2\u00c6\5\64\33\2\u00c3\u00c5\5\62\32\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\61\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb"+
		"\5\64\33\2\u00cb\63\3\2\2\2\u00cc\u00d0\58\35\2\u00cd\u00cf\5\66\34\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\65\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4"+
		"\u00d5\58\35\2\u00d5\67\3\2\2\2\u00d6\u00d8\t\4\2\2\u00d7\u00d6\3\2\2"+
		"\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\5<\37\2\u00da\u00dc"+
		"\5:\36\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de9\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\33\2\2"+
		"\u00e1\u00e2\5<\37\2\u00e2;\3\2\2\2\u00e3\u00e4\7\35\2\2\u00e4\u00e5\5"+
		"\60\31\2\u00e5\u00e6\7\36\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00ea\5> \2\u00e8"+
		"\u00ea\5D#\2\u00e9\u00e3\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2"+
		"\2\u00ea=\3\2\2\2\u00eb\u00ef\7#\2\2\u00ec\u00ef\5@!\2\u00ed\u00ef\5B"+
		"\"\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"?\3\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\7!\2\2\u00f3"+
		"\u00f4\7\21\2\2\u00f4\u00f5\7!\2\2\u00f5A\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7"+
		"\u00f8\7\35\2\2\u00f8\u00f9\7!\2\2\u00f9\u00fa\7\36\2\2\u00faC\3\2\2\2"+
		"\u00fb\u00fe\7 \2\2\u00fc\u00fe\5F$\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc"+
		"\3\2\2\2\u00feE\3\2\2\2\u00ff\u0100\t\6\2\2\u0100G\3\2\2\2\30KP[bp{\u0080"+
		"\u0085\u008b\u0092\u0099\u00a0\u00a4\u00b5\u00b8\u00c6\u00d0\u00d7\u00dd"+
		"\u00e9\u00ee\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}