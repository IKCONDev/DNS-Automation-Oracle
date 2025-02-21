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

public class Registrar_Settings_Department_Object extends Baseclass {
	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Settings_Department_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//button[normalize-space()='Add Department']")
	public WebElement Clickadddept;
	@FindBy(xpath="//div[@id='addModal']//input[@placeholder='Department Name']")
	public WebElement Adddeptname;
	@FindBy(xpath="//div[@id='addModal']//input[@id='departmentCode']")
	public WebElement Adddeptcode;
	@FindBy(xpath="//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Clicksavebutton;
	
	@FindBy(xpath="//mat-icon[text()='settings']")
	public WebElement Settingssearch ;

	@FindBy(xpath="//a[normalize-space()='Registrar Department']")
	public WebElement RegistrarDepartmentSearch ;
	@FindBy(xpath="//mat-icon[normalize-space()='dashboard']")
	public WebElement Dashboardsearch ;
	
	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement Appsearch; 
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Appsearchsend;
	@FindBy(xpath="//td[normalize-space()='Rohan Tech']/preceding-sibling::td")
	public WebElement Appidclick;
	@FindBy(xpath="//p[text()='Application Status']")
	public WebElement Statustxtval;
	@FindBy(xpath="//td[normalize-space()='1']")
	public WebElement DomainIDClick;
	@FindBy(xpath="//mat-icon[normalize-space()='public']")
	public WebElement DomainSearch ;
	@FindBy(xpath="//div[text()='Active']")
	public WebElement InActivetxtval1;
	
	@FindBy(xpath="(//div[@class='box-content'])[2]")
	public WebElement InActivetxtval;
	public void user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(String src,String src1) throws Exception {
		Thread.sleep(3000);
		Clickelement(Settingssearch);
		
		Clickelement(RegistrarDepartmentSearch);
		//Thread.sleep(3000);
		String Settingtabledata[]= {"ID","Department Name","Department Code", "Created By","Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Settingtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> DepartmentName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DepartmentName")+"']//following-sibling::td"));
		List<WebElement> DepartmentName1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']//preceding-sibling::td"));

		//
		validatetext(DepartmentName1.get(0), "1"); //
		//validatet(DepartmentName.get(1), "IT"); //
		validatetext(DepartmentName.get(0), "B001");
		validatetext(DepartmentName.get(1), "");
		validatetext(DepartmentName.get(2), ConfigReader.getProperty("RegistrarDepCreatedDate&Time")); 
		validatetext(DepartmentName.get(3), "");
		validatetext(DepartmentName.get(4),ConfigReader.getProperty("RegistrarDepModifiedDate&Time"));  
		validatetext(DepartmentName.get(5), "");
		validatetext(DepartmentName.get(6), "");
		/*
		Clickelement(Clickadddept);
		sendkeyweb(Adddeptname, "");
		sendkeyweb(Adddeptcode, "");
		Clickelement(Clicksavebutton);*/
	/*	
		Clickelement(Dashboardsearch);
		Clickelement(Appsearch);
		sendkeyweb(Appsearchsend, ConfigReader.getProperty("OrgName"));
		
		
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']//preceding-sibling::td"));

		//
		
		validatetext(Orgname.get(3),  ConfigReader.getProperty("AppStatus2"));
		
		Clickelement(Appidclick);
		validatetext(InActivetxtval,  "Approved");   
		Clickelement(DomainSearch);
		
		sendkeyweb(Appsearchsend, ConfigReader.getProperty("Domain"));
		
		Clickelement(Appidclick);
		validatetext(InActivetxtval1, "Active");
		*/
		
		
		
			
	}
}
