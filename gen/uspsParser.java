// Generated from /Users/jdehling/Desktop/test/Lab2/src/usps.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class uspsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LETTER=1, NUMBER=2, COUNTRYCODE=3;
	public static final int
		RULE_trackingnumber = 0, RULE_letter_part = 1, RULE_number_part = 2;
	public static final String[] ruleNames = {
		"trackingnumber", "letter_part", "number_part"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LETTER", "NUMBER", "COUNTRYCODE"
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

	@Override
	public String getGrammarFileName() { return "usps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public uspsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TrackingnumberContext extends ParserRuleContext {
		public Letter_partContext letter_part() {
			return getRuleContext(Letter_partContext.class,0);
		}
		public Number_partContext number_part() {
			return getRuleContext(Number_partContext.class,0);
		}
		public TerminalNode COUNTRYCODE() { return getToken(uspsParser.COUNTRYCODE, 0); }
		public TrackingnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trackingnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).enterTrackingnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).exitTrackingnumber(this);
		}
	}

	public final TrackingnumberContext trackingnumber() throws RecognitionException {
		TrackingnumberContext _localctx = new TrackingnumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trackingnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			letter_part();
			setState(7);
			number_part();
			setState(8);
			match(COUNTRYCODE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Letter_partContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(uspsParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(uspsParser.LETTER, i);
		}
		public Letter_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letter_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).enterLetter_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).exitLetter_part(this);
		}
	}

	public final Letter_partContext letter_part() throws RecognitionException {
		Letter_partContext _localctx = new Letter_partContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_letter_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(LETTER);
			setState(11);
			match(LETTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_partContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(uspsParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(uspsParser.NUMBER, i);
		}
		public Number_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).enterNumber_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof uspsListener ) ((uspsListener)listener).exitNumber_part(this);
		}
	}

	public final Number_partContext number_part() throws RecognitionException {
		Number_partContext _localctx = new Number_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(NUMBER);
			setState(14);
			match(NUMBER);
			setState(15);
			match(NUMBER);
			setState(16);
			match(NUMBER);
			setState(17);
			match(NUMBER);
			setState(18);
			match(NUMBER);
			setState(19);
			match(NUMBER);
			setState(20);
			match(NUMBER);
			setState(21);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\32\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\26\2\b\3\2\2\2\4\f\3\2\2\2\6\17\3\2\2\2"+
		"\b\t\5\4\3\2\t\n\5\6\4\2\n\13\7\5\2\2\13\3\3\2\2\2\f\r\7\3\2\2\r\16\7"+
		"\3\2\2\16\5\3\2\2\2\17\20\7\4\2\2\20\21\7\4\2\2\21\22\7\4\2\2\22\23\7"+
		"\4\2\2\23\24\7\4\2\2\24\25\7\4\2\2\25\26\7\4\2\2\26\27\7\4\2\2\27\30\7"+
		"\4\2\2\30\7\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}