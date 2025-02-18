package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigReader {
    private static Properties properties;
 
    // Static block to load properties once
    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }
 
    // Method to get property value
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}