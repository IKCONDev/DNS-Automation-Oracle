package Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

 
public class ConfigReader {
    private static final String CONFIG_FILE_1 = "src/test/resources/config.properties";
    private static final String CONFIG_FILE_2 = "config1.properties";
    private static Properties properties = new Properties();
 
    static {
        // Load properties from multiple config files
        try (FileInputStream fis1 = new FileInputStream(CONFIG_FILE_1);
             FileInputStream fis2 = new FileInputStream(CONFIG_FILE_2)) {
            properties.load(fis1);  // Load from config1
            properties.load(fis2);  // Load from config2 (overwrites any duplicates)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get property from first file
    public static String getProperty(String key) {
    	ConfigReader.reloadConfigs();
        return properties.getProperty(key);
    }
 
    public static void reloadConfigs() {
        properties.clear();
        try (FileInputStream fis1 = new FileInputStream(CONFIG_FILE_1);
             FileInputStream fis2 = new FileInputStream(CONFIG_FILE_2)) {
            properties.load(fis1);
            properties.load(fis2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
  
//    public static void main(String[] args) {
//        System.out.println(MultiConfigReader.getConfigProperty("ex1"));
//        System.out.println(MultiConfigReader.getConfigProperty("ex2"));
// 
//        // If properties are updated by another process, reload them
//        MultiConfigReader.reloadConfigs();
//        System.out.println(MultiConfigReader.getConfigProperty("ex9"));
//    }
    
    
}

/*  private static Properties properties1;

    private static Properties properties2;
 
    // Method to get property value
 
    static {

        properties1 = new Properties();

        properties2 = new Properties();
 
        try {

            // Load first properties file

            FileInputStream file1 = new FileInputStream("src\\test\\resources\\config.properties");

            properties1.load(file1);

            file1.close();
 
            // Load second properties file

            FileInputStream file2 = new FileInputStream("src\\test\\resources\\config2.properties");

            properties2.load(file2);

            file2.close();
 
        } catch (IOException e) {

            e.printStackTrace();

            throw new RuntimeException("Failed to load properties files");

        }

    }
    
    public static String getProperty(String key) {
        return properties1.getProperty(key);
    }
    
    public static String getProperty1(String key) {
        return properties2.getProperty(key);
    }*/
