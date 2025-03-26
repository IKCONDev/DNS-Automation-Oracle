package Registrant.Steps;

import org.openqa.selenium.WebDriver;
import Drivermanager.Driver;
import Registrant.obj.Rs_Reports_obj;
import io.cucumber.java.en.*;

public class Rs_Reports {
	
	WebDriver driver = Driver.getDriver();
	Rs_Reports_obj RS = new Rs_Reports_obj(driver);
	
	@Then("User navigate  user management page")
	public void user_navigate_to_user_management_page() {
	   RS.user_navigate_to_user_details_management_page();
	    
	}

	@Then("User Validate  user management page")
	public void user_validate_the_user_management_page() {
	   //RS.user_validate_the_user_Detail_management_page();
	    
	}

	@Then("User navigate  officer details management page")
	public void user_navigate_to_officer_details_management_page() {
	   //RS.user_navigate_to_officer_details_management_page();
	    
	}

	@Then("User Validate  officer details management page")
	public void user_validate_the_officer_details_management_page() {
	   RS.user_validate_the_officer_details_management_page();
	    
	}

}
