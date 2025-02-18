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
@Then("Registrar  check DomaintableData {string} Textvalidations")
public void User_Can_Check_DomaintableData_in_Domain_Page(String src) throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	RD.User_Can_Check_DomaintableData_in_Domain_Page(src);
	

}
@Then("Registrar  check AllFieldsData Textvalidations in Domain Page")
public void user_validatetext_AllFields_in_Domainpage() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	
	RD.user_validatetext_AllFields_in_Domainpage();

}
}
