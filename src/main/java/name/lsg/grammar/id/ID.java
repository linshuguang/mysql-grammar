package name.lsg.grammar.id;

import name.lsg.grammar.AST;

/**
 * Created by kenya on 2018/3/16.
 */
public class ID extends AST{
    String id;

    public ID() {}
    public ID(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return id;
    }
}
