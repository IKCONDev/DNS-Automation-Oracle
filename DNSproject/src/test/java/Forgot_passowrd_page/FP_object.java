package Forgot_passowrd_page;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Drivermanager.Driver;
import hooks.Baseclass;

public class FP_object extends Baseclass{

	WebDriver driver = Driver.getDriver();
	public FP_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	Scanner sc=new Scanner(System.in);
	@FindBy(xpath = "//div[contains(text(),'Forgot Password')]")
	public WebElement Forgot_password_link;

	public void navigate_Forgot_password_page() {
		validatetext(Forgot_password_link, "Forgot Password");
		Clickelement(Forgot_password_link);
	}
	
	@FindBy(xpath = "//h1[contains(.,'Forgot Password')]")
	public WebElement Forgot_password_heading;
	@FindBy(xpath = "//div[normalize-space()='Verify your email to reset the password']")
	public WebElement Verify_your_email;
	@FindBy(xpath = "//div[normalize-space()='Email']")
	public WebElement email_label;
	@FindBy(xpath = "//div[normalize-space()='If you remember your password click']")
	public WebElement Remember_password;
	@FindBy(xpath = "//div[normalize-space()='The OTP will be sent to your registered/verified email id.']")
	public WebElement OTP_will_sent;
	@FindBy(xpath = "//a[normalize-space()='back to login']")
	public WebElement back_to_login;
	@FindBy(xpath = "//button[normalize-space()='Get OTP']")
	public WebElement Get_otp_button;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement email_input;//Enter your registered email ID
	
	public void user_enters_and_get_otp(String string) {
		validatetext(Forgot_password_heading, "Forgot Password");
		validatetext(Verify_your_email, "Verify your email to reset the password");
		validatetext(email_label, "Email");
		validatetext(Remember_password, "If you remember your password click");
		validatetext(OTP_will_sent, "The OTP will be sent to your registered/verified email id.");
		validatetext(back_to_login, "back to login");
		validateattribute(email_input,"placeholder", "Enter your registered email ID");
		sendkeyweb(email_input, string);
		Clickelement(Get_otp_button);
		
	}
	
	@FindBy(xpath = "//div[normalize-space()='Enter the OTP sent to your registered email ID']")
	public WebElement Enter_the_Otp;	
	@FindBy(xpath = "//div[normalize-space()='OTP']")
	public WebElement OTP_label;
	@FindBy(xpath = "//div[normalize-space()='Enter the OTP sent to your registered email id.']")
	public WebElement Enter_otp_reg;
	@FindBy(xpath = "//div[normalize-space()='Resend OTP']")
	public WebElement Resend_otp;
	@FindBy(xpath = "//div[normalize-space()='After verify the OTP you will able to reset your password.']")
	public WebElement After_verify_Otp;
	@FindBy(xpath = "//button[normalize-space()='Verify']")
	public WebElement Verify_button;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement otp_input;//Enter OTP
	
	public void user_enters_the_otp() {
		validatetext(Enter_the_Otp, "Enter the OTP sent to your registered email ID");
		validatetext(OTP_label,"OTP");
		validatetext(Enter_otp_reg,"Enter the OTP sent to your registered email id.");
		validatetext(Resend_otp, "Resend OTP");
		validatetext(After_verify_Otp, "After verify the OTP you will able to reset your password.");
		validatetext(Verify_button, "Verify");
		validateattribute(otp_input,"placeholder","Enter OTP");
		String otp=sc.nextLine();
		sendkeyweb(otp_input, otp);
		Clickelement(Verify_button);
		
	}
	
	@FindBy(xpath ="//div[normalize-space()='Your new password must be different to previously used passwords.']") 
	public WebElement Your_new_password;
	@FindBy(xpath ="//div[normalize-space()='Password']") 
	public WebElement label_password;
	@FindBy(xpath ="//div[normalize-space()='Confirm Password']") 
	public WebElement label_cnfpassword;
	@FindBy(xpath ="//input[@name='newPassword']") 
	public WebElement input_newpassword;
	@FindBy(xpath ="//input[@name='confirmPassword']") 
	public WebElement input_cnfpassword;
	@FindBy(xpath ="//button[normalize-space()='Reset Password']") 
	public WebElement Reset_password;

	public void user_entes_the_new_and_confirm(String string, String string2) {
		
		validatetext(Your_new_password, "Your new password must be different to previously used passwords.");
		validatetext(label_password, "Password");
		validatetext(label_cnfpassword, "Confirm Password");
		validateattribute(input_newpassword,"placeholder", "Enter the strong password");
		validateattribute(input_cnfpassword,"placeholder","Re-enter the password");
		sendkeyweb(input_newpassword, string);
		sendkeyweb(input_cnfpassword, string2);
		Clickelement(Reset_password);
		
	}
	

	
	
}
