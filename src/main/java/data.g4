grammar data;


@parser :: header{
import java.util.*;
import java.io.FileNotFoundException;
}
//ADD : '+';
@parser :: members{
    List<String> objects = new ArrayList<String>();
    	List<String> methods = new ArrayList<String>();
    	Map<String, List<String>> methodmap = new HashMap<>();
    	Map<String, List<String>> objmap = new HashMap<>();
    	String type ="";
    	public void verify() {
    		read r = new read();
    		objmap = r.getobj();
    		methodmap = r.getmethod();


    	}
    		boolean isobj() {
    			verify();
    			for (Map.Entry<String,List<String>> m: objmap.entrySet()) {
    				objects = m.getValue();
    				//System.out.println(objects);
    				if (objects.contains(getCurrentToken().getText())) {
    					type = m.getKey();
    					return true;
    				}
    			}
    			return false;
    		}

    		boolean ismethod (){

    			for (Map.Entry<String,List<String>> m: methodmap.entrySet()) {
    				methods = m.getValue();
    				//System.out.println(type);
    				if (methods.contains(getCurrentToken().getText()) && type.equals(m.getKey())) {
    					return true;
    				}
    			}

    			return false;
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
stat : stmt(NEWLINE | EOF)
        | stmt '=' stmt (NEWLINE | EOF)
        ;

stmt : left=stmt comp=(AND | OR ) right=stmt                     # opstmt
        | left=expr  op=(EQ | GT | LT ) right=expr              # compstmt
        | '(' stmt ')'                                      # parens
        ;
expr :         {isobj()}?String'.'{ismethod()}?String                 # isobjprop
                | String                                          # stringend
                | INT                                             #  intend
                | BOOL                                             # boolend
                | FLOAT                                            # floatend
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