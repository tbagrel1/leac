// $ANTLR null /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g 2020-01-15 15:14:49

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class leacParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOL", "CHAR", "COMMENT", "ESC_SEQ", 
		"EXPONENT", "FLOAT", "HEX_DIGIT", "IDF", "INT", "OCTAL_ESC", "STRING", 
		"UNICODE_ESC", "WS", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'..'", "'/'", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'['", "']'", "'^'", "'and'", "'array'", "'bool'", "'char'", "'do'", "'else'", 
		"'float'", "'function'", "'if'", "'int'", "'not'", "'of'", "'or'", "'program'", 
		"'read'", "'ref'", "'return'", "'then'", "'var'", "'void'", "'while'", 
		"'write'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "idf_list", "param_list", "expr_5", "conditional", "read", 
		"array_typename", "write", "range", "expr_4", "var_decl", "atom_typename", 
		"expr_2", "func_decls", "constant", "expr_8", "returning", "idf_access", 
		"expr_6", "range_list", "global_decls", "typename", "coord_list", "expr_1", 
		"func_decl", "loop", "statement", "affect_or_procedure_call", "block", 
		"param", "affect", "expr_3", "arg_list", "expr", "lvalue", "var_decls", 
		"expr_7", "program", "expr_0"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false
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
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public leacParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return leacParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g"; }



	// $ANTLR start "program"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:9:1: program : 'program' IDF global_decls func_decls statement ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:10:5: ( 'program' IDF global_decls func_decls statement )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:10:7: 'program' IDF global_decls func_decls statement
			{
			dbg.location(10,7);
			match(input,50,FOLLOW_50_in_program33); dbg.location(10,17);
			match(input,IDF,FOLLOW_IDF_in_program35); dbg.location(10,21);
			pushFollow(FOLLOW_global_decls_in_program37);
			global_decls();
			state._fsp--;
			dbg.location(10,34);
			pushFollow(FOLLOW_func_decls_in_program39);
			func_decls();
			state._fsp--;
			dbg.location(10,45);
			pushFollow(FOLLOW_statement_in_program41);
			statement();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(10, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "global_decls"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:12:1: global_decls : var_decls ;
	public final void global_decls() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "global_decls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:13:5: ( var_decls )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:13:7: var_decls
			{
			dbg.location(13,7);
			pushFollow(FOLLOW_var_decls_in_global_decls53);
			var_decls();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "global_decls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "global_decls"



	// $ANTLR start "var_decls"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:15:1: var_decls : ( var_decl )* ;
	public final void var_decls() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "var_decls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:5: ( ( var_decl )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:7: ( var_decl )*
			{
			dbg.location(16,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:7: ( var_decl )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==55) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:16:7: var_decl
					{
					dbg.location(16,7);
					pushFollow(FOLLOW_var_decl_in_var_decls69);
					var_decl();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_decls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "var_decls"



	// $ANTLR start "var_decl"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:18:1: var_decl : 'var' idf_list ':' typename ';' ;
	public final void var_decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "var_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:19:5: ( 'var' idf_list ':' typename ';' )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:19:7: 'var' idf_list ':' typename ';'
			{
			dbg.location(19,7);
			match(input,55,FOLLOW_55_in_var_decl86); dbg.location(19,13);
			pushFollow(FOLLOW_idf_list_in_var_decl88);
			idf_list();
			state._fsp--;
			dbg.location(19,22);
			match(input,26,FOLLOW_26_in_var_decl90); dbg.location(19,26);
			pushFollow(FOLLOW_typename_in_var_decl92);
			typename();
			state._fsp--;
			dbg.location(19,35);
			match(input,27,FOLLOW_27_in_var_decl94); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "var_decl"



	// $ANTLR start "idf_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:21:1: idf_list : IDF ( ',' IDF )* ;
	public final void idf_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idf_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:5: ( IDF ( ',' IDF )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:7: IDF ( ',' IDF )*
			{
			dbg.location(22,7);
			match(input,IDF,FOLLOW_IDF_in_idf_list110); dbg.location(22,11);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:11: ( ',' IDF )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==22) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:22:12: ',' IDF
					{
					dbg.location(22,12);
					match(input,22,FOLLOW_22_in_idf_list113); dbg.location(22,16);
					match(input,IDF,FOLLOW_IDF_in_idf_list115); 
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idf_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idf_list"



	// $ANTLR start "func_decls"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:25:1: func_decls : ( func_decl )* ;
	public final void func_decls() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "func_decls");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:5: ( ( func_decl )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:7: ( func_decl )*
			{
			dbg.location(26,7);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:7: ( func_decl )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==44) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:26:7: func_decl
					{
					dbg.location(26,7);
					pushFollow(FOLLOW_func_decl_in_func_decls134);
					func_decl();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "func_decls");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "func_decls"



	// $ANTLR start "func_decl"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:28:1: func_decl : 'function' IDF '(' param_list ')' ':' atom_typename var_decls block ;
	public final void func_decl() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "func_decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:29:5: ( 'function' IDF '(' param_list ')' ':' atom_typename var_decls block )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:29:7: 'function' IDF '(' param_list ')' ':' atom_typename var_decls block
			{
			dbg.location(29,7);
			match(input,44,FOLLOW_44_in_func_decl151); dbg.location(29,18);
			match(input,IDF,FOLLOW_IDF_in_func_decl153); dbg.location(29,22);
			match(input,18,FOLLOW_18_in_func_decl155); dbg.location(29,26);
			pushFollow(FOLLOW_param_list_in_func_decl157);
			param_list();
			state._fsp--;
			dbg.location(29,37);
			match(input,19,FOLLOW_19_in_func_decl159); dbg.location(29,41);
			match(input,26,FOLLOW_26_in_func_decl161); dbg.location(29,45);
			pushFollow(FOLLOW_atom_typename_in_func_decl163);
			atom_typename();
			state._fsp--;
			dbg.location(29,59);
			pushFollow(FOLLOW_var_decls_in_func_decl165);
			var_decls();
			state._fsp--;
			dbg.location(29,69);
			pushFollow(FOLLOW_block_in_func_decl167);
			block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(30, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "func_decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "func_decl"



	// $ANTLR start "typename"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:32:1: typename : ( atom_typename | array_typename );
	public final void typename() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(32, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:33:5: ( atom_typename | array_typename )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= 39 && LA4_0 <= 40)||LA4_0==43||LA4_0==46||LA4_0==56) ) {
				alt4=1;
			}
			else if ( (LA4_0==38) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:33:7: atom_typename
					{
					dbg.location(33,7);
					pushFollow(FOLLOW_atom_typename_in_typename184);
					atom_typename();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:34:7: array_typename
					{
					dbg.location(34,7);
					pushFollow(FOLLOW_array_typename_in_typename192);
					array_typename();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "typename"



	// $ANTLR start "atom_typename"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:37:1: atom_typename : ( 'void' | 'bool' | 'int' | 'float' | 'char' );
	public final void atom_typename() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "atom_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:38:5: ( 'void' | 'bool' | 'int' | 'float' | 'char' )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
			{
			dbg.location(38,5);
			if ( (input.LA(1) >= 39 && input.LA(1) <= 40)||input.LA(1)==43||input.LA(1)==46||input.LA(1)==56 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom_typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "atom_typename"



	// $ANTLR start "array_typename"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:45:1: array_typename : 'array' '[' range_list ']' 'of' atom_typename ;
	public final void array_typename() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "array_typename");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:46:5: ( 'array' '[' range_list ']' 'of' atom_typename )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:46:7: 'array' '[' range_list ']' 'of' atom_typename
			{
			dbg.location(46,7);
			match(input,38,FOLLOW_38_in_array_typename258); dbg.location(46,15);
			match(input,34,FOLLOW_34_in_array_typename260); dbg.location(46,19);
			pushFollow(FOLLOW_range_list_in_array_typename262);
			range_list();
			state._fsp--;
			dbg.location(46,30);
			match(input,35,FOLLOW_35_in_array_typename264); dbg.location(46,34);
			match(input,48,FOLLOW_48_in_array_typename266); dbg.location(46,39);
			pushFollow(FOLLOW_atom_typename_in_array_typename268);
			atom_typename();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "array_typename");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "array_typename"



	// $ANTLR start "range_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:49:1: range_list : range ( ',' range )* ;
	public final void range_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "range_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:50:5: ( range ( ',' range )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:50:7: range ( ',' range )*
			{
			dbg.location(50,7);
			pushFollow(FOLLOW_range_in_range_list285);
			range();
			state._fsp--;
			dbg.location(50,13);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:50:13: ( ',' range )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==22) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:50:14: ',' range
					{
					dbg.location(50,14);
					match(input,22,FOLLOW_22_in_range_list288); dbg.location(50,18);
					pushFollow(FOLLOW_range_in_range_list290);
					range();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "range_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "range_list"



	// $ANTLR start "range"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:52:1: range : INT '..' INT ;
	public final void range() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "range");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:53:5: ( INT '..' INT )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:53:7: INT '..' INT
			{
			dbg.location(53,7);
			match(input,INT,FOLLOW_INT_in_range308); dbg.location(53,11);
			match(input,24,FOLLOW_24_in_range310); dbg.location(53,16);
			match(input,INT,FOLLOW_INT_in_range312); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(54, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "range");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "range"



	// $ANTLR start "param_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:56:1: param_list : (| param ( ',' param )* );
	public final void param_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "param_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(56, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:57:5: (| param ( ',' param )* )
			int alt7=2;
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==19) ) {
				alt7=1;
			}
			else if ( (LA7_0==IDF||LA7_0==52) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:58:5: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:58:7: param ( ',' param )*
					{
					dbg.location(58,7);
					pushFollow(FOLLOW_param_in_param_list337);
					param();
					state._fsp--;
					dbg.location(58,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:58:13: ( ',' param )*
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( (LA6_0==22) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:58:14: ',' param
							{
							dbg.location(58,14);
							match(input,22,FOLLOW_22_in_param_list340); dbg.location(58,18);
							pushFollow(FOLLOW_param_in_param_list342);
							param();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}
					} finally {dbg.exitSubRule(6);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "param_list"



	// $ANTLR start "param"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:60:1: param : ( IDF ':' typename | 'ref' IDF ':' typename );
	public final void param() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "param");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:61:5: ( IDF ':' typename | 'ref' IDF ':' typename )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDF) ) {
				alt8=1;
			}
			else if ( (LA8_0==52) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:61:7: IDF ':' typename
					{
					dbg.location(61,7);
					match(input,IDF,FOLLOW_IDF_in_param360); dbg.location(61,11);
					match(input,26,FOLLOW_26_in_param362); dbg.location(61,15);
					pushFollow(FOLLOW_typename_in_param364);
					typename();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:62:7: 'ref' IDF ':' typename
					{
					dbg.location(62,7);
					match(input,52,FOLLOW_52_in_param372); dbg.location(62,13);
					match(input,IDF,FOLLOW_IDF_in_param374); dbg.location(62,17);
					match(input,26,FOLLOW_26_in_param376); dbg.location(62,21);
					pushFollow(FOLLOW_typename_in_param378);
					typename();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "param");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "param"



	// $ANTLR start "statement"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:65:1: statement : ( conditional | loop | affect_or_procedure_call | returning | block | read | write );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:66:5: ( conditional | loop | affect_or_procedure_call | returning | block | read | write )
			int alt9=7;
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			switch ( input.LA(1) ) {
			case 45:
				{
				alt9=1;
				}
				break;
			case 57:
				{
				alt9=2;
				}
				break;
			case IDF:
				{
				alt9=3;
				}
				break;
			case 53:
				{
				alt9=4;
				}
				break;
			case 59:
				{
				alt9=5;
				}
				break;
			case 51:
				{
				alt9=6;
				}
				break;
			case 58:
				{
				alt9=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:66:7: conditional
					{
					dbg.location(66,7);
					pushFollow(FOLLOW_conditional_in_statement395);
					conditional();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:67:7: loop
					{
					dbg.location(67,7);
					pushFollow(FOLLOW_loop_in_statement403);
					loop();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:68:7: affect_or_procedure_call
					{
					dbg.location(68,7);
					pushFollow(FOLLOW_affect_or_procedure_call_in_statement411);
					affect_or_procedure_call();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:69:7: returning
					{
					dbg.location(69,7);
					pushFollow(FOLLOW_returning_in_statement419);
					returning();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:70:7: block
					{
					dbg.location(70,7);
					pushFollow(FOLLOW_block_in_statement427);
					block();
					state._fsp--;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:71:7: read
					{
					dbg.location(71,7);
					pushFollow(FOLLOW_read_in_statement435);
					read();
					state._fsp--;

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:72:7: write
					{
					dbg.location(72,7);
					pushFollow(FOLLOW_write_in_statement443);
					write();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "conditional"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:75:1: conditional : 'if' expr 'then' statement ( options {greedy=true; } : 'else' statement |) ;
	public final void conditional() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "conditional");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:76:5: ( 'if' expr 'then' statement ( options {greedy=true; } : 'else' statement |) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:76:7: 'if' expr 'then' statement ( options {greedy=true; } : 'else' statement |)
			{
			dbg.location(76,7);
			match(input,45,FOLLOW_45_in_conditional460); dbg.location(76,12);
			pushFollow(FOLLOW_expr_in_conditional462);
			expr();
			state._fsp--;
			dbg.location(76,17);
			match(input,54,FOLLOW_54_in_conditional464); dbg.location(76,24);
			pushFollow(FOLLOW_statement_in_conditional466);
			statement();
			state._fsp--;
			dbg.location(77,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:9: ( options {greedy=true; } : 'else' statement |)
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==42) ) {
				alt10=1;
			}
			else if ( (LA10_0==EOF||LA10_0==27||LA10_0==60) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:77:39: 'else' statement
					{
					dbg.location(77,39);
					match(input,42,FOLLOW_42_in_conditional490); dbg.location(77,46);
					pushFollow(FOLLOW_statement_in_conditional492);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:79:9: 
					{
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "conditional");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "conditional"



	// $ANTLR start "loop"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:82:1: loop : 'while' expr 'do' statement ;
	public final void loop() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "loop");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:83:5: ( 'while' expr 'do' statement )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:83:7: 'while' expr 'do' statement
			{
			dbg.location(83,7);
			match(input,57,FOLLOW_57_in_loop531); dbg.location(83,15);
			pushFollow(FOLLOW_expr_in_loop533);
			expr();
			state._fsp--;
			dbg.location(83,20);
			match(input,41,FOLLOW_41_in_loop535); dbg.location(83,25);
			pushFollow(FOLLOW_statement_in_loop537);
			statement();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "loop");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "loop"



	// $ANTLR start "affect"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:86:1: affect : lvalue '=' expr ;
	public final void affect() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "affect");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:87:5: ( lvalue '=' expr )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:87:7: lvalue '=' expr
			{
			dbg.location(87,7);
			pushFollow(FOLLOW_lvalue_in_affect554);
			lvalue();
			state._fsp--;
			dbg.location(87,14);
			match(input,30,FOLLOW_30_in_affect556); dbg.location(87,18);
			pushFollow(FOLLOW_expr_in_affect558);
			expr();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(88, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "affect");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "affect"



	// $ANTLR start "lvalue"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:89:1: lvalue : IDF (| '[' coord_list ']' ) ;
	public final void lvalue() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lvalue");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:90:5: ( IDF (| '[' coord_list ']' ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:90:7: IDF (| '[' coord_list ']' )
			{
			dbg.location(90,7);
			match(input,IDF,FOLLOW_IDF_in_lvalue574); dbg.location(91,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:91:9: (| '[' coord_list ']' )
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==EOF||LA11_0==27||LA11_0==30||LA11_0==42||LA11_0==60) ) {
				alt11=1;
			}
			else if ( (LA11_0==34) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:92:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:92:11: '[' coord_list ']'
					{
					dbg.location(92,11);
					match(input,34,FOLLOW_34_in_lvalue598); dbg.location(92,15);
					pushFollow(FOLLOW_coord_list_in_lvalue600);
					coord_list();
					state._fsp--;
					dbg.location(92,26);
					match(input,35,FOLLOW_35_in_lvalue602); 
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(94, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lvalue");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lvalue"



	// $ANTLR start "coord_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:95:1: coord_list : expr ( ',' expr )* ;
	public final void coord_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "coord_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:96:5: ( expr ( ',' expr )* )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:96:7: expr ( ',' expr )*
			{
			dbg.location(96,7);
			pushFollow(FOLLOW_expr_in_coord_list628);
			expr();
			state._fsp--;
			dbg.location(96,12);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:96:12: ( ',' expr )*
			try { dbg.enterSubRule(12);

			loop12:
			while (true) {
				int alt12=2;
				try { dbg.enterDecision(12, decisionCanBacktrack[12]);

				int LA12_0 = input.LA(1);
				if ( (LA12_0==22) ) {
					alt12=1;
				}

				} finally {dbg.exitDecision(12);}

				switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:96:13: ',' expr
					{
					dbg.location(96,13);
					match(input,22,FOLLOW_22_in_coord_list631); dbg.location(96,17);
					pushFollow(FOLLOW_expr_in_coord_list633);
					expr();
					state._fsp--;

					}
					break;

				default :
					break loop12;
				}
			}
			} finally {dbg.exitSubRule(12);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "coord_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "coord_list"



	// $ANTLR start "returning"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:99:1: returning : 'return' (| expr ) ;
	public final void returning() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "returning");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:100:5: ( 'return' (| expr ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:100:7: 'return' (| expr )
			{
			dbg.location(100,7);
			match(input,53,FOLLOW_53_in_returning652); dbg.location(101,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:101:9: (| expr )
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==EOF||LA13_0==27||LA13_0==42||LA13_0==60) ) {
				alt13=1;
			}
			else if ( ((LA13_0 >= BOOL && LA13_0 <= CHAR)||LA13_0==FLOAT||(LA13_0 >= IDF && LA13_0 <= INT)||LA13_0==STRING||LA13_0==18||LA13_0==23||LA13_0==47) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:102:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:102:11: expr
					{
					dbg.location(102,11);
					pushFollow(FOLLOW_expr_in_returning676);
					expr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(104, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "returning");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "returning"



	// $ANTLR start "affect_or_procedure_call"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:106:1: affect_or_procedure_call : IDF ( (| '[' coord_list ']' ) '=' expr | '(' arg_list ')' ) ;
	public final void affect_or_procedure_call() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "affect_or_procedure_call");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:107:5: ( IDF ( (| '[' coord_list ']' ) '=' expr | '(' arg_list ')' ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:107:7: IDF ( (| '[' coord_list ']' ) '=' expr | '(' arg_list ')' )
			{
			dbg.location(107,7);
			match(input,IDF,FOLLOW_IDF_in_affect_or_procedure_call703); dbg.location(108,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:108:9: ( (| '[' coord_list ']' ) '=' expr | '(' arg_list ')' )
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==30||LA15_0==34) ) {
				alt15=1;
			}
			else if ( (LA15_0==18) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:109:13: (| '[' coord_list ']' ) '=' expr
					{
					dbg.location(109,13);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:109:13: (| '[' coord_list ']' )
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==30) ) {
						alt14=1;
					}
					else if ( (LA14_0==34) ) {
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

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:110:13: 
							{
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:110:15: '[' coord_list ']'
							{
							dbg.location(110,15);
							match(input,34,FOLLOW_34_in_affect_or_procedure_call745); dbg.location(110,19);
							pushFollow(FOLLOW_coord_list_in_affect_or_procedure_call747);
							coord_list();
							state._fsp--;
							dbg.location(110,30);
							match(input,35,FOLLOW_35_in_affect_or_procedure_call749); 
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(112,13);
					match(input,30,FOLLOW_30_in_affect_or_procedure_call777); dbg.location(112,17);
					pushFollow(FOLLOW_expr_in_affect_or_procedure_call779);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:113:11: '(' arg_list ')'
					{
					dbg.location(113,11);
					match(input,18,FOLLOW_18_in_affect_or_procedure_call791); dbg.location(113,15);
					pushFollow(FOLLOW_arg_list_in_affect_or_procedure_call793);
					arg_list();
					state._fsp--;
					dbg.location(113,24);
					match(input,19,FOLLOW_19_in_affect_or_procedure_call795); 
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(115, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "affect_or_procedure_call");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "affect_or_procedure_call"



	// $ANTLR start "arg_list"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:117:1: arg_list : (| expr ( ',' expr )* );
	public final void arg_list() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "arg_list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:118:5: (| expr ( ',' expr )* )
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==19) ) {
				alt17=1;
			}
			else if ( ((LA17_0 >= BOOL && LA17_0 <= CHAR)||LA17_0==FLOAT||(LA17_0 >= IDF && LA17_0 <= INT)||LA17_0==STRING||LA17_0==18||LA17_0==23||LA17_0==47) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:119:5: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:119:7: expr ( ',' expr )*
					{
					dbg.location(119,7);
					pushFollow(FOLLOW_expr_in_arg_list830);
					expr();
					state._fsp--;
					dbg.location(119,12);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:119:12: ( ',' expr )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						int LA16_0 = input.LA(1);
						if ( (LA16_0==22) ) {
							alt16=1;
						}

						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:119:13: ',' expr
							{
							dbg.location(119,13);
							match(input,22,FOLLOW_22_in_arg_list833); dbg.location(119,17);
							pushFollow(FOLLOW_expr_in_arg_list835);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(120, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "arg_list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "arg_list"



	// $ANTLR start "block"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:122:1: block : '{' (| statement ( ';' statement )* ) '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:123:5: ( '{' (| statement ( ';' statement )* ) '}' )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:123:7: '{' (| statement ( ';' statement )* ) '}'
			{
			dbg.location(123,7);
			match(input,59,FOLLOW_59_in_block854); dbg.location(124,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:124:9: (| statement ( ';' statement )* )
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==60) ) {
				alt19=1;
			}
			else if ( (LA19_0==IDF||LA19_0==45||LA19_0==51||LA19_0==53||(LA19_0 >= 57 && LA19_0 <= 59)) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:125:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:125:11: statement ( ';' statement )*
					{
					dbg.location(125,11);
					pushFollow(FOLLOW_statement_in_block878);
					statement();
					state._fsp--;
					dbg.location(125,21);
					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:125:21: ( ';' statement )*
					try { dbg.enterSubRule(18);

					loop18:
					while (true) {
						int alt18=2;
						try { dbg.enterDecision(18, decisionCanBacktrack[18]);

						int LA18_0 = input.LA(1);
						if ( (LA18_0==27) ) {
							alt18=1;
						}

						} finally {dbg.exitDecision(18);}

						switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:125:22: ';' statement
							{
							dbg.location(125,22);
							match(input,27,FOLLOW_27_in_block881); dbg.location(125,26);
							pushFollow(FOLLOW_statement_in_block883);
							statement();
							state._fsp--;

							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(127,7);
			match(input,60,FOLLOW_60_in_block903); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(128, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "read"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:130:1: read : 'read' lvalue ;
	public final void read() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "read");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:131:5: ( 'read' lvalue )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:131:7: 'read' lvalue
			{
			dbg.location(131,7);
			match(input,51,FOLLOW_51_in_read920); dbg.location(131,14);
			pushFollow(FOLLOW_lvalue_in_read922);
			lvalue();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(132, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "read");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "read"



	// $ANTLR start "write"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:134:1: write : 'write' ( lvalue | constant ) ;
	public final void write() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "write");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:135:5: ( 'write' ( lvalue | constant ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:135:7: 'write' ( lvalue | constant )
			{
			dbg.location(135,7);
			match(input,58,FOLLOW_58_in_write939); dbg.location(136,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:136:9: ( lvalue | constant )
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==IDF) ) {
				alt20=1;
			}
			else if ( ((LA20_0 >= BOOL && LA20_0 <= CHAR)||LA20_0==FLOAT||LA20_0==INT||LA20_0==STRING) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:136:11: lvalue
					{
					dbg.location(136,11);
					pushFollow(FOLLOW_lvalue_in_write951);
					lvalue();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:137:11: constant
					{
					dbg.location(137,11);
					pushFollow(FOLLOW_constant_in_write963);
					constant();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(139, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "write");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "write"



	// $ANTLR start "expr_0"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:141:1: expr_0 : ( idf_access | constant | '(' expr ')' );
	public final void expr_0() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_0");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(141, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:5: ( idf_access | constant | '(' expr ')' )
			int alt21=3;
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			switch ( input.LA(1) ) {
			case IDF:
				{
				alt21=1;
				}
				break;
			case BOOL:
			case CHAR:
			case FLOAT:
			case INT:
			case STRING:
				{
				alt21=2;
				}
				break;
			case 18:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:142:7: idf_access
					{
					dbg.location(142,7);
					pushFollow(FOLLOW_idf_access_in_expr_0990);
					idf_access();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:143:7: constant
					{
					dbg.location(143,7);
					pushFollow(FOLLOW_constant_in_expr_0998);
					constant();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:144:7: '(' expr ')'
					{
					dbg.location(144,7);
					match(input,18,FOLLOW_18_in_expr_01006); dbg.location(144,11);
					pushFollow(FOLLOW_expr_in_expr_01008);
					expr();
					state._fsp--;
					dbg.location(144,16);
					match(input,19,FOLLOW_19_in_expr_01010); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(145, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_0");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_0"



	// $ANTLR start "expr_1"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:147:1: expr_1 : expr_0 (| '^' expr_1 ) ;
	public final void expr_1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(147, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:148:5: ( expr_0 (| '^' expr_1 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:148:7: expr_0 (| '^' expr_1 )
			{
			dbg.location(148,7);
			pushFollow(FOLLOW_expr_0_in_expr_11027);
			expr_0();
			state._fsp--;
			dbg.location(149,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:149:9: (| '^' expr_1 )
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==EOF||LA22_0==17||(LA22_0 >= 19 && LA22_0 <= 23)||LA22_0==25||(LA22_0 >= 27 && LA22_0 <= 29)||(LA22_0 >= 31 && LA22_0 <= 33)||LA22_0==35||LA22_0==37||(LA22_0 >= 41 && LA22_0 <= 42)||LA22_0==49||LA22_0==54||LA22_0==60) ) {
				alt22=1;
			}
			else if ( (LA22_0==36) ) {
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:150:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:150:11: '^' expr_1
					{
					dbg.location(150,11);
					match(input,36,FOLLOW_36_in_expr_11051); dbg.location(150,15);
					pushFollow(FOLLOW_expr_1_in_expr_11053);
					expr_1();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(152, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_1"



	// $ANTLR start "expr_2"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:154:1: expr_2 : ( expr_1 | '-' expr_2 | 'not' expr_2 );
	public final void expr_2() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(154, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:5: ( expr_1 | '-' expr_2 | 'not' expr_2 )
			int alt23=3;
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			switch ( input.LA(1) ) {
			case BOOL:
			case CHAR:
			case FLOAT:
			case IDF:
			case INT:
			case STRING:
			case 18:
				{
				alt23=1;
				}
				break;
			case 23:
				{
				alt23=2;
				}
				break;
			case 47:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:155:7: expr_1
					{
					dbg.location(155,7);
					pushFollow(FOLLOW_expr_1_in_expr_21080);
					expr_1();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:156:7: '-' expr_2
					{
					dbg.location(156,7);
					match(input,23,FOLLOW_23_in_expr_21088); dbg.location(156,11);
					pushFollow(FOLLOW_expr_2_in_expr_21090);
					expr_2();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:157:7: 'not' expr_2
					{
					dbg.location(157,7);
					match(input,47,FOLLOW_47_in_expr_21098); dbg.location(157,13);
					pushFollow(FOLLOW_expr_2_in_expr_21100);
					expr_2();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(158, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_2"



	// $ANTLR start "expr_3"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:160:1: expr_3 : expr_2 (| '*' expr_3 | '/' expr_3 ) ;
	public final void expr_3() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(160, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:161:5: ( expr_2 (| '*' expr_3 | '/' expr_3 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:161:7: expr_2 (| '*' expr_3 | '/' expr_3 )
			{
			dbg.location(161,7);
			pushFollow(FOLLOW_expr_2_in_expr_31117);
			expr_2();
			state._fsp--;
			dbg.location(162,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:162:9: (| '*' expr_3 | '/' expr_3 )
			int alt24=3;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			switch ( input.LA(1) ) {
			case EOF:
			case 17:
			case 19:
			case 21:
			case 22:
			case 23:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 33:
			case 35:
			case 37:
			case 41:
			case 42:
			case 49:
			case 54:
			case 60:
				{
				alt24=1;
				}
				break;
			case 20:
				{
				alt24=2;
				}
				break;
			case 25:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:163:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:163:11: '*' expr_3
					{
					dbg.location(163,11);
					match(input,20,FOLLOW_20_in_expr_31141); dbg.location(163,15);
					pushFollow(FOLLOW_expr_3_in_expr_31143);
					expr_3();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:164:11: '/' expr_3
					{
					dbg.location(164,11);
					match(input,25,FOLLOW_25_in_expr_31155); dbg.location(164,15);
					pushFollow(FOLLOW_expr_3_in_expr_31157);
					expr_3();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(166, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_3"



	// $ANTLR start "expr_4"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:168:1: expr_4 : expr_3 (| '+' expr_4 | '-' expr_4 ) ;
	public final void expr_4() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(168, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:169:5: ( expr_3 (| '+' expr_4 | '-' expr_4 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:169:7: expr_3 (| '+' expr_4 | '-' expr_4 )
			{
			dbg.location(169,7);
			pushFollow(FOLLOW_expr_3_in_expr_41184);
			expr_3();
			state._fsp--;
			dbg.location(170,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:170:9: (| '+' expr_4 | '-' expr_4 )
			int alt25=3;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			switch ( input.LA(1) ) {
			case EOF:
			case 17:
			case 19:
			case 22:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 33:
			case 35:
			case 37:
			case 41:
			case 42:
			case 49:
			case 54:
			case 60:
				{
				alt25=1;
				}
				break;
			case 21:
				{
				alt25=2;
				}
				break;
			case 23:
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

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:171:11: '+' expr_4
					{
					dbg.location(171,11);
					match(input,21,FOLLOW_21_in_expr_41208); dbg.location(171,15);
					pushFollow(FOLLOW_expr_4_in_expr_41210);
					expr_4();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:172:11: '-' expr_4
					{
					dbg.location(172,11);
					match(input,23,FOLLOW_23_in_expr_41222); dbg.location(172,15);
					pushFollow(FOLLOW_expr_4_in_expr_41224);
					expr_4();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(174, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_4"



	// $ANTLR start "expr_5"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:176:1: expr_5 : expr_4 (| '<' expr_5 | '<=' expr_5 | '>' expr_5 | '>=' expr_5 ) ;
	public final void expr_5() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(176, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:177:5: ( expr_4 (| '<' expr_5 | '<=' expr_5 | '>' expr_5 | '>=' expr_5 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:177:7: expr_4 (| '<' expr_5 | '<=' expr_5 | '>' expr_5 | '>=' expr_5 )
			{
			dbg.location(177,7);
			pushFollow(FOLLOW_expr_4_in_expr_51251);
			expr_4();
			state._fsp--;
			dbg.location(178,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:178:9: (| '<' expr_5 | '<=' expr_5 | '>' expr_5 | '>=' expr_5 )
			int alt26=5;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			switch ( input.LA(1) ) {
			case EOF:
			case 17:
			case 19:
			case 22:
			case 27:
			case 31:
			case 35:
			case 37:
			case 41:
			case 42:
			case 49:
			case 54:
			case 60:
				{
				alt26=1;
				}
				break;
			case 28:
				{
				alt26=2;
				}
				break;
			case 29:
				{
				alt26=3;
				}
				break;
			case 32:
				{
				alt26=4;
				}
				break;
			case 33:
				{
				alt26=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:179:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:179:11: '<' expr_5
					{
					dbg.location(179,11);
					match(input,28,FOLLOW_28_in_expr_51275); dbg.location(179,15);
					pushFollow(FOLLOW_expr_5_in_expr_51277);
					expr_5();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:180:11: '<=' expr_5
					{
					dbg.location(180,11);
					match(input,29,FOLLOW_29_in_expr_51289); dbg.location(180,16);
					pushFollow(FOLLOW_expr_5_in_expr_51291);
					expr_5();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:181:11: '>' expr_5
					{
					dbg.location(181,11);
					match(input,32,FOLLOW_32_in_expr_51303); dbg.location(181,15);
					pushFollow(FOLLOW_expr_5_in_expr_51305);
					expr_5();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:182:11: '>=' expr_5
					{
					dbg.location(182,11);
					match(input,33,FOLLOW_33_in_expr_51317); dbg.location(182,16);
					pushFollow(FOLLOW_expr_5_in_expr_51319);
					expr_5();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(184, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_5"



	// $ANTLR start "expr_6"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:186:1: expr_6 : expr_5 (| '==' expr_6 | '!=' expr_6 ) ;
	public final void expr_6() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(186, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:187:5: ( expr_5 (| '==' expr_6 | '!=' expr_6 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:187:7: expr_5 (| '==' expr_6 | '!=' expr_6 )
			{
			dbg.location(187,7);
			pushFollow(FOLLOW_expr_5_in_expr_61346);
			expr_5();
			state._fsp--;
			dbg.location(188,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:188:9: (| '==' expr_6 | '!=' expr_6 )
			int alt27=3;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			switch ( input.LA(1) ) {
			case EOF:
			case 19:
			case 22:
			case 27:
			case 35:
			case 37:
			case 41:
			case 42:
			case 49:
			case 54:
			case 60:
				{
				alt27=1;
				}
				break;
			case 31:
				{
				alt27=2;
				}
				break;
			case 17:
				{
				alt27=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:189:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:189:11: '==' expr_6
					{
					dbg.location(189,11);
					match(input,31,FOLLOW_31_in_expr_61370); dbg.location(189,16);
					pushFollow(FOLLOW_expr_6_in_expr_61372);
					expr_6();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:190:11: '!=' expr_6
					{
					dbg.location(190,11);
					match(input,17,FOLLOW_17_in_expr_61384); dbg.location(190,16);
					pushFollow(FOLLOW_expr_6_in_expr_61386);
					expr_6();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(27);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(192, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_6"



	// $ANTLR start "expr_7"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:194:1: expr_7 : expr_6 (| 'and' expr_7 ) ;
	public final void expr_7() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_7");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(194, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:195:5: ( expr_6 (| 'and' expr_7 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:195:7: expr_6 (| 'and' expr_7 )
			{
			dbg.location(195,7);
			pushFollow(FOLLOW_expr_6_in_expr_71413);
			expr_6();
			state._fsp--;
			dbg.location(196,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:196:9: (| 'and' expr_7 )
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==EOF||LA28_0==19||LA28_0==22||LA28_0==27||LA28_0==35||(LA28_0 >= 41 && LA28_0 <= 42)||LA28_0==49||LA28_0==54||LA28_0==60) ) {
				alt28=1;
			}
			else if ( (LA28_0==37) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:197:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:197:11: 'and' expr_7
					{
					dbg.location(197,11);
					match(input,37,FOLLOW_37_in_expr_71437); dbg.location(197,17);
					pushFollow(FOLLOW_expr_7_in_expr_71439);
					expr_7();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(199, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_7");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_7"



	// $ANTLR start "expr_8"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:201:1: expr_8 : expr_7 (| 'or' expr_8 ) ;
	public final void expr_8() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr_8");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(201, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:202:5: ( expr_7 (| 'or' expr_8 ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:202:7: expr_7 (| 'or' expr_8 )
			{
			dbg.location(202,7);
			pushFollow(FOLLOW_expr_7_in_expr_81466);
			expr_7();
			state._fsp--;
			dbg.location(203,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:203:9: (| 'or' expr_8 )
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==EOF||LA29_0==19||LA29_0==22||LA29_0==27||LA29_0==35||(LA29_0 >= 41 && LA29_0 <= 42)||LA29_0==54||LA29_0==60) ) {
				alt29=1;
			}
			else if ( (LA29_0==49) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:204:11: 'or' expr_8
					{
					dbg.location(204,11);
					match(input,49,FOLLOW_49_in_expr_81490); dbg.location(204,16);
					pushFollow(FOLLOW_expr_8_in_expr_81492);
					expr_8();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(206, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr_8");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr_8"



	// $ANTLR start "expr"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:208:1: expr : expr_8 ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(208, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:209:5: ( expr_8 )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:209:7: expr_8
			{
			dbg.location(209,7);
			pushFollow(FOLLOW_expr_8_in_expr1519);
			expr_8();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(210, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "idf_access"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:212:1: idf_access : IDF (| '(' arg_list ')' | '[' coord_list ']' ) ;
	public final void idf_access() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "idf_access");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(212, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:213:5: ( IDF (| '(' arg_list ')' | '[' coord_list ']' ) )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:213:7: IDF (| '(' arg_list ')' | '[' coord_list ']' )
			{
			dbg.location(213,7);
			match(input,IDF,FOLLOW_IDF_in_idf_access1536); dbg.location(214,9);
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:214:9: (| '(' arg_list ')' | '[' coord_list ']' )
			int alt30=3;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			switch ( input.LA(1) ) {
			case EOF:
			case 17:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 25:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 33:
			case 35:
			case 36:
			case 37:
			case 41:
			case 42:
			case 49:
			case 54:
			case 60:
				{
				alt30=1;
				}
				break;
			case 18:
				{
				alt30=2;
				}
				break;
			case 34:
				{
				alt30=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:215:9: 
					{
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:215:11: '(' arg_list ')'
					{
					dbg.location(215,11);
					match(input,18,FOLLOW_18_in_idf_access1560); dbg.location(215,15);
					pushFollow(FOLLOW_arg_list_in_idf_access1562);
					arg_list();
					state._fsp--;
					dbg.location(215,24);
					match(input,19,FOLLOW_19_in_idf_access1564); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:216:11: '[' coord_list ']'
					{
					dbg.location(216,11);
					match(input,34,FOLLOW_34_in_idf_access1576); dbg.location(216,15);
					pushFollow(FOLLOW_coord_list_in_idf_access1578);
					coord_list();
					state._fsp--;
					dbg.location(216,26);
					match(input,35,FOLLOW_35_in_idf_access1580); 
					}
					break;

			}
			} finally {dbg.exitSubRule(30);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(218, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "idf_access");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "idf_access"



	// $ANTLR start "constant"
	// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:220:1: constant : ( INT | FLOAT | BOOL | STRING | CHAR );
	public final void constant() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "constant");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(220, 0);

		try {
			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:221:5: ( INT | FLOAT | BOOL | STRING | CHAR )
			dbg.enterAlt(1);

			// /home/thomas/Documents/Drive/Thomas/cours/cours_2019_2020/trad/leac/grammar/leac.g:
			{
			dbg.location(221,5);
			if ( (input.LA(1) >= BOOL && input.LA(1) <= CHAR)||input.LA(1)==FLOAT||input.LA(1)==INT||input.LA(1)==STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(226, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "constant");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "constant"

	// Delegated rules



	public static final BitSet FOLLOW_50_in_program33 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDF_in_program35 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_global_decls_in_program37 = new BitSet(new long[]{0x0E28300000000800L});
	public static final BitSet FOLLOW_func_decls_in_program39 = new BitSet(new long[]{0x0E28200000000800L});
	public static final BitSet FOLLOW_statement_in_program41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decls_in_global_decls53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_decl_in_var_decls69 = new BitSet(new long[]{0x0080000000000002L});
	public static final BitSet FOLLOW_55_in_var_decl86 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_idf_list_in_var_decl88 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_var_decl90 = new BitSet(new long[]{0x010049C000000000L});
	public static final BitSet FOLLOW_typename_in_var_decl92 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_var_decl94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_idf_list110 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_idf_list113 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDF_in_idf_list115 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_func_decl_in_func_decls134 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_44_in_func_decl151 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDF_in_func_decl153 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_func_decl155 = new BitSet(new long[]{0x0010000000080800L});
	public static final BitSet FOLLOW_param_list_in_func_decl157 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_func_decl159 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_func_decl161 = new BitSet(new long[]{0x0100498000000000L});
	public static final BitSet FOLLOW_atom_typename_in_func_decl163 = new BitSet(new long[]{0x0880000000000000L});
	public static final BitSet FOLLOW_var_decls_in_func_decl165 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_block_in_func_decl167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_typename_in_typename184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_typename_in_typename192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_array_typename258 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_array_typename260 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_range_list_in_array_typename262 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_array_typename264 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_array_typename266 = new BitSet(new long[]{0x0100498000000000L});
	public static final BitSet FOLLOW_atom_typename_in_array_typename268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_range_in_range_list285 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_range_list288 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_range_in_range_list290 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_INT_in_range308 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_range310 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_INT_in_range312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_param_list337 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_param_list340 = new BitSet(new long[]{0x0010000000000800L});
	public static final BitSet FOLLOW_param_in_param_list342 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_IDF_in_param360 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_param362 = new BitSet(new long[]{0x010049C000000000L});
	public static final BitSet FOLLOW_typename_in_param364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_param372 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_IDF_in_param374 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_param376 = new BitSet(new long[]{0x010049C000000000L});
	public static final BitSet FOLLOW_typename_in_param378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_loop_in_statement403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affect_or_procedure_call_in_statement411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returning_in_statement419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_in_statement435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_in_statement443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_conditional460 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_conditional462 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_54_in_conditional464 = new BitSet(new long[]{0x0E28200000000800L});
	public static final BitSet FOLLOW_statement_in_conditional466 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_42_in_conditional490 = new BitSet(new long[]{0x0E28200000000800L});
	public static final BitSet FOLLOW_statement_in_conditional492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_loop531 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_loop533 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_loop535 = new BitSet(new long[]{0x0E28200000000800L});
	public static final BitSet FOLLOW_statement_in_loop537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_affect554 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_affect556 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_affect558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_lvalue574 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_lvalue598 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_coord_list_in_lvalue600 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_lvalue602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_coord_list628 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_coord_list631 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_coord_list633 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_53_in_returning652 = new BitSet(new long[]{0x0000800000845A32L});
	public static final BitSet FOLLOW_expr_in_returning676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_affect_or_procedure_call703 = new BitSet(new long[]{0x0000000440040000L});
	public static final BitSet FOLLOW_34_in_affect_or_procedure_call745 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_coord_list_in_affect_or_procedure_call747 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_affect_or_procedure_call749 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_affect_or_procedure_call777 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_affect_or_procedure_call779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_affect_or_procedure_call791 = new BitSet(new long[]{0x00008000008C5A30L});
	public static final BitSet FOLLOW_arg_list_in_affect_or_procedure_call793 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_affect_or_procedure_call795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arg_list830 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_arg_list833 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_arg_list835 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_59_in_block854 = new BitSet(new long[]{0x1E28200000000800L});
	public static final BitSet FOLLOW_statement_in_block878 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_27_in_block881 = new BitSet(new long[]{0x0E28200000000800L});
	public static final BitSet FOLLOW_statement_in_block883 = new BitSet(new long[]{0x1000000008000000L});
	public static final BitSet FOLLOW_60_in_block903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_read920 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_lvalue_in_read922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_write939 = new BitSet(new long[]{0x0000000000005A30L});
	public static final BitSet FOLLOW_lvalue_in_write951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_write963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idf_access_in_expr_0990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_expr_0998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expr_01006 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_in_expr_01008 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_expr_01010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_0_in_expr_11027 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_expr_11051 = new BitSet(new long[]{0x0000000000045A30L});
	public static final BitSet FOLLOW_expr_1_in_expr_11053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_1_in_expr_21080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr_21088 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_2_in_expr_21090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_expr_21098 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_2_in_expr_21100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_2_in_expr_31117 = new BitSet(new long[]{0x0000000002100002L});
	public static final BitSet FOLLOW_20_in_expr_31141 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_3_in_expr_31143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_expr_31155 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_3_in_expr_31157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_3_in_expr_41184 = new BitSet(new long[]{0x0000000000A00002L});
	public static final BitSet FOLLOW_21_in_expr_41208 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_4_in_expr_41210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_expr_41222 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_4_in_expr_41224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_4_in_expr_51251 = new BitSet(new long[]{0x0000000330000002L});
	public static final BitSet FOLLOW_28_in_expr_51275 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_5_in_expr_51277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_expr_51289 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_5_in_expr_51291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_expr_51303 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_5_in_expr_51305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_expr_51317 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_5_in_expr_51319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_5_in_expr_61346 = new BitSet(new long[]{0x0000000080020002L});
	public static final BitSet FOLLOW_31_in_expr_61370 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_6_in_expr_61372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_expr_61384 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_6_in_expr_61386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_6_in_expr_71413 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_37_in_expr_71437 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_7_in_expr_71439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_7_in_expr_81466 = new BitSet(new long[]{0x0002000000000002L});
	public static final BitSet FOLLOW_49_in_expr_81490 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_expr_8_in_expr_81492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_8_in_expr1519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDF_in_idf_access1536 = new BitSet(new long[]{0x0000000400040002L});
	public static final BitSet FOLLOW_18_in_idf_access1560 = new BitSet(new long[]{0x00008000008C5A30L});
	public static final BitSet FOLLOW_arg_list_in_idf_access1562 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_idf_access1564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_idf_access1576 = new BitSet(new long[]{0x0000800000845A30L});
	public static final BitSet FOLLOW_coord_list_in_idf_access1578 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_idf_access1580 = new BitSet(new long[]{0x0000000000000002L});
}
