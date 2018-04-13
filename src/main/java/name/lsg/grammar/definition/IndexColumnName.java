package name.lsg.grammar.definition;

import name.lsg.grammar.AST;

/**
 * Created by kenya on 2018/3/16.
 */
public class IndexColumnName extends AST{
    AST uid;
    AST width;
    String sort;

    public AST getUid() {
        return uid;
    }

    public void setUid(AST uid) {
        this.uid = uid;
    }

    public AST getWidth() {
        return width;
    }

    public void setWidth(AST width) {
        this.width = width;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
