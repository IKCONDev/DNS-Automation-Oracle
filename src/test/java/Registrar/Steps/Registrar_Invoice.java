package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Invoice_Object;
import io.cucumber.java.en.Then;

public class Registrar_Invoice {

	
	WebDriver driver = Driver.getDriver();
	
	
	Registrar_Invoice_Object RI = new Registrar_Invoice_Object(driver);
	
	
	
	@Then("Registrar can Navigate to Invoice Page  check {string} Textvalidations")
	public void User_Navigate_to_invoice_Page1(String src) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RI.user_navigate_to_Invoicepage1(src);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
