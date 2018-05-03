package name.lsg.grammar.engine;

import name.lsg.grammar.AST;
import name.lsg.grammar.model.EngineEnum;

/**
 * Created by kenya on 2018/5/3.
 */
public class EngineName extends AST {

    EngineEnum engineEnum ;

    public EngineName(String name){
        engineEnum = EngineEnum.getEngineByName(name.toUpperCase());
    }

    public String getEngineName(){
        return engineEnum.getName();
    }

}
