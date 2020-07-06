// Define a grammar called Hello
grammar Hello;
prule :'hello' ID; //match keyword hello followed by an identifier
ID : [a-zA-Z0-9]+; // match lower-case identifiers
WS : [\t\n\r ]+ ->skip ;//skip spaces,tabls,newlines
dfafrule:'HH' ID;