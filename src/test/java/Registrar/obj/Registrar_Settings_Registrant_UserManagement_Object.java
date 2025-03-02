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
	
	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations() throws Exception {

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
		sendkeyweb(Registrantsearchbutton, ConfigReader.getProperty("OrgName"));

		
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//preceding-sibling::td"));

		//
		
		 dispalyedattribute(Orgname1.get(0), "ID");
		 configWriter.setProperty("UserID1", Orgname1.get(1).getText());
		validatetext(Orgname1.get(1), ConfigReader.getProperty("UserID1"));
		configWriter.setProperty("UserName1", Orgname1.get(2).getText());
		validatetext(Orgname1.get(2), ConfigReader.getProperty("UserName1"));
		configWriter.setProperty("Role1", Orgname.get(0).getText());
		validatetext(Orgname.get(0), ConfigReader.getProperty("Role1"));
		validatetext(Orgname.get(1), ""); 
		configWriter.setProperty("DRStatus", Orgname.get(2).getText());
		validatetext(Orgname.get(2),  ConfigReader.getProperty("DRStatus"));
		validatetext(Orgname.get(3), ""); 
	}
		
		public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations1() throws Exception {
		
		//dispalyedattribute(Orgname.get(4), "29");
			List<WebElement> Orgname=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[2]/following-sibling::td"));
			List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[2]/preceding-sibling::td"));

			//
			
			 dispalyedattribute(Orgname1.get(0), "ID");
			 configWriter.setProperty("UserID2", Orgname1.get(1).getText());
			validatetext(Orgname1.get(1), ConfigReader.getProperty("UserID2"));
			configWriter.setProperty("UserName2", Orgname1.get(2).getText());
			validatetext(Orgname1.get(2), ConfigReader.getProperty("UserName2"));
			configWriter.setProperty("Role2", Orgname.get(0).getText());
			validatetext(Orgname.get(0), ConfigReader.getProperty("Role2"));
			validatetext(Orgname.get(1), ""); 
			configWriter.setProperty("DRStatus", Orgname.get(2).getText());
			validatetext(Orgname.get(2),  ConfigReader.getProperty("DRStatus"));
			validatetext(Orgname.get(3), ""); 
		



	}
		public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations2() throws Exception {
			
			//dispalyedattribute(Orgname.get(4), "29");
			List<WebElement> Orgname=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[3]/following-sibling::td"));
			List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[3]/preceding-sibling::td"));

				//
			 dispalyedattribute(Orgname1.get(0), "ID");
			 configWriter.setProperty("UserID3", Orgname1.get(1).getText());
			validatetext(Orgname1.get(1), ConfigReader.getProperty("UserID3"));
			configWriter.setProperty("UserName3", Orgname1.get(2).getText());
			validatetext(Orgname1.get(2), ConfigReader.getProperty("UserName3"));
			configWriter.setProperty("Role3", Orgname.get(0).getText());
			validatetext(Orgname.get(0), ConfigReader.getProperty("Role3"));
			validatetext(Orgname.get(1), ""); 
			configWriter.setProperty("DRStatus", Orgname.get(2).getText());
			validatetext(Orgname.get(2),  ConfigReader.getProperty("DRStatus"));
			validatetext(Orgname.get(3), ""); 



		}
		public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations3() throws Exception {
			
			//dispalyedattribute(Orgname.get(4), "29");
			List<WebElement> Orgname=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[4]/following-sibling::td"));
			List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[@role='cell'][normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[4]/preceding-sibling::td"));

				//
				
			 dispalyedattribute(Orgname1.get(0), "ID");
			 configWriter.setProperty("UserID4", Orgname1.get(1).getText());
			validatetext(Orgname1.get(1), ConfigReader.getProperty("UserID4"));
			configWriter.setProperty("UserName4", Orgname1.get(2).getText());
			validatetext(Orgname1.get(2), ConfigReader.getProperty("UserName4"));
			configWriter.setProperty("Role4", Orgname.get(0).getText());
			validatetext(Orgname.get(0), ConfigReader.getProperty("Role4"));
			validatetext(Orgname.get(1), ""); 
			configWriter.setProperty("DRStatus", Orgname.get(2).getText());
			validatetext(Orgname.get(2),  ConfigReader.getProperty("DRStatus"));
			validatetext(Orgname.get(3), ""); 



		}
}
