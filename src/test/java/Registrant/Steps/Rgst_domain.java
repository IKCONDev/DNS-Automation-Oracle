package Registrant.Steps;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrant.obj.Rgst_domain_obj;
import io.cucumber.java.en.Then;

public class Rgst_domain {
	WebDriver driver = Driver.getDriver(); 
	Rgst_domain_obj RDP = new Rgst_domain_obj(driver);
	
	@Then("User Navigate to Domain Page")
	public void user_navigate_to_domain_page() {
	    RDP.user_navigate_to_domain_page();
	   
	}

	@Then("User Validate Domain Page")
	public void user_validate_domain_page() {
		RDP.user_validate_domain_page();
	   
	}
	@Then("User Validate Domain data")
	public void user_validate_domain_data() {
		RDP.user_validate_domain_data();
	   
	}

	@Then("User Navigates the Domain Details page")
	public void user_navigates_the_domain_details_page() {
		RDP.user_navigates_the_domain_details_page();
	   
	}

	@Then("User validate the Domain Domain Details page {string} {string} {string} {string}")
	public void user_validate_the_domain_domain_details_page(String NSR1,String NIP1,String NSR2,String NIP2,String NSR3,String NIP3,String NSR4,String NIP4) throws AWTException, InterruptedException {
		RDP.user_validate_the_domain_domain_details_page(NSR1,NIP1,NSR2,NIP2, NSR3, NIP3, NSR4,NIP4);
	   
	}

	@Then("User subit the Domain Details page")
	public void user_subit_the_domain_details_page() {
		RDP.user_subit_the_domain_details_page();
	   
	}
}
