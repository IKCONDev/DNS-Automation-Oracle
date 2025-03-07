package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Domain_Object_Page;
import io.cucumber.java.en.Then;


public class Registrar_Domain_Page {
	
WebDriver driver = Driver.getDriver();
	
Registrar_Domain_Object_Page RD = new Registrar_Domain_Object_Page(driver);
	
@Then("Registrar can Navigate to Domain Page can check Textvalidations")
public void User_Navigate_to_Domain_Page() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RD.user_navigate_to_Dominpage_Then_validatetabledata();
	

}
@Then("Registrar  check DomaintableData Textvalidations")
public void User_Can_Check_DomaintableData_in_Domain_Page() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	RD.User_Can_Check_DomaintableData_in_Domain_Page();
	

}
@Then("Registrar  check AllFieldsData {string} {string} Textvalidations in Domain Page")
public void user_validatetext_AllFields_in_Domainpage(String ip1,String ip2) throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	
	RD.user_validatetext_AllFields_in_Domainpage(ip1,ip2);
	

}
@Then("Registrar  check Final  Functionalities in Domains Page")
public void Registrar_can_Approve_Registrant_Application()throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RD.user_validatetext_BillingHistory_Fields();
	
}


@Then("Registrar check Finalstep Functionalities in Domains page")
public void user_validatetext_BillingHistory_Fields_finalsdtage()throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RD.user_validatetext_BillingHistory_Fields_finalsdtage();
	
}







}
