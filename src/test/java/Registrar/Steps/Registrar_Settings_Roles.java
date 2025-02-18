package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Settings_Roles_Object;
import io.cucumber.java.en.Then;

public class Registrar_Settings_Roles {


	WebDriver driver = Driver.getDriver();
	
	Registrar_Settings_Roles_Object RR = new Registrar_Settings_Roles_Object(driver);
	
	
	@Then("Registrar  check RegistrarRolesSearch {string} Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RR.user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(src);
		
	
	}
}
