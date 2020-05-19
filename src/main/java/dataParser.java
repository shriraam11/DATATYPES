// Generated from /Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/data.g4 by ANTLR 4.8

import java.util.*;
import java.io.FileNotFoundException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dataParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, FLOAT=5, NEWLINE=6, BOOL=7, WS=8, AND=9, 
		OR=10, String=11, EQ=12, LT=13, GT=14;
	public static final int
		RULE_stat = 0, RULE_stmt = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"stat", "stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", null, null, null, null, null, "'AND'", "'OR'", 
			null, "'=='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT", "FLOAT", "NEWLINE", "BOOL", "WS", "AND", 
			"OR", "String", "EQ", "LT", "GT"
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
	public String getGrammarFileName() { return "data.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }
	List<String> objects = new ArrayList<String>();
	List<String> methods = new ArrayList<String>();
	Map<String, List<String>> methodmap = new HashMap<>();
	Map<String, List<String>> objmap = new HashMap<>();
	String type ="";
	public void verify() {
		read r = new read();
		objmap = r.getobj();
		methodmap = r.getmethod();


	}
		boolean isobj() {
			verify();
			for (Map.Entry<String,List<String>> m: objmap.entrySet()) {
				objects = m.getValue();
				//System.out.println(objects);
				if (objects.contains(getCurrentToken().getText())) {
					type = m.getKey();
					return true;
				}
			}
			return false;
		}

		boolean ismethod (){

			for (Map.Entry<String,List<String>> m: methodmap.entrySet()) {
				methods = m.getValue();
				//System.out.println(type);
				if (methods.contains(getCurrentToken().getText()) && type.equals(m.getKey())) {
					return true;
				}
			}

			return false;
		}




	//boolean isobj(){
	//    return types.contains(getCurrentToken().getText());
	//}
	//boolean ismethod(){
	//  return methods.contains(getCurrentToken().getText());
	//}


	public dataParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(dataParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(dataParser.EOF, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			stmt(0);
			setState(5);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatendContext extends StmtContext {
		public TerminalNode FLOAT() { return getToken(dataParser.FLOAT, 0); }
		public FloatendContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterFloatend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitFloatend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitFloatend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsobjpropContext extends StmtContext {
		public List<TerminalNode> String() { return getTokens(dataParser.String); }
		public TerminalNode String(int i) {
			return getToken(dataParser.String, i);
		}
		public IsobjpropContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterIsobjprop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitIsobjprop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitIsobjprop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends StmtContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ParensContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpstmtContext extends StmtContext {
		public StmtContext left;
		public Token comp;
		public StmtContext right;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode AND() { return getToken(dataParser.AND, 0); }
		public TerminalNode OR() { return getToken(dataParser.OR, 0); }
		public OpstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterOpstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitOpstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitOpstmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolendContext extends StmtContext {
		public TerminalNode BOOL() { return getToken(dataParser.BOOL, 0); }
		public BoolendContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterBoolend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitBoolend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitBoolend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringendContext extends StmtContext {
		public TerminalNode String() { return getToken(dataParser.String, 0); }
		public StringendContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterStringend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitStringend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitStringend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntendContext extends StmtContext {
		public TerminalNode INT() { return getToken(dataParser.INT, 0); }
		public IntendContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterIntend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitIntend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitIntend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompstmtContext extends StmtContext {
		public StmtContext left;
		public Token op;
		public StmtContext right;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode EQ() { return getToken(dataParser.EQ, 0); }
		public TerminalNode GT() { return getToken(dataParser.GT, 0); }
		public TerminalNode LT() { return getToken(dataParser.LT, 0); }
		public CompstmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).enterCompstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dataListener ) ((dataListener)listener).exitCompstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dataVisitor ) return ((dataVisitor<? extends T>)visitor).visitCompstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_stmt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new IsobjpropContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(8);
				if (!(isobj())) throw new FailedPredicateException(this, "isobj()");
				setState(9);
				match(String);
				setState(10);
				match(T__0);
				setState(11);
				if (!(ismethod())) throw new FailedPredicateException(this, "ismethod()");
				setState(12);
				match(String);
				}
				break;
			case 2:
				{
				_localctx = new StringendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(String);
				}
				break;
			case 3:
				{
				_localctx = new IntendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new BoolendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(BOOL);
				}
				break;
			case 5:
				{
				_localctx = new FloatendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				match(T__1);
				setState(18);
				stmt(0);
				setState(19);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(29);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new OpstmtContext(new StmtContext(_parentctx, _parentState));
						((OpstmtContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(23);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(24);
						((OpstmtContext)_localctx).comp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((OpstmtContext)_localctx).comp = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(25);
						((OpstmtContext)_localctx).right = stmt(9);
						}
						break;
					case 2:
						{
						_localctx = new CompstmtContext(new StmtContext(_parentctx, _parentState));
						((CompstmtContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(26);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(27);
						((CompstmtContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((CompstmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(28);
						((CompstmtContext)_localctx).right = stmt(8);
						}
						break;
					}
					} 
				}
				setState(33);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return isobj();
		case 1:
			return ismethod();
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20%\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\30\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\2\3\4"+
		"\4\2\4\2\5\3\3\b\b\3\2\13\f\3\2\16\20\2)\2\6\3\2\2\2\4\27\3\2\2\2\6\7"+
		"\5\4\3\2\7\b\t\2\2\2\b\3\3\2\2\2\t\n\b\3\1\2\n\13\6\3\2\2\13\f\7\r\2\2"+
		"\f\r\7\3\2\2\r\16\6\3\3\2\16\30\7\r\2\2\17\30\7\r\2\2\20\30\7\6\2\2\21"+
		"\30\7\t\2\2\22\30\7\7\2\2\23\24\7\4\2\2\24\25\5\4\3\2\25\26\7\5\2\2\26"+
		"\30\3\2\2\2\27\t\3\2\2\2\27\17\3\2\2\2\27\20\3\2\2\2\27\21\3\2\2\2\27"+
		"\22\3\2\2\2\27\23\3\2\2\2\30!\3\2\2\2\31\32\f\n\2\2\32\33\t\3\2\2\33 "+
		"\5\4\3\13\34\35\f\t\2\2\35\36\t\4\2\2\36 \5\4\3\n\37\31\3\2\2\2\37\34"+
		"\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2\5\27\37"+
		"!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}