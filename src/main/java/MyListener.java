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



}
