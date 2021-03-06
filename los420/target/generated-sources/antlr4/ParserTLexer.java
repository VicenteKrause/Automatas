// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, BEGIN=3, END=4, PRINT=5, SCAN=6, INT=7, STRING=8, FLOAT=9, 
		IF=10, ELSE=11, WHILE=12, FOR=13, AND=14, OR=15, SUM=16, DIV=17, RES=18, 
		MUL=19, SQRT=20, POW=21, COS=22, AP=23, CP=24, MENIG=25, MAYIG=26, MAY=27, 
		MEN=28, IG=29, DIF=30, AL=31, CL=32, NAME=33, WS=34, VARSTATMENT=35, BLANCO=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "BEGIN", "END", "PRINT", "SCAN", "INT", "STRING", "FLOAT", 
		"IF", "ELSE", "WHILE", "FOR", "AND", "OR", "SUM", "DIV", "RES", "MUL", 
		"SQRT", "POW", "COS", "AP", "CP", "MENIG", "MAYIG", "MAY", "MEN", "IG", 
		"DIF", "AL", "CL", "NAME", "WS", "VARSTATMENT", "BLANCO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'lastorres'", "'rmx'", "'xipetiao'", "'malveke'", 
		null, null, null, "'kpaha'", "'wasa'", "'dimetu'", "'luv'", "'&&'", "'||'", 
		"'+'", "'/'", "'-'", "'*'", "'svenska'", "'engleska'", "'spanska'", "'('", 
		"')'", "'<='", "'>='", "'>'", "'<'", "'=='", "'!='", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "BEGIN", "END", "PRINT", "SCAN", "INT", "STRING", "FLOAT", 
		"IF", "ELSE", "WHILE", "FOR", "AND", "OR", "SUM", "DIV", "RES", "MUL", 
		"SQRT", "POW", "COS", "AP", "CP", "MENIG", "MAYIG", "MAY", "MEN", "IG", 
		"DIF", "AL", "CL", "NAME", "WS", "VARSTATMENT", "BLANCO"
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


	public ParserTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"x\n\b\r\b\16\by\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0086\n\t"+
		"\r\t\16\t\u0087\3\t\7\t\u008b\n\t\f\t\16\t\u008e\13\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\6\n\u0099\n\n\r\n\16\n\u009a\3\n\3\n\7\n\u009f\n"+
		"\n\f\n\16\n\u00a2\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\6\"\u00fa\n\"\r\"\16\"\u00fb\3#\6#\u00ff\n#\r#\16#\u0100\3"+
		"#\3#\3$\3$\3$\5$\u0108\n$\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\3\2\62;\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\4\2\13\13\"\"\2\u0113\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2"+
		"\5M\3\2\2\2\7O\3\2\2\2\tY\3\2\2\2\13]\3\2\2\2\rf\3\2\2\2\17n\3\2\2\2\21"+
		"{\3\2\2\2\23\u008f\3\2\2\2\25\u00a3\3\2\2\2\27\u00a9\3\2\2\2\31\u00ae"+
		"\3\2\2\2\33\u00b5\3\2\2\2\35\u00b9\3\2\2\2\37\u00bc\3\2\2\2!\u00bf\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c7\3\2\2\2+\u00cf"+
		"\3\2\2\2-\u00d8\3\2\2\2/\u00e0\3\2\2\2\61\u00e2\3\2\2\2\63\u00e4\3\2\2"+
		"\2\65\u00e7\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C\u00f9\3\2\2\2E\u00fe\3\2\2\2G"+
		"\u0107\3\2\2\2I\u0109\3\2\2\2KL\7?\2\2L\4\3\2\2\2MN\7=\2\2N\6\3\2\2\2"+
		"OP\7n\2\2PQ\7c\2\2QR\7u\2\2RS\7v\2\2ST\7q\2\2TU\7t\2\2UV\7t\2\2VW\7g\2"+
		"\2WX\7u\2\2X\b\3\2\2\2YZ\7t\2\2Z[\7o\2\2[\\\7z\2\2\\\n\3\2\2\2]^\7z\2"+
		"\2^_\7k\2\2_`\7r\2\2`a\7g\2\2ab\7v\2\2bc\7k\2\2cd\7c\2\2de\7q\2\2e\f\3"+
		"\2\2\2fg\7o\2\2gh\7c\2\2hi\7n\2\2ij\7x\2\2jk\7g\2\2kl\7m\2\2lm\7g\2\2"+
		"m\16\3\2\2\2no\7n\2\2op\7c\2\2pq\7i\2\2qr\7n\2\2rs\7q\2\2st\7e\2\2tu\7"+
		"m\2\2uw\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\20"+
		"\3\2\2\2{|\7e\2\2|}\7q\2\2}~\7e\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7c\2\2\u0082\u0083\7g\2\2\u0083\u0085\3\2\2"+
		"\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2\2\2\u0089\u008b\t\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\22\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093\u0094\7u\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7k\2\2\u0096\u0098\3\2\2\2\u0097\u0099\t\2\2"+
		"\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\7.\2\2\u009d\u009f\t\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\24\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7m\2\2\u00a4\u00a5"+
		"\7r\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7j\2\2\u00a7\u00a8\7c\2\2\u00a8"+
		"\26\3\2\2\2\u00a9\u00aa\7y\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\30\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7o\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2"+
		"\u00b4\32\3\2\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7"+
		"x\2\2\u00b8\34\3\2\2\2\u00b9\u00ba\7(\2\2\u00ba\u00bb\7(\2\2\u00bb\36"+
		"\3\2\2\2\u00bc\u00bd\7~\2\2\u00bd\u00be\7~\2\2\u00be \3\2\2\2\u00bf\u00c0"+
		"\7-\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2$\3\2\2\2\u00c3\u00c4"+
		"\7/\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6(\3\2\2\2\u00c7\u00c8\7"+
		"u\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7u\2\2\u00cc\u00cd\7m\2\2\u00cd\u00ce\7c\2\2\u00ce*\3\2\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7i\2\2\u00d2\u00d3\7n\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5\u00d6\7m\2\2\u00d6\u00d7\7c\2\2"+
		"\u00d7,\3\2\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7c\2"+
		"\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7m\2\2\u00de\u00df"+
		"\7c\2\2\u00df.\3\2\2\2\u00e0\u00e1\7*\2\2\u00e1\60\3\2\2\2\u00e2\u00e3"+
		"\7+\2\2\u00e3\62\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6\7?\2\2\u00e6\64"+
		"\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8\u00e9\7?\2\2\u00e9\66\3\2\2\2\u00ea"+
		"\u00eb\7@\2\2\u00eb8\3\2\2\2\u00ec\u00ed\7>\2\2\u00ed:\3\2\2\2\u00ee\u00ef"+
		"\7?\2\2\u00ef\u00f0\7?\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7#\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7}\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7"+
		"\177\2\2\u00f7B\3\2\2\2\u00f8\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcD\3\2\2\2"+
		"\u00fd\u00ff\t\4\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b#\2\2\u0103"+
		"F\3\2\2\2\u0104\u0108\5\17\b\2\u0105\u0108\5\21\t\2\u0106\u0108\5\23\n"+
		"\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108H"+
		"\3\2\2\2\u0109\u010a\t\5\2\2\u010aJ\3\2\2\2\13\2y\u0087\u008c\u009a\u00a0"+
		"\u00fb\u0100\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}