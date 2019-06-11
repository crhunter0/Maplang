// Generated from Maplang.g4 by ANTLR 4.7.2
package com.github.crhunter.maplang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaplangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND", "COMPUTE", "END_COMPUTE", "OR", "IF", "END_IF", "ELSE", "MOVE", 
			"THEN", "TO", "CONCAT", "AS", "NOT", "POS", "THRU", "EQUALCHAR", "NOTEQUAL", 
			"GREATERTHAN", "LESSTHAN", "GREATEREQUAL", "LESSEQUAL", "PLUSCHAR", "MINUSCHAR", 
			"ASTERISK", "DOUBLEASTERISK", "SLASHCHAR", "LEFTPAREN", "RIGHTPAREN", 
			"DOT", "STRINGLITERAL", "INTEGERLITERAL", "NUMERICLITERAL", "IDENTIFIER", 
			"NEWLINE", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z"
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


	public MaplangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Maplang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\7\37\u00f1\n\37\f\37\16\37\u00f4\13"+
		"\37\3\37\3\37\3\37\3\37\5\37\u00fa\n\37\3 \3 \5 \u00fe\n \3 \6 \u0101"+
		"\n \r \16 \u0102\3!\3!\5!\u0107\n!\3!\7!\u010a\n!\f!\16!\u010d\13!\3!"+
		"\3!\6!\u0111\n!\r!\16!\u0112\3\"\6\"\u0116\n\"\r\"\16\"\u0117\3\"\6\""+
		"\u011b\n\"\r\"\16\"\u011c\3\"\6\"\u0120\n\"\r\"\16\"\u0121\7\"\u0124\n"+
		"\"\f\"\16\"\u0127\13\"\3#\5#\u012a\n#\3#\3#\3#\3#\3$\6$\u0131\n$\r$\16"+
		"$\u0132\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-"+
		"\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\2\2"+
		"?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2"+
		"o\2q\2s\2u\2w\2y\2{\2\3\2\"\5\2\f\f\17\17$$\5\2\f\f\17\17))\3\2\62;\5"+
		"\2\62;C\\c|\4\2//aa\6\2\13\13\16\16\"\"==\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u015f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3}\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0089\3\2\2\2\t\u0095\3\2\2\2\13\u0098\3\2\2\2\r\u009b\3\2"+
		"\2\2\17\u00a2\3\2\2\2\21\u00a7\3\2\2\2\23\u00ac\3\2\2\2\25\u00b1\3\2\2"+
		"\2\27\u00b4\3\2\2\2\31\u00bb\3\2\2\2\33\u00be\3\2\2\2\35\u00c2\3\2\2\2"+
		"\37\u00c6\3\2\2\2!\u00cb\3\2\2\2#\u00d1\3\2\2\2%\u00d3\3\2\2\2\'\u00d5"+
		"\3\2\2\2)\u00d7\3\2\2\2+\u00da\3\2\2\2-\u00dd\3\2\2\2/\u00df\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00e3\3\2\2\2\65\u00e6\3\2\2\2\67\u00e8\3\2\2\29\u00ea"+
		"\3\2\2\2;\u00ec\3\2\2\2=\u00f9\3\2\2\2?\u00fd\3\2\2\2A\u0106\3\2\2\2C"+
		"\u0115\3\2\2\2E\u0129\3\2\2\2G\u0130\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2"+
		"\2\2M\u013a\3\2\2\2O\u013c\3\2\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0142"+
		"\3\2\2\2W\u0144\3\2\2\2Y\u0146\3\2\2\2[\u0148\3\2\2\2]\u014a\3\2\2\2_"+
		"\u014c\3\2\2\2a\u014e\3\2\2\2c\u0150\3\2\2\2e\u0152\3\2\2\2g\u0154\3\2"+
		"\2\2i\u0156\3\2\2\2k\u0158\3\2\2\2m\u015a\3\2\2\2o\u015c\3\2\2\2q\u015e"+
		"\3\2\2\2s\u0160\3\2\2\2u\u0162\3\2\2\2w\u0164\3\2\2\2y\u0166\3\2\2\2{"+
		"\u0168\3\2\2\2}~\5I%\2~\177\5c\62\2\177\u0080\5O(\2\u0080\4\3\2\2\2\u0081"+
		"\u0082\5M\'\2\u0082\u0083\5e\63\2\u0083\u0084\5a\61\2\u0084\u0085\5g\64"+
		"\2\u0085\u0086\5q9\2\u0086\u0087\5o8\2\u0087\u0088\5Q)\2\u0088\6\3\2\2"+
		"\2\u0089\u008a\5Q)\2\u008a\u008b\5c\62\2\u008b\u008c\5O(\2\u008c\u008d"+
		"\5/\30\2\u008d\u008e\5M\'\2\u008e\u008f\5e\63\2\u008f\u0090\5a\61\2\u0090"+
		"\u0091\5g\64\2\u0091\u0092\5q9\2\u0092\u0093\5o8\2\u0093\u0094\5Q)\2\u0094"+
		"\b\3\2\2\2\u0095\u0096\5e\63\2\u0096\u0097\5k\66\2\u0097\n\3\2\2\2\u0098"+
		"\u0099\5Y-\2\u0099\u009a\5S*\2\u009a\f\3\2\2\2\u009b\u009c\5Q)\2\u009c"+
		"\u009d\5c\62\2\u009d\u009e\5O(\2\u009e\u009f\5/\30\2\u009f\u00a0\5Y-\2"+
		"\u00a0\u00a1\5S*\2\u00a1\16\3\2\2\2\u00a2\u00a3\5Q)\2\u00a3\u00a4\5_\60"+
		"\2\u00a4\u00a5\5m\67\2\u00a5\u00a6\5Q)\2\u00a6\20\3\2\2\2\u00a7\u00a8"+
		"\5a\61\2\u00a8\u00a9\5e\63\2\u00a9\u00aa\5s:\2\u00aa\u00ab\5Q)\2\u00ab"+
		"\22\3\2\2\2\u00ac\u00ad\5o8\2\u00ad\u00ae\5W,\2\u00ae\u00af\5Q)\2\u00af"+
		"\u00b0\5c\62\2\u00b0\24\3\2\2\2\u00b1\u00b2\5o8\2\u00b2\u00b3\5e\63\2"+
		"\u00b3\26\3\2\2\2\u00b4\u00b5\5M\'\2\u00b5\u00b6\5e\63\2\u00b6\u00b7\5"+
		"c\62\2\u00b7\u00b8\5M\'\2\u00b8\u00b9\5I%\2\u00b9\u00ba\5o8\2\u00ba\30"+
		"\3\2\2\2\u00bb\u00bc\5I%\2\u00bc\u00bd\5m\67\2\u00bd\32\3\2\2\2\u00be"+
		"\u00bf\5c\62\2\u00bf\u00c0\5e\63\2\u00c0\u00c1\5o8\2\u00c1\34\3\2\2\2"+
		"\u00c2\u00c3\5g\64\2\u00c3\u00c4\5e\63\2\u00c4\u00c5\5m\67\2\u00c5\36"+
		"\3\2\2\2\u00c6\u00c7\5o8\2\u00c7\u00c8\5W,\2\u00c8\u00c9\5k\66\2\u00c9"+
		"\u00ca\5q9\2\u00ca \3\2\2\2\u00cb\u00cc\7?\2\2\u00cc\"\3\2\2\2\u00cd\u00ce"+
		"\7>\2\2\u00ce\u00d2\7@\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d2\7?\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7@\2\2\u00d4"+
		"&\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6(\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9"+
		"\7?\2\2\u00d9*\3\2\2\2\u00da\u00db\7>\2\2\u00db\u00dc\7?\2\2\u00dc,\3"+
		"\2\2\2\u00dd\u00de\7-\2\2\u00de.\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\60\3"+
		"\2\2\2\u00e1\u00e2\7,\2\2\u00e2\62\3\2\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5"+
		"\7,\2\2\u00e5\64\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\66\3\2\2\2\u00e8\u00e9"+
		"\7*\2\2\u00e98\3\2\2\2\u00ea\u00eb\7+\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7"+
		"\60\2\2\u00ed<\3\2\2\2\u00ee\u00f2\7$\2\2\u00ef\u00f1\n\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa\7$\2\2\u00f6\u00f7\7)\2"+
		"\2\u00f7\u00f8\n\3\2\2\u00f8\u00fa\7)\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00fa>\3\2\2\2\u00fb\u00fe\5-\27\2\u00fc\u00fe\5/\30\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u0101\t\4\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103@\3\2\2\2\u0104\u0107\5-\27\2"+
		"\u0105\u0107\5/\30\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u010b\3\2\2\2\u0108\u010a\t\4\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0110\5;\36\2\u010f\u0111\t\4\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113B\3\2\2\2\u0114\u0116\t\5\2\2\u0115\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0125\3\2\2\2\u0119"+
		"\u011b\t\6\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\t\5\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011a\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126D\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0128\u012a\7\17\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\7\f\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b#\2\2\u012e"+
		"F\3\2\2\2\u012f\u0131\t\7\2\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\b$\2\2\u0135H\3\2\2\2\u0136\u0137\t\b\2\2\u0137J\3\2\2\2\u0138\u0139"+
		"\t\t\2\2\u0139L\3\2\2\2\u013a\u013b\t\n\2\2\u013bN\3\2\2\2\u013c\u013d"+
		"\t\13\2\2\u013dP\3\2\2\2\u013e\u013f\t\f\2\2\u013fR\3\2\2\2\u0140\u0141"+
		"\t\r\2\2\u0141T\3\2\2\2\u0142\u0143\t\16\2\2\u0143V\3\2\2\2\u0144\u0145"+
		"\t\17\2\2\u0145X\3\2\2\2\u0146\u0147\t\20\2\2\u0147Z\3\2\2\2\u0148\u0149"+
		"\t\21\2\2\u0149\\\3\2\2\2\u014a\u014b\t\22\2\2\u014b^\3\2\2\2\u014c\u014d"+
		"\t\23\2\2\u014d`\3\2\2\2\u014e\u014f\t\24\2\2\u014fb\3\2\2\2\u0150\u0151"+
		"\t\25\2\2\u0151d\3\2\2\2\u0152\u0153\t\26\2\2\u0153f\3\2\2\2\u0154\u0155"+
		"\t\27\2\2\u0155h\3\2\2\2\u0156\u0157\t\30\2\2\u0157j\3\2\2\2\u0158\u0159"+
		"\t\31\2\2\u0159l\3\2\2\2\u015a\u015b\t\32\2\2\u015bn\3\2\2\2\u015c\u015d"+
		"\t\33\2\2\u015dp\3\2\2\2\u015e\u015f\t\34\2\2\u015fr\3\2\2\2\u0160\u0161"+
		"\t\35\2\2\u0161t\3\2\2\2\u0162\u0163\t\36\2\2\u0163v\3\2\2\2\u0164\u0165"+
		"\t\37\2\2\u0165x\3\2\2\2\u0166\u0167\t \2\2\u0167z\3\2\2\2\u0168\u0169"+
		"\t!\2\2\u0169|\3\2\2\2\21\2\u00d1\u00f2\u00f9\u00fd\u0102\u0106\u010b"+
		"\u0112\u0117\u011c\u0121\u0125\u0129\u0132\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}