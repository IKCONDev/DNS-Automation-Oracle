package Configuration;



import java.io.*;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigWriter {
    private static final String CONFIG_FILE = "src/test/resources/config.properties";
    private Properties properties;
 
    public ConfigWriter() {
        properties = new Properties();
        loadProperties();  // Load existing properties before modifying
    }
 
    // Load existing properties from file
    private void loadProperties() {
        try (FileInputStream fileInput = new FileInputStream(CONFIG_FILE)) {
            properties.load(fileInput);
        } catch (IOException e) {
            System.out.println("No existing config file found, creating a new one.");
        }
    }
 
    // Set property manually
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
        saveProperties();
    }
 
    // Custom save method to prevent escaping
    public void saveProperties() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONFIG_FILE))) {
            for (String key : properties.stringPropertyNames()) {
                writer.write(key + "=" + properties.getProperty(key) + "\n");  // Manually writing properties
                writer.flush();
            }
 
            System.out.println("Configuration updated successfully without escaping characters!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        ConfigWriter configWriter = new ConfigWriter();
        // Set URL with special characters
        String absolutePath = Paths.get("src/test/resources/Documents/Board.jpg")
        		.toAbsolutePath().toString().replace("\\", "\\\\");
        System.out.println("Absolute Path: " + absolutePath);
//        configWriter.setProperty("GSTIN", "http://10.10.1.138:4200/#/login");
//        configWriter.setProperty("License", "http://10.10.1.138:4200/#/login");
//        configWriter.setProperty("ID", "http://10.10.1.138:4200/#/login");
//        configWriter.setProperty("Aadhar", "http://10.10.1.138:4200/#/login");
        configWriter.setProperty("Board", absolutePath);
        configWriter.setProperty("Aadhar", absolutepath("Board.jpg"));
        System.out.println("Absolute Path: " + absolutepath("GSTIN_22ABCDE1234F1Z2.jpg"));
        System.out.println("Absolute Path: " + absolutepath("Licence.jpeg"));
        System.out.println("Absolute Path: " + absolutepath("Licence.jpeg"));
        System.out.println("Absolute Path: " + absolutepath("Aadhaar_445588776688.jpeg"));
        System.out.println("Absolute Path: " + absolutepath("Organisation_ID.jpg"));
        configWriter.setProperty("GSTIN", absolutepath("GSTIN_22ABCDE1234F1Z2.jpg"));
        configWriter.setProperty("License", absolutepath("Licence.jpeg"));
        configWriter.setProperty("PAN", absolutepath("PAN_DXZOO7654R.jpeg"));
        configWriter.setProperty("ID", absolutepath("Organisation_ID.jpg"));
        configWriter.setProperty("Aadhar", absolutepath("Aadhaar_445588776688.jpeg"));
        
        // Save the changes
        configWriter.saveProperties();
    }
    public static String absolutepath(String src) {
	    File f = new File("src/test/resources/Documents/"+src); 
	    return f.getAbsolutePath().toString().replace("\\", "\\\\");
	    }
    public static void main1() {
//    	String absolutePath = Paths.get("src/test/resources/Documents/Board.jpg")
//    			.toAbsolutePath().toString().replace("\\", "\\\\");
//        System.out.println("Absolute Path: " + absolutePath);
        
        
    }

}
 

/*
public class ConfigWriter {
    private static final String CONFIG_FILE = "src\\test\\resources\\config2.properties";
    private Properties properties;

    public ConfigWriter() {
        properties = new Properties();
        loadProperties();  // Load existing properties before modifying
    }

    // Load existing properties from file
    private void loadProperties() {
        try (FileInputStream fileInput = new FileInputStream(CONFIG_FILE)) {
            properties.load(fileInput);
        } catch (IOException e) {
            System.out.println("No existing config file found, creating a new one.");
        }
    }

    // Set property manually
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }

    // Custom save method to prevent escaping
    public void saveProperties() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CONFIG_FILE))) {
            writer.write("# Updated Configuration at Runtime\n");
            writer.flush();

            for (String key : properties.stringPropertyNames()) {
                writer.write(key + "=" + properties.getProperty(key) + "\n");  // Manually writing properties
                writer.flush();
            }

            System.out.println("Configuration updated successfully without escaping characters!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        ConfigWriter configWriter = new ConfigWriter();
//
//        // Set URL with special characters
//        configWriter.setProperty("url", "http://10.10.1.138:4200/#/login");
//
//        // Save the changes
//        configWriter.saveProperties();
//    }
}
*/
