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
		T__0=1, T__1=2, T__2=3, T__3=4, INT=5, FLOAT=6, NEWLINE=7, BOOL=8, WS=9, 
		AND=10, OR=11, String=12, EQ=13, LT=14, GT=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "INT", "FLOAT", "NEWLINE", "BOOL", "WS", 
			"AND", "OR", "String", "EQ", "LT", "GT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'.'", null, null, null, null, null, "'AND'", 
			"'OR'", null, "'=='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "INT", "FLOAT", "NEWLINE", "BOOL", "WS", 
			"AND", "OR", "String", "EQ", "LT", "GT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\6\6+\n\6\r\6\16\6,\3\7\3\7\3\7\5\7\62\n\7\3\b\5\b\65"+
		"\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tB\n\t\3\n\6\nE\n\n"+
		"\r\n\16\nF\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\rS\n\r\r\r\16"+
		"\rT\3\16\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\3\2\62;\5\2\13"+
		"\13\16\17\"\"\4\2C\\c|\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\r.\3\2"+
		"\2\2\17\64\3\2\2\2\21A\3\2\2\2\23D\3\2\2\2\25J\3\2\2\2\27N\3\2\2\2\31"+
		"R\3\2\2\2\33V\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$"+
		"\7*\2\2$\6\3\2\2\2%&\7+\2\2&\b\3\2\2\2\'(\7\60\2\2(\n\3\2\2\2)+\t\2\2"+
		"\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2\2.\61\5\13\6\2/\60"+
		"\7\60\2\2\60\62\5\13\6\2\61/\3\2\2\2\61\62\3\2\2\2\62\16\3\2\2\2\63\65"+
		"\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\f\2\2\67\20"+
		"\3\2\2\289\7V\2\29:\7T\2\2:;\7W\2\2;B\7G\2\2<=\7H\2\2=>\7C\2\2>?\7N\2"+
		"\2?@\7U\2\2@B\7G\2\2A8\3\2\2\2A<\3\2\2\2B\22\3\2\2\2CE\t\3\2\2DC\3\2\2"+
		"\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\b\n\2\2I\24\3\2\2\2JK\7C"+
		"\2\2KL\7P\2\2LM\7F\2\2M\26\3\2\2\2NO\7Q\2\2OP\7T\2\2P\30\3\2\2\2QS\t\4"+
		"\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VW\7?\2\2WX\7"+
		"?\2\2X\34\3\2\2\2YZ\7>\2\2Z\36\3\2\2\2[\\\7@\2\2\\ \3\2\2\2\t\2,\61\64"+
		"AFT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}