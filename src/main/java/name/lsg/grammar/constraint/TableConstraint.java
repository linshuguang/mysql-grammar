package name.lsg.grammar.constraint;

import name.lsg.grammar.AST;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by kenya on 2018/3/16.
 */
public class TableConstraint extends AST {

    private enum  Constraint{
        PRIMARY(1),
        UNIQUE(2),   //calls constructor with value 1
        FOREIGN(3),   //calls constructor with value 1
        CHECK(4)
        ; // semicolon needed when fields / methods follow

        private final int constraintCode;

        private Constraint(int constraintCode) {
            this.constraintCode = constraintCode;
        }

        public int getConstraintCode() {
            return this.constraintCode;
        }
    }
    BitSet bits = new BitSet(32);




    AST constraintName;
    List<AST> indexColumnNames = new ArrayList<>();
    List<AST> indexOptions = new ArrayList<>();

    AST expression;


    public void markAsPrimary(){
        bits.set(Constraint.PRIMARY.getConstraintCode());
    }

    public void markAsUnique(){
        bits.set(Constraint.UNIQUE.getConstraintCode());
    }

    public boolean isPrimary(){
        return bits.get(Constraint.PRIMARY.getConstraintCode());
    }

    public boolean isUnique(){
        return bits.get(Constraint.UNIQUE.getConstraintCode());
    }

    public void markAsForeign(){
        bits.set(Constraint.FOREIGN.getConstraintCode());
    }

    public void markAsCheck(){
        bits.set(Constraint.CHECK.getConstraintCode());
    }

    public void setIndexColumnNames(List<AST> indexColumnNames) {

        this.indexColumnNames = indexColumnNames;
    }

    public List<AST> getIndexColumnNames(){
        return this.indexColumnNames;
    }

    public void addIndexOption(AST indexOption) {
        this.indexOptions.add(indexOption);
    }

    public AST getExpression() {
        return expression;
    }

    public void setExpression(AST expression) {
        this.expression = expression;
    }
}
