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

public class Registrar_Dashboard_Object_Page extends Baseclass{
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Dashboard_Object_Page(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement Appsearch; ;
	@FindBy(xpath="//mat-icon[normalize-space()='public']")
	public WebElement DomainSearch ;
	@FindBy(xpath="//mat-icon[normalize-space()='description']")
	public WebElement Invoicesearch ;
	@FindBy(xpath="//a[@routerlink='/reports']//mat-icon[@role='img'][normalize-space()='dashboard']")
	public WebElement Reportssearch;
	@FindBy(xpath="//mat-icon[text()='settings']")
	public WebElement Settingssearch ;



	@FindBy(xpath="//a[normalize-space()='DR User Management']")
	public WebElement DRUserManagementSearch ;
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement UserManagementSearchtxtbox ;
	@FindBy(xpath="//a[normalize-space()='Registrant User Management']")
	public WebElement RegistrantUserManagementSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrant Officer Details']")
	public WebElement RegistrantOfficerDetailsSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrar Roles']")
	public WebElement RegistrarRolesSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrar Department']")
	public WebElement RegistrarDepartmentSearch ;
	@FindBy(xpath="//mat-icon[normalize-space()='dashboard']")
	public WebElement Dashboardsearch ;

	public void User_check_allfields_in_Home_Page1() throws Exception {
		Thread.sleep(8000);
		Clickelement(Appsearch);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(DomainSearch);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(Invoicesearch);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//Clickelement(Reportssearch);
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		Clickelement(Settingssearch);
		Thread.sleep(3000);
		
		  Clickelement(DRUserManagementSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrantUserManagementSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrantOfficerDetailsSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrarRolesSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		 Clickelement(RegistrarDepartmentSearch);
		 
		Thread.sleep(8000);
		Clickelement(Dashboardsearch);

		//driver.navigate().back();
	}
	//HOME PAGE

		@FindBy(xpath="//div[contains(text(),'Total Registrants')]")
		public WebElement TotalRegistrantstxtval ;
		@FindBy(xpath="//div[contains(text(),'Total Domains')]")
		public WebElement TotalDomainstxtval ;
		@FindBy(xpath="//div[contains(text(),'Application in queue')]")
		public WebElement Applicationinqueuetxtval;
		@FindBy(xpath="//div[contains(text(),'Active Users')]")
		public WebElement ActiveUserstxtval;
		@FindBy(xpath="//p[normalize-space()='Domain Registration Trends']")
		public WebElement DomainRegistrationTrendstextval;
		@FindBy(xpath="//p[normalize-space()='Application By Status']")
		public WebElement ApplicationByStatustext;
		@FindBy(xpath="//p[normalize-space()='Application In Queue']")
		public WebElement ApplicationInQueuetextvl;

		public void User_textvaladation_in_Home_Main_Page1() {
			validatetext(TotalRegistrantstxtval, "Total Registrants");
			validatetext(TotalDomainstxtval, "Total Domains");
			validatetext(Applicationinqueuetxtval,"Application in queue");
			validatetext(ActiveUserstxtval, "Active Users");
			validatetext(DomainRegistrationTrendstextval, "Domain Registration Trends");
			validatetext(ApplicationByStatustext, "Application By Status");
			validatetext(ApplicationInQueuetextvl, "Application In Queue");
		}
		public void Create_ApplicationQuee_TextValidations_in_Home_Page(String src) throws InterruptedException {

			String Apptableextvalues[] = { "Domain ID", "Domain Name", "Organisation Name","Registration Date", "Renewal Date", "Status"};
			List<WebElement> val = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));

			for (int i = 0; i < val.size(); i++) {

				validatetext(val.get(i), Apptableextvalues[i]);
			}
			//String Apptabledata[]= {"21","Vtech.bank.in","Vtech","Feb 2, 2025, 6:54 AM","Feb 2, 2030, 6:54 AM","Pending"};
			//List<WebElement> val1 = driver.findElements(By.xpath("(//table[@id='table1']//tr[1]//td)"));
			
					List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
					List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

					 //ConfigReader.getProperty("Domainnametxtval"));
				validatetext(Orgname1.get(1), "1"); //
				validatetext(Orgname1.get(0), "yuva.bank.in");
				validatetext(Orgname.get(0), "Feb 2, 2025, 9:02 AM");
				validatetext(Orgname.get(1), "Feb 2, 2025, 9:02 AM");
				validatetext(Orgname.get(2), "Pending");

			}
		}

