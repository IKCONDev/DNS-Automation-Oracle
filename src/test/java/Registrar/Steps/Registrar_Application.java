package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Application_Object;
import io.cucumber.java.en.Then;


public class Registrar_Application {
	
WebDriver driver = Driver.getDriver();
	
Registrar_Application_Object RA = new Registrar_Application_Object(driver);
	
@Then("Registrar Navigate to Application Page  check  Textvalidations")
public void User_textvaladation_in_Application_Page1() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_textvaladation_in_Application_Page1();
	
	

}

@Then("Registrar Navigate to Application Page  check Tabledata Textvalidations")
public void User_textvaladation_in_Application_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	RA.User_Can_Check_Application_Tabledatatextvaladation_in_Applications_Page();
	

}
@Then("Registrar Navigate to Application Page  check  OrganisationDetails Textvalidations")
public void User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page();
	

}

@Then("Registrar  check DocumentsUpload Functionalities in Applications Page")
public void User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page();
	
	
	}
@Then("Registrar  check DocumentsUpload Functionalities in Applications Page1")
public void User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page1() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page1();
	
	
	}

//
@Then("Registrar  check AdministrativeOfficier Functionalities in Applications Page")
public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page();
	
	

}
@Then("Registrar  check AdministrativeOfficier Functionalities in Applications Page1")
public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page1() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page1();
	

}
@Then("Registrar  check TechnicalOfficier Functionalities in Applications Page")
public void User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page();
	
}
@Then("Registrar  check TechnicalOfficier Functionalities in Applications Page1")
public void User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page1() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page1();

}
@Then("Registrar  check BillingOfficier Functionalities in Applications Page")
public void User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page();
	
	

}
@Then("Registrar check BillingOfficier Functionalities in Applications Page1")
public void User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page1() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page1();
	
}
@Then("Registrar  check Final Functionalities in Applications Page")
public void Registrar_can_Approve_Registrant_Application()throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.Registrar_can_Approve_Registrant_Application();
	
}
   
	@Then("Registrar  check Final Final Functionalities in Domains Page")
	public void Registrar_can_Check_Registrant_Application_Domain() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RA.Registrar_can_Check_Registrant_Application_Domain();
	

}
	@Then("Registrar  check Final Functionalities in Invoice Page")
	public void Registrar_can_check_Registrant_Application_Invoice()throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RA.Registrar_can_check_Registrant_Application_Invoice();
	

}
}
