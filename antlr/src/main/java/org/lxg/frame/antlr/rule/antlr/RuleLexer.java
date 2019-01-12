// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Rule.g4 by ANTLR 4.7

package org.lxg.frame.antlr.rule.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RuleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUATION_KEY=1, REGU_KEY=2, SQL_KEY=3, NUMBER=4, STRING=5, BOOLEAN=6, 
		ID=7, WS=8, DOUBLE=9, INT=10, ID_BASICQUERY=11, COMMA=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, DELIMITER=15, EQUAL=16, UNDERLINE=17, COLON=18, CONTRARY=19, 
		ADDSUB=20, MULDIV=21, EQUALOPERATION=22, COMPAREOPERATION=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQUATION_KEY", "REGU_KEY", "SQL_KEY", "NUMBER", "STRING", "BOOLEAN", 
		"ID", "WS", "DOUBLE", "INT", "ID_BASICQUERY", "ESC", "ID_LETTER", "DIGIT", 
		"COMMA", "LEFT_BRACKET", "RIGHT_BRACKET", "DELIMITER", "EQUAL", "UNDERLINE", 
		"COLON", "CONTRARY", "ADDSUB", "MULDIV", "EQUALOPERATION", "COMPAREOPERATION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'*'", 
		"','", "'('", "')'", "'|'", "'='", "'_'", "':'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUATION_KEY", "REGU_KEY", "SQL_KEY", "NUMBER", "STRING", "BOOLEAN", 
		"ID", "WS", "DOUBLE", "INT", "ID_BASICQUERY", "COMMA", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "DELIMITER", "EQUAL", "UNDERLINE", "COLON", "CONTRARY", 
		"ADDSUB", "MULDIV", "EQUALOPERATION", "COMPAREOPERATION"
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


	public RuleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "com/lxg/samplej/antlr/rule/Rule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\5\5K\n\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6"+
		"\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7d\n\7\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\6\to\n\t\r\t\16\tp\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\6\13z\n\13\r\13\16\13{\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\5\r\u0084\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\5\32\u00a2\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u00a9\n"+
		"\33\3U\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33"+
		"\2\35\2\37\16!\17#\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\3\2\24"+
		"\4\2GGgg\4\2SSss\4\2WWww\4\2CCcc\4\2VVvv\4\2KKkk\4\2QQqq\4\2PPpp\4\2T"+
		"Ttt\4\2IIii\4\2UUuu\4\2SSnn\4\2NNnn\5\2\13\f\17\17\"\"\5\2C\\aac|\4\2"+
		"--//\4\2,,\61\61\4\2>>@@\2\u00b3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5@\3\2\2\2\7E\3\2\2\2\t"+
		"J\3\2\2\2\13P\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21n\3\2\2\2\23t\3\2\2\2\25"+
		"y\3\2\2\2\27}\3\2\2\2\31\u0083\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2"+
		"\2\37\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091"+
		"\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0097\3\2\2\2/\u0099\3\2\2\2\61"+
		"\u009b\3\2\2\2\63\u00a1\3\2\2\2\65\u00a8\3\2\2\2\678\t\2\2\289\t\3\2\2"+
		"9:\t\4\2\2:;\t\5\2\2;<\t\6\2\2<=\t\7\2\2=>\t\b\2\2>?\t\t\2\2?\4\3\2\2"+
		"\2@A\t\n\2\2AB\t\2\2\2BC\t\13\2\2CD\t\4\2\2D\6\3\2\2\2EF\t\f\2\2FG\t\r"+
		"\2\2GH\t\16\2\2H\b\3\2\2\2IK\7/\2\2JI\3\2\2\2JK\3\2\2\2KN\3\2\2\2LO\5"+
		"\25\13\2MO\5\23\n\2NL\3\2\2\2NM\3\2\2\2O\n\3\2\2\2PU\7$\2\2QT\5\31\r\2"+
		"RT\13\2\2\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2\2\2US\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2XY\7$\2\2Y\f\3\2\2\2Z[\7v\2\2[\\\7t\2\2\\]\7w\2\2]d\7g\2\2"+
		"^_\7h\2\2_`\7c\2\2`a\7n\2\2ab\7u\2\2bd\7g\2\2cZ\3\2\2\2c^\3\2\2\2d\16"+
		"\3\2\2\2ej\5\33\16\2fi\5\33\16\2gi\5\35\17\2hf\3\2\2\2hg\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2k\20\3\2\2\2lj\3\2\2\2mo\t\17\2\2nm\3\2\2\2op"+
		"\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\t\2\2s\22\3\2\2\2tu\5\25\13"+
		"\2uv\7\60\2\2vw\5\25\13\2w\24\3\2\2\2xz\5\35\17\2yx\3\2\2\2z{\3\2\2\2"+
		"{y\3\2\2\2{|\3\2\2\2|\26\3\2\2\2}~\7,\2\2~\30\3\2\2\2\177\u0080\7^\2\2"+
		"\u0080\u0084\7$\2\2\u0081\u0082\7^\2\2\u0082\u0084\7^\2\2\u0083\177\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0084\32\3\2\2\2\u0085\u0086\t\20\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\4\62;\2\u0088\36\3\2\2\2\u0089\u008a\7.\2\2\u008a"+
		" \3\2\2\2\u008b\u008c\7*\2\2\u008c\"\3\2\2\2\u008d\u008e\7+\2\2\u008e"+
		"$\3\2\2\2\u008f\u0090\7~\2\2\u0090&\3\2\2\2\u0091\u0092\7?\2\2\u0092("+
		"\3\2\2\2\u0093\u0094\7a\2\2\u0094*\3\2\2\2\u0095\u0096\7<\2\2\u0096,\3"+
		"\2\2\2\u0097\u0098\7`\2\2\u0098.\3\2\2\2\u0099\u009a\t\21\2\2\u009a\60"+
		"\3\2\2\2\u009b\u009c\t\22\2\2\u009c\62\3\2\2\2\u009d\u009e\7#\2\2\u009e"+
		"\u00a2\7?\2\2\u009f\u00a0\7?\2\2\u00a0\u00a2\7?\2\2\u00a1\u009d\3\2\2"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\64\3\2\2\2\u00a3\u00a9\t\23\2\2\u00a4\u00a5"+
		"\7>\2\2\u00a5\u00a9\7?\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a9\7?\2\2\u00a8"+
		"\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\66\3\2\2"+
		"\2\17\2JNSUchjp{\u0083\u00a1\u00a8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}