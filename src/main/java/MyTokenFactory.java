import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenFactory;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.misc.Pair;

public  class MyTokenFactory implements TokenFactory<MyToken> {

        CharStream input;
        public MyTokenFactory(CharStream input) { this.input = input; }
        @Override
        public MyToken create(int type, String text) {
        return new MyToken(type, text);
         }
        @Override
        public MyToken create(Pair<TokenSource, CharStream> source, int type,
                               String text,
                               int channel, int start, int stop, int line,
                               int charPositionInLine)
        {
            MyToken t = new MyToken(source, type, channel, start, stop);
            t.setLine(line);
            t.setCharPositionInLine(charPositionInLine);
            t.data = t.getType();
            return t;
        }


}
