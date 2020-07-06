// Generated from D:/AntlrLeanDemo/src/main/java\MysqlQuery.g4 by ANTLR 4.8
package mysql.lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MysqlQueryLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AS=9, 
		SELECT=10, FROM=11, TABLE=12, MAX=13, SUM=14, AVG=15, MIN=16, COUNT=17, 
		ALL=18, DISTINCT=19, WHERE=20, GROUP=21, BY=22, ORDER=23, HAVING=24, NOT=25, 
		IS=26, TRUE=27, FALSE=28, UNKNOWN=29, BETWEEN=30, AND=31, IN=32, NULL=33, 
		OR=34, ASC=35, DESC=36, LIMIT=37, OFFSET=38, LOGICAL_AND_OPERATOR=39, 
		LOGICAL_OR_OPERATOR=40, ID=41, TEXT_STRING=42, ID_LITERAL=43, REVERSE_QUOTE_ID=44, 
		DECIMAL_LITERAL=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AS", 
			"SELECT", "FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", "ALL", 
			"DISTINCT", "WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", "IS", "TRUE", 
			"FALSE", "UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", "ASC", "DESC", 
			"LIMIT", "OFFSET", "LOGICAL_AND_OPERATOR", "LOGICAL_OR_OPERATOR", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "HEX_DIGIT", "DEC_DIGIT", 
			"LETTER", "ID", "TEXT_STRING", "ID_LITERAL", "REVERSE_QUOTE_ID", "DECIMAL_LITERAL", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'('", "')'", "'='", "'>'", "'<'", "'!'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AS", "SELECT", 
			"FROM", "TABLE", "MAX", "SUM", "AVG", "MIN", "COUNT", "ALL", "DISTINCT", 
			"WHERE", "GROUP", "BY", "ORDER", "HAVING", "NOT", "IS", "TRUE", "FALSE", 
			"UNKNOWN", "BETWEEN", "AND", "IN", "NULL", "OR", "ASC", "DESC", "LIMIT", 
			"OFFSET", "LOGICAL_AND_OPERATOR", "LOGICAL_OR_OPERATOR", "ID", "TEXT_STRING", 
			"ID_LITERAL", "REVERSE_QUOTE_ID", "DECIMAL_LITERAL", "WS"
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


	public MysqlQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MysqlQuery.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\7G\u0187\nG\fG\16G\u018a\13G\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\7H\u0194\nH\fH\16H\u0197\13H\3H\3H\3I\3I\3I\5I\u019e"+
		"\nI\3I\3I\3I\7I\u01a3\nI\fI\16I\u01a6\13I\5I\u01a8\nI\3J\3J\6J\u01ac\n"+
		"J\rJ\16J\u01ad\3J\3J\3K\6K\u01b3\nK\rK\16K\u01b4\3L\6L\u01b8\nL\rL\16"+
		"L\u01b9\3L\3L\2\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c"+
		"\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d+\u008f,\u0091-\u0093.\u0095/\u0097\60"+
		"\3\2%\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj"+
		"\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2S"+
		"Sss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\4\2\62;CH\3\2\62;\4\2C\\c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\3\2"+
		"))\4\2BBaa\3\2bb\5\2\13\f\17\17\"\"\2\u01ac\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\3\u0099\3\2\2"+
		"\2\5\u009b\3\2\2\2\7\u009d\3\2\2\2\t\u009f\3\2\2\2\13\u00a1\3\2\2\2\r"+
		"\u00a3\3\2\2\2\17\u00a5\3\2\2\2\21\u00a7\3\2\2\2\23\u00a9\3\2\2\2\25\u00ac"+
		"\3\2\2\2\27\u00b3\3\2\2\2\31\u00b8\3\2\2\2\33\u00be\3\2\2\2\35\u00c2\3"+
		"\2\2\2\37\u00c6\3\2\2\2!\u00ca\3\2\2\2#\u00ce\3\2\2\2%\u00d4\3\2\2\2\'"+
		"\u00d8\3\2\2\2)\u00e1\3\2\2\2+\u00e7\3\2\2\2-\u00ed\3\2\2\2/\u00f0\3\2"+
		"\2\2\61\u00f6\3\2\2\2\63\u00fd\3\2\2\2\65\u0101\3\2\2\2\67\u0104\3\2\2"+
		"\29\u0109\3\2\2\2;\u010f\3\2\2\2=\u0117\3\2\2\2?\u011f\3\2\2\2A\u0123"+
		"\3\2\2\2C\u0126\3\2\2\2E\u012b\3\2\2\2G\u012e\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0137\3\2\2\2M\u013d\3\2\2\2O\u0144\3\2\2\2Q\u0147\3\2\2\2S\u014a\3\2"+
		"\2\2U\u014c\3\2\2\2W\u014e\3\2\2\2Y\u0150\3\2\2\2[\u0152\3\2\2\2]\u0154"+
		"\3\2\2\2_\u0156\3\2\2\2a\u0158\3\2\2\2c\u015a\3\2\2\2e\u015c\3\2\2\2g"+
		"\u015e\3\2\2\2i\u0160\3\2\2\2k\u0162\3\2\2\2m\u0164\3\2\2\2o\u0166\3\2"+
		"\2\2q\u0168\3\2\2\2s\u016a\3\2\2\2u\u016c\3\2\2\2w\u016e\3\2\2\2y\u0170"+
		"\3\2\2\2{\u0172\3\2\2\2}\u0174\3\2\2\2\177\u0176\3\2\2\2\u0081\u0178\3"+
		"\2\2\2\u0083\u017a\3\2\2\2\u0085\u017c\3\2\2\2\u0087\u017e\3\2\2\2\u0089"+
		"\u0180\3\2\2\2\u008b\u0182\3\2\2\2\u008d\u0184\3\2\2\2\u008f\u018b\3\2"+
		"\2\2\u0091\u01a7\3\2\2\2\u0093\u01a9\3\2\2\2\u0095\u01b2\3\2\2\2\u0097"+
		"\u01b7\3\2\2\2\u0099\u009a\7,\2\2\u009a\4\3\2\2\2\u009b\u009c\7.\2\2\u009c"+
		"\6\3\2\2\2\u009d\u009e\7*\2\2\u009e\b\3\2\2\2\u009f\u00a0\7+\2\2\u00a0"+
		"\n\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\f\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\16\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\22\3\2\2\2\u00a9\u00aa\5S*\2\u00aa\u00ab\5w<\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\5w<\2\u00ad\u00ae\5[.\2\u00ae\u00af\5i\65\2\u00af\u00b0\5[.\2\u00b0"+
		"\u00b1\5W,\2\u00b1\u00b2\5y=\2\u00b2\26\3\2\2\2\u00b3\u00b4\5]/\2\u00b4"+
		"\u00b5\5u;\2\u00b5\u00b6\5o8\2\u00b6\u00b7\5k\66\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\5y=\2\u00b9\u00ba\5S*\2\u00ba\u00bb\5U+\2\u00bb\u00bc\5i\65\2\u00bc"+
		"\u00bd\5[.\2\u00bd\32\3\2\2\2\u00be\u00bf\5k\66\2\u00bf\u00c0\5S*\2\u00c0"+
		"\u00c1\5\u0081A\2\u00c1\34\3\2\2\2\u00c2\u00c3\5w<\2\u00c3\u00c4\5{>\2"+
		"\u00c4\u00c5\5k\66\2\u00c5\36\3\2\2\2\u00c6\u00c7\5S*\2\u00c7\u00c8\5"+
		"}?\2\u00c8\u00c9\5_\60\2\u00c9 \3\2\2\2\u00ca\u00cb\5k\66\2\u00cb\u00cc"+
		"\5c\62\2\u00cc\u00cd\5m\67\2\u00cd\"\3\2\2\2\u00ce\u00cf\5W,\2\u00cf\u00d0"+
		"\5o8\2\u00d0\u00d1\5{>\2\u00d1\u00d2\5m\67\2\u00d2\u00d3\5y=\2\u00d3$"+
		"\3\2\2\2\u00d4\u00d5\5S*\2\u00d5\u00d6\5i\65\2\u00d6\u00d7\5i\65\2\u00d7"+
		"&\3\2\2\2\u00d8\u00d9\5Y-\2\u00d9\u00da\5c\62\2\u00da\u00db\5w<\2\u00db"+
		"\u00dc\5y=\2\u00dc\u00dd\5c\62\2\u00dd\u00de\5m\67\2\u00de\u00df\5W,\2"+
		"\u00df\u00e0\5y=\2\u00e0(\3\2\2\2\u00e1\u00e2\5\177@\2\u00e2\u00e3\5a"+
		"\61\2\u00e3\u00e4\5[.\2\u00e4\u00e5\5u;\2\u00e5\u00e6\5[.\2\u00e6*\3\2"+
		"\2\2\u00e7\u00e8\5_\60\2\u00e8\u00e9\5u;\2\u00e9\u00ea\5o8\2\u00ea\u00eb"+
		"\5{>\2\u00eb\u00ec\5q9\2\u00ec,\3\2\2\2\u00ed\u00ee\5U+\2\u00ee\u00ef"+
		"\5\u0083B\2\u00ef.\3\2\2\2\u00f0\u00f1\5o8\2\u00f1\u00f2\5u;\2\u00f2\u00f3"+
		"\5Y-\2\u00f3\u00f4\5[.\2\u00f4\u00f5\5u;\2\u00f5\60\3\2\2\2\u00f6\u00f7"+
		"\5a\61\2\u00f7\u00f8\5S*\2\u00f8\u00f9\5}?\2\u00f9\u00fa\5c\62\2\u00fa"+
		"\u00fb\5m\67\2\u00fb\u00fc\5_\60\2\u00fc\62\3\2\2\2\u00fd\u00fe\5m\67"+
		"\2\u00fe\u00ff\5o8\2\u00ff\u0100\5y=\2\u0100\64\3\2\2\2\u0101\u0102\5"+
		"c\62\2\u0102\u0103\5w<\2\u0103\66\3\2\2\2\u0104\u0105\5y=\2\u0105\u0106"+
		"\5u;\2\u0106\u0107\5{>\2\u0107\u0108\5[.\2\u01088\3\2\2\2\u0109\u010a"+
		"\5]/\2\u010a\u010b\5S*\2\u010b\u010c\5i\65\2\u010c\u010d\5w<\2\u010d\u010e"+
		"\5[.\2\u010e:\3\2\2\2\u010f\u0110\5{>\2\u0110\u0111\5m\67\2\u0111\u0112"+
		"\5g\64\2\u0112\u0113\5m\67\2\u0113\u0114\5o8\2\u0114\u0115\5\177@\2\u0115"+
		"\u0116\5m\67\2\u0116<\3\2\2\2\u0117\u0118\5U+\2\u0118\u0119\5[.\2\u0119"+
		"\u011a\5y=\2\u011a\u011b\5\177@\2\u011b\u011c\5[.\2\u011c\u011d\5[.\2"+
		"\u011d\u011e\5m\67\2\u011e>\3\2\2\2\u011f\u0120\5S*\2\u0120\u0121\5m\67"+
		"\2\u0121\u0122\5Y-\2\u0122@\3\2\2\2\u0123\u0124\5c\62\2\u0124\u0125\5"+
		"m\67\2\u0125B\3\2\2\2\u0126\u0127\5m\67\2\u0127\u0128\5{>\2\u0128\u0129"+
		"\5i\65\2\u0129\u012a\5i\65\2\u012aD\3\2\2\2\u012b\u012c\5o8\2\u012c\u012d"+
		"\5u;\2\u012dF\3\2\2\2\u012e\u012f\5S*\2\u012f\u0130\5w<\2\u0130\u0131"+
		"\5W,\2\u0131H\3\2\2\2\u0132\u0133\5Y-\2\u0133\u0134\5[.\2\u0134\u0135"+
		"\5w<\2\u0135\u0136\5W,\2\u0136J\3\2\2\2\u0137\u0138\5i\65\2\u0138\u0139"+
		"\5c\62\2\u0139\u013a\5k\66\2\u013a\u013b\5c\62\2\u013b\u013c\5y=\2\u013c"+
		"L\3\2\2\2\u013d\u013e\5o8\2\u013e\u013f\5]/\2\u013f\u0140\5]/\2\u0140"+
		"\u0141\5w<\2\u0141\u0142\5[.\2\u0142\u0143\5y=\2\u0143N\3\2\2\2\u0144"+
		"\u0145\7(\2\2\u0145\u0146\7(\2\2\u0146P\3\2\2\2\u0147\u0148\7~\2\2\u0148"+
		"\u0149\7~\2\2\u0149R\3\2\2\2\u014a\u014b\t\2\2\2\u014bT\3\2\2\2\u014c"+
		"\u014d\t\3\2\2\u014dV\3\2\2\2\u014e\u014f\t\4\2\2\u014fX\3\2\2\2\u0150"+
		"\u0151\t\5\2\2\u0151Z\3\2\2\2\u0152\u0153\t\6\2\2\u0153\\\3\2\2\2\u0154"+
		"\u0155\t\7\2\2\u0155^\3\2\2\2\u0156\u0157\t\b\2\2\u0157`\3\2\2\2\u0158"+
		"\u0159\t\t\2\2\u0159b\3\2\2\2\u015a\u015b\t\n\2\2\u015bd\3\2\2\2\u015c"+
		"\u015d\t\13\2\2\u015df\3\2\2\2\u015e\u015f\t\f\2\2\u015fh\3\2\2\2\u0160"+
		"\u0161\t\r\2\2\u0161j\3\2\2\2\u0162\u0163\t\16\2\2\u0163l\3\2\2\2\u0164"+
		"\u0165\t\17\2\2\u0165n\3\2\2\2\u0166\u0167\t\20\2\2\u0167p\3\2\2\2\u0168"+
		"\u0169\t\21\2\2\u0169r\3\2\2\2\u016a\u016b\t\22\2\2\u016bt\3\2\2\2\u016c"+
		"\u016d\t\23\2\2\u016dv\3\2\2\2\u016e\u016f\t\24\2\2\u016fx\3\2\2\2\u0170"+
		"\u0171\t\25\2\2\u0171z\3\2\2\2\u0172\u0173\t\26\2\2\u0173|\3\2\2\2\u0174"+
		"\u0175\t\27\2\2\u0175~\3\2\2\2\u0176\u0177\t\30\2\2\u0177\u0080\3\2\2"+
		"\2\u0178\u0179\t\31\2\2\u0179\u0082\3\2\2\2\u017a\u017b\t\32\2\2\u017b"+
		"\u0084\3\2\2\2\u017c\u017d\t\33\2\2\u017d\u0086\3\2\2\2\u017e\u017f\t"+
		"\34\2\2\u017f\u0088\3\2\2\2\u0180\u0181\t\35\2\2\u0181\u008a\3\2\2\2\u0182"+
		"\u0183\t\36\2\2\u0183\u008c\3\2\2\2\u0184\u0188\t\37\2\2\u0185\u0187\t"+
		" \2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u008e\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0195\7)"+
		"\2\2\u018c\u018d\7^\2\2\u018d\u0194\7^\2\2\u018e\u018f\7)\2\2\u018f\u0194"+
		"\7)\2\2\u0190\u0191\7^\2\2\u0191\u0194\7)\2\2\u0192\u0194\n!\2\2\u0193"+
		"\u018c\3\2\2\2\u0193\u018e\3\2\2\2\u0193\u0190\3\2\2\2\u0193\u0192\3\2"+
		"\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7)\2\2\u0199\u0090\3\2"+
		"\2\2\u019a\u01a8\7,\2\2\u019b\u019e\t\"\2\2\u019c\u019e\5\u008bF\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u01a4\3\2\2\2\u019f\u01a3\5\u008b"+
		"F\2\u01a0\u01a3\5\u0089E\2\u01a1\u01a3\7a\2\2\u01a2\u019f\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u019a\3\2\2\2\u01a7\u019d\3\2\2\2\u01a8\u0092\3\2\2\2\u01a9\u01ab\7b"+
		"\2\2\u01aa\u01ac\n#\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7b"+
		"\2\2\u01b0\u0094\3\2\2\2\u01b1\u01b3\5\u0089E\2\u01b2\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u0096\3\2"+
		"\2\2\u01b6\u01b8\t$\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\bL"+
		"\2\2\u01bc\u0098\3\2\2\2\r\2\u0188\u0193\u0195\u019d\u01a2\u01a4\u01a7"+
		"\u01ad\u01b4\u01b9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}