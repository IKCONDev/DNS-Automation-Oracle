package Drivermanager;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	
	public static WebDriver driver;
	
		static {		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.70");
		options.addArguments("high-dpi-support=0.80");
		Map<String, Integer> timeouts = new HashMap<String, Integer>();
		timeouts.put("implicit", 30000);
		options.setCapability("timeouts", timeouts);
		driver = new ChromeDriver(options);
	}
	public void setupBrowser() {
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
