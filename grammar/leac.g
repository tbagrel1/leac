grammar leac;

options {
    k = 1;
    output = AST;
}

/* parser */

tokens {
    PROGRAM;
    VAR_DECL_LIST;
    VAR_DECL;
    IDF_LIST;
    FUNC_DECL_LIST;
    FUNC_DECL;
    ATOM;
    ARRAY;
    VOID_TYPENAME;
    BOOL_TYPENAME;
    INT_TYPENAME;
    FLOAT_TYPENAME;
    CHAR_TYPENAME;
    STRING_TYPENAME;
    RANGE_LIST;
    RANGE;
    PARAM_LIST;
    PARAM;
    CONDITIONAL;
    AFFECT;
    AFFECT;
    VAR;
    CELL;
    CONST;
    PROCEDURE_CALL;
	LOOP;
	COORD_LIST;
    RETURNING;
    BLOCK;
    READ;
    WRITE;
    FUNC_CALL;
    NO_RETURN_VALUE;
    BY_REF;
    BY_COPY;
    ARG_LIST;
    WRITE;
    PASS;
    POW;
    NOT;
    UNARY_MINUS;
    MUL;
    DIV;
    ADD;
    SUB;
    TEST_LT;
    TEST_LE;
    TEST_GT;
    TEST_GE;
    TEST_EQ;
    TEST_NE;
    AND;
    OR;
}

program
    : 'program' IDF var_decl_list func_decl_list statement -> ^(PROGRAM var_decl_list func_decl_list statement)
    ;

var_decl_list
    : var_decl* -> ^(VAR_DECL_LIST var_decl*)
    ;
var_decl
    : 'var' idf_list ':' typename ';' -> ^(VAR_DECL typename idf_list)
    ;
idf_list
    : IDF (',' IDF)* -> ^(IDF_LIST IDF+)
    ;

func_decl_list
    : func_decl* -> ^(FUNC_DECL_LIST func_decl*)
    ;
func_decl
    : 'function' IDF '(' param_list ')' ':' atom_typename var_decl_list block -> ^(FUNC_DECL param_list atom_typename var_decl_list block)
    ;

typename
    : atom_typename -> ^(ATOM atom_typename)
    | array_typename -> array_typename
    ;

atom_typename
    : 'void' -> VOID_TYPENAME
    | 'bool' -> BOOL_TYPENAME
    | 'int' -> INT_TYPENAME
    | 'float' -> FLOAT_TYPENAME
    | 'char' -> CHAR_TYPENAME
    ;

array_typename
    : 'array' '[' range_list ']' 'of' atom_typename -> ^(ARRAY atom_typename range_list)
    ;

range_list
    : range (',' range)* -> ^(RANGE_LIST range+)
    ;
range
    : inf=INT '..' sup=INT -> ^(RANGE $inf $sup)
    ;

param_list
    : /* epsilon */ -> ^(PARAM_LIST)
    | param (',' param)* -> ^(PARAM_LIST param+)
    ;
param
    : IDF ':' typename -> ^(PARAM typename BY_COPY IDF)
    | 'ref' IDF ':' typename -> ^(PARAM typename BY_REF IDF)
    ;

statement
    : conditional -> conditional
    | loop -> loop
    | affect_or_procedure_call -> affect_or_procedure_call
    | returning -> returning
    | block -> block
    | read -> read
    | write -> write
    ;

conditional
    : 'if' expr 'then' first=statement
        ( options { greedy = true; }: 'else' second=statement -> ^(CONDITIONAL expr $first $second)
        | /* epsilon */ -> ^(CONDITIONAL expr $first PASS)
        )
    ;

loop
    : 'while' expr 'do' statement -> ^(LOOP expr statement)
    ;

coord_list
    : expr (',' expr)* -> ^(COORD_LIST expr+)
    ;

returning
    : 'return'
        ( /* epsilon */ -> ^(RETURNING NO_RETURN_VALUE)
        | expr -> ^(RETURNING expr)
        )
    ;

affect_or_procedure_call
    : IDF
        (
            ( /* epsilon */ -> ^(VAR IDF)
            | '[' coord_list ']' -> ^(CELL IDF coord_list)
            )
            '=' expr -> ^(AFFECT $affect_or_procedure_call expr)
        | '(' arg_list ')' -> ^(PROCEDURE_CALL IDF arg_list)
        )
    ;

arg_list
    : /* epsilon */ -> ^(ARG_LIST)
    | expr (',' expr)* -> ^(ARG_LIST expr+)
    ;

block
    : '{'
        ( /* epsilon */ -> ^(BLOCK)
        | statement (';' statement)* -> ^(BLOCK statement+)
        )
      '}'
    ;

read
    : 'read' IDF
        ( /* epsilon */ -> ^(READ ^(VAR IDF))
        | '[' coord_list ']' -> ^(READ ^(CELL IDF coord_list))
        )
    ;

write
    : 'write'
        ( IDF
            ( /* epsilon */ -> ^(WRITE ^(VAR IDF))
            | '[' coord_list ']' -> ^(WRITE ^(CELL IDF coord_list))
            )
        | constant -> ^(WRITE constant)
        )
    ;

expr_0
    : IDF
        ( /* epsilon */ -> ^(VAR IDF)
        | '(' arg_list ')' -> ^(FUNC_CALL IDF arg_list)
        | '[' coord_list ']' -> ^(CELL IDF coord_list)
        )
    | constant -> constant
    | '(' expr ')' -> expr
    ;

expr_1
    : (expr_0 -> expr_0)
        ( '^' next=expr_1_proxy -> ^(POW $expr_1 $next)
        )?
    ;
expr_1_proxy
    : expr_1 -> expr_1
    ;

expr_2
    :
        ( '-' -> ^(UNARY_MINUS $expr_2)
        | 'not' -> ^(NOT $expr_2)
        )*
        (expr_1 -> expr_1)
    ;

expr_3
    : (expr_2 -> expr_2)
        ( '*' next=expr_2 -> ^(MUL $expr_3 $next)
        | '/' next=expr_2 -> ^(DIV $expr_3 $next)
        )*
    ;

expr_4
    : (expr_3 -> expr_3)
        ( '+' next=expr_3 -> ^(ADD $expr_4 $next)
        | '-' next=expr_3 -> ^(SUB $expr_4 $next)
        )*
    ;

expr_5
    : (expr_4 -> expr_4)
        ( '<' next=expr_4 -> ^(TEST_LT $expr_5 $next)
        | '<=' next=expr_4 -> ^(TEST_LE $expr_5 $next)
        | '>' next=expr_4 -> ^(TEST_GT $expr_5 $next)
        | '>=' next=expr_4 -> ^(TEST_GE $expr_5 $next)
        )*
    ;

expr_6
    : (expr_5 -> expr_5)
        ( '==' next=expr_5 -> ^(TEST_EQ $expr_6 $next)
        | '!=' next=expr_5 -> ^(TEST_NE $expr_6 $next)
        )*
    ;

expr_7
    : (expr_6 -> expr_6)
        ( 'and' next=expr_6 -> ^(AND $expr_7 $next)
        )*
    ;

expr_8
    : (expr_7 -> expr_7)
        ( 'or' next=expr_7 -> ^(OR $expr_8 $next)
        )*
    ;

expr
    : expr_8 -> expr_8
    ;

constant
    : INT -> ^(CONST INT_TYPENAME INT)
    | FLOAT -> ^(CONST FLOAT_TYPENAME FLOAT)
    | BOOL -> ^(CONST BOOL_TYPENAME BOOL)
    | STRING -> ^(CONST STRING_TYPENAME STRING)
    | CHAR -> ^(CONST CHAR_TYPENAME CHAR)
    ;

/* fragments */

fragment EXPONENT
    : ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
    ;
fragment HEX_DIGIT
    : ( '0'..'9' | 'a'..'f' | 'A'..'F' )
    ;
fragment OCTAL_ESC
    : '\\' ( '0'..'3' ) ( '0'..'7' ) ( '0'..'7' )
    | '\\' ( '0'..'7' ) ( '0'..'7' )
    | '\\' ( '0'..'7' )
    ;
fragment UNICODE_ESC
    : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
fragment ESC_SEQ
    : '\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\'' | '\\' )
    | UNICODE_ESC
    | OCTAL_ESC
    ;

/* lexer */

    /* antlrworks generated rules */

BOOL
    : 'true'
    | 'false'
    ;

IDF
    : ( 'a'..'z' | 'A'..'Z' | '_' ) ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '_' )*
    ;
INT
    : '0'..'9'+
    ;

FLOAT
    : ( '0'..'9' )+ '.' ( '0'..'9' )* EXPONENT?
    | '.' ( '0'..'9' )+ EXPONENT?
    | ( '0'..'9' )+ EXPONENT
    ;

COMMENT
    : '/*' ( options { greedy = false; } : . )* '*/' { $channel = HIDDEN; }
    ;

WS
    : ( ' ' | '\t' | '\r' | '\n' ) { $channel = HIDDEN; }
    ;

STRING
    : '"' ( ESC_SEQ | ~( '\\' | '"' ) )* '"'
    ;

CHAR
    : '\'' ( ESC_SEQ | ~( '\'' | '\\' ) ) '\''
    ;

