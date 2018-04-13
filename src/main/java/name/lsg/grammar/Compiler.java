package name.lsg.grammar;

import name.lsg.MySqlLexer;
import name.lsg.MySqlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * Created by kenya on 2018/3/18.
 */
public class Compiler {
    private TokenStream getTokens(String inputString) {
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        MySqlLexer lexer = new MySqlLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    private AST parseCreateTable(String code){
        TokenStream tokens = getTokens(code);

        MySqlParser parser = new MySqlParser(tokens);

        //MySqlParser.MyCreateTableContext context = parser.myCreateTable();
        MySqlParser.CreateTableContext context = parser.createTable();
        return context.value;
    }

    public AST parse(String code){
        return parseCreateTable(code);
    }

    public static void main(){
        System.out.println("Hello World");
    }

}
