package name.lsg.grammar.id;

/**
 * Created by kenya on 2018/3/23.
 */
public class QuotedID extends ID {

    public QuotedID(String id) {
        setId(id.substring(1, id.length()-1));
    }
}
