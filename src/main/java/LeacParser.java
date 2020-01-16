// $ANTLR 3.5.2 Leac.g 2020-01-16 10:39:30

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
		"OR", "PARAM", "PARAM_LIST", "PASS", "POW", "PROCEDURE_CALL", "PROGRAM", 
		"RANGE", "RANGE_LIST", "READ", "RETURNING", "STRING", "STRING_TYPENAME", 
		"SUB", "TEST_EQ", "TEST_GE", "TEST_GT", "TEST_LE", "TEST_LT", "TEST_NE", 
		"UNARY_MINUS", "UNICODE_ESC", "VAR", "VAR_DECL", "VAR_DECL_LIST", "VOID_TYPENAME", 
		"WRITE", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", "'..'", 
		"'/'", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", 
		"']'", "'^'", "'and'", "'array'", "'bool'", "'char'", "'do'", "'else'", 
		"'float'", "'function'", "'if'", "'int'", "'not'", "'of'", "'or'", "'program'", 
		"'read'", "'ref'", "'return'", "'then'", "'var'", "'void'", "'while'", 
		"'write'", "'{'", "'}'"
	};
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
	// Leac.g:66:1: program : 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM var_decl_list func_decl_list statement ) ;
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
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_func_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule func_decl_list");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_var_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_list");

		try {
			// Leac.g:67:5: ( 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM var_decl_list func_decl_list statement ) )
			// Leac.g:67:7: 'program' IDF var_decl_list func_decl_list statement
			{
			string_literal1=(Token)match(input,101,FOLLOW_101_in_program414);  
			stream_101.add(string_literal1);

			IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_program416);  
			stream_IDF.add(IDF2);

			pushFollow(FOLLOW_var_decl_list_in_program418);
			var_decl_list3=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list3.getTree());
			pushFollow(FOLLOW_func_decl_list_in_program420);
			func_decl_list4=func_decl_list();
			state._fsp--;

			stream_func_decl_list.add(func_decl_list4.getTree());
			pushFollow(FOLLOW_statement_in_program422);
			statement5=statement();
			state._fsp--;

			stream_statement.add(statement5.getTree());
			// AST REWRITE
			// elements: func_decl_list, statement, var_decl_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:60: -> ^( PROGRAM var_decl_list func_decl_list statement )
			{
				// Leac.g:67:63: ^( PROGRAM var_decl_list func_decl_list statement )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
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
	// Leac.g:70:1: var_decl_list : ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) ;
	public final LeacParser.var_decl_list_return var_decl_list() throws RecognitionException {
		LeacParser.var_decl_list_return retval = new LeacParser.var_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_decl6 =null;

		RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");

		try {
			// Leac.g:71:5: ( ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) )
			// Leac.g:71:7: ( var_decl )*
			{
			// Leac.g:71:7: ( var_decl )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==106) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Leac.g:71:7: var_decl
					{
					pushFollow(FOLLOW_var_decl_in_var_decl_list451);
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
			// 71:17: -> ^( VAR_DECL_LIST ( var_decl )* )
			{
				// Leac.g:71:20: ^( VAR_DECL_LIST ( var_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL_LIST, "VAR_DECL_LIST"), root_1);
				// Leac.g:71:36: ( var_decl )*
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
	// Leac.g:73:1: var_decl : 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) ;
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
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleSubtreeStream stream_idf_list=new RewriteRuleSubtreeStream(adaptor,"rule idf_list");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try {
			// Leac.g:74:5: ( 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) )
			// Leac.g:74:7: 'var' idf_list ':' typename ';'
			{
			string_literal7=(Token)match(input,106,FOLLOW_106_in_var_decl477);  
			stream_106.add(string_literal7);

			pushFollow(FOLLOW_idf_list_in_var_decl479);
			idf_list8=idf_list();
			state._fsp--;

			stream_idf_list.add(idf_list8.getTree());
			char_literal9=(Token)match(input,77,FOLLOW_77_in_var_decl481);  
			stream_77.add(char_literal9);

			pushFollow(FOLLOW_typename_in_var_decl483);
			typename10=typename();
			state._fsp--;

			stream_typename.add(typename10.getTree());
			char_literal11=(Token)match(input,78,FOLLOW_78_in_var_decl485);  
			stream_78.add(char_literal11);

			// AST REWRITE
			// elements: typename, idf_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 74:39: -> ^( VAR_DECL typename idf_list )
			{
				// Leac.g:74:42: ^( VAR_DECL typename idf_list )
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
	// Leac.g:76:1: idf_list : IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) ;
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
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

		try {
			// Leac.g:77:5: ( IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) )
			// Leac.g:77:7: IDF ( ',' IDF )*
			{
			IDF12=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list511);  
			stream_IDF.add(IDF12);

			// Leac.g:77:11: ( ',' IDF )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==73) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Leac.g:77:12: ',' IDF
					{
					char_literal13=(Token)match(input,73,FOLLOW_73_in_idf_list514);  
					stream_73.add(char_literal13);

					IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list516);  
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
			// 77:22: -> ^( IDF_LIST ( IDF )+ )
			{
				// Leac.g:77:25: ^( IDF_LIST ( IDF )+ )
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
	// Leac.g:80:1: func_decl_list : ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) ;
	public final LeacParser.func_decl_list_return func_decl_list() throws RecognitionException {
		LeacParser.func_decl_list_return retval = new LeacParser.func_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_decl15 =null;

		RewriteRuleSubtreeStream stream_func_decl=new RewriteRuleSubtreeStream(adaptor,"rule func_decl");

		try {
			// Leac.g:81:5: ( ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) )
			// Leac.g:81:7: ( func_decl )*
			{
			// Leac.g:81:7: ( func_decl )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==95) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Leac.g:81:7: func_decl
					{
					pushFollow(FOLLOW_func_decl_in_func_decl_list544);
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
			// 81:18: -> ^( FUNC_DECL_LIST ( func_decl )* )
			{
				// Leac.g:81:21: ^( FUNC_DECL_LIST ( func_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL_LIST, "FUNC_DECL_LIST"), root_1);
				// Leac.g:81:38: ( func_decl )*
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
	// Leac.g:83:1: func_decl : 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL param_list atom_typename var_decl_list block ) ;
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
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");
		RewriteRuleSubtreeStream stream_var_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule var_decl_list");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_param_list=new RewriteRuleSubtreeStream(adaptor,"rule param_list");

		try {
			// Leac.g:84:5: ( 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL param_list atom_typename var_decl_list block ) )
			// Leac.g:84:7: 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block
			{
			string_literal16=(Token)match(input,95,FOLLOW_95_in_func_decl570);  
			stream_95.add(string_literal16);

			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_func_decl572);  
			stream_IDF.add(IDF17);

			char_literal18=(Token)match(input,69,FOLLOW_69_in_func_decl574);  
			stream_69.add(char_literal18);

			pushFollow(FOLLOW_param_list_in_func_decl576);
			param_list19=param_list();
			state._fsp--;

			stream_param_list.add(param_list19.getTree());
			char_literal20=(Token)match(input,70,FOLLOW_70_in_func_decl578);  
			stream_70.add(char_literal20);

			char_literal21=(Token)match(input,77,FOLLOW_77_in_func_decl580);  
			stream_77.add(char_literal21);

			pushFollow(FOLLOW_atom_typename_in_func_decl582);
			atom_typename22=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename22.getTree());
			pushFollow(FOLLOW_var_decl_list_in_func_decl584);
			var_decl_list23=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list23.getTree());
			pushFollow(FOLLOW_block_in_func_decl586);
			block24=block();
			state._fsp--;

			stream_block.add(block24.getTree());
			// AST REWRITE
			// elements: block, atom_typename, param_list, var_decl_list
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 84:79: -> ^( FUNC_DECL param_list atom_typename var_decl_list block )
			{
				// Leac.g:84:82: ^( FUNC_DECL param_list atom_typename var_decl_list block )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
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
	// Leac.g:87:1: typename : ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename );
	public final LeacParser.typename_return typename() throws RecognitionException {
		LeacParser.typename_return retval = new LeacParser.typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom_typename25 =null;
		ParserRuleReturnScope array_typename26 =null;

		RewriteRuleSubtreeStream stream_array_typename=new RewriteRuleSubtreeStream(adaptor,"rule array_typename");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");

		try {
			// Leac.g:88:5: ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 90 && LA4_0 <= 91)||LA4_0==94||LA4_0==97||LA4_0==107) ) {
				alt4=1;
			}
			else if ( (LA4_0==89) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Leac.g:88:7: atom_typename
					{
					pushFollow(FOLLOW_atom_typename_in_typename617);
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
					// 88:21: -> ^( ATOM atom_typename )
					{
						// Leac.g:88:24: ^( ATOM atom_typename )
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
					// Leac.g:89:7: array_typename
					{
					pushFollow(FOLLOW_array_typename_in_typename633);
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
					// 89:22: -> array_typename
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
	// Leac.g:92:1: atom_typename : ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME );
	public final LeacParser.atom_typename_return atom_typename() throws RecognitionException {
		LeacParser.atom_typename_return retval = new LeacParser.atom_typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal27=null;
		Token string_literal28=null;
		Token string_literal29=null;
		Token string_literal30=null;
		Token string_literal31=null;

		Object string_literal27_tree=null;
		Object string_literal28_tree=null;
		Object string_literal29_tree=null;
		Object string_literal30_tree=null;
		Object string_literal31_tree=null;
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");

		try {
			// Leac.g:93:5: ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME )
			int alt5=5;
			switch ( input.LA(1) ) {
			case 107:
				{
				alt5=1;
				}
				break;
			case 90:
				{
				alt5=2;
				}
				break;
			case 97:
				{
				alt5=3;
				}
				break;
			case 94:
				{
				alt5=4;
				}
				break;
			case 91:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Leac.g:93:7: 'void'
					{
					string_literal27=(Token)match(input,107,FOLLOW_107_in_atom_typename654);  
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
					// 93:14: -> VOID_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(VOID_TYPENAME, "VOID_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:94:7: 'bool'
					{
					string_literal28=(Token)match(input,90,FOLLOW_90_in_atom_typename666);  
					stream_90.add(string_literal28);

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
					// 94:14: -> BOOL_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:95:7: 'int'
					{
					string_literal29=(Token)match(input,97,FOLLOW_97_in_atom_typename678);  
					stream_97.add(string_literal29);

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
					// 95:13: -> INT_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:96:7: 'float'
					{
					string_literal30=(Token)match(input,94,FOLLOW_94_in_atom_typename690);  
					stream_94.add(string_literal30);

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
					// 96:15: -> FLOAT_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:97:7: 'char'
					{
					string_literal31=(Token)match(input,91,FOLLOW_91_in_atom_typename702);  
					stream_91.add(string_literal31);

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
					// 97:14: -> CHAR_TYPENAME
					{
						adaptor.addChild(root_0, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));
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
	// Leac.g:100:1: array_typename : 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) ;
	public final LeacParser.array_typename_return array_typename() throws RecognitionException {
		LeacParser.array_typename_return retval = new LeacParser.array_typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal32=null;
		Token char_literal33=null;
		Token char_literal35=null;
		Token string_literal36=null;
		ParserRuleReturnScope range_list34 =null;
		ParserRuleReturnScope atom_typename37 =null;

		Object string_literal32_tree=null;
		Object char_literal33_tree=null;
		Object char_literal35_tree=null;
		Object string_literal36_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");
		RewriteRuleSubtreeStream stream_range_list=new RewriteRuleSubtreeStream(adaptor,"rule range_list");

		try {
			// Leac.g:101:5: ( 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) )
			// Leac.g:101:7: 'array' '[' range_list ']' 'of' atom_typename
			{
			string_literal32=(Token)match(input,89,FOLLOW_89_in_array_typename723);  
			stream_89.add(string_literal32);

			char_literal33=(Token)match(input,85,FOLLOW_85_in_array_typename725);  
			stream_85.add(char_literal33);

			pushFollow(FOLLOW_range_list_in_array_typename727);
			range_list34=range_list();
			state._fsp--;

			stream_range_list.add(range_list34.getTree());
			char_literal35=(Token)match(input,86,FOLLOW_86_in_array_typename729);  
			stream_86.add(char_literal35);

			string_literal36=(Token)match(input,99,FOLLOW_99_in_array_typename731);  
			stream_99.add(string_literal36);

			pushFollow(FOLLOW_atom_typename_in_array_typename733);
			atom_typename37=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename37.getTree());
			// AST REWRITE
			// elements: range_list, atom_typename
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 101:53: -> ^( ARRAY atom_typename range_list )
			{
				// Leac.g:101:56: ^( ARRAY atom_typename range_list )
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
	// Leac.g:104:1: range_list : range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) ;
	public final LeacParser.range_list_return range_list() throws RecognitionException {
		LeacParser.range_list_return retval = new LeacParser.range_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal39=null;
		ParserRuleReturnScope range38 =null;
		ParserRuleReturnScope range40 =null;

		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");

		try {
			// Leac.g:105:5: ( range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) )
			// Leac.g:105:7: range ( ',' range )*
			{
			pushFollow(FOLLOW_range_in_range_list760);
			range38=range();
			state._fsp--;

			stream_range.add(range38.getTree());
			// Leac.g:105:13: ( ',' range )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==73) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Leac.g:105:14: ',' range
					{
					char_literal39=(Token)match(input,73,FOLLOW_73_in_range_list763);  
					stream_73.add(char_literal39);

					pushFollow(FOLLOW_range_in_range_list765);
					range40=range();
					state._fsp--;

					stream_range.add(range40.getTree());
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
			// 105:26: -> ^( RANGE_LIST ( range )+ )
			{
				// Leac.g:105:29: ^( RANGE_LIST ( range )+ )
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
	// Leac.g:107:1: range : inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) ;
	public final LeacParser.range_return range() throws RecognitionException {
		LeacParser.range_return retval = new LeacParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		ParserRuleReturnScope inf =null;
		ParserRuleReturnScope sup =null;

		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_int_ext=new RewriteRuleSubtreeStream(adaptor,"rule int_ext");

		try {
			// Leac.g:108:5: (inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) )
			// Leac.g:108:7: inf= int_ext '..' sup= int_ext
			{
			pushFollow(FOLLOW_int_ext_in_range794);
			inf=int_ext();
			state._fsp--;

			stream_int_ext.add(inf.getTree());
			string_literal41=(Token)match(input,75,FOLLOW_75_in_range796);  
			stream_75.add(string_literal41);

			pushFollow(FOLLOW_int_ext_in_range800);
			sup=int_ext();
			state._fsp--;

			stream_int_ext.add(sup.getTree());
			// AST REWRITE
			// elements: inf, sup
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
			// 108:36: -> ^( RANGE $inf $sup)
			{
				// Leac.g:108:39: ^( RANGE $inf $sup)
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
	// Leac.g:111:1: int_ext : ( INT -> INT | '-' INT -> INT );
	public final LeacParser.int_ext_return int_ext() throws RecognitionException {
		LeacParser.int_ext_return retval = new LeacParser.int_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT42=null;
		Token char_literal43=null;
		Token INT44=null;

		Object INT42_tree=null;
		Object char_literal43_tree=null;
		Object INT44_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:112:5: ( INT -> INT | '-' INT -> INT )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==INT) ) {
				alt7=1;
			}
			else if ( (LA7_0==74) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Leac.g:112:7: INT
					{
					INT42=(Token)match(input,INT,FOLLOW_INT_in_int_ext829);  
					stream_INT.add(INT42);

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
					// 112:11: -> INT
					{
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:113:7: '-' INT
					{
					char_literal43=(Token)match(input,74,FOLLOW_74_in_int_ext841);  
					stream_74.add(char_literal43);

					INT44=(Token)match(input,INT,FOLLOW_INT_in_int_ext843);  
					stream_INT.add(INT44);

					 INT44.setText("-" + INT44.getText()); 
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
					// 113:55: -> INT
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
	// Leac.g:116:1: param_list : ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) );
	public final LeacParser.param_list_return param_list() throws RecognitionException {
		LeacParser.param_list_return retval = new LeacParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal46=null;
		ParserRuleReturnScope param45 =null;
		ParserRuleReturnScope param47 =null;

		Object char_literal46_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try {
			// Leac.g:117:5: ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==70) ) {
				alt9=1;
			}
			else if ( (LA9_0==IDF||LA9_0==103) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// Leac.g:117:21: 
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
					// 117:21: -> ^( PARAM_LIST )
					{
						// Leac.g:117:24: ^( PARAM_LIST )
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
					// Leac.g:118:7: param ( ',' param )*
					{
					pushFollow(FOLLOW_param_in_param_list880);
					param45=param();
					state._fsp--;

					stream_param.add(param45.getTree());
					// Leac.g:118:13: ( ',' param )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==73) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// Leac.g:118:14: ',' param
							{
							char_literal46=(Token)match(input,73,FOLLOW_73_in_param_list883);  
							stream_73.add(char_literal46);

							pushFollow(FOLLOW_param_in_param_list885);
							param47=param();
							state._fsp--;

							stream_param.add(param47.getTree());
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
					// 118:26: -> ^( PARAM_LIST ( param )+ )
					{
						// Leac.g:118:29: ^( PARAM_LIST ( param )+ )
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
	// Leac.g:120:1: param : ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) );
	public final LeacParser.param_return param() throws RecognitionException {
		LeacParser.param_return retval = new LeacParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF48=null;
		Token char_literal49=null;
		Token string_literal51=null;
		Token IDF52=null;
		Token char_literal53=null;
		ParserRuleReturnScope typename50 =null;
		ParserRuleReturnScope typename54 =null;

		Object IDF48_tree=null;
		Object char_literal49_tree=null;
		Object string_literal51_tree=null;
		Object IDF52_tree=null;
		Object char_literal53_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try {
			// Leac.g:121:5: ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==IDF) ) {
				alt10=1;
			}
			else if ( (LA10_0==103) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// Leac.g:121:7: IDF ':' typename
					{
					IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_param912);  
					stream_IDF.add(IDF48);

					char_literal49=(Token)match(input,77,FOLLOW_77_in_param914);  
					stream_77.add(char_literal49);

					pushFollow(FOLLOW_typename_in_param916);
					typename50=typename();
					state._fsp--;

					stream_typename.add(typename50.getTree());
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
					// 121:24: -> ^( PARAM typename BY_COPY IDF )
					{
						// Leac.g:121:27: ^( PARAM typename BY_COPY IDF )
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
					// Leac.g:122:7: 'ref' IDF ':' typename
					{
					string_literal51=(Token)match(input,103,FOLLOW_103_in_param936);  
					stream_103.add(string_literal51);

					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_param938);  
					stream_IDF.add(IDF52);

					char_literal53=(Token)match(input,77,FOLLOW_77_in_param940);  
					stream_77.add(char_literal53);

					pushFollow(FOLLOW_typename_in_param942);
					typename54=typename();
					state._fsp--;

					stream_typename.add(typename54.getTree());
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
					// 122:30: -> ^( PARAM typename BY_REF IDF )
					{
						// Leac.g:122:33: ^( PARAM typename BY_REF IDF )
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
	// Leac.g:125:1: statement : ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write );
	public final LeacParser.statement_return statement() throws RecognitionException {
		LeacParser.statement_return retval = new LeacParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope conditional55 =null;
		ParserRuleReturnScope loop56 =null;
		ParserRuleReturnScope affect_or_procedure_call57 =null;
		ParserRuleReturnScope returning58 =null;
		ParserRuleReturnScope block59 =null;
		ParserRuleReturnScope read60 =null;
		ParserRuleReturnScope write61 =null;

		RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
		RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
		RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
		RewriteRuleSubtreeStream stream_returning=new RewriteRuleSubtreeStream(adaptor,"rule returning");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_affect_or_procedure_call=new RewriteRuleSubtreeStream(adaptor,"rule affect_or_procedure_call");
		RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");

		try {
			// Leac.g:126:5: ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write )
			int alt11=7;
			switch ( input.LA(1) ) {
			case 96:
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
			case 104:
				{
				alt11=4;
				}
				break;
			case 110:
				{
				alt11=5;
				}
				break;
			case 102:
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
					// Leac.g:126:7: conditional
					{
					pushFollow(FOLLOW_conditional_in_statement971);
					conditional55=conditional();
					state._fsp--;

					stream_conditional.add(conditional55.getTree());
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
					// 126:19: -> conditional
					{
						adaptor.addChild(root_0, stream_conditional.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// Leac.g:127:7: loop
					{
					pushFollow(FOLLOW_loop_in_statement983);
					loop56=loop();
					state._fsp--;

					stream_loop.add(loop56.getTree());
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
					// 127:12: -> loop
					{
						adaptor.addChild(root_0, stream_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:128:7: affect_or_procedure_call
					{
					pushFollow(FOLLOW_affect_or_procedure_call_in_statement995);
					affect_or_procedure_call57=affect_or_procedure_call();
					state._fsp--;

					stream_affect_or_procedure_call.add(affect_or_procedure_call57.getTree());
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
					// 128:32: -> affect_or_procedure_call
					{
						adaptor.addChild(root_0, stream_affect_or_procedure_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// Leac.g:129:7: returning
					{
					pushFollow(FOLLOW_returning_in_statement1007);
					returning58=returning();
					state._fsp--;

					stream_returning.add(returning58.getTree());
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
					// 129:17: -> returning
					{
						adaptor.addChild(root_0, stream_returning.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// Leac.g:130:7: block
					{
					pushFollow(FOLLOW_block_in_statement1019);
					block59=block();
					state._fsp--;

					stream_block.add(block59.getTree());
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
					// 130:13: -> block
					{
						adaptor.addChild(root_0, stream_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// Leac.g:131:7: read
					{
					pushFollow(FOLLOW_read_in_statement1031);
					read60=read();
					state._fsp--;

					stream_read.add(read60.getTree());
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
					// 131:12: -> read
					{
						adaptor.addChild(root_0, stream_read.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// Leac.g:132:7: write
					{
					pushFollow(FOLLOW_write_in_statement1043);
					write61=write();
					state._fsp--;

					stream_write.add(write61.getTree());
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
					// 132:13: -> write
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
	// Leac.g:135:1: conditional : 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) ) ;
	public final LeacParser.conditional_return conditional() throws RecognitionException {
		LeacParser.conditional_return retval = new LeacParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal62=null;
		Token string_literal64=null;
		Token string_literal65=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope second =null;
		ParserRuleReturnScope expr63 =null;

		Object string_literal62_tree=null;
		Object string_literal64_tree=null;
		Object string_literal65_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:136:5: ( 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) ) )
			// Leac.g:136:7: 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) )
			{
			string_literal62=(Token)match(input,96,FOLLOW_96_in_conditional1064);  
			stream_96.add(string_literal62);

			pushFollow(FOLLOW_expr_in_conditional1066);
			expr63=expr();
			state._fsp--;

			stream_expr.add(expr63.getTree());
			string_literal64=(Token)match(input,105,FOLLOW_105_in_conditional1068);  
			stream_105.add(string_literal64);

			pushFollow(FOLLOW_statement_in_conditional1072);
			first=statement();
			state._fsp--;

			stream_statement.add(first.getTree());
			// Leac.g:137:9: ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==93) ) {
				alt12=1;
			}
			else if ( (LA12_0==EOF||LA12_0==78||LA12_0==111) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Leac.g:137:39: 'else' second= statement
					{
					string_literal65=(Token)match(input,93,FOLLOW_93_in_conditional1096);  
					stream_93.add(string_literal65);

					pushFollow(FOLLOW_statement_in_conditional1100);
					second=statement();
					state._fsp--;

					stream_statement.add(second.getTree());
					// AST REWRITE
					// elements: second, first, expr
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
					// 137:63: -> ^( CONDITIONAL expr $first $second)
					{
						// Leac.g:137:66: ^( CONDITIONAL expr $first $second)
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
					// Leac.g:138:25: 
					{
					// AST REWRITE
					// elements: expr, first
					// token labels: 
					// rule labels: first, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 138:25: -> ^( CONDITIONAL expr $first PASS )
					{
						// Leac.g:138:28: ^( CONDITIONAL expr $first PASS )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_1, stream_first.nextTree());
						adaptor.addChild(root_1, (Object)adaptor.create(PASS, "PASS"));
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
	// Leac.g:142:1: loop : 'while' expr 'do' statement -> ^( LOOP expr statement ) ;
	public final LeacParser.loop_return loop() throws RecognitionException {
		LeacParser.loop_return retval = new LeacParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal66=null;
		Token string_literal68=null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope statement69 =null;

		Object string_literal66_tree=null;
		Object string_literal68_tree=null;
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:143:5: ( 'while' expr 'do' statement -> ^( LOOP expr statement ) )
			// Leac.g:143:7: 'while' expr 'do' statement
			{
			string_literal66=(Token)match(input,108,FOLLOW_108_in_loop1166);  
			stream_108.add(string_literal66);

			pushFollow(FOLLOW_expr_in_loop1168);
			expr67=expr();
			state._fsp--;

			stream_expr.add(expr67.getTree());
			string_literal68=(Token)match(input,92,FOLLOW_92_in_loop1170);  
			stream_92.add(string_literal68);

			pushFollow(FOLLOW_statement_in_loop1172);
			statement69=statement();
			state._fsp--;

			stream_statement.add(statement69.getTree());
			// AST REWRITE
			// elements: expr, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 143:35: -> ^( LOOP expr statement )
			{
				// Leac.g:143:38: ^( LOOP expr statement )
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
	// Leac.g:146:1: coord_list : expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) ;
	public final LeacParser.coord_list_return coord_list() throws RecognitionException {
		LeacParser.coord_list_return retval = new LeacParser.coord_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal71=null;
		ParserRuleReturnScope expr70 =null;
		ParserRuleReturnScope expr72 =null;

		Object char_literal71_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:147:5: ( expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) )
			// Leac.g:147:7: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_coord_list1199);
			expr70=expr();
			state._fsp--;

			stream_expr.add(expr70.getTree());
			// Leac.g:147:12: ( ',' expr )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==73) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Leac.g:147:13: ',' expr
					{
					char_literal71=(Token)match(input,73,FOLLOW_73_in_coord_list1202);  
					stream_73.add(char_literal71);

					pushFollow(FOLLOW_expr_in_coord_list1204);
					expr72=expr();
					state._fsp--;

					stream_expr.add(expr72.getTree());
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
			// 147:24: -> ^( COORD_LIST ( expr )+ )
			{
				// Leac.g:147:27: ^( COORD_LIST ( expr )+ )
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
	// Leac.g:150:1: returning : 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) ;
	public final LeacParser.returning_return returning() throws RecognitionException {
		LeacParser.returning_return retval = new LeacParser.returning_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		ParserRuleReturnScope expr74 =null;

		Object string_literal73_tree=null;
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:151:5: ( 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) )
			// Leac.g:151:7: 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			{
			string_literal73=(Token)match(input,104,FOLLOW_104_in_returning1232);  
			stream_104.add(string_literal73);

			// Leac.g:152:9: ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==EOF||LA14_0==78||LA14_0==93||LA14_0==111) ) {
				alt14=1;
			}
			else if ( (LA14_0==BOOL||LA14_0==CHAR||LA14_0==FLOAT||LA14_0==IDF||LA14_0==INT||LA14_0==STRING||LA14_0==69||LA14_0==74||LA14_0==98) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// Leac.g:152:25: 
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
					// 152:25: -> ^( RETURNING NO_RETURN_VALUE )
					{
						// Leac.g:152:28: ^( RETURNING NO_RETURN_VALUE )
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
					// Leac.g:153:11: expr
					{
					pushFollow(FOLLOW_expr_in_returning1264);
					expr74=expr();
					state._fsp--;

					stream_expr.add(expr74.getTree());
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
					// 153:16: -> ^( RETURNING expr )
					{
						// Leac.g:153:19: ^( RETURNING expr )
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
	// Leac.g:157:1: affect_or_procedure_call : IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) ;
	public final LeacParser.affect_or_procedure_call_return affect_or_procedure_call() throws RecognitionException {
		LeacParser.affect_or_procedure_call_return retval = new LeacParser.affect_or_procedure_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token char_literal79=null;
		Token char_literal81=null;
		Token char_literal83=null;
		ParserRuleReturnScope coord_list77 =null;
		ParserRuleReturnScope expr80 =null;
		ParserRuleReturnScope arg_list82 =null;

		Object IDF75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object char_literal79_tree=null;
		Object char_literal81_tree=null;
		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try {
			// Leac.g:158:5: ( IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) )
			// Leac.g:158:7: IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			{
			IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_affect_or_procedure_call1299);  
			stream_IDF.add(IDF75);

			// Leac.g:159:9: ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==81||LA16_0==85) ) {
				alt16=1;
			}
			else if ( (LA16_0==69) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// Leac.g:160:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr
					{
					// Leac.g:160:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==81) ) {
						alt15=1;
					}
					else if ( (LA15_0==85) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// Leac.g:160:29: 
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
							// 160:29: -> ^( VAR IDF )
							{
								// Leac.g:160:32: ^( VAR IDF )
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
							// Leac.g:161:15: '[' coord_list ']'
							{
							char_literal76=(Token)match(input,85,FOLLOW_85_in_affect_or_procedure_call1349);  
							stream_85.add(char_literal76);

							pushFollow(FOLLOW_coord_list_in_affect_or_procedure_call1351);
							coord_list77=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list77.getTree());
							char_literal78=(Token)match(input,86,FOLLOW_86_in_affect_or_procedure_call1353);  
							stream_86.add(char_literal78);

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
							// 161:34: -> ^( CELL IDF coord_list )
							{
								// Leac.g:161:37: ^( CELL IDF coord_list )
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

					char_literal79=(Token)match(input,81,FOLLOW_81_in_affect_or_procedure_call1391);  
					stream_81.add(char_literal79);

					pushFollow(FOLLOW_expr_in_affect_or_procedure_call1393);
					expr80=expr();
					state._fsp--;

					stream_expr.add(expr80.getTree());
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
					// 163:22: -> ^( AFFECT $affect_or_procedure_call expr )
					{
						// Leac.g:163:25: ^( AFFECT $affect_or_procedure_call expr )
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
					// Leac.g:164:11: '(' arg_list ')'
					{
					char_literal81=(Token)match(input,69,FOLLOW_69_in_affect_or_procedure_call1416);  
					stream_69.add(char_literal81);

					pushFollow(FOLLOW_arg_list_in_affect_or_procedure_call1418);
					arg_list82=arg_list();
					state._fsp--;

					stream_arg_list.add(arg_list82.getTree());
					char_literal83=(Token)match(input,70,FOLLOW_70_in_affect_or_procedure_call1420);  
					stream_70.add(char_literal83);

					// AST REWRITE
					// elements: arg_list, IDF
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 164:28: -> ^( PROCEDURE_CALL IDF arg_list )
					{
						// Leac.g:164:31: ^( PROCEDURE_CALL IDF arg_list )
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
	// Leac.g:168:1: arg_list : ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) );
	public final LeacParser.arg_list_return arg_list() throws RecognitionException {
		LeacParser.arg_list_return retval = new LeacParser.arg_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal85=null;
		ParserRuleReturnScope expr84 =null;
		ParserRuleReturnScope expr86 =null;

		Object char_literal85_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// Leac.g:169:5: ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==70) ) {
				alt18=1;
			}
			else if ( (LA18_0==BOOL||LA18_0==CHAR||LA18_0==FLOAT||LA18_0==IDF||LA18_0==INT||LA18_0==STRING||LA18_0==69||LA18_0==74||LA18_0==98) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// Leac.g:169:21: 
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
					// 169:21: -> ^( ARG_LIST )
					{
						// Leac.g:169:24: ^( ARG_LIST )
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
					// Leac.g:170:7: expr ( ',' expr )*
					{
					pushFollow(FOLLOW_expr_in_arg_list1471);
					expr84=expr();
					state._fsp--;

					stream_expr.add(expr84.getTree());
					// Leac.g:170:12: ( ',' expr )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==73) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// Leac.g:170:13: ',' expr
							{
							char_literal85=(Token)match(input,73,FOLLOW_73_in_arg_list1474);  
							stream_73.add(char_literal85);

							pushFollow(FOLLOW_expr_in_arg_list1476);
							expr86=expr();
							state._fsp--;

							stream_expr.add(expr86.getTree());
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
					// 170:24: -> ^( ARG_LIST ( expr )+ )
					{
						// Leac.g:170:27: ^( ARG_LIST ( expr )+ )
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
	// Leac.g:173:1: block : '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' ;
	public final LeacParser.block_return block() throws RecognitionException {
		LeacParser.block_return retval = new LeacParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal87=null;
		Token char_literal89=null;
		Token char_literal91=null;
		ParserRuleReturnScope statement88 =null;
		ParserRuleReturnScope statement90 =null;

		Object char_literal87_tree=null;
		Object char_literal89_tree=null;
		Object char_literal91_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// Leac.g:174:5: ( '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' )
			// Leac.g:174:7: '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}'
			{
			char_literal87=(Token)match(input,110,FOLLOW_110_in_block1504);  
			stream_110.add(char_literal87);

			// Leac.g:175:9: ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==111) ) {
				alt20=1;
			}
			else if ( (LA20_0==IDF||LA20_0==96||LA20_0==102||LA20_0==104||(LA20_0 >= 108 && LA20_0 <= 110)) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// Leac.g:175:25: 
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
					// 175:25: -> ^( BLOCK )
					{
						// Leac.g:175:28: ^( BLOCK )
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
					// Leac.g:176:11: statement ( ';' statement )*
					{
					pushFollow(FOLLOW_statement_in_block1534);
					statement88=statement();
					state._fsp--;

					stream_statement.add(statement88.getTree());
					// Leac.g:176:21: ( ';' statement )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==78) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// Leac.g:176:22: ';' statement
							{
							char_literal89=(Token)match(input,78,FOLLOW_78_in_block1537);  
							stream_78.add(char_literal89);

							pushFollow(FOLLOW_statement_in_block1539);
							statement90=statement();
							state._fsp--;

							stream_statement.add(statement90.getTree());
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
					// 176:38: -> ^( BLOCK ( statement )+ )
					{
						// Leac.g:176:41: ^( BLOCK ( statement )+ )
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

			char_literal91=(Token)match(input,111,FOLLOW_111_in_block1568);  
			stream_111.add(char_literal91);

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
	// Leac.g:181:1: read : 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) ;
	public final LeacParser.read_return read() throws RecognitionException {
		LeacParser.read_return retval = new LeacParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal92=null;
		Token IDF93=null;
		Token char_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope coord_list95 =null;

		Object string_literal92_tree=null;
		Object IDF93_tree=null;
		Object char_literal94_tree=null;
		Object char_literal96_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try {
			// Leac.g:182:5: ( 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) )
			// Leac.g:182:7: 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			{
			string_literal92=(Token)match(input,102,FOLLOW_102_in_read1585);  
			stream_102.add(string_literal92);

			IDF93=(Token)match(input,IDF,FOLLOW_IDF_in_read1587);  
			stream_IDF.add(IDF93);

			// Leac.g:183:9: ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==EOF||LA21_0==78||LA21_0==93||LA21_0==111) ) {
				alt21=1;
			}
			else if ( (LA21_0==85) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// Leac.g:183:25: 
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
					// 183:25: -> ^( READ ^( VAR IDF ) )
					{
						// Leac.g:183:28: ^( READ ^( VAR IDF ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						// Leac.g:183:35: ^( VAR IDF )
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
					// Leac.g:184:11: '[' coord_list ']'
					{
					char_literal94=(Token)match(input,85,FOLLOW_85_in_read1623);  
					stream_85.add(char_literal94);

					pushFollow(FOLLOW_coord_list_in_read1625);
					coord_list95=coord_list();
					state._fsp--;

					stream_coord_list.add(coord_list95.getTree());
					char_literal96=(Token)match(input,86,FOLLOW_86_in_read1627);  
					stream_86.add(char_literal96);

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
					// 184:30: -> ^( READ ^( CELL IDF coord_list ) )
					{
						// Leac.g:184:33: ^( READ ^( CELL IDF coord_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						// Leac.g:184:40: ^( CELL IDF coord_list )
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
	// Leac.g:188:1: write : 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant_ext -> ^( WRITE constant_ext ) ) ;
	public final LeacParser.write_return write() throws RecognitionException {
		LeacParser.write_return retval = new LeacParser.write_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		Token IDF98=null;
		Token char_literal99=null;
		Token char_literal101=null;
		ParserRuleReturnScope coord_list100 =null;
		ParserRuleReturnScope constant_ext102 =null;

		Object string_literal97_tree=null;
		Object IDF98_tree=null;
		Object char_literal99_tree=null;
		Object char_literal101_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_constant_ext=new RewriteRuleSubtreeStream(adaptor,"rule constant_ext");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try {
			// Leac.g:189:5: ( 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant_ext -> ^( WRITE constant_ext ) ) )
			// Leac.g:189:7: 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant_ext -> ^( WRITE constant_ext ) )
			{
			string_literal97=(Token)match(input,109,FOLLOW_109_in_write1668);  
			stream_109.add(string_literal97);

			// Leac.g:190:9: ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant_ext -> ^( WRITE constant_ext ) )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==IDF) ) {
				alt23=1;
			}
			else if ( (LA23_0==BOOL||LA23_0==CHAR||LA23_0==FLOAT||LA23_0==INT||LA23_0==STRING||LA23_0==74) ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// Leac.g:190:11: IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) )
					{
					IDF98=(Token)match(input,IDF,FOLLOW_IDF_in_write1680);  
					stream_IDF.add(IDF98);

					// Leac.g:191:13: ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==EOF||LA22_0==78||LA22_0==93||LA22_0==111) ) {
						alt22=1;
					}
					else if ( (LA22_0==85) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// Leac.g:191:29: 
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
							// 191:29: -> ^( WRITE ^( VAR IDF ) )
							{
								// Leac.g:191:32: ^( WRITE ^( VAR IDF ) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
								// Leac.g:191:40: ^( VAR IDF )
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
							// Leac.g:192:15: '[' coord_list ']'
							{
							char_literal99=(Token)match(input,85,FOLLOW_85_in_write1724);  
							stream_85.add(char_literal99);

							pushFollow(FOLLOW_coord_list_in_write1726);
							coord_list100=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list100.getTree());
							char_literal101=(Token)match(input,86,FOLLOW_86_in_write1728);  
							stream_86.add(char_literal101);

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
							// 192:34: -> ^( WRITE ^( CELL IDF coord_list ) )
							{
								// Leac.g:192:37: ^( WRITE ^( CELL IDF coord_list ) )
								{
								Object root_1 = (Object)adaptor.nil();
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
								// Leac.g:192:45: ^( CELL IDF coord_list )
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
					break;
				case 2 :
					// Leac.g:194:11: constant_ext
					{
					pushFollow(FOLLOW_constant_ext_in_write1768);
					constant_ext102=constant_ext();
					state._fsp--;

					stream_constant_ext.add(constant_ext102.getTree());
					// AST REWRITE
					// elements: constant_ext
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 194:24: -> ^( WRITE constant_ext )
					{
						// Leac.g:194:27: ^( WRITE constant_ext )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
						adaptor.addChild(root_1, stream_constant_ext.nextTree());
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
	// $ANTLR end "write"


	public static class expr_0_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_0"
	// Leac.g:198:1: expr_0 : ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr );
	public final LeacParser.expr_0_return expr_0() throws RecognitionException {
		LeacParser.expr_0_return retval = new LeacParser.expr_0_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF103=null;
		Token char_literal104=null;
		Token char_literal106=null;
		Token char_literal107=null;
		Token char_literal109=null;
		Token char_literal111=null;
		Token char_literal113=null;
		ParserRuleReturnScope arg_list105 =null;
		ParserRuleReturnScope coord_list108 =null;
		ParserRuleReturnScope constant110 =null;
		ParserRuleReturnScope expr112 =null;

		Object IDF103_tree=null;
		Object char_literal104_tree=null;
		Object char_literal106_tree=null;
		Object char_literal107_tree=null;
		Object char_literal109_tree=null;
		Object char_literal111_tree=null;
		Object char_literal113_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try {
			// Leac.g:199:5: ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr )
			int alt25=3;
			switch ( input.LA(1) ) {
			case IDF:
				{
				alt25=1;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				alt25=2;
				}
				break;
			case 69:
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
					// Leac.g:199:7: IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					{
					IDF103=(Token)match(input,IDF,FOLLOW_IDF_in_expr_01803);  
					stream_IDF.add(IDF103);

					// Leac.g:200:9: ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt24=3;
					switch ( input.LA(1) ) {
					case EOF:
					case 68:
					case 70:
					case 71:
					case 72:
					case 73:
					case 74:
					case 76:
					case 78:
					case 79:
					case 80:
					case 82:
					case 83:
					case 84:
					case 86:
					case 87:
					case 88:
					case 92:
					case 93:
					case 100:
					case 105:
					case 111:
						{
						alt24=1;
						}
						break;
					case 69:
						{
						alt24=2;
						}
						break;
					case 85:
						{
						alt24=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 24, 0, input);
						throw nvae;
					}
					switch (alt24) {
						case 1 :
							// Leac.g:200:25: 
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
							// 200:25: -> ^( VAR IDF )
							{
								// Leac.g:200:28: ^( VAR IDF )
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
							// Leac.g:201:11: '(' arg_list ')'
							{
							char_literal104=(Token)match(input,69,FOLLOW_69_in_expr_01835);  
							stream_69.add(char_literal104);

							pushFollow(FOLLOW_arg_list_in_expr_01837);
							arg_list105=arg_list();
							state._fsp--;

							stream_arg_list.add(arg_list105.getTree());
							char_literal106=(Token)match(input,70,FOLLOW_70_in_expr_01839);  
							stream_70.add(char_literal106);

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
							// 201:28: -> ^( FUNC_CALL IDF arg_list )
							{
								// Leac.g:201:31: ^( FUNC_CALL IDF arg_list )
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
							// Leac.g:202:11: '[' coord_list ']'
							{
							char_literal107=(Token)match(input,85,FOLLOW_85_in_expr_01861);  
							stream_85.add(char_literal107);

							pushFollow(FOLLOW_coord_list_in_expr_01863);
							coord_list108=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list108.getTree());
							char_literal109=(Token)match(input,86,FOLLOW_86_in_expr_01865);  
							stream_86.add(char_literal109);

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
							// 202:30: -> ^( CELL IDF coord_list )
							{
								// Leac.g:202:33: ^( CELL IDF coord_list )
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
					// Leac.g:204:7: constant
					{
					pushFollow(FOLLOW_constant_in_expr_01893);
					constant110=constant();
					state._fsp--;

					stream_constant.add(constant110.getTree());
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
					// 204:16: -> constant
					{
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// Leac.g:205:7: '(' expr ')'
					{
					char_literal111=(Token)match(input,69,FOLLOW_69_in_expr_01905);  
					stream_69.add(char_literal111);

					pushFollow(FOLLOW_expr_in_expr_01907);
					expr112=expr();
					state._fsp--;

					stream_expr.add(expr112.getTree());
					char_literal113=(Token)match(input,70,FOLLOW_70_in_expr_01909);  
					stream_70.add(char_literal113);

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
					// 205:20: -> expr
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
	// Leac.g:208:1: expr_1 : ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? ;
	public final LeacParser.expr_1_return expr_1() throws RecognitionException {
		LeacParser.expr_1_return retval = new LeacParser.expr_1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal115=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_0114 =null;

		Object char_literal115_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expr_1_proxy=new RewriteRuleSubtreeStream(adaptor,"rule expr_1_proxy");
		RewriteRuleSubtreeStream stream_expr_0=new RewriteRuleSubtreeStream(adaptor,"rule expr_0");

		try {
			// Leac.g:209:5: ( ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? )
			// Leac.g:209:7: ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			{
			// Leac.g:209:7: ( expr_0 -> expr_0 )
			// Leac.g:209:8: expr_0
			{
			pushFollow(FOLLOW_expr_0_in_expr_11931);
			expr_0114=expr_0();
			state._fsp--;

			stream_expr_0.add(expr_0114.getTree());
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
			// 209:15: -> expr_0
			{
				adaptor.addChild(root_0, stream_expr_0.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:210:9: ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==87) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// Leac.g:210:11: '^' next= expr_1_proxy
					{
					char_literal115=(Token)match(input,87,FOLLOW_87_in_expr_11948);  
					stream_87.add(char_literal115);

					pushFollow(FOLLOW_expr_1_proxy_in_expr_11952);
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
					// 210:33: -> ^( POW $expr_1 $next)
					{
						// Leac.g:210:36: ^( POW $expr_1 $next)
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
	// Leac.g:213:1: expr_1_proxy : expr_1 -> expr_1 ;
	public final LeacParser.expr_1_proxy_return expr_1_proxy() throws RecognitionException {
		LeacParser.expr_1_proxy_return retval = new LeacParser.expr_1_proxy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_1116 =null;

		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try {
			// Leac.g:214:5: ( expr_1 -> expr_1 )
			// Leac.g:214:7: expr_1
			{
			pushFollow(FOLLOW_expr_1_in_expr_1_proxy1991);
			expr_1116=expr_1();
			state._fsp--;

			stream_expr_1.add(expr_1116.getTree());
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
			// 214:14: -> expr_1
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
	// Leac.g:217:1: expr_2 : ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 );
	public final LeacParser.expr_2_return expr_2() throws RecognitionException {
		LeacParser.expr_2_return retval = new LeacParser.expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal117=null;
		Token string_literal119=null;
		ParserRuleReturnScope expr_1118 =null;
		ParserRuleReturnScope expr_1120 =null;
		ParserRuleReturnScope expr_1121 =null;

		Object char_literal117_tree=null;
		Object string_literal119_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try {
			// Leac.g:218:5: ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 )
			int alt27=3;
			switch ( input.LA(1) ) {
			case 74:
				{
				alt27=1;
				}
				break;
			case 98:
				{
				alt27=2;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case IDF:
			case INT:
			case STRING:
			case 69:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// Leac.g:218:7: '-' expr_1
					{
					char_literal117=(Token)match(input,74,FOLLOW_74_in_expr_22012);  
					stream_74.add(char_literal117);

					pushFollow(FOLLOW_expr_1_in_expr_22014);
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
					// 218:18: -> ^( UNARY_MINUS expr_1 )
					{
						// Leac.g:218:21: ^( UNARY_MINUS expr_1 )
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
					// Leac.g:219:7: 'not' expr_1
					{
					string_literal119=(Token)match(input,98,FOLLOW_98_in_expr_22030);  
					stream_98.add(string_literal119);

					pushFollow(FOLLOW_expr_1_in_expr_22032);
					expr_1120=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1120.getTree());
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
					// 219:20: -> ^( NOT expr_1 )
					{
						// Leac.g:219:23: ^( NOT expr_1 )
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
					// Leac.g:220:7: expr_1
					{
					pushFollow(FOLLOW_expr_1_in_expr_22048);
					expr_1121=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1121.getTree());
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
					// 220:14: -> expr_1
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
	// Leac.g:223:1: expr_3 : ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* ;
	public final LeacParser.expr_3_return expr_3() throws RecognitionException {
		LeacParser.expr_3_return retval = new LeacParser.expr_3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal123=null;
		Token char_literal124=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_2122 =null;

		Object char_literal123_tree=null;
		Object char_literal124_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_expr_2=new RewriteRuleSubtreeStream(adaptor,"rule expr_2");

		try {
			// Leac.g:224:5: ( ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* )
			// Leac.g:224:7: ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			{
			// Leac.g:224:7: ( expr_2 -> expr_2 )
			// Leac.g:224:8: expr_2
			{
			pushFollow(FOLLOW_expr_2_in_expr_32070);
			expr_2122=expr_2();
			state._fsp--;

			stream_expr_2.add(expr_2122.getTree());
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
			// 224:15: -> expr_2
			{
				adaptor.addChild(root_0, stream_expr_2.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:225:9: ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==71) ) {
					alt28=1;
				}
				else if ( (LA28_0==76) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// Leac.g:225:11: '*' next= expr_2
					{
					char_literal123=(Token)match(input,71,FOLLOW_71_in_expr_32087);  
					stream_71.add(char_literal123);

					pushFollow(FOLLOW_expr_2_in_expr_32091);
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
					// 225:27: -> ^( MUL $expr_3 $next)
					{
						// Leac.g:225:30: ^( MUL $expr_3 $next)
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
					// Leac.g:226:11: '/' next= expr_2
					{
					char_literal124=(Token)match(input,76,FOLLOW_76_in_expr_32115);  
					stream_76.add(char_literal124);

					pushFollow(FOLLOW_expr_2_in_expr_32119);
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
					// 226:27: -> ^( DIV $expr_3 $next)
					{
						// Leac.g:226:30: ^( DIV $expr_3 $next)
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
	// $ANTLR end "expr_3"


	public static class expr_4_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_4"
	// Leac.g:230:1: expr_4 : ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* ;
	public final LeacParser.expr_4_return expr_4() throws RecognitionException {
		LeacParser.expr_4_return retval = new LeacParser.expr_4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token char_literal127=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_3125 =null;

		Object char_literal126_tree=null;
		Object char_literal127_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_expr_3=new RewriteRuleSubtreeStream(adaptor,"rule expr_3");

		try {
			// Leac.g:231:5: ( ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* )
			// Leac.g:231:7: ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			{
			// Leac.g:231:7: ( expr_3 -> expr_3 )
			// Leac.g:231:8: expr_3
			{
			pushFollow(FOLLOW_expr_3_in_expr_42160);
			expr_3125=expr_3();
			state._fsp--;

			stream_expr_3.add(expr_3125.getTree());
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
			// 231:15: -> expr_3
			{
				adaptor.addChild(root_0, stream_expr_3.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:232:9: ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==72) ) {
					alt29=1;
				}
				else if ( (LA29_0==74) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// Leac.g:232:11: '+' next= expr_3
					{
					char_literal126=(Token)match(input,72,FOLLOW_72_in_expr_42177);  
					stream_72.add(char_literal126);

					pushFollow(FOLLOW_expr_3_in_expr_42181);
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
					// 232:27: -> ^( ADD $expr_4 $next)
					{
						// Leac.g:232:30: ^( ADD $expr_4 $next)
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
					// Leac.g:233:11: '-' next= expr_3
					{
					char_literal127=(Token)match(input,74,FOLLOW_74_in_expr_42205);  
					stream_74.add(char_literal127);

					pushFollow(FOLLOW_expr_3_in_expr_42209);
					next=expr_3();
					state._fsp--;

					stream_expr_3.add(next.getTree());
					// AST REWRITE
					// elements: expr_4, next
					// token labels: 
					// rule labels: next, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 233:27: -> ^( SUB $expr_4 $next)
					{
						// Leac.g:233:30: ^( SUB $expr_4 $next)
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
	// $ANTLR end "expr_4"


	public static class expr_5_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_5"
	// Leac.g:237:1: expr_5 : ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* ;
	public final LeacParser.expr_5_return expr_5() throws RecognitionException {
		LeacParser.expr_5_return retval = new LeacParser.expr_5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal129=null;
		Token string_literal130=null;
		Token char_literal131=null;
		Token string_literal132=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_4128 =null;

		Object char_literal129_tree=null;
		Object string_literal130_tree=null;
		Object char_literal131_tree=null;
		Object string_literal132_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expr_4=new RewriteRuleSubtreeStream(adaptor,"rule expr_4");

		try {
			// Leac.g:238:5: ( ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* )
			// Leac.g:238:7: ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			{
			// Leac.g:238:7: ( expr_4 -> expr_4 )
			// Leac.g:238:8: expr_4
			{
			pushFollow(FOLLOW_expr_4_in_expr_52250);
			expr_4128=expr_4();
			state._fsp--;

			stream_expr_4.add(expr_4128.getTree());
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
			// 238:15: -> expr_4
			{
				adaptor.addChild(root_0, stream_expr_4.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:239:9: ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			loop30:
			while (true) {
				int alt30=5;
				switch ( input.LA(1) ) {
				case 79:
					{
					alt30=1;
					}
					break;
				case 80:
					{
					alt30=2;
					}
					break;
				case 83:
					{
					alt30=3;
					}
					break;
				case 84:
					{
					alt30=4;
					}
					break;
				}
				switch (alt30) {
				case 1 :
					// Leac.g:239:11: '<' next= expr_4
					{
					char_literal129=(Token)match(input,79,FOLLOW_79_in_expr_52267);  
					stream_79.add(char_literal129);

					pushFollow(FOLLOW_expr_4_in_expr_52271);
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
					// 239:27: -> ^( TEST_LT $expr_5 $next)
					{
						// Leac.g:239:30: ^( TEST_LT $expr_5 $next)
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
					// Leac.g:240:11: '<=' next= expr_4
					{
					string_literal130=(Token)match(input,80,FOLLOW_80_in_expr_52295);  
					stream_80.add(string_literal130);

					pushFollow(FOLLOW_expr_4_in_expr_52299);
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
					// 240:28: -> ^( TEST_LE $expr_5 $next)
					{
						// Leac.g:240:31: ^( TEST_LE $expr_5 $next)
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
					// Leac.g:241:11: '>' next= expr_4
					{
					char_literal131=(Token)match(input,83,FOLLOW_83_in_expr_52323);  
					stream_83.add(char_literal131);

					pushFollow(FOLLOW_expr_4_in_expr_52327);
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
					// 241:27: -> ^( TEST_GT $expr_5 $next)
					{
						// Leac.g:241:30: ^( TEST_GT $expr_5 $next)
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
					// Leac.g:242:11: '>=' next= expr_4
					{
					string_literal132=(Token)match(input,84,FOLLOW_84_in_expr_52351);  
					stream_84.add(string_literal132);

					pushFollow(FOLLOW_expr_4_in_expr_52355);
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
					// 242:28: -> ^( TEST_GE $expr_5 $next)
					{
						// Leac.g:242:31: ^( TEST_GE $expr_5 $next)
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
	// $ANTLR end "expr_5"


	public static class expr_6_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_6"
	// Leac.g:246:1: expr_6 : ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* ;
	public final LeacParser.expr_6_return expr_6() throws RecognitionException {
		LeacParser.expr_6_return retval = new LeacParser.expr_6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal134=null;
		Token string_literal135=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_5133 =null;

		Object string_literal134_tree=null;
		Object string_literal135_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_expr_5=new RewriteRuleSubtreeStream(adaptor,"rule expr_5");

		try {
			// Leac.g:247:5: ( ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* )
			// Leac.g:247:7: ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			{
			// Leac.g:247:7: ( expr_5 -> expr_5 )
			// Leac.g:247:8: expr_5
			{
			pushFollow(FOLLOW_expr_5_in_expr_62396);
			expr_5133=expr_5();
			state._fsp--;

			stream_expr_5.add(expr_5133.getTree());
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
			// 247:15: -> expr_5
			{
				adaptor.addChild(root_0, stream_expr_5.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:248:9: ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==82) ) {
					alt31=1;
				}
				else if ( (LA31_0==68) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// Leac.g:248:11: '==' next= expr_5
					{
					string_literal134=(Token)match(input,82,FOLLOW_82_in_expr_62413);  
					stream_82.add(string_literal134);

					pushFollow(FOLLOW_expr_5_in_expr_62417);
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
					// 248:28: -> ^( TEST_EQ $expr_6 $next)
					{
						// Leac.g:248:31: ^( TEST_EQ $expr_6 $next)
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
					// Leac.g:249:11: '!=' next= expr_5
					{
					string_literal135=(Token)match(input,68,FOLLOW_68_in_expr_62441);  
					stream_68.add(string_literal135);

					pushFollow(FOLLOW_expr_5_in_expr_62445);
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
					// 249:28: -> ^( TEST_NE $expr_6 $next)
					{
						// Leac.g:249:31: ^( TEST_NE $expr_6 $next)
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
	// $ANTLR end "expr_6"


	public static class expr_7_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr_7"
	// Leac.g:253:1: expr_7 : ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* ;
	public final LeacParser.expr_7_return expr_7() throws RecognitionException {
		LeacParser.expr_7_return retval = new LeacParser.expr_7_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal137=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_6136 =null;

		Object string_literal137_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleSubtreeStream stream_expr_6=new RewriteRuleSubtreeStream(adaptor,"rule expr_6");

		try {
			// Leac.g:254:5: ( ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* )
			// Leac.g:254:7: ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			{
			// Leac.g:254:7: ( expr_6 -> expr_6 )
			// Leac.g:254:8: expr_6
			{
			pushFollow(FOLLOW_expr_6_in_expr_72486);
			expr_6136=expr_6();
			state._fsp--;

			stream_expr_6.add(expr_6136.getTree());
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
			// 254:15: -> expr_6
			{
				adaptor.addChild(root_0, stream_expr_6.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:255:9: ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==88) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// Leac.g:255:11: 'and' next= expr_6
					{
					string_literal137=(Token)match(input,88,FOLLOW_88_in_expr_72503);  
					stream_88.add(string_literal137);

					pushFollow(FOLLOW_expr_6_in_expr_72507);
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
					// 255:29: -> ^( AND $expr_7 $next)
					{
						// Leac.g:255:32: ^( AND $expr_7 $next)
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
					break loop32;
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
	// Leac.g:259:1: expr_8 : ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* ;
	public final LeacParser.expr_8_return expr_8() throws RecognitionException {
		LeacParser.expr_8_return retval = new LeacParser.expr_8_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal139=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_7138 =null;

		Object string_literal139_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_expr_7=new RewriteRuleSubtreeStream(adaptor,"rule expr_7");

		try {
			// Leac.g:260:5: ( ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* )
			// Leac.g:260:7: ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			{
			// Leac.g:260:7: ( expr_7 -> expr_7 )
			// Leac.g:260:8: expr_7
			{
			pushFollow(FOLLOW_expr_7_in_expr_82548);
			expr_7138=expr_7();
			state._fsp--;

			stream_expr_7.add(expr_7138.getTree());
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
			// 260:15: -> expr_7
			{
				adaptor.addChild(root_0, stream_expr_7.nextTree());
			}


			retval.tree = root_0;

			}

			// Leac.g:261:9: ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==100) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// Leac.g:261:11: 'or' next= expr_7
					{
					string_literal139=(Token)match(input,100,FOLLOW_100_in_expr_82565);  
					stream_100.add(string_literal139);

					pushFollow(FOLLOW_expr_7_in_expr_82569);
					next=expr_7();
					state._fsp--;

					stream_expr_7.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_8
					// token labels: 
					// rule labels: next, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 261:28: -> ^( OR $expr_8 $next)
					{
						// Leac.g:261:31: ^( OR $expr_8 $next)
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
					break loop33;
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
	// Leac.g:265:1: expr : expr_8 -> expr_8 ;
	public final LeacParser.expr_return expr() throws RecognitionException {
		LeacParser.expr_return retval = new LeacParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_8140 =null;

		RewriteRuleSubtreeStream stream_expr_8=new RewriteRuleSubtreeStream(adaptor,"rule expr_8");

		try {
			// Leac.g:266:5: ( expr_8 -> expr_8 )
			// Leac.g:266:7: expr_8
			{
			pushFollow(FOLLOW_expr_8_in_expr2609);
			expr_8140=expr_8();
			state._fsp--;

			stream_expr_8.add(expr_8140.getTree());
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
			// 266:14: -> expr_8
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
	// Leac.g:269:1: constant : ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_return constant() throws RecognitionException {
		LeacParser.constant_return retval = new LeacParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT141=null;
		Token FLOAT142=null;
		Token BOOL143=null;
		Token STRING144=null;
		Token CHAR145=null;

		Object INT141_tree=null;
		Object FLOAT142_tree=null;
		Object BOOL143_tree=null;
		Object STRING144_tree=null;
		Object CHAR145_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:270:5: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt34=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt34=1;
				}
				break;
			case FLOAT:
				{
				alt34=2;
				}
				break;
			case BOOL:
				{
				alt34=3;
				}
				break;
			case STRING:
				{
				alt34=4;
				}
				break;
			case CHAR:
				{
				alt34=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// Leac.g:270:7: INT
					{
					INT141=(Token)match(input,INT,FOLLOW_INT_in_constant2630);  
					stream_INT.add(INT141);

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
					// 270:11: -> ^( CONST INT_TYPENAME INT )
					{
						// Leac.g:270:14: ^( CONST INT_TYPENAME INT )
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
					// Leac.g:271:7: FLOAT
					{
					FLOAT142=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2648);  
					stream_FLOAT.add(FLOAT142);

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
					// 271:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						// Leac.g:271:16: ^( CONST FLOAT_TYPENAME FLOAT )
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
					// Leac.g:272:7: BOOL
					{
					BOOL143=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant2666);  
					stream_BOOL.add(BOOL143);

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
					// 272:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						// Leac.g:272:15: ^( CONST BOOL_TYPENAME BOOL )
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
					// Leac.g:273:7: STRING
					{
					STRING144=(Token)match(input,STRING,FOLLOW_STRING_in_constant2684);  
					stream_STRING.add(STRING144);

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
					// 273:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						// Leac.g:273:17: ^( CONST STRING_TYPENAME STRING )
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
					// Leac.g:274:7: CHAR
					{
					CHAR145=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant2702);  
					stream_CHAR.add(CHAR145);

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
					// 274:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						// Leac.g:274:15: ^( CONST CHAR_TYPENAME CHAR )
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
	// Leac.g:277:1: constant_ext : ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_ext_return constant_ext() throws RecognitionException {
		LeacParser.constant_ext_return retval = new LeacParser.constant_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal146=null;
		Token INT147=null;
		Token FLOAT148=null;
		Token INT149=null;
		Token FLOAT150=null;
		Token BOOL151=null;
		Token STRING152=null;
		Token CHAR153=null;

		Object char_literal146_tree=null;
		Object INT147_tree=null;
		Object FLOAT148_tree=null;
		Object INT149_tree=null;
		Object FLOAT150_tree=null;
		Object BOOL151_tree=null;
		Object STRING152_tree=null;
		Object CHAR153_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try {
			// Leac.g:278:5: ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt36=6;
			switch ( input.LA(1) ) {
			case 74:
				{
				alt36=1;
				}
				break;
			case INT:
				{
				alt36=2;
				}
				break;
			case FLOAT:
				{
				alt36=3;
				}
				break;
			case BOOL:
				{
				alt36=4;
				}
				break;
			case STRING:
				{
				alt36=5;
				}
				break;
			case CHAR:
				{
				alt36=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// Leac.g:278:7: '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					{
					char_literal146=(Token)match(input,74,FOLLOW_74_in_constant_ext2729);  
					stream_74.add(char_literal146);

					// Leac.g:279:9: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==INT) ) {
						alt35=1;
					}
					else if ( (LA35_0==FLOAT) ) {
						alt35=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 35, 0, input);
						throw nvae;
					}

					switch (alt35) {
						case 1 :
							// Leac.g:279:11: INT
							{
							INT147=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2741);  
							stream_INT.add(INT147);

							 INT147.setText("-" + INT147.getText()); 
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
							// 279:55: -> ^( CONST INT_TYPENAME INT )
							{
								// Leac.g:279:58: ^( CONST INT_TYPENAME INT )
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
							// Leac.g:280:11: FLOAT
							{
							FLOAT148=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2765);  
							stream_FLOAT.add(FLOAT148);

							 FLOAT148.setText("-" + FLOAT148.getText()); 
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
							// 280:61: -> ^( CONST FLOAT_TYPENAME FLOAT )
							{
								// Leac.g:280:64: ^( CONST FLOAT_TYPENAME FLOAT )
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
					// Leac.g:282:7: INT
					{
					INT149=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2795);  
					stream_INT.add(INT149);

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
					// 282:11: -> ^( CONST INT_TYPENAME INT )
					{
						// Leac.g:282:14: ^( CONST INT_TYPENAME INT )
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
					// Leac.g:283:7: FLOAT
					{
					FLOAT150=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2813);  
					stream_FLOAT.add(FLOAT150);

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
					// 283:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						// Leac.g:283:16: ^( CONST FLOAT_TYPENAME FLOAT )
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
					// Leac.g:284:7: BOOL
					{
					BOOL151=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant_ext2831);  
					stream_BOOL.add(BOOL151);

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
					// 284:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						// Leac.g:284:15: ^( CONST BOOL_TYPENAME BOOL )
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
					// Leac.g:285:7: STRING
					{
					STRING152=(Token)match(input,STRING,FOLLOW_STRING_in_constant_ext2849);  
					stream_STRING.add(STRING152);

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
					// 285:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						// Leac.g:285:17: ^( CONST STRING_TYPENAME STRING )
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
					// Leac.g:286:7: CHAR
					{
					CHAR153=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_ext2867);  
					stream_CHAR.add(CHAR153);

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
					// 286:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						// Leac.g:286:15: ^( CONST CHAR_TYPENAME CHAR )
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



	public static final BitSet FOLLOW_101_in_program414 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_program416 = new BitSet(new long[]{0x0000000080000000L,0x0000754180000000L});
	public static final BitSet FOLLOW_var_decl_list_in_program418 = new BitSet(new long[]{0x0000000080000000L,0x0000714180000000L});
	public static final BitSet FOLLOW_func_decl_list_in_program420 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_program422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_var_decl_list451 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_106_in_var_decl477 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_idf_list_in_var_decl479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_var_decl481 = new BitSet(new long[]{0x0000000000000000L,0x000008024E000000L});
	public static final BitSet FOLLOW_typename_in_var_decl483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_var_decl485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_idf_list511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_idf_list514 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_idf_list516 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_func_decl_in_func_decl_list544 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
	public static final BitSet FOLLOW_95_in_func_decl570 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_func_decl572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_func_decl574 = new BitSet(new long[]{0x0000000080000000L,0x0000008000000040L});
	public static final BitSet FOLLOW_param_list_in_func_decl576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_func_decl578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_func_decl580 = new BitSet(new long[]{0x0000000000000000L,0x000008024C000000L});
	public static final BitSet FOLLOW_atom_typename_in_func_decl582 = new BitSet(new long[]{0x0000000000000000L,0x0000440000000000L});
	public static final BitSet FOLLOW_var_decl_list_in_func_decl584 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_block_in_func_decl586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_typename_in_typename617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_typename_in_typename633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_atom_typename654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_atom_typename666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_atom_typename678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_94_in_atom_typename690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_91_in_atom_typename702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_array_typename723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_array_typename725 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_range_list_in_array_typename727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_array_typename729 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_array_typename731 = new BitSet(new long[]{0x0000000000000000L,0x000008024C000000L});
	public static final BitSet FOLLOW_atom_typename_in_array_typename733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_range_list760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_range_list763 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_range_in_range_list765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_int_ext_in_range794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_range796 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_int_ext_in_range800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int_ext829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_int_ext841 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INT_in_int_ext843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list880 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_param_list883 = new BitSet(new long[]{0x0000000080000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_param_in_param_list885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_param912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_param914 = new BitSet(new long[]{0x0000000000000000L,0x000008024E000000L});
	public static final BitSet FOLLOW_typename_in_param916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_param936 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_param938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_param940 = new BitSet(new long[]{0x0000000000000000L,0x000008024E000000L});
	public static final BitSet FOLLOW_typename_in_param942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_statement983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_or_procedure_call_in_statement995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returning_in_statement1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_in_statement1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_conditional1064 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_conditional1066 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_conditional1068 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_conditional1072 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_conditional1096 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_conditional1100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_loop1166 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_loop1168 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_loop1170 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_loop1172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_coord_list1199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_coord_list1202 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_coord_list1204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_104_in_returning1232 = new BitSet(new long[]{0x0008000282010802L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_returning1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_affect_or_procedure_call1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000220020L});
	public static final BitSet FOLLOW_85_in_affect_or_procedure_call1349 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_affect_or_procedure_call1351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_affect_or_procedure_call1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_affect_or_procedure_call1391 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_affect_or_procedure_call1393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_affect_or_procedure_call1416 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000460L});
	public static final BitSet FOLLOW_arg_list_in_affect_or_procedure_call1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_affect_or_procedure_call1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list1471 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_arg_list1474 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_arg_list1476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_110_in_block1504 = new BitSet(new long[]{0x0000000080000000L,0x0000F14100000000L});
	public static final BitSet FOLLOW_statement_in_block1534 = new BitSet(new long[]{0x0000000000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_78_in_block1537 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_block1539 = new BitSet(new long[]{0x0000000000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_111_in_block1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_read1585 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_read1587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_read1623 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_read1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_read1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_write1668 = new BitSet(new long[]{0x0008000282010800L,0x0000000000000400L});
	public static final BitSet FOLLOW_IDF_in_write1680 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_write1724 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_write1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_write1728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_ext_in_write1768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_expr_01803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200020L});
	public static final BitSet FOLLOW_69_in_expr_01835 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000460L});
	public static final BitSet FOLLOW_arg_list_in_expr_01837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_expr_01839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_expr_01861 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_expr_01863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expr_01865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_01893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_expr_01905 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_expr_01907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_expr_01909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_0_in_expr_11931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_expr_11948 = new BitSet(new long[]{0x0008000282010800L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_1_proxy_in_expr_11952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_1_proxy1991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_expr_22012 = new BitSet(new long[]{0x0008000282010800L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_1_in_expr_22014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_98_in_expr_22030 = new BitSet(new long[]{0x0008000282010800L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_1_in_expr_22032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_22048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr_32070 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_71_in_expr_32087 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_2_in_expr_32091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_76_in_expr_32115 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_2_in_expr_32119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_expr_3_in_expr_42160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_72_in_expr_42177 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_3_in_expr_42181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_74_in_expr_42205 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_3_in_expr_42209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_expr_4_in_expr_52250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_79_in_expr_52267 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52271 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_80_in_expr_52295 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_83_in_expr_52323 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_84_in_expr_52351 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_expr_5_in_expr_62396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_82_in_expr_62413 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_5_in_expr_62417 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_68_in_expr_62441 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_5_in_expr_62445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_expr_6_in_expr_72486 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_expr_72503 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_6_in_expr_72507 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_expr_7_in_expr_82548 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_expr_82565 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_7_in_expr_82569 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_expr_8_in_expr2609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant2648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant2666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant2684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant2702 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_constant_ext2729 = new BitSet(new long[]{0x0000000202000000L});
	public static final BitSet FOLLOW_INT_in_constant_ext2741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant_ext2795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant_ext2831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant_ext2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_ext2867 = new BitSet(new long[]{0x0000000000000002L});
}
