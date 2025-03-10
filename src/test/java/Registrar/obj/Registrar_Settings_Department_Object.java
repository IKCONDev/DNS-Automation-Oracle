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
	public void user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(String src) throws Exception {
		
		Clickelement(Settingssearch);
		
		Clickelement(RegistrarDepartmentSearch);
		
		String Settingtabledata[]= {"ID","Department Name","Department Code", "Created By","Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Settingtabledata[i]);
			
		}
		List<WebElement> Departmentstatus=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("Departmentstatus")+"']//following-sibling::td"));
		List<WebElement> Departmentstatus1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("Departmentstatus")+"']//preceding-sibling::td"));

		//
		dispalyedattribute(Departmentstatus.get(0), "ID"); //
		//validatet(DepartmentName.get(1), "IT"); //
	   
		validatetext(Departmentstatus1.get(0), "IT001");
		validatetext(Departmentstatus1.get(1), "");
		validatetext(Departmentstatus1.get(2),"NA"); 
		validatetext(Departmentstatus1.get(3), "");
		validatetext(Departmentstatus1.get(4),"NA");  
		//validatetext(RDRDepartment.get(5), "Active");
		validatetext(Departmentstatus.get(0), "");
		validatetext(Departmentstatus.get(1), "");
		
		
		
		
		
			
	}
	}
	


