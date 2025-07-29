package Registrant.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Drivermanager.Driver;
import hooks.Baseclass;

public class Super_admin_mgmt_obj extends Baseclass {
	WebDriver driver = Driver.getDriver();
	public Super_admin_mgmt_obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
}
