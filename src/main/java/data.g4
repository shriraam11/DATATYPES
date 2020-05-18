grammar data;


@parser :: header{
import java.util.*;
import java.io.FileNotFoundException;
}
//ADD : '+';
@parser :: members{

List<String > types= new ArrayList<String>(){
    {   add("SourceContainer");
       add("DestinationContainer");
     }
};



List<String > methods= new ArrayList<String>(){{add("isEmpty");
        add("CountofItems");}};
        methods=r.

boolean isobj(){
    return types.contains(getCurrentToken().getText());
}
boolean ismethod(){
  return methods.contains(getCurrentToken().getText());
}

}
INT : [0-9]+ ;   //match Integers
FLOAT : INT ('.' INT)?;// match float
NEWLINE :'\r'? '\n' ;
BOOL : 'TRUE'|'FALSE';
WS : [ \r\t\u000C]+ -> skip ;
AND : 'AND';
OR  :  'OR';
String :  [a-zA-Z]+;



EQ   : '==';
LT   : '<';
GT   :  '>';
stat : stmt(NEWLINE | EOF);
stmt : left=stmt comp=(AND | OR ) right=stmt
        | left=stmt  op=(EQ | GT | LT ) right=stmt
        | {isobj()}?String'.'{ismethod()}?String
                | String
                | INT
                | BOOL
                | FLOAT
                | '(' stmt ')'
                ;





//start :  dec(NEWLINE|EOF);
//
//dec : rule comp=(AND|OR) rule ;
//
//rule :   INT
//       | BOOL
//       ;


//stmt : left=stmt ADD right=stmt          #exp
//       | INT                           #int
//       | FLOAT                         #float
//       | BOOL                           #bool
//       ;