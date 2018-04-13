package name.lsg.grammar.statement;

import name.lsg.grammar.AST;

import java.util.List;

/**
 * Created by kenya on 2018/3/16.
 */
public class CreateTable extends DDLStatement {

    private boolean temporary=false;
    private boolean ifNotExists=false;
    AST name;
    List<AST> createDefinitionList;

    public AST getName() {
        return name;
    }

    public void setName(AST name) {
        this.name = name;
    }

    public void markAsTemporary() {
        this.temporary = true;
    }

    public void markAsIfNotExists() {
        this.ifNotExists = true;
    }

    public void setCreateDefinitionList(List<AST> createDefinitionList){
        this.createDefinitionList = createDefinitionList;
    }

    public List<AST> getCreateDefinitionList(){
        return this.createDefinitionList;
    }






}
