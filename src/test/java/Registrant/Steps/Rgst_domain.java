
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
	public void user_validate_the_domain_domain_details_page(String NSR1,String NIP1,String NSR2,String NIP2) throws AWTException, InterruptedException {
		RDP.user_validate_the_domain_domain_details_page(NSR1,NIP1,NSR2,NIP2);
	   
	}

	@Then("User subit the Domain Details page")
	public void user_subit_the_domain_details_page() {
		RDP.user_subit_the_domain_details_page();
	   
	}
}
=======
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
	public void user_validate_the_domain_domain_details_page(String NSR1,String NIP1, String NIP2,String NSR2,String NIP3,String NIP4,String NSR3,String NIP5,String NIP6,String NSR4,String NIP7,String NIP8) throws AWTException, InterruptedException {
		RDP.user_validate_the_domain_domain_details_page(NSR1, NIP1,  NIP2, NSR2, NIP3, NIP4,NSR3, NIP5, NIP6,NSR4, NIP7, NIP8);
	   
	}

	@Then("User subit the Domain Details page")
	public void user_subit_the_domain_details_page() {
		RDP.user_subit_the_domain_details_page();
	   
	}
}

