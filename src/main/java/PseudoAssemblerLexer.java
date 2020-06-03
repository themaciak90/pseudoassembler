// Generated from C:/Users/Maciek/Desktop/studia/JFK/PseudoAssembler/src/main/antlr\PseudoAssembler.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoAssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MOV=5, PUSH=6, INT=7, XOR=8, ADD=9, SUB=10, 
		MULT=11, RPAREN=12, LPAREN=13, REG=14, DIG=15, DELI=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "MOV", "PUSH", "INT", "XOR", "ADD", "SUB", 
			"MULT", "RPAREN", "LPAREN", "REG", "DIG", "DELI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", "'\n'", "'0x80'", "'mov'", "'push'", "'int'", "'xor'", 
			"'+'", "'-'", "'*'", "')'", "'('", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MOV", "PUSH", "INT", "XOR", "ADD", "SUB", 
			"MULT", "RPAREN", "LPAREN", "REG", "DIG", "DELI"
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


	public PseudoAssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseudoAssembler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17Z\n\17\3\20\6\20]\n\20\r\20\16\20^\3\21\3\21\2\2\22"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22\3\2\3\3\2\62;\2e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13.\3"+
		"\2\2\2\r\62\3\2\2\2\17\67\3\2\2\2\21;\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2"+
		"\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35Y\3\2\2\2\37\\\3\2\2\2!`\3\2\2"+
		"\2#$\7\"\2\2$\4\3\2\2\2%&\7\13\2\2&\6\3\2\2\2\'(\7\f\2\2(\b\3\2\2\2)*"+
		"\7\62\2\2*+\7z\2\2+,\7:\2\2,-\7\62\2\2-\n\3\2\2\2./\7o\2\2/\60\7q\2\2"+
		"\60\61\7x\2\2\61\f\3\2\2\2\62\63\7r\2\2\63\64\7w\2\2\64\65\7u\2\2\65\66"+
		"\7j\2\2\66\16\3\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2:\20\3\2\2\2;<\7z\2"+
		"\2<=\7q\2\2=>\7t\2\2>\22\3\2\2\2?@\7-\2\2@\24\3\2\2\2AB\7/\2\2B\26\3\2"+
		"\2\2CD\7,\2\2D\30\3\2\2\2EF\7+\2\2F\32\3\2\2\2GH\7*\2\2H\34\3\2\2\2IJ"+
		"\7\'\2\2JK\7g\2\2KL\7c\2\2LZ\7z\2\2MN\7\'\2\2NO\7g\2\2OP\7d\2\2PZ\7z\2"+
		"\2QR\7\'\2\2RS\7g\2\2ST\7e\2\2TZ\7z\2\2UV\7\'\2\2VW\7g\2\2WX\7f\2\2XZ"+
		"\7z\2\2YI\3\2\2\2YM\3\2\2\2YQ\3\2\2\2YU\3\2\2\2Z\36\3\2\2\2[]\t\2\2\2"+
		"\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_ \3\2\2\2`a\7.\2\2a\"\3\2\2"+
		"\2\5\2Y^\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}