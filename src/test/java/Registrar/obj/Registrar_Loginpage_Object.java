package Registrar.obj;

import java.util.Scanner;

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

	public void User_textvaladation_in_Login_Page1() {
		validatetext(logintoacctextval, "Login to your registrar account");
		validatetext(loginemailtextval, "Email");
		validateattribute(EnterEmailPlaceholder,"placeholder", "Enter your email");
		validatetext(loginpasstextval, "Password");
		validateattribute(EnterpasswordPlaceholder,"placeholder", "Enter the strong password");
		validatetext(Forgitpasswordtext, "Forgot password?");
		validatetext(Nextbuttontextvl,"Next");
	}

	@FindBy(xpath="//input[@id='email']")
	public WebElement Enteremailtextbox;
	@FindBy(xpath="//input[@placeholder='Enter the strong password']")
	public WebElement passwordentertxtbox;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement ClickNextbutton;

	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	public WebElement Regemailotp;
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Verifyotp;
	@FindBy(xpath="//div[@role='alert']")
	public WebElement Toastermessage;
	
	public void User_enter_Username_Password_to_navigate_Home_Page1(String UN, String Password) throws Exception {
		

	       configWriter.setProperty("RGUsername", UN);
	       configWriter.setProperty("RGPPAss", Password);
	      configWriter.saveProperties();
		
		
		sendkeyweb(Enteremailtextbox, UN);		
		
		sendkeyweb(passwordentertxtbox, Password);
		Clickelement(ClickNextbutton);
		Thread.sleep(5000);
		validatetext(Toastermessage,"An OTP has been sent to you email.");
		System.out.println("Enter OTP : ");
		String OTP = myObj.nextLine();
		sendkeyweb(Regemailotp, OTP);
		Clickelement(Verifyotp);
		Thread.sleep(1500);
		validatetext(Toastermessage, "Login Success");
	}
}
