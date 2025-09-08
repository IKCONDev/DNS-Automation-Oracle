package Registrant.Steps;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrant.obj.Rgnt_Officer_mgmt_obj;
import io.cucumber.java.en.Then;

public class Rgnt_Officer_mgmt {
	WebDriver driver = Driver.getDriver();
	Rgnt_Officer_mgmt_obj ROM=new Rgnt_Officer_mgmt_obj(driver);
	
	@Then("User navigate to user management page")
	public void user_navigate_to_user_management_page() {
		ROM.user_navigate_to_USERmgmt_page();
	}

	@Then("User Validate the user management page")
	public void user_validate_the_user_management_page() {
		ROM.user_validate_the_officer_management_page();
		ROM.Super_admin_management();
	}


}
