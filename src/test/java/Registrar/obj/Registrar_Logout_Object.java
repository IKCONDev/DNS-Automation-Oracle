package Registrar.obj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrar_Logout_Object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();
	public Registrar_Logout_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath="(//*[local-name()='svg'])[2]")
	public WebElement ClickProfilebutton;
	@FindBy(xpath="//div[contains(text(),' Logout ')]")
	public WebElement Clicklogoutbutton;
	
	public void Registrar_can_Check_logout_funcionality() throws Exception {
		Thread.sleep(3000);
		Clickelement(ClickProfilebutton);
		Thread.sleep(3000);
		Clickelement(Clicklogoutbutton);
		
		Thread.sleep(3000);
		driver.close();
	}
	

}
