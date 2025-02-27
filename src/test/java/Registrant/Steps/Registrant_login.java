package Registrant.Steps;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import Configuration.ConfigReader;
import Configuration.ConfigWriter;
import Drivermanager.Driver;
import Registrant.obj.Registrant_login_object;
import io.cucumber.java.en.*;

public class Registrant_login {
	WebDriver driver = Driver.getDriver();
	Registrant_login_object RLO = new Registrant_login_object(driver);

	 
		 
	 ConfigWriter configWriter = new ConfigWriter();
	
	@Given("User is on Landing Page")
	public void user_is_on_home_page() {
		driver.get(ConfigReader.getProperty("baseURL"));
		driver.manage().window().maximize();
		configWriter.setProperty("lastRun", String.valueOf(System.currentTimeMillis()));
		
	}
	
	@Given("User is on Registar Landing Page")
	public void user_is_on_Registar_home_page() {
		driver.get(ConfigReader.getProperty("RbaseURL"));
		driver.manage().window().maximize();
	}
	
	@Given("User validating the Landing Page")
	public void user_validating_landing_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.user_validating_landing_page();
	}

	@When("User navigate to Registration Page")
	public void user_navigate_to_Registration_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.user_navigate_to_Registration_page();
	}

	@Then("User Register An Account {string} {string}")
	public void User_Register_An_Account(String username ,String Password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.Validate_Registaration_page();
		RLO.User_Register_An_Account(username,Password);
	}

	@When("User navigate to Login Page")
	public void user_navigate_to_login_page() {
		RLO.user_navigate_to_login_page();

	}

	@Then("User enters {string} and {string}")
	public void user_enters_and(String UN, String Password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.validate_login_page();
		RLO.user_enters_and(UN, Password);

	}

	@Then("User enters the dsc details")
	public void message_displayed_login_successfully() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.message_displayed_login_successfully();
		RLO.DSC_token();
	}

	@Then("User enters domain page {string}")
	public void user_should_get_logged_in(String domain) throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.user_should_get_logged_in(domain);

	}
	
	@Then("User enters organisation details {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void User_enters_organisation_details (String Name,String PIN,String Address,String Tel,String Mob,String Email,String GST,String PAN,String License) throws InterruptedException, AWTException {
		RLO.user_org_details(Name,PIN,Address,Tel,Mob,Email);
		RLO.user_org_documents(GST, PAN, License);
	}

	@Then("User enters admin contact details {string} {string} {string} {string} {string} {string} {string}")
	public void User_enters_admin_contact_details(String Name,String Tel,String  Mob,String  Email,String Aadhar,String  PAN,String Desig) throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.User_enters_contact_details(Name,Tel,Mob,Email,Desig);
		RLO.User_upload_contact_details_documens(Aadhar, PAN);
		//String Name,String Tel,String  Mob,String  Email,String Desig
	}

	@Then("User enters technical contact details {string} {string} {string} {string} {string} {string} {string}")
	public void User_enters_technical_contact_details(String Name,String Tel,String  Mob,String  Email,String Aadhar,String  PAN,String Desig) throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.User_enters_technical_contact_details(Name,Tel,Mob,Email,Desig);
		RLO.User_upload_technical_contact_details(Aadhar, PAN);
	}

	@Then("User enters billing contact details {string} {string} {string} {string} {string} {string} {string}")
	public void User_enters_billing_contact_details(String Name,String Tel,String  Mob,String  Email,String Aadhar,String  PAN,String Desig) throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.User_enters_billing_contact_details(Name,Tel,Mob,Email,Desig);
		RLO.User_upload_billing_contact_details(Aadhar, PAN);
	}

	@Then("User enters name server details {string} {string} {string} {string}")
	public void User_enters_name_server_details(String NS1,String IP1,String N2,String IP2) throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.Validate_name_server_details_page();
		RLO.User_enters_name_server_details(NS1,IP1,N2,IP2);
	}
	
	@Then("User preview and submit onboarding")
	public void User_preview_and_submit_onboarding() throws AWTException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO.User_preview_and_submit_onboarding();
		Thread.sleep(4000);
	}

	
}
