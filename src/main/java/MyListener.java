import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

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

    @Override
    public void exitStmt(dataParser.StmtContext ctx) {
        read r = new read();
        List<String> types ;
        types=r.getdata();
        HashMap<String,List<String >> objmap;
        objmap = r.getObj();
//        for(Map.Entry m : objmap.entrySet()){
//            System.out.println(m.getKey() +" "+ m.getValue());
//        }
        HashMap<String,List<String>> methodmap;
        methodmap = r.getmethod();
        HashMap<String,String > methodreturnmap;
        methodreturnmap = r.getmethodreturn();
//        for(Map.Entry m : methodmap.entrySet()){
//            System.out.println(m.getKey() +" "+ m.getValue());
//        }
//        if(ctx.op.getType()==dataParser.EQ) {
//
//        }
//        if(ctx.op.getType()==dataParser.LT ||ctx.op.getType()==dataParser.LT  ){
//
//        }


    }

}
