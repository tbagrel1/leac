// $ANTLR 3.5.2 Leac.g 2020-01-20 16:18:04

package grammar;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LeacParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "AFFECT", "AND", "ARG_LIST",
		"ARRAY", "ATOM", "BLOCK", "BOOL", "BOOL_TYPENAME", "BY_COPY", "BY_REF",
		"CELL", "CHAR", "CHAR_TYPENAME", "COMMENT", "CONDITIONAL", "CONST", "COORD_LIST",
		"DIV", "ESC_SEQ", "EXPONENT", "FLOAT", "FLOAT_TYPENAME", "FUNC_CALL",
		"FUNC_DECL", "FUNC_DECL_LIST", "HEX_DIGIT", "IDF", "IDF_LIST", "INT",
		"INT_TYPENAME", "LOOP", "MUL", "NOT", "NO_RETURN_VALUE", "OCTAL_ESC",
		"OR", "PARAM", "PARAM_LIST", "POW", "PROCEDURE_CALL", "PROGRAM", "RANGE",
		"RANGE_LIST", "READ", "RETURNING", "STRING", "STRING_TYPENAME", "SUB",
		"TEST_EQ", "TEST_GE", "TEST_GT", "TEST_LE", "TEST_LT", "TEST_NE", "UNARY_MINUS",
		"UNICODE_ESC", "VAR", "VAR_DECL", "VAR_DECL_LIST", "VOID_TYPENAME", "WRITE",
		"WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'..'", "'/'",
		"':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'",
		"'^'", "'and'", "'array'", "'bool'", "'char'", "'do'", "'else'", "'float'",
		"'function'", "'if'", "'int'", "'not'", "'of'", "'or'", "'program'", "'read'",
		"'ref'", "'return'", "'string'", "'then'", "'var'", "'void'", "'while'",
		"'write'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__67=67;
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
	public static final int POW=43;
	public static final int PROCEDURE_CALL=44;
	public static final int PROGRAM=45;
	public static final int RANGE=46;
	public static final int RANGE_LIST=47;
	public static final int READ=48;
	public static final int RETURNING=49;
	public static final int STRING=50;
	public static final int STRING_TYPENAME=51;
	public static final int SUB=52;
	public static final int TEST_EQ=53;
	public static final int TEST_GE=54;
	public static final int TEST_GT=55;
	public static final int TEST_LE=56;
	public static final int TEST_LT=57;
	public static final int TEST_NE=58;
	public static final int UNARY_MINUS=59;
	public static final int UNICODE_ESC=60;
	public static final int VAR=61;
	public static final int VAR_DECL=62;
	public static final int VAR_DECL_LIST=63;
	public static final int VOID_TYPENAME=64;
	public static final int WRITE=65;
	public static final int WS=66;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public LeacParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public LeacParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return LeacParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Leac.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Leac.g:64:1: program : 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM IDF var_decl_list func_decl_list statement ) ;
	public final LeacParser.program_return program() throws RecognitionException {
		LeacParser.program_return retval = new LeacParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal1=null;
		Token IDF2=null;
		ParserRuleReturnScope var_decl_list3 =null;
		ParserRuleReturnScope func_decl_list4 =null;
		ParserRuleReturnScope statement5 =null;

		Object string_literal1_tree=null;
		Object IDF2_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_func_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule func_decl_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_var_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_list");

		try {
			// Leac.g:65:5: ( 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM IDF var_decl_list func_decl_list statement ) )
			// Leac.g:65:7: 'program' IDF var_decl_list func_decl_list statement
			{
			string_literal1=(Token)match(input,100,FOLLOW_100_in_program400);
			stream_100.add(string_literal1);

			IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_program402);
			stream_IDF.add(IDF2);

			pushFollow(FOLLOW_var_decl_list_in_program404);
			var_decl_list3=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list3.getTree());
			pushFollow(FOLLOW_func_decl_list_in_program406);
			func_decl_list4=func_decl_list();
			state._fsp--;

			stream_func_decl_list.add(func_decl_list4.getTree());
			pushFollow(FOLLOW_statement_in_program408);
			statement5=statement();
			state._fsp--;

			stream_statement.add(statement5.getTree());
			// AST REWRITE
			// elements: statement, var_decl_list, func_decl_list, IDF
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 65:60: -> ^( PROGRAM IDF var_decl_list func_decl_list statement )
			{
				// Leac.g:65:63: ^( PROGRAM IDF var_decl_list func_decl_list statement )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());
				adaptor.addChild(root_1, stream_func_decl_list.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class var_decl_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_decl_list"
	// Leac.g:68:1: var_decl_list : ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) ;
	public final LeacParser.var_decl_list_return var_decl_list() throws RecognitionException {
		LeacParser.var_decl_list_return retval = new LeacParser.var_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_decl6 =null;

		RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");

		try {
			// Leac.g:69:5: ( ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) )
			// Leac.g:69:7: ( var_decl )*
			{
			// Leac.g:69:7: ( var_decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==106) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Leac.g:69:7: var_decl
					{
					pushFollow(FOLLOW_var_decl_in_var_decl_list439);
					var_decl6=var_decl();
					state._fsp--;

					stream_var_decl.add(var_decl6.getTree());
					}
					break;

				default :
					break loop1;
				}
			}

			// AST REWRITE
			// elements: var_decl
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:17: -> ^( VAR_DECL_LIST ( var_decl )* )
			{
				// Leac.g:69:20: ^( VAR_DECL_LIST ( var_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL_LIST, "VAR_DECL_LIST"), root_1);
				// Leac.g:69:36: ( var_decl )*
				while ( stream_var_decl.hasNext() ) {
					adaptor.addChild(root_1, stream_var_decl.nextTree());
				}
				stream_var_decl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_decl_list"


	public static class var_decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "var_decl"
	// Leac.g:71:1: var_decl : 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) ;
	public final LeacParser.var_decl_return var_decl() throws RecognitionException {
		LeacParser.var_decl_return retval = new LeacParser.var_decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token char_literal9=null;
		Token char_literal11=null;
		ParserRuleReturnScope idf_list8 =null;
		ParserRuleReturnScope typename10 =null;

		Object string_literal7_tree=null;
		Object char_literal9_tree=null;
		Object char_literal11_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_idf_list=new RewriteRuleSubtreeStream(adaptor,"rule idf_list");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try {
			// Leac.g:72:5: ( 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) )
			// Leac.g:72:7: 'var' idf_list ':' typename ';'
			{
			string_literal7=(Token)match(input,106,FOLLOW_106_in_var_decl465);
			stream_106.add(string_literal7);

			pushFollow(FOLLOW_idf_list_in_var_decl467);
			idf_list8=idf_list();
			state._fsp--;

			stream_idf_list.add(idf_list8.getTree());
			char_literal9=(Token)match(input,76,FOLLOW_76_in_var_decl469);
			stream_76.add(char_literal9);

			pushFollow(FOLLOW_typename_in_var_decl471);
			typename10=typename();
			state._fsp--;

			stream_typename.add(typename10.getTree());
			char_literal11=(Token)match(input,77,FOLLOW_77_in_var_decl473);
			stream_77.add(char_literal11);

			// AST REWRITE
			// elements: idf_list, typename
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:39: -> ^( VAR_DECL typename idf_list )
			{
				// Leac.g:72:42: ^( VAR_DECL typename idf_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				adaptor.addChild(root_1, stream_typename.nextTree());
				adaptor.addChild(root_1, stream_idf_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "var_decl"


	public static class idf_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "idf_list"
	// Leac.g:74:1: idf_list : IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) ;
	public final LeacParser.idf_list_return idf_list() throws RecognitionException {
		LeacParser.idf_list_return retval = new LeacParser.idf_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF12=null;
		Token char_literal13=null;
		Token IDF14=null;

		Object IDF12_tree=null;
		Object char_literal13_tree=null;
		Object IDF14_tree=null;
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

		try {
			// Leac.g:75:5: ( IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) )
			// Leac.g:75:7: IDF ( ',' IDF )*
			{
			IDF12=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list499);
			stream_IDF.add(IDF12);

			// Leac.g:75:11: ( ',' IDF )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==72) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Leac.g:75:12: ',' IDF
					{
					char_literal13=(Token)match(input,72,FOLLOW_72_in_idf_list502);
					stream_72.add(char_literal13);

					IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list504);
					stream_IDF.add(IDF14);

					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: IDF
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:22: -> ^( IDF_LIST ( IDF )+ )
			{
				// Leac.g:75:25: ^( IDF_LIST ( IDF )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDF_LIST, "IDF_LIST"), root_1);
				if ( !(stream_IDF.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDF.hasNext() ) {
					adaptor.addChild(root_1, stream_IDF.nextNode());
				}
				stream_IDF.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "idf_list"


	public static class func_decl_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_decl_list"
	// Leac.g:78:1: func_decl_list : ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) ;
	public final LeacParser.func_decl_list_return func_decl_list() throws RecognitionException {
		LeacParser.func_decl_list_return retval = new LeacParser.func_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_decl15 =null;

		RewriteRuleSubtreeStream stream_func_decl=new RewriteRuleSubtreeStream(adaptor,"rule func_decl");

		try {
			// Leac.g:79:5: ( ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) )
			// Leac.g:79:7: ( func_decl )*
			{
			// Leac.g:79:7: ( func_decl )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==94) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Leac.g:79:7: func_decl
					{
					pushFollow(FOLLOW_func_decl_in_func_decl_list532);
					func_decl15=func_decl();
					state._fsp--;

					stream_func_decl.add(func_decl15.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: func_decl
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:18: -> ^( FUNC_DECL_LIST ( func_decl )* )
			{
				// Leac.g:79:21: ^( FUNC_DECL_LIST ( func_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL_LIST, "FUNC_DECL_LIST"), root_1);
				// Leac.g:79:38: ( func_decl )*
				while ( stream_func_decl.hasNext() ) {
					adaptor.addChild(root_1, stream_func_decl.nextTree());
				}
				stream_func_decl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_decl_list"


	public static class func_decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "func_decl"
	// Leac.g:81:1: func_decl : 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL IDF param_list atom_typename var_decl_list block ) ;
	public final LeacParser.func_decl_return func_decl() throws RecognitionException {
		LeacParser.func_decl_return retval = new LeacParser.func_decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal16=null;
		Token IDF17=null;
		Token char_literal18=null;
		Token char_literal20=null;
		Token char_literal21=null;
		ParserRuleReturnScope param_list19 =null;
		ParserRuleReturnScope atom_typename22 =null;
		ParserRuleReturnScope var_decl_list23 =null;
		ParserRuleReturnScope block24 =null;

		Object string_literal16_tree=null;
		Object IDF17_tree=null;
		Object char_literal18_tree=null;
		Object char_literal20_tree=null;
		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");
		RewriteRuleSubtreeStream stream_var_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_list");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// Leac.g:82:5: ( 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL IDF param_list atom_typename var_decl_list block ) )
			// Leac.g:82:7: 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block
			{
			string_literal16=(Token)match(input,94,FOLLOW_94_in_func_decl558);
			stream_94.add(string_literal16);

			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_func_decl560);
			stream_IDF.add(IDF17);

			char_literal18=(Token)match(input,68,FOLLOW_68_in_func_decl562);
			stream_68.add(char_literal18);

			pushFollow(FOLLOW_param_list_in_func_decl564);
			param_list19=param_list();
			state._fsp--;

			stream_param_list.add(param_list19.getTree());
			char_literal20=(Token)match(input,69,FOLLOW_69_in_func_decl566);
			stream_69.add(char_literal20);

			char_literal21=(Token)match(input,76,FOLLOW_76_in_func_decl568);
			stream_76.add(char_literal21);

			pushFollow(FOLLOW_atom_typename_in_func_decl570);
			atom_typename22=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename22.getTree());
			pushFollow(FOLLOW_var_decl_list_in_func_decl572);
			var_decl_list23=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list23.getTree());
			pushFollow(FOLLOW_block_in_func_decl574);
			block24=block();
			state._fsp--;

			stream_block.add(block24.getTree());
			// AST REWRITE
			// elements: atom_typename, var_decl_list, IDF, param_list, block
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:79: -> ^( FUNC_DECL IDF param_list atom_typename var_decl_list block )
			{
				// Leac.g:82:82: ^( FUNC_DECL IDF param_list atom_typename var_decl_list block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				adaptor.addChild(root_1, stream_IDF.nextNode());
				adaptor.addChild(root_1, stream_param_list.nextTree());
				adaptor.addChild(root_1, stream_atom_typename.nextTree());
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func_decl"


	public static class typename_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "typename"
	// Leac.g:85:1: typename : ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename );
	public final LeacParser.typename_return typename() throws RecognitionException {
		LeacParser.typename_return retval = new LeacParser.typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom_typename25 =null;
		ParserRuleReturnScope array_typename26 =null;

		RewriteRuleSubtreeStream stream_array_typename=new RewriteRuleSubtreeStream(adaptor,"rule array_typename");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");

		try {
			// Leac.g:86:5: ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 89 && LA4_0 <= 90)||LA4_0==93||LA4_0==96||LA4_0==104||LA4_0==107) ) {
				alt4=1;
			}
			else if ( (LA4_0==88) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Leac.g:86:7: atom_typename
					{
					pushFollow(FOLLOW_atom_typename_in_typename607);
					atom_typename25=atom_typename();
					state._fsp--;

					stream_atom_typename.add(atom_typename25.getTree());
					// AST REWRITE
					// elements: atom_typename
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 86:21: -> ^( ATOM atom_typename )
					{
						// Leac.g:86:24: ^( ATOM atom_typename )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOM, "ATOM"), root_1);
						adaptor.addChild(root_1, stream_atom_typename.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:87:7: array_typename
					{
					pushFollow(FOLLOW_array_typename_in_typename623);
					array_typename26=array_typename();
					state._fsp--;

					stream_array_typename.add(array_typename26.getTree());
					// AST REWRITE
					// elements: array_typename
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 87:22: -> array_typename
					{
						adaptor.addChild(root_0, stream_array_typename.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typename"


	public static class atom_typename_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom_typename"
	// Leac.g:90:1: atom_typename : ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME | 'string' -> STRING_TYPENAME );
	public final LeacParser.atom_typename_return atom_typename() throws RecognitionException {
		LeacParser.atom_typename_return retval = new LeacParser.atom_typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token string_literal30=null;
		Token string_literal31=null;
		Token string_literal32=null;

		Object string_literal27_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;
		Object string_literal30_tree=null;
		Object string_literal31_tree=null;
		Object string_literal32_tree=null;
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");

		try {
			// Leac.g:91:5: ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME | 'string' -> STRING_TYPENAME )
			int alt5=6;
			switch ( input.LA(1) ) {
			case 107:
				{
				alt5=1;
				}
				break;
			case 89:
				{
				alt5=2;
				}
				break;
			case 96:
				{
				alt5=3;
				}
				break;
			case 93:
				{
				alt5=4;
				}
				break;
			case 90:
				{
				alt5=5;
				}
				break;
			case 104:
				{
				alt5=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Leac.g:91:7: 'void'
					{
					string_literal27=(Token)match(input,107,FOLLOW_107_in_atom_typename644);
					stream_107.add(string_literal27);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 91:14: -> VOID_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(VOID_TYPENAME, "VOID_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:92:7: 'bool'
					{
					string_literal28=(Token)match(input,89,FOLLOW_89_in_atom_typename656);
					stream_89.add(string_literal28);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 92:14: -> BOOL_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:93:7: 'int'
					{
					string_literal29=(Token)match(input,96,FOLLOW_96_in_atom_typename668);
					stream_96.add(string_literal29);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 93:13: -> INT_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:94:7: 'float'
					{
					string_literal30=(Token)match(input,93,FOLLOW_93_in_atom_typename680);
					stream_93.add(string_literal30);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 94:15: -> FLOAT_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:95:7: 'char'
					{
					string_literal31=(Token)match(input,90,FOLLOW_90_in_atom_typename692);
					stream_90.add(string_literal31);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 95:14: -> CHAR_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Leac.g:96:7: 'string'
					{
					string_literal32=(Token)match(input,104,FOLLOW_104_in_atom_typename704);
					stream_104.add(string_literal32);

					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 96:16: -> STRING_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom_typename"


	public static class array_typename_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "array_typename"
	// Leac.g:99:1: array_typename : 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) ;
	public final LeacParser.array_typename_return array_typename() throws RecognitionException {
		LeacParser.array_typename_return retval = new LeacParser.array_typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal33=null;
		Token char_literal34=null;
		Token char_literal36=null;
		Token string_literal37=null;
		ParserRuleReturnScope range_list35 =null;
		ParserRuleReturnScope atom_typename38 =null;

		Object string_literal33_tree=null;
		Object char_literal34_tree=null;
		Object char_literal36_tree=null;
		Object string_literal37_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");
		RewriteRuleSubtreeStream stream_range_list=new RewriteRuleSubtreeStream(adaptor,"rule range_list");

		try {
			// Leac.g:100:5: ( 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) )
			// Leac.g:100:7: 'array' '[' range_list ']' 'of' atom_typename
			{
			string_literal33=(Token)match(input,88,FOLLOW_88_in_array_typename725);
			stream_88.add(string_literal33);

			char_literal34=(Token)match(input,84,FOLLOW_84_in_array_typename727);
			stream_84.add(char_literal34);

			pushFollow(FOLLOW_range_list_in_array_typename729);
			range_list35=range_list();
			state._fsp--;

			stream_range_list.add(range_list35.getTree());
			char_literal36=(Token)match(input,85,FOLLOW_85_in_array_typename731);
			stream_85.add(char_literal36);

			string_literal37=(Token)match(input,98,FOLLOW_98_in_array_typename733);
			stream_98.add(string_literal37);

			pushFollow(FOLLOW_atom_typename_in_array_typename735);
			atom_typename38=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename38.getTree());
			// AST REWRITE
			// elements: atom_typename, range_list
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:53: -> ^( ARRAY atom_typename range_list )
			{
				// Leac.g:100:56: ^( ARRAY atom_typename range_list )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				adaptor.addChild(root_1, stream_atom_typename.nextTree());
				adaptor.addChild(root_1, stream_range_list.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_typename"


	public static class range_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range_list"
	// Leac.g:103:1: range_list : range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) ;
	public final LeacParser.range_list_return range_list() throws RecognitionException {
		LeacParser.range_list_return retval = new LeacParser.range_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal40=null;
		ParserRuleReturnScope range39 =null;
		ParserRuleReturnScope range41 =null;

		Object char_literal40_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");

		try {
			// Leac.g:104:5: ( range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) )
			// Leac.g:104:7: range ( ',' range )*
			{
			pushFollow(FOLLOW_range_in_range_list762);
			range39=range();
			state._fsp--;

			stream_range.add(range39.getTree());
			// Leac.g:104:13: ( ',' range )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==72) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Leac.g:104:14: ',' range
					{
					char_literal40=(Token)match(input,72,FOLLOW_72_in_range_list765);
					stream_72.add(char_literal40);

					pushFollow(FOLLOW_range_in_range_list767);
					range41=range();
					state._fsp--;

					stream_range.add(range41.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: range
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 104:26: -> ^( RANGE_LIST ( range )+ )
			{
				// Leac.g:104:29: ^( RANGE_LIST ( range )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE_LIST, "RANGE_LIST"), root_1);
				if ( !(stream_range.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_range.hasNext() ) {
					adaptor.addChild(root_1, stream_range.nextTree());
				}
				stream_range.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_list"


	public static class range_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "range"
	// Leac.g:106:1: range : inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) ;
	public final LeacParser.range_return range() throws RecognitionException {
		LeacParser.range_return retval = new LeacParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal42=null;
		ParserRuleReturnScope inf =null;
		ParserRuleReturnScope sup =null;

		Object string_literal42_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_int_ext=new RewriteRuleSubtreeStream(adaptor,"rule int_ext");

		try {
			// Leac.g:107:5: (inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) )
			// Leac.g:107:7: inf= int_ext '..' sup= int_ext
			{
			pushFollow(FOLLOW_int_ext_in_range796);
			inf=int_ext();
			state._fsp--;

			stream_int_ext.add(inf.getTree());
			string_literal42=(Token)match(input,74,FOLLOW_74_in_range798);
			stream_74.add(string_literal42);

			pushFollow(FOLLOW_int_ext_in_range802);
			sup=int_ext();
			state._fsp--;

			stream_int_ext.add(sup.getTree());
			// AST REWRITE
			// elements: sup, inf
			// token labels:
			// rule labels: inf, retval, sup
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inf=new RewriteRuleSubtreeStream(adaptor,"rule inf",inf!=null?inf.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_sup=new RewriteRuleSubtreeStream(adaptor,"rule sup",sup!=null?sup.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 107:36: -> ^( RANGE $inf $sup)
			{
				// Leac.g:107:39: ^( RANGE $inf $sup)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE, "RANGE"), root_1);
				adaptor.addChild(root_1, stream_inf.nextTree());
				adaptor.addChild(root_1, stream_sup.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class int_ext_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "int_ext"
	// Leac.g:110:1: int_ext : ( INT -> INT | '-' INT -> INT );
	public final LeacParser.int_ext_return int_ext() throws RecognitionException {
		LeacParser.int_ext_return retval = new LeacParser.int_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT43=null;
		Token char_literal44=null;
		Token INT45=null;

		Object INT43_tree=null;
		Object char_literal44_tree=null;
		Object INT45_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:111:5: ( INT -> INT | '-' INT -> INT )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==INT) ) {
				alt7=1;
			}
			else if ( (LA7_0==73) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Leac.g:111:7: INT
					{
					INT43=(Token)match(input,INT,FOLLOW_INT_in_int_ext831);
					stream_INT.add(INT43);

					// AST REWRITE
					// elements: INT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 111:11: -> INT
					{
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:112:7: '-' INT
					{
					char_literal44=(Token)match(input,73,FOLLOW_73_in_int_ext843);
					stream_73.add(char_literal44);

					INT45=(Token)match(input,INT,FOLLOW_INT_in_int_ext845);
					stream_INT.add(INT45);

					 INT45.setText("-" + INT45.getText());
					// AST REWRITE
					// elements: INT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 112:55: -> INT
					{
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "int_ext"


	public static class param_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// Leac.g:115:1: param_list : ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) );
	public final LeacParser.param_list_return param_list() throws RecognitionException {
		LeacParser.param_list_return retval = new LeacParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal47=null;
		ParserRuleReturnScope param46 =null;
		ParserRuleReturnScope param48 =null;

		Object char_literal47_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// Leac.g:116:5: ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==69) ) {
				alt9=1;
			}
			else if ( (LA9_0==IDF||LA9_0==102) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Leac.g:116:21:
					{
					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 116:21: -> ^( PARAM_LIST )
					{
						// Leac.g:116:24: ^( PARAM_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:117:7: param ( ',' param )*
					{
					pushFollow(FOLLOW_param_in_param_list882);
					param46=param();
					state._fsp--;

					stream_param.add(param46.getTree());
					// Leac.g:117:13: ( ',' param )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==72) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Leac.g:117:14: ',' param
							{
							char_literal47=(Token)match(input,72,FOLLOW_72_in_param_list885);
							stream_72.add(char_literal47);

							pushFollow(FOLLOW_param_in_param_list887);
							param48=param();
							state._fsp--;

							stream_param.add(param48.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					// AST REWRITE
					// elements: param
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 117:26: -> ^( PARAM_LIST ( param )+ )
					{
						// Leac.g:117:29: ^( PARAM_LIST ( param )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						if ( !(stream_param.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_param.hasNext() ) {
							adaptor.addChild(root_1, stream_param.nextTree());
						}
						stream_param.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param_list"


	public static class param_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param"
	// Leac.g:119:1: param : ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) );
	public final LeacParser.param_return param() throws RecognitionException {
		LeacParser.param_return retval = new LeacParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF49=null;
		Token char_literal50=null;
		Token string_literal52=null;
		Token IDF53=null;
		Token char_literal54=null;
		ParserRuleReturnScope typename51 =null;
		ParserRuleReturnScope typename55 =null;

		Object IDF49_tree=null;
		Object char_literal50_tree=null;
		Object string_literal52_tree=null;
		Object IDF53_tree=null;
		Object char_literal54_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try {
			// Leac.g:120:5: ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IDF) ) {
				alt10=1;
			}
			else if ( (LA10_0==102) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Leac.g:120:7: IDF ':' typename
					{
					IDF49=(Token)match(input,IDF,FOLLOW_IDF_in_param914);
					stream_IDF.add(IDF49);

					char_literal50=(Token)match(input,76,FOLLOW_76_in_param916);
					stream_76.add(char_literal50);

					pushFollow(FOLLOW_typename_in_param918);
					typename51=typename();
					state._fsp--;

					stream_typename.add(typename51.getTree());
					// AST REWRITE
					// elements: IDF, typename
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 120:24: -> ^( PARAM typename BY_COPY IDF )
					{
						// Leac.g:120:27: ^( PARAM typename BY_COPY IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						adaptor.addChild(root_1, stream_typename.nextTree());
						adaptor.addChild(root_1, (Object)adaptor.create(BY_COPY, "BY_COPY"));
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:121:7: 'ref' IDF ':' typename
					{
					string_literal52=(Token)match(input,102,FOLLOW_102_in_param938);
					stream_102.add(string_literal52);

					IDF53=(Token)match(input,IDF,FOLLOW_IDF_in_param940);
					stream_IDF.add(IDF53);

					char_literal54=(Token)match(input,76,FOLLOW_76_in_param942);
					stream_76.add(char_literal54);

					pushFollow(FOLLOW_typename_in_param944);
					typename55=typename();
					state._fsp--;

					stream_typename.add(typename55.getTree());
					// AST REWRITE
					// elements: typename, IDF
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 121:30: -> ^( PARAM typename BY_REF IDF )
					{
						// Leac.g:121:33: ^( PARAM typename BY_REF IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						adaptor.addChild(root_1, stream_typename.nextTree());
						adaptor.addChild(root_1, (Object)adaptor.create(BY_REF, "BY_REF"));
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "param"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Leac.g:124:1: statement : ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write );
	public final LeacParser.statement_return statement() throws RecognitionException {
		LeacParser.statement_return retval = new LeacParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope conditional56 =null;
		ParserRuleReturnScope loop57 =null;
		ParserRuleReturnScope affect_or_procedure_call58 =null;
		ParserRuleReturnScope returning59 =null;
		ParserRuleReturnScope block60 =null;
		ParserRuleReturnScope read61 =null;
		ParserRuleReturnScope write62 =null;

		RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
		RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
		RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
		RewriteRuleSubtreeStream stream_returning=new RewriteRuleSubtreeStream(adaptor,"rule returning");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_affect_or_procedure_call=new RewriteRuleSubtreeStream(adaptor,"rule affect_or_procedure_call");
		RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");

		try {
			// Leac.g:125:5: ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write )
			int alt11=7;
			switch ( input.LA(1) ) {
			case 95:
				{
				alt11=1;
				}
				break;
			case 108:
				{
				alt11=2;
				}
				break;
			case IDF:
				{
				alt11=3;
				}
				break;
			case 103:
				{
				alt11=4;
				}
				break;
			case 110:
				{
				alt11=5;
				}
				break;
			case 101:
				{
				alt11=6;
				}
				break;
			case 109:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// Leac.g:125:7: conditional
					{
					pushFollow(FOLLOW_conditional_in_statement973);
					conditional56=conditional();
					state._fsp--;

					stream_conditional.add(conditional56.getTree());
					// AST REWRITE
					// elements: conditional
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 125:19: -> conditional
					{
						adaptor.addChild(root_0, stream_conditional.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:126:7: loop
					{
					pushFollow(FOLLOW_loop_in_statement985);
					loop57=loop();
					state._fsp--;

					stream_loop.add(loop57.getTree());
					// AST REWRITE
					// elements: loop
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 126:12: -> loop
					{
						adaptor.addChild(root_0, stream_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:127:7: affect_or_procedure_call
					{
					pushFollow(FOLLOW_affect_or_procedure_call_in_statement997);
					affect_or_procedure_call58=affect_or_procedure_call();
					state._fsp--;

					stream_affect_or_procedure_call.add(affect_or_procedure_call58.getTree());
					// AST REWRITE
					// elements: affect_or_procedure_call
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 127:32: -> affect_or_procedure_call
					{
						adaptor.addChild(root_0, stream_affect_or_procedure_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:128:7: returning
					{
					pushFollow(FOLLOW_returning_in_statement1009);
					returning59=returning();
					state._fsp--;

					stream_returning.add(returning59.getTree());
					// AST REWRITE
					// elements: returning
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 128:17: -> returning
					{
						adaptor.addChild(root_0, stream_returning.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:129:7: block
					{
					pushFollow(FOLLOW_block_in_statement1021);
					block60=block();
					state._fsp--;

					stream_block.add(block60.getTree());
					// AST REWRITE
					// elements: block
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 129:13: -> block
					{
						adaptor.addChild(root_0, stream_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Leac.g:130:7: read
					{
					pushFollow(FOLLOW_read_in_statement1033);
					read61=read();
					state._fsp--;

					stream_read.add(read61.getTree());
					// AST REWRITE
					// elements: read
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 130:12: -> read
					{
						adaptor.addChild(root_0, stream_read.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Leac.g:131:7: write
					{
					pushFollow(FOLLOW_write_in_statement1045);
					write62=write();
					state._fsp--;

					stream_write.add(write62.getTree());
					// AST REWRITE
					// elements: write
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 131:13: -> write
					{
						adaptor.addChild(root_0, stream_write.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class conditional_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// Leac.g:134:1: conditional : 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) ) ;
	public final LeacParser.conditional_return conditional() throws RecognitionException {
		LeacParser.conditional_return retval = new LeacParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal63=null;
		Token string_literal65=null;
		Token string_literal66=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope second =null;
		ParserRuleReturnScope expr64 =null;

		Object string_literal63_tree=null;
		Object string_literal65_tree=null;
		Object string_literal66_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:135:5: ( 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) ) )
			// Leac.g:135:7: 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) )
			{
			string_literal63=(Token)match(input,95,FOLLOW_95_in_conditional1066);
			stream_95.add(string_literal63);

			pushFollow(FOLLOW_expr_in_conditional1068);
			expr64=expr();
			state._fsp--;

			stream_expr.add(expr64.getTree());
			string_literal65=(Token)match(input,105,FOLLOW_105_in_conditional1070);
			stream_105.add(string_literal65);

			pushFollow(FOLLOW_statement_in_conditional1074);
			first=statement();
			state._fsp--;

			stream_statement.add(first.getTree());
			// Leac.g:136:9: ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==92) ) {
				alt12=1;
			}
			else if ( (LA12_0==EOF||LA12_0==77||LA12_0==111) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Leac.g:136:39: 'else' second= statement
					{
					string_literal66=(Token)match(input,92,FOLLOW_92_in_conditional1098);
					stream_92.add(string_literal66);

					pushFollow(FOLLOW_statement_in_conditional1102);
					second=statement();
					state._fsp--;

					stream_statement.add(second.getTree());
					// AST REWRITE
					// elements: expr, first, second
					// token labels:
					// rule labels: first, retval, second
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_second=new RewriteRuleSubtreeStream(adaptor,"rule second",second!=null?second.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 136:63: -> ^( CONDITIONAL expr $first $second)
					{
						// Leac.g:136:66: ^( CONDITIONAL expr $first $second)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_first.nextTree());
						adaptor.addChild(root_1, stream_second.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:137:25:
					{
					// AST REWRITE
					// elements: first, expr
					// token labels:
					// rule labels: first, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 137:25: -> ^( CONDITIONAL expr $first ^( BLOCK ) )
					{
						// Leac.g:137:28: ^( CONDITIONAL expr $first ^( BLOCK ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_first.nextTree());
						// Leac.g:137:54: ^( BLOCK )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_2);
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional"


	public static class loop_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "loop"
	// Leac.g:141:1: loop : 'while' expr 'do' statement -> ^( LOOP expr statement ) ;
	public final LeacParser.loop_return loop() throws RecognitionException {
		LeacParser.loop_return retval = new LeacParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal67=null;
		Token string_literal69=null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope statement70 =null;

		Object string_literal67_tree=null;
		Object string_literal69_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:142:5: ( 'while' expr 'do' statement -> ^( LOOP expr statement ) )
			// Leac.g:142:7: 'while' expr 'do' statement
			{
			string_literal67=(Token)match(input,108,FOLLOW_108_in_loop1170);
			stream_108.add(string_literal67);

			pushFollow(FOLLOW_expr_in_loop1172);
			expr68=expr();
			state._fsp--;

			stream_expr.add(expr68.getTree());
			string_literal69=(Token)match(input,91,FOLLOW_91_in_loop1174);
			stream_91.add(string_literal69);

			pushFollow(FOLLOW_statement_in_loop1176);
			statement70=statement();
			state._fsp--;

			stream_statement.add(statement70.getTree());
			// AST REWRITE
			// elements: statement, expr
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 142:35: -> ^( LOOP expr statement )
			{
				// Leac.g:142:38: ^( LOOP expr statement )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOP, "LOOP"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_1, stream_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "loop"


	public static class coord_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "coord_list"
	// Leac.g:145:1: coord_list : expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) ;
	public final LeacParser.coord_list_return coord_list() throws RecognitionException {
		LeacParser.coord_list_return retval = new LeacParser.coord_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal72=null;
		ParserRuleReturnScope expr71 =null;
		ParserRuleReturnScope expr73 =null;

		Object char_literal72_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:146:5: ( expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) )
			// Leac.g:146:7: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_coord_list1203);
			expr71=expr();
			state._fsp--;

			stream_expr.add(expr71.getTree());
			// Leac.g:146:12: ( ',' expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==72) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Leac.g:146:13: ',' expr
					{
					char_literal72=(Token)match(input,72,FOLLOW_72_in_coord_list1206);
					stream_72.add(char_literal72);

					pushFollow(FOLLOW_expr_in_coord_list1208);
					expr73=expr();
					state._fsp--;

					stream_expr.add(expr73.getTree());
					}
					break;

				default :
					break loop13;
				}
			}

			// AST REWRITE
			// elements: expr
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 146:24: -> ^( COORD_LIST ( expr )+ )
			{
				// Leac.g:146:27: ^( COORD_LIST ( expr )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COORD_LIST, "COORD_LIST"), root_1);
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "coord_list"


	public static class returning_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "returning"
	// Leac.g:149:1: returning : 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) ;
	public final LeacParser.returning_return returning() throws RecognitionException {
		LeacParser.returning_return retval = new LeacParser.returning_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal74=null;
		ParserRuleReturnScope expr75 =null;

		Object string_literal74_tree=null;
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:150:5: ( 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) )
			// Leac.g:150:7: 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			{
			string_literal74=(Token)match(input,103,FOLLOW_103_in_returning1236);
			stream_103.add(string_literal74);

			// Leac.g:151:9: ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EOF||LA14_0==77||LA14_0==92||LA14_0==111) ) {
				alt14=1;
			}
			else if ( (LA14_0==BOOL||LA14_0==CHAR||LA14_0==FLOAT||LA14_0==IDF||LA14_0==INT||LA14_0==STRING||LA14_0==68||LA14_0==73||LA14_0==97) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Leac.g:151:25:
					{
					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 151:25: -> ^( RETURNING NO_RETURN_VALUE )
					{
						// Leac.g:151:28: ^( RETURNING NO_RETURN_VALUE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(NO_RETURN_VALUE, "NO_RETURN_VALUE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:152:11: expr
					{
					pushFollow(FOLLOW_expr_in_returning1268);
					expr75=expr();
					state._fsp--;

					stream_expr.add(expr75.getTree());
					// AST REWRITE
					// elements: expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 152:16: -> ^( RETURNING expr )
					{
						// Leac.g:152:19: ^( RETURNING expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returning"


	public static class affect_or_procedure_call_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "affect_or_procedure_call"
	// Leac.g:156:1: affect_or_procedure_call : IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) ;
	public final LeacParser.affect_or_procedure_call_return affect_or_procedure_call() throws RecognitionException {
		LeacParser.affect_or_procedure_call_return retval = new LeacParser.affect_or_procedure_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token char_literal80=null;
		Token char_literal82=null;
		Token char_literal84=null;
		ParserRuleReturnScope coord_list78 =null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope arg_list83 =null;

		Object IDF76_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		Object char_literal80_tree=null;
		Object char_literal82_tree=null;
		Object char_literal84_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try {
			// Leac.g:157:5: ( IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) )
			// Leac.g:157:7: IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			{
			IDF76=(Token)match(input,IDF,FOLLOW_IDF_in_affect_or_procedure_call1303);
			stream_IDF.add(IDF76);

			// Leac.g:158:9: ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==80||LA16_0==84) ) {
				alt16=1;
			}
			else if ( (LA16_0==68) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Leac.g:159:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr
					{
					// Leac.g:159:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==80) ) {
						alt15=1;
					}
					else if ( (LA15_0==84) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// Leac.g:159:29:
							{
							// AST REWRITE
							// elements: IDF
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 159:29: -> ^( VAR IDF )
							{
								// Leac.g:159:32: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Leac.g:160:15: '[' coord_list ']'
							{
							char_literal77=(Token)match(input,84,FOLLOW_84_in_affect_or_procedure_call1353);
							stream_84.add(char_literal77);

							pushFollow(FOLLOW_coord_list_in_affect_or_procedure_call1355);
							coord_list78=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list78.getTree());
							char_literal79=(Token)match(input,85,FOLLOW_85_in_affect_or_procedure_call1357);
							stream_85.add(char_literal79);

							// AST REWRITE
							// elements: coord_list, IDF
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 160:34: -> ^( CELL IDF coord_list )
							{
								// Leac.g:160:37: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					char_literal80=(Token)match(input,80,FOLLOW_80_in_affect_or_procedure_call1395);
					stream_80.add(char_literal80);

					pushFollow(FOLLOW_expr_in_affect_or_procedure_call1397);
					expr81=expr();
					state._fsp--;

					stream_expr.add(expr81.getTree());
					// AST REWRITE
					// elements: affect_or_procedure_call, expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 162:22: -> ^( AFFECT $affect_or_procedure_call expr )
					{
						// Leac.g:162:25: ^( AFFECT $affect_or_procedure_call expr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:163:11: '(' arg_list ')'
					{
					char_literal82=(Token)match(input,68,FOLLOW_68_in_affect_or_procedure_call1420);
					stream_68.add(char_literal82);

					pushFollow(FOLLOW_arg_list_in_affect_or_procedure_call1422);
					arg_list83=arg_list();
					state._fsp--;

					stream_arg_list.add(arg_list83.getTree());
					char_literal84=(Token)match(input,69,FOLLOW_69_in_affect_or_procedure_call1424);
					stream_69.add(char_literal84);

					// AST REWRITE
					// elements: IDF, arg_list
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 163:28: -> ^( PROCEDURE_CALL IDF arg_list )
					{
						// Leac.g:163:31: ^( PROCEDURE_CALL IDF arg_list )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_CALL, "PROCEDURE_CALL"), root_1);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_1, stream_arg_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "affect_or_procedure_call"


	public static class arg_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arg_list"
	// Leac.g:167:1: arg_list : ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) );
	public final LeacParser.arg_list_return arg_list() throws RecognitionException {
		LeacParser.arg_list_return retval = new LeacParser.arg_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal86=null;
		ParserRuleReturnScope expr85 =null;
		ParserRuleReturnScope expr87 =null;

		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:168:5: ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==69) ) {
				alt18=1;
			}
			else if ( (LA18_0==BOOL||LA18_0==CHAR||LA18_0==FLOAT||LA18_0==IDF||LA18_0==INT||LA18_0==STRING||LA18_0==68||LA18_0==73||LA18_0==97) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Leac.g:168:21:
					{
					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 168:21: -> ^( ARG_LIST )
					{
						// Leac.g:168:24: ^( ARG_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:169:7: expr ( ',' expr )*
					{
					pushFollow(FOLLOW_expr_in_arg_list1475);
					expr85=expr();
					state._fsp--;

					stream_expr.add(expr85.getTree());
					// Leac.g:169:12: ( ',' expr )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==72) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Leac.g:169:13: ',' expr
							{
							char_literal86=(Token)match(input,72,FOLLOW_72_in_arg_list1478);
							stream_72.add(char_literal86);

							pushFollow(FOLLOW_expr_in_arg_list1480);
							expr87=expr();
							state._fsp--;

							stream_expr.add(expr87.getTree());
							}
							break;

						default :
							break loop17;
						}
					}

					// AST REWRITE
					// elements: expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 169:24: -> ^( ARG_LIST ( expr )+ )
					{
						// Leac.g:169:27: ^( ARG_LIST ( expr )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						if ( !(stream_expr.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expr.hasNext() ) {
							adaptor.addChild(root_1, stream_expr.nextTree());
						}
						stream_expr.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg_list"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Leac.g:172:1: block : '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' ;
	public final LeacParser.block_return block() throws RecognitionException {
		LeacParser.block_return retval = new LeacParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal88=null;
		Token char_literal90=null;
		Token char_literal92=null;
		ParserRuleReturnScope statement89 =null;
		ParserRuleReturnScope statement91 =null;

		Object char_literal88_tree=null;
		Object char_literal90_tree=null;
		Object char_literal92_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// Leac.g:173:5: ( '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' )
			// Leac.g:173:7: '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}'
			{
			char_literal88=(Token)match(input,110,FOLLOW_110_in_block1508);
			stream_110.add(char_literal88);

			// Leac.g:174:9: ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==111) ) {
				alt20=1;
			}
			else if ( (LA20_0==IDF||LA20_0==95||LA20_0==101||LA20_0==103||(LA20_0 >= 108 && LA20_0 <= 110)) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Leac.g:174:25:
					{
					// AST REWRITE
					// elements:
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 174:25: -> ^( BLOCK )
					{
						// Leac.g:174:28: ^( BLOCK )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:175:11: statement ( ';' statement )*
					{
					pushFollow(FOLLOW_statement_in_block1538);
					statement89=statement();
					state._fsp--;

					stream_statement.add(statement89.getTree());
					// Leac.g:175:21: ( ';' statement )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==77) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Leac.g:175:22: ';' statement
							{
							char_literal90=(Token)match(input,77,FOLLOW_77_in_block1541);
							stream_77.add(char_literal90);

							pushFollow(FOLLOW_statement_in_block1543);
							statement91=statement();
							state._fsp--;

							stream_statement.add(statement91.getTree());
							}
							break;

						default :
							break loop19;
						}
					}

					// AST REWRITE
					// elements: statement
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 175:38: -> ^( BLOCK ( statement )+ )
					{
						// Leac.g:175:41: ^( BLOCK ( statement )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						if ( !(stream_statement.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_statement.hasNext() ) {
							adaptor.addChild(root_1, stream_statement.nextTree());
						}
						stream_statement.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			char_literal92=(Token)match(input,111,FOLLOW_111_in_block1572);
			stream_111.add(char_literal92);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class read_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "read"
	// Leac.g:180:1: read : 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) ;
	public final LeacParser.read_return read() throws RecognitionException {
		LeacParser.read_return retval = new LeacParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal93=null;
		Token IDF94=null;
		Token char_literal95=null;
		Token char_literal97=null;
		ParserRuleReturnScope coord_list96 =null;

		Object string_literal93_tree=null;
		Object IDF94_tree=null;
		Object char_literal95_tree=null;
		Object char_literal97_tree=null;
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try {
			// Leac.g:181:5: ( 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) )
			// Leac.g:181:7: 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			{
			string_literal93=(Token)match(input,101,FOLLOW_101_in_read1589);
			stream_101.add(string_literal93);

			IDF94=(Token)match(input,IDF,FOLLOW_IDF_in_read1591);
			stream_IDF.add(IDF94);

			// Leac.g:182:9: ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EOF||LA21_0==77||LA21_0==92||LA21_0==111) ) {
				alt21=1;
			}
			else if ( (LA21_0==84) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Leac.g:182:25:
					{
					// AST REWRITE
					// elements: IDF
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 182:25: -> ^( READ ^( VAR IDF ) )
					{
						// Leac.g:182:28: ^( READ ^( VAR IDF ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						// Leac.g:182:35: ^( VAR IDF )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);
						adaptor.addChild(root_2, stream_IDF.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:183:11: '[' coord_list ']'
					{
					char_literal95=(Token)match(input,84,FOLLOW_84_in_read1627);
					stream_84.add(char_literal95);

					pushFollow(FOLLOW_coord_list_in_read1629);
					coord_list96=coord_list();
					state._fsp--;

					stream_coord_list.add(coord_list96.getTree());
					char_literal97=(Token)match(input,85,FOLLOW_85_in_read1631);
					stream_85.add(char_literal97);

					// AST REWRITE
					// elements: coord_list, IDF
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 183:30: -> ^( READ ^( CELL IDF coord_list ) )
					{
						// Leac.g:183:33: ^( READ ^( CELL IDF coord_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						// Leac.g:183:40: ^( CELL IDF coord_list )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_2);
						adaptor.addChild(root_2, stream_IDF.nextNode());
						adaptor.addChild(root_2, stream_coord_list.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read"


	public static class write_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "write"
	// Leac.g:187:1: write : 'write' expr -> ^( WRITE expr ) ;
	public final LeacParser.write_return write() throws RecognitionException {
		LeacParser.write_return retval = new LeacParser.write_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal98=null;
		ParserRuleReturnScope expr99 =null;

		Object string_literal98_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:188:5: ( 'write' expr -> ^( WRITE expr ) )
			// Leac.g:188:7: 'write' expr
			{
			string_literal98=(Token)match(input,109,FOLLOW_109_in_write1672);
			stream_109.add(string_literal98);

			pushFollow(FOLLOW_expr_in_write1674);
			expr99=expr();
			state._fsp--;

			stream_expr.add(expr99.getTree());
			// AST REWRITE
			// elements: expr
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 188:20: -> ^( WRITE expr )
			{
				// Leac.g:188:23: ^( WRITE expr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "write"


	public static class expr_0_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_0"
	// Leac.g:191:1: expr_0 : ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr );
	public final LeacParser.expr_0_return expr_0() throws RecognitionException {
		LeacParser.expr_0_return retval = new LeacParser.expr_0_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF100=null;
		Token char_literal101=null;
		Token char_literal103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token char_literal108=null;
		Token char_literal110=null;
		ParserRuleReturnScope arg_list102 =null;
		ParserRuleReturnScope coord_list105 =null;
		ParserRuleReturnScope constant107 =null;
		ParserRuleReturnScope expr109 =null;

		Object IDF100_tree=null;
		Object char_literal101_tree=null;
		Object char_literal103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object char_literal108_tree=null;
		Object char_literal110_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try {
			// Leac.g:192:5: ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr )
			int alt23=3;
			switch ( input.LA(1) ) {
			case IDF:
				{
				alt23=1;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				alt23=2;
				}
				break;
			case 68:
				{
				alt23=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// Leac.g:192:7: IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					{
					IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_expr_01699);
					stream_IDF.add(IDF100);

					// Leac.g:193:9: ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt22=3;
					switch ( input.LA(1) ) {
					case EOF:
					case 67:
					case 69:
					case 70:
					case 71:
					case 72:
					case 73:
					case 75:
					case 77:
					case 78:
					case 79:
					case 81:
					case 82:
					case 83:
					case 85:
					case 86:
					case 87:
					case 91:
					case 92:
					case 99:
					case 105:
					case 111:
						{
						alt22=1;
						}
						break;
					case 68:
						{
						alt22=2;
						}
						break;
					case 84:
						{
						alt22=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}
					switch (alt22) {
						case 1 :
							// Leac.g:193:25:
							{
							// AST REWRITE
							// elements: IDF
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 193:25: -> ^( VAR IDF )
							{
								// Leac.g:193:28: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Leac.g:194:11: '(' arg_list ')'
							{
							char_literal101=(Token)match(input,68,FOLLOW_68_in_expr_01731);
							stream_68.add(char_literal101);

							pushFollow(FOLLOW_arg_list_in_expr_01733);
							arg_list102=arg_list();
							state._fsp--;

							stream_arg_list.add(arg_list102.getTree());
							char_literal103=(Token)match(input,69,FOLLOW_69_in_expr_01735);
							stream_69.add(char_literal103);

							// AST REWRITE
							// elements: IDF, arg_list
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 194:28: -> ^( FUNC_CALL IDF arg_list )
							{
								// Leac.g:194:31: ^( FUNC_CALL IDF arg_list )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_1, stream_arg_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							// Leac.g:195:11: '[' coord_list ']'
							{
							char_literal104=(Token)match(input,84,FOLLOW_84_in_expr_01757);
							stream_84.add(char_literal104);

							pushFollow(FOLLOW_coord_list_in_expr_01759);
							coord_list105=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list105.getTree());
							char_literal106=(Token)match(input,85,FOLLOW_85_in_expr_01761);
							stream_85.add(char_literal106);

							// AST REWRITE
							// elements: IDF, coord_list
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 195:30: -> ^( CELL IDF coord_list )
							{
								// Leac.g:195:33: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// Leac.g:197:7: constant
					{
					pushFollow(FOLLOW_constant_in_expr_01789);
					constant107=constant();
					state._fsp--;

					stream_constant.add(constant107.getTree());
					// AST REWRITE
					// elements: constant
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 197:16: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:198:7: '(' expr ')'
					{
					char_literal108=(Token)match(input,68,FOLLOW_68_in_expr_01801);
					stream_68.add(char_literal108);

					pushFollow(FOLLOW_expr_in_expr_01803);
					expr109=expr();
					state._fsp--;

					stream_expr.add(expr109.getTree());
					char_literal110=(Token)match(input,69,FOLLOW_69_in_expr_01805);
					stream_69.add(char_literal110);

					// AST REWRITE
					// elements: expr
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 198:20: -> expr
					{
						adaptor.addChild(root_0, stream_expr.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_0"


	public static class expr_1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_1"
	// Leac.g:201:1: expr_1 : ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? ;
	public final LeacParser.expr_1_return expr_1() throws RecognitionException {
		LeacParser.expr_1_return retval = new LeacParser.expr_1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_0111 =null;

		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expr_1_proxy=new RewriteRuleSubtreeStream(adaptor,"rule expr_1_proxy");
		RewriteRuleSubtreeStream stream_expr_0=new RewriteRuleSubtreeStream(adaptor,"rule expr_0");

		try {
			// Leac.g:202:5: ( ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? )
			// Leac.g:202:7: ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			{
			// Leac.g:202:7: ( expr_0 -> expr_0 )
			// Leac.g:202:8: expr_0
			{
			pushFollow(FOLLOW_expr_0_in_expr_11827);
			expr_0111=expr_0();
			state._fsp--;

			stream_expr_0.add(expr_0111.getTree());
			// AST REWRITE
			// elements: expr_0
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 202:15: -> expr_0
			{
				adaptor.addChild(root_0, stream_expr_0.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:203:9: ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==86) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// Leac.g:203:11: '^' next= expr_1_proxy
					{
					char_literal112=(Token)match(input,86,FOLLOW_86_in_expr_11844);
					stream_86.add(char_literal112);

					pushFollow(FOLLOW_expr_1_proxy_in_expr_11848);
					next=expr_1_proxy();
					state._fsp--;

					stream_expr_1_proxy.add(next.getTree());
					// AST REWRITE
					// elements: expr_1, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 203:33: -> ^( POW $expr_1 $next)
					{
						// Leac.g:203:36: ^( POW $expr_1 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POW, "POW"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_1"


	public static class expr_1_proxy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_1_proxy"
	// Leac.g:206:1: expr_1_proxy : expr_1 -> expr_1 ;
	public final LeacParser.expr_1_proxy_return expr_1_proxy() throws RecognitionException {
		LeacParser.expr_1_proxy_return retval = new LeacParser.expr_1_proxy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_1113 =null;

		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try {
			// Leac.g:207:5: ( expr_1 -> expr_1 )
			// Leac.g:207:7: expr_1
			{
			pushFollow(FOLLOW_expr_1_in_expr_1_proxy1887);
			expr_1113=expr_1();
			state._fsp--;

			stream_expr_1.add(expr_1113.getTree());
			// AST REWRITE
			// elements: expr_1
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 207:14: -> expr_1
			{
				adaptor.addChild(root_0, stream_expr_1.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_1_proxy"


	public static class expr_2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_2"
	// Leac.g:210:1: expr_2 : ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 );
	public final LeacParser.expr_2_return expr_2() throws RecognitionException {
		LeacParser.expr_2_return retval = new LeacParser.expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal114=null;
		Token string_literal116=null;
		ParserRuleReturnScope expr_1115 =null;
		ParserRuleReturnScope expr_1117 =null;
		ParserRuleReturnScope expr_1118 =null;

		Object char_literal114_tree=null;
		Object string_literal116_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try {
			// Leac.g:211:5: ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 )
			int alt25=3;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt25=1;
				}
				break;
			case 97:
				{
				alt25=2;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case IDF:
			case INT:
			case STRING:
			case 68:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// Leac.g:211:7: '-' expr_1
					{
					char_literal114=(Token)match(input,73,FOLLOW_73_in_expr_21908);
					stream_73.add(char_literal114);

					pushFollow(FOLLOW_expr_1_in_expr_21910);
					expr_1115=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1115.getTree());
					// AST REWRITE
					// elements: expr_1
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 211:18: -> ^( UNARY_MINUS expr_1 )
					{
						// Leac.g:211:21: ^( UNARY_MINUS expr_1 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_expr_1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:212:7: 'not' expr_1
					{
					string_literal116=(Token)match(input,97,FOLLOW_97_in_expr_21926);
					stream_97.add(string_literal116);

					pushFollow(FOLLOW_expr_1_in_expr_21928);
					expr_1117=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1117.getTree());
					// AST REWRITE
					// elements: expr_1
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 212:20: -> ^( NOT expr_1 )
					{
						// Leac.g:212:23: ^( NOT expr_1 )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
						adaptor.addChild(root_1, stream_expr_1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:213:7: expr_1
					{
					pushFollow(FOLLOW_expr_1_in_expr_21944);
					expr_1118=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1118.getTree());
					// AST REWRITE
					// elements: expr_1
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 213:14: -> expr_1
					{
						adaptor.addChild(root_0, stream_expr_1.nextTree());
					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_2"


	public static class expr_3_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_3"
	// Leac.g:216:1: expr_3 : ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* ;
	public final LeacParser.expr_3_return expr_3() throws RecognitionException {
		LeacParser.expr_3_return retval = new LeacParser.expr_3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token char_literal121=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_2119 =null;

		Object char_literal120_tree=null;
		Object char_literal121_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expr_2=new RewriteRuleSubtreeStream(adaptor,"rule expr_2");

		try {
			// Leac.g:217:5: ( ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* )
			// Leac.g:217:7: ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			{
			// Leac.g:217:7: ( expr_2 -> expr_2 )
			// Leac.g:217:8: expr_2
			{
			pushFollow(FOLLOW_expr_2_in_expr_31966);
			expr_2119=expr_2();
			state._fsp--;

			stream_expr_2.add(expr_2119.getTree());
			// AST REWRITE
			// elements: expr_2
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 217:15: -> expr_2
			{
				adaptor.addChild(root_0, stream_expr_2.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:218:9: ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==70) ) {
					alt26=1;
				}
				else if ( (LA26_0==75) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// Leac.g:218:11: '*' next= expr_2
					{
					char_literal120=(Token)match(input,70,FOLLOW_70_in_expr_31983);
					stream_70.add(char_literal120);

					pushFollow(FOLLOW_expr_2_in_expr_31987);
					next=expr_2();
					state._fsp--;

					stream_expr_2.add(next.getTree());
					// AST REWRITE
					// elements: expr_3, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 218:27: -> ^( MUL $expr_3 $next)
					{
						// Leac.g:218:30: ^( MUL $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MUL, "MUL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:219:11: '/' next= expr_2
					{
					char_literal121=(Token)match(input,75,FOLLOW_75_in_expr_32011);
					stream_75.add(char_literal121);

					pushFollow(FOLLOW_expr_2_in_expr_32015);
					next=expr_2();
					state._fsp--;

					stream_expr_2.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_3
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 219:27: -> ^( DIV $expr_3 $next)
					{
						// Leac.g:219:30: ^( DIV $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIV, "DIV"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop26;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_3"


	public static class expr_4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_4"
	// Leac.g:223:1: expr_4 : ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* ;
	public final LeacParser.expr_4_return expr_4() throws RecognitionException {
		LeacParser.expr_4_return retval = new LeacParser.expr_4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		Token char_literal124=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_3122 =null;

		Object char_literal123_tree=null;
		Object char_literal124_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr_3=new RewriteRuleSubtreeStream(adaptor,"rule expr_3");

		try {
			// Leac.g:224:5: ( ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* )
			// Leac.g:224:7: ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			{
			// Leac.g:224:7: ( expr_3 -> expr_3 )
			// Leac.g:224:8: expr_3
			{
			pushFollow(FOLLOW_expr_3_in_expr_42056);
			expr_3122=expr_3();
			state._fsp--;

			stream_expr_3.add(expr_3122.getTree());
			// AST REWRITE
			// elements: expr_3
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 224:15: -> expr_3
			{
				adaptor.addChild(root_0, stream_expr_3.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:225:9: ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			loop27:
			while (true) {
				int alt27=3;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==71) ) {
					alt27=1;
				}
				else if ( (LA27_0==73) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// Leac.g:225:11: '+' next= expr_3
					{
					char_literal123=(Token)match(input,71,FOLLOW_71_in_expr_42073);
					stream_71.add(char_literal123);

					pushFollow(FOLLOW_expr_3_in_expr_42077);
					next=expr_3();
					state._fsp--;

					stream_expr_3.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_4
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 225:27: -> ^( ADD $expr_4 $next)
					{
						// Leac.g:225:30: ^( ADD $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ADD, "ADD"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:226:11: '-' next= expr_3
					{
					char_literal124=(Token)match(input,73,FOLLOW_73_in_expr_42101);
					stream_73.add(char_literal124);

					pushFollow(FOLLOW_expr_3_in_expr_42105);
					next=expr_3();
					state._fsp--;

					stream_expr_3.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_4
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 226:27: -> ^( SUB $expr_4 $next)
					{
						// Leac.g:226:30: ^( SUB $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUB, "SUB"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop27;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_4"


	public static class expr_5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_5"
	// Leac.g:230:1: expr_5 : ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* ;
	public final LeacParser.expr_5_return expr_5() throws RecognitionException {
		LeacParser.expr_5_return retval = new LeacParser.expr_5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token string_literal127=null;
		Token char_literal128=null;
		Token string_literal129=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_4125 =null;

		Object char_literal126_tree=null;
		Object string_literal127_tree=null;
		Object char_literal128_tree=null;
		Object string_literal129_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_expr_4=new RewriteRuleSubtreeStream(adaptor,"rule expr_4");

		try {
			// Leac.g:231:5: ( ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* )
			// Leac.g:231:7: ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			{
			// Leac.g:231:7: ( expr_4 -> expr_4 )
			// Leac.g:231:8: expr_4
			{
			pushFollow(FOLLOW_expr_4_in_expr_52146);
			expr_4125=expr_4();
			state._fsp--;

			stream_expr_4.add(expr_4125.getTree());
			// AST REWRITE
			// elements: expr_4
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 231:15: -> expr_4
			{
				adaptor.addChild(root_0, stream_expr_4.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:232:9: ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			loop28:
			while (true) {
				int alt28=5;
				switch ( input.LA(1) ) {
				case 78:
					{
					alt28=1;
					}
					break;
				case 79:
					{
					alt28=2;
					}
					break;
				case 82:
					{
					alt28=3;
					}
					break;
				case 83:
					{
					alt28=4;
					}
					break;
				}
				switch (alt28) {
				case 1 :
					// Leac.g:232:11: '<' next= expr_4
					{
					char_literal126=(Token)match(input,78,FOLLOW_78_in_expr_52163);
					stream_78.add(char_literal126);

					pushFollow(FOLLOW_expr_4_in_expr_52167);
					next=expr_4();
					state._fsp--;

					stream_expr_4.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_5
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 232:27: -> ^( TEST_LT $expr_5 $next)
					{
						// Leac.g:232:30: ^( TEST_LT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LT, "TEST_LT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:233:11: '<=' next= expr_4
					{
					string_literal127=(Token)match(input,79,FOLLOW_79_in_expr_52191);
					stream_79.add(string_literal127);

					pushFollow(FOLLOW_expr_4_in_expr_52195);
					next=expr_4();
					state._fsp--;

					stream_expr_4.add(next.getTree());
					// AST REWRITE
					// elements: expr_5, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 233:28: -> ^( TEST_LE $expr_5 $next)
					{
						// Leac.g:233:31: ^( TEST_LE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LE, "TEST_LE"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:234:11: '>' next= expr_4
					{
					char_literal128=(Token)match(input,82,FOLLOW_82_in_expr_52219);
					stream_82.add(char_literal128);

					pushFollow(FOLLOW_expr_4_in_expr_52223);
					next=expr_4();
					state._fsp--;

					stream_expr_4.add(next.getTree());
					// AST REWRITE
					// elements: expr_5, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 234:27: -> ^( TEST_GT $expr_5 $next)
					{
						// Leac.g:234:30: ^( TEST_GT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GT, "TEST_GT"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:235:11: '>=' next= expr_4
					{
					string_literal129=(Token)match(input,83,FOLLOW_83_in_expr_52247);
					stream_83.add(string_literal129);

					pushFollow(FOLLOW_expr_4_in_expr_52251);
					next=expr_4();
					state._fsp--;

					stream_expr_4.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_5
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 235:28: -> ^( TEST_GE $expr_5 $next)
					{
						// Leac.g:235:31: ^( TEST_GE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GE, "TEST_GE"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop28;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_5"


	public static class expr_6_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_6"
	// Leac.g:239:1: expr_6 : ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* ;
	public final LeacParser.expr_6_return expr_6() throws RecognitionException {
		LeacParser.expr_6_return retval = new LeacParser.expr_6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal131=null;
		Token string_literal132=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_5130 =null;

		Object string_literal131_tree=null;
		Object string_literal132_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_expr_5=new RewriteRuleSubtreeStream(adaptor,"rule expr_5");

		try {
			// Leac.g:240:5: ( ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* )
			// Leac.g:240:7: ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			{
			// Leac.g:240:7: ( expr_5 -> expr_5 )
			// Leac.g:240:8: expr_5
			{
			pushFollow(FOLLOW_expr_5_in_expr_62292);
			expr_5130=expr_5();
			state._fsp--;

			stream_expr_5.add(expr_5130.getTree());
			// AST REWRITE
			// elements: expr_5
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 240:15: -> expr_5
			{
				adaptor.addChild(root_0, stream_expr_5.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:241:9: ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==81) ) {
					alt29=1;
				}
				else if ( (LA29_0==67) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// Leac.g:241:11: '==' next= expr_5
					{
					string_literal131=(Token)match(input,81,FOLLOW_81_in_expr_62309);
					stream_81.add(string_literal131);

					pushFollow(FOLLOW_expr_5_in_expr_62313);
					next=expr_5();
					state._fsp--;

					stream_expr_5.add(next.getTree());
					// AST REWRITE
					// elements: expr_6, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 241:28: -> ^( TEST_EQ $expr_6 $next)
					{
						// Leac.g:241:31: ^( TEST_EQ $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_EQ, "TEST_EQ"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:242:11: '!=' next= expr_5
					{
					string_literal132=(Token)match(input,67,FOLLOW_67_in_expr_62337);
					stream_67.add(string_literal132);

					pushFollow(FOLLOW_expr_5_in_expr_62341);
					next=expr_5();
					state._fsp--;

					stream_expr_5.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_6
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 242:28: -> ^( TEST_NE $expr_6 $next)
					{
						// Leac.g:242:31: ^( TEST_NE $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_NE, "TEST_NE"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop29;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_6"


	public static class expr_7_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_7"
	// Leac.g:246:1: expr_7 : ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* ;
	public final LeacParser.expr_7_return expr_7() throws RecognitionException {
		LeacParser.expr_7_return retval = new LeacParser.expr_7_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal134=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_6133 =null;

		Object string_literal134_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expr_6=new RewriteRuleSubtreeStream(adaptor,"rule expr_6");

		try {
			// Leac.g:247:5: ( ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* )
			// Leac.g:247:7: ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			{
			// Leac.g:247:7: ( expr_6 -> expr_6 )
			// Leac.g:247:8: expr_6
			{
			pushFollow(FOLLOW_expr_6_in_expr_72382);
			expr_6133=expr_6();
			state._fsp--;

			stream_expr_6.add(expr_6133.getTree());
			// AST REWRITE
			// elements: expr_6
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 247:15: -> expr_6
			{
				adaptor.addChild(root_0, stream_expr_6.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:248:9: ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==87) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// Leac.g:248:11: 'and' next= expr_6
					{
					string_literal134=(Token)match(input,87,FOLLOW_87_in_expr_72399);
					stream_87.add(string_literal134);

					pushFollow(FOLLOW_expr_6_in_expr_72403);
					next=expr_6();
					state._fsp--;

					stream_expr_6.add(next.getTree());
					// AST REWRITE
					// elements: expr_7, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 248:29: -> ^( AND $expr_7 $next)
					{
						// Leac.g:248:32: ^( AND $expr_7 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop30;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_7"


	public static class expr_8_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_8"
	// Leac.g:252:1: expr_8 : ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* ;
	public final LeacParser.expr_8_return expr_8() throws RecognitionException {
		LeacParser.expr_8_return retval = new LeacParser.expr_8_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal136=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_7135 =null;

		Object string_literal136_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_expr_7=new RewriteRuleSubtreeStream(adaptor,"rule expr_7");

		try {
			// Leac.g:253:5: ( ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* )
			// Leac.g:253:7: ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			{
			// Leac.g:253:7: ( expr_7 -> expr_7 )
			// Leac.g:253:8: expr_7
			{
			pushFollow(FOLLOW_expr_7_in_expr_82444);
			expr_7135=expr_7();
			state._fsp--;

			stream_expr_7.add(expr_7135.getTree());
			// AST REWRITE
			// elements: expr_7
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 253:15: -> expr_7
			{
				adaptor.addChild(root_0, stream_expr_7.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:254:9: ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==99) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// Leac.g:254:11: 'or' next= expr_7
					{
					string_literal136=(Token)match(input,99,FOLLOW_99_in_expr_82461);
					stream_99.add(string_literal136);

					pushFollow(FOLLOW_expr_7_in_expr_82465);
					next=expr_7();
					state._fsp--;

					stream_expr_7.add(next.getTree());
					// AST REWRITE
					// elements: expr_8, next
					// token labels:
					// rule labels: next, retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 254:28: -> ^( OR $expr_8 $next)
					{
						// Leac.g:254:31: ^( OR $expr_8 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

				default :
					break loop31;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_8"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// Leac.g:258:1: expr : expr_8 -> expr_8 ;
	public final LeacParser.expr_return expr() throws RecognitionException {
		LeacParser.expr_return retval = new LeacParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_8137 =null;

		RewriteRuleSubtreeStream stream_expr_8=new RewriteRuleSubtreeStream(adaptor,"rule expr_8");

		try {
			// Leac.g:259:5: ( expr_8 -> expr_8 )
			// Leac.g:259:7: expr_8
			{
			pushFollow(FOLLOW_expr_8_in_expr2505);
			expr_8137=expr_8();
			state._fsp--;

			stream_expr_8.add(expr_8137.getTree());
			// AST REWRITE
			// elements: expr_8
			// token labels:
			// rule labels: retval
			// token list labels:
			// rule list labels:
			// wildcard labels:
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 259:14: -> expr_8
			{
				adaptor.addChild(root_0, stream_expr_8.nextTree());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class constant_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// Leac.g:262:1: constant : ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_return constant() throws RecognitionException {
		LeacParser.constant_return retval = new LeacParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT138=null;
		Token FLOAT139=null;
		Token BOOL140=null;
		Token STRING141=null;
		Token CHAR142=null;

		Object INT138_tree=null;
		Object FLOAT139_tree=null;
		Object BOOL140_tree=null;
		Object STRING141_tree=null;
		Object CHAR142_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:263:5: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt32=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt32=1;
				}
				break;
			case FLOAT:
				{
				alt32=2;
				}
				break;
			case BOOL:
				{
				alt32=3;
				}
				break;
			case STRING:
				{
				alt32=4;
				}
				break;
			case CHAR:
				{
				alt32=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// Leac.g:263:7: INT
					{
					INT138=(Token)match(input,INT,FOLLOW_INT_in_constant2526);
					stream_INT.add(INT138);

					// AST REWRITE
					// elements: INT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 263:11: -> ^( CONST INT_TYPENAME INT )
					{
						// Leac.g:263:14: ^( CONST INT_TYPENAME INT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:264:7: FLOAT
					{
					FLOAT139=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2544);
					stream_FLOAT.add(FLOAT139);

					// AST REWRITE
					// elements: FLOAT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 264:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						// Leac.g:264:16: ^( CONST FLOAT_TYPENAME FLOAT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:265:7: BOOL
					{
					BOOL140=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant2562);
					stream_BOOL.add(BOOL140);

					// AST REWRITE
					// elements: BOOL
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 265:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						// Leac.g:265:15: ^( CONST BOOL_TYPENAME BOOL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
						adaptor.addChild(root_1, stream_BOOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:266:7: STRING
					{
					STRING141=(Token)match(input,STRING,FOLLOW_STRING_in_constant2580);
					stream_STRING.add(STRING141);

					// AST REWRITE
					// elements: STRING
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 266:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						// Leac.g:266:17: ^( CONST STRING_TYPENAME STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:267:7: CHAR
					{
					CHAR142=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant2598);
					stream_CHAR.add(CHAR142);

					// AST REWRITE
					// elements: CHAR
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 267:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						// Leac.g:267:15: ^( CONST CHAR_TYPENAME CHAR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));
						adaptor.addChild(root_1, stream_CHAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class constant_ext_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "constant_ext"
	// Leac.g:270:1: constant_ext : ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_ext_return constant_ext() throws RecognitionException {
		LeacParser.constant_ext_return retval = new LeacParser.constant_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal143=null;
		Token INT144=null;
		Token FLOAT145=null;
		Token INT146=null;
		Token FLOAT147=null;
		Token BOOL148=null;
		Token STRING149=null;
		Token CHAR150=null;

		Object char_literal143_tree=null;
		Object INT144_tree=null;
		Object FLOAT145_tree=null;
		Object INT146_tree=null;
		Object FLOAT147_tree=null;
		Object BOOL148_tree=null;
		Object STRING149_tree=null;
		Object CHAR150_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:271:5: ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt34=6;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt34=1;
				}
				break;
			case INT:
				{
				alt34=2;
				}
				break;
			case FLOAT:
				{
				alt34=3;
				}
				break;
			case BOOL:
				{
				alt34=4;
				}
				break;
			case STRING:
				{
				alt34=5;
				}
				break;
			case CHAR:
				{
				alt34=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// Leac.g:271:7: '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					{
					char_literal143=(Token)match(input,73,FOLLOW_73_in_constant_ext2625);
					stream_73.add(char_literal143);

					// Leac.g:272:9: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==INT) ) {
						alt33=1;
					}
					else if ( (LA33_0==FLOAT) ) {
						alt33=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// Leac.g:272:11: INT
							{
							INT144=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2637);
							stream_INT.add(INT144);

							 INT144.setText("-" + INT144.getText());
							// AST REWRITE
							// elements: INT
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 272:55: -> ^( CONST INT_TYPENAME INT )
							{
								// Leac.g:272:58: ^( CONST INT_TYPENAME INT )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
								adaptor.addChild(root_1, stream_INT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							// Leac.g:273:11: FLOAT
							{
							FLOAT145=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2661);
							stream_FLOAT.add(FLOAT145);

							 FLOAT145.setText("-" + FLOAT145.getText());
							// AST REWRITE
							// elements: FLOAT
							// token labels:
							// rule labels: retval
							// token list labels:
							// rule list labels:
							// wildcard labels:
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (Object)adaptor.nil();
							// 273:61: -> ^( CONST FLOAT_TYPENAME FLOAT )
							{
								// Leac.g:273:64: ^( CONST FLOAT_TYPENAME FLOAT )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
								adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
								adaptor.addChild(root_1, stream_FLOAT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}

					}
					break;
				case 2 :
					// Leac.g:275:7: INT
					{
					INT146=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2691);
					stream_INT.add(INT146);

					// AST REWRITE
					// elements: INT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 275:11: -> ^( CONST INT_TYPENAME INT )
					{
						// Leac.g:275:14: ^( CONST INT_TYPENAME INT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:276:7: FLOAT
					{
					FLOAT147=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2709);
					stream_FLOAT.add(FLOAT147);

					// AST REWRITE
					// elements: FLOAT
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 276:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						// Leac.g:276:16: ^( CONST FLOAT_TYPENAME FLOAT )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:277:7: BOOL
					{
					BOOL148=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant_ext2727);
					stream_BOOL.add(BOOL148);

					// AST REWRITE
					// elements: BOOL
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 277:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						// Leac.g:277:15: ^( CONST BOOL_TYPENAME BOOL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
						adaptor.addChild(root_1, stream_BOOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:278:7: STRING
					{
					STRING149=(Token)match(input,STRING,FOLLOW_STRING_in_constant_ext2745);
					stream_STRING.add(STRING149);

					// AST REWRITE
					// elements: STRING
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 278:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						// Leac.g:278:17: ^( CONST STRING_TYPENAME STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Leac.g:279:7: CHAR
					{
					CHAR150=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_ext2763);
					stream_CHAR.add(CHAR150);

					// AST REWRITE
					// elements: CHAR
					// token labels:
					// rule labels: retval
					// token list labels:
					// rule list labels:
					// wildcard labels:
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 279:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						// Leac.g:279:15: ^( CONST CHAR_TYPENAME CHAR )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						adaptor.addChild(root_1, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));
						adaptor.addChild(root_1, stream_CHAR.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_ext"

	// Delegated rules



	public static final BitSet FOLLOW_100_in_program400 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_program402 = new BitSet(new long[]{0x0000000080000000L,0x000074A0C0000000L});
	public static final BitSet FOLLOW_var_decl_list_in_program404 = new BitSet(new long[]{0x0000000080000000L,0x000070A0C0000000L});
	public static final BitSet FOLLOW_func_decl_list_in_program406 = new BitSet(new long[]{0x0000000080000000L,0x000070A080000000L});
	public static final BitSet FOLLOW_statement_in_program408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_var_decl_list439 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_var_decl465 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_idf_list_in_var_decl467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_var_decl469 = new BitSet(new long[]{0x0000000000000000L,0x0000090127000000L});
	public static final BitSet FOLLOW_typename_in_var_decl471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_var_decl473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_idf_list499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_idf_list502 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_idf_list504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_func_decl_in_func_decl_list532 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
	public static final BitSet FOLLOW_94_in_func_decl558 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_func_decl560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_func_decl562 = new BitSet(new long[]{0x0000000080000000L,0x0000004000000020L});
	public static final BitSet FOLLOW_param_list_in_func_decl564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_func_decl566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_func_decl568 = new BitSet(new long[]{0x0000000000000000L,0x0000090126000000L});
	public static final BitSet FOLLOW_atom_typename_in_func_decl570 = new BitSet(new long[]{0x0000000000000000L,0x0000440000000000L});
	public static final BitSet FOLLOW_var_decl_list_in_func_decl572 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_block_in_func_decl574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_typename_in_typename607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_typename_in_typename623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_atom_typename644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_atom_typename656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_atom_typename668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_atom_typename680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_atom_typename692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_atom_typename704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_array_typename725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_array_typename727 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_range_list_in_array_typename729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_array_typename731 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_array_typename733 = new BitSet(new long[]{0x0000000000000000L,0x0000090126000000L});
	public static final BitSet FOLLOW_atom_typename_in_array_typename735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_range_list762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_range_list765 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_range_in_range_list767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_int_ext_in_range796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_range798 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_int_ext_in_range802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int_ext831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_int_ext843 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INT_in_int_ext845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_param_list885 = new BitSet(new long[]{0x0000000080000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_param_in_param_list887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_IDF_in_param914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_param916 = new BitSet(new long[]{0x0000000000000000L,0x0000090127000000L});
	public static final BitSet FOLLOW_typename_in_param918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_param938 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_param940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_param942 = new BitSet(new long[]{0x0000000000000000L,0x0000090127000000L});
	public static final BitSet FOLLOW_typename_in_param944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_statement985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_or_procedure_call_in_statement997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returning_in_statement1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_in_statement1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_conditional1066 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_conditional1068 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_conditional1070 = new BitSet(new long[]{0x0000000080000000L,0x000070A080000000L});
	public static final BitSet FOLLOW_statement_in_conditional1074 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_conditional1098 = new BitSet(new long[]{0x0000000080000000L,0x000070A080000000L});
	public static final BitSet FOLLOW_statement_in_conditional1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_loop1170 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_loop1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_loop1174 = new BitSet(new long[]{0x0000000080000000L,0x000070A080000000L});
	public static final BitSet FOLLOW_statement_in_loop1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_coord_list1203 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_coord_list1206 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_coord_list1208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_103_in_returning1236 = new BitSet(new long[]{0x0004000282010802L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_returning1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_affect_or_procedure_call1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110010L});
	public static final BitSet FOLLOW_84_in_affect_or_procedure_call1353 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_affect_or_procedure_call1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_affect_or_procedure_call1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_affect_or_procedure_call1395 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_affect_or_procedure_call1397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_affect_or_procedure_call1420 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000230L});
	public static final BitSet FOLLOW_arg_list_in_affect_or_procedure_call1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_affect_or_procedure_call1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list1475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_arg_list1478 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_arg_list1480 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_110_in_block1508 = new BitSet(new long[]{0x0000000080000000L,0x0000F0A080000000L});
	public static final BitSet FOLLOW_statement_in_block1538 = new BitSet(new long[]{0x0000000000000000L,0x0000800000002000L});
	public static final BitSet FOLLOW_77_in_block1541 = new BitSet(new long[]{0x0000000080000000L,0x000070A080000000L});
	public static final BitSet FOLLOW_statement_in_block1543 = new BitSet(new long[]{0x0000000000000000L,0x0000800000002000L});
	public static final BitSet FOLLOW_111_in_block1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_read1589 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_read1591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_read1627 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_read1629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_read1631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_write1672 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_write1674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_expr_01699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_68_in_expr_01731 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000230L});
	public static final BitSet FOLLOW_arg_list_in_expr_01733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_expr_01735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_expr_01757 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_expr_01759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_expr_01761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_01789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_expr_01801 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_expr_01803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_expr_01805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_0_in_expr_11827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expr_11844 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_proxy_in_expr_11848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_1_proxy1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_expr_21908 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_in_expr_21910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_expr_21926 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_in_expr_21928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_21944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr_31966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_70_in_expr_31983 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_2_in_expr_31987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_75_in_expr_32011 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_2_in_expr_32015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_expr_3_in_expr_42056 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_71_in_expr_42073 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_3_in_expr_42077 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_73_in_expr_42101 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_3_in_expr_42105 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_expr_4_in_expr_52146 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_78_in_expr_52163 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52167 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_79_in_expr_52191 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52195 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_82_in_expr_52219 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52223 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_83_in_expr_52247 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52251 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_expr_5_in_expr_62292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_81_in_expr_62309 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_5_in_expr_62313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_67_in_expr_62337 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_5_in_expr_62341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_expr_6_in_expr_72382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_expr_72399 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_6_in_expr_72403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_expr_7_in_expr_82444 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_expr_82461 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_7_in_expr_82465 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_expr_8_in_expr2505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant2544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant2562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant2580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant2598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_constant_ext2625 = new BitSet(new long[]{0x0000000202000000L});
	public static final BitSet FOLLOW_INT_in_constant_ext2637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant_ext2691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant_ext2727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant_ext2745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_ext2763 = new BitSet(new long[]{0x0000000000000002L});
}
