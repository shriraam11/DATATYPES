import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener  extends  dataBaseListener {
    dataParser parser;
    public MyListener(dataParser parser) {
        this.parser = parser;
    }
    @Override public void enterStat(dataParser.StatContext ctx) { }
    @Override public void exitStat(dataParser.StatContext ctx) { }
    @Override public void enterIsobjprop(dataParser.IsobjpropContext ctx) { }
    @Override public void exitIsobjprop(dataParser.IsobjpropContext ctx) { }
    @Override public void enterOpstmt(dataParser.OpstmtContext ctx) { }
    @Override public void exitOpstmt(dataParser.OpstmtContext ctx) { }
    @Override public void enterCompstmt(dataParser.CompstmtContext ctx) { }
    @Override
    public void exitCompstmt(dataParser.CompstmtContext ctx) {
        String leftstr = ctx.left.getText();
        String rightstr = ctx.right.getText();
       // System.out.println(rightstr);
        String expr_arr[] = leftstr.split("[.]");
      //  System.out.println(expr_arr[0]);
        String value_arr[] = rightstr .split("[.]");
      //  System.out.println(value_arr[0]);
        if(expr_arr.length == 1){
            System.out.println("invalid rule");
        }
        read r = new read();
        Map<String,String> methodreturn = new HashMap<>();
        methodreturn= r.getmethodreturn();
        //System.out.println(methodreturn);

        String method = expr_arr[1];
        String  returnvalue = "";
//        Vocabulary myvocabulary=parser.getVocabulary(); ;
//        System.out.println(myvocabulary.getLiteralName(dataParser.BOOL));
        if(methodreturn.containsKey(method)){
            returnvalue = methodreturn.get(method);
            //System.out.println(returnvalue);
        }
//        TerminalNode typeNode = (TerminalNode)ctx.right.getChild(0);
//        if(typeNode.getSymbol().getType() == dataLexer.INT){
//            System.out.println("isinteger");
//        }
        if(returnvalue.equals("boolean")){
                if(ctx.op.getType()==dataParser.EQ) {
                    if (value_arr.length >1 ) {
                        System.out.println("invalid rule");
                        return;
                    }
                    else{
                        TerminalNode typeNode = (TerminalNode)ctx.right.getChild(0);
                        if(typeNode.getSymbol().getType() != dataLexer.BOOL){
                            System.out.println("invalid rule Boolean is not returned");
                            return;
                        }
                    }
                }
                if(ctx.op.getType()==dataParser.LT || ctx.op.getType()==dataParser.GT ) {
                    System.out.println("invalid rule");
                    return;
                }
            }
            if(returnvalue.equals("int")||returnvalue.equals("float")){

                    if(value_arr.length>1){
                        if(!value_arr[1].equals(expr_arr[1])){
                            System.out.println("invalid rule");
                            return ;
                        }
                    }
                    else{
                        TerminalNode typeNode = (TerminalNode)ctx.right.getChild(0);
                       // System.out.println(typeNode.getSymbol().getType());
                        if(  returnvalue.equals("int") &&  typeNode.getSymbol().getType() != dataLexer.INT){
                            System.out.println("invalid rule suitable return not returned");
                            return ;
                        }
                        if ( returnvalue.equals("float") && typeNode.getSymbol().getType() != dataLexer.FLOAT){
                            System.out.println("invalid rule suitable return not returned");
                            return ;
                        }
                    }


            }
            if(returnvalue.equals("String")){
                if(ctx.op.getType()==dataParser.EQ) {
                    if (value_arr.length >1) {
                        System.out.println("invalid rule");
                        return;
                    }
                    TerminalNode typeNode = (TerminalNode)ctx.right.getChild(0);
                    if(typeNode.getSymbol().getType() != dataLexer.String){
                        System.out.println("invalid rule String is not returned");
                        return;
                    }
                }
                if(ctx.op.getType()==dataParser.LT || ctx.op.getType()==dataParser.GT ) {
                    System.out.println("invalid rule");
                    return;
                }
            }

        System.out.println("RULE VALID");



    }
}
