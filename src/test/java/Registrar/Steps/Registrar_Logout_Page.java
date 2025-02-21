package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;

import Registrar.obj.Registrar_Logout_Object;
import io.cucumber.java.en.Then;

public class Registrar_Logout_Page {
	
	WebDriver driver = Driver.getDriver();
	 Registrar_Logout_Object Rlo = new  Registrar_Logout_Object(driver);
	
	 @Then("Registrar Can Check  logout funcionality")
		public void Registrar_Check_logout_funcionality() throws Exception {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Rlo.Registrar_can_Check_logout_funcionality();
		}
}
