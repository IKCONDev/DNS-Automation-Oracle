package Prakash;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Configuration.ConfigReader;
import Drivermanager.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registrar_login {
	
	WebDriver driver = Driver.getDriver();
	
	Registrar_LoginObject RLO1 = new Registrar_LoginObject(driver);
	
	
	@Given("Registrar is on Landing Page")
	public void user_is_on_home_page() {
		driver.get(ConfigReader.getProperty("RbaseURL"));
		driver.manage().window().maximize();
	}
	
	@Then("Registrar Can Check Textvaladations in Login Page")
	public void User_textvaladation_in_Loginpage_Page1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO1.User_textvaladation_in_Login_Page1();
	}
	
	@When("Registrar  enter {string} and {string} and navigate to Registrar Home Page")
	public void User_user_enters_andnavigate_to_Registrar_loginPage1(String UN, String Password) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RLO1.User_enter_Username_Password_to_navigate_Home_Page1(UN ,Password);
	}
	@Then("Registrar check all fields in  Home Page")
	public void User_check_allfields_in_Home_Registrar_Page1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_check_allfields_in_Home_Page1();
	}
	
	@Then("Registrar can check textvaladations in Home Page")
	public void User_textvaladation_in_Home_Main_Page1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_textvaladation_in_Home_Main_Page1();
		
	}

	@Then("Registrar can check  Create ApplicationQuee {string} TextValidations in Home Page")
	public void  Create_ApplicationQuee_TextValidations_in_Home_Page(String src)  throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1. Create_ApplicationQuee_TextValidations_in_Home_Page(src);
	}
	
	
	@Then("Registrar Navigate to Application Page can check  Textvalidations")
	public void User_textvaladation_in_Application_Page1() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_textvaladation_in_Application_Page1();
		
		
	
	}
	
	@Then("Registrar Navigate to Application Page can check {string} Tabledata Textvalidations")
	public void User_textvaladation_in_Application_Page1(String src) throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_Application_Tabledatatextvaladation_in_Applications_Page(src);
		
	
	}
	@Then("Registrar Navigate to Application Page can check  OrganisationDetails Textvalidations")
	public void User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page();
		
	
	}
	@Then("Registrar can check DocumentsUpload Functionalities in Applications Page")
	public void User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page();
		
	
	}
	//
	@Then("Registrar can check AdministrativeOfficier {string} {string}  {string}  {string}  Functionalities in Applications Page")
	public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(String src,String src4,String src5,String src6) throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(src,src4,src5,src6);
		
	
	}
	@Then("Registrar can check TechnicalOfficier Functionalities in Applications Page")
	public void User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page();
		
	
	}
	@Then("Registrar can check BillingOfficier Functionalities in Applications Page")
	public void User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page();
		
	
	}
	@Then("Registrar Navigate to Domain Page can check Textvalidations")
	public void User_Navigate_to_Domain_Page() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Dominpage_Then_validatetabledata();
		
	
	}
	@Then("Registrar can check DomaintableData {string} Textvalidations")
	public void User_Can_Check_DomaintableData_in_Domain_Page(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		RLO1.User_Can_Check_DomaintableData_in_Domain_Page(src);
		
	
	}
	@Then("Registrar can check AllFieldsData Textvalidations in Domain Page")
	public void user_validatetext_AllFields_in_Domainpage() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		RLO1.user_validatetext_AllFields_in_Domainpage();
	
	}
	@Then("Registrar Navigate to Invoice Page can check Textvalidations")
	public void User_Navigate_to_invoice_Page1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Invoicepage1();
	
	}
	
	@Then("Registrar Navigate to Reports Page can check Textvalidations")
	public void User_Navigate_to_Reports_Page1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	
	}

	
	@Then("Registrar navigate to Settings Page can check {string} DRUserManagement  Textvalidations and all fields functionalities")
	public void user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(src);
	
	}
	
	@Then("Registrar can check RegistrantUserManagement {string} Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(src);
	
	}
	@Then("Registrar can check RegistrantOfficerDetails {string} {string}  {string}  {string} Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrantOfficerDetails_Textvalidations(String src,String src4,String src5,String src6) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.registrar_can_check_registrant_officer_details_textvalidations_and_functionalities_in_settings_page(src,src4,src5,src6);
	
	}
	
	@Then("Registrar can check RegistrarRolesSearch {string} Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(src);
		
	
	}
	
	@Then("Registrar can check RegistrarDepartmentSearch {string}  Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RLO1.user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(src);
		
	
	}
	
	
	
	
	
	
	
}
