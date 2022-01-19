// Generated from C:\Users\mati8\Desktop\Semestr5\MIAK\Colang\ColangCompiler\resources\Coolang.g4 by ANTLR 4.9.3

package me.miak.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUN=1, CONST=2, MUTABLE=3, VAR=4, OR=5, AND=6, EQ=7, NEQ=8, GT=9, LT=10, 
		GTEQ=11, LTEQ=12, PLUS=13, MINUS=14, MULT=15, DIV=16, POW=17, NOT=18, 
		HASH=19, AMP=20, INT_TYPE=21, BOOL_TYPE=22, VOID_TYPE=23, TO=24, BY=25, 
		THROUGH=26, COL=27, SCOL=28, ASSIGN=29, OPAR=30, CPAR=31, OBRACE=32, CBRACE=33, 
		OSQR=34, CSQR=35, DQUOTE=36, ARROW=37, COMMA=38, RETURN=39, FOR=40, IN=41, 
		IF=42, ELIF=43, ELSE=44, WHILE=45, TRUE=46, FALSE=47, PRINT=48, ID=49, 
		INT=50, FLOAT=51, STRING=52, COMMENT=53, SPACE=54, OTHER=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUN", "CONST", "MUTABLE", "VAR", "OR", "AND", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "HASH", 
			"AMP", "INT_TYPE", "BOOL_TYPE", "VOID_TYPE", "TO", "BY", "THROUGH", "COL", 
			"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQR", "CSQR", 
			"DQUOTE", "ARROW", "COMMA", "RETURN", "FOR", "IN", "IF", "ELIF", "ELSE", 
			"WHILE", "TRUE", "FALSE", "PRINT", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
			"SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'fun'", "'const'", "'mut'", "'let'", "'or'", "'and'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'not'", "'#'", "'&'", "'int'", "'bool'", "'void'", "'to'", "'by'", "'::'", 
			"':'", "';'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "'\"'", 
			"'->'", "','", "'ret'", "'for'", "'in'", "'if'", "'elif'", "'else'", 
			"'while'", "'true'", "'false'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUN", "CONST", "MUTABLE", "VAR", "OR", "AND", "EQ", "NEQ", "GT", 
			"LT", "GTEQ", "LTEQ", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "HASH", 
			"AMP", "INT_TYPE", "BOOL_TYPE", "VOID_TYPE", "TO", "BY", "THROUGH", "COL", 
			"SCOL", "ASSIGN", "OPAR", "CPAR", "OBRACE", "CBRACE", "OSQR", "CSQR", 
			"DQUOTE", "ARROW", "COMMA", "RETURN", "FOR", "IN", "IF", "ELIF", "ELSE", 
			"WHILE", "TRUE", "FALSE", "PRINT", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
			"SPACE", "OTHER"
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


	public CoolangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Coolang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0147\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\7\62\u010e\n\62\f\62"+
		"\16\62\u0111\13\62\3\63\6\63\u0114\n\63\r\63\16\63\u0115\3\64\6\64\u0119"+
		"\n\64\r\64\16\64\u011a\3\64\3\64\7\64\u011f\n\64\f\64\16\64\u0122\13\64"+
		"\3\64\3\64\6\64\u0126\n\64\r\64\16\64\u0127\5\64\u012a\n\64\3\65\3\65"+
		"\3\65\3\65\7\65\u0130\n\65\f\65\16\65\u0133\13\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\7\66\u013b\n\66\f\66\16\66\u013e\13\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17"+
		"\17$$\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2"+
		"\5u\3\2\2\2\7{\3\2\2\2\t\177\3\2\2\2\13\u0083\3\2\2\2\r\u0086\3\2\2\2"+
		"\17\u008a\3\2\2\2\21\u008d\3\2\2\2\23\u0090\3\2\2\2\25\u0092\3\2\2\2\27"+
		"\u0094\3\2\2\2\31\u0097\3\2\2\2\33\u009a\3\2\2\2\35\u009c\3\2\2\2\37\u009e"+
		"\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4\3\2\2\2\'\u00a8\3\2\2\2"+
		")\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00b0\3\2\2\2/\u00b5\3\2\2\2\61\u00ba"+
		"\3\2\2\2\63\u00bd\3\2\2\2\65\u00c0\3\2\2\2\67\u00c3\3\2\2\29\u00c5\3\2"+
		"\2\2;\u00c7\3\2\2\2=\u00c9\3\2\2\2?\u00cb\3\2\2\2A\u00cd\3\2\2\2C\u00cf"+
		"\3\2\2\2E\u00d1\3\2\2\2G\u00d3\3\2\2\2I\u00d5\3\2\2\2K\u00d7\3\2\2\2M"+
		"\u00da\3\2\2\2O\u00dc\3\2\2\2Q\u00e0\3\2\2\2S\u00e4\3\2\2\2U\u00e7\3\2"+
		"\2\2W\u00ea\3\2\2\2Y\u00ef\3\2\2\2[\u00f4\3\2\2\2]\u00fa\3\2\2\2_\u00ff"+
		"\3\2\2\2a\u0105\3\2\2\2c\u010b\3\2\2\2e\u0113\3\2\2\2g\u0129\3\2\2\2i"+
		"\u012b\3\2\2\2k\u0136\3\2\2\2m\u0141\3\2\2\2o\u0145\3\2\2\2qr\7h\2\2r"+
		"s\7w\2\2st\7p\2\2t\4\3\2\2\2uv\7e\2\2vw\7q\2\2wx\7p\2\2xy\7u\2\2yz\7v"+
		"\2\2z\6\3\2\2\2{|\7o\2\2|}\7w\2\2}~\7v\2\2~\b\3\2\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2\u0082\n\3\2\2\2\u0083\u0084\7q"+
		"\2\2\u0084\u0085\7t\2\2\u0085\f\3\2\2\2\u0086\u0087\7c\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7f\2\2\u0089\16\3\2\2\2\u008a\u008b\7?\2\2\u008b\u008c"+
		"\7?\2\2\u008c\20\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7?\2\2\u008f\22"+
		"\3\2\2\2\u0090\u0091\7@\2\2\u0091\24\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7@\2\2\u0095\u0096\7?\2\2\u0096\30\3\2\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099\32\3\2\2\2\u009a\u009b\7-\2\2\u009b"+
		"\34\3\2\2\2\u009c\u009d\7/\2\2\u009d\36\3\2\2\2\u009e\u009f\7,\2\2\u009f"+
		" \3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7`\2\2\u00a3"+
		"$\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\7%\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7(\2\2\u00ab*"+
		"\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af"+
		",\3\2\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7q\2\2\u00b3"+
		"\u00b4\7n\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7f\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7q\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7{\2\2\u00bf"+
		"\64\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2\7<\2\2\u00c2\66\3\2\2\2\u00c3"+
		"\u00c4\7<\2\2\u00c48\3\2\2\2\u00c5\u00c6\7=\2\2\u00c6:\3\2\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8<\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca>\3\2\2\2\u00cb\u00cc\7"+
		"+\2\2\u00cc@\3\2\2\2\u00cd\u00ce\7}\2\2\u00ceB\3\2\2\2\u00cf\u00d0\7\177"+
		"\2\2\u00d0D\3\2\2\2\u00d1\u00d2\7]\2\2\u00d2F\3\2\2\2\u00d3\u00d4\7_\2"+
		"\2\u00d4H\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6J\3\2\2\2\u00d7\u00d8\7/\2\2"+
		"\u00d8\u00d9\7@\2\2\u00d9L\3\2\2\2\u00da\u00db\7.\2\2\u00dbN\3\2\2\2\u00dc"+
		"\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7v\2\2\u00dfP\3\2\2\2\u00e0"+
		"\u00e1\7h\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3R\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6T\3\2\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7h\2\2\u00e9V\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7h\2\2\u00eeX\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7n\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3Z\3\2\2\2\u00f4"+
		"\u00f5\7y\2\2\u00f5\u00f6\7j\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7n\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9\\\3\2\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7t"+
		"\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7g\2\2\u00fe^\3\2\2\2\u00ff\u0100"+
		"\7h\2\2\u0100\u0101\7c\2\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103"+
		"\u0104\7g\2\2\u0104`\3\2\2\2\u0105\u0106\7r\2\2\u0106\u0107\7t\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010ab\3\2\2\2\u010b"+
		"\u010f\t\2\2\2\u010c\u010e\t\3\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110d\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0114\t\4\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116f\3\2\2\2\u0117\u0119\t\4\2\2"+
		"\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120\7\60\2\2\u011d\u011f\t\4\2\2"+
		"\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u012a\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\7\60\2\2"+
		"\u0124\u0126\t\4\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0118\3\2\2\2\u0129"+
		"\u0123\3\2\2\2\u012ah\3\2\2\2\u012b\u0131\5I%\2\u012c\u0130\n\5\2\2\u012d"+
		"\u012e\7$\2\2\u012e\u0130\7$\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134"+
		"\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5I%\2\u0135j\3\2\2\2\u0136\u0137"+
		"\7\61\2\2\u0137\u0138\7\61\2\2\u0138\u013c\3\2\2\2\u0139\u013b\n\6\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\66\2\2"+
		"\u0140l\3\2\2\2\u0141\u0142\t\7\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b"+
		"\67\2\2\u0144n\3\2\2\2\u0145\u0146\13\2\2\2\u0146p\3\2\2\2\f\2\u010f\u0115"+
		"\u011a\u0120\u0127\u0129\u012f\u0131\u013c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}