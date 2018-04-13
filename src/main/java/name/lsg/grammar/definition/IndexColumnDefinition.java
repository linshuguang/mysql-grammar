package name.lsg.grammar.definition;

import name.lsg.grammar.AST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/3/16.
 */
public class IndexColumnDefinition extends AST {
    AST uid;
    AST type;
    List<AST> indexColumnNameList = new ArrayList<>();

    boolean unique = false;

    public boolean isUnique() {
        return unique;
    }

    public void markAsUnique() {
        this.unique = true;
    }

    public AST getUid() {
        return uid;
    }

    public void setUid(AST uid) {
        this.uid = uid;
    }

    public AST getType() {
        return type;
    }

    public void setType(AST type) {
        this.type = type;
    }

    public List<AST> getIndexColumnNameList() {
        return indexColumnNameList;
    }

    public void setIndexColumnNameList(List<AST> indexColumnNameList) {
        this.indexColumnNameList = indexColumnNameList;
    }

}
