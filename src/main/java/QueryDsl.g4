grammar  QueryDsl;
queryDsl: 'select' query 'from' ID ('where' )? logicExpression;
query: ID ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//ID : [a-zA-Z][a-zA-Z0-9]*; // match lower-case identifiers
ID:    ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*;

logicExpression
     : logicExpression logicalOperator logicExpression
     | fullColumnName comparisonOperator value
     | fullColumnName 'between' value 'and' value
     | fullColumnName 'not'? 'in' '(' value (',' value)*  ')'
     | '(' logicExpression ')'
     ;
logicalOperator
    : 'and' | '&' '&'  | 'or' | '|' '|'
    ;

column_name            :ID;

fullColumnName
    : column_name
    ;

comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '=' | '<' '=' '>'
    ;
value
    : uid
    | textLiteral
    | decimalLiteral
    ;
textLiteral
    : TEXT_STRING
    ;
TEXT_STRING :    (  '\'' ( ('\\' '\\') | ('\'' '\'') | ('\\' '\'') | ~('\'') )* '\''  );
 decimalLiteral
     : DECIMAL_LITERAL
     ;
DECIMAL_LITERAL:     DEC_DIGIT+;
uid
    : ID
    ;

fragment DEC_DIGIT:                  [0-9];


