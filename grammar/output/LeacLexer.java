// $ANTLR null /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g 2020-01-16 09:31:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class LeacLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int ADD=4;
	public static final int AFFECT=5;
	public static final int AND=6;
	public static final int ARG_LIST=7;
	public static final int ARRAY=8;
	public static final int ATOM=9;
	public static final int BLOCK=10;
	public static final int BOOL=11;
	public static final int BOOL_TYPENAME=12;
	public static final int BY_COPY=13;
	public static final int BY_REF=14;
	public static final int CELL=15;
	public static final int CHAR=16;
	public static final int CHAR_TYPENAME=17;
	public static final int COMMENT=18;
	public static final int CONDITIONAL=19;
	public static final int CONST=20;
	public static final int COORD_LIST=21;
	public static final int DIV=22;
	public static final int ESC_SEQ=23;
	public static final int EXPONENT=24;
	public static final int FLOAT=25;
	public static final int FLOAT_TYPENAME=26;
	public static final int FUNC_CALL=27;
	public static final int FUNC_DECL=28;
	public static final int FUNC_DECL_LIST=29;
	public static final int HEX_DIGIT=30;
	public static final int IDF=31;
	public static final int IDF_LIST=32;
	public static final int INT=33;
	public static final int INT_TYPENAME=34;
	public static final int LOOP=35;
	public static final int MUL=36;
	public static final int NOT=37;
	public static final int NO_RETURN_VALUE=38;
	public static final int OCTAL_ESC=39;
	public static final int OR=40;
	public static final int PARAM=41;
	public static final int PARAM_LIST=42;
	public static final int PASS=43;
	public static final int POW=44;
	public static final int PROCEDURE_CALL=45;
	public static final int PROGRAM=46;
	public static final int RANGE=47;
	public static final int RANGE_LIST=48;
	public static final int READ=49;
	public static final int RETURNING=50;
	public static final int STRING=51;
	public static final int STRING_TYPENAME=52;
	public static final int SUB=53;
	public static final int TEST_EQ=54;
	public static final int TEST_GE=55;
	public static final int TEST_GT=56;
	public static final int TEST_LE=57;
	public static final int TEST_LT=58;
	public static final int TEST_NE=59;
	public static final int UNARY_MINUS=60;
	public static final int UNICODE_ESC=61;
	public static final int VAR=62;
	public static final int VAR_DECL=63;
	public static final int VAR_DECL_LIST=64;
	public static final int VOID_TYPENAME=65;
	public static final int WRITE=66;
	public static final int WS=67;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public LeacLexer() {} 
	public LeacLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public LeacLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g"; }

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:2:7: ( '!=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:2:9: '!='
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:3:7: ( '(' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:3:9: '('
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
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:4:7: ( ')' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:4:9: ')'
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:5:7: ( '*' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:5:9: '*'
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:6:7: ( '+' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:6:9: '+'
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:7:7: ( ',' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:7:9: ','
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:8:7: ( '-' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:8:9: '-'
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:9:7: ( '..' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:9:9: '..'
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:10:7: ( '/' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:10:9: '/'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:11:7: ( ':' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:11:9: ':'
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:12:7: ( ';' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:12:9: ';'
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
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:13:7: ( '<' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:13:9: '<'
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
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:14:7: ( '<=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:14:9: '<='
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
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:15:7: ( '=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:15:9: '='
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
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:16:7: ( '==' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:16:9: '=='
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
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:17:7: ( '>' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:17:9: '>'
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
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:18:7: ( '>=' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:18:9: '>='
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
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:19:7: ( '[' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:19:9: '['
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
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:20:7: ( ']' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:20:9: ']'
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
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:21:7: ( '^' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:21:9: '^'
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
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:22:7: ( 'and' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:22:9: 'and'
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
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:23:7: ( 'array' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:23:9: 'array'
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
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:24:7: ( 'bool' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:24:9: 'bool'
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
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:25:7: ( 'char' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:25:9: 'char'
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
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:26:7: ( 'do' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:26:9: 'do'
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
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:27:7: ( 'else' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:27:9: 'else'
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
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:28:7: ( 'float' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:28:9: 'float'
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
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:29:7: ( 'function' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:29:9: 'function'
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
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:30:7: ( 'if' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:30:9: 'if'
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
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:31:7: ( 'int' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:31:9: 'int'
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
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:32:7: ( 'not' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:32:9: 'not'
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
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:33:7: ( 'of' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:33:9: 'of'
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
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:34:8: ( 'or' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:34:10: 'or'
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
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:35:8: ( 'program' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:35:10: 'program'
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
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:36:8: ( 'read' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:36:10: 'read'
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
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:37:8: ( 'ref' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:37:10: 'ref'
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
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:38:8: ( 'return' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:38:10: 'return'
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
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:39:8: ( 'then' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:39:10: 'then'
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
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:40:8: ( 'var' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:40:10: 'var'
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
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:41:8: ( 'void' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:41:10: 'void'
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
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:42:8: ( 'while' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:42:10: 'while'
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
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:43:8: ( 'write' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:43:10: 'write'
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
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:44:8: ( '{' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:44:10: '{'
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
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:45:8: ( '}' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:45:10: '}'
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
	// $ANTLR end "T__111"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:292:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:292:7: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:292:21: ( '+' | '-' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='+'||LA1_0=='-') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:292:36: ( '0' .. '9' )+
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:295:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:298:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:298:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:299:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:300:7: '\\\\' ( '0' .. '7' )
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:303:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:303:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:306:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:306:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:307:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:308:7: OCTAL_ESC
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:316:5: ( 'true' | 'false' )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:316:7: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:317:7: 'false'
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:321:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:321:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:321:37: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:324:5: ( ( '0' .. '9' )+ )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:324:7: ( '0' .. '9' )+
			{
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:324:7: ( '0' .. '9' )+
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt14=3;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:7: ( '0' .. '9' )+
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
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:25: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:39: ( EXPONENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:328:39: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:329:7: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:329:11: ( '0' .. '9' )+
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
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:329:25: ( EXPONENT )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:329:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:330:7: ( '0' .. '9' )+ EXPONENT
					{
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:330:7: ( '0' .. '9' )+
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
							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:334:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:334:7: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:334:12: ( options {greedy=false; } : . )*
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:334:44: .
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:338:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:338:7: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:342:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:342:7: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:342:11: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:342:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:342:23: ~ ( '\\\\' | '\"' )
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
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:346:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:346:7: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:346:12: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
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
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:346:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:346:24: ~ ( '\\'' | '\\\\' )
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
		// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:8: ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | BOOL | IDF | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt18=52;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:10: T__68
				{
				mT__68(); 

				}
				break;
			case 2 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:16: T__69
				{
				mT__69(); 

				}
				break;
			case 3 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:22: T__70
				{
				mT__70(); 

				}
				break;
			case 4 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:28: T__71
				{
				mT__71(); 

				}
				break;
			case 5 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:34: T__72
				{
				mT__72(); 

				}
				break;
			case 6 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:40: T__73
				{
				mT__73(); 

				}
				break;
			case 7 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:46: T__74
				{
				mT__74(); 

				}
				break;
			case 8 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:52: T__75
				{
				mT__75(); 

				}
				break;
			case 9 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:58: T__76
				{
				mT__76(); 

				}
				break;
			case 10 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:64: T__77
				{
				mT__77(); 

				}
				break;
			case 11 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:70: T__78
				{
				mT__78(); 

				}
				break;
			case 12 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:76: T__79
				{
				mT__79(); 

				}
				break;
			case 13 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:82: T__80
				{
				mT__80(); 

				}
				break;
			case 14 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:88: T__81
				{
				mT__81(); 

				}
				break;
			case 15 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:94: T__82
				{
				mT__82(); 

				}
				break;
			case 16 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:100: T__83
				{
				mT__83(); 

				}
				break;
			case 17 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:106: T__84
				{
				mT__84(); 

				}
				break;
			case 18 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:112: T__85
				{
				mT__85(); 

				}
				break;
			case 19 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:118: T__86
				{
				mT__86(); 

				}
				break;
			case 20 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:124: T__87
				{
				mT__87(); 

				}
				break;
			case 21 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:130: T__88
				{
				mT__88(); 

				}
				break;
			case 22 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:136: T__89
				{
				mT__89(); 

				}
				break;
			case 23 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:142: T__90
				{
				mT__90(); 

				}
				break;
			case 24 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:148: T__91
				{
				mT__91(); 

				}
				break;
			case 25 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:154: T__92
				{
				mT__92(); 

				}
				break;
			case 26 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:160: T__93
				{
				mT__93(); 

				}
				break;
			case 27 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:166: T__94
				{
				mT__94(); 

				}
				break;
			case 28 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:172: T__95
				{
				mT__95(); 

				}
				break;
			case 29 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:178: T__96
				{
				mT__96(); 

				}
				break;
			case 30 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:184: T__97
				{
				mT__97(); 

				}
				break;
			case 31 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:190: T__98
				{
				mT__98(); 

				}
				break;
			case 32 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:196: T__99
				{
				mT__99(); 

				}
				break;
			case 33 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:202: T__100
				{
				mT__100(); 

				}
				break;
			case 34 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:209: T__101
				{
				mT__101(); 

				}
				break;
			case 35 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:216: T__102
				{
				mT__102(); 

				}
				break;
			case 36 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:223: T__103
				{
				mT__103(); 

				}
				break;
			case 37 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:230: T__104
				{
				mT__104(); 

				}
				break;
			case 38 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:237: T__105
				{
				mT__105(); 

				}
				break;
			case 39 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:244: T__106
				{
				mT__106(); 

				}
				break;
			case 40 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:251: T__107
				{
				mT__107(); 

				}
				break;
			case 41 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:258: T__108
				{
				mT__108(); 

				}
				break;
			case 42 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:265: T__109
				{
				mT__109(); 

				}
				break;
			case 43 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:272: T__110
				{
				mT__110(); 

				}
				break;
			case 44 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:279: T__111
				{
				mT__111(); 

				}
				break;
			case 45 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:286: BOOL
				{
				mBOOL(); 

				}
				break;
			case 46 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:291: IDF
				{
				mIDF(); 

				}
				break;
			case 47 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:295: INT
				{
				mINT(); 

				}
				break;
			case 48 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:299: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 49 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:305: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 50 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:313: WS
				{
				mWS(); 

				}
				break;
			case 51 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:316: STRING
				{
				mSTRING(); 

				}
				break;
			case 52 :
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/Leac.g:1:323: CHAR
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
			return "327:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
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
			return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | BOOL | IDF | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
