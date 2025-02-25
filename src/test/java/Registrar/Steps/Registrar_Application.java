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

@Then("Registrar Navigate to Application Page  check {string} Tabledata Textvalidations")
public void User_textvaladation_in_Application_Page1(String src) throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	RA.User_Can_Check_Application_Tabledatatextvaladation_in_Applications_Page(src);
	

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
//
@Then("Registrar  check AdministrativeOfficier {string} {string}  {string}  {string}  Functionalities in Applications Page")
public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(String src,String src4,String src5,String src6) throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(src,src4,src5,src6);
	

}
@Then("Registrar  check TechnicalOfficier {string} Functionalities in Applications Page")
public void User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page(String src) throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page(src);
	

}
@Then("Registrar  check BillingOfficier Functionalities in Applications Page")
public void User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page() throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RA.User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page();
	

}

}
