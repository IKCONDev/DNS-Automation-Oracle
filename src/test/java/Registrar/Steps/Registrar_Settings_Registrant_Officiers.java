package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Settings_Registrant_Officiers_Object;
import io.cucumber.java.en.Then;

public class Registrar_Settings_Registrant_Officiers {
WebDriver driver = Driver.getDriver();
	
Registrar_Settings_Registrant_Officiers_Object RO = new Registrar_Settings_Registrant_Officiers_Object(driver);

@Then("Registrar  check RegistrantOfficerDetails {string} {string}  {string}  {string} Textvalidations and functionalities in Settings Page")
public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(String src,String src4,String src5,String src6) throws Exception  {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RO.Registrar_can_check_registrant_officer_details_textvalidations_and_functionalities_in_settings_page(src,src4,src5,src6);
	

}




}
