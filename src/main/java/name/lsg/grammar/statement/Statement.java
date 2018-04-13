package name.lsg.grammar.statement;

import name.lsg.grammar.AST;

/**
 * Created by kenya on 2018/3/16.
 */
public class Statement extends AST {
    AST ast;

    public AST getAst() {
        return ast;
    }

    public void setAst(AST ast) {
        this.ast = ast;
    }
}
