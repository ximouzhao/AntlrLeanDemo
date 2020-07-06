grammar MyDSL;
function : ID'('(function|ID|STRING|NUMBER)(','(function|ID|STRING|NUMBER))*')';
STRING: '"' (ESC|.)*? '"' ;// https://www.bookstack.cn/read/antlr4-short-course/common-lexical-structures.md
NUMBER: [0-9]+;
ID:    ( 'A'..'Z' | 'a'..'z' | '_' | '$') ( 'A'..'Z' | 'a'..'z' | '_' | '$' | '0'..'9' )*;
WS : [\t\n\r ]+ ->skip ;//skip spaces,tabls,newlines

fragment
ESC : '\\"' | '\\\\' ;    // 匹配字符\"和\\