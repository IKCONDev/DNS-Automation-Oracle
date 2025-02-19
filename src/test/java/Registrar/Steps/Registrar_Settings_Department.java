package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Settings_Department_Object;
import io.cucumber.java.en.Then;

public class Registrar_Settings_Department {
	
WebDriver driver = Driver.getDriver();
	
Registrar_Settings_Department_Object RD = new Registrar_Settings_Department_Object(driver);

@Then("Registrar  check can RegistrarDepartmentSearch {string}  Textvalidations and functionalities in Settings Page")
public void user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(String src) throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RD.user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(src);
	

}
}
