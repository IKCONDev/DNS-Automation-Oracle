package Registrant.Steps;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrant.obj.Super_admin_mgmt_obj;

public class Super_admin_mgmt {
	WebDriver driver = Driver.getDriver();
	Super_admin_mgmt_obj IO=new Super_admin_mgmt_obj(driver);
}
