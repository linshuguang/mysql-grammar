package name.lsg.grammar.definition;

import name.lsg.grammar.AST;
import name.lsg.grammar.model.TableOptionEnum;

import java.util.BitSet;

/**
 * Created by kenya on 2018/4/14.
 */
public class TableOption  extends AST{
    public String paramStr;
    public AST param;
    public AST param2;

    TableOptionEnum optionEnum;

    public void markAsEngine() {
        optionEnum = TableOptionEnum.ENGINE;
    }
    public void markAsAutoIncrement() {
        optionEnum = TableOptionEnum.AUTO_INCREMENT;
    }
    public void markAsAvgRowLength(){
        optionEnum = TableOptionEnum.AVG_ROW_LENGTH;
    }
    public void markAsCharsetName(){
        optionEnum = TableOptionEnum.CHARSETNAME;
    }
    public void markAsChecksum(){
        optionEnum = TableOptionEnum.CHECKSUM;
    }
    public void markAsCollationName(){
        optionEnum = TableOptionEnum.CollationName;
    }
    public void markAsComment(){
        optionEnum = TableOptionEnum.COMMENT;
    }
    public void markAsCompression(){
        optionEnum = TableOptionEnum.COMPRESSION;
    }
    public void markAsConnection(){
        optionEnum = TableOptionEnum.CONNECTION;
    }
    public void markAsDataDirectory(){
        optionEnum = TableOptionEnum.DATA_DIRECTORY;
    }
    public void markAsDelayKeyWrite(){
        optionEnum = TableOptionEnum.DELAY_KEY_WRITE;
    }
    public void markAsEncryption(){
        optionEnum = TableOptionEnum.ENCRYPTION;
    }
    public void markAsIndexDirectory(){
        optionEnum = TableOptionEnum.INDEX_DIRECTORY;
    }
    public void markAsInsertMethod(){
        optionEnum = TableOptionEnum.INSERT_METHOD;
    }
    public void markAsKeyBlockSize(){
        optionEnum = TableOptionEnum.KEY_BLOCK_SIZE;
    }
    public void markAsMaxRows(){
        optionEnum = TableOptionEnum.MAX_ROWS;
    }
    public void markAsMinRows(){
        optionEnum = TableOptionEnum.MIN_ROWS;
    }
    public void markAsPackKeys(){
        optionEnum = TableOptionEnum.PACK_KEYS;
    }
    public void markAsPassword(){
        optionEnum = TableOptionEnum.PASSWORD;
    }
    public void markAsRowFormat(){
        optionEnum = TableOptionEnum.ROW_FORMAT;
    }
    public void markAsStatsAutoRecalc(){
        optionEnum = TableOptionEnum.STATS_AUTO_RECALC;
    }
    public void markAsStatsPersistent(){
        optionEnum = TableOptionEnum.STATS_PERSISTENT;
    }
    public void markAsStatsSamplePages(){
        optionEnum = TableOptionEnum.STATS_SAMPLE_PAGES;
    }
    public void markAsTableSpace(){
        optionEnum = TableOptionEnum.TABLESPACE;
    }
    public void markAsUNION(){
        optionEnum = TableOptionEnum.UNION;
    }


}
