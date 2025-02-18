package Forgot_passowrd_page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import Drivermanager.Driver;
import io.cucumber.java.en.*;

public class Forgot_password {

	WebDriver driver = Driver.getDriver();
	FP_object FP = new FP_object(driver);
	
	@Then("User navigate to Forgot password page")
	public void Forgot_password_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FP.navigate_Forgot_password_page();
	}
	
	@Then("User enters {string} and get otp")
	public void user_enters_and_get_otp(String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FP.user_enters_and_get_otp(string);
	}
	
	@Then("User enters the OTP")
	public void user_enters_the_otp() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FP.user_enters_the_otp();
	}

	@Then("User entes the new {string} and confirm {string}")
	public void user_entes_the_new_and_confirm(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FP.user_entes_the_new_and_confirm(string, string2);
		
	}
	
}
