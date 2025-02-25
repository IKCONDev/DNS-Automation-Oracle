package Registrant.obj;

import java.awt.AWTException;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
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
	ConfigWriter configWriter = new ConfigWriter();
	public Registrant_login_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	Scanner myObj = new Scanner(System.in);// Create a Scanner object
	@FindBy(xpath = "//a[contains(.,'Register')]")
	public WebElement Register_button;

	public void user_navigate_to_Registration_page() {
		validatetext(Register_button, "Register");
		Clickelement(Register_button);
		
	}
	
	@FindBy(xpath = "//div[@class='bottom-links']//div[contains(.,'Contact')]")
	public WebElement Contact_linktext;
	@FindBy(xpath = "//div[@class='bottom-links']//div[contains(.,'User Manual')]")
	public WebElement Usermanual_linktext;
	@FindBy(xpath = "//div[@class='bottom-links']//div[contains(.,'Privacy Policy')]")
	public WebElement Privacy_policy_linktext;
	@FindBy(xpath = "//div[@class='bottom-links']//div[contains(.,'Disclaimer')]")
	public WebElement Disclaimer_linktext;
	
	@FindBy(xpath = "//a[contains(.,'Register')]")
	public WebElement Register_buttons;
	
	public void user_validating_landing_page() {
		validatetext(Contact_linktext, "Contact");
		validatetext(Usermanual_linktext, "User Manual");
		validatetext(Privacy_policy_linktext, "Privacy Policy");
		validatetext(Disclaimer_linktext, "Disclaimer");
		try {
		validatetext(Register_button, "Register");
		} catch (Exception e) {
		}
		
		
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
		validateattribute(Register_emailid, "placeholder", "Enter your official email to receive an OTP");
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
	        // Split the email by '@' to separate the name and domain
	        String[] parts = email.split("@");
	        String namePart = parts[0];  // "venkatesh.j"
	        // Further split by '.' if needed to get first and last name
	        String[] nameParts = namePart.split("\\.");
	        String firstName = nameParts[0];  // "venkatesh"
	        String lastName = nameParts.length > 1 ? nameParts[1] : "";  // "j" (if present)
	        
	        if(lastName.isEmpty()) {
	        	return firstName;
	        }else {
	        return firstName+" "+lastName;}
//	        System.out.println("First Name: " + firstName);
//	        System.out.println("Last Name: " + lastName);
	}

	
	public void User_Register_An_Account(String username,String Password) throws InterruptedException {
		configWriter.setProperty("Username", username);
	    configWriter.saveProperties();
	    configWriter.setProperty("nameuser", SplitNameFromEmail(username));
	    configWriter.saveProperties();
		String stv="Passwords do not match";
		Register_emailid.click();
		jssendkeys(Register_emailid,username);
		Thread.sleep(1000);
		Clickelement(Register_verify_button);
		System.out.println("Enter OTP : ");
		String OTP = myObj.nextLine();
		sendkeyweb(Register_email_otp, OTP);
		Thread.sleep(1000);
		Clickelement(Verify_otp);
		popupvalidate("OTP verification successful", "Please enter valid OTP.");
		sendkeyweb(Register_number, "9856836589");
		sendkeyweb(Register_username, SplitNameFromEmail(username));
		sendkeyweb(Register_password, Password);
		sendkeyweb(Register_cnf_password, Password+"1");
		Clickelement(Registration_checkbox.get(0));
		Clickelement(Registration_checkbox.get(1));
		validatetext(Error_msg, stv);		
		sendkeyweb(Register_password, Password);
		validatetext(Registration_button, "Register");
		Clickelement(Registration_button);
		validatetext(Error_msg, "Passwords do not match");
		sendkeyweb(Register_cnf_password, Password);
		Clickelement(Registration_button);
		popupvalidate("OTP verification successful", "User registration successful");
		
		 
	}

	@FindBy(xpath = "//div[@id='signInDropdown']")
	public WebElement Signin_dropdown;
	@FindBy(xpath = "//a[normalize-space()='Sign In']")
	public WebElement Signin_link;
	@FindBy(xpath = "//button[@routerlink='/login']")
	public WebElement Signin_button;
	//button[contains(text(),'Continue to Login')]
	public void user_navigate_to_login_page() {
		
			validatetext(Signin_button, "Continue to Login");
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
		
	@FindBy(xpath = "//div[contains(text(),'Login to')]")
	public WebElement login_title;	
	@FindBy(xpath = "//div[normalize-space()='Email ID' or normalize-space()='Email']")
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
	//p[@style='color: red;']
	
	
	public void user_enters_and(String UN, String Password) throws InterruptedException {
		
		sendkeyweb(Signin_email, UN);
		sendkeyweb(Signin_password, Password);
		Clickelement(Next_button);
		popupvalidate("An OTP has been sent to you email.","Invalid Credentials");
		System.out.println("Enter OTP:");
		String OTP = myObj.nextLine();
		sendkeyweb(Login_OTP_input, OTP);
		Clickelement(Login_button);
		Thread.sleep(1500);
		popupvalidate("Login Success","Invalid Credentials");
		Thread.sleep(4000);
		
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
		validateattribute(Signin_password, "placeholder", "Enter the strong password");
		Clickelement(Next_button);
		try {
		validatetext(Enter_mail_error, "Enter email");
		validatetext(Enter_password_error, "Enter password");
		}catch (Exception e) {
		}
		validatetext(Forget_password,"Forgot password?");
	}

	@FindBy(xpath = "//input[contains(@placeholder,'Name')]")
	public List<WebElement> DSC_name;
	@FindBy(xpath = "//input[contains(@placeholder,'Age')]")
	public WebElement DSC_age;
	@FindBy(xpath = "//input[contains(@placeholder,'Desig')]")
	public WebElement DSC_desig;
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement DSC_checkbox;
	@FindBy(xpath = "//button[contains(.,'Insert the PKI token')]")
	public WebElement DSC_affix;
	@FindBy(xpath = "//label[normalize-space()='I agree to the terms and conditions']")
	public WebElement Checkbox_label;

	public void message_displayed_login_successfully() {
		validateattribute(DSC_name.get(0),"placeholder","Name");
		validateattribute(DSC_name.get(1),"placeholder", "Father's Name");
		validateattribute(DSC_name.get(2),"placeholder", "Organization's Name");
		validateattribute(DSC_desig,"placeholder", "Designation");
		validateattribute(DSC_name.get(3),"placeholder", "Authorised Organization's Name");
		validateattribute(DSC_age,"placeholder", "Age");
		sendkeyweb(DSC_name.get(0), "Ramcharan");
		sendkeyweb(DSC_name.get(1), "Chiranjeevi");
		sendkeyweb(DSC_name.get(2), "Konidala production");
		sendkeyweb(DSC_name.get(3), "Konidala production");
		sendkeyweb(DSC_age, "25");
		sendkeyweb(DSC_desig, "SEO");
		Clickelement(DSC_checkbox);
		validatetext(DSC_affix, "Affix DSC");
		Clickelement(DSC_affix);
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
	
	
	public void DSC_token() throws InterruptedException {
		popupvalidate("Fetched tokens successfully", "emty");
		Selectdropdown(DSC_token, "1");
//		Thread.sleep(10000);
		Selectdropdown(DSC_certificate, "1");
		try {
			Selectdropdown(DSC_datetype, "2");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		sendkeyweb(DSC_password, "Idrbt@123");
		Clickelement(DSC_submit);
		popupvalidate("Fetched tokens successfully", "emty");
	}

	@FindBy(xpath = "//button[normalize-space()='Got it!']")
	public WebElement Domain_button;
	@FindBy(xpath = "//input[contains(@placeholder,'Bank Name')]")
	public WebElement Bank_name;
	@FindBy(xpath = "//select[@id='zoneInput']")
	public WebElement Zone_input;
	@FindBy(xpath = "//button[normalize-space()='Save & Next']")
	public List<WebElement> Save_next;
	@FindBy(xpath = "//input[contains(@placeholder,'n name')]")
	public WebElement org_name;
	@FindBy(xpath = "//input[contains(@placeholder,'pincode')]")
	public WebElement org_pin;
	@FindBy(xpath = "//input[contains(@placeholder,'address')]")
	public WebElement org_address;
	@FindBy(xpath = "//input[contains(@placeholder,'tele')]")
	public WebElement org_telephone;
	@FindBy(xpath = "//input[contains(@placeholder,'number')]")
	public WebElement org_number;
	@FindBy(xpath = "//input[contains(@placeholder,'l address')]")
	public WebElement org_email;
	@FindBy(xpath = "//select[@id='organisationDocType']")
	public WebElement org_doc;
	@FindBy(xpath = "//input[contains(@placeholder,'Organisation GSTIN')]")
	public WebElement org_GST;
	@FindBy(xpath = "//button[contains(text(), 'Select File & Upload')]")
	public WebElement org_select_file;
	@FindBy(xpath = "//input[contains(@placeholder,'PAN')]")
	public WebElement org_PAN;
	@FindBy(xpath = "//input[contains(@placeholder,'License No')]")
	public WebElement org_Lic;
	
	
	
	
	@FindBy(xpath = "//h1[normalize-space()='Domains']")
	public WebElement Domain_validate;
	@FindBy(xpath = "//label[normalize-space()='Bank Name']")
	public WebElement Bank_name_label;
	@FindBy(xpath = "//label[normalize-space()='Domain']")
	public WebElement Domain_label;
	

	public void user_should_get_logged_in(String domain) throws InterruptedException{
		 
       configWriter.setProperty("Domain", domain);
       configWriter.saveProperties();
		Thread.sleep(2000);
		validatetext(Domain_button, "Got it!");
		Clickelement(Domain_button);
		validatetext(Domain_validate, "Domains");
		validatetext(Bank_name_label, "Bank Name");
		validatetext(Domain_label, "Domain");
		validatetext(Domain_label, "Domain");
		validateattribute(Bank_name,"placeholder","Bank Name");
		sendkeyweb(Bank_name, domain);
		Selectdropdown(Zone_input, ".bank.in");// .fin.in
		clickmultipleweb(Save_next);
		Thread.sleep(4000);
	}
	
	
	
	@FindBy(xpath = "//h3[contains(text(),'Organisation Details')]")
	public WebElement Org_heder;
	@FindBy(xpath = "//label[contains(text(),'Institution Name')]")
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
	
	
		public void user_org_details(String Name,String PIN,String Address,String Tel,String Mob,String Email) throws InterruptedException, AWTException {
		
		validatetext(Org_heder,"Organisation Details");
		validatetext(Ins_Name,"Institution Name");
		validatetext(Pincode,"Pincode");
		validatetext(City,"City");
		validatetext(State,"State");
		validatetext(Org_addr,"Address");
		validatetext(Org_std,"STD Telephone");
		validatetext(Org_mob,"Mobile Number");
		validatetext(Org_email,"Organisation Email");
		validatetext(org_upload,"Documents");
			
		configWriter.setProperty("Orgname", Name);
		configWriter.saveProperties();
		
		sendkeyweb(org_name, Name);
		sendkeyweb(org_pin, PIN);
		sendkeyweb(org_address, Address);
		sendkeyweb(org_telephone, Tel);
		sendkeyweb(org_number, Mob);
		sendkeyweb(org_email, Email);
		}
		
		
		public void user_org_documents(String GST,String PAN,String License) throws InterruptedException, AWTException {
			
		Selectdropdown(org_doc, "Organisation GSTIN");
		configWriter.setProperty("OGSTnum", GST);
		configWriter.saveProperties();
		sendkeyweb(org_GST, GST);
		Thread.sleep(4000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("GSTIN"));
		Thread.sleep(4000);
		Selectdropdown(org_doc, "PAN");
		Thread.sleep(4000);
		configWriter.setProperty("OPANnum", PAN);
		sendkeyweb(org_PAN, PAN);
		Thread.sleep(4000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(4000);
		Selectdropdown(org_doc, "License No");
		Thread.sleep(4000);
		configWriter.setProperty("Olicence", License);
		sendkeyweb(org_Lic, License);
		Thread.sleep(4000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("License"));
		Thread.sleep(4000);
		Selectdropdown(org_doc, "Board Resolution");
		Thread.sleep(4000);
		Clickelement(org_select_file);
		fileupload_robot(ConfigReader.getProperty("Board"));
		Thread.sleep(4000);
		clickmultipleweb(Save_next);
		
		

	}

	
	@FindBy(xpath = "//input[@id='adminFullName']")
	public WebElement admin_fname;
	@FindBy(xpath = "//input[@id='adminEmail']")
	public WebElement admin_email;
	@FindBy(xpath = "//input[@id='adminPhone']")
	public WebElement admin_phone;
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

	public void User_enters_contact_details(String Name,String Tel,String  Mob,String  Email,String Desig) throws AWTException, InterruptedException {
		configWriter.setProperty("admin_fname", Name);
		configWriter.setProperty("admin_email", Email);
		configWriter.setProperty("admin_phone", Tel);
		configWriter.setProperty("admin_altphone", Mob);
		configWriter.setProperty("admin_desig", Desig);
		configWriter.saveProperties();
		sendkeyweb(admin_fname, Name);
		sendkeyweb(admin_email, Email);
		sendkeyweb(admin_phone, Tel);
		sendkeyweb(admin_altphone, Mob);
		sendkeyweb(admin_desig, Desig);
		
	}
		
		public void User_upload_contact_details_documens(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			
		Selectdropdown(admin_doc_type, "Aadhaar");
		sendkeyweb(admin_aadhar, Aadhar);
		configWriter.setProperty("AdminAadhar", Aadhar);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(4000);
		Selectdropdown(admin_doc_type, "PAN");
		configWriter.setProperty("AdminPan", PAN);
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(4000);
		Selectdropdown(admin_doc_type, "Organisation Id");
		Clickelement(upload_doc.get(1));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(4000);
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

	public void User_enters_technical_contact_details(String Name,String Tel,String  Mob,String  Email,String Desig) throws AWTException, InterruptedException {
		
		configWriter.setProperty("tech_fname", Name);
		configWriter.setProperty("tech_email", Email);
		configWriter.setProperty("tech_phone", Tel);
		configWriter.setProperty("tech_altphone",Mob);
		configWriter.setProperty("tech_desig", Desig);
		configWriter.saveProperties();
		
		sendkeyweb(tech_fname, Name);
		sendkeyweb(tech_email, Email);
		sendkeyweb(tech_phone, Tel);
		sendkeyweb(tech_altphone, Mob);
		sendkeyweb(tech_desig, Desig);
	}
		
		
		public void User_upload_technical_contact_details(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			
		Selectdropdown(tech_doc_type, "Aadhaar");
		configWriter.setProperty("TechAadhar", Aadhar);
		configWriter.setProperty("TechPan", PAN);
		configWriter.saveProperties();
		sendkeyweb(admin_aadhar, Aadhar);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(4000);
		Selectdropdown(tech_doc_type, "PAN");
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(4000);
		Selectdropdown(tech_doc_type, "Organisation Id");
		Clickelement(upload_doc.get(2));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(4000);

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
		configWriter.setProperty("bill_email", Email);
		configWriter.setProperty("bill_phone", Tel);
		configWriter.setProperty("bill_altphone",Mob);
		configWriter.setProperty("bill_desig", Desig);
		configWriter.saveProperties();
		sendkeyweb(bill_fname, Name);
		sendkeyweb(bill_email, Email);
		sendkeyweb(bill_phone, Tel);
		sendkeyweb(bill_altphone,Mob);
		sendkeyweb(bill_desig, Desig);
	}
		
		public void User_upload_billing_contact_details(String Aadhar,String  PAN) throws AWTException, InterruptedException {
			configWriter.setProperty("BillAadhar", Aadhar);
			configWriter.setProperty("BillPan", PAN);
			configWriter.saveProperties();
			
		Selectdropdown(bill_doc_type, "Aadhaar");
		sendkeyweb(admin_aadhar, Aadhar);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("Aadhar"));
		Thread.sleep(4000);
		Selectdropdown(bill_doc_type, "PAN");
		sendkeyweb(admin_pan, PAN);
		Thread.sleep(4000);
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("PAN"));
		Thread.sleep(4000);
		Selectdropdown(bill_doc_type, "Organisation Id");
		Clickelement(upload_doc.get(3));
		fileupload_robot(ConfigReader.getProperty("ID"));
		Thread.sleep(4000);
		clickmultipleweb(Save_next);

	}

	@FindBy(xpath = "//input[@placeholder='Name Server 1 - Host Name']")
	public WebElement NS1;
	@FindBy(xpath = "//input[@placeholder='Name Server 1 - IP Address']")
	public WebElement IP1;
	@FindBy(xpath = "//input[@placeholder='Name Server 2 - Host Name']")
	public WebElement NS2;
	@FindBy(xpath = "//input[@placeholder='Name Server 2 - IP Address']")
	public WebElement IP2;
	@FindBy(xpath = "//input[@formcontrolname='hasNSDetails']")
	public List<WebElement> Radio_buttons;
	@FindBy(xpath = "//label[contains(.,'Name Server 1 Host Name')]")
	public WebElement NS1_label;
	@FindBy(xpath = "//label[contains(.,'Name Server 2 Host Name')]")
	public WebElement NS2_label;
	@FindBy(xpath = "//label[contains(.,'Name Server 1 IP Address')]")
	public WebElement IP1_label;
	@FindBy(xpath = "//label[contains(.,'Name Server 2 IP Address')]")
	public WebElement IP2_label;
	@FindBy(xpath = " //button[normalize-space()='Add More NS'] ")
	public WebElement ADD_NS;
	@FindBy(xpath = " //button[normalize-space()='Cancel']")
	public WebElement Cancel;
	

	public void Validate_name_server_details_page() {
		dispalyedattribute(Radio_buttons.get(0), "  I have NS details Radio button");
		dispalyedattribute(Radio_buttons.get(1), "  I will set it later Radio button");
		validatetext(ADD_NS, "Add More NS");
		validatetext(Cancel, "Cancel");
		validatetext(NS1_label,"Name Server 1 Host Name");
		validatetext(NS2_label,"Name Server 2 Host Name");
		validatetext(IP1_label,"Name Server 1 IP Address");
		validatetext(IP2_label,"Name Server 2 IP Address");
		validateattribute(NS1, "placeholder", "Name Server 1 - Host Name");
		validateattribute(NS2, "placeholder", "Name Server 2 - Host Name");
		validateattribute(IP1, "placeholder", "Name Server 1 - IP Address");
		validateattribute(IP2, "placeholder", "Name Server 2 - IP Address");
	}

	public void User_enters_name_server_details(String NSR1,String NIP1,String NSR2,String NIP2) throws AWTException, InterruptedException {
		configWriter.setProperty("NS1", NSR1);
		configWriter.setProperty("IP1", NIP1);
		configWriter.setProperty("NS2", NSR2);
		configWriter.setProperty("IP2", NIP2);	
		configWriter.saveProperties();
		sendkeyweb(NS1, NSR1);
		sendkeyweb(IP1, NIP1);
		sendkeyweb(NS2, NSR2);
		sendkeyweb(IP2, NIP2);
		clickmultipleweb(Save_next);

	}
	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement Preview_check;
	public void User_preview_and_submit_onboarding() throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(Preview_check);
		Thread.sleep(3000);
		Clickelement(Preview_check);
		popupvalidate(null, null);
		Thread.sleep(5000);
		clickmultipleweb(Save_next);
		
		try {
			clickmultipleweb(Save_next);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
