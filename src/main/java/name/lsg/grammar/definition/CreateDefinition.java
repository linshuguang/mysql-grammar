package name.lsg.grammar.definition;

import name.lsg.grammar.AST;
import name.lsg.grammar.constraint.ColumnConstraint;
import name.lsg.grammar.constraint.TableConstraint;
import name.lsg.grammar.id.ID;

import java.util.*;

/**
 * Created by kenya on 2018/3/16.
 */
public class CreateDefinition extends AST {

    private enum  Declaration{
        COLUMN(1),
        CONSTRAINT(2),   //calls constructor with value 1
        INDEX(3); // semicolon needed when fields / methods follow

        private final int declarationCode;

        private Declaration(int declarationCode) {
            this.declarationCode = declarationCode;
        }

        public int getValue() {
            return this.declarationCode;
        }
    }

    BitSet bits = new BitSet(32);

    AST uid;

    public AST getAst() {
        return ast;
    }

    public void setAst(AST ast) {
        this.ast = ast;
    }

    AST ast;

    public AST getUid() {
        return uid;
    }

    public void setUid(AST uid) {
        this.uid = uid;
    }

    public void markAsColumnDef(){
        bits.set(Declaration.COLUMN.getValue());
    }

    public void markAsIndexDef(){
        bits.set(Declaration.INDEX.getValue());
    }

    public void markAsConstraintDef(){
        bits.set(Declaration.CONSTRAINT.getValue());
    }

    private void output(List<AST> astList){
        String col="";
        for( AST a : astList){
            ID id = (ID)a;
            col = col + "," + id.getId();
        }
        System.out.println("unique index : " + col);
    }


    private String makeString(List<AST> astList){
        Set<String> hashSet = new HashSet<String>();
        String col="";
        for( AST a : astList){
            ID id = (ID)a;
            col = col + "," + id.getId().trim().toLowerCase();
            hashSet.add(id.getId().trim().toLowerCase());
        }
        return col.substring(1);
    }

    @Override
    public Set<String> manifest(){

        Set<String> mf = new HashSet<>();

        if(bits.get(Declaration.INDEX.getValue())){
            IndexColumnDefinition indexColumnDefinition = (IndexColumnDefinition) ast;
            if(indexColumnDefinition.isUnique()) {
                //output(indexColumnDefinition.getIndexColumnNameList());
                mf.add(makeString(indexColumnDefinition.getIndexColumnNameList()));
            }
        }else if(bits.get(Declaration.COLUMN.getValue())){
            ColumnDefinition columnDefinition = (ColumnDefinition) ast;
            ColumnConstraint constraint = columnDefinition.getColumnConstraint();
            if(constraint.isPrimary() || constraint.isUnique()){
                //ID id = (ID)uid;
                //System.out.println( "column "+id.getId() + " is unique" );
                List<AST> asts = new ArrayList<>();
                asts.add(uid);
                mf.add(makeString(asts));
            }
        }else if(bits.get(Declaration.CONSTRAINT.getValue())){
            TableConstraint constraint = (TableConstraint) ast;
            if(constraint.isPrimary() || constraint.isUnique()){
                List<AST> idList = new ArrayList<>();
                for (AST a: constraint.getIndexColumnNames()){
                    IndexColumnName indexColumnName = (IndexColumnName)a;
                    idList.add(indexColumnName.getUid());
                }
                //output(idList);
                mf.add(makeString(idList));
            }
        }

        return mf;
    }

}
