// $ANTLR null /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g 2020-01-15 15:14:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class leacLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int BOOL=4;
	public static final int CHAR=5;
	public static final int COMMENT=6;
	public static final int ESC_SEQ=7;
	public static final int EXPONENT=8;
	public static final int FLOAT=9;
	public static final int HEX_DIGIT=10;
	public static final int IDF=11;
	public static final int INT=12;
	public static final int OCTAL_ESC=13;
	public static final int STRING=14;
	public static final int UNICODE_ESC=15;
	public static final int WS=16;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public leacLexer() {} 
	public leacLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public leacLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g"; }

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:2:7: ( '!=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:2:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:3:7: ( '(' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:4:7: ( ')' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:5:7: ( '*' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:5:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:6:7: ( '+' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:6:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:7:7: ( ',' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:8:7: ( '-' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:8:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:9:7: ( '..' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:9:9: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:10:7: ( '/' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:10:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:11:7: ( ':' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:11:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:12:7: ( ';' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:12:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:13:7: ( '<' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:13:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:14:7: ( '<=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:14:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:15:7: ( '=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:15:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:7: ( '==' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:17:7: ( '>' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:17:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:18:7: ( '>=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:18:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:19:7: ( '[' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:19:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:20:7: ( ']' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:20:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:21:7: ( '^' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:21:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:7: ( 'and' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:9: 'and'
			{
			match("and"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:23:7: ( 'array' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:23:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:24:7: ( 'bool' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:24:9: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:25:7: ( 'char' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:25:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:7: ( 'do' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:27:7: ( 'else' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:27:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:28:7: ( 'float' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:28:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:29:7: ( 'function' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:29:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:30:7: ( 'if' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:30:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:31:7: ( 'int' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:31:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:32:7: ( 'not' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:32:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:33:7: ( 'of' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:33:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:34:7: ( 'or' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:34:9: 'or'
			{
			match("or"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:35:7: ( 'program' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:35:9: 'program'
			{
			match("program"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:36:7: ( 'read' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:36:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:37:7: ( 'ref' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:37:9: 'ref'
			{
			match("ref"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:38:7: ( 'return' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:38:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:39:7: ( 'then' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:39:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:40:7: ( 'var' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:40:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:41:7: ( 'void' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:41:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:42:7: ( 'while' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:42:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:43:7: ( 'write' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:43:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:44:7: ( '{' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:44:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:45:7: ( '}' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:45:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:231:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:231:7: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:231:21: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:231:36: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:234:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:237:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				int LA3_1 = input.LA(2);
				if ( ((LA3_1 >= '0' && LA3_1 <= '3')) ) {
					int LA3_2 = input.LA(3);
					if ( ((LA3_2 >= '0' && LA3_2 <= '7')) ) {
						int LA3_4 = input.LA(4);
						if ( ((LA3_4 >= '0' && LA3_4 <= '7')) ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						alt3=3;
					}

				}
				else if ( ((LA3_1 >= '4' && LA3_1 <= '7')) ) {
					int LA3_3 = input.LA(3);
					if ( ((LA3_3 >= '0' && LA3_3 <= '7')) ) {
						alt3=2;
					}

					else {
						alt3=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:237:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:238:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:239:7: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:242:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:242:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:245:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt4=1;
					}
					break;
				case 'u':
					{
					alt4=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt4=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:245:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:246:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:247:7: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "BOOL"
	public final void mBOOL() throws RecognitionException {
		try {
			int _type = BOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:255:5: ( 'true' | 'false' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='t') ) {
				alt5=1;
			}
			else if ( (LA5_0=='f') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:255:7: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:256:7: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOL"

	// $ANTLR start "IDF"
	public final void mIDF() throws RecognitionException {
		try {
			int _type = IDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:260:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:260:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:260:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:263:5: ( ( '0' .. '9' )+ )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:263:7: ( '0' .. '9' )+
			{
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:263:7: ( '0' .. '9' )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:7: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:25: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:39: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:39: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:7: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:11: ( '0' .. '9' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:25: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:269:7: ( '0' .. '9' )+ EXPONENT
					{
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:269:7: ( '0' .. '9' )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:273:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:273:7: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:273:12: ( options {greedy=false; } : . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='*') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='/') ) {
						alt15=2;
					}
					else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
						alt15=1;
					}

				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:273:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
				}
			}

			match("*/"); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:277:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:277:7: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:281:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:281:7: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:281:11: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop16:
			while (true) {
				int alt16=3;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='\\') ) {
					alt16=1;
				}
				else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
					alt16=2;
				}

				switch (alt16) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:281:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:281:23: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop16;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:285:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:285:7: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:285:12: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\\') ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:285:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:285:24: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | BOOL | IDF | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt18=52;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:10: T__17
				{
				mT__17(); 

				}
				break;
			case 2 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:16: T__18
				{
				mT__18(); 

				}
				break;
			case 3 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:22: T__19
				{
				mT__19(); 

				}
				break;
			case 4 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:28: T__20
				{
				mT__20(); 

				}
				break;
			case 5 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:34: T__21
				{
				mT__21(); 

				}
				break;
			case 6 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:40: T__22
				{
				mT__22(); 

				}
				break;
			case 7 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:46: T__23
				{
				mT__23(); 

				}
				break;
			case 8 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:52: T__24
				{
				mT__24(); 

				}
				break;
			case 9 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:58: T__25
				{
				mT__25(); 

				}
				break;
			case 10 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:64: T__26
				{
				mT__26(); 

				}
				break;
			case 11 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:70: T__27
				{
				mT__27(); 

				}
				break;
			case 12 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:76: T__28
				{
				mT__28(); 

				}
				break;
			case 13 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:82: T__29
				{
				mT__29(); 

				}
				break;
			case 14 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:88: T__30
				{
				mT__30(); 

				}
				break;
			case 15 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:94: T__31
				{
				mT__31(); 

				}
				break;
			case 16 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:100: T__32
				{
				mT__32(); 

				}
				break;
			case 17 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:106: T__33
				{
				mT__33(); 

				}
				break;
			case 18 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:112: T__34
				{
				mT__34(); 

				}
				break;
			case 19 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:118: T__35
				{
				mT__35(); 

				}
				break;
			case 20 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:124: T__36
				{
				mT__36(); 

				}
				break;
			case 21 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:130: T__37
				{
				mT__37(); 

				}
				break;
			case 22 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:136: T__38
				{
				mT__38(); 

				}
				break;
			case 23 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:142: T__39
				{
				mT__39(); 

				}
				break;
			case 24 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:148: T__40
				{
				mT__40(); 

				}
				break;
			case 25 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:154: T__41
				{
				mT__41(); 

				}
				break;
			case 26 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:160: T__42
				{
				mT__42(); 

				}
				break;
			case 27 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:166: T__43
				{
				mT__43(); 

				}
				break;
			case 28 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:172: T__44
				{
				mT__44(); 

				}
				break;
			case 29 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:178: T__45
				{
				mT__45(); 

				}
				break;
			case 30 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:184: T__46
				{
				mT__46(); 

				}
				break;
			case 31 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:190: T__47
				{
				mT__47(); 

				}
				break;
			case 32 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:196: T__48
				{
				mT__48(); 

				}
				break;
			case 33 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:202: T__49
				{
				mT__49(); 

				}
				break;
			case 34 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:208: T__50
				{
				mT__50(); 

				}
				break;
			case 35 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:214: T__51
				{
				mT__51(); 

				}
				break;
			case 36 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:220: T__52
				{
				mT__52(); 

				}
				break;
			case 37 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:226: T__53
				{
				mT__53(); 

				}
				break;
			case 38 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:232: T__54
				{
				mT__54(); 

				}
				break;
			case 39 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:238: T__55
				{
				mT__55(); 

				}
				break;
			case 40 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:244: T__56
				{
				mT__56(); 

				}
				break;
			case 41 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:250: T__57
				{
				mT__57(); 

				}
				break;
			case 42 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:256: T__58
				{
				mT__58(); 

				}
				break;
			case 43 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:262: T__59
				{
				mT__59(); 

				}
				break;
			case 44 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:268: T__60
				{
				mT__60(); 

				}
				break;
			case 45 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:274: BOOL
				{
				mBOOL(); 

				}
				break;
			case 46 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:279: IDF
				{
				mIDF(); 

				}
				break;
			case 47 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:283: INT
				{
				mINT(); 

				}
				break;
			case 48 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:287: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 49 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:293: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 50 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:301: WS
				{
				mWS(); 

				}
				break;
			case 51 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:304: STRING
				{
				mSTRING(); 

				}
				break;
			case 52 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:1:311: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA14_eotS =
		"\5\uffff";
	static final String DFA14_eofS =
		"\5\uffff";
	static final String DFA14_minS =
		"\2\56\3\uffff";
	static final String DFA14_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA14_specialS =
		"\5\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "266:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA18_eotS =
		"\11\uffff\1\52\2\uffff\1\54\1\56\1\60\3\uffff\16\42\3\uffff\1\107\15\uffff"+
		"\4\42\1\114\4\42\1\121\2\42\1\124\1\125\10\42\1\uffff\1\140\3\42\1\uffff"+
		"\4\42\1\uffff\1\150\1\151\2\uffff\2\42\1\154\3\42\1\160\3\42\1\uffff\1"+
		"\42\1\165\1\166\1\167\3\42\2\uffff\1\42\1\174\1\uffff\1\42\1\176\1\177"+
		"\1\uffff\1\u0080\2\42\1\u0083\3\uffff\1\u0084\1\42\1\177\1\42\1\uffff"+
		"\1\42\3\uffff\1\u0088\1\u0089\2\uffff\2\42\1\u008c\2\uffff\1\42\1\u008e"+
		"\1\uffff\1\u008f\2\uffff";
	static final String DFA18_eofS =
		"\u0090\uffff";
	static final String DFA18_minS =
		"\1\11\7\uffff\1\56\1\52\2\uffff\3\75\3\uffff\1\156\1\157\1\150\1\157\1"+
		"\154\1\141\1\146\1\157\1\146\1\162\1\145\1\150\1\141\1\150\3\uffff\1\56"+
		"\15\uffff\1\144\1\162\1\157\1\141\1\60\1\163\1\157\1\156\1\154\1\60\2"+
		"\164\2\60\1\157\1\141\1\145\1\165\1\162\3\151\1\uffff\1\60\1\141\1\154"+
		"\1\162\1\uffff\1\145\1\141\1\143\1\163\1\uffff\2\60\2\uffff\1\147\1\144"+
		"\1\60\1\165\1\156\1\145\1\60\1\144\1\154\1\164\1\uffff\1\171\3\60\2\164"+
		"\1\145\2\uffff\1\162\1\60\1\uffff\1\162\2\60\1\uffff\1\60\2\145\1\60\3"+
		"\uffff\1\60\1\151\1\60\1\141\1\uffff\1\156\3\uffff\2\60\2\uffff\1\157"+
		"\1\155\1\60\2\uffff\1\156\1\60\1\uffff\1\60\2\uffff";
	static final String DFA18_maxS =
		"\1\175\7\uffff\1\71\1\52\2\uffff\3\75\3\uffff\1\162\1\157\1\150\1\157"+
		"\1\154\1\165\1\156\1\157\2\162\1\145\1\162\1\157\1\162\3\uffff\1\145\15"+
		"\uffff\1\144\1\162\1\157\1\141\1\172\1\163\1\157\1\156\1\154\1\172\2\164"+
		"\2\172\1\157\1\164\1\145\1\165\1\162\3\151\1\uffff\1\172\1\141\1\154\1"+
		"\162\1\uffff\1\145\1\141\1\143\1\163\1\uffff\2\172\2\uffff\1\147\1\144"+
		"\1\172\1\165\1\156\1\145\1\172\1\144\1\154\1\164\1\uffff\1\171\3\172\2"+
		"\164\1\145\2\uffff\1\162\1\172\1\uffff\1\162\2\172\1\uffff\1\172\2\145"+
		"\1\172\3\uffff\1\172\1\151\1\172\1\141\1\uffff\1\156\3\uffff\2\172\2\uffff"+
		"\1\157\1\155\1\172\2\uffff\1\156\1\172\1\uffff\1\172\2\uffff";
	static final String DFA18_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\1\13\3\uffff\1\22\1"+
		"\23\1\24\16\uffff\1\53\1\54\1\56\1\uffff\1\62\1\63\1\64\1\10\1\60\1\61"+
		"\1\11\1\15\1\14\1\17\1\16\1\21\1\20\26\uffff\1\57\4\uffff\1\31\4\uffff"+
		"\1\35\2\uffff\1\40\1\41\12\uffff\1\25\7\uffff\1\36\1\37\2\uffff\1\44\3"+
		"\uffff\1\47\4\uffff\1\27\1\30\1\32\4\uffff\1\43\1\uffff\1\46\1\55\1\50"+
		"\2\uffff\1\26\1\33\3\uffff\1\51\1\52\2\uffff\1\45\1\uffff\1\42\1\34";
	static final String DFA18_specialS =
		"\u0090\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\44\2\uffff\1\44\22\uffff\1\44\1\1\1\45\4\uffff\1\46\1\2\1\3\1\4\1"+
			"\5\1\6\1\7\1\10\1\11\12\43\1\12\1\13\1\14\1\15\1\16\2\uffff\32\42\1\17"+
			"\1\uffff\1\20\1\21\1\42\1\uffff\1\22\1\23\1\24\1\25\1\26\1\27\2\42\1"+
			"\30\4\42\1\31\1\32\1\33\1\42\1\34\1\42\1\35\1\42\1\36\1\37\3\42\1\40"+
			"\1\uffff\1\41",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\47\1\uffff\12\50",
			"\1\51",
			"",
			"",
			"\1\53",
			"\1\55",
			"\1\57",
			"",
			"",
			"",
			"\1\61\3\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\71\12\uffff\1\67\10\uffff\1\70",
			"\1\72\7\uffff\1\73",
			"\1\74",
			"\1\75\13\uffff\1\76",
			"\1\77",
			"\1\100",
			"\1\101\11\uffff\1\102",
			"\1\103\15\uffff\1\104",
			"\1\105\11\uffff\1\106",
			"",
			"",
			"",
			"\1\50\1\uffff\12\43\13\uffff\1\50\37\uffff\1\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\122",
			"\1\123",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\126",
			"\1\127\4\uffff\1\130\15\uffff\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\141",
			"\1\142",
			"\1\143",
			"",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\152",
			"\1\153",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\155",
			"\1\156",
			"\1\157",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\161",
			"\1\162",
			"\1\163",
			"",
			"\1\164",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\170",
			"\1\171",
			"\1\172",
			"",
			"",
			"\1\173",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\1\175",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0081",
			"\1\u0082",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0085",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\1\u0086",
			"",
			"\1\u0087",
			"",
			"",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\u008a",
			"\1\u008b",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"",
			"\1\u008d",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			"\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | BOOL | IDF | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
