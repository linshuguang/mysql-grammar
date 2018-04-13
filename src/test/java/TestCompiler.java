import name.lsg.grammar.AST;
import name.lsg.grammar.definition.CreateDefinition;
import name.lsg.grammar.statement.CreateTable;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import name.lsg.grammar.Compiler;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by kenya on 2018/3/18.
 */
@ContextConfiguration(locations = {"classpath:applicationContext_mifi_staging.xml"})
public class TestCompiler {

    @Test
    public void testSql() throws Exception {
        String path = null;
        path = "src/test/resources/trade_quality.sql";
        //path = "src/test/resources/test.sql";
        File file = new File(path);

        String sql = FileUtils.readFileToString(file);

        Set<String> uniqueKeySet = new HashSet<>();
        Compiler compiler = new Compiler();
        CreateTable result = (CreateTable)compiler.parse(sql);
        List<AST> astList = result.getCreateDefinitionList();
        for( AST ast : astList) {
            CreateDefinition createDefinition = (CreateDefinition) ast;
            Set<String> mf = createDefinition.manifest();
            uniqueKeySet.addAll(mf);
        }

        for(String uniqueKey : uniqueKeySet){
            System.out.println(uniqueKey);
        }


    }
}
