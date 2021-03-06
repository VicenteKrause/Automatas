// Generated from LexerT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, PRINT=3, SCAN=4, INT=5, STRING=6, FLOAT=7, IF=8, ELSE=9, 
		WHILE=10, FOR=11, AND=12, OR=13, SUM=14, DIV=15, RES=16, MUL=17, SQRT=18, 
		POW=19, COS=20, AP=21, CP=22, MENIG=23, MAYIG=24, MAY=25, MEN=26, IG=27, 
		DIF=28, AL=29, CL=30, NAME=31, WS=32, VARSTATMENT=33, BLANCO=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGIN", "END", "PRINT", "SCAN", "INT", "STRING", "FLOAT", "IF", "ELSE", 
		"WHILE", "FOR", "AND", "OR", "SUM", "DIV", "RES", "MUL", "SQRT", "POW", 
		"COS", "AP", "CP", "MENIG", "MAYIG", "MAY", "MEN", "IG", "DIF", "AL", 
		"CL", "NAME", "WS", "VARSTATMENT", "BLANCO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'lastorres'", "'rmx'", "'xipetiao'", "'malveke'", null, null, null, 
		"'kpaha'", "'wasa'", "'dimetu'", "'luv'", "'&&'", "'||'", "'+'", "'/'", 
		"'-'", "'*'", "'svenska'", "'engleska'", "'spanska'", "'('", "')'", "'<='", 
		"'>='", "'>'", "'<'", "'=='", "'!='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "PRINT", "SCAN", "INT", "STRING", "FLOAT", "IF", 
		"ELSE", "WHILE", "FOR", "AND", "OR", "SUM", "DIV", "RES", "MUL", "SQRT", 
		"POW", "COS", "AP", "CP", "MENIG", "MAYIG", "MAY", "MEN", "IG", "DIF", 
		"AL", "CL", "NAME", "WS", "VARSTATMENT", "BLANCO"
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


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0103\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6p\n\6\r\6\16\6q\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7~\n\7\r\7\16\7\177\3\7\7\7\u0083\n\7\f"+
		"\7\16\7\u0086\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0091\n\b\r"+
		"\b\16\b\u0092\3\b\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \6 \u00f2\n \r \16 \u00f3"+
		"\3!\6!\u00f7\n!\r!\16!\u00f8\3!\3!\3\"\3\"\3\"\5\"\u0100\n\"\3#\3#\2\2"+
		"$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$\3\2\6\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\13\13\"\"\2"+
		"\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3"+
		"G\3\2\2\2\5Q\3\2\2\2\7U\3\2\2\2\t^\3\2\2\2\13f\3\2\2\2\rs\3\2\2\2\17\u0087"+
		"\3\2\2\2\21\u009b\3\2\2\2\23\u00a1\3\2\2\2\25\u00a6\3\2\2\2\27\u00ad\3"+
		"\2\2\2\31\u00b1\3\2\2\2\33\u00b4\3\2\2\2\35\u00b7\3\2\2\2\37\u00b9\3\2"+
		"\2\2!\u00bb\3\2\2\2#\u00bd\3\2\2\2%\u00bf\3\2\2\2\'\u00c7\3\2\2\2)\u00d0"+
		"\3\2\2\2+\u00d8\3\2\2\2-\u00da\3\2\2\2/\u00dc\3\2\2\2\61\u00df\3\2\2\2"+
		"\63\u00e2\3\2\2\2\65\u00e4\3\2\2\2\67\u00e6\3\2\2\29\u00e9\3\2\2\2;\u00ec"+
		"\3\2\2\2=\u00ee\3\2\2\2?\u00f1\3\2\2\2A\u00f6\3\2\2\2C\u00ff\3\2\2\2E"+
		"\u0101\3\2\2\2GH\7n\2\2HI\7c\2\2IJ\7u\2\2JK\7v\2\2KL\7q\2\2LM\7t\2\2M"+
		"N\7t\2\2NO\7g\2\2OP\7u\2\2P\4\3\2\2\2QR\7t\2\2RS\7o\2\2ST\7z\2\2T\6\3"+
		"\2\2\2UV\7z\2\2VW\7k\2\2WX\7r\2\2XY\7g\2\2YZ\7v\2\2Z[\7k\2\2[\\\7c\2\2"+
		"\\]\7q\2\2]\b\3\2\2\2^_\7o\2\2_`\7c\2\2`a\7n\2\2ab\7x\2\2bc\7g\2\2cd\7"+
		"m\2\2de\7g\2\2e\n\3\2\2\2fg\7n\2\2gh\7c\2\2hi\7i\2\2ij\7n\2\2jk\7q\2\2"+
		"kl\7e\2\2lm\7m\2\2mo\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2q"+
		"r\3\2\2\2r\f\3\2\2\2st\7e\2\2tu\7q\2\2uv\7e\2\2vw\7j\2\2wx\7k\2\2xy\7"+
		"p\2\2yz\7c\2\2z{\7g\2\2{}\3\2\2\2|~\t\3\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084\3\2\2\2\u0081\u0083\t\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\16\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7n\2\2\u0089\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u0090\3\2\2\2\u008f\u0091\t\2\2"+
		"\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0098\7.\2\2\u0095\u0097\t\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\20\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7m\2\2\u009c\u009d"+
		"\7r\2\2\u009d\u009e\7c\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\u00a5\7c\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7o\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac\7w\2\2"+
		"\u00ac\26\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7"+
		"x\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3\7(\2\2\u00b3\32"+
		"\3\2\2\2\u00b4\u00b5\7~\2\2\u00b5\u00b6\7~\2\2\u00b6\34\3\2\2\2\u00b7"+
		"\u00b8\7-\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba \3\2\2\2\u00bb"+
		"\u00bc\7/\2\2\u00bc\"\3\2\2\2\u00bd\u00be\7,\2\2\u00be$\3\2\2\2\u00bf"+
		"\u00c0\7u\2\2\u00c0\u00c1\7x\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2"+
		"\u00c3\u00c4\7u\2\2\u00c4\u00c5\7m\2\2\u00c5\u00c6\7c\2\2\u00c6&\3\2\2"+
		"\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb"+
		"\7n\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7m\2\2\u00ce"+
		"\u00cf\7c\2\2\u00cf(\3\2\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7r\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7m\2\2"+
		"\u00d6\u00d7\7c\2\2\u00d7*\3\2\2\2\u00d8\u00d9\7*\2\2\u00d9,\3\2\2\2\u00da"+
		"\u00db\7+\2\2\u00db.\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7?\2\2\u00de"+
		"\60\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1\7?\2\2\u00e1\62\3\2\2\2\u00e2"+
		"\u00e3\7@\2\2\u00e3\64\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\66\3\2\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7\u00e8\7?\2\2\u00e88\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea"+
		"\u00eb\7?\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7}\2\2\u00ed<\3\2\2\2\u00ee\u00ef"+
		"\7\177\2\2\u00ef>\3\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4@\3\2\2\2"+
		"\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b!\2\2\u00fb"+
		"B\3\2\2\2\u00fc\u0100\5\13\6\2\u00fd\u0100\5\r\7\2\u00fe\u0100\5\17\b"+
		"\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100D"+
		"\3\2\2\2\u0101\u0102\t\5\2\2\u0102F\3\2\2\2\13\2q\177\u0084\u0092\u0098"+
		"\u00f3\u00f8\u00ff\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}