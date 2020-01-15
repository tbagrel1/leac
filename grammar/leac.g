grammar leac;

options {
    k = 1;
}

/* parser */

program
    : 'program' IDF var_decls func_decls statement -> ^(program var_decls func_decls statement)
    ;

var_decls
    : tail=var_decl* -> ^(var_decls tail*)
    ;
var_decl
    : 'var' idf_list ':' typename ';' -> ^(var_decl typename idf_list)
    ;
idf_list
    : head=IDF (',' tail=IDF)* -> ^(idf_list head tail*)
    ;

func_decls
    : func_decl*
    ;
func_decl
    : 'function' IDF '(' param_list ')' ':' atom_typename var_decls block
    ;

typename
    : atom_typename
    | array_typename
    ;

atom_typename
    : 'void'
    | 'bool'
    | 'int'
    | 'float'
    | 'char'
    ;

array_typename
    : 'array' '[' range_list ']' 'of' atom_typename
    ;

range_list
    : range (',' range)*
    ;
range
    : INT '..' INT
    ;

param_list
    : /* epsilon */
    | param (',' param)*
    ;
param
    : IDF ':' typename
    | 'ref' IDF ':' typename
    ;

statement
    : conditional
    | loop
    | affect_or_procedure_call
    | returning
    | block
    | read
    | write
    ;

conditional
    : 'if' expr 'then' statement
        ( options { greedy = true; }: 'else' statement
        | /* epsilon */
        )
    ;

loop
    : 'while' expr 'do' statement
    ;

affect
    : lvalue '=' expr
    ;
lvalue
    : IDF
        ( /* epsilon */
        | '[' coord_list ']'
        )
    ;
coord_list
    : expr (',' expr)*
    ;

returning
    : 'return'
        ( /* epsilon */
        | expr
        )
    ;

affect_or_procedure_call
    : IDF
        (
            ( /* epsilon */
            | '[' coord_list ']'
            )
            '=' expr
        | '(' arg_list ')'
        )
    ;

arg_list
    : /* epsilon */
    | expr (',' expr)*
    ;

block
    : '{'
        ( /* epsilon */
        | statement (';' statement)*
        )
      '}'
    ;

read
    : 'read' lvalue
    ;

write
    : 'write'
        ( lvalue
        | constant
        )
    ;

expr_0
    : idf_access
    | constant
    | '(' expr ')'
    ;

expr_1
    : expr_0
        ( /* epsilon */
        | '^' expr_1
        )
    ;

expr_2
    : expr_1
    | '-' expr_2
    | 'not' expr_2
    ;

expr_3
    : expr_2
        ( /* epsilon */
        | '*' expr_3
        | '/' expr_3
        )
    ;

expr_4
    : expr_3
        ( /* epsilon */
        | '+' expr_4
        | '-' expr_4
        )
    ;

expr_5
    : expr_4
        ( /* epsilon */
        | '<' expr_5
        | '<=' expr_5
        | '>' expr_5
        | '>=' expr_5
        )
    ;

expr_6
    : expr_5
        ( /* epsilon */
        | '==' expr_6
        | '!=' expr_6
        )
    ;

expr_7
    : expr_6
        ( /* epsilon */
        | 'and' expr_7
        )
    ;

expr_8
    : expr_7
        ( /* epsilon */
        | 'or' expr_8
        )
    ;

expr
    : expr_8
    ;

idf_access
    : IDF
        ( /* epsilon */
        | '(' arg_list ')'
        | '[' coord_list ']'
        )
    ;

constant
    : INT
    | FLOAT
    | BOOL
    | STRING
    | CHAR
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

    /* user-defined rules */
