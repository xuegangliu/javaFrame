// Generated from D:/WorkSpaces/Self/antlr-demo/src/main/resources\Demo.g4 by ANTLR 4.7

package org.lxg.frame.antlr.demo.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, INT=5, DOT=6, NUMERIC=7, NEWLINE=8, WS=9, 
		MUL=10, DIV=11, ADD=12, SUB=13, POW=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ID", "INT", "DOT", "NUMERIC", "NEWLINE", "WS", 
		"MUL", "DIV", "ADD", "SUB", "POW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", null, null, "'.'", null, null, null, "'*'", 
		"'/'", "'+'", "'-'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "INT", "DOT", "NUMERIC", "NEWLINE", "WS", 
		"MUL", "DIV", "ADD", "SUB", "POW"
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


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "com/lxg/samplej/antlr/demo/Demo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20N\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\'\n\5\r\5\16\5(\3\6\6\6,\n\6\r\6\16\6-\3\7\3\7\3\b\3\b\3\b\6\b\65\n"+
		"\b\r\b\16\b\66\3\t\5\t:\n\t\3\t\3\t\3\n\6\n?\n\n\r\n\16\n@\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\4\2C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5!\3\2\2\2\7#\3\2\2\2\t&\3\2\2\2\13+\3\2\2\2\r/\3\2\2\2\17\61\3\2"+
		"\2\2\219\3\2\2\2\23>\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33J\3"+
		"\2\2\2\35L\3\2\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7*\2\2\"\6\3\2\2\2#$\7+\2"+
		"\2$\b\3\2\2\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\n\3"+
		"\2\2\2*,\t\3\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\60"+
		"\7\60\2\2\60\16\3\2\2\2\61\62\5\13\6\2\62\64\5\r\7\2\63\65\5\13\6\2\64"+
		"\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\28:"+
		"\7\17\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\f\2\2<\22\3\2\2\2=?\t\4\2"+
		"\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\n\2\2C\24\3\2"+
		"\2\2DE\7,\2\2E\26\3\2\2\2FG\7\61\2\2G\30\3\2\2\2HI\7-\2\2I\32\3\2\2\2"+
		"JK\7/\2\2K\34\3\2\2\2LM\7`\2\2M\36\3\2\2\2\b\2(-\669@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}