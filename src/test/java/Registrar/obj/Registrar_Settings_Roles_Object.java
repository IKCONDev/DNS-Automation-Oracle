package Registrar.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrar_Settings_Roles_Object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Settings_Roles_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//button[contains(text(),'Add Role')]")
	public WebElement Clickaddrole;
	@FindBy(xpath="//input[@id='addRoleName']")
	public WebElement AddRolename;
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	public WebElement Clickaddrolesavebutton;
	@FindBy(xpath="//mat-icon[text()='settings']")
	public WebElement Settingssearch ;
	@FindBy(xpath="//a[normalize-space()='Registrar Roles']")
	public WebElement RegistrarRolesSearch ;
	public void user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(String src1) throws Exception {
		Thread.sleep(3000);
		Clickelement(Settingssearch);
		//Thread.sleep(3000);
		Clickelement(RegistrarRolesSearch);
		
		String SettingDrtabledata[]= {"ID","Role Name","Created", "Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> RoleName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("RoleName")+"']//following-sibling::td"));
		List<WebElement> RoleName1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']//preceding-sibling::td"));

		//
		dispalyedattribute(RoleName1.get(0), "ID"); //
		//validatet(RoleName.get(1), " IDRBTADMIN "); //
		validatetext(RoleName.get(0), "");
		validatetext(RoleName.get(1),ConfigReader.getProperty("RegistrarCreatedDate&Time")); 
		validatetext(RoleName.get(2),ConfigReader.getProperty("RegistrarModified"));  
		validatetext(RoleName.get(3),ConfigReader.getProperty("RegistrarModifiedDate&Time")); 
		validatetext(RoleName.get(4), "");
		validatetext(RoleName.get(5), "");
/*
		Clickelement(Clickaddrole);
		sendkeyweb(AddRolename, "");
		
		Clickelement(Clickaddrolesavebutton); */

	}

}
