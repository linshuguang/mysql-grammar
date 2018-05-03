package name.lsg.grammar.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenya on 2018/5/3.
 */
public enum TableOptionEnum {
    ENGINE (1,"ENGINE"),
    AUTO_INCREMENT(2,"AUTO_INCREMENT"),
    AVG_ROW_LENGTH(3,"AVG_ROW_LENGTH"),
    CHARSETNAME(4,"CHARSETNAME"),
    CHECKSUM(5,"CHECKSUM"),
    CollationName(6,"collationName"),
    COMMENT(7,"COMMENT"),
    COMPRESSION(8,"COMPRESSION"),
    CONNECTION(9,"CONNECTION"),
    DATA_DIRECTORY(10,"DATA_DIRECTORY"),
    DELAY_KEY_WRITE(11,"DELAY_KEY_WRITE"),
    ENCRYPTION(12,"ENCRYPTION"),
    INDEX_DIRECTORY(13,"INDEX_DIRECTORY"),
    INSERT_METHOD(14,"INSERT_METHOD"),
    KEY_BLOCK_SIZE(15,"KEY_BLOCK_SIZE"),
    MAX_ROWS(16,"MAX_ROWS"),
    MIN_ROWS(17,"MIN_ROWS"),
    PACK_KEYS(18,"PACK_KEYS"),
    PASSWORD(19,"PASSWORD"),
    ROW_FORMAT(20,"ROW_FORMAT"),
    STATS_AUTO_RECALC(21,"STATS_AUTO_RECALC"),
    STATS_PERSISTENT(22,"STATS_PERSISTENT"),
    STATS_SAMPLE_PAGES(23,"STATS_SAMPLE_PAGES"),
    TABLESPACE(24,"TABLESPACE"),
    UNION(25,"UNION")
    ; // semicolon needed when fields / methods follow

    private final int engine;
    private String name;


    private TableOptionEnum(int engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //private static Map<Integer, EngineEnum> idMap = new HashMap<Integer, EngineEnum>();
    private static Map<String, TableOptionEnum> nameMap = new HashMap<String, TableOptionEnum>();

    static {
        for (TableOptionEnum engineEnum : TableOptionEnum.values()) {
            nameMap.put(engineEnum.getName(), engineEnum);
        }
    }

    public static TableOptionEnum getTableOptionByName(String name) {
        return nameMap.get(name);
    }

}
