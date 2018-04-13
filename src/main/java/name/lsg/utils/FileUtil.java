package name.lsg.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;

/**
 * Created by kenya on 2018/4/13.
 */
public class FileUtil {

    public static String ROOT_PATH = "src/test/resources/";

    public static String readContent(String fileName){
        String path = ROOT_PATH + fileName;
        File file = new File(path);
        String sql = "";
        try{
            sql = FileUtils.readFileToString(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return sql;
    }
}
