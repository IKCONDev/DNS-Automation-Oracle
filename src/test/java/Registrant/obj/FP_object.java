package Registrant.obj;

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
	
	
	@FindBy(xpath = "//div[contains(.,'Forgot Password') and @class='loginMsg']")
	public WebElement Forgot_password_heading;
	@FindBy(xpath = "//p[normalize-space()='Verify your email to reset the password']")
	public WebElement Verify_your_email;
	@FindBy(xpath = "//div[normalize-space()='Email ID']")
	public WebElement email_label;
	@FindBy(xpath = "//div[normalize-space()='If you remember your password click']")
	public WebElement Remember_password;
	@FindBy(xpath = "//div[normalize-space()='The OTP will be sent to your registered/verified email id.']")
	public WebElement OTP_will_sent;
	@FindBy(xpath = "//a[normalize-space()='back to login']")
	public WebElement back_to_login;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	public WebElement Next_button;
	@FindBy(xpath = "//input[@type='email']")
	public WebElement email_input;//Enter your registered email ID
	
	public void user_enters_and_get_otp(String string) {
		validatetext(Forgot_password_heading, "Forgot Password");
		validatetext(Verify_your_email, "Verify your email to reset the password");
		validatetext(email_label, "Email");
		try {
		validatetext(Remember_password, "If you remember your password click");
		validatetext(OTP_will_sent, "The OTP will be sent to your registered/verified email id.");
		
		validatetext(back_to_login, "back to login");
		}catch (Exception e) {
			// TODO: handle exception
		}
		validateattribute(email_input,"placeholder", "Enter your official Email ID");
		sendkeyweb(email_input, string);
		Clickelement(Next_button);
		popupvalidate("Please enter a valid email address.","OTP sent successfully to your email ID.");
	}
	
	@FindBy(xpath = "(//div[@class='loginMsg'])[1]")
	public WebElement Enter_the_Otp;	
	@FindBy(xpath = "//div[normalize-space()='OTP']")
	public WebElement OTP_label;
	@FindBy(xpath = "//p[normalize-space()='Enter the OTP sent to your registered email address']")
	public WebElement Enter_otp_reg;
	@FindBy(xpath = "//div[normalize-space()='Resend OTP']")
	public WebElement Resend_otp;
	@FindBy(xpath = "//div[normalize-space()='After verify the OTP you will able to reset your password.']")
	public WebElement After_verify_Otp;
	@FindBy(xpath = "//button[normalize-space()='Verify']")
	public WebElement Verify_button;
	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	public WebElement otp_input;//Enter OTP
	@FindBy(xpath = "//p[normlize-space()='OTP has expired']")
	public WebElement OTP_expired;
	public void user_enters_the_otp() {
		validatetext(Enter_the_Otp, "Email OTP Verification");
		validatetext(OTP_label,"OTP");
		validatetext(Enter_otp_reg,"Enter the OTP sent to your registered email address");
		validatetext(Resend_otp, "Resend OTP");
//		validatetext(After_verify_Otp, "After verify the OTP you will able to reset your password.");
		validatetext(Verify_button, "Verify");
		validateattribute(otp_input,"placeholder","Enter OTP");
		System.out.println("Please Enter OTP :");
		String otp=sc.nextLine();
		sendkeyweb(otp_input, otp);
		Clickelement(Verify_button);
		popupvalidate("OTP verified successfully!","Please enter a valid OTP.");
		try {
		if(OTP_expired.isDisplayed()) {
			validatetext(OTP_expired, "OTP has expired");
			Clickelement(Resend_otp);
			popupvalidate("OTP resent successfully to your email ID.","");
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	@FindBy(xpath ="//div[normalize-space()='Reset your password']") 
	public WebElement FP_Head;
	@FindBy(xpath ="//p[normalize-space()='Create the strong password']") 
	public WebElement Create_password;
	@FindBy(xpath ="//div[normalize-space()='Password']") 
	public WebElement label_password;
	@FindBy(xpath ="//div[normalize-space()='Confirm Password']") 
	public WebElement label_cnfpassword;
	@FindBy(xpath ="//input[@placeholder='Enter your strong password']") 
	public WebElement input_newpassword;
	@FindBy(xpath ="//input[@placeholder='Re-enter the password']") 
	public WebElement input_cnfpassword;
	@FindBy(xpath ="//button[normalize-space()='Reset Password']") 
	public WebElement Reset_password;
	@FindBy(xpath ="//div[contains(@class,'error-message')]") 
	public WebElement Errormsg;
	
	
	
	public void user_entes_the_new_and_confirm(String string, String string2) {
		validatetext(FP_Head, "Reset your password");
		validatetext(Create_password, "Create the strong password");
		validatetext(label_password, "New Password");
		validatetext(label_cnfpassword, "Confirm Password");
		validateattribute(input_newpassword,"placeholder", "Enter your strong password");
		validateattribute(input_cnfpassword,"placeholder","Re-enter the password");
		sendkeyweb(input_newpassword, "abcdefghi");
		sendkeyweb(input_cnfpassword, string2);
		validatetext(Errormsg,"Password must be at least 8 characters long, include at least one uppercase letter, one lowercase letter, one digit, and one special character");
		sendkeyweb(input_newpassword, string);
		Clickelement(Reset_password);
		popupvalidate("Password reset successfully."," Passwords do not match.");
	}
	

	
	
}
