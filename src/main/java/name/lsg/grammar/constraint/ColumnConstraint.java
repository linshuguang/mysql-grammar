package name.lsg.grammar.constraint;

import name.lsg.grammar.AST;

import java.util.BitSet;

/**
 * Created by kenya on 2018/3/16.
 */
public class ColumnConstraint extends AST {

    private enum  Constraint{
        NullNotNULL(1),
        AUTO_INCREMENT(2),  //calls constructor with value 3
        KEY(3),  //calls constructor with value 2
        PRIMARY(4),   //calls constructor with value 1
        UNIQUE(5),   //calls constructor with value 1
        COMMENTS(6),   //calls constructor with value 1
        FORMAT(7),
        STORAGE(8),
        REFERENCE(9),
        DEFAULT(10)
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

    boolean nullNotnull = false;
    boolean auto_increment = false;
    boolean key = false;
    boolean primary = false;
    boolean unique = false;

    public void markAsUnique(){
        bits.set(Constraint.UNIQUE.getConstraintCode());
    }

    public void markAsKey(){
        bits.set(Constraint.KEY.getConstraintCode());
    }

    public void markAsPrimary(){
        bits.set(Constraint.PRIMARY.getConstraintCode());
    }

    public boolean isUnique(){
        return bits.get(Constraint.UNIQUE.getConstraintCode());
    }

    public boolean isKey(){
        return bits.get(Constraint.KEY.getConstraintCode());
    }

    public boolean isPrimary(){
        return bits.get(Constraint.PRIMARY.getConstraintCode());
    }

    public boolean isAutoIncrement(){
        return bits.get(Constraint.AUTO_INCREMENT.getConstraintCode());
    }

    public void markAsAutoIncrement(){
        bits.set(Constraint.AUTO_INCREMENT.getConstraintCode());
    }

    public void setNullNotnull(AST nullNotnull){
        bits.set(Constraint.NullNotNULL.getConstraintCode());
    }

    public void setColformat(String colformat) {
        bits.set(Constraint.FORMAT.getConstraintCode());
        this.colformat = colformat;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        bits.set(Constraint.COMMENTS.getConstraintCode());
        this.comments = comments;
    }

    public String getStorageval() {
        return storageval;
    }

    public void setStorageval(String storageval) {
        bits.set(Constraint.STORAGE.getConstraintCode());
        this.storageval = storageval;
    }
    public AST getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(AST defaultValue) {
        bits.set(Constraint.DEFAULT.getConstraintCode());
        this.defaultValue = defaultValue;
    }

    String colformat;
    String comments;
    String storageval;

    AST defaultValue = null;



    public void merge(AST ast) {
        ColumnConstraint columnConstraint = (ColumnConstraint)ast;
        if(columnConstraint.bits.get(Constraint.DEFAULT.getConstraintCode())){
            this.defaultValue = columnConstraint.defaultValue;
        }
        if(columnConstraint.bits.get(Constraint.FORMAT.getConstraintCode())){
            this.colformat = columnConstraint.colformat;
        }
        if(columnConstraint.bits.get(Constraint.STORAGE.getConstraintCode())){
            this.storageval = columnConstraint.storageval;
        }
        bits.or(columnConstraint.bits);
    }

}
