// $ANTLR null /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g 2020-01-16 16:42:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class LeacParser extends DebugParser {
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
		"'ref'", "'return'", "'then'", "'var'", "'void'", "'while'", "'write'", 
		"'{'", "'}'"
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


	public static final String[] ruleNames = new String[] {
		"invalidRule", "coord_list", "block", "expr_7", "arg_list", "write", "expr_1", 
		"atom_typename", "func_decl_list", "expr_6", "idf_list", "expr_1_proxy", 
		"expr_4", "param_list", "read", "typename", "program", "param", "expr_2", 
		"statement", "expr_8", "range_list", "conditional", "constant", "array_typename", 
		"affect_or_procedure_call", "range", "constant_ext", "loop", "expr_5", 
		"var_decl", "expr", "expr_0", "int_ext", "expr_3", "func_decl", "var_decl_list", 
		"returning"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public LeacParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public LeacParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public LeacParser(TokenStream input, DebugEventListener dbg) {
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
	@Override public String[] getTokenNames() { return LeacParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:64:1: program : 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM IDF var_decl_list func_decl_list statement ) ;
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

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:65:5: ( 'program' IDF var_decl_list func_decl_list statement -> ^( PROGRAM IDF var_decl_list func_decl_list statement ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:65:7: 'program' IDF var_decl_list func_decl_list statement
			{
			dbg.location(65,7);
			string_literal1=(Token)match(input,100,FOLLOW_100_in_program400);  
			stream_100.add(string_literal1);
			dbg.location(65,17);
			IDF2=(Token)match(input,IDF,FOLLOW_IDF_in_program402);  
			stream_IDF.add(IDF2);
			dbg.location(65,21);
			pushFollow(FOLLOW_var_decl_list_in_program404);
			var_decl_list3=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list3.getTree());dbg.location(65,35);
			pushFollow(FOLLOW_func_decl_list_in_program406);
			func_decl_list4=func_decl_list();
			state._fsp--;

			stream_func_decl_list.add(func_decl_list4.getTree());dbg.location(65,50);
			pushFollow(FOLLOW_statement_in_program408);
			statement5=statement();
			state._fsp--;

			stream_statement.add(statement5.getTree());
			// AST REWRITE
			// elements: func_decl_list, var_decl_list, statement, IDF
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
				dbg.location(65,63);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:65:63: ^( PROGRAM IDF var_decl_list func_decl_list statement )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(65,65);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(65,73);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(65,77);
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());dbg.location(65,91);
				adaptor.addChild(root_1, stream_func_decl_list.nextTree());dbg.location(65,106);
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
		dbg.location(66, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:68:1: var_decl_list : ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) ;
	public final LeacParser.var_decl_list_return var_decl_list() throws RecognitionException {
		LeacParser.var_decl_list_return retval = new LeacParser.var_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope var_decl6 =null;

		RewriteRuleSubtreeStream stream_var_decl=new RewriteRuleSubtreeStream(adaptor,"rule var_decl");

		try { dbg.enterRule(getGrammarFileName(), "var_decl_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:5: ( ( var_decl )* -> ^( VAR_DECL_LIST ( var_decl )* ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:7: ( var_decl )*
			{
			dbg.location(69,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:7: ( var_decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==105) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:7: var_decl
					{
					dbg.location(69,7);
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
			// 69:17: -> ^( VAR_DECL_LIST ( var_decl )* )
			{
				dbg.location(69,20);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:20: ^( VAR_DECL_LIST ( var_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(69,22);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL_LIST, "VAR_DECL_LIST"), root_1);
				dbg.location(69,36);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:69:36: ( var_decl )*
				while ( stream_var_decl.hasNext() ) {
					dbg.location(69,36);
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
		dbg.location(70, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:71:1: var_decl : 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) ;
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
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_idf_list=new RewriteRuleSubtreeStream(adaptor,"rule idf_list");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try { dbg.enterRule(getGrammarFileName(), "var_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:72:5: ( 'var' idf_list ':' typename ';' -> ^( VAR_DECL typename idf_list ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:72:7: 'var' idf_list ':' typename ';'
			{
			dbg.location(72,7);
			string_literal7=(Token)match(input,105,FOLLOW_105_in_var_decl465);  
			stream_105.add(string_literal7);
			dbg.location(72,13);
			pushFollow(FOLLOW_idf_list_in_var_decl467);
			idf_list8=idf_list();
			state._fsp--;

			stream_idf_list.add(idf_list8.getTree());dbg.location(72,22);
			char_literal9=(Token)match(input,76,FOLLOW_76_in_var_decl469);  
			stream_76.add(char_literal9);
			dbg.location(72,26);
			pushFollow(FOLLOW_typename_in_var_decl471);
			typename10=typename();
			state._fsp--;

			stream_typename.add(typename10.getTree());dbg.location(72,35);
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
				dbg.location(72,42);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:72:42: ^( VAR_DECL typename idf_list )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(72,44);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				dbg.location(72,53);
				adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(72,62);
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
		dbg.location(73, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:74:1: idf_list : IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) ;
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

		try { dbg.enterRule(getGrammarFileName(), "idf_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:75:5: ( IDF ( ',' IDF )* -> ^( IDF_LIST ( IDF )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:75:7: IDF ( ',' IDF )*
			{
			dbg.location(75,7);
			IDF12=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list499);  
			stream_IDF.add(IDF12);
			dbg.location(75,11);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:75:11: ( ',' IDF )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==72) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:75:12: ',' IDF
					{
					dbg.location(75,12);
					char_literal13=(Token)match(input,72,FOLLOW_72_in_idf_list502);  
					stream_72.add(char_literal13);
					dbg.location(75,16);
					IDF14=(Token)match(input,IDF,FOLLOW_IDF_in_idf_list504);  
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
			// 75:22: -> ^( IDF_LIST ( IDF )+ )
			{
				dbg.location(75,25);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:75:25: ^( IDF_LIST ( IDF )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(75,27);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IDF_LIST, "IDF_LIST"), root_1);
				dbg.location(75,36);
				if ( !(stream_IDF.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_IDF.hasNext() ) {
					dbg.location(75,36);
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
		dbg.location(76, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:78:1: func_decl_list : ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) ;
	public final LeacParser.func_decl_list_return func_decl_list() throws RecognitionException {
		LeacParser.func_decl_list_return retval = new LeacParser.func_decl_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope func_decl15 =null;

		RewriteRuleSubtreeStream stream_func_decl=new RewriteRuleSubtreeStream(adaptor,"rule func_decl");

		try { dbg.enterRule(getGrammarFileName(), "func_decl_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:5: ( ( func_decl )* -> ^( FUNC_DECL_LIST ( func_decl )* ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:7: ( func_decl )*
			{
			dbg.location(79,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:7: ( func_decl )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==94) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:7: func_decl
					{
					dbg.location(79,7);
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
			// 79:18: -> ^( FUNC_DECL_LIST ( func_decl )* )
			{
				dbg.location(79,21);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:21: ^( FUNC_DECL_LIST ( func_decl )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(79,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL_LIST, "FUNC_DECL_LIST"), root_1);
				dbg.location(79,38);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:79:38: ( func_decl )*
				while ( stream_func_decl.hasNext() ) {
					dbg.location(79,38);
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
		dbg.location(80, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:81:1: func_decl : 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL IDF param_list atom_typename var_decl_list block ) ;
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

		try { dbg.enterRule(getGrammarFileName(), "func_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:82:5: ( 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^( FUNC_DECL IDF param_list atom_typename var_decl_list block ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:82:7: 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block
			{
			dbg.location(82,7);
			string_literal16=(Token)match(input,94,FOLLOW_94_in_func_decl558);  
			stream_94.add(string_literal16);
			dbg.location(82,18);
			IDF17=(Token)match(input,IDF,FOLLOW_IDF_in_func_decl560);  
			stream_IDF.add(IDF17);
			dbg.location(82,22);
			char_literal18=(Token)match(input,68,FOLLOW_68_in_func_decl562);  
			stream_68.add(char_literal18);
			dbg.location(82,26);
			pushFollow(FOLLOW_param_list_in_func_decl564);
			param_list19=param_list();
			state._fsp--;

			stream_param_list.add(param_list19.getTree());dbg.location(82,37);
			char_literal20=(Token)match(input,69,FOLLOW_69_in_func_decl566);  
			stream_69.add(char_literal20);
			dbg.location(82,41);
			char_literal21=(Token)match(input,76,FOLLOW_76_in_func_decl568);  
			stream_76.add(char_literal21);
			dbg.location(82,45);
			pushFollow(FOLLOW_atom_typename_in_func_decl570);
			atom_typename22=atom_typename();
			state._fsp--;

			stream_atom_typename.add(atom_typename22.getTree());dbg.location(82,59);
			pushFollow(FOLLOW_var_decl_list_in_func_decl572);
			var_decl_list23=var_decl_list();
			state._fsp--;

			stream_var_decl_list.add(var_decl_list23.getTree());dbg.location(82,73);
			pushFollow(FOLLOW_block_in_func_decl574);
			block24=block();
			state._fsp--;

			stream_block.add(block24.getTree());
			// AST REWRITE
			// elements: param_list, atom_typename, block, IDF, var_decl_list
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
				dbg.location(82,82);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:82:82: ^( FUNC_DECL IDF param_list atom_typename var_decl_list block )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(82,84);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				dbg.location(82,94);
				adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(82,98);
				adaptor.addChild(root_1, stream_param_list.nextTree());dbg.location(82,109);
				adaptor.addChild(root_1, stream_atom_typename.nextTree());dbg.location(82,123);
				adaptor.addChild(root_1, stream_var_decl_list.nextTree());dbg.location(82,137);
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
		dbg.location(83, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:85:1: typename : ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename );
	public final LeacParser.typename_return typename() throws RecognitionException {
		LeacParser.typename_return retval = new LeacParser.typename_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope atom_typename25 =null;
		ParserRuleReturnScope array_typename26 =null;

		RewriteRuleSubtreeStream stream_array_typename=new RewriteRuleSubtreeStream(adaptor,"rule array_typename");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");

		try { dbg.enterRule(getGrammarFileName(), "typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:86:5: ( atom_typename -> ^( ATOM atom_typename ) | array_typename -> array_typename )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 89 && LA4_0 <= 90)||LA4_0==93||LA4_0==96||LA4_0==106) ) {
				alt4=1;
			}
			else if ( (LA4_0==88) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:86:7: atom_typename
					{
					dbg.location(86,7);
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
						dbg.location(86,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:86:24: ^( ATOM atom_typename )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(86,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ATOM, "ATOM"), root_1);
						dbg.location(86,31);
						adaptor.addChild(root_1, stream_atom_typename.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:87:7: array_typename
					{
					dbg.location(87,7);
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
						dbg.location(87,25);
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
		dbg.location(88, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:90:1: atom_typename : ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME );
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
		RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
		RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
		RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");

		try { dbg.enterRule(getGrammarFileName(), "atom_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:91:5: ( 'void' -> VOID_TYPENAME | 'bool' -> BOOL_TYPENAME | 'int' -> INT_TYPENAME | 'float' -> FLOAT_TYPENAME | 'char' -> CHAR_TYPENAME )
			int alt5=5;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case 106:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:91:7: 'void'
					{
					dbg.location(91,7);
					string_literal27=(Token)match(input,106,FOLLOW_106_in_atom_typename644);  
					stream_106.add(string_literal27);

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
						dbg.location(91,17);
						adaptor.addChild(root_0, (Object)adaptor.create(VOID_TYPENAME, "VOID_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:92:7: 'bool'
					{
					dbg.location(92,7);
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
						dbg.location(92,17);
						adaptor.addChild(root_0, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:93:7: 'int'
					{
					dbg.location(93,7);
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
						dbg.location(93,16);
						adaptor.addChild(root_0, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:94:7: 'float'
					{
					dbg.location(94,7);
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
						dbg.location(94,18);
						adaptor.addChild(root_0, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:95:7: 'char'
					{
					dbg.location(95,7);
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
						dbg.location(95,17);
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
		dbg.location(96, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:98:1: array_typename : 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) ;
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
		RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleSubtreeStream stream_atom_typename=new RewriteRuleSubtreeStream(adaptor,"rule atom_typename");
		RewriteRuleSubtreeStream stream_range_list=new RewriteRuleSubtreeStream(adaptor,"rule range_list");

		try { dbg.enterRule(getGrammarFileName(), "array_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:99:5: ( 'array' '[' range_list ']' 'of' atom_typename -> ^( ARRAY atom_typename range_list ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:99:7: 'array' '[' range_list ']' 'of' atom_typename
			{
			dbg.location(99,7);
			string_literal32=(Token)match(input,88,FOLLOW_88_in_array_typename713);  
			stream_88.add(string_literal32);
			dbg.location(99,15);
			char_literal33=(Token)match(input,84,FOLLOW_84_in_array_typename715);  
			stream_84.add(char_literal33);
			dbg.location(99,19);
			pushFollow(FOLLOW_range_list_in_array_typename717);
			range_list34=range_list();
			state._fsp--;

			stream_range_list.add(range_list34.getTree());dbg.location(99,30);
			char_literal35=(Token)match(input,85,FOLLOW_85_in_array_typename719);  
			stream_85.add(char_literal35);
			dbg.location(99,34);
			string_literal36=(Token)match(input,98,FOLLOW_98_in_array_typename721);  
			stream_98.add(string_literal36);
			dbg.location(99,39);
			pushFollow(FOLLOW_atom_typename_in_array_typename723);
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
			// 99:53: -> ^( ARRAY atom_typename range_list )
			{
				dbg.location(99,56);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:99:56: ^( ARRAY atom_typename range_list )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(99,58);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARRAY, "ARRAY"), root_1);
				dbg.location(99,64);
				adaptor.addChild(root_1, stream_atom_typename.nextTree());dbg.location(99,78);
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
		dbg.location(100, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:102:1: range_list : range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) ;
	public final LeacParser.range_list_return range_list() throws RecognitionException {
		LeacParser.range_list_return retval = new LeacParser.range_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal39=null;
		ParserRuleReturnScope range38 =null;
		ParserRuleReturnScope range40 =null;

		Object char_literal39_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");

		try { dbg.enterRule(getGrammarFileName(), "range_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:103:5: ( range ( ',' range )* -> ^( RANGE_LIST ( range )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:103:7: range ( ',' range )*
			{
			dbg.location(103,7);
			pushFollow(FOLLOW_range_in_range_list750);
			range38=range();
			state._fsp--;

			stream_range.add(range38.getTree());dbg.location(103,13);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:103:13: ( ',' range )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==72) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:103:14: ',' range
					{
					dbg.location(103,14);
					char_literal39=(Token)match(input,72,FOLLOW_72_in_range_list753);  
					stream_72.add(char_literal39);
					dbg.location(103,18);
					pushFollow(FOLLOW_range_in_range_list755);
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
			// 103:26: -> ^( RANGE_LIST ( range )+ )
			{
				dbg.location(103,29);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:103:29: ^( RANGE_LIST ( range )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(103,31);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE_LIST, "RANGE_LIST"), root_1);
				dbg.location(103,42);
				if ( !(stream_range.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_range.hasNext() ) {
					dbg.location(103,42);
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
		dbg.location(104, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:105:1: range : inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) ;
	public final LeacParser.range_return range() throws RecognitionException {
		LeacParser.range_return retval = new LeacParser.range_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal41=null;
		ParserRuleReturnScope inf =null;
		ParserRuleReturnScope sup =null;

		Object string_literal41_tree=null;
		RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
		RewriteRuleSubtreeStream stream_int_ext=new RewriteRuleSubtreeStream(adaptor,"rule int_ext");

		try { dbg.enterRule(getGrammarFileName(), "range");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:106:5: (inf= int_ext '..' sup= int_ext -> ^( RANGE $inf $sup) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:106:7: inf= int_ext '..' sup= int_ext
			{
			dbg.location(106,10);
			pushFollow(FOLLOW_int_ext_in_range784);
			inf=int_ext();
			state._fsp--;

			stream_int_ext.add(inf.getTree());dbg.location(106,19);
			string_literal41=(Token)match(input,74,FOLLOW_74_in_range786);  
			stream_74.add(string_literal41);
			dbg.location(106,27);
			pushFollow(FOLLOW_int_ext_in_range790);
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
			// 106:36: -> ^( RANGE $inf $sup)
			{
				dbg.location(106,39);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:106:39: ^( RANGE $inf $sup)
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(106,41);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RANGE, "RANGE"), root_1);
				dbg.location(106,48);
				adaptor.addChild(root_1, stream_inf.nextTree());dbg.location(106,53);
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
		dbg.location(107, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "range");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:109:1: int_ext : ( INT -> INT | '-' INT -> INT );
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
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "int_ext");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(109, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:110:5: ( INT -> INT | '-' INT -> INT )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:110:7: INT
					{
					dbg.location(110,7);
					INT42=(Token)match(input,INT,FOLLOW_INT_in_int_ext819);  
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
					// 110:11: -> INT
					{
						dbg.location(110,14);
						adaptor.addChild(root_0, stream_INT.nextNode());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:111:7: '-' INT
					{
					dbg.location(111,7);
					char_literal43=(Token)match(input,73,FOLLOW_73_in_int_ext831);  
					stream_73.add(char_literal43);
					dbg.location(111,11);
					INT44=(Token)match(input,INT,FOLLOW_INT_in_int_ext833);  
					stream_INT.add(INT44);
					dbg.location(111,15);
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
					// 111:55: -> INT
					{
						dbg.location(111,58);
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
		dbg.location(112, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "int_ext");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:114:1: param_list : ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) );
	public final LeacParser.param_list_return param_list() throws RecognitionException {
		LeacParser.param_list_return retval = new LeacParser.param_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal46=null;
		ParserRuleReturnScope param45 =null;
		ParserRuleReturnScope param47 =null;

		Object char_literal46_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");

		try { dbg.enterRule(getGrammarFileName(), "param_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(114, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:115:5: ( -> ^( PARAM_LIST ) | param ( ',' param )* -> ^( PARAM_LIST ( param )+ ) )
			int alt9=2;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:115:21: 
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
					// 115:21: -> ^( PARAM_LIST )
					{
						dbg.location(115,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:115:24: ^( PARAM_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(115,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:116:7: param ( ',' param )*
					{
					dbg.location(116,7);
					pushFollow(FOLLOW_param_in_param_list870);
					param45=param();
					state._fsp--;

					stream_param.add(param45.getTree());dbg.location(116,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:116:13: ( ',' param )*
					try { dbg.enterSubRule(8);

					loop8:
					while (true) {
						int alt8=2;
						try { dbg.enterDecision(8, decisionCanBacktrack[8]);

						int LA8_0 = input.LA(1);
						if ( (LA8_0==72) ) {
							alt8=1;
						}

						} finally {dbg.exitDecision(8);}

						switch (alt8) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:116:14: ',' param
							{
							dbg.location(116,14);
							char_literal46=(Token)match(input,72,FOLLOW_72_in_param_list873);  
							stream_72.add(char_literal46);
							dbg.location(116,18);
							pushFollow(FOLLOW_param_in_param_list875);
							param47=param();
							state._fsp--;

							stream_param.add(param47.getTree());
							}
							break;

						default :
							break loop8;
						}
					}
					} finally {dbg.exitSubRule(8);}

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
					// 116:26: -> ^( PARAM_LIST ( param )+ )
					{
						dbg.location(116,29);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:116:29: ^( PARAM_LIST ( param )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(116,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM_LIST, "PARAM_LIST"), root_1);
						dbg.location(116,42);
						if ( !(stream_param.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_param.hasNext() ) {
							dbg.location(116,42);
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
		dbg.location(117, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:118:1: param : ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) );
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
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_typename=new RewriteRuleSubtreeStream(adaptor,"rule typename");

		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:119:5: ( IDF ':' typename -> ^( PARAM typename BY_COPY IDF ) | 'ref' IDF ':' typename -> ^( PARAM typename BY_REF IDF ) )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:119:7: IDF ':' typename
					{
					dbg.location(119,7);
					IDF48=(Token)match(input,IDF,FOLLOW_IDF_in_param902);  
					stream_IDF.add(IDF48);
					dbg.location(119,11);
					char_literal49=(Token)match(input,76,FOLLOW_76_in_param904);  
					stream_76.add(char_literal49);
					dbg.location(119,15);
					pushFollow(FOLLOW_typename_in_param906);
					typename50=typename();
					state._fsp--;

					stream_typename.add(typename50.getTree());
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
					// 119:24: -> ^( PARAM typename BY_COPY IDF )
					{
						dbg.location(119,27);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:119:27: ^( PARAM typename BY_COPY IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(119,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(119,35);
						adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(119,44);
						adaptor.addChild(root_1, (Object)adaptor.create(BY_COPY, "BY_COPY"));dbg.location(119,52);
						adaptor.addChild(root_1, stream_IDF.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:120:7: 'ref' IDF ':' typename
					{
					dbg.location(120,7);
					string_literal51=(Token)match(input,102,FOLLOW_102_in_param926);  
					stream_102.add(string_literal51);
					dbg.location(120,13);
					IDF52=(Token)match(input,IDF,FOLLOW_IDF_in_param928);  
					stream_IDF.add(IDF52);
					dbg.location(120,17);
					char_literal53=(Token)match(input,76,FOLLOW_76_in_param930);  
					stream_76.add(char_literal53);
					dbg.location(120,21);
					pushFollow(FOLLOW_typename_in_param932);
					typename54=typename();
					state._fsp--;

					stream_typename.add(typename54.getTree());
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
					// 120:30: -> ^( PARAM typename BY_REF IDF )
					{
						dbg.location(120,33);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:120:33: ^( PARAM typename BY_REF IDF )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(120,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAM, "PARAM"), root_1);
						dbg.location(120,41);
						adaptor.addChild(root_1, stream_typename.nextTree());dbg.location(120,50);
						adaptor.addChild(root_1, (Object)adaptor.create(BY_REF, "BY_REF"));dbg.location(120,57);
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
		dbg.location(121, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:123:1: statement : ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write );
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

		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:124:5: ( conditional -> conditional | loop -> loop | affect_or_procedure_call -> affect_or_procedure_call | returning -> returning | block -> block | read -> read | write -> write )
			int alt11=7;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case 95:
				{
				alt11=1;
				}
				break;
			case 107:
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
			case 109:
				{
				alt11=5;
				}
				break;
			case 101:
				{
				alt11=6;
				}
				break;
			case 108:
				{
				alt11=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:124:7: conditional
					{
					dbg.location(124,7);
					pushFollow(FOLLOW_conditional_in_statement961);
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
					// 124:19: -> conditional
					{
						dbg.location(124,22);
						adaptor.addChild(root_0, stream_conditional.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:125:7: loop
					{
					dbg.location(125,7);
					pushFollow(FOLLOW_loop_in_statement973);
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
					// 125:12: -> loop
					{
						dbg.location(125,15);
						adaptor.addChild(root_0, stream_loop.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:126:7: affect_or_procedure_call
					{
					dbg.location(126,7);
					pushFollow(FOLLOW_affect_or_procedure_call_in_statement985);
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
					// 126:32: -> affect_or_procedure_call
					{
						dbg.location(126,35);
						adaptor.addChild(root_0, stream_affect_or_procedure_call.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:127:7: returning
					{
					dbg.location(127,7);
					pushFollow(FOLLOW_returning_in_statement997);
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
					// 127:17: -> returning
					{
						dbg.location(127,20);
						adaptor.addChild(root_0, stream_returning.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:128:7: block
					{
					dbg.location(128,7);
					pushFollow(FOLLOW_block_in_statement1009);
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
					// 128:13: -> block
					{
						dbg.location(128,16);
						adaptor.addChild(root_0, stream_block.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:129:7: read
					{
					dbg.location(129,7);
					pushFollow(FOLLOW_read_in_statement1021);
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
					// 129:12: -> read
					{
						dbg.location(129,15);
						adaptor.addChild(root_0, stream_read.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:130:7: write
					{
					dbg.location(130,7);
					pushFollow(FOLLOW_write_in_statement1033);
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
					// 130:13: -> write
					{
						dbg.location(130,16);
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
		dbg.location(131, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:133:1: conditional : 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) ) ;
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
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
		RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "conditional");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:134:5: ( 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:134:7: 'if' expr 'then' first= statement ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) )
			{
			dbg.location(134,7);
			string_literal62=(Token)match(input,95,FOLLOW_95_in_conditional1054);  
			stream_95.add(string_literal62);
			dbg.location(134,12);
			pushFollow(FOLLOW_expr_in_conditional1056);
			expr63=expr();
			state._fsp--;

			stream_expr.add(expr63.getTree());dbg.location(134,17);
			string_literal64=(Token)match(input,104,FOLLOW_104_in_conditional1058);  
			stream_104.add(string_literal64);
			dbg.location(134,29);
			pushFollow(FOLLOW_statement_in_conditional1062);
			first=statement();
			state._fsp--;

			stream_statement.add(first.getTree());dbg.location(135,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:135:9: ( options {greedy=true; } : 'else' second= statement -> ^( CONDITIONAL expr $first $second) | -> ^( CONDITIONAL expr $first ^( BLOCK ) ) )
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==92) ) {
				alt12=1;
			}
			else if ( (LA12_0==EOF||LA12_0==77||LA12_0==110) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:135:39: 'else' second= statement
					{
					dbg.location(135,39);
					string_literal65=(Token)match(input,92,FOLLOW_92_in_conditional1086);  
					stream_92.add(string_literal65);
					dbg.location(135,52);
					pushFollow(FOLLOW_statement_in_conditional1090);
					second=statement();
					state._fsp--;

					stream_statement.add(second.getTree());
					// AST REWRITE
					// elements: first, expr, second
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
					// 135:63: -> ^( CONDITIONAL expr $first $second)
					{
						dbg.location(135,66);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:135:66: ^( CONDITIONAL expr $first $second)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(135,68);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						dbg.location(135,80);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(135,86);
						adaptor.addChild(root_1, stream_first.nextTree());dbg.location(135,93);
						adaptor.addChild(root_1, stream_second.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:136:25: 
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
					// 136:25: -> ^( CONDITIONAL expr $first ^( BLOCK ) )
					{
						dbg.location(136,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:136:28: ^( CONDITIONAL expr $first ^( BLOCK ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(136,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONDITIONAL, "CONDITIONAL"), root_1);
						dbg.location(136,42);
						adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(136,48);
						adaptor.addChild(root_1, stream_first.nextTree());dbg.location(136,54);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:136:54: ^( BLOCK )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(136,56);
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
			} finally {dbg.exitSubRule(12);}

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
		dbg.location(138, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:140:1: loop : 'while' expr 'do' statement -> ^( LOOP expr statement ) ;
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
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(140, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:141:5: ( 'while' expr 'do' statement -> ^( LOOP expr statement ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:141:7: 'while' expr 'do' statement
			{
			dbg.location(141,7);
			string_literal66=(Token)match(input,107,FOLLOW_107_in_loop1158);  
			stream_107.add(string_literal66);
			dbg.location(141,15);
			pushFollow(FOLLOW_expr_in_loop1160);
			expr67=expr();
			state._fsp--;

			stream_expr.add(expr67.getTree());dbg.location(141,20);
			string_literal68=(Token)match(input,91,FOLLOW_91_in_loop1162);  
			stream_91.add(string_literal68);
			dbg.location(141,25);
			pushFollow(FOLLOW_statement_in_loop1164);
			statement69=statement();
			state._fsp--;

			stream_statement.add(statement69.getTree());
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
			// 141:35: -> ^( LOOP expr statement )
			{
				dbg.location(141,38);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:141:38: ^( LOOP expr statement )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(141,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOP, "LOOP"), root_1);
				dbg.location(141,45);
				adaptor.addChild(root_1, stream_expr.nextTree());dbg.location(141,50);
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
		dbg.location(142, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:144:1: coord_list : expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) ;
	public final LeacParser.coord_list_return coord_list() throws RecognitionException {
		LeacParser.coord_list_return retval = new LeacParser.coord_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal71=null;
		ParserRuleReturnScope expr70 =null;
		ParserRuleReturnScope expr72 =null;

		Object char_literal71_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "coord_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(144, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:145:5: ( expr ( ',' expr )* -> ^( COORD_LIST ( expr )+ ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:145:7: expr ( ',' expr )*
			{
			dbg.location(145,7);
			pushFollow(FOLLOW_expr_in_coord_list1191);
			expr70=expr();
			state._fsp--;

			stream_expr.add(expr70.getTree());dbg.location(145,12);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:145:12: ( ',' expr )*
			try { dbg.enterSubRule(13);

			loop13:
			while (true) {
				int alt13=2;
				try { dbg.enterDecision(13, decisionCanBacktrack[13]);

				int LA13_0 = input.LA(1);
				if ( (LA13_0==72) ) {
					alt13=1;
				}

				} finally {dbg.exitDecision(13);}

				switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:145:13: ',' expr
					{
					dbg.location(145,13);
					char_literal71=(Token)match(input,72,FOLLOW_72_in_coord_list1194);  
					stream_72.add(char_literal71);
					dbg.location(145,17);
					pushFollow(FOLLOW_expr_in_coord_list1196);
					expr72=expr();
					state._fsp--;

					stream_expr.add(expr72.getTree());
					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}

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
			// 145:24: -> ^( COORD_LIST ( expr )+ )
			{
				dbg.location(145,27);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:145:27: ^( COORD_LIST ( expr )+ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(145,29);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COORD_LIST, "COORD_LIST"), root_1);
				dbg.location(145,40);
				if ( !(stream_expr.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expr.hasNext() ) {
					dbg.location(145,40);
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
		dbg.location(146, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:148:1: returning : 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) ;
	public final LeacParser.returning_return returning() throws RecognitionException {
		LeacParser.returning_return retval = new LeacParser.returning_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		ParserRuleReturnScope expr74 =null;

		Object string_literal73_tree=null;
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "returning");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(148, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:149:5: ( 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:149:7: 'return' ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			{
			dbg.location(149,7);
			string_literal73=(Token)match(input,103,FOLLOW_103_in_returning1224);  
			stream_103.add(string_literal73);
			dbg.location(150,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:150:9: ( -> ^( RETURNING NO_RETURN_VALUE ) | expr -> ^( RETURNING expr ) )
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==EOF||LA14_0==77||LA14_0==92||LA14_0==110) ) {
				alt14=1;
			}
			else if ( (LA14_0==BOOL||LA14_0==CHAR||LA14_0==FLOAT||LA14_0==IDF||LA14_0==INT||LA14_0==STRING||LA14_0==68||LA14_0==73||LA14_0==97) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:150:25: 
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
					// 150:25: -> ^( RETURNING NO_RETURN_VALUE )
					{
						dbg.location(150,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:150:28: ^( RETURNING NO_RETURN_VALUE )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(150,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						dbg.location(150,40);
						adaptor.addChild(root_1, (Object)adaptor.create(NO_RETURN_VALUE, "NO_RETURN_VALUE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:151:11: expr
					{
					dbg.location(151,11);
					pushFollow(FOLLOW_expr_in_returning1256);
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
					// 151:16: -> ^( RETURNING expr )
					{
						dbg.location(151,19);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:151:19: ^( RETURNING expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(151,21);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURNING, "RETURNING"), root_1);
						dbg.location(151,31);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

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
		dbg.location(153, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:155:1: affect_or_procedure_call : IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) ;
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
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try { dbg.enterRule(getGrammarFileName(), "affect_or_procedure_call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(155, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:156:5: ( IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:156:7: IDF ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			{
			dbg.location(156,7);
			IDF75=(Token)match(input,IDF,FOLLOW_IDF_in_affect_or_procedure_call1291);  
			stream_IDF.add(IDF75);
			dbg.location(157,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:157:9: ( ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr -> ^( AFFECT $affect_or_procedure_call expr ) | '(' arg_list ')' -> ^( PROCEDURE_CALL IDF arg_list ) )
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:158:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) '=' expr
					{
					dbg.location(158,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:158:13: ( -> ^( VAR IDF ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt15=2;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:158:29: 
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
							// 158:29: -> ^( VAR IDF )
							{
								dbg.location(158,32);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:158:32: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(158,34);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								dbg.location(158,38);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:159:15: '[' coord_list ']'
							{
							dbg.location(159,15);
							char_literal76=(Token)match(input,84,FOLLOW_84_in_affect_or_procedure_call1341);  
							stream_84.add(char_literal76);
							dbg.location(159,19);
							pushFollow(FOLLOW_coord_list_in_affect_or_procedure_call1343);
							coord_list77=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list77.getTree());dbg.location(159,30);
							char_literal78=(Token)match(input,85,FOLLOW_85_in_affect_or_procedure_call1345);  
							stream_85.add(char_literal78);

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
							// 159:34: -> ^( CELL IDF coord_list )
							{
								dbg.location(159,37);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:159:37: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(159,39);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								dbg.location(159,44);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(159,48);
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(161,13);
					char_literal79=(Token)match(input,80,FOLLOW_80_in_affect_or_procedure_call1383);  
					stream_80.add(char_literal79);
					dbg.location(161,17);
					pushFollow(FOLLOW_expr_in_affect_or_procedure_call1385);
					expr80=expr();
					state._fsp--;

					stream_expr.add(expr80.getTree());
					// AST REWRITE
					// elements: expr, affect_or_procedure_call
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 161:22: -> ^( AFFECT $affect_or_procedure_call expr )
					{
						dbg.location(161,25);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:161:25: ^( AFFECT $affect_or_procedure_call expr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(161,27);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AFFECT, "AFFECT"), root_1);
						dbg.location(161,35);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(161,60);
						adaptor.addChild(root_1, stream_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:162:11: '(' arg_list ')'
					{
					dbg.location(162,11);
					char_literal81=(Token)match(input,68,FOLLOW_68_in_affect_or_procedure_call1408);  
					stream_68.add(char_literal81);
					dbg.location(162,15);
					pushFollow(FOLLOW_arg_list_in_affect_or_procedure_call1410);
					arg_list82=arg_list();
					state._fsp--;

					stream_arg_list.add(arg_list82.getTree());dbg.location(162,24);
					char_literal83=(Token)match(input,69,FOLLOW_69_in_affect_or_procedure_call1412);  
					stream_69.add(char_literal83);

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
					// 162:28: -> ^( PROCEDURE_CALL IDF arg_list )
					{
						dbg.location(162,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:162:31: ^( PROCEDURE_CALL IDF arg_list )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(162,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE_CALL, "PROCEDURE_CALL"), root_1);
						dbg.location(162,48);
						adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(162,52);
						adaptor.addChild(root_1, stream_arg_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

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
		dbg.location(164, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:166:1: arg_list : ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) );
	public final LeacParser.arg_list_return arg_list() throws RecognitionException {
		LeacParser.arg_list_return retval = new LeacParser.arg_list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal85=null;
		ParserRuleReturnScope expr84 =null;
		ParserRuleReturnScope expr86 =null;

		Object char_literal85_tree=null;
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "arg_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(166, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:167:5: ( -> ^( ARG_LIST ) | expr ( ',' expr )* -> ^( ARG_LIST ( expr )+ ) )
			int alt18=2;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:167:21: 
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
					// 167:21: -> ^( ARG_LIST )
					{
						dbg.location(167,24);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:167:24: ^( ARG_LIST )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(167,26);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:168:7: expr ( ',' expr )*
					{
					dbg.location(168,7);
					pushFollow(FOLLOW_expr_in_arg_list1463);
					expr84=expr();
					state._fsp--;

					stream_expr.add(expr84.getTree());dbg.location(168,12);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:168:12: ( ',' expr )*
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==72) ) {
							alt17=1;
						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:168:13: ',' expr
							{
							dbg.location(168,13);
							char_literal85=(Token)match(input,72,FOLLOW_72_in_arg_list1466);  
							stream_72.add(char_literal85);
							dbg.location(168,17);
							pushFollow(FOLLOW_expr_in_arg_list1468);
							expr86=expr();
							state._fsp--;

							stream_expr.add(expr86.getTree());
							}
							break;

						default :
							break loop17;
						}
					}
					} finally {dbg.exitSubRule(17);}

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
					// 168:24: -> ^( ARG_LIST ( expr )+ )
					{
						dbg.location(168,27);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:168:27: ^( ARG_LIST ( expr )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(168,29);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ARG_LIST, "ARG_LIST"), root_1);
						dbg.location(168,38);
						if ( !(stream_expr.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expr.hasNext() ) {
							dbg.location(168,38);
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
		dbg.location(169, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:171:1: block : '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' ;
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
		RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(171, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:172:5: ( '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}' )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:172:7: '{' ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) ) '}'
			{
			dbg.location(172,7);
			char_literal87=(Token)match(input,109,FOLLOW_109_in_block1496);  
			stream_109.add(char_literal87);
			dbg.location(173,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:173:9: ( -> ^( BLOCK ) | statement ( ';' statement )* -> ^( BLOCK ( statement )+ ) )
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==110) ) {
				alt20=1;
			}
			else if ( (LA20_0==IDF||LA20_0==95||LA20_0==101||LA20_0==103||(LA20_0 >= 107 && LA20_0 <= 109)) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:173:25: 
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
					// 173:25: -> ^( BLOCK )
					{
						dbg.location(173,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:173:28: ^( BLOCK )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(173,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:174:11: statement ( ';' statement )*
					{
					dbg.location(174,11);
					pushFollow(FOLLOW_statement_in_block1526);
					statement88=statement();
					state._fsp--;

					stream_statement.add(statement88.getTree());dbg.location(174,21);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:174:21: ( ';' statement )*
					try { dbg.enterSubRule(19);

					loop19:
					while (true) {
						int alt19=2;
						try { dbg.enterDecision(19, decisionCanBacktrack[19]);

						int LA19_0 = input.LA(1);
						if ( (LA19_0==77) ) {
							alt19=1;
						}

						} finally {dbg.exitDecision(19);}

						switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:174:22: ';' statement
							{
							dbg.location(174,22);
							char_literal89=(Token)match(input,77,FOLLOW_77_in_block1529);  
							stream_77.add(char_literal89);
							dbg.location(174,26);
							pushFollow(FOLLOW_statement_in_block1531);
							statement90=statement();
							state._fsp--;

							stream_statement.add(statement90.getTree());
							}
							break;

						default :
							break loop19;
						}
					}
					} finally {dbg.exitSubRule(19);}

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
					// 174:38: -> ^( BLOCK ( statement )+ )
					{
						dbg.location(174,41);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:174:41: ^( BLOCK ( statement )+ )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(174,43);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);
						dbg.location(174,49);
						if ( !(stream_statement.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_statement.hasNext() ) {
							dbg.location(174,49);
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
			} finally {dbg.exitSubRule(20);}
			dbg.location(176,7);
			char_literal91=(Token)match(input,110,FOLLOW_110_in_block1560);  
			stream_110.add(char_literal91);

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
		dbg.location(177, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:179:1: read : 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) ;
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
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");

		try { dbg.enterRule(getGrammarFileName(), "read");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(179, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:180:5: ( 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:180:7: 'read' IDF ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			{
			dbg.location(180,7);
			string_literal92=(Token)match(input,101,FOLLOW_101_in_read1577);  
			stream_101.add(string_literal92);
			dbg.location(180,14);
			IDF93=(Token)match(input,IDF,FOLLOW_IDF_in_read1579);  
			stream_IDF.add(IDF93);
			dbg.location(181,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:181:9: ( -> ^( READ ^( VAR IDF ) ) | '[' coord_list ']' -> ^( READ ^( CELL IDF coord_list ) ) )
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==EOF||LA21_0==77||LA21_0==92||LA21_0==110) ) {
				alt21=1;
			}
			else if ( (LA21_0==84) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:181:25: 
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
					// 181:25: -> ^( READ ^( VAR IDF ) )
					{
						dbg.location(181,28);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:181:28: ^( READ ^( VAR IDF ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(181,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						dbg.location(181,35);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:181:35: ^( VAR IDF )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(181,37);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_2);
						dbg.location(181,41);
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:182:11: '[' coord_list ']'
					{
					dbg.location(182,11);
					char_literal94=(Token)match(input,84,FOLLOW_84_in_read1615);  
					stream_84.add(char_literal94);
					dbg.location(182,15);
					pushFollow(FOLLOW_coord_list_in_read1617);
					coord_list95=coord_list();
					state._fsp--;

					stream_coord_list.add(coord_list95.getTree());dbg.location(182,26);
					char_literal96=(Token)match(input,85,FOLLOW_85_in_read1619);  
					stream_85.add(char_literal96);

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
					// 182:30: -> ^( READ ^( CELL IDF coord_list ) )
					{
						dbg.location(182,33);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:182:33: ^( READ ^( CELL IDF coord_list ) )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(182,35);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(READ, "READ"), root_1);
						dbg.location(182,40);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:182:40: ^( CELL IDF coord_list )
						{
						Object root_2 = (Object)adaptor.nil();
						dbg.location(182,42);
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_2);
						dbg.location(182,47);
						adaptor.addChild(root_2, stream_IDF.nextNode());dbg.location(182,51);
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
		dbg.location(184, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:186:1: write : 'write' expr -> ^( WRITE expr ) ;
	public final LeacParser.write_return write() throws RecognitionException {
		LeacParser.write_return retval = new LeacParser.write_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		ParserRuleReturnScope expr98 =null;

		Object string_literal97_tree=null;
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "write");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:187:5: ( 'write' expr -> ^( WRITE expr ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:187:7: 'write' expr
			{
			dbg.location(187,7);
			string_literal97=(Token)match(input,108,FOLLOW_108_in_write1660);  
			stream_108.add(string_literal97);
			dbg.location(187,15);
			pushFollow(FOLLOW_expr_in_write1662);
			expr98=expr();
			state._fsp--;

			stream_expr.add(expr98.getTree());
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
			// 187:20: -> ^( WRITE expr )
			{
				dbg.location(187,23);
				// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:187:23: ^( WRITE expr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(187,25);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WRITE, "WRITE"), root_1);
				dbg.location(187,31);
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
		dbg.location(188, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:190:1: expr_0 : ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr );
	public final LeacParser.expr_0_return expr_0() throws RecognitionException {
		LeacParser.expr_0_return retval = new LeacParser.expr_0_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDF99=null;
		Token char_literal100=null;
		Token char_literal102=null;
		Token char_literal103=null;
		Token char_literal105=null;
		Token char_literal107=null;
		Token char_literal109=null;
		ParserRuleReturnScope arg_list101 =null;
		ParserRuleReturnScope coord_list104 =null;
		ParserRuleReturnScope constant106 =null;
		ParserRuleReturnScope expr108 =null;

		Object IDF99_tree=null;
		Object char_literal100_tree=null;
		Object char_literal102_tree=null;
		Object char_literal103_tree=null;
		Object char_literal105_tree=null;
		Object char_literal107_tree=null;
		Object char_literal109_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleTokenStream stream_IDF=new RewriteRuleTokenStream(adaptor,"token IDF");
		RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
		RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_coord_list=new RewriteRuleSubtreeStream(adaptor,"rule coord_list");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
		RewriteRuleSubtreeStream stream_arg_list=new RewriteRuleSubtreeStream(adaptor,"rule arg_list");

		try { dbg.enterRule(getGrammarFileName(), "expr_0");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(190, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:191:5: ( IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) ) | constant -> constant | '(' expr ')' -> expr )
			int alt23=3;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:191:7: IDF ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					{
					dbg.location(191,7);
					IDF99=(Token)match(input,IDF,FOLLOW_IDF_in_expr_01687);  
					stream_IDF.add(IDF99);
					dbg.location(192,9);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:192:9: ( -> ^( VAR IDF ) | '(' arg_list ')' -> ^( FUNC_CALL IDF arg_list ) | '[' coord_list ']' -> ^( CELL IDF coord_list ) )
					int alt22=3;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

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
					case 104:
					case 110:
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
						dbg.recognitionException(nvae);
						throw nvae;
					}
					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:192:25: 
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
							// 192:25: -> ^( VAR IDF )
							{
								dbg.location(192,28);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:192:28: ^( VAR IDF )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(192,30);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
								dbg.location(192,34);
								adaptor.addChild(root_1, stream_IDF.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:193:11: '(' arg_list ')'
							{
							dbg.location(193,11);
							char_literal100=(Token)match(input,68,FOLLOW_68_in_expr_01719);  
							stream_68.add(char_literal100);
							dbg.location(193,15);
							pushFollow(FOLLOW_arg_list_in_expr_01721);
							arg_list101=arg_list();
							state._fsp--;

							stream_arg_list.add(arg_list101.getTree());dbg.location(193,24);
							char_literal102=(Token)match(input,69,FOLLOW_69_in_expr_01723);  
							stream_69.add(char_literal102);

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
							// 193:28: -> ^( FUNC_CALL IDF arg_list )
							{
								dbg.location(193,31);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:193:31: ^( FUNC_CALL IDF arg_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(193,33);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);
								dbg.location(193,43);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(193,47);
								adaptor.addChild(root_1, stream_arg_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 3 :
							dbg.enterAlt(3);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:194:11: '[' coord_list ']'
							{
							dbg.location(194,11);
							char_literal103=(Token)match(input,84,FOLLOW_84_in_expr_01745);  
							stream_84.add(char_literal103);
							dbg.location(194,15);
							pushFollow(FOLLOW_coord_list_in_expr_01747);
							coord_list104=coord_list();
							state._fsp--;

							stream_coord_list.add(coord_list104.getTree());dbg.location(194,26);
							char_literal105=(Token)match(input,85,FOLLOW_85_in_expr_01749);  
							stream_85.add(char_literal105);

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
							// 194:30: -> ^( CELL IDF coord_list )
							{
								dbg.location(194,33);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:194:33: ^( CELL IDF coord_list )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(194,35);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CELL, "CELL"), root_1);
								dbg.location(194,40);
								adaptor.addChild(root_1, stream_IDF.nextNode());dbg.location(194,44);
								adaptor.addChild(root_1, stream_coord_list.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(22);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:196:7: constant
					{
					dbg.location(196,7);
					pushFollow(FOLLOW_constant_in_expr_01777);
					constant106=constant();
					state._fsp--;

					stream_constant.add(constant106.getTree());
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
					// 196:16: -> constant
					{
						dbg.location(196,19);
						adaptor.addChild(root_0, stream_constant.nextTree());
					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:197:7: '(' expr ')'
					{
					dbg.location(197,7);
					char_literal107=(Token)match(input,68,FOLLOW_68_in_expr_01789);  
					stream_68.add(char_literal107);
					dbg.location(197,11);
					pushFollow(FOLLOW_expr_in_expr_01791);
					expr108=expr();
					state._fsp--;

					stream_expr.add(expr108.getTree());dbg.location(197,16);
					char_literal109=(Token)match(input,69,FOLLOW_69_in_expr_01793);  
					stream_69.add(char_literal109);

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
					// 197:20: -> expr
					{
						dbg.location(197,23);
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
		dbg.location(198, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:200:1: expr_1 : ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? ;
	public final LeacParser.expr_1_return expr_1() throws RecognitionException {
		LeacParser.expr_1_return retval = new LeacParser.expr_1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal111=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_0110 =null;

		Object char_literal111_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expr_1_proxy=new RewriteRuleSubtreeStream(adaptor,"rule expr_1_proxy");
		RewriteRuleSubtreeStream stream_expr_0=new RewriteRuleSubtreeStream(adaptor,"rule expr_0");

		try { dbg.enterRule(getGrammarFileName(), "expr_1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(200, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:201:5: ( ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )? )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:201:7: ( expr_0 -> expr_0 ) ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			{
			dbg.location(201,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:201:7: ( expr_0 -> expr_0 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:201:8: expr_0
			{
			dbg.location(201,8);
			pushFollow(FOLLOW_expr_0_in_expr_11815);
			expr_0110=expr_0();
			state._fsp--;

			stream_expr_0.add(expr_0110.getTree());
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
			// 201:15: -> expr_0
			{
				dbg.location(201,18);
				adaptor.addChild(root_0, stream_expr_0.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(202,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:202:9: ( '^' next= expr_1_proxy -> ^( POW $expr_1 $next) )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==86) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:202:11: '^' next= expr_1_proxy
					{
					dbg.location(202,11);
					char_literal111=(Token)match(input,86,FOLLOW_86_in_expr_11832);  
					stream_86.add(char_literal111);
					dbg.location(202,19);
					pushFollow(FOLLOW_expr_1_proxy_in_expr_11836);
					next=expr_1_proxy();
					state._fsp--;

					stream_expr_1_proxy.add(next.getTree());
					// AST REWRITE
					// elements: next, expr_1
					// token labels: 
					// rule labels: next, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_next=new RewriteRuleSubtreeStream(adaptor,"rule next",next!=null?next.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 202:33: -> ^( POW $expr_1 $next)
					{
						dbg.location(202,36);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:202:36: ^( POW $expr_1 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(202,38);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(POW, "POW"), root_1);
						dbg.location(202,43);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(202,51);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

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
		dbg.location(204, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:205:1: expr_1_proxy : expr_1 -> expr_1 ;
	public final LeacParser.expr_1_proxy_return expr_1_proxy() throws RecognitionException {
		LeacParser.expr_1_proxy_return retval = new LeacParser.expr_1_proxy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_1112 =null;

		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try { dbg.enterRule(getGrammarFileName(), "expr_1_proxy");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(205, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:206:5: ( expr_1 -> expr_1 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:206:7: expr_1
			{
			dbg.location(206,7);
			pushFollow(FOLLOW_expr_1_in_expr_1_proxy1875);
			expr_1112=expr_1();
			state._fsp--;

			stream_expr_1.add(expr_1112.getTree());
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
			// 206:14: -> expr_1
			{
				dbg.location(206,17);
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
		dbg.location(207, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:209:1: expr_2 : ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 );
	public final LeacParser.expr_2_return expr_2() throws RecognitionException {
		LeacParser.expr_2_return retval = new LeacParser.expr_2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal113=null;
		Token string_literal115=null;
		ParserRuleReturnScope expr_1114 =null;
		ParserRuleReturnScope expr_1116 =null;
		ParserRuleReturnScope expr_1117 =null;

		Object char_literal113_tree=null;
		Object string_literal115_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleSubtreeStream stream_expr_1=new RewriteRuleSubtreeStream(adaptor,"rule expr_1");

		try { dbg.enterRule(getGrammarFileName(), "expr_2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(209, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:210:5: ( '-' expr_1 -> ^( UNARY_MINUS expr_1 ) | 'not' expr_1 -> ^( NOT expr_1 ) | expr_1 -> expr_1 )
			int alt25=3;
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:210:7: '-' expr_1
					{
					dbg.location(210,7);
					char_literal113=(Token)match(input,73,FOLLOW_73_in_expr_21896);  
					stream_73.add(char_literal113);
					dbg.location(210,11);
					pushFollow(FOLLOW_expr_1_in_expr_21898);
					expr_1114=expr_1();
					state._fsp--;

					stream_expr_1.add(expr_1114.getTree());
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
					// 210:18: -> ^( UNARY_MINUS expr_1 )
					{
						dbg.location(210,21);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:210:21: ^( UNARY_MINUS expr_1 )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(210,23);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						dbg.location(210,35);
						adaptor.addChild(root_1, stream_expr_1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:211:7: 'not' expr_1
					{
					dbg.location(211,7);
					string_literal115=(Token)match(input,97,FOLLOW_97_in_expr_21914);  
					stream_97.add(string_literal115);
					dbg.location(211,13);
					pushFollow(FOLLOW_expr_1_in_expr_21916);
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
					// 211:20: -> ^( NOT expr_1 )
					{
						dbg.location(211,23);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:211:23: ^( NOT expr_1 )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(211,25);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
						dbg.location(211,29);
						adaptor.addChild(root_1, stream_expr_1.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:212:7: expr_1
					{
					dbg.location(212,7);
					pushFollow(FOLLOW_expr_1_in_expr_21932);
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
					// 212:14: -> expr_1
					{
						dbg.location(212,17);
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
		dbg.location(213, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:215:1: expr_3 : ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* ;
	public final LeacParser.expr_3_return expr_3() throws RecognitionException {
		LeacParser.expr_3_return retval = new LeacParser.expr_3_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token char_literal120=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_2118 =null;

		Object char_literal119_tree=null;
		Object char_literal120_tree=null;
		RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_expr_2=new RewriteRuleSubtreeStream(adaptor,"rule expr_2");

		try { dbg.enterRule(getGrammarFileName(), "expr_3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(215, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:216:5: ( ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:216:7: ( expr_2 -> expr_2 ) ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			{
			dbg.location(216,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:216:7: ( expr_2 -> expr_2 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:216:8: expr_2
			{
			dbg.location(216,8);
			pushFollow(FOLLOW_expr_2_in_expr_31954);
			expr_2118=expr_2();
			state._fsp--;

			stream_expr_2.add(expr_2118.getTree());
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
			// 216:15: -> expr_2
			{
				dbg.location(216,18);
				adaptor.addChild(root_0, stream_expr_2.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(217,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:217:9: ( '*' next= expr_2 -> ^( MUL $expr_3 $next) | '/' next= expr_2 -> ^( DIV $expr_3 $next) )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=3;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==70) ) {
					alt26=1;
				}
				else if ( (LA26_0==75) ) {
					alt26=2;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:217:11: '*' next= expr_2
					{
					dbg.location(217,11);
					char_literal119=(Token)match(input,70,FOLLOW_70_in_expr_31971);  
					stream_70.add(char_literal119);
					dbg.location(217,19);
					pushFollow(FOLLOW_expr_2_in_expr_31975);
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
					// 217:27: -> ^( MUL $expr_3 $next)
					{
						dbg.location(217,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:217:30: ^( MUL $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(217,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(MUL, "MUL"), root_1);
						dbg.location(217,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(217,45);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:218:11: '/' next= expr_2
					{
					dbg.location(218,11);
					char_literal120=(Token)match(input,75,FOLLOW_75_in_expr_31999);  
					stream_75.add(char_literal120);
					dbg.location(218,19);
					pushFollow(FOLLOW_expr_2_in_expr_32003);
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
					// 218:27: -> ^( DIV $expr_3 $next)
					{
						dbg.location(218,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:218:30: ^( DIV $expr_3 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(218,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DIV, "DIV"), root_1);
						dbg.location(218,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(218,45);
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
			} finally {dbg.exitSubRule(26);}

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
		dbg.location(220, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:222:1: expr_4 : ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* ;
	public final LeacParser.expr_4_return expr_4() throws RecognitionException {
		LeacParser.expr_4_return retval = new LeacParser.expr_4_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal122=null;
		Token char_literal123=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_3121 =null;

		Object char_literal122_tree=null;
		Object char_literal123_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_expr_3=new RewriteRuleSubtreeStream(adaptor,"rule expr_3");

		try { dbg.enterRule(getGrammarFileName(), "expr_4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(222, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:223:5: ( ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:223:7: ( expr_3 -> expr_3 ) ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			{
			dbg.location(223,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:223:7: ( expr_3 -> expr_3 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:223:8: expr_3
			{
			dbg.location(223,8);
			pushFollow(FOLLOW_expr_3_in_expr_42044);
			expr_3121=expr_3();
			state._fsp--;

			stream_expr_3.add(expr_3121.getTree());
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
			// 223:15: -> expr_3
			{
				dbg.location(223,18);
				adaptor.addChild(root_0, stream_expr_3.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(224,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:224:9: ( '+' next= expr_3 -> ^( ADD $expr_4 $next) | '-' next= expr_3 -> ^( SUB $expr_4 $next) )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=3;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==71) ) {
					alt27=1;
				}
				else if ( (LA27_0==73) ) {
					alt27=2;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:224:11: '+' next= expr_3
					{
					dbg.location(224,11);
					char_literal122=(Token)match(input,71,FOLLOW_71_in_expr_42061);  
					stream_71.add(char_literal122);
					dbg.location(224,19);
					pushFollow(FOLLOW_expr_3_in_expr_42065);
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
					// 224:27: -> ^( ADD $expr_4 $next)
					{
						dbg.location(224,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:224:30: ^( ADD $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(224,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ADD, "ADD"), root_1);
						dbg.location(224,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(224,45);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:225:11: '-' next= expr_3
					{
					dbg.location(225,11);
					char_literal123=(Token)match(input,73,FOLLOW_73_in_expr_42089);  
					stream_73.add(char_literal123);
					dbg.location(225,19);
					pushFollow(FOLLOW_expr_3_in_expr_42093);
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
					// 225:27: -> ^( SUB $expr_4 $next)
					{
						dbg.location(225,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:225:30: ^( SUB $expr_4 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(225,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUB, "SUB"), root_1);
						dbg.location(225,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(225,45);
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
		dbg.location(227, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:229:1: expr_5 : ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* ;
	public final LeacParser.expr_5_return expr_5() throws RecognitionException {
		LeacParser.expr_5_return retval = new LeacParser.expr_5_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal125=null;
		Token string_literal126=null;
		Token char_literal127=null;
		Token string_literal128=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_4124 =null;

		Object char_literal125_tree=null;
		Object string_literal126_tree=null;
		Object char_literal127_tree=null;
		Object string_literal128_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleSubtreeStream stream_expr_4=new RewriteRuleSubtreeStream(adaptor,"rule expr_4");

		try { dbg.enterRule(getGrammarFileName(), "expr_5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(229, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:230:5: ( ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:230:7: ( expr_4 -> expr_4 ) ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			{
			dbg.location(230,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:230:7: ( expr_4 -> expr_4 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:230:8: expr_4
			{
			dbg.location(230,8);
			pushFollow(FOLLOW_expr_4_in_expr_52134);
			expr_4124=expr_4();
			state._fsp--;

			stream_expr_4.add(expr_4124.getTree());
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
			// 230:15: -> expr_4
			{
				dbg.location(230,18);
				adaptor.addChild(root_0, stream_expr_4.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(231,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:231:9: ( '<' next= expr_4 -> ^( TEST_LT $expr_5 $next) | '<=' next= expr_4 -> ^( TEST_LE $expr_5 $next) | '>' next= expr_4 -> ^( TEST_GT $expr_5 $next) | '>=' next= expr_4 -> ^( TEST_GE $expr_5 $next) )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=5;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

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
				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:231:11: '<' next= expr_4
					{
					dbg.location(231,11);
					char_literal125=(Token)match(input,78,FOLLOW_78_in_expr_52151);  
					stream_78.add(char_literal125);
					dbg.location(231,19);
					pushFollow(FOLLOW_expr_4_in_expr_52155);
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
					// 231:27: -> ^( TEST_LT $expr_5 $next)
					{
						dbg.location(231,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:231:30: ^( TEST_LT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(231,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LT, "TEST_LT"), root_1);
						dbg.location(231,41);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(231,49);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:232:11: '<=' next= expr_4
					{
					dbg.location(232,11);
					string_literal126=(Token)match(input,79,FOLLOW_79_in_expr_52179);  
					stream_79.add(string_literal126);
					dbg.location(232,20);
					pushFollow(FOLLOW_expr_4_in_expr_52183);
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
					// 232:28: -> ^( TEST_LE $expr_5 $next)
					{
						dbg.location(232,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:232:31: ^( TEST_LE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(232,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_LE, "TEST_LE"), root_1);
						dbg.location(232,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(232,50);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:233:11: '>' next= expr_4
					{
					dbg.location(233,11);
					char_literal127=(Token)match(input,82,FOLLOW_82_in_expr_52207);  
					stream_82.add(char_literal127);
					dbg.location(233,19);
					pushFollow(FOLLOW_expr_4_in_expr_52211);
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
					// 233:27: -> ^( TEST_GT $expr_5 $next)
					{
						dbg.location(233,30);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:233:30: ^( TEST_GT $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(233,32);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GT, "TEST_GT"), root_1);
						dbg.location(233,41);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(233,49);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:234:11: '>=' next= expr_4
					{
					dbg.location(234,11);
					string_literal128=(Token)match(input,83,FOLLOW_83_in_expr_52235);  
					stream_83.add(string_literal128);
					dbg.location(234,20);
					pushFollow(FOLLOW_expr_4_in_expr_52239);
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
					// 234:28: -> ^( TEST_GE $expr_5 $next)
					{
						dbg.location(234,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:234:31: ^( TEST_GE $expr_5 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(234,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_GE, "TEST_GE"), root_1);
						dbg.location(234,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(234,50);
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
		dbg.location(236, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:238:1: expr_6 : ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* ;
	public final LeacParser.expr_6_return expr_6() throws RecognitionException {
		LeacParser.expr_6_return retval = new LeacParser.expr_6_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal130=null;
		Token string_literal131=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_5129 =null;

		Object string_literal130_tree=null;
		Object string_literal131_tree=null;
		RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
		RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
		RewriteRuleSubtreeStream stream_expr_5=new RewriteRuleSubtreeStream(adaptor,"rule expr_5");

		try { dbg.enterRule(getGrammarFileName(), "expr_6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(238, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:239:5: ( ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:239:7: ( expr_5 -> expr_5 ) ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			{
			dbg.location(239,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:239:7: ( expr_5 -> expr_5 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:239:8: expr_5
			{
			dbg.location(239,8);
			pushFollow(FOLLOW_expr_5_in_expr_62280);
			expr_5129=expr_5();
			state._fsp--;

			stream_expr_5.add(expr_5129.getTree());
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
			// 239:15: -> expr_5
			{
				dbg.location(239,18);
				adaptor.addChild(root_0, stream_expr_5.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(240,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:240:9: ( '==' next= expr_5 -> ^( TEST_EQ $expr_6 $next) | '!=' next= expr_5 -> ^( TEST_NE $expr_6 $next) )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=3;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==81) ) {
					alt29=1;
				}
				else if ( (LA29_0==67) ) {
					alt29=2;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:240:11: '==' next= expr_5
					{
					dbg.location(240,11);
					string_literal130=(Token)match(input,81,FOLLOW_81_in_expr_62297);  
					stream_81.add(string_literal130);
					dbg.location(240,20);
					pushFollow(FOLLOW_expr_5_in_expr_62301);
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
					// 240:28: -> ^( TEST_EQ $expr_6 $next)
					{
						dbg.location(240,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:240:31: ^( TEST_EQ $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(240,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_EQ, "TEST_EQ"), root_1);
						dbg.location(240,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(240,50);
						adaptor.addChild(root_1, stream_next.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:241:11: '!=' next= expr_5
					{
					dbg.location(241,11);
					string_literal131=(Token)match(input,67,FOLLOW_67_in_expr_62325);  
					stream_67.add(string_literal131);
					dbg.location(241,20);
					pushFollow(FOLLOW_expr_5_in_expr_62329);
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
					// 241:28: -> ^( TEST_NE $expr_6 $next)
					{
						dbg.location(241,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:241:31: ^( TEST_NE $expr_6 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(241,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TEST_NE, "TEST_NE"), root_1);
						dbg.location(241,42);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(241,50);
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
		dbg.location(243, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:245:1: expr_7 : ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* ;
	public final LeacParser.expr_7_return expr_7() throws RecognitionException {
		LeacParser.expr_7_return retval = new LeacParser.expr_7_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal133=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_6132 =null;

		Object string_literal133_tree=null;
		RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
		RewriteRuleSubtreeStream stream_expr_6=new RewriteRuleSubtreeStream(adaptor,"rule expr_6");

		try { dbg.enterRule(getGrammarFileName(), "expr_7");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(245, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:246:5: ( ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:246:7: ( expr_6 -> expr_6 ) ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			{
			dbg.location(246,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:246:7: ( expr_6 -> expr_6 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:246:8: expr_6
			{
			dbg.location(246,8);
			pushFollow(FOLLOW_expr_6_in_expr_72370);
			expr_6132=expr_6();
			state._fsp--;

			stream_expr_6.add(expr_6132.getTree());
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
			// 246:15: -> expr_6
			{
				dbg.location(246,18);
				adaptor.addChild(root_0, stream_expr_6.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(247,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:247:9: ( 'and' next= expr_6 -> ^( AND $expr_7 $next) )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==87) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:247:11: 'and' next= expr_6
					{
					dbg.location(247,11);
					string_literal133=(Token)match(input,87,FOLLOW_87_in_expr_72387);  
					stream_87.add(string_literal133);
					dbg.location(247,21);
					pushFollow(FOLLOW_expr_6_in_expr_72391);
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
					// 247:29: -> ^( AND $expr_7 $next)
					{
						dbg.location(247,32);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:247:32: ^( AND $expr_7 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(247,34);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);
						dbg.location(247,39);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(247,47);
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
		dbg.location(249, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:251:1: expr_8 : ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* ;
	public final LeacParser.expr_8_return expr_8() throws RecognitionException {
		LeacParser.expr_8_return retval = new LeacParser.expr_8_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal135=null;
		ParserRuleReturnScope next =null;
		ParserRuleReturnScope expr_7134 =null;

		Object string_literal135_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_expr_7=new RewriteRuleSubtreeStream(adaptor,"rule expr_7");

		try { dbg.enterRule(getGrammarFileName(), "expr_8");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(251, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:252:5: ( ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:252:7: ( expr_7 -> expr_7 ) ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			{
			dbg.location(252,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:252:7: ( expr_7 -> expr_7 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:252:8: expr_7
			{
			dbg.location(252,8);
			pushFollow(FOLLOW_expr_7_in_expr_82432);
			expr_7134=expr_7();
			state._fsp--;

			stream_expr_7.add(expr_7134.getTree());
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
			// 252:15: -> expr_7
			{
				dbg.location(252,18);
				adaptor.addChild(root_0, stream_expr_7.nextTree());
			}


			retval.tree = root_0;

			}
			dbg.location(253,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:253:9: ( 'or' next= expr_7 -> ^( OR $expr_8 $next) )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==99) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:253:11: 'or' next= expr_7
					{
					dbg.location(253,11);
					string_literal135=(Token)match(input,99,FOLLOW_99_in_expr_82449);  
					stream_99.add(string_literal135);
					dbg.location(253,20);
					pushFollow(FOLLOW_expr_7_in_expr_82453);
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
					// 253:28: -> ^( OR $expr_8 $next)
					{
						dbg.location(253,31);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:253:31: ^( OR $expr_8 $next)
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(253,33);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);
						dbg.location(253,37);
						adaptor.addChild(root_1, stream_retval.nextTree());dbg.location(253,45);
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
		dbg.location(255, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:257:1: expr : expr_8 -> expr_8 ;
	public final LeacParser.expr_return expr() throws RecognitionException {
		LeacParser.expr_return retval = new LeacParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr_8136 =null;

		RewriteRuleSubtreeStream stream_expr_8=new RewriteRuleSubtreeStream(adaptor,"rule expr_8");

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(257, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:258:5: ( expr_8 -> expr_8 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:258:7: expr_8
			{
			dbg.location(258,7);
			pushFollow(FOLLOW_expr_8_in_expr2493);
			expr_8136=expr_8();
			state._fsp--;

			stream_expr_8.add(expr_8136.getTree());
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
			// 258:14: -> expr_8
			{
				dbg.location(258,17);
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
		dbg.location(259, 4);

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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:261:1: constant : ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_return constant() throws RecognitionException {
		LeacParser.constant_return retval = new LeacParser.constant_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INT137=null;
		Token FLOAT138=null;
		Token BOOL139=null;
		Token STRING140=null;
		Token CHAR141=null;

		Object INT137_tree=null;
		Object FLOAT138_tree=null;
		Object BOOL139_tree=null;
		Object STRING140_tree=null;
		Object CHAR141_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(261, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:262:5: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt32=5;
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:262:7: INT
					{
					dbg.location(262,7);
					INT137=(Token)match(input,INT,FOLLOW_INT_in_constant2514);  
					stream_INT.add(INT137);

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
					// 262:11: -> ^( CONST INT_TYPENAME INT )
					{
						dbg.location(262,14);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:262:14: ^( CONST INT_TYPENAME INT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(262,16);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(262,22);
						adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));dbg.location(262,35);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:263:7: FLOAT
					{
					dbg.location(263,7);
					FLOAT138=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant2532);  
					stream_FLOAT.add(FLOAT138);

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
					// 263:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						dbg.location(263,16);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:263:16: ^( CONST FLOAT_TYPENAME FLOAT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(263,18);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(263,24);
						adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));dbg.location(263,39);
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:264:7: BOOL
					{
					dbg.location(264,7);
					BOOL139=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant2550);  
					stream_BOOL.add(BOOL139);

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
					// 264:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						dbg.location(264,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:264:15: ^( CONST BOOL_TYPENAME BOOL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(264,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(264,23);
						adaptor.addChild(root_1, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));dbg.location(264,37);
						adaptor.addChild(root_1, stream_BOOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:265:7: STRING
					{
					dbg.location(265,7);
					STRING140=(Token)match(input,STRING,FOLLOW_STRING_in_constant2568);  
					stream_STRING.add(STRING140);

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
					// 265:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						dbg.location(265,17);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:265:17: ^( CONST STRING_TYPENAME STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(265,19);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(265,25);
						adaptor.addChild(root_1, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));dbg.location(265,41);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:266:7: CHAR
					{
					dbg.location(266,7);
					CHAR141=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant2586);  
					stream_CHAR.add(CHAR141);

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
					// 266:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						dbg.location(266,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:266:15: ^( CONST CHAR_TYPENAME CHAR )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(266,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(266,23);
						adaptor.addChild(root_1, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));dbg.location(266,37);
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
		dbg.location(267, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
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
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:269:1: constant_ext : ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) );
	public final LeacParser.constant_ext_return constant_ext() throws RecognitionException {
		LeacParser.constant_ext_return retval = new LeacParser.constant_ext_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal142=null;
		Token INT143=null;
		Token FLOAT144=null;
		Token INT145=null;
		Token FLOAT146=null;
		Token BOOL147=null;
		Token STRING148=null;
		Token CHAR149=null;

		Object char_literal142_tree=null;
		Object INT143_tree=null;
		Object FLOAT144_tree=null;
		Object INT145_tree=null;
		Object FLOAT146_tree=null;
		Object BOOL147_tree=null;
		Object STRING148_tree=null;
		Object CHAR149_tree=null;
		RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
		RewriteRuleTokenStream stream_BOOL=new RewriteRuleTokenStream(adaptor,"token BOOL");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_CHAR=new RewriteRuleTokenStream(adaptor,"token CHAR");
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

		try { dbg.enterRule(getGrammarFileName(), "constant_ext");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(269, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:270:5: ( '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) ) | INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) | BOOL -> ^( CONST BOOL_TYPENAME BOOL ) | STRING -> ^( CONST STRING_TYPENAME STRING ) | CHAR -> ^( CONST CHAR_TYPENAME CHAR ) )
			int alt34=6;
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

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
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:270:7: '-' ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					{
					dbg.location(270,7);
					char_literal142=(Token)match(input,73,FOLLOW_73_in_constant_ext2613);  
					stream_73.add(char_literal142);
					dbg.location(271,9);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:271:9: ( INT -> ^( CONST INT_TYPENAME INT ) | FLOAT -> ^( CONST FLOAT_TYPENAME FLOAT ) )
					int alt33=2;
					try { dbg.enterSubRule(33);
					try { dbg.enterDecision(33, decisionCanBacktrack[33]);

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
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(33);}

					switch (alt33) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:271:11: INT
							{
							dbg.location(271,11);
							INT143=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2625);  
							stream_INT.add(INT143);
							dbg.location(271,15);
							 INT143.setText("-" + INT143.getText()); 
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
							// 271:55: -> ^( CONST INT_TYPENAME INT )
							{
								dbg.location(271,58);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:271:58: ^( CONST INT_TYPENAME INT )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(271,60);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
								dbg.location(271,66);
								adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));dbg.location(271,79);
								adaptor.addChild(root_1, stream_INT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:272:11: FLOAT
							{
							dbg.location(272,11);
							FLOAT144=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2649);  
							stream_FLOAT.add(FLOAT144);
							dbg.location(272,17);
							 FLOAT144.setText("-" + FLOAT144.getText()); 
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
							// 272:61: -> ^( CONST FLOAT_TYPENAME FLOAT )
							{
								dbg.location(272,64);
								// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:272:64: ^( CONST FLOAT_TYPENAME FLOAT )
								{
								Object root_1 = (Object)adaptor.nil();
								dbg.location(272,66);
								root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
								dbg.location(272,72);
								adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));dbg.location(272,87);
								adaptor.addChild(root_1, stream_FLOAT.nextNode());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;

							}
							break;

					}
					} finally {dbg.exitSubRule(33);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:274:7: INT
					{
					dbg.location(274,7);
					INT145=(Token)match(input,INT,FOLLOW_INT_in_constant_ext2679);  
					stream_INT.add(INT145);

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
					// 274:11: -> ^( CONST INT_TYPENAME INT )
					{
						dbg.location(274,14);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:274:14: ^( CONST INT_TYPENAME INT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(274,16);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(274,22);
						adaptor.addChild(root_1, (Object)adaptor.create(INT_TYPENAME, "INT_TYPENAME"));dbg.location(274,35);
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:275:7: FLOAT
					{
					dbg.location(275,7);
					FLOAT146=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant_ext2697);  
					stream_FLOAT.add(FLOAT146);

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
					// 275:13: -> ^( CONST FLOAT_TYPENAME FLOAT )
					{
						dbg.location(275,16);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:275:16: ^( CONST FLOAT_TYPENAME FLOAT )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(275,18);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(275,24);
						adaptor.addChild(root_1, (Object)adaptor.create(FLOAT_TYPENAME, "FLOAT_TYPENAME"));dbg.location(275,39);
						adaptor.addChild(root_1, stream_FLOAT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:276:7: BOOL
					{
					dbg.location(276,7);
					BOOL147=(Token)match(input,BOOL,FOLLOW_BOOL_in_constant_ext2715);  
					stream_BOOL.add(BOOL147);

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
					// 276:12: -> ^( CONST BOOL_TYPENAME BOOL )
					{
						dbg.location(276,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:276:15: ^( CONST BOOL_TYPENAME BOOL )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(276,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(276,23);
						adaptor.addChild(root_1, (Object)adaptor.create(BOOL_TYPENAME, "BOOL_TYPENAME"));dbg.location(276,37);
						adaptor.addChild(root_1, stream_BOOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:277:7: STRING
					{
					dbg.location(277,7);
					STRING148=(Token)match(input,STRING,FOLLOW_STRING_in_constant_ext2733);  
					stream_STRING.add(STRING148);

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
					// 277:14: -> ^( CONST STRING_TYPENAME STRING )
					{
						dbg.location(277,17);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:277:17: ^( CONST STRING_TYPENAME STRING )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(277,19);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(277,25);
						adaptor.addChild(root_1, (Object)adaptor.create(STRING_TYPENAME, "STRING_TYPENAME"));dbg.location(277,41);
						adaptor.addChild(root_1, stream_STRING.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:278:7: CHAR
					{
					dbg.location(278,7);
					CHAR149=(Token)match(input,CHAR,FOLLOW_CHAR_in_constant_ext2751);  
					stream_CHAR.add(CHAR149);

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
					// 278:12: -> ^( CONST CHAR_TYPENAME CHAR )
					{
						dbg.location(278,15);
						// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/src/main/java/Leac.g:278:15: ^( CONST CHAR_TYPENAME CHAR )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(278,17);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONST, "CONST"), root_1);
						dbg.location(278,23);
						adaptor.addChild(root_1, (Object)adaptor.create(CHAR_TYPENAME, "CHAR_TYPENAME"));dbg.location(278,37);
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
		dbg.location(279, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant_ext");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "constant_ext"

	// Delegated rules



	public static final BitSet FOLLOW_100_in_program400 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_program402 = new BitSet(new long[]{0x0000000080000000L,0x00003AA0C0000000L});
	public static final BitSet FOLLOW_var_decl_list_in_program404 = new BitSet(new long[]{0x0000000080000000L,0x000038A0C0000000L});
	public static final BitSet FOLLOW_func_decl_list_in_program406 = new BitSet(new long[]{0x0000000080000000L,0x000038A080000000L});
	public static final BitSet FOLLOW_statement_in_program408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_var_decl_list439 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_105_in_var_decl465 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_idf_list_in_var_decl467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_var_decl469 = new BitSet(new long[]{0x0000000000000000L,0x0000040127000000L});
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
	public static final BitSet FOLLOW_76_in_func_decl568 = new BitSet(new long[]{0x0000000000000000L,0x0000040126000000L});
	public static final BitSet FOLLOW_atom_typename_in_func_decl570 = new BitSet(new long[]{0x0000000000000000L,0x0000220000000000L});
	public static final BitSet FOLLOW_var_decl_list_in_func_decl572 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_block_in_func_decl574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_typename_in_typename607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_typename_in_typename623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_atom_typename644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_atom_typename656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_96_in_atom_typename668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_93_in_atom_typename680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_90_in_atom_typename692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_88_in_array_typename713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_array_typename715 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_range_list_in_array_typename717 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_array_typename719 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_array_typename721 = new BitSet(new long[]{0x0000000000000000L,0x0000040126000000L});
	public static final BitSet FOLLOW_atom_typename_in_array_typename723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_range_list750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_range_list753 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_range_in_range_list755 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_int_ext_in_range784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_74_in_range786 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_int_ext_in_range790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_int_ext819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_int_ext831 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_INT_in_int_ext833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list870 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_param_list873 = new BitSet(new long[]{0x0000000080000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_param_in_param_list875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_IDF_in_param902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_param904 = new BitSet(new long[]{0x0000000000000000L,0x0000040127000000L});
	public static final BitSet FOLLOW_typename_in_param906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_param926 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_param928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_param930 = new BitSet(new long[]{0x0000000000000000L,0x0000040127000000L});
	public static final BitSet FOLLOW_typename_in_param932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_statement973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_or_procedure_call_in_statement985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returning_in_statement997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_in_statement1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_95_in_conditional1054 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_conditional1056 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_conditional1058 = new BitSet(new long[]{0x0000000080000000L,0x000038A080000000L});
	public static final BitSet FOLLOW_statement_in_conditional1062 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_92_in_conditional1086 = new BitSet(new long[]{0x0000000080000000L,0x000038A080000000L});
	public static final BitSet FOLLOW_statement_in_conditional1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_loop1158 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_loop1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_loop1162 = new BitSet(new long[]{0x0000000080000000L,0x000038A080000000L});
	public static final BitSet FOLLOW_statement_in_loop1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_coord_list1191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_coord_list1194 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_coord_list1196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_103_in_returning1224 = new BitSet(new long[]{0x0004000282010802L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_returning1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_affect_or_procedure_call1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000110010L});
	public static final BitSet FOLLOW_84_in_affect_or_procedure_call1341 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_affect_or_procedure_call1343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_affect_or_procedure_call1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_80_in_affect_or_procedure_call1383 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_affect_or_procedure_call1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_affect_or_procedure_call1408 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000230L});
	public static final BitSet FOLLOW_arg_list_in_affect_or_procedure_call1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_affect_or_procedure_call1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list1463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_arg_list1466 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_arg_list1468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
	public static final BitSet FOLLOW_109_in_block1496 = new BitSet(new long[]{0x0000000080000000L,0x000078A080000000L});
	public static final BitSet FOLLOW_statement_in_block1526 = new BitSet(new long[]{0x0000000000000000L,0x0000400000002000L});
	public static final BitSet FOLLOW_77_in_block1529 = new BitSet(new long[]{0x0000000080000000L,0x000038A080000000L});
	public static final BitSet FOLLOW_statement_in_block1531 = new BitSet(new long[]{0x0000000000000000L,0x0000400000002000L});
	public static final BitSet FOLLOW_110_in_block1560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_read1577 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_IDF_in_read1579 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_84_in_read1615 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_read1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_read1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_write1660 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_write1662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_expr_01687 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100010L});
	public static final BitSet FOLLOW_68_in_expr_01719 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000230L});
	public static final BitSet FOLLOW_arg_list_in_expr_01721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_expr_01723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_84_in_expr_01745 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_coord_list_in_expr_01747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_85_in_expr_01749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_01777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_expr_01789 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_in_expr_01791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_expr_01793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_0_in_expr_11815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expr_11832 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_proxy_in_expr_11836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_1_proxy1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_expr_21896 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_in_expr_21898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_97_in_expr_21914 = new BitSet(new long[]{0x0004000282010800L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_1_in_expr_21916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_21932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr_31954 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_70_in_expr_31971 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_2_in_expr_31975 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_75_in_expr_31999 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_2_in_expr_32003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000840L});
	public static final BitSet FOLLOW_expr_3_in_expr_42044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_71_in_expr_42061 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_3_in_expr_42065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_73_in_expr_42089 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_3_in_expr_42093 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
	public static final BitSet FOLLOW_expr_4_in_expr_52134 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_78_in_expr_52151 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52155 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_79_in_expr_52179 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52183 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_82_in_expr_52207 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52211 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_83_in_expr_52235 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_4_in_expr_52239 = new BitSet(new long[]{0x0000000000000002L,0x00000000000CC000L});
	public static final BitSet FOLLOW_expr_5_in_expr_62280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_81_in_expr_62297 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_5_in_expr_62301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_67_in_expr_62325 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_5_in_expr_62329 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020008L});
	public static final BitSet FOLLOW_expr_6_in_expr_72370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_expr_72387 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_6_in_expr_72391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
	public static final BitSet FOLLOW_expr_7_in_expr_82432 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_expr_82449 = new BitSet(new long[]{0x0004000282010800L,0x0000000200000210L});
	public static final BitSet FOLLOW_expr_7_in_expr_82453 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_expr_8_in_expr2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant2532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant2550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant2586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_constant_ext2613 = new BitSet(new long[]{0x0000000202000000L});
	public static final BitSet FOLLOW_INT_in_constant_ext2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_constant_ext2679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constant_ext2697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_in_constant_ext2715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_constant_ext2733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_constant_ext2751 = new BitSet(new long[]{0x0000000000000002L});
}
