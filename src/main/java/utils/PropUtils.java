package utils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtils {
    private static Properties properties;
    static {
        InputStream in;
        try {
            properties = new Properties();
            in = Class.class.getResourceAsStream("/application.properties");
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static  String  getProp(String key){
        return properties.getProperty(key);
    }

}
