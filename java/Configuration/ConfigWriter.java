package Configuration;



import java.io.*;
import java.util.Properties;

public class ConfigWriter {
    private static final String CONFIG_FILE = "config1.properties";
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

