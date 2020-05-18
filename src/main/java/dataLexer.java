// Generated from /Users/shriraamreddyb/IdeaProjects/datatype/src/main/java/data.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dataLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INT=4, FLOAT=5, NEWLINE=6, BOOL=7, WS=8, AND=9, 
		OR=10, String=11, EQ=12, LT=13, GT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "INT", "FLOAT", "NEWLINE", "BOOL", "WS", "AND", 
			"OR", "String", "EQ", "LT", "GT"
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


	public dataLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "data.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20Y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\3\6\3\6\5\6.\n\6\3\7\5\7\61\n\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b>\n\b\3\t\6\tA\n\t\r\t\16\tB\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6\fO\n\f\r\f\16\fP\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\5\3\2\62;\5\2\13\13\16\17\"\"\4\2C\\c|\2^\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2"+
		"\t&\3\2\2\2\13*\3\2\2\2\r\60\3\2\2\2\17=\3\2\2\2\21@\3\2\2\2\23F\3\2\2"+
		"\2\25J\3\2\2\2\27N\3\2\2\2\31R\3\2\2\2\33U\3\2\2\2\35W\3\2\2\2\37 \7\60"+
		"\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3\2\2\2#$\7+\2\2$\b\3\2\2\2%\'\t\2\2\2&"+
		"%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*-\5\t\5\2+,\7\60\2"+
		"\2,.\5\t\5\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\61\7\17\2\2\60/\3\2\2\2\60"+
		"\61\3\2\2\2\61\62\3\2\2\2\62\63\7\f\2\2\63\16\3\2\2\2\64\65\7V\2\2\65"+
		"\66\7T\2\2\66\67\7W\2\2\67>\7G\2\289\7H\2\29:\7C\2\2:;\7N\2\2;<\7U\2\2"+
		"<>\7G\2\2=\64\3\2\2\2=8\3\2\2\2>\20\3\2\2\2?A\t\3\2\2@?\3\2\2\2AB\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\t\2\2E\22\3\2\2\2FG\7C\2\2GH\7"+
		"P\2\2HI\7F\2\2I\24\3\2\2\2JK\7Q\2\2KL\7T\2\2L\26\3\2\2\2MO\t\4\2\2NM\3"+
		"\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RS\7?\2\2ST\7?\2\2T\32"+
		"\3\2\2\2UV\7>\2\2V\34\3\2\2\2WX\7@\2\2X\36\3\2\2\2\t\2(-\60=BP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}