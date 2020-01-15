// $ANTLR null /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g 2020-01-15 17:48:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class leacParser extends DebugParser {
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "expr_8", "expr_1", "write", "var_decl", "affect_or_procedure_call", 
		"atom_typename", "loop", "range", "conditional", "expr_4", "expr_7", "var_decl_list", 
		"expr_1_proxy", "param", "range_list", "returning", "array_typename", 
		"expr_2", "func_decl", "read", "program", "arg_list", "expr", "param_list", 
		"expr_5", "expr_6", "statement", "expr_3", "constant", "typename", "coord_list", 
		"idf_list", "block", "expr_0", "func_decl_list"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public leacParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public leacParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public leacParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return leacParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:66:1: program : 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM var_decl_list func_decl_list statement ) ;
	public final leacParser.program_return program() throws RecognitionException {
		leacParser.program_return retval = new leacParser.program_return();
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

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:67:5: ( 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM var_decl_list func_decl_list statement ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:67:7: 'program' IDF var_decl_list func_decl_list statement
			{
			dbg.location(67,7);
			string_literal1=(Token)match(input,101,FOLLOW_101_in_program414);  
			stream_101.add(string_literal1);
			dbg.location(67,17);
			IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_program416);  
			stream_IDF.add(IDF2);
			dbg.location(67,21);
			pushFollow(FOLLOW_var_decl_list_in_program418);
			var_decl_list3=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list3.getTree());dbg.location(67,35);
			pushFollow(FOLLOW_func_decl_list_in_program420);
			func_decl_list4=func_decl_list();
			state._fsp--;

			stream_func_decl_list.add(func_decl_list4.getTree());dbg.location(67,50);
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
				dbg.location(67,63);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:67:63: ^( PROGRAM var_decl_list func_decl_list statement )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(67,65);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(67,73);
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());dbg.location(67,87);
				adaptor.addChild(root_1, stream_func_decl_list.nextTree());dbg.location(67,102);
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
		dbg.location(68, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:70:1: var_decl_list : ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) ;
	public final leacParser.var_decl_list_return var_decl_list() throws RecognitionException {
		leacParser.var_decl_list_return retval = new leacParser.var_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_decl6 =null;

		RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");

		try { dbg.enterRule(getGrammarFileName(), "var_decl_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:5: ( ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:7: ( var_decl )*
			{
			dbg.location(71,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:7: ( var_decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==106) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:7: var_decl
					{
					dbg.location(71,7);
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
			} finally {dbg.exitSubRule(1);}

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
				dbg.location(71,20);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:20: ^( VAR_DECL_LIST ( var_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(71,22);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL_LIST, "VAR_DECL_LIST"), root_1);
				dbg.location(71,36);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:36: ( var_decl )*
				while ( stream_var_decl.hasNext() ) {
					dbg.location(71,36);
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
		dbg.location(72, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_decl_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:73:1: var_decl : 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) ;
	public final leacParser.var_decl_return var_decl() throws RecognitionException {
		leacParser.var_decl_return retval = new leacParser.var_decl_return();
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

		try { dbg.enterRule(getGrammarFileName(), "var_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:74:5: ( 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:74:7: 'var' idf_list ':' typename ';'
			{
			dbg.location(74,7);
			string_literal7=(Token)match(input,106,FOLLOW_106_in_var_decl477);  
			stream_106.add(string_literal7);
			dbg.location(74,13);
			pushFollow(FOLLOW_idf_list_in_var_decl479);
			idf_list8=idf_list();
			state._fsp--;

			stream_idf_list.add(idf_list8.getTree());dbg.location(74,22);
			char_literal9=(Token)match(input,77,FOLLOW_77_in_var_decl481);  
			stream_77.add(char_literal9);
			dbg.location(74,26);
			pushFollow(FOLLOW_typename_in_var_decl483);
			typename10=typename();
			state._fsp--;

			stream_typename.add(typename10.getTree());dbg.location(74,35);
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
				dbg.location(74,42);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:74:42: ^( VAR_DECL typename idf_list )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(74,44);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				dbg.location(74,53);
				adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(74,62);
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
		dbg.location(75, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:76:1: idf_list : IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) ;
	public final leacParser.idf_list_return idf_list() throws RecognitionException {
		leacParser.idf_list_return retval = new leacParser.idf_list_return();
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

		try { dbg.enterRule(getGrammarFileName(), "idf_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:5: ( IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:7: IDF ( ',' IDF )*
			{
			dbg.location(77,7);
			IDF12=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list511);  
			stream_IDF.add(IDF12);
			dbg.location(77,11);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:11: ( ',' IDF )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==73) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:12: ',' IDF
					{
					dbg.location(77,12);
					char_literal13=(Token)match(input,73,FOLLOW_73_in_idf_list514);  
					stream_73.add(char_literal13);
					dbg.location(77,16);
					IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list516);  
					stream_IDF.add(IDF14);

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

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
				dbg.location(77,25);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:25: ^( IDF_LIST ( IDF )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(77,27);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDF_LIST, "IDF_LIST"), root_1);
				dbg.location(77,36);
				if ( !(stream_IDF.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDF.hasNext() ) {
					dbg.location(77,36);
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
		dbg.location(78, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idf_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:80:1: func_decl_list : ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) ;
	public final leacParser.func_decl_list_return func_decl_list() throws RecognitionException {
		leacParser.func_decl_list_return retval = new leacParser.func_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_decl15 =null;

		RewriteRuleSubtreeStream stream_func_decl=new RewriteRuleSubtreeStream(adaptor,"rule func_decl");

		try { dbg.enterRule(getGrammarFileName(), "func_decl_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:5: ( ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:7: ( func_decl )*
			{
			dbg.location(81,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:7: ( func_decl )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==95) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:7: func_decl
					{
					dbg.location(81,7);
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
			} finally {dbg.exitSubRule(3);}

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
				dbg.location(81,21);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:21: ^( FUNC_DECL_LIST ( func_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(81,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL_LIST, "FUNC_DECL_LIST"), root_1);
				dbg.location(81,38);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:81:38: ( func_decl )*
				while ( stream_func_decl.hasNext() ) {
					dbg.location(81,38);
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
		dbg.location(82, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "func_decl_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:83:1: func_decl : 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL param_list atom_typename var_decl_list block ) ;
	public final leacParser.func_decl_return func_decl() throws RecognitionException {
		leacParser.func_decl_return retval = new leacParser.func_decl_return();
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

		try { dbg.enterRule(getGrammarFileName(), "func_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:84:5: ( 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL param_list atom_typename var_decl_list block ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:84:7: 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block
			{
			dbg.location(84,7);
			string_literal16=(Token)match(input,95,FOLLOW_95_in_func_decl570);  
			stream_95.add(string_literal16);
			dbg.location(84,18);
			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_func_decl572);  
			stream_IDF.add(IDF17);
			dbg.location(84,22);
			char_literal18=(Token)match(input,69,FOLLOW_69_in_func_decl574);  
			stream_69.add(char_literal18);
			dbg.location(84,26);
			pushFollow(FOLLOW_param_list_in_func_decl576);
			param_list19=param_list();
			state._fsp--;

			stream_param_list.add(param_list19.getTree());dbg.location(84,37);
			char_literal20=(Token)match(input,70,FOLLOW_70_in_func_decl578);  
			stream_70.add(char_literal20);
			dbg.location(84,41);
			char_literal21=(Token)match(input,77,FOLLOW_77_in_func_decl580);  
			stream_77.add(char_literal21);
			dbg.location(84,45);
			pushFollow(FOLLOW_atom_typename_in_func_decl582);
			atom_typename22=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename22.getTree());dbg.location(84,59);
			pushFollow(FOLLOW_var_decl_list_in_func_decl584);
			var_decl_list23=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list23.getTree());dbg.location(84,73);
			pushFollow(FOLLOW_block_in_func_decl586);
			block24=block();
			state._fsp--;

			stream_block.add(block24.getTree());
			// AST REWRITE
			// elements: param_list, block, atom_typename, var_decl_list
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
				dbg.location(84,82);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:84:82: ^( FUNC_DECL param_list atom_typename var_decl_list block )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(84,84);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				dbg.location(84,94);
				adaptor.addChild(root_1, stream_param_list.nextTree());dbg.location(84,105);
				adaptor.addChild(root_1, stream_atom_typename.nextTree());dbg.location(84,119);
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());dbg.location(84,133);
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
		dbg.location(85, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "func_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:87:1: typename : ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename );
	public final leacParser.typename_return typename() throws RecognitionException {
		leacParser.typename_return retval = new leacParser.typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom_typename25 =null;
		ParserRuleReturnScope array_typename26 =null;

		RewriteRuleSubtreeStream stream_array_typename=new RewriteRuleSubtreeStream(adaptor,"rule array_typename");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");

		try { dbg.enterRule(getGrammarFileName(), "typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:88:5: ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:88:7: atom_typename
					{
					dbg.location(88,7);
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
						dbg.location(88,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:88:24: ^( ATOM atom_typename )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(88,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOM, "ATOM"), root_1);
						dbg.location(88,31);
						adaptor.addChild(root_1, stream_atom_typename.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:89:7: array_typename
					{
					dbg.location(89,7);
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
						dbg.location(89,25);
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
		dbg.location(90, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:92:1: atom_typename : ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME );
	public final leacParser.atom_typename_return atom_typename() throws RecognitionException {
		leacParser.atom_typename_return retval = new leacParser.atom_typename_return();
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

		try { dbg.enterRule(getGrammarFileName(), "atom_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:93:5: ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME )
			int alt5=5;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:93:7: 'void'
					{
					dbg.location(93,7);
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
						dbg.location(93,17);
						adaptor.addChild(root_0, (Object)adaptor.create(VOID_TYPENAME, "VOID_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:94:7: 'bool'
					{
					dbg.location(94,7);
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
						dbg.location(94,17);
						adaptor.addChild(root_0, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:95:7: 'int'
					{
					dbg.location(95,7);
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
						dbg.location(95,16);
						adaptor.addChild(root_0, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:96:7: 'float'
					{
					dbg.location(96,7);
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
						dbg.location(96,18);
						adaptor.addChild(root_0, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:97:7: 'char'
					{
					dbg.location(97,7);
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
						dbg.location(97,17);
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
		dbg.location(98, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom_typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:100:1: array_typename : 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) ;
	public final leacParser.array_typename_return array_typename() throws RecognitionException {
		leacParser.array_typename_return retval = new leacParser.array_typename_return();
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

		try { dbg.enterRule(getGrammarFileName(), "array_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:101:5: ( 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:101:7: 'array' '[' range_list ']' 'of' atom_typename
			{
			dbg.location(101,7);
			string_literal32=(Token)match(input,89,FOLLOW_89_in_array_typename723);  
			stream_89.add(string_literal32);
			dbg.location(101,15);
			char_literal33=(Token)match(input,85,FOLLOW_85_in_array_typename725);  
			stream_85.add(char_literal33);
			dbg.location(101,19);
			pushFollow(FOLLOW_range_list_in_array_typename727);
			range_list34=range_list();
			state._fsp--;

			stream_range_list.add(range_list34.getTree());dbg.location(101,30);
			char_literal35=(Token)match(input,86,FOLLOW_86_in_array_typename729);  
			stream_86.add(char_literal35);
			dbg.location(101,34);
			string_literal36=(Token)match(input,99,FOLLOW_99_in_array_typename731);  
			stream_99.add(string_literal36);
			dbg.location(101,39);
			pushFollow(FOLLOW_atom_typename_in_array_typename733);
			atom_typename37=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename37.getTree());
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
			// 101:53: -> ^( ARRAY atom_typename range_list )
			{
				dbg.location(101,56);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:101:56: ^( ARRAY atom_typename range_list )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(101,58);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				dbg.location(101,64);
				adaptor.addChild(root_1, stream_atom_typename.nextTree());dbg.location(101,78);
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
		dbg.location(102, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:104:1: range_list : range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) ;
	public final leacParser.range_list_return range_list() throws RecognitionException {
		leacParser.range_list_return retval = new leacParser.range_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal39=null;
		ParserRuleReturnScope range38 =null;
		ParserRuleReturnScope range40 =null;

		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");

		try { dbg.enterRule(getGrammarFileName(), "range_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:105:5: ( range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:105:7: range ( ',' range )*
			{
			dbg.location(105,7);
			pushFollow(FOLLOW_range_in_range_list760);
			range38=range();
			state._fsp--;

			stream_range.add(range38.getTree());dbg.location(105,13);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:105:13: ( ',' range )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==73) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:105:14: ',' range
					{
					dbg.location(105,14);
					char_literal39=(Token)match(input,73,FOLLOW_73_in_range_list763);  
					stream_73.add(char_literal39);
					dbg.location(105,18);
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
			} finally {dbg.exitSubRule(6);}

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
				dbg.location(105,29);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:105:29: ^( RANGE_LIST ( range )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(105,31);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE_LIST, "RANGE_LIST"), root_1);
				dbg.location(105,42);
				if ( !(stream_range.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_range.hasNext() ) {
					dbg.location(105,42);
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
		dbg.location(106, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "range_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:107:1: range : inf= INT '..' sup= INT -> ^( RANGE $inf $sup) ;
	public final leacParser.range_return range() throws RecognitionException {
		leacParser.range_return retval = new leacParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token inf=null;
		Token sup=null;
		Token string_literal41=null;

		Object inf_tree=null;
		Object sup_tree=null;
		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "range");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:108:5: (inf= INT '..' sup= INT -> ^( RANGE $inf $sup) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:108:7: inf= INT '..' sup= INT
			{
			dbg.location(108,10);
			inf=(Token)match(input,INT,FOLLOW_INT_in_range794);  
			stream_INT.add(inf);
			dbg.location(108,15);
			string_literal41=(Token)match(input,75,FOLLOW_75_in_range796);  
			stream_75.add(string_literal41);
			dbg.location(108,23);
			sup=(Token)match(input,INT,FOLLOW_INT_in_range800);  
			stream_INT.add(sup);

			// AST REWRITE
			// elements: sup, inf
			// token labels: inf, sup
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_inf=new RewriteRuleTokenStream(adaptor,"token inf",inf);
			RewriteRuleTokenStream stream_sup=new RewriteRuleTokenStream(adaptor,"token sup",sup);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:28: -> ^( RANGE $inf $sup)
			{
				dbg.location(108,31);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:108:31: ^( RANGE $inf $sup)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(108,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE, "RANGE"), root_1);
				dbg.location(108,40);
				adaptor.addChild(root_1, stream_inf.nextNode());dbg.location(108,45);
				adaptor.addChild(root_1, stream_sup.nextNode());
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
		dbg.location(109, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "range");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "range"


	public static class param_list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "param_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:111:1: param_list : ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) );
	public final leacParser.param_list_return param_list() throws RecognitionException {
		leacParser.param_list_return retval = new leacParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal43=null;
		ParserRuleReturnScope param42 =null;
		ParserRuleReturnScope param44 =null;

		Object char_literal43_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try { dbg.enterRule(getGrammarFileName(), "param_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:112:5: ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==70) ) {
				alt8=1;
			}
			else if ( (LA8_0==IDF||LA8_0==103) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:112:21: 
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
					// 112:21: -> ^( PARAM_LIST )
					{
						dbg.location(112,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:112:24: ^( PARAM_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(112,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:113:7: param ( ',' param )*
					{
					dbg.location(113,7);
					pushFollow(FOLLOW_param_in_param_list843);
					param42=param();
					state._fsp--;

					stream_param.add(param42.getTree());dbg.location(113,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:113:13: ( ',' param )*
					try { dbg.enterSubRule(7);

					loop7:
					while (true) {
						int alt7=2;
						try { dbg.enterDecision(7, decisionCanBacktrack[7]);

						int LA7_0 = input.LA(1);
						if ( (LA7_0==73) ) {
							alt7=1;
						}

						} finally {dbg.exitDecision(7);}

						switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:113:14: ',' param
							{
							dbg.location(113,14);
							char_literal43=(Token)match(input,73,FOLLOW_73_in_param_list846);  
							stream_73.add(char_literal43);
							dbg.location(113,18);
							pushFollow(FOLLOW_param_in_param_list848);
							param44=param();
							state._fsp--;

							stream_param.add(param44.getTree());
							}
							break;

						default :
							break loop7;
						}
					}
					} finally {dbg.exitSubRule(7);}

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
					// 113:26: -> ^( PARAM_LIST ( param )+ )
					{
						dbg.location(113,29);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:113:29: ^( PARAM_LIST ( param )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(113,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						dbg.location(113,42);
						if ( !(stream_param.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_param.hasNext() ) {
							dbg.location(113,42);
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
		dbg.location(114, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:115:1: param : ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) );
	public final leacParser.param_return param() throws RecognitionException {
		leacParser.param_return retval = new leacParser.param_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF45=null;
		Token char_literal46=null;
		Token string_literal48=null;
		Token IDF49=null;
		Token char_literal50=null;
		ParserRuleReturnScope typename47 =null;
		ParserRuleReturnScope typename51 =null;

		Object IDF45_tree=null;
		Object char_literal46_tree=null;
		Object string_literal48_tree=null;
		Object IDF49_tree=null;
		Object char_literal50_tree=null;
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:116:5: ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDF) ) {
				alt9=1;
			}
			else if ( (LA9_0==103) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:116:7: IDF ':' typename
					{
					dbg.location(116,7);
					IDF45=(Token)match(input,IDF,FOLLOW_IDF_in_param875);  
					stream_IDF.add(IDF45);
					dbg.location(116,11);
					char_literal46=(Token)match(input,77,FOLLOW_77_in_param877);  
					stream_77.add(char_literal46);
					dbg.location(116,15);
					pushFollow(FOLLOW_typename_in_param879);
					typename47=typename();
					state._fsp--;

					stream_typename.add(typename47.getTree());
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
					// 116:24: -> ^( PARAM typename BY_COPY IDF )
					{
						dbg.location(116,27);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:116:27: ^( PARAM typename BY_COPY IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(116,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(116,35);
						adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(116,44);
						adaptor.addChild(root_1, (Object)adaptor.create(BY_COPY, "BY_COPY"));dbg.location(116,52);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:117:7: 'ref' IDF ':' typename
					{
					dbg.location(117,7);
					string_literal48=(Token)match(input,103,FOLLOW_103_in_param899);  
					stream_103.add(string_literal48);
					dbg.location(117,13);
					IDF49=(Token)match(input,IDF,FOLLOW_IDF_in_param901);  
					stream_IDF.add(IDF49);
					dbg.location(117,17);
					char_literal50=(Token)match(input,77,FOLLOW_77_in_param903);  
					stream_77.add(char_literal50);
					dbg.location(117,21);
					pushFollow(FOLLOW_typename_in_param905);
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
					// 117:30: -> ^( PARAM typename BY_REF IDF )
					{
						dbg.location(117,33);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:117:33: ^( PARAM typename BY_REF IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(117,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(117,41);
						adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(117,50);
						adaptor.addChild(root_1, (Object)adaptor.create(BY_REF, "BY_REF"));dbg.location(117,57);
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
		dbg.location(118, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:120:1: statement : ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write );
	public final leacParser.statement_return statement() throws RecognitionException {
		leacParser.statement_return retval = new leacParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope conditional52 =null;
		ParserRuleReturnScope loop53 =null;
		ParserRuleReturnScope affect_or_procedure_call54 =null;
		ParserRuleReturnScope returning55 =null;
		ParserRuleReturnScope block56 =null;
		ParserRuleReturnScope read57 =null;
		ParserRuleReturnScope write58 =null;

		RewriteRuleSubtreeStream stream_read=new RewriteRuleSubtreeStream(adaptor,"rule read");
		RewriteRuleSubtreeStream stream_conditional=new RewriteRuleSubtreeStream(adaptor,"rule conditional");
		RewriteRuleSubtreeStream stream_loop=new RewriteRuleSubtreeStream(adaptor,"rule loop");
		RewriteRuleSubtreeStream stream_returning=new RewriteRuleSubtreeStream(adaptor,"rule returning");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_affect_or_procedure_call=new RewriteRuleSubtreeStream(adaptor,"rule affect_or_procedure_call");
		RewriteRuleSubtreeStream stream_write=new RewriteRuleSubtreeStream(adaptor,"rule write");

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:121:5: ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write )
			int alt10=7;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 96:
				{
				alt10=1;
				}
				break;
			case 108:
				{
				alt10=2;
				}
				break;
			case IDF:
				{
				alt10=3;
				}
				break;
			case 104:
				{
				alt10=4;
				}
				break;
			case 110:
				{
				alt10=5;
				}
				break;
			case 102:
				{
				alt10=6;
				}
				break;
			case 109:
				{
				alt10=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:121:7: conditional
					{
					dbg.location(121,7);
					pushFollow(FOLLOW_conditional_in_statement934);
					conditional52=conditional();
					state._fsp--;

					stream_conditional.add(conditional52.getTree());
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
					// 121:19: -> conditional
					{
						dbg.location(121,22);
						adaptor.addChild(root_0, stream_conditional.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:122:7: loop
					{
					dbg.location(122,7);
					pushFollow(FOLLOW_loop_in_statement946);
					loop53=loop();
					state._fsp--;

					stream_loop.add(loop53.getTree());
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
					// 122:12: -> loop
					{
						dbg.location(122,15);
						adaptor.addChild(root_0, stream_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:123:7: affect_or_procedure_call
					{
					dbg.location(123,7);
					pushFollow(FOLLOW_affect_or_procedure_call_in_statement958);
					affect_or_procedure_call54=affect_or_procedure_call();
					state._fsp--;

					stream_affect_or_procedure_call.add(affect_or_procedure_call54.getTree());
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
					// 123:32: -> affect_or_procedure_call
					{
						dbg.location(123,35);
						adaptor.addChild(root_0, stream_affect_or_procedure_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:124:7: returning
					{
					dbg.location(124,7);
					pushFollow(FOLLOW_returning_in_statement970);
					returning55=returning();
					state._fsp--;

					stream_returning.add(returning55.getTree());
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
					// 124:17: -> returning
					{
						dbg.location(124,20);
						adaptor.addChild(root_0, stream_returning.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:125:7: block
					{
					dbg.location(125,7);
					pushFollow(FOLLOW_block_in_statement982);
					block56=block();
					state._fsp--;

					stream_block.add(block56.getTree());
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
					// 125:13: -> block
					{
						dbg.location(125,16);
						adaptor.addChild(root_0, stream_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:126:7: read
					{
					dbg.location(126,7);
					pushFollow(FOLLOW_read_in_statement994);
					read57=read();
					state._fsp--;

					stream_read.add(read57.getTree());
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
					// 126:12: -> read
					{
						dbg.location(126,15);
						adaptor.addChild(root_0, stream_read.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:127:7: write
					{
					dbg.location(127,7);
					pushFollow(FOLLOW_write_in_statement1006);
					write58=write();
					state._fsp--;

					stream_write.add(write58.getTree());
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
					// 127:13: -> write
					{
						dbg.location(127,16);
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
		dbg.location(128, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:130:1: conditional : 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) ) ;
	public final leacParser.conditional_return conditional() throws RecognitionException {
		leacParser.conditional_return retval = new leacParser.conditional_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;
		Token string_literal61=null;
		Token string_literal62=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope second =null;
		ParserRuleReturnScope expr60 =null;

		Object string_literal59_tree=null;
		Object string_literal61_tree=null;
		Object string_literal62_tree=null;
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "conditional");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:131:5: ( 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:131:7: 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) )
			{
			dbg.location(131,7);
			string_literal59=(Token)match(input,96,FOLLOW_96_in_conditional1027);  
			stream_96.add(string_literal59);
			dbg.location(131,12);
			pushFollow(FOLLOW_expr_in_conditional1029);
			expr60=expr();
			state._fsp--;

			stream_expr.add(expr60.getTree());dbg.location(131,17);
			string_literal61=(Token)match(input,105,FOLLOW_105_in_conditional1031);  
			stream_105.add(string_literal61);
			dbg.location(131,29);
			pushFollow(FOLLOW_statement_in_conditional1035);
			first=statement();
			state._fsp--;

			stream_statement.add(first.getTree());dbg.location(132,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:132:9: ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first PASS ) )
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==93) ) {
				alt11=1;
			}
			else if ( (LA11_0==EOF||LA11_0==78||LA11_0==111) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:132:39: 'else' second= statement
					{
					dbg.location(132,39);
					string_literal62=(Token)match(input,93,FOLLOW_93_in_conditional1059);  
					stream_93.add(string_literal62);
					dbg.location(132,52);
					pushFollow(FOLLOW_statement_in_conditional1063);
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
					// 132:63: -> ^( CONDITIONAL expr $first $second)
					{
						dbg.location(132,66);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:132:66: ^( CONDITIONAL expr $first $second)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(132,68);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						dbg.location(132,80);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(132,86);
						adaptor.addChild(root_1, stream_first.nextTree());dbg.location(132,93);
						adaptor.addChild(root_1, stream_second.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:133:25: 
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
					// 133:25: -> ^( CONDITIONAL expr $first PASS )
					{
						dbg.location(133,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:133:28: ^( CONDITIONAL expr $first PASS )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(133,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						dbg.location(133,42);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(133,48);
						adaptor.addChild(root_1, stream_first.nextTree());dbg.location(133,54);
						adaptor.addChild(root_1, (Object)adaptor.create(PASS, "PASS"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

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
		dbg.location(135, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:137:1: loop : 'while' expr 'do' statement -> ^( LOOP expr statement ) ;
	public final leacParser.loop_return loop() throws RecognitionException {
		leacParser.loop_return retval = new leacParser.loop_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal63=null;
		Token string_literal65=null;
		ParserRuleReturnScope expr64 =null;
		ParserRuleReturnScope statement66 =null;

		Object string_literal63_tree=null;
		Object string_literal65_tree=null;
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:138:5: ( 'while' expr 'do' statement -> ^( LOOP expr statement ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:138:7: 'while' expr 'do' statement
			{
			dbg.location(138,7);
			string_literal63=(Token)match(input,108,FOLLOW_108_in_loop1129);  
			stream_108.add(string_literal63);
			dbg.location(138,15);
			pushFollow(FOLLOW_expr_in_loop1131);
			expr64=expr();
			state._fsp--;

			stream_expr.add(expr64.getTree());dbg.location(138,20);
			string_literal65=(Token)match(input,92,FOLLOW_92_in_loop1133);  
			stream_92.add(string_literal65);
			dbg.location(138,25);
			pushFollow(FOLLOW_statement_in_loop1135);
			statement66=statement();
			state._fsp--;

			stream_statement.add(statement66.getTree());
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
			// 138:35: -> ^( LOOP expr statement )
			{
				dbg.location(138,38);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:138:38: ^( LOOP expr statement )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(138,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOP, "LOOP"), root_1);
				dbg.location(138,45);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(138,50);
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
		dbg.location(139, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:141:1: coord_list : expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) ;
	public final leacParser.coord_list_return coord_list() throws RecognitionException {
		leacParser.coord_list_return retval = new leacParser.coord_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal68=null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope expr69 =null;

		Object char_literal68_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "coord_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(141, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:5: ( expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:7: expr ( ',' expr )*
			{
			dbg.location(142,7);
			pushFollow(FOLLOW_expr_in_coord_list1162);
			expr67=expr();
			state._fsp--;

			stream_expr.add(expr67.getTree());dbg.location(142,12);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:12: ( ',' expr )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==73) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:13: ',' expr
					{
					dbg.location(142,13);
					char_literal68=(Token)match(input,73,FOLLOW_73_in_coord_list1165);  
					stream_73.add(char_literal68);
					dbg.location(142,17);
					pushFollow(FOLLOW_expr_in_coord_list1167);
					expr69=expr();
					state._fsp--;

					stream_expr.add(expr69.getTree());
					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

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
			// 142:24: -> ^( COORD_LIST ( expr )+ )
			{
				dbg.location(142,27);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:27: ^( COORD_LIST ( expr )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(142,29);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COORD_LIST, "COORD_LIST"), root_1);
				dbg.location(142,40);
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					dbg.location(142,40);
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
		dbg.location(143, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "coord_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:145:1: returning : 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) ;
	public final leacParser.returning_return returning() throws RecognitionException {
		leacParser.returning_return retval = new leacParser.returning_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal70=null;
		ParserRuleReturnScope expr71 =null;

		Object string_literal70_tree=null;
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "returning");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(145, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:146:5: ( 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:146:7: 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			{
			dbg.location(146,7);
			string_literal70=(Token)match(input,104,FOLLOW_104_in_returning1195);  
			stream_104.add(string_literal70);
			dbg.location(147,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:147:9: ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==EOF||LA13_0==78||LA13_0==93||LA13_0==111) ) {
				alt13=1;
			}
			else if ( (LA13_0==BOOL||LA13_0==CHAR||LA13_0==FLOAT||LA13_0==IDF||LA13_0==INT||LA13_0==STRING||LA13_0==69||LA13_0==74||LA13_0==98) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:147:25: 
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
					// 147:25: -> ^( RETURNING NO_RETURN_VALUE )
					{
						dbg.location(147,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:147:28: ^( RETURNING NO_RETURN_VALUE )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(147,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						dbg.location(147,40);
						adaptor.addChild(root_1, (Object)adaptor.create(NO_RETURN_VALUE, "NO_RETURN_VALUE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:148:11: expr
					{
					dbg.location(148,11);
					pushFollow(FOLLOW_expr_in_returning1227);
					expr71=expr();
					state._fsp--;

					stream_expr.add(expr71.getTree());
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
					// 148:16: -> ^( RETURNING expr )
					{
						dbg.location(148,19);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:148:19: ^( RETURNING expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(148,21);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						dbg.location(148,31);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

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
		dbg.location(150, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returning");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:152:1: affect_or_procedure_call : IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) ;
	public final leacParser.affect_or_procedure_call_return affect_or_procedure_call() throws RecognitionException {
		leacParser.affect_or_procedure_call_return retval = new leacParser.affect_or_procedure_call_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF72=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token char_literal76=null;
		Token char_literal78=null;
		Token char_literal80=null;
		ParserRuleReturnScope coord_list74 =null;
		ParserRuleReturnScope expr77 =null;
		ParserRuleReturnScope arg_list79 =null;

		Object IDF72_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object char_literal76_tree=null;
		Object char_literal78_tree=null;
		Object char_literal80_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try { dbg.enterRule(getGrammarFileName(), "affect_or_procedure_call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(152, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:153:5: ( IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:153:7: IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			{
			dbg.location(153,7);
			IDF72=(Token)match(input,IDF,FOLLOW_IDF_in_affect_or_procedure_call1262);  
			stream_IDF.add(IDF72);
			dbg.location(154,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:154:9: ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==81||LA15_0==85) ) {
				alt15=1;
			}
			else if ( (LA15_0==69) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr
					{
					dbg.location(155,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==81) ) {
						alt14=1;
					}
					else if ( (LA14_0==85) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:29: 
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
							// 155:29: -> ^( VAR IDF )
							{
								dbg.location(155,32);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:32: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(155,34);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								dbg.location(155,38);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:156:15: '[' coord_list ']'
							{
							dbg.location(156,15);
							char_literal73=(Token)match(input,85,FOLLOW_85_in_affect_or_procedure_call1312);  
							stream_85.add(char_literal73);
							dbg.location(156,19);
							pushFollow(FOLLOW_coord_list_in_affect_or_procedure_call1314);
							coord_list74=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list74.getTree());dbg.location(156,30);
							char_literal75=(Token)match(input,86,FOLLOW_86_in_affect_or_procedure_call1316);  
							stream_86.add(char_literal75);

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
							// 156:34: -> ^( CELL IDF coord_list )
							{
								dbg.location(156,37);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:156:37: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(156,39);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								dbg.location(156,44);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(156,48);
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(158,13);
					char_literal76=(Token)match(input,81,FOLLOW_81_in_affect_or_procedure_call1354);  
					stream_81.add(char_literal76);
					dbg.location(158,17);
					pushFollow(FOLLOW_expr_in_affect_or_procedure_call1356);
					expr77=expr();
					state._fsp--;

					stream_expr.add(expr77.getTree());
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
					// 158:22: -> ^( AFFECT $affect_or_procedure_call expr )
					{
						dbg.location(158,25);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:158:25: ^( AFFECT $affect_or_procedure_call expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(158,27);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
						dbg.location(158,35);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(158,60);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:159:11: '(' arg_list ')'
					{
					dbg.location(159,11);
					char_literal78=(Token)match(input,69,FOLLOW_69_in_affect_or_procedure_call1379);  
					stream_69.add(char_literal78);
					dbg.location(159,15);
					pushFollow(FOLLOW_arg_list_in_affect_or_procedure_call1381);
					arg_list79=arg_list();
					state._fsp--;

					stream_arg_list.add(arg_list79.getTree());dbg.location(159,24);
					char_literal80=(Token)match(input,70,FOLLOW_70_in_affect_or_procedure_call1383);  
					stream_70.add(char_literal80);

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
					// 159:28: -> ^( PROCEDURE_CALL IDF arg_list )
					{
						dbg.location(159,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:159:31: ^( PROCEDURE_CALL IDF arg_list )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(159,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_CALL, "PROCEDURE_CALL"), root_1);
						dbg.location(159,48);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(159,52);
						adaptor.addChild(root_1, stream_arg_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

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
		dbg.location(161, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "affect_or_procedure_call");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:163:1: arg_list : ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) );
	public final leacParser.arg_list_return arg_list() throws RecognitionException {
		leacParser.arg_list_return retval = new leacParser.arg_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal82=null;
		ParserRuleReturnScope expr81 =null;
		ParserRuleReturnScope expr83 =null;

		Object char_literal82_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "arg_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(163, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:164:5: ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) )
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==70) ) {
				alt17=1;
			}
			else if ( (LA17_0==BOOL||LA17_0==CHAR||LA17_0==FLOAT||LA17_0==IDF||LA17_0==INT||LA17_0==STRING||LA17_0==69||LA17_0==74||LA17_0==98) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:164:21: 
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
					// 164:21: -> ^( ARG_LIST )
					{
						dbg.location(164,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:164:24: ^( ARG_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(164,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:165:7: expr ( ',' expr )*
					{
					dbg.location(165,7);
					pushFollow(FOLLOW_expr_in_arg_list1434);
					expr81=expr();
					state._fsp--;

					stream_expr.add(expr81.getTree());dbg.location(165,12);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:165:12: ( ',' expr )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						int LA16_0 = input.LA(1);
						if ( (LA16_0==73) ) {
							alt16=1;
						}

						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:165:13: ',' expr
							{
							dbg.location(165,13);
							char_literal82=(Token)match(input,73,FOLLOW_73_in_arg_list1437);  
							stream_73.add(char_literal82);
							dbg.location(165,17);
							pushFollow(FOLLOW_expr_in_arg_list1439);
							expr83=expr();
							state._fsp--;

							stream_expr.add(expr83.getTree());
							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}

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
					// 165:24: -> ^( ARG_LIST ( expr )+ )
					{
						dbg.location(165,27);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:165:27: ^( ARG_LIST ( expr )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(165,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						dbg.location(165,38);
						if ( !(stream_expr.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expr.hasNext() ) {
							dbg.location(165,38);
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
		dbg.location(166, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arg_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:168:1: block : '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' ;
	public final leacParser.block_return block() throws RecognitionException {
		leacParser.block_return retval = new leacParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope statement85 =null;
		ParserRuleReturnScope statement87 =null;

		Object char_literal84_tree=null;
		Object char_literal86_tree=null;
		Object char_literal88_tree=null;
		RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
		RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:169:5: ( '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:169:7: '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}'
			{
			dbg.location(169,7);
			char_literal84=(Token)match(input,110,FOLLOW_110_in_block1467);  
			stream_110.add(char_literal84);
			dbg.location(170,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:170:9: ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) )
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==111) ) {
				alt19=1;
			}
			else if ( (LA19_0==IDF||LA19_0==96||LA19_0==102||LA19_0==104||(LA19_0 >= 108 && LA19_0 <= 110)) ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:170:25: 
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
					// 170:25: -> ^( BLOCK )
					{
						dbg.location(170,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:170:28: ^( BLOCK )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(170,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:11: statement ( ';' statement )*
					{
					dbg.location(171,11);
					pushFollow(FOLLOW_statement_in_block1497);
					statement85=statement();
					state._fsp--;

					stream_statement.add(statement85.getTree());dbg.location(171,21);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:21: ( ';' statement )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==78) ) {
							alt18=1;
						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:22: ';' statement
							{
							dbg.location(171,22);
							char_literal86=(Token)match(input,78,FOLLOW_78_in_block1500);  
							stream_78.add(char_literal86);
							dbg.location(171,26);
							pushFollow(FOLLOW_statement_in_block1502);
							statement87=statement();
							state._fsp--;

							stream_statement.add(statement87.getTree());
							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}

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
					// 171:38: -> ^( BLOCK ( statement )+ )
					{
						dbg.location(171,41);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:41: ^( BLOCK ( statement )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(171,43);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						dbg.location(171,49);
						if ( !(stream_statement.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_statement.hasNext() ) {
							dbg.location(171,49);
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
			} finally {dbg.exitSubRule(19);}
			dbg.location(173,7);
			char_literal88=(Token)match(input,111,FOLLOW_111_in_block1531);  
			stream_111.add(char_literal88);

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
		dbg.location(174, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:176:1: read : 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) ;
	public final leacParser.read_return read() throws RecognitionException {
		leacParser.read_return retval = new leacParser.read_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal89=null;
		Token IDF90=null;
		Token char_literal91=null;
		Token char_literal93=null;
		ParserRuleReturnScope coord_list92 =null;

		Object string_literal89_tree=null;
		Object IDF90_tree=null;
		Object char_literal91_tree=null;
		Object char_literal93_tree=null;
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try { dbg.enterRule(getGrammarFileName(), "read");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(176, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:177:5: ( 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:177:7: 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			{
			dbg.location(177,7);
			string_literal89=(Token)match(input,102,FOLLOW_102_in_read1548);  
			stream_102.add(string_literal89);
			dbg.location(177,14);
			IDF90=(Token)match(input,IDF,FOLLOW_IDF_in_read1550);  
			stream_IDF.add(IDF90);
			dbg.location(178,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:178:9: ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==EOF||LA20_0==78||LA20_0==93||LA20_0==111) ) {
				alt20=1;
			}
			else if ( (LA20_0==85) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:178:25: 
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
					// 178:25: -> ^( READ ^( VAR IDF ) )
					{
						dbg.location(178,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:178:28: ^( READ ^( VAR IDF ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(178,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						dbg.location(178,35);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:178:35: ^( VAR IDF )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(178,37);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);
						dbg.location(178,41);
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
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:179:11: '[' coord_list ']'
					{
					dbg.location(179,11);
					char_literal91=(Token)match(input,85,FOLLOW_85_in_read1586);  
					stream_85.add(char_literal91);
					dbg.location(179,15);
					pushFollow(FOLLOW_coord_list_in_read1588);
					coord_list92=coord_list();
					state._fsp--;

					stream_coord_list.add(coord_list92.getTree());dbg.location(179,26);
					char_literal93=(Token)match(input,86,FOLLOW_86_in_read1590);  
					stream_86.add(char_literal93);

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
					// 179:30: -> ^( READ ^( CELL IDF coord_list ) )
					{
						dbg.location(179,33);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:179:33: ^( READ ^( CELL IDF coord_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(179,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						dbg.location(179,40);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:179:40: ^( CELL IDF coord_list )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(179,42);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_2);
						dbg.location(179,47);
						adaptor.addChild(root_2, stream_IDF.nextNode());dbg.location(179,51);
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
			} finally {dbg.exitSubRule(20);}

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
		dbg.location(181, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "read");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:183:1: write : 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant -> ^( WRITE constant ) ) ;
	public final leacParser.write_return write() throws RecognitionException {
		leacParser.write_return retval = new leacParser.write_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal94=null;
		Token IDF95=null;
		Token char_literal96=null;
		Token char_literal98=null;
		ParserRuleReturnScope coord_list97 =null;
		ParserRuleReturnScope constant99 =null;

		Object string_literal94_tree=null;
		Object IDF95_tree=null;
		Object char_literal96_tree=null;
		Object char_literal98_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try { dbg.enterRule(getGrammarFileName(), "write");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(183, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:184:5: ( 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant -> ^( WRITE constant ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:184:7: 'write' ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant -> ^( WRITE constant ) )
			{
			dbg.location(184,7);
			string_literal94=(Token)match(input,109,FOLLOW_109_in_write1631);  
			stream_109.add(string_literal94);
			dbg.location(185,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:185:9: ( IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) ) | constant -> ^( WRITE constant ) )
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==IDF) ) {
				alt22=1;
			}
			else if ( (LA22_0==BOOL||LA22_0==CHAR||LA22_0==FLOAT||LA22_0==INT||LA22_0==STRING) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:185:11: IDF ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) )
					{
					dbg.location(185,11);
					IDF95=(Token)match(input,IDF,FOLLOW_IDF_in_write1643);  
					stream_IDF.add(IDF95);
					dbg.location(186,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:186:13: ( -> ^( WRITE ^( VAR IDF ) ) | '[' coord_list ']' -> ^( WRITE ^( CELL IDF coord_list ) ) )
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:186:29: 
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
							// 186:29: -> ^( WRITE ^( VAR IDF ) )
							{
								dbg.location(186,32);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:186:32: ^( WRITE ^( VAR IDF ) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(186,34);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
								dbg.location(186,40);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:186:40: ^( VAR IDF )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(186,42);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);
								dbg.location(186,46);
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
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:187:15: '[' coord_list ']'
							{
							dbg.location(187,15);
							char_literal96=(Token)match(input,85,FOLLOW_85_in_write1687);  
							stream_85.add(char_literal96);
							dbg.location(187,19);
							pushFollow(FOLLOW_coord_list_in_write1689);
							coord_list97=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list97.getTree());dbg.location(187,30);
							char_literal98=(Token)match(input,86,FOLLOW_86_in_write1691);  
							stream_86.add(char_literal98);

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
							// 187:34: -> ^( WRITE ^( CELL IDF coord_list ) )
							{
								dbg.location(187,37);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:187:37: ^( WRITE ^( CELL IDF coord_list ) )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(187,39);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
								dbg.location(187,45);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:187:45: ^( CELL IDF coord_list )
								{
								Object root_2 = (Object)adaptor.nil();
								dbg.location(187,47);
								root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_2);
								dbg.location(187,52);
								adaptor.addChild(root_2, stream_IDF.nextNode());dbg.location(187,56);
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
					} finally {dbg.exitSubRule(21);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:189:11: constant
					{
					dbg.location(189,11);
					pushFollow(FOLLOW_constant_in_write1731);
					constant99=constant();
					state._fsp--;

					stream_constant.add(constant99.getTree());
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
					// 189:20: -> ^( WRITE constant )
					{
						dbg.location(189,23);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:189:23: ^( WRITE constant )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(189,25);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
						dbg.location(189,31);
						adaptor.addChild(root_1, stream_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

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
		dbg.location(191, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "write");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:193:1: expr_0 : ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr );
	public final leacParser.expr_0_return expr_0() throws RecognitionException {
		leacParser.expr_0_return retval = new leacParser.expr_0_return();
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
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try { dbg.enterRule(getGrammarFileName(), "expr_0");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(193, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:194:5: ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr )
			int alt24=3;
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt24=1;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				alt24=2;
				}
				break;
			case 69:
				{
				alt24=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:194:7: IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					{
					dbg.location(194,7);
					IDF100=(Token)match(input,IDF,FOLLOW_IDF_in_expr_01766);  
					stream_IDF.add(IDF100);
					dbg.location(195,9);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:195:9: ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt23=3;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

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
						alt23=1;
						}
						break;
					case 69:
						{
						alt23=2;
						}
						break;
					case 85:
						{
						alt23=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:195:25: 
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
							// 195:25: -> ^( VAR IDF )
							{
								dbg.location(195,28);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:195:28: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(195,30);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								dbg.location(195,34);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:196:11: '(' arg_list ')'
							{
							dbg.location(196,11);
							char_literal101=(Token)match(input,69,FOLLOW_69_in_expr_01798);  
							stream_69.add(char_literal101);
							dbg.location(196,15);
							pushFollow(FOLLOW_arg_list_in_expr_01800);
							arg_list102=arg_list();
							state._fsp--;

							stream_arg_list.add(arg_list102.getTree());dbg.location(196,24);
							char_literal103=(Token)match(input,70,FOLLOW_70_in_expr_01802);  
							stream_70.add(char_literal103);

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
							// 196:28: -> ^( FUNC_CALL IDF arg_list )
							{
								dbg.location(196,31);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:196:31: ^( FUNC_CALL IDF arg_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(196,33);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
								dbg.location(196,43);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(196,47);
								adaptor.addChild(root_1, stream_arg_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:197:11: '[' coord_list ']'
							{
							dbg.location(197,11);
							char_literal104=(Token)match(input,85,FOLLOW_85_in_expr_01824);  
							stream_85.add(char_literal104);
							dbg.location(197,15);
							pushFollow(FOLLOW_coord_list_in_expr_01826);
							coord_list105=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list105.getTree());dbg.location(197,26);
							char_literal106=(Token)match(input,86,FOLLOW_86_in_expr_01828);  
							stream_86.add(char_literal106);

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
							// 197:30: -> ^( CELL IDF coord_list )
							{
								dbg.location(197,33);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:197:33: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(197,35);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								dbg.location(197,40);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(197,44);
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:199:7: constant
					{
					dbg.location(199,7);
					pushFollow(FOLLOW_constant_in_expr_01856);
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
					// 199:16: -> constant
					{
						dbg.location(199,19);
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:200:7: '(' expr ')'
					{
					dbg.location(200,7);
					char_literal108=(Token)match(input,69,FOLLOW_69_in_expr_01868);  
					stream_69.add(char_literal108);
					dbg.location(200,11);
					pushFollow(FOLLOW_expr_in_expr_01870);
					expr109=expr();
					state._fsp--;

					stream_expr.add(expr109.getTree());dbg.location(200,16);
					char_literal110=(Token)match(input,70,FOLLOW_70_in_expr_01872);  
					stream_70.add(char_literal110);

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
					// 200:20: -> expr
					{
						dbg.location(200,23);
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
		dbg.location(201, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_0");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:203:1: expr_1 : ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? ;
	public final leacParser.expr_1_return expr_1() throws RecognitionException {
		leacParser.expr_1_return retval = new leacParser.expr_1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_0111 =null;

		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expr_1_proxy=new RewriteRuleSubtreeStream(adaptor,"rule expr_1_proxy");
		RewriteRuleSubtreeStream stream_expr_0=new RewriteRuleSubtreeStream(adaptor,"rule expr_0");

		try { dbg.enterRule(getGrammarFileName(), "expr_1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(203, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:5: ( ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:7: ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			{
			dbg.location(204,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:7: ( expr_0 -> expr_0 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:8: expr_0
			{
			dbg.location(204,8);
			pushFollow(FOLLOW_expr_0_in_expr_11894);
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
			// 204:15: -> expr_0
			{
				dbg.location(204,18);
				adaptor.addChild(root_0, stream_expr_0.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(205,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:205:9: ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==87) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:205:11: '^' next= expr_1_proxy
					{
					dbg.location(205,11);
					char_literal112=(Token)match(input,87,FOLLOW_87_in_expr_11911);  
					stream_87.add(char_literal112);
					dbg.location(205,19);
					pushFollow(FOLLOW_expr_1_proxy_in_expr_11915);
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
					// 205:33: -> ^( POW $expr_1 $next)
					{
						dbg.location(205,36);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:205:36: ^( POW $expr_1 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(205,38);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POW, "POW"), root_1);
						dbg.location(205,43);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(205,51);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

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
		dbg.location(207, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:208:1: expr_1_proxy : expr_1 -> expr_1 ;
	public final leacParser.expr_1_proxy_return expr_1_proxy() throws RecognitionException {
		leacParser.expr_1_proxy_return retval = new leacParser.expr_1_proxy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_1113 =null;

		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try { dbg.enterRule(getGrammarFileName(), "expr_1_proxy");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(208, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:209:5: ( expr_1 -> expr_1 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:209:7: expr_1
			{
			dbg.location(209,7);
			pushFollow(FOLLOW_expr_1_in_expr_1_proxy1954);
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
			// 209:14: -> expr_1
			{
				dbg.location(209,17);
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
		dbg.location(210, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_1_proxy");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:212:1: expr_2 : ( '-' -> ^( UNARY_MINUS $expr_2) | 'not' -> ^( NOT $expr_2) )* ( expr_1 -> expr_1 ) ;
	public final leacParser.expr_2_return expr_2() throws RecognitionException {
		leacParser.expr_2_return retval = new leacParser.expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal114=null;
		Token string_literal115=null;
		ParserRuleReturnScope expr_1116 =null;

		Object char_literal114_tree=null;
		Object string_literal115_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try { dbg.enterRule(getGrammarFileName(), "expr_2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:213:5: ( ( '-' -> ^( UNARY_MINUS $expr_2) | 'not' -> ^( NOT $expr_2) )* ( expr_1 -> expr_1 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:214:9: ( '-' -> ^( UNARY_MINUS $expr_2) | 'not' -> ^( NOT $expr_2) )* ( expr_1 -> expr_1 )
			{
			dbg.location(214,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:214:9: ( '-' -> ^( UNARY_MINUS $expr_2) | 'not' -> ^( NOT $expr_2) )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=3;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==74) ) {
					alt26=1;
				}
				else if ( (LA26_0==98) ) {
					alt26=2;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:214:11: '-'
					{
					dbg.location(214,11);
					char_literal114=(Token)match(input,74,FOLLOW_74_in_expr_21985);  
					stream_74.add(char_literal114);

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
					// 214:15: -> ^( UNARY_MINUS $expr_2)
					{
						dbg.location(214,18);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:214:18: ^( UNARY_MINUS $expr_2)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(214,20);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						dbg.location(214,33);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:215:11: 'not'
					{
					dbg.location(215,11);
					string_literal115=(Token)match(input,98,FOLLOW_98_in_expr_22006);  
					stream_98.add(string_literal115);

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
					// 215:17: -> ^( NOT $expr_2)
					{
						dbg.location(215,20);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:215:20: ^( NOT $expr_2)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(215,22);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
						dbg.location(215,27);
						adaptor.addChild(root_1, stream_retval.nextTree());
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
			} finally {dbg.exitSubRule(26);}
			dbg.location(217,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:217:9: ( expr_1 -> expr_1 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:217:10: expr_1
			{
			dbg.location(217,10);
			pushFollow(FOLLOW_expr_1_in_expr_22037);
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
			// 217:17: -> expr_1
			{
				dbg.location(217,20);
				adaptor.addChild(root_0, stream_expr_1.nextTree());
			}


			retval.tree = root_0;

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
		dbg.location(218, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:220:1: expr_3 : ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* ;
	public final leacParser.expr_3_return expr_3() throws RecognitionException {
		leacParser.expr_3_return retval = new leacParser.expr_3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		Token char_literal119=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_2117 =null;

		Object char_literal118_tree=null;
		Object char_literal119_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_expr_2=new RewriteRuleSubtreeStream(adaptor,"rule expr_2");

		try { dbg.enterRule(getGrammarFileName(), "expr_3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(220, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:221:5: ( ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:221:7: ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			{
			dbg.location(221,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:221:7: ( expr_2 -> expr_2 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:221:8: expr_2
			{
			dbg.location(221,8);
			pushFollow(FOLLOW_expr_2_in_expr_32060);
			expr_2117=expr_2();
			state._fsp--;

			stream_expr_2.add(expr_2117.getTree());
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
			// 221:15: -> expr_2
			{
				dbg.location(221,18);
				adaptor.addChild(root_0, stream_expr_2.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(222,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:222:9: ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=3;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==71) ) {
					alt27=1;
				}
				else if ( (LA27_0==76) ) {
					alt27=2;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:222:11: '*' next= expr_2
					{
					dbg.location(222,11);
					char_literal118=(Token)match(input,71,FOLLOW_71_in_expr_32077);  
					stream_71.add(char_literal118);
					dbg.location(222,19);
					pushFollow(FOLLOW_expr_2_in_expr_32081);
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
					// 222:27: -> ^( MUL $expr_3 $next)
					{
						dbg.location(222,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:222:30: ^( MUL $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(222,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MUL, "MUL"), root_1);
						dbg.location(222,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(222,45);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:223:11: '/' next= expr_2
					{
					dbg.location(223,11);
					char_literal119=(Token)match(input,76,FOLLOW_76_in_expr_32105);  
					stream_76.add(char_literal119);
					dbg.location(223,19);
					pushFollow(FOLLOW_expr_2_in_expr_32109);
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
					// 223:27: -> ^( DIV $expr_3 $next)
					{
						dbg.location(223,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:223:30: ^( DIV $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(223,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIV, "DIV"), root_1);
						dbg.location(223,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(223,45);
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
			} finally {dbg.exitSubRule(27);}

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
		dbg.location(225, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:227:1: expr_4 : ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* ;
	public final leacParser.expr_4_return expr_4() throws RecognitionException {
		leacParser.expr_4_return retval = new leacParser.expr_4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal121=null;
		Token char_literal122=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_3120 =null;

		Object char_literal121_tree=null;
		Object char_literal122_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_expr_3=new RewriteRuleSubtreeStream(adaptor,"rule expr_3");

		try { dbg.enterRule(getGrammarFileName(), "expr_4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(227, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:228:5: ( ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:228:7: ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			{
			dbg.location(228,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:228:7: ( expr_3 -> expr_3 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:228:8: expr_3
			{
			dbg.location(228,8);
			pushFollow(FOLLOW_expr_3_in_expr_42150);
			expr_3120=expr_3();
			state._fsp--;

			stream_expr_3.add(expr_3120.getTree());
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
			// 228:15: -> expr_3
			{
				dbg.location(228,18);
				adaptor.addChild(root_0, stream_expr_3.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(229,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:229:9: ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=3;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==72) ) {
					alt28=1;
				}
				else if ( (LA28_0==74) ) {
					alt28=2;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:229:11: '+' next= expr_3
					{
					dbg.location(229,11);
					char_literal121=(Token)match(input,72,FOLLOW_72_in_expr_42167);  
					stream_72.add(char_literal121);
					dbg.location(229,19);
					pushFollow(FOLLOW_expr_3_in_expr_42171);
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
					// 229:27: -> ^( ADD $expr_4 $next)
					{
						dbg.location(229,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:229:30: ^( ADD $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(229,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ADD, "ADD"), root_1);
						dbg.location(229,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(229,45);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:230:11: '-' next= expr_3
					{
					dbg.location(230,11);
					char_literal122=(Token)match(input,74,FOLLOW_74_in_expr_42195);  
					stream_74.add(char_literal122);
					dbg.location(230,19);
					pushFollow(FOLLOW_expr_3_in_expr_42199);
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
					// 230:27: -> ^( SUB $expr_4 $next)
					{
						dbg.location(230,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:230:30: ^( SUB $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(230,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUB, "SUB"), root_1);
						dbg.location(230,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(230,45);
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
			} finally {dbg.exitSubRule(28);}

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
		dbg.location(232, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:234:1: expr_5 : ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* ;
	public final leacParser.expr_5_return expr_5() throws RecognitionException {
		leacParser.expr_5_return retval = new leacParser.expr_5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		Token string_literal125=null;
		Token char_literal126=null;
		Token string_literal127=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_4123 =null;

		Object char_literal124_tree=null;
		Object string_literal125_tree=null;
		Object char_literal126_tree=null;
		Object string_literal127_tree=null;
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleSubtreeStream stream_expr_4=new RewriteRuleSubtreeStream(adaptor,"rule expr_4");

		try { dbg.enterRule(getGrammarFileName(), "expr_5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(234, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:235:5: ( ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:235:7: ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			{
			dbg.location(235,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:235:7: ( expr_4 -> expr_4 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:235:8: expr_4
			{
			dbg.location(235,8);
			pushFollow(FOLLOW_expr_4_in_expr_52240);
			expr_4123=expr_4();
			state._fsp--;

			stream_expr_4.add(expr_4123.getTree());
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
			// 235:15: -> expr_4
			{
				dbg.location(235,18);
				adaptor.addChild(root_0, stream_expr_4.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(236,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:236:9: ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=5;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				switch ( input.LA(1) ) {
				case 79:
					{
					alt29=1;
					}
					break;
				case 80:
					{
					alt29=2;
					}
					break;
				case 83:
					{
					alt29=3;
					}
					break;
				case 84:
					{
					alt29=4;
					}
					break;
				}
				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:236:11: '<' next= expr_4
					{
					dbg.location(236,11);
					char_literal124=(Token)match(input,79,FOLLOW_79_in_expr_52257);  
					stream_79.add(char_literal124);
					dbg.location(236,19);
					pushFollow(FOLLOW_expr_4_in_expr_52261);
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
					// 236:27: -> ^( TEST_LT $expr_5 $next)
					{
						dbg.location(236,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:236:30: ^( TEST_LT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(236,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LT, "TEST_LT"), root_1);
						dbg.location(236,41);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(236,49);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:237:11: '<=' next= expr_4
					{
					dbg.location(237,11);
					string_literal125=(Token)match(input,80,FOLLOW_80_in_expr_52285);  
					stream_80.add(string_literal125);
					dbg.location(237,20);
					pushFollow(FOLLOW_expr_4_in_expr_52289);
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
					// 237:28: -> ^( TEST_LE $expr_5 $next)
					{
						dbg.location(237,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:237:31: ^( TEST_LE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(237,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LE, "TEST_LE"), root_1);
						dbg.location(237,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(237,50);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:238:11: '>' next= expr_4
					{
					dbg.location(238,11);
					char_literal126=(Token)match(input,83,FOLLOW_83_in_expr_52313);  
					stream_83.add(char_literal126);
					dbg.location(238,19);
					pushFollow(FOLLOW_expr_4_in_expr_52317);
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
					// 238:27: -> ^( TEST_GT $expr_5 $next)
					{
						dbg.location(238,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:238:30: ^( TEST_GT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(238,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GT, "TEST_GT"), root_1);
						dbg.location(238,41);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(238,49);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:239:11: '>=' next= expr_4
					{
					dbg.location(239,11);
					string_literal127=(Token)match(input,84,FOLLOW_84_in_expr_52341);  
					stream_84.add(string_literal127);
					dbg.location(239,20);
					pushFollow(FOLLOW_expr_4_in_expr_52345);
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
					// 239:28: -> ^( TEST_GE $expr_5 $next)
					{
						dbg.location(239,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:239:31: ^( TEST_GE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(239,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GE, "TEST_GE"), root_1);
						dbg.location(239,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(239,50);
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
			} finally {dbg.exitSubRule(29);}

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
		dbg.location(241, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:243:1: expr_6 : ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* ;
	public final leacParser.expr_6_return expr_6() throws RecognitionException {
		leacParser.expr_6_return retval = new leacParser.expr_6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal129=null;
		Token string_literal130=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_5128 =null;

		Object string_literal129_tree=null;
		Object string_literal130_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleSubtreeStream stream_expr_5=new RewriteRuleSubtreeStream(adaptor,"rule expr_5");

		try { dbg.enterRule(getGrammarFileName(), "expr_6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(243, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:244:5: ( ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:244:7: ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			{
			dbg.location(244,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:244:7: ( expr_5 -> expr_5 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:244:8: expr_5
			{
			dbg.location(244,8);
			pushFollow(FOLLOW_expr_5_in_expr_62386);
			expr_5128=expr_5();
			state._fsp--;

			stream_expr_5.add(expr_5128.getTree());
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
			// 244:15: -> expr_5
			{
				dbg.location(244,18);
				adaptor.addChild(root_0, stream_expr_5.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(245,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:245:9: ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=3;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==82) ) {
					alt30=1;
				}
				else if ( (LA30_0==68) ) {
					alt30=2;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:245:11: '==' next= expr_5
					{
					dbg.location(245,11);
					string_literal129=(Token)match(input,82,FOLLOW_82_in_expr_62403);  
					stream_82.add(string_literal129);
					dbg.location(245,20);
					pushFollow(FOLLOW_expr_5_in_expr_62407);
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
					// 245:28: -> ^( TEST_EQ $expr_6 $next)
					{
						dbg.location(245,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:245:31: ^( TEST_EQ $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(245,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_EQ, "TEST_EQ"), root_1);
						dbg.location(245,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(245,50);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:246:11: '!=' next= expr_5
					{
					dbg.location(246,11);
					string_literal130=(Token)match(input,68,FOLLOW_68_in_expr_62431);  
					stream_68.add(string_literal130);
					dbg.location(246,20);
					pushFollow(FOLLOW_expr_5_in_expr_62435);
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
					// 246:28: -> ^( TEST_NE $expr_6 $next)
					{
						dbg.location(246,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:246:31: ^( TEST_NE $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(246,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_NE, "TEST_NE"), root_1);
						dbg.location(246,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(246,50);
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
			} finally {dbg.exitSubRule(30);}

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
		dbg.location(248, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:250:1: expr_7 : ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* ;
	public final leacParser.expr_7_return expr_7() throws RecognitionException {
		leacParser.expr_7_return retval = new leacParser.expr_7_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal132=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_6131 =null;

		Object string_literal132_tree=null;
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleSubtreeStream stream_expr_6=new RewriteRuleSubtreeStream(adaptor,"rule expr_6");

		try { dbg.enterRule(getGrammarFileName(), "expr_7");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(250, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:251:5: ( ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:251:7: ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			{
			dbg.location(251,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:251:7: ( expr_6 -> expr_6 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:251:8: expr_6
			{
			dbg.location(251,8);
			pushFollow(FOLLOW_expr_6_in_expr_72476);
			expr_6131=expr_6();
			state._fsp--;

			stream_expr_6.add(expr_6131.getTree());
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
			// 251:15: -> expr_6
			{
				dbg.location(251,18);
				adaptor.addChild(root_0, stream_expr_6.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(252,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:252:9: ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==88) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:252:11: 'and' next= expr_6
					{
					dbg.location(252,11);
					string_literal132=(Token)match(input,88,FOLLOW_88_in_expr_72493);  
					stream_88.add(string_literal132);
					dbg.location(252,21);
					pushFollow(FOLLOW_expr_6_in_expr_72497);
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
					// 252:29: -> ^( AND $expr_7 $next)
					{
						dbg.location(252,32);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:252:32: ^( AND $expr_7 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(252,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);
						dbg.location(252,39);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(252,47);
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
			} finally {dbg.exitSubRule(31);}

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
		dbg.location(254, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_7");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:256:1: expr_8 : ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* ;
	public final leacParser.expr_8_return expr_8() throws RecognitionException {
		leacParser.expr_8_return retval = new leacParser.expr_8_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal134=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_7133 =null;

		Object string_literal134_tree=null;
		RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
		RewriteRuleSubtreeStream stream_expr_7=new RewriteRuleSubtreeStream(adaptor,"rule expr_7");

		try { dbg.enterRule(getGrammarFileName(), "expr_8");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(256, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:257:5: ( ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:257:7: ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			{
			dbg.location(257,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:257:7: ( expr_7 -> expr_7 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:257:8: expr_7
			{
			dbg.location(257,8);
			pushFollow(FOLLOW_expr_7_in_expr_82538);
			expr_7133=expr_7();
			state._fsp--;

			stream_expr_7.add(expr_7133.getTree());
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
			// 257:15: -> expr_7
			{
				dbg.location(257,18);
				adaptor.addChild(root_0, stream_expr_7.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(258,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:258:9: ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==100) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:258:11: 'or' next= expr_7
					{
					dbg.location(258,11);
					string_literal134=(Token)match(input,100,FOLLOW_100_in_expr_82555);  
					stream_100.add(string_literal134);
					dbg.location(258,20);
					pushFollow(FOLLOW_expr_7_in_expr_82559);
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
					// 258:28: -> ^( OR $expr_8 $next)
					{
						dbg.location(258,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:258:31: ^( OR $expr_8 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(258,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);
						dbg.location(258,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(258,45);
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
			} finally {dbg.exitSubRule(32);}

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
		dbg.location(260, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_8");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:262:1: expr : expr_8 -> expr_8 ;
	public final leacParser.expr_return expr() throws RecognitionException {
		leacParser.expr_return retval = new leacParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_8135 =null;

		RewriteRuleSubtreeStream stream_expr_8=new RewriteRuleSubtreeStream(adaptor,"rule expr_8");

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(262, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:263:5: ( expr_8 -> expr_8 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:263:7: expr_8
			{
			dbg.location(263,7);
			pushFollow(FOLLOW_expr_8_in_expr2599);
			expr_8135=expr_8();
			state._fsp--;

			stream_expr_8.add(expr_8135.getTree());
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
			// 263:14: -> expr_8
			{
				dbg.location(263,17);
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
		dbg.location(264, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:266:1: constant : ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final leacParser.constant_return constant() throws RecognitionException {
		leacParser.constant_return retval = new leacParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT136=null;
		Token FLOAT137=null;
		Token BOOL138=null;
		Token STRING139=null;
		Token CHAR140=null;

		Object INT136_tree=null;
		Object FLOAT137_tree=null;
		Object BOOL138_tree=null;
		Object STRING139_tree=null;
		Object CHAR140_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(266, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:5: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt33=5;
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			switch ( input.LA(1) ) {
			case INT:
				{
				alt33=1;
				}
				break;
			case FLOAT:
				{
				alt33=2;
				}
				break;
			case BOOL:
				{
				alt33=3;
				}
				break;
			case STRING:
				{
				alt33=4;
				}
				break;
			case CHAR:
				{
				alt33=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:7: INT
					{
					dbg.location(267,7);
					INT136=(Token)match(input,INT,FOLLOW_INT_in_constant2620);  
					stream_INT.add(INT136);

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
					// 267:11: -> ^( CONST INT_TYPENAME INT )
					{
						dbg.location(267,14);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:267:14: ^( CONST INT_TYPENAME INT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(267,16);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(267,22);
						adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));dbg.location(267,35);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:7: FLOAT
					{
					dbg.location(268,7);
					FLOAT137=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2638);  
					stream_FLOAT.add(FLOAT137);

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
					// 268:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						dbg.location(268,16);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:268:16: ^( CONST FLOAT_TYPENAME FLOAT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(268,18);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(268,24);
						adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));dbg.location(268,39);
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:269:7: BOOL
					{
					dbg.location(269,7);
					BOOL138=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant2656);  
					stream_BOOL.add(BOOL138);

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
					// 269:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						dbg.location(269,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:269:15: ^( CONST BOOL_TYPENAME BOOL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(269,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(269,23);
						adaptor.addChild(root_1, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));dbg.location(269,37);
						adaptor.addChild(root_1, stream_BOOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:270:7: STRING
					{
					dbg.location(270,7);
					STRING139=(Token)match(input,STRING,FOLLOW_STRING_in_constant2674);  
					stream_STRING.add(STRING139);

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
					// 270:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						dbg.location(270,17);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:270:17: ^( CONST STRING_TYPENAME STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(270,19);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(270,25);
						adaptor.addChild(root_1, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));dbg.location(270,41);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:271:7: CHAR
					{
					dbg.location(271,7);
					CHAR140=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant2692);  
					stream_CHAR.add(CHAR140);

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
					// 271:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						dbg.location(271,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:271:15: ^( CONST CHAR_TYPENAME CHAR )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(271,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(271,23);
						adaptor.addChild(root_1, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));dbg.location(271,37);
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
		dbg.location(272, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "constant"

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
	public static final BitSet FOLLOW_85_in_array_typename725 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_range_list_in_array_typename727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_array_typename729 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_array_typename731 = new BitSet(new long[]{0x0000000000000000L,0x000008024C000000L});
	public static final BitSet FOLLOW_atom_typename_in_array_typename733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_range_list760 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_range_list763 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_range_in_range_list765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_INT_in_range794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_range796 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INT_in_range800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list843 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_param_list846 = new BitSet(new long[]{0x0000000080000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_param_in_param_list848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_IDF_in_param875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_param877 = new BitSet(new long[]{0x0000000000000000L,0x000008024E000000L});
	public static final BitSet FOLLOW_typename_in_param879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_param899 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_param901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_param903 = new BitSet(new long[]{0x0000000000000000L,0x000008024E000000L});
	public static final BitSet FOLLOW_typename_in_param905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_statement946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_or_procedure_call_in_statement958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returning_in_statement970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_in_statement1006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_conditional1027 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_conditional1029 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_conditional1031 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_conditional1035 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
	public static final BitSet FOLLOW_93_in_conditional1059 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_conditional1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_loop1129 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_loop1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_loop1133 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_loop1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_coord_list1162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_coord_list1165 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_coord_list1167 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_104_in_returning1195 = new BitSet(new long[]{0x0008000282010802L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_returning1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_affect_or_procedure_call1262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000220020L});
	public static final BitSet FOLLOW_85_in_affect_or_procedure_call1312 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_affect_or_procedure_call1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_affect_or_procedure_call1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_81_in_affect_or_procedure_call1354 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_affect_or_procedure_call1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_affect_or_procedure_call1379 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000460L});
	public static final BitSet FOLLOW_arg_list_in_affect_or_procedure_call1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_affect_or_procedure_call1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list1434 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_arg_list1437 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_arg_list1439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_110_in_block1467 = new BitSet(new long[]{0x0000000080000000L,0x0000F14100000000L});
	public static final BitSet FOLLOW_statement_in_block1497 = new BitSet(new long[]{0x0000000000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_78_in_block1500 = new BitSet(new long[]{0x0000000080000000L,0x0000714100000000L});
	public static final BitSet FOLLOW_statement_in_block1502 = new BitSet(new long[]{0x0000000000000000L,0x0000800000004000L});
	public static final BitSet FOLLOW_111_in_block1531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_read1548 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_read1550 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_read1586 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_read1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_read1590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_write1631 = new BitSet(new long[]{0x0008000282010800L});
	public static final BitSet FOLLOW_IDF_in_write1643 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_write1687 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_write1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_write1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_write1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_expr_01766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200020L});
	public static final BitSet FOLLOW_69_in_expr_01798 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000460L});
	public static final BitSet FOLLOW_arg_list_in_expr_01800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_expr_01802 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_expr_01824 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_coord_list_in_expr_01826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expr_01828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_01856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_expr_01868 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_in_expr_01870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_expr_01872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_0_in_expr_11894 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_expr_11911 = new BitSet(new long[]{0x0008000282010800L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_1_proxy_in_expr_11915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_1_proxy1954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_expr_21985 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_98_in_expr_22006 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_1_in_expr_22037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr_32060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_71_in_expr_32077 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_2_in_expr_32081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_76_in_expr_32105 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_2_in_expr_32109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001080L});
	public static final BitSet FOLLOW_expr_3_in_expr_42150 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_72_in_expr_42167 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_3_in_expr_42171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_74_in_expr_42195 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_3_in_expr_42199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000500L});
	public static final BitSet FOLLOW_expr_4_in_expr_52240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_79_in_expr_52257 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_80_in_expr_52285 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_83_in_expr_52313 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_84_in_expr_52341 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_4_in_expr_52345 = new BitSet(new long[]{0x0000000000000002L,0x0000000000198000L});
	public static final BitSet FOLLOW_expr_5_in_expr_62386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_82_in_expr_62403 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_5_in_expr_62407 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_68_in_expr_62431 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_5_in_expr_62435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040010L});
	public static final BitSet FOLLOW_expr_6_in_expr_72476 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_expr_72493 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_6_in_expr_72497 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_expr_7_in_expr_82538 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_100_in_expr_82555 = new BitSet(new long[]{0x0008000282010800L,0x0000000400000420L});
	public static final BitSet FOLLOW_expr_7_in_expr_82559 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_expr_8_in_expr2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant2620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant2638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant2656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant2692 = new BitSet(new long[]{0x0000000000000002L});
}
