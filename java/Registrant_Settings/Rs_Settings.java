package Registrant_Settings;

import org.openqa.selenium.WebDriver;
import Drivermanager.Driver;
import io.cucumber.java.en.*;

public class Rs_Settings {
	
	WebDriver driver = Driver.getDriver();
	Rs_Settings_obj RS = new Rs_Settings_obj(driver);
	
	@Then("User navigate to user management page")
	public void user_navigate_to_user_management_page() {
	   RS.user_navigate_to_user_management_page();
	    
	}

	@Then("User Validate the user management page")
	public void user_validate_the_user_management_page() {
	   RS.user_validate_the_user_management_page();
	    
	}

	@Then("User navigate to officer details management page")
	public void user_navigate_to_officer_details_management_page() {
	   RS.user_navigate_to_officer_details_management_page();
	    
	}

	@Then("User Validate the officer details management page")
	public void user_validate_the_officer_details_management_page() {
	   RS.user_validate_the_officer_details_management_page();
	    
	}

}
