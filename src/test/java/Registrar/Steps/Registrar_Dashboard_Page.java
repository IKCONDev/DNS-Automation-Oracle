package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrar.obj.Registrar_Dashboard_Object_Page;
import io.cucumber.java.en.Then;


public class Registrar_Dashboard_Page {
WebDriver driver = Driver.getDriver();
	
Registrar_Dashboard_Object_Page RB = new Registrar_Dashboard_Object_Page(driver);


@Then("Registrar  check  fields  in  Home Page")
public void User_check_allfields_in_Home_Registrar_Page1() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RB.User_check_allfields_in_Home_Page1();
}

@Then("Registrar  check textvaladations in Home Page")
public void User_textvaladation_in_Home_Main_Page1() throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RB.User_textvaladation_in_Home_Main_Page1();
	
}
@Then("Registrar  check  Create ApplicationQuee TextValidations in Home Page")
public void  Create_ApplicationQuee_TextValidations_in_Home_Page()  throws Exception {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	RB.Create_ApplicationQuee_TextValidations_in_Home_Page();
}

}

