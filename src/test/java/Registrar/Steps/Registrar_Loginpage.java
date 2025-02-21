package Registrar.Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Configuration.ConfigReader;
import Drivermanager.Driver;
import Registrar.obj.Registrar_Loginpage_Object;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registrar_Loginpage {
	
	WebDriver driver = Driver.getDriver();
	Registrar_Loginpage_Object RL = new Registrar_Loginpage_Object(driver);
	
	@Given("Registrar is on Landing Page1")
	public void user_is_on_home_page() {
		driver.get(ConfigReader.getProperty("RbaseURL"));
		driver.manage().window().maximize();
	}
	
	
	@Then("Registrar Can Check  Textvaladations in Login Page")
	public void User_textvaladation_in_Loginpage_Page1() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RL.User_textvaladation_in_Login_Page1();
	}
	
	@When("Registrar  Enter valid UN and PWD {string} and {string} and navigate to Registrar Home Page")
	public void User_user_enters_andnavigate_to_Registrar_loginPage1(String UN, String Password) throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		RL.User_enter_Username_Password_to_navigate_Home_Page1(UN ,Password);
	}
	}

