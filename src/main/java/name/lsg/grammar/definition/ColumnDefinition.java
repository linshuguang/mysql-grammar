package name.lsg.grammar.definition;

import name.lsg.grammar.AST;
import name.lsg.grammar.constraint.ColumnConstraint;

/**
 * Created by kenya on 2018/3/16.
 */
public class ColumnDefinition extends AST {

    AST dataType;

    ColumnConstraint columnConstraint = new ColumnConstraint();

    public AST getDataType() {
        return dataType;
    }

    public void setDataType(AST dataType) {
        this.dataType = dataType;
    }

    public void addColumnConstraint(AST columnConstraint){
        this.columnConstraint.merge((ColumnConstraint)columnConstraint);
    }

    public ColumnConstraint getColumnConstraint() {
        return columnConstraint;
    }
}
