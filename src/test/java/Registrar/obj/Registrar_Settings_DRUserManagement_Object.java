package Registrar.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Configuration.ConfigWriter;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Registrar_Settings_DRUserManagement_Object extends Baseclass {
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Settings_DRUserManagement_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	
	
	//SETTINGS MODULE
		@FindBy(xpath="(//*[name()='svg'])[46]")
		public WebElement arrow;
		@FindBy(xpath="//span[contains(text(),'20')]")
		public WebElement arrowsel;
		
		
		@FindBy(xpath="//button[@id='addUser']")
		public WebElement adduserbtnclick;
		@FindBy(xpath="//div[@id='userModal']//input[@id='name']")
		public WebElement Addusername;
		@FindBy(xpath="//div[@id='userModal']//input[@placeholder='Enter your email id']")
		public WebElement Adduseremailid;
		@FindBy(xpath="//div[@id='userModal']//input[@placeholder='+91 Enter your number']")
		public WebElement Addusermobnum;
		@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
		public WebElement Clickarrowbutton;
		@FindBy(xpath=" //span[contains(text(),'IDRBTADMIN ')]")
		public WebElement addusrrolesel;
		@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
		public WebElement Clickarrowbutton2;
		@FindBy(xpath=" //span[contains(text(),'IT ')]")
		public WebElement addusrdeptsel;
		@FindBy(xpath="//div[@id='userModal']//button[@type='button'][normalize-space()='Save changes']")
		public WebElement Clicklastselbutton;
		@FindBy(xpath="//mat-icon[text()='settings']")
		public WebElement Settingssearch ;
		@FindBy(xpath="//a[normalize-space()='DR User Management']")
		public WebElement DRUserManagementSearch ;
		@FindBy(xpath="//mat-icon[normalize-space()='dashboard']")
		public WebElement Dashboardsearch ;
		public void user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(String src1) throws Exception {

			WebElement ele = driver.findElement(By.xpath("//span[text()='Settings']"));
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
			
			Thread.sleep(3000);
			Clickelement(Settingssearch);
			Thread.sleep(3000);
			Clickelement(DRUserManagementSearch);
			Thread.sleep(3000);


			String SettingDrtabledata[]= { "Sl.No","User Id","User Name","Department", "Role", "Access","Status", "Edit","Delete"};
			List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
			Thread.sleep(3000);
			for (int i= 0; i< values.size(); i++) {

				validatetext(values.get(i), SettingDrtabledata[i]);
				//System.out.println("Code Printed");
			}




			//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
			//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

			List<WebElement> UserId=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserId")+"']/following-sibling::td"));
			List<WebElement> UserId1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

			//
			validatetext(UserId1.get(0), "1"); //
			validatetext(UserId.get(0),ConfigReader.getProperty("RDRUserName")); 
			validatetext(UserId.get(1), ConfigReader.getProperty("RDRDepartment")); 
			validatetext(UserId.get(2), ConfigReader.getProperty("RDRUserRole"));
			validatetext(UserId.get(3), "");
			validatetext(UserId.get(4), ConfigReader.getProperty("RDRUserstatus")); 
			validatetext(UserId.get(5), "");
			validatetext(UserId.get(6), "");
	/*

			Clickelement(adduserbtnclick);
			sendkeyweb(Addusername, "Bhargaviprakash");
			sendkeyweb(Adduseremailid, "bhargav@gmail.com");
			sendkeyweb(Addusermobnum, "9876543210");
			Clickelement(Clickarrowbutton);
			Clickelement(addusrrolesel);
			Clickelement(Clickarrowbutton2);
			Clickelement(addusrdeptsel);
			Clickelement(Clicklastselbutton);*/
			
			Thread.sleep(3000);
			
			Clickelement(Dashboardsearch);
		}


}
