package Registrar.obj;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrar_Loginpage_Object extends Baseclass{
	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();
	public Registrar_Loginpage_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	Actions actions = new Actions(driver);
	

	Scanner myObj = new Scanner(System.in);// Create a Scanner object
	//Login Page
	@FindBy(xpath="//div[text()='Login to your registrar account']")
	public WebElement logintoacctextval ;
	@FindBy(xpath="//div[text()='Email']")
	public WebElement loginemailtextval;
	@FindBy(xpath="//input[@id='email']")
	public WebElement EnterEmailPlaceholder;
	@FindBy(xpath="//input[@type='password']")
	public WebElement EnterpasswordPlaceholder;
	@FindBy(xpath="//div[text()='Password']")
	public WebElement loginpasstextval;
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	public WebElement Forgitpasswordtext;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement Nextbuttontextvl;
	@FindBy(xpath = "//a[normalize-space()='Terms & Conditions']")
	public WebElement Termsconditions_buttons;
	@FindBy(xpath = "//a[normalize-space()='User Manual']")
	public WebElement Usermanual_buttons;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement Enteremailtextbox;
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	public WebElement passwordentertxtbox;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement ClickNextbutton;

	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	public WebElement Regemailotp;
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Verifyotp;
	@FindBy(xpath="//div[@role='alert']")
	public WebElement Toastermessage;

	public void User_textvaladation_in_Login_Page1() throws Exception  {
		
    
		validatetext(logintoacctextval, "Login to your registrar account");
		validatetext(loginemailtextval, "Email");
		validateattribute(EnterEmailPlaceholder,"placeholder", "Enter your email");
		validatetext(loginpasstextval, "Password");
		validateattribute(EnterpasswordPlaceholder,"placeholder", "Enter the strong password");
		validatetext(Forgitpasswordtext, "Forgot password?");
		validatetext(Nextbuttontextvl,"Next");
		String src=driver.getCurrentUrl();
		
        Clickelement(Termsconditions_buttons);
        
       
      
       
		
	
        Set<String> allWindows = driver.getWindowHandles();

        // Store the current window handle
        String currentWindow = driver.getWindowHandle();

        // Loop through all window handles
        for (String window : allWindows) {
            // If the window is not the current one, close it
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                driver.close(); // Close the tab
            
        Thread.sleep(3000);
        
        // Switch back to the original window
        driver.switchTo().window(currentWindow);
        

        // Optionally, you can verify if the correct URL is still open
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Clean up and close the driver
       // driver.quit();
    }


        }
	
	}
	public void User_enter_Username_Password_to_navigate_Home_Page1(String UN, String Password) throws Exception  {
		

	       configWriter.setProperty("RGUsername", UN);
	       configWriter.setProperty("RGPPAss", Password);
	      configWriter.saveProperties();
		
	      Clickelement(Usermanual_buttons);
	        
	     
	  	
	        Set<String> allWindows = driver.getWindowHandles();

	        // Store the current window handle
	        String currentWindow = driver.getWindowHandle();

	        // Loop through all window handles
	        for (String window : allWindows) {
	            // If the window is not the current one, close it
	            if (!window.equals(currentWindow)) {
	                driver.switchTo().window(window);
	                driver.close(); // Close the tab
	            
	        Thread.sleep(3000);
	        
	        // Switch back to the original window
	        driver.switchTo().window(currentWindow);
	        

	        // Optionally, you can verify if the correct URL is still open
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	        // Clean up and close the driver
	       // driver.quit();
	    
		sendkeyweb(Enteremailtextbox, UN);		
		sendkeyweb(passwordentertxtbox, Password);
		Clickelement(ClickNextbutton);
		popupvalidate( "An OTP has been sent to your email.","Invalid Credentials");
		System.out.println("Enter OTP : ");
		
	
		String OTP = myObj.nextLine();
		sendkeyweb(Regemailotp, OTP);
		Clickelement(Verifyotp);
		popupvalidate("Login Success","");
		
		 Thread.sleep(3000);
	        
		
	
	}
	}

}

}