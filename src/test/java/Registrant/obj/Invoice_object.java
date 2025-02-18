package Registrant.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Drivermanager.Driver;

public class Invoice_object {

	WebDriver driver = Driver.getDriver();
	public Invoice_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
}
