package name.lsg.grammar.statement;

import name.lsg.grammar.AST;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kenya on 2018/3/16.
 */
public class CreateTable extends DDLStatement {

    private boolean temporary=false;
    private boolean ifNotExists=false;
    AST name;
    List<AST> createDefinitionList;
    List<AST> tableOptionList = new ArrayList<>();

    CreateType createType = CreateType.COLUMN;

    private enum CreateType{
        COPY(1),
        QUERY(2),   //calls constructor with value 1
        COLUMN(3); // semicolon needed when fields / methods follow

        private final int type;

        private CreateType(int type) {
            this.type = type;
        }

        public int getValue() {
            return this.type;
        }
    }




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

    public void addTableOption(AST option){
        tableOptionList.add(option);
    }


    public void markAsQuery(){
        createType = CreateType.QUERY;
    }

    public void markAsCopy(){
        createType = CreateType.COPY;
    }

    public void markAsColumn(){
        createType = CreateType.COLUMN;
    }





}
