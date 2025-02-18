package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MultiConfigReader {
    private static Properties properties1;
    private static Properties properties2;

    static {
        properties1 = new Properties();
        properties2 = new Properties();

        try {
            // Load first properties file
            FileInputStream file1 = new FileInputStream("src/test/resources/config.properties");
            properties1.load(file1);
            file1.close();

            // Load second properties file
            FileInputStream file2 = new FileInputStream("config1.properties");
            properties2.load(file2);
            file2.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties files");
        }
    }

    // Method to get property from first file
    public static String getConfig1Property(String key) {
        return properties1.getProperty(key);
    }

    // Method to get property from second file
    public static String getConfig2Property(String key) {
        return properties2.getProperty(key);
    }

  
}
