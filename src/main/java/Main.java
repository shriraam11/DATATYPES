

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
public class Main {

    public static void main(String[] args) throws Exception {
        try{





//
            Scanner s = new Scanner(System.in);
            String input=s.nextLine();
            dataLexer lexer = new dataLexer(CharStreams.fromString(input));
            //   MyTokenFactory factory = new MyTokenFactory(CharStreams.fromString(input));
      //      lexer.setTokenFactory(factory);
//
            CommonTokenStream tokens = new CommonTokenStream(lexer);
      //      tokens.fill();

            dataParser parser = new dataParser(tokens);
    //        parser.setTokenFactory(factory);
            ParseTree tree = parser.stmt();
            System.out.println(tree.toStringTree(parser));
//            ParseTreeWalker walker = new ParseTreeWalker();
//            MyListener listener = new MyListener(parser);
//            walker.walk(listener,tree);

        }
        catch(NullPointerException e){
            System.out.print("nullpointer" + e);
        }

        catch(Exception e){
            System.out.println("exception" + e);
        }

    }


}
