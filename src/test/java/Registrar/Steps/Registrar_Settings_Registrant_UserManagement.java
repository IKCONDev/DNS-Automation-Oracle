package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Settings_Registrant_UserManagement_Object;
import io.cucumber.java.en.Then;

public class Registrar_Settings_Registrant_UserManagement {

	WebDriver driver = Driver.getDriver();
	
	
	
	Registrar_Settings_Registrant_UserManagement_Object RM = new Registrar_Settings_Registrant_UserManagement_Object(driver);

	@Then("Registrar  check RegistrantUserManagement {string} Textvalidations and functionalities in Settings Page")
	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RM.user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(src);
		RM.user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations1(src);
		RM.user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations2(src);
		
		RM.user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations3(src);
	
	}

}
