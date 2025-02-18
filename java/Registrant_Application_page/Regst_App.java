package Registrant_Application_page;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import Drivermanager.Driver;
import io.cucumber.java.en.*;

public class Regst_App {
	
WebDriver driver = Driver.getDriver(); 
Regst_App_obj RSP = new Regst_App_obj(driver);

@Then("User Navigate to Application Page")
public void user_navigate_to_application_page() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	RSP.user_navigate_to_application_page();
    
}

@Then("User Validate Application Page")
public void user_validate_application_page() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   RSP.user_validate_application_page();
    
}

@Then("User Navigates the Domain Applications Details page")
public void user_navigates_the_domain_applications_details_page() {
	RSP.user_navigates_the_domain_applications_details_page();
    
}

@Then("User validate the Domain Applications Details page")
public void user_validate_the_domain_applications_details_page() {
	RSP.user_navigates_the_domain_applications_details_page();
    
}

@Then("User subit the Domain Applications Details page")
public void user_subit_the_domain_applications_details_page() throws AWTException, InterruptedException {
   RSP.user_subit_the_domain_applications_details_page();
    
}


}
