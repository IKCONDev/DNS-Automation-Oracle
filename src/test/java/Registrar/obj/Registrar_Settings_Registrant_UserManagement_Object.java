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

public class Registrar_Settings_Registrant_UserManagement_Object extends Baseclass{

	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Settings_Registrant_UserManagement_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Registrantsearchbutton;
	@FindBy(xpath="//mat-icon[text()='settings']")
	public WebElement Settingssearch ;
	@FindBy(xpath="//a[normalize-space()='Registrant User Management']")
	public WebElement RegistrantUserManagementSearch ;
	
	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(String src1) throws Exception {

		Clickelement(Settingssearch);
		Thread.sleep(3000);
		Clickelement(RegistrantUserManagementSearch);
		Thread.sleep(3000);

		String SettingDrtabledata[]= {"Sl.No","User Id","User Name","Organisation Name", "Role", "Access","Status", "Actions"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		sendkeyweb(Registrantsearchbutton, "ramesh@123.com");

		
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		

		List<WebElement> UserID=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserID")+"']/following-sibling::td"));
		List<WebElement> UserID1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));
		Thread.sleep(3000);
		//
		validatetext(UserID1.get(0), "10");
		//validatetext(UserID1.get(0), ID); //
		validatetext(UserID.get(0), ConfigReader.getProperty("RMusername"));
		validatetext(UserID.get(1),ConfigReader.getProperty("RMOrgname")); 
		validatetext(UserID.get(2), ConfigReader.getProperty("RMRole"));
		validatetext(UserID.get(3), "");
		validatetext(UserID.get(4),ConfigReader.getProperty("RMStatus")); 
		validatetext(UserID.get(5), "");
		//validatet(UserID.get(6), "");



	}
}
