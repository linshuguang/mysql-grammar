package name.lsg.grammar.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kenya on 2018/5/3.
 */
public enum EngineEnum {
    ARCHIVE(1,"ARCHIVE"),
    BLACKHOLE(2,"BLACKHOLE"),
    CSV (3,"CSV"),
    FEDERATED(4,"FEDERATED"),
    INNODB (5,"INNODB"),
    MEMORY (6,"MEMORY"),
    MRG_MYISAM (7,"MRG_MYISAM"),
    MYISAM (8,"MYISAM"),
    NDB (9,"NDB"),
    NDBCLUSTER(10,"NDBCLUSTER"),
    PERFOMANCE_SCHEMA(11,"PERFOMANCE_SCHEMA");


    private final int engine;
    private String name;


    private EngineEnum(int engine, String name) {
        this.engine = engine;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //private static Map<Integer, EngineEnum> idMap = new HashMap<Integer, EngineEnum>();
    private static Map<String, EngineEnum> nameMap = new HashMap<String, EngineEnum>();

    static {
        for (EngineEnum engineEnum : EngineEnum.values()) {
            nameMap.put(engineEnum.getName(), engineEnum);
        }
    }

    public static EngineEnum getEngineByName(String name) {
        return nameMap.get(name);
    }

}
