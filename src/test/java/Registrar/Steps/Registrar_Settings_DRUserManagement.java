package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Settings_DRUserManagement_Object;
import io.cucumber.java.en.Then;

public class Registrar_Settings_DRUserManagement {
WebDriver driver = Driver.getDriver();
	
Registrar_Settings_DRUserManagement_Object RDR = new Registrar_Settings_DRUserManagement_Object(driver);
	

@Then("Registrar navigate to Settings Page  check {string} DRUserManagement  Textvalidations and all fields functionalities")
public void user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(String src) throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RDR.user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(src);

}
}
