
grammar SQLStatement;

import Symbol, Keyword, Literals;

use
    : USE schemaName
    ;
    
schemaName
    : identifier
    ;

select
    : SELECT selectElements FROM tableName (whereClause) ?
    ;

insert
    : INSERT INTO? tableName columnNames? VALUES assignmentValues
    ;
  
assignmentValues
    : LP_ assignmentValue (COMMA_ assignmentValue)* RP_
    ;

assignmentValue
    : identifier
    ;
    
columnNames
    : LP_ columnName (COMMA_ columnName)* RP_
    ;

columnName
    : identifier
    ;
   
tableName
    : identifier
    ;
    
identifier
    : IDENTIFIER_ | STRING_ | NUMBER_
    ;

selectElements
    :  (star='*' | selectElement ) (',' selectElement)*
    ;

selectElement
    : identifier
    ;
whereClause
    : WHERE logicExpression
    ;

logicExpression
     : logicExpression logicalOperator logicExpression
     | selectElement comparisonOperator identifier
     | selectElement BETWEEN identifier AND identifier
     | selectElement NOT? IN '(' identifier (',' identifier)*  ')'
     | '(' logicExpression ')'
     ;

logicalOperator
    : AND | '&' '&'  | OR | '|' '|'
    ;

comparisonOperator
    : '=' | '>' | '<' | '<' '=' | '>' '='
    | '<' '>' | '!' '=' | '<' '=' '>'
    ;