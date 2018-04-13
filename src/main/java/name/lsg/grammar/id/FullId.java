package name.lsg.grammar.id;

import name.lsg.grammar.AST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/3/16.
 */
public class FullId extends  AST{
    List<AST> astList = new ArrayList<>();

    public FullId(AST ast){
        addAST(ast);
    }

    public void addAST(AST ast){
        astList.add(ast);
    }

}
