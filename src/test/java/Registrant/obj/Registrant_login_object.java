package Registrant.obj;

import java.awt.AWTException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrant_login_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	Actions ac=new Actions(driver);
	ConfigWriter configWriter = new ConfigWriter();
	public Registrant_login_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);		
	}

	Scanner myObj = new Scanner(System.in);// Create a Scanner objectF
	
	
	public void user_navigate_to_Registration_page() throws Exception {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(5000);
	        Set<String> allWindows = driver.getWindowHandles();
	        // Store the current window handle
	        String currentWindow = driver.getWindowHandle();
	        // Loop through all window handles
	        for (String window : allWindows) {
	            // If the window is not the current one, close it
	            if (!window.equals(currentWindow)) {
	                driver.switchTo().window(window);
	                Thread.sleep(3000);
	                driver.close(); // Close the tab
	        // Switch back to the original window
	        driver.switchTo().window(currentWindow);
	        // Optionally, you can verify if the correct URL is still open
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	      
	    }

	        }
		
		}
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	public WebElement privcypolicy_buttons;

	
	public void user_navigate_to_Registration_page1() throws Exception {
		 Thread.sleep(5000);
		 Clickelement(privcypolicy_buttons);
	        Set<String> allWindows = driver.getWindowHandles();
	        // Store the current window handle
	        String currentWindow = driver.getWindowHandle();

	        // Loop through all window handles
	        for (String window : allWindows) {
	            // If the window is not the current one, close it
	            if (!window.equals(currentWindow)) {
	                driver.switchTo().window(window);
	                Thread.sleep(5000);
	                driver.close(); // Close the tab
	        
	        // Switch back to the original window
	        driver.switchTo().window(currentWindow);
	        // Optionally, you can verify if the correct URL is still open
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	        // Clean up and close the driver
	       // driver.quit();
	        validatetext(Register_buttons, "Register");
			Clickelement(Register_buttons);
	            }
	            
	        }
	        
	}
	
	@FindBy(xpath = "//a[contains(.,'Register')]")
	public WebElement Register_buttons;
	
	public void user_validating_landing_page() {
		
	}
	

	@FindBy(xpath = "//input[contains(@placeholder,'name')]")
	public WebElement Register_username;
	@FindBy(xpath = "//input[contains(@id,'email')]")
	public WebElement Register_emailid;
	@FindBy(xpath = "//button[@id='email-btn']")
	public WebElement Register_email_verify_button;
	@FindBy(xpath = "//input[@placeholder='Enter your OTP']")
	public WebElement Register_email_otp;
	@FindBy(xpath = "//span[contains(.,'Send OTP')]")
	public WebElement Register_verify_button;
	@FindBy(xpath = "//input[contains(@placeholder,'number')]")
	public WebElement Register_number;
	@FindBy(xpath = "//input[contains(@placeholder,'g password')]")
	public WebElement Register_password;
	@FindBy(xpath = "//input[contains(@placeholder,'e password')]")
	public WebElement Register_cnf_password;
	@FindBy(xpath = "//input[@type='checkbox']")
	public List<WebElement> Registration_checkbox;
	@FindBy(xpath = "//button[contains(.,'Register')]")
	public WebElement Registration_button;
	@FindBy(xpath = "//div[normalize-space()='Register using official email ID']")
	public WebElement Registration_page_head;
	@FindBy(xpath = "//div[contains(text(),'Full Name')]")
	public WebElement Name_label;
	@FindBy(xpath = "//div[contains(text(),'Email')]")
	public WebElement Email_label;
	@FindBy(xpath = "//div[contains(text(),'Mobile Number')]")
	public WebElement Mobile_label;
	@FindBy(xpath = "//div[contains(text(),'Password')]")
	public List<WebElement> Password_label;
	@FindBy(xpath = "//label[contains(text(),'I agree to the Disclaimer and the Privacy Policy laid down by RBI')]")
	public WebElement Checkboxtext;
	@FindBy(xpath = "//label[contains(text(),'I declare that the usage of this portal is for my own legitimate purpose')]")
	public WebElement Checkboxtext1;	
	@FindBy(xpath = "//a[contains(.,'Login')]")
	public WebElement Login_linktext;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void jssendkeys(WebElement e,String src) {
		js.executeScript("arguments[0].value = arguments[1];", e, src);
		// Optionally trigger 'input' or 'change' events
		js.executeScript("arguments[0].dispatchEvent(new Event('input'));", e);

	}
	
	public void Validate_Registaration_page() {
		validatetext(Login_linktext, "Login");
		validatetext(Registration_page_head, "Register using official email ID");
		validatetext(Name_label, "Full Name");
		validatetext(Email_label, "Email");
		validatetext(Mobile_label, "Mobile Number");
		validatetext(Password_label.get(0), "Password");
		validatetext(Password_label.get(1), "Confirm Password");
		validatetext(Checkboxtext, "I agree to the Disclaimer and the Privacy Policy laid down by RBI");
		validatetext(Checkboxtext1, "I declare that the usage of this portal is for my own legitimate purpose");
		validateattribute(Register_emailid, "placeholder", "Enter your authorized individual email to receive an OTP");
		validateattribute(Register_number, "placeholder", "Enter 10-digit mobile number");
		validateattribute(Register_username, "placeholder", "Enter your full name");
		validateattribute(Register_password, "placeholder", "Enter the strong password");
		validateattribute(Register_cnf_password, "placeholder", "Re-enter the password");
	}
	
	@FindBy(xpath = "//h5[contains(.,'Email Verification')]")
	public WebElement Email_verification_heading;
	@FindBy(xpath = "//button[normalize-space()='Verify']")
	public WebElement Verify_otp;
	@FindBy(xpath = "//div[contains(@class,'error-message')]")
	public WebElement Error_msg;
	
	public String SplitNameFromEmail(String email) {
	        String[] parts = email.split("@");
	        String namePart = parts[0];  
	        String[] nameParts = namePart.split("\\.");
	        String firstName = nameParts[0];  
	        String lastName = nameParts.length > 1 ? nameParts[1] : "";  
	        
	        if(lastName.isEmpty()) {
	        	return firstName;
	        }else {
	        return firstName+" "+lastName;}
	}
	
	@FindBy(xpath = "//div[contains(@class,'error-message')]")
	public List<WebElement> Error_msgs;
	
	public void User_Register_An_Account(String username,String Password) throws InterruptedException {
		configWriter.setProperty("Username", username);
		configWriter.setProperty("Password", Password);
		String stv="Mobile number should not be empty,Name should not be empty.,Password should not be empty,Confirm password should not be empty"
		 +",You must agree to the terms and conditions to proceed.";
		
		 jssendkeys(Register_emailid,username);
		Thread.sleep(1000);
		Clickelement(Register_verify_button);
		//driver.switchTo().alert().accept();
		System.out.println("Enter OTP : ");
		String OTP = myObj.nextLine();
		sendkeyweb(Register_email_otp, OTP);
		Thread.sleep(1000);
		Clickelement(Verify_otp);
		popupvalidate("OTP verification successful", "Please enter valid OTP.");
		configWriter.setProperty("nameuser", SplitNameFromEmail(username));
		Clickelement(Registration_button);
		Table_prop(Error_msgs, stv);
		sendkeyweb(Register_number, "9856836589");
		sendkeyweb(Register_username, SplitNameFromEmail(username));
		sendkeyweb(Register_password, Password);
		sendkeyweb(Register_cnf_password, Password);
		Clickelement(Registration_checkbox.get(0));
		Clickelement(Registration_checkbox.get(1));
		validatetext(Registration_button, "Register");
		System.out.println("Please clear the captcha");
		String captcha = myObj.nextLine();
		System.out.println(captcha);
		Clickelement(Registration_button);
		Thread.sleep(5000);
		popupvalidate("User registration successful","OTP verification successful");
		
		 
	}

	@FindBy(xpath = "//div[@id='signInDropdown']")
	public WebElement Signin_dropdown;
	@FindBy(xpath = "//a[normalize-space()='Sign In']")
	public WebElement Signin_link;
	@FindBy(xpath = "//button[@routerlink='/login']")
	public WebElement Signin_button;
	//button[contains(text(),'Continue to Login')]
	public void user_navigate_to_login_page() throws Exception {
		
			validatetext(Signin_button, "Continue to Login");
			Thread.sleep(3000);
			Clickelement(Signin_button);
	}

	
	@FindBy(xpath = "//h1[contains(@placeholder,'Login')]")
	public WebElement Signin;	
	@FindBy(xpath = "//input[contains(@placeholder,'email')]")
	public WebElement Signin_email;
	@FindBy(xpath = "//input[contains(@placeholder,'password')]")
	public WebElement Signin_password;
	@FindBy(xpath = "//button[@id='otp-btn']")
	public WebElement Signin_otp_button;
	@FindBy(xpath = "//div[contains(text(),'Login to your account')]")
	public WebElement login_title;	
	@FindBy(xpath = "//div[normalize-space()='Authorized Email ID' or normalize-space()='Authorized Email ID']")
	public WebElement email_label;	
	@FindBy(xpath = "(//div[normalize-space()='Password'])[2]")
	public WebElement Passowrd_label;
	@FindBy(xpath = "//div[normalize-space()='OTP']")
	public WebElement OTP_label;	
	@FindBy(xpath = "//p[normalize-space()='Enter the OTP sent to your registered email ID']")
	public WebElement OTP_Enter;
	@FindBy(xpath = "//p[normalize-space()='Unauthorized access to this application is an offense and shall be prosecuted under the appropriate Indian Penal Code']")
	public WebElement Unauthorized_access;
	@FindBy(xpath = "//a[normalize-space()='Resend OTP']")
	public WebElement OTP_Resend;
	@FindBy(xpath = "//button[normalize-space()='Next']")
	public WebElement Next_button;
	@FindBy(xpath = "//div[normalize-space()='Email OTP Verification']")
	public WebElement Login_OTP_verification_head;
	@FindBy(xpath = "//div[normalize-space()='OTP']")
	public WebElement Login_OTP_label;
	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	public WebElement Login_OTP_input;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	public WebElement Login_button;
	//div[normalize-space()='OTP']
	@FindBy(xpath = "//p[normalize-space()='OTP has expired']")
	public WebElement OTP_expired;
	@FindBy(xpath = "//div[normalize-space()='Resend OTP']")
	public WebElement Resend_OTP;
	@FindBy(xpath = "//div[normalize-space()='Forgot password?']")
	public WebElement Forget_password;
	
	
	public void user_enters_and(String UN, String Password) throws InterruptedException {
		
		sendkeyweb(Signin_email, UN);
		sendkeyweb(Signin_password, Password);
		System.out.println("Please clear the captcha");
		String captcha = myObj.nextLine();
		System.out.println(captcha);
		Clickelement(Next_button);
		
		popupvalidate("An OTP has been sent to your email.","Invalid Credentials");
		System.out.println("Enter OTP:");
		String OTP = myObj.nextLine();
		sendkeyweb(Login_OTP_input, OTP);
		Clickelement(Login_button);
		Thread.sleep(1500);
		popupvalidate("Login Successful","Invalid Credentials");
		Thread.sleep(2000);
		
		
	}
	public void user_enters_pand() throws InterruptedException {
		sendkeyweb(Signin_email, ConfigReader.getProperty("Username"));
		sendkeyweb(Signin_password, ConfigReader.getProperty("Password"));
		System.out.println("Please clear the captcha");
		String captcha = myObj.nextLine();
		System.out.println(captcha);
		Clickelement(Next_button);
		popupvalidate("An OTP has been sent to your email.","Invalid Credentials");
		System.out.println("Enter OTP:");
		String OTP = myObj.nextLine();
		sendkeyweb(Login_OTP_input, OTP);
		Clickelement(Login_button);
		Thread.sleep(1500);
		popupvalidate("Login Successful","Invalid Credentials");
		Thread.sleep(2000);
		
	}
	
	@FindBy(xpath = "(//div[normalize-space()='Enter email'])[2]")
	public WebElement Enter_mail_error;
	@FindBy(xpath = "(//div[normalize-space()='Enter password'])")
	public WebElement Enter_password_error;
	public void validate_login_page() {
		validatetext(login_title, "Login to your account");
		validatetext(email_label, "Email ID");
		validatetext(Passowrd_label, "Password");
		validateattribute(Signin_email, "placeholder", "Enter your email");
		validateattribute(Signin_password, "placeholder", "Enter your password");
		Clickelement(Next_button);
		validatetext(Forget_password,"Forgot password?");
		popupvalidate("Login Successful", "");
	}

	
	@FindBy(xpath = "//h1[normalize-space()='Sign Using DSC']")
	public WebElement DSC_head;
	@FindBy(xpath = "//select[@id='tokenSelect']")
	public WebElement DSC_token;
	//
	@FindBy(xpath = "//select[@id='certificateSelect']")
	public WebElement DSC_certificate;
	// 
	@FindBy(xpath = "//select[@id='dataTypeSelect']")
	public WebElement DSC_datetype;
	//1: TextPKCS7
	@FindBy(xpath = "//input[@id='passwordInput']")
	public WebElement DSC_password;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	public WebElement DSC_submit;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public WebElement DSC_Cancel;
	
	
	@FindBy(xpath = "//button[normalize-space()='Proceed with DSC']")
	public WebElement Proceedwithdsc;
	
	public void DSC_token() throws InterruptedException {
		try {
			Clickelement(Proceedwithdsc);
			popupvalidate("Login Successful","Fetched tokens successfully");
		} catch (Exception e) {
		}
		Selectdropdown(DSC_token, "1");
		Selectdropdown(DSC_certificate, "1");
		sendkeyweb(DSC_password, "Idrbt@123");
		Clickelement(DSC_submit);
		String captcha = myObj.nextLine();
		System.out.println(captcha);
		
	}
	public void DSC_token2() {
		try {
			Clickelement(Next_button);
		} catch (Exception e) {
		}
		try {
			popupvalidate("Signed using DSC successful", "emty");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@FindBy(xpath = "//button[normalize-space()='Got it!']")
	public WebElement Domain_button;
	@FindBy(xpath = "//input[contains(@placeholder,'Identi')]")
	public WebElement Bank_name;
	@FindBy(xpath = "//select[@id='zoneInput']")
	public WebElement Zone_input;
	@FindBy(xpath = "//button[contains(text(),'Save & Next')]")
	public  List<WebElement> Save_next;
	@FindBy(xpath = "//input[contains(@placeholder,'y name')]")
	public WebElement org_name;
	@FindBy(xpath = "//input[contains(@placeholder,'pincode')]")
	public WebElement org_pin;
	@FindBy(xpath = "//input[contains(@placeholder,'address')]")
	public WebElement org_address;
	@FindBy(xpath = "(//input[contains(@placeholder,'STD Code')])[1]")
	public WebElement STD_Code;
	@FindBy(xpath = "(//input[contains(@placeholder,'STD Code')])[2]")
	public WebElement STD_Code1;
	@FindBy(xpath = "(//input[contains(@placeholder,'STD Code')])[3]")
	public WebElement STD_Code2;
	@FindBy(xpath = "(//input[contains(@placeholder,'STD Code')])[4]")
	public WebElement STD_Code3;
	@FindBy(xpath = "//input[contains(@placeholder,'Country Code')]")
	public WebElement Country_Code;
	@FindBy(xpath = "(//input[contains(@placeholder,'Tele')])[1]")
	public WebElement org_telephone;
	@FindBy(xpath = "(//input[contains(@placeholder,'Tele')])[2]")
	public WebElement org_telephone1;
	@FindBy(xpath = "(//input[contains(@placeholder,'Tele')])[3]")
	public WebElement org_telephone2;
	@FindBy(xpath = "(//input[contains(@placeholder,'Tele')])[4]")
	public WebElement org_telephone3;
	@FindBy(xpath = "//input[@id='mobileNumber']")
	public WebElement org_number;
	@FindBy(xpath = "//input[@id='adminAltPhone']")
	public WebElement Admin_number;
	@FindBy(xpath = "//input[@id='techAltPhone']")
	public WebElement Tech_number;
	@FindBy(xpath = "//input[@id='billAltPhone']")
	public WebElement Bill_number;
	@FindBy(xpath = "//input[contains(@placeholder,'l address')]")
	public WebElement org_email;
	@FindBy(xpath = "//select[@id='organisationDocType']")
	public WebElement org_doc;
	@FindBy(xpath = "//input[contains(@placeholder,'Organization GSTIN')]")
	public WebElement org_GST;
	@FindBy(xpath = "//button[contains(text(), 'Select File & Upload')]")
	public WebElement org_select_file;
	@FindBy(xpath = "//input[contains(@placeholder,'PAN')]")
	public WebElement org_PAN;
	@FindBy(xpath = "//input[contains(@placeholder,'License Given By RBI')]")
	public WebElement org_Lic;//Enter Regulatory RBI License
	
	@FindBy(xpath = "//h1[normalize-space()='Domain']")
	public WebElement Domain_validate;
	@FindBy(xpath = "//label[contains(normalize-space(),'Name')]")
	public WebElement Bank_name_label;
	@FindBy(xpath = "//label[normalize-space()='Domain']")
	public WebElement Domain_label;
	@FindBy(xpath = "//div[contains(text(),'Name Identifiers to be Reserved')]")
	public WebElement ExtraCost;
	@FindBy(xpath = "//h2[contains(text(),'Price Summary')]")
	public WebElement Price_summary;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement addalisname;
	@FindBy(xpath = "//button[contains(text(),'Add')]")
	public WebElement addbuttonclick;
	@FindBy(xpath = "(//a[@class='link-button'])[1]")
	public WebElement PrerequisitesDocumentview;
	@FindBy(xpath = "(//a[@class='link-button'])[2]")
	public WebElement DomainRegistaryDocumentview;
	@FindBy(xpath = "(//a[@class='link-button'])[3]")
	public WebElement ManagementDocumentview;
	@FindBy(xpath = "//button[contains(text(), 'Got it')]")
	public WebElement Clickcountinue;
	
	//button[normalize-space()='Next']
	@FindBy(xpath = "//button[normalize-space()='Next']")
	public WebElement nextbutton;
	@FindBy(xpath = "//tr")
	public List<WebElement> Price_summary_obj;
	@FindBy(xpath = "(//input[@type='file'])[2]")
	public WebElement Board_doc;
	
	@FindBy(xpath = "//label[contains(.,'2 Letter Domain Board Approval Document')]")
	public WebElement Twoletter;
	
	
	@FindBy(xpath = "//div[@class='card']")
	public List<WebElement> card;
	
	public void user_should_get_logged_in(String domain) throws InterruptedException, AWTException{
	
       configWriter.setProperty("Domain", domain);
       configWriter.setProperty("DomainName", domain+".bank.in");
		Thread.sleep(2000);
		validatetext(Domain_button, "Got it!");
		Clickelement(Domain_button);
		validatetext(Domain_validate, "Domains");
		validatetext(Bank_name_label, "Domain Name");//Domain Name
		validatetext(Domain_label, "Domain");
		validateattribute(Bank_name,"placeholder","Enter Your Entity Identifier");
		sendkeyweb(Bank_name, domain);
		Selectdropdown(Zone_input, ".bank.in");// .fin.in
		Clickelement(Search);
		if (card.get(1).getText().contains("2 Letter Domain Board Approval Document")) {
			Clickelement(Board_doc);
			fileupload_robot(ConfigReader.getProperty("Board1"));
		}		
		validatetext(ExtraCost, "Name Identifiers to be Reserved");
		sendkeyweb(addalisname, domain+"one");
		Clickelement(addbuttonclick);
		validatetext(Price_summary, "Price Summary");
		String price_summary="ITEM	PRICE,Domain Price	₹,Name Identifier Price	₹,,Grand Total	₹";
		Table_prop(Price_summary_obj, price_summary);
		ac.scrollByAmount(0, 500).build().perform();
		clickmultipleweb(Save_next);
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println("alert not displayed");
		}
		Thread.sleep(2000);
	}
	@FindBy(xpath = "//div[contains(@class,'d-flex')]//button//i")
	public WebElement Search;
	
	@FindBy(xpath = "//h3[contains(text(),'Entity Details')]")
	public WebElement Org_heder;
	@FindBy(xpath = "//label[contains(text(),'Entity Name')]")
	public WebElement Ins_Name;
	@FindBy(xpath = "//label[contains(text(),'Pincode')]")
	public WebElement Pincode;
	@FindBy(xpath = "//label[contains(text(),'City')]")
	public WebElement City;
	@FindBy(xpath = "//label[contains(text(),'State')]")
	public WebElement State;
	@FindBy(xpath = "//label[@for='address']")
	public WebElement Org_addr;
	@FindBy(xpath = "//label[@for='stdTelephone']")
	public WebElement Org_std;
	@FindBy(xpath = "//label[@for='mobileNumber']")
	public WebElement Org_mob;
	@FindBy(xpath = "//label[@for='organisationEmail']")
	public WebElement Org_email;
	@FindBy(xpath = "//label[@for='documentsToUpload']")
	public WebElement org_upload;
	@FindBy(xpath = "(//select[@class='real-select'])[1]")
	public WebElement selectcountry;
	@FindBy(xpath = "(//select[@class='real-select'])[2]")
	public WebElement selectcountry1;
	@FindBy(xpath = "(//select[@class='real-select'])[3]")
	public WebElement selectcountry2;
	@FindBy(xpath = "(//select[@class='real-select'])[4]")
	public WebElement selectcountry3;
	
	
		public void user_org_details(String Name,String PIN,String Address,String Tel,String Mob,String Email) throws InterruptedException, AWTException {
		
		Thread.sleep(2000);
		clickmultipleweb(Save_next);
		//String Error="Please enter your Institution Name.,Please enter your pincode.,Please enter your address.,Please enter a valid STD code or telephone.,Please enter a valid country code or mobile number.,Please enter valid Email.,Please upload the following documents: Organisation GSTIN, PAN, Regulatory RBI License, Board Resolution";
		validatetext(Org_heder,"Entity Details");
		validateattribute(Ins_Name, "placeholder", "Enter Organization name");
		validatetext(Ins_Name,"Entity Name");
		validateattribute(Pincode, "placeholder", "Enter pincode");
		validatetext(Pincode,"Pincode");
		validateattribute(State, "placeholder", "Enter State");
		validatetext(City,"City");
		validateattribute(State, "placeholder", "Enter State");
		validatetext(State,"State");
		validateattribute(Org_addr, "placeholder", "Enter address");
		validatetext(Org_addr,"Address");
		validateattribute(Org_addr, "placeholder", "Enter STD Telephone");
		
		validatetext(Org_std,"STD Telephone");
		validateattribute(Org_mob, "placeholder", "Enter mobile number");
		validatetext(Org_mob,"Mobile Number");
		validateattribute(Org_email, "placeholder", "Enter email address");
		validatetext(Org_email,"Entity Email");
		validatetext(org_upload,"Documents");
		validateattribute(STD_Code, "placeholder", "STD Code");
		//validateattribute(Country_Code, "placeholder", "Country Code");
		configWriter.setProperty("Orgname", Name);
		configWriter.setProperty("OrgName", Name);
		
		sendkeyweb(org_name, Name);
		sendkeyweb(org_pin, PIN);
		sendkeyweb(org_address, Address);
		sendkeyweb(STD_Code, "040");
		sendkeyweb(org_telephone, Tel);
		Selectdropdown(selectcountry, "India -(+91)");
		sendkeyweb(org_number, Mob);
		org_number.sendKeys("9");
		sendkeyweb(org_email, Email+ConfigReader.getProperty("OrgName")+".com");
	}
		
		
		public void user_org_documents(String GST,String PAN,String License) throws InterruptedException, AWTException {
		Selectdropdown(org_doc, " Organization GSTIN ");
		configWriter.setProperty("OGSTnum", GST);
		sendkeyweb(org_GST, GST);
		Thread.sleep(2000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("GSTIN"));
		Thread.sleep(2000);
		Selectdropdown(org_doc, " PAN ");
		Thread.sleep(2000);
		configWriter.setProperty("OPANnum", PAN);
		sendkeyweb(org_PAN, PAN);
		Thread.sleep(2000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(2000);
		Selectdropdown(org_doc, "License Given By RBI");
		Thread.sleep(2000);
		configWriter.setProperty("Olicence", License);
		sendkeyweb(org_Lic, License);
		Thread.sleep(2000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("License"));
		Thread.sleep(2000);
		Selectdropdown(org_doc, " Board Resolution ");
		Thread.sleep(2000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("Board"));
		Thread.sleep(2000);
	     clickmultipleweb(Save_next);
		
		

	}

	
	@FindBy(xpath = "//input[@id='adminFullName']")
	public WebElement admin_fname;
	@FindBy(xpath = "//input[@id='adminEmail']")
	public WebElement admin_email;
	@FindBy(xpath = "//input[@id='adminPhone']")
	public WebElement admin_phone;
	@FindBy(xpath = "//input[contains(@id,'countryCode')]")
	public List<WebElement> STD_code;
	@FindBy(xpath = "//input[@id='adminAltPhone']")
	public WebElement admin_altphone;
	@FindBy(xpath = "//input[@id='adminDesignation']")
	public WebElement admin_desig;
	@FindBy(xpath = "//input[@id='adminAddress']")
	public WebElement admin_address;
	@FindBy(xpath = "//select[@id='adminDocType']")
	public WebElement admin_doc_type;
	@FindBy(xpath = "//input[@placeholder='Enter Aadhaar']")
	public WebElement admin_aadhar;
	@FindBy(xpath = "//button[contains(text(),'Select File & Upload')]")
	public List<WebElement> upload_doc;
	@FindBy(xpath = "//input[@placeholder='Enter PAN']")
	public WebElement admin_pan;
	@FindBy(xpath = "//div[normalize-space()='This email is already used']")
	public WebElement Error_email;
	 
	
	public void User_enters_contact_details(String Name,String Tel,String  Mob,String  Email,String Desig) throws AWTException, InterruptedException {
		configWriter.setProperty("admin_fname", Name);
		configWriter.setProperty("admin_email", Email+ConfigReader.getProperty("OrgName")+".com");
		configWriter.setProperty("admin_phone", Tel);
		configWriter.setProperty("admin_altphone", Mob);
		configWriter.setProperty("admin_desig", Desig);
		validateattribute(admin_fname, "placeholder", "Enter full name");
		validateattribute(admin_email, "placeholder", "Enter organization email");
		validateattribute(admin_desig, "placeholder", "Enter your designation");
		validateattribute(STD_Code1, "placeholder", "STD Code");
		validateattribute(admin_phone, "placeholder", "Enter STD Telephone");
		validateattribute(admin_altphone, "placeholder", "Enter phone number");
		
		
		sendkeyweb(admin_fname, Name);
		sendkeyweb(admin_email, sample);
		validatetext(Error_email, "This email is already used");
		sendkeyweb(admin_email, Email+ConfigReader.getProperty("OrgName")+".com");
		sendkeyweb(STD_Code1, "040");
		sendkeyweb(org_telephone1, Tel);
		Selectdropdown(selectcountry1, "India -(+91)");
		sendkeyweb(Admin_number, Mob);
		sendkeyweb(admin_address, "admin address");
		Admin_number.sendKeys("9");
		sendkeyweb(admin_desig, Desig);
		
	}
	String sample ="admin@gmail.com";
		public void User_upload_contact_details_documens(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			
		Selectdropdown(admin_doc_type, "Aadhaar");
		sendkeyweb(admin_aadhar, Aadhar);
		configWriter.setProperty("AdminAadhar", Aadhar);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(2000);
		Selectdropdown(admin_doc_type, "PAN");
		configWriter.setProperty("AdminPan", PAN);
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(2000);
		Selectdropdown(admin_doc_type, "Organization Identity Card");
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//input[@id='techFullName']")
	public WebElement tech_fname;
	@FindBy(xpath = "//input[@id='techEmail']")
	public WebElement tech_email;
	@FindBy(xpath = "//input[@id='techPhone']")
	public WebElement tech_phone;
	@FindBy(xpath = "//input[@id='techAltPhone']")
	public WebElement tech_altphone;
	@FindBy(xpath = "//input[@id='techDesignation']")
	public WebElement tech_desig;
	@FindBy(xpath = "//input[@id='techAddress']")
	public WebElement tech_address;
	@FindBy(xpath = "//select[@id='techDocType']")
	public WebElement tech_doc_type;
	@FindBy(xpath = "//div[contains(@class,'d-flex justify-content')]//p")
	public List<WebElement> Doc_error;
	@FindBy(xpath = "//div//p[contains(@class,'text-success')]")
	public List<WebElement> Doc_success;
	
	

	public void User_enters_technical_contact_details(String Name,String Tel,String  Mob,String  Email,String Desig) throws AWTException, InterruptedException {
		configWriter.setProperty("tech_fname", Name);
		configWriter.setProperty("tech_email", Email+ConfigReader.getProperty("OrgName")+".com");
		configWriter.setProperty("tech_phone", Tel);
		configWriter.setProperty("tech_altphone",Mob);
		configWriter.setProperty("tech_desig", Desig);
		
		validateattribute(tech_fname, "placeholder", "Enter full name");
		validateattribute(tech_email, "placeholder", "Enter organization email");
		validateattribute(tech_desig, "placeholder", "Enter your designation");
		validateattribute(STD_Code2, "placeholder", "STD Code");
		validateattribute(tech_phone, "placeholder", "Enter STD Telephone");
		validateattribute(tech_altphone, "placeholder", "Enter phone number");
		sendkeyweb(tech_fname, Name);
		sendkeyweb(tech_email, sample);
		validatetext(Error_email, "This email is already used");
		sendkeyweb(tech_email, Email+ConfigReader.getProperty("OrgName")+".com");
		sendkeyweb(STD_Code2, "040");
		sendkeyweb(org_telephone2, Tel);
		Selectdropdown(selectcountry2, "India -(+91)");
		sendkeyweb(Tech_number, Mob);
		sendkeyweb(tech_address, "tech address");
		Tech_number.sendKeys("9");
		sendkeyweb(tech_desig, Desig);
	}
		
		
		public void User_upload_technical_contact_details(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			
		Selectdropdown(tech_doc_type, "Aadhaar");
		configWriter.setProperty("TechAadhar", Aadhar);
		configWriter.setProperty("TechPan", PAN);
		sendkeyweb(admin_aadhar, Aadhar);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(2000);
		Selectdropdown(tech_doc_type, "PAN");
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(2000);
		Selectdropdown(tech_doc_type, "Organization Identity Card");
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(2000);

	}

	@FindBy(xpath = "//input[@id='billFullName']")
	public WebElement bill_fname;
	@FindBy(xpath = "//input[@id='billEmail']")
	public WebElement bill_email;
	@FindBy(xpath = "//input[@id='billPhone']")
	public WebElement bill_phone;
	@FindBy(xpath = "//input[@id='billAltPhone']")
	public WebElement bill_altphone;
	@FindBy(xpath = "//input[@id='billDesignation']")
	public WebElement bill_desig;
	@FindBy(xpath = "//input[@id='billAddress']")
	public WebElement bill_address;
	@FindBy(xpath = "//select[@id='billingDocType']")
	public WebElement bill_doc_type;

	public void User_enters_billing_contact_details(String Name,String Tel,String  Mob,String  Email,String Desig) throws AWTException, InterruptedException {
		
		configWriter.setProperty("bill_fname", Name);
		configWriter.setProperty("bill_email", Email+ConfigReader.getProperty("OrgName")+".com");
		configWriter.setProperty("bill_phone", Tel);
		configWriter.setProperty("bill_altphone",Mob);
		configWriter.setProperty("bill_desig", Desig);
		validateattribute(bill_fname, "placeholder", "Enter full name");
		validateattribute(bill_email, "placeholder", "Enter organization email");
		validateattribute(bill_desig, "placeholder", "Enter your designation");
		validateattribute(STD_Code3, "placeholder", "STD Code");
		validateattribute(bill_phone, "placeholder", "Enter STD Telephone");
		validateattribute(bill_altphone, "placeholder", "Enter phone number");
		sendkeyweb(bill_fname, Name);
		sendkeyweb(bill_email, sample);
		validatetext(Error_email, "This email is already used");
		sendkeyweb(bill_email, Email+ConfigReader.getProperty("OrgName")+".com");
		sendkeyweb(STD_Code3, "040");
		sendkeyweb(org_telephone3, Tel);
		Selectdropdown(selectcountry3, "India -(+91)");
		sendkeyweb(Bill_number,Mob);
		sendkeyweb(bill_address, "bill address");
		Bill_number.sendKeys("7");
		Bill_number.sendKeys("5");
		sendkeyweb(bill_desig, Desig);
	}
		
		public void User_upload_billing_contact_details(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			configWriter.setProperty("BillAadhar", Aadhar);
			configWriter.setProperty("BillPan", PAN);
		Selectdropdown(bill_doc_type, "Aadhaar");
		sendkeyweb(admin_aadhar, Aadhar);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(2000);
		Selectdropdown(bill_doc_type, "PAN");
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(2000);
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(2000);
		Selectdropdown(bill_doc_type, "Organization Identity Card");
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(2000);
		clickmultipleweb(Save_next);

	}

	@FindBy(xpath = "//h3[normalize-space()='Name Server Details']")
	public WebElement NS_Page_head;
	@FindBy(xpath = "//table[@class='ns-table']//th")
	public List<WebElement> TAble_col;
	@FindBy(xpath = "//table[@class='ns-table']//td//input")
	public List<WebElement> Table_dataNS;
	@FindBy(xpath = " //button[normalize-space()='Add More NS'] ")
	public WebElement ADD_NS;
	@FindBy(xpath = " //button[normalize-space()='Cancel']")
	public WebElement Cancel;
	@FindBy(xpath = "//button[contains(text(),' Add More NS ')]")
	public WebElement Addnsbutton;
	@FindBy(xpath = "//button[@class='delete-button']")
	public List<WebElement> DeleteNS;
	 

	public void Validate_name_server_details_page() {
		try {
			validatetext(NS_Page_head, "Name Server Details");
		} catch (Exception e) {
		}
		String Table_cold="Server,Name Server Host Name,DNS Service Provider,IPV4 Address,IPV6 Address,IP Service Provider,Actions";
		Table_prop(TAble_col, Table_cold);
		validatetext(NS_Page_head, "Name Server Details");
		String Table_cold1="Server,Name Server Host Name,DNS Service Provider,IPV4 Address,IPV6 Address,IP Service Provider,Actions";

		Table_prop(TAble_col, Table_cold1);
		validateattribute(Table_dataNS.get(0),"placeholder", "");
		validateattribute(Table_dataNS.get(1),"placeholder", "Enter Provider Name");
		validateattribute(Table_dataNS.get(2),"placeholder", "Enter IP Address");
		validateattribute(Table_dataNS.get(3),"placeholder", "Enter IP Address");
		validateattribute(Table_dataNS.get(4),"placeholder", "Enter Provider Name");
		validateattribute(Table_dataNS.get(5),"placeholder", "Enter name server host");
		validateattribute(Table_dataNS.get(6),"placeholder", "Enter Provider Name");
		validateattribute(Table_dataNS.get(7),"placeholder", "Enter IP Address");
		validateattribute(Table_dataNS.get(8),"placeholder", "Enter IP Address");
		validateattribute(Table_dataNS.get(9),"placeholder", "Enter Provider Name");
	}

	public void User_enters_name_server_details(String NSR,String IP1,String IPV6) throws AWTException, InterruptedException {
		configWriter.setProperty("NS1", NSR);
		
		sendkeyweb(Table_dataNS.get(0),NSR+"a");
		sendkeyweb(Table_dataNS.get(1),"Oracle");
		sendkeyweb(Table_dataNS.get(2),IP1+"11");
		sendkeyweb(Table_dataNS.get(3),IPV6+"11");
		sendkeyweb(Table_dataNS.get(4),"IDRBT");
		sendkeyweb(Table_dataNS.get(5),NSR+"b");
		sendkeyweb(Table_dataNS.get(6),"Oracle");
		sendkeyweb(Table_dataNS.get(7),IP1+"22");
		sendkeyweb(Table_dataNS.get(8),IPV6+"22");
		sendkeyweb(Table_dataNS.get(9),"IDRBT");

		Clickelement(Addnsbutton);
		
		sendkeyweb(Table_dataNS.get(10),NSR+"c");
		sendkeyweb(Table_dataNS.get(11),"Oracle");
		sendkeyweb(Table_dataNS.get(12),IP1+"33");
		sendkeyweb(Table_dataNS.get(13),IPV6+"33");
		sendkeyweb(Table_dataNS.get(13),IPV6+"88");
		sendkeyweb(Table_dataNS.get(14),"IDRBT");
		
		Clickelement(Addnsbutton);
		sendkeyweb(Table_dataNS.get(15),NSR+"d");
		sendkeyweb(Table_dataNS.get(16),"Oracle");
		sendkeyweb(Table_dataNS.get(17),IP1+"4");
		sendkeyweb(Table_dataNS.get(19),"IDRBT");
		
		try {
			Clickelement(DeleteNS.get(6));
			Clickelement(DeleteNS.get(5));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Clickelement(Add_dnssec);
		sendkeyweb(Keytag.get(0),"1125");
		sendkeyweb(digest.get(0),NSR);
		Selectdropdown(Algorithem_type.get(0), "1");
		Selectdropdown(Digest.get(0), "2");
		Clickelement(Add_Additional_DNS);
		Clickelement(Delete.get(1));
		clickmultipleweb(Save_next);

	}
	
	@FindBy(xpath = "//button[normalize-space()='Add DNSSEC Details']")
	public WebElement Add_dnssec;
	@FindBy(xpath = "//input[@placeholder='Enter key tag']")
	public List<WebElement> Keytag;
	@FindBy(xpath = "//input[@placeholder='Enter digest']")
	public List<WebElement> digest;
	@FindBy(xpath = "//label[normalize-space()='Algorithm Type']/following-sibling::select")
	public List<WebElement> Algorithem_type;
	@FindBy(xpath = "//label[normalize-space()='Digest Type']/following-sibling::select")
	public List<WebElement> Digest;
	@FindBy(xpath = "//button[normalize-space()='Delete']")
	public List<WebElement> Delete;
	@FindBy(xpath = "//button[normalize-space()='Add Additional Record']")
	public WebElement Add_Additional_DNS;
	
	
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Reports')]")
	public WebElement reportsbuttonclick;
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	public WebElement udrbuttonclick;
	@FindBy(xpath = "//mat-icon[normalize-space()='settings']")
	public WebElement UMbuttonclick;
	@FindBy(xpath = "//a[@class='ng-star-inserted']")
	public WebElement offdeclick;
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement Preview_check;
	@FindBy(xpath = "(//button[@aria-label='Close'])[1]")
	public WebElement popupclose;
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	public WebElement popupclose1;
	@FindBy(xpath = "//button[normalize-space()='Track Your Application']")
	public WebElement track_appbutton;
	
	public void User_preview_and_submit_onboarding() throws InterruptedException {
		
		ac.moveToElement(Preview_check);
		Thread.sleep(3000);
		Clickelement(Preview_check);
		DSC_token();
		popupvalidate(null, null);
		Thread.sleep(5000);
		clickmultipleweb(Save_next);
		
		try {
			clickmultipleweb(Save_next);
		}catch (Exception e) {
		}
		Clickelement(popupclose);
		Thread.sleep(3000);
		Clickelement(popupclose1);
		Clickelement(reportsbuttonclick);
		Clickelement(udrbuttonclick);
		Clickelement(UMbuttonclick);
		Clickelement(offdeclick);
		Clickelement(track_appbutton);
		
	}
	
	public void User_preview_edit_onboarding() {
		
	}
	
	
	@FindBy(xpath = "//div[@data-target='#exampleModal']")
	public WebElement Profile_icon;
	@FindBy(xpath = "//div[normalize-space()='Logout']")
	public WebElement Logout;
	
	
	public void User_logout_the_application () throws InterruptedException {
		Thread.sleep(2000);
		Clickelement(Profile_icon);
		Clickelement(Logout);
	}

}
