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

public class Registrar_Domain_Object_Page extends Baseclass {
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Domain_Object_Page(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Domainsearchclick;

	@FindBy(xpath="//td[normalize-space()='1']")
	public WebElement DomainIDClick;
	
	@FindBy(xpath="//mat-icon[normalize-space()='public']")
	public WebElement DomainSearch ;

	public void Registrar_nvigate_to_Domainpage() throws Exception {

		Clickelement(DomainSearch);
		Thread.sleep(5000);
	}



	@FindBy(xpath="//h3[normalize-space()='Domain Details']")
	public WebElement DomainDetailstxtval;



	@FindBy(xpath="//p[text()='Domain']")
	public WebElement Domaintextval;
	@FindBy(xpath="//p[text()='Organization']")
	public WebElement Organizationtxtval;
	@FindBy(xpath="//p[text()='Registration Date']")
	public WebElement RegistrationDatetxtval;
	@FindBy(xpath="//p[text()='Renewal Date']")
	public WebElement RenewalDatetxtval;
	@FindBy(xpath="//p[text()='Domain Status']")
	public WebElement DomainStatustxtval;


	@FindBy(xpath="//div[normalize-space()='rohantech.bank.in']")
	public WebElement Ikcontechbankintxtval1;
	@FindBy(xpath="//div[normalize-space()='Rohan Tech']")
	public WebElement IkconTechtxtval1;
	@FindBy(xpath="//div[normalize-space()='Feb 17, 2025, 12:11 AM']")
	public WebElement Datetxtval1;
	@FindBy(xpath="//div[normalize-space()='Feb 17, 2030, 12:11 AM']")
	public WebElement RenewelDatetxtval1;
	@FindBy(xpath="//div[text()='Active']")
	public WebElement InActivetxtval1;

	@FindBy(xpath="//h2[text()='Name Servers']")
	public WebElement Nameserverstxtval1;
	@FindBy(xpath="//div[text()='Host Name']")
	public WebElement Hostnametxtval;
	@FindBy(xpath="//div[text()='IP Address']")
	public WebElement IPaddtxtval1;
	@FindBy(xpath="//div[text()='TTL']")
	public WebElement TTltxtval1;
	@FindBy(xpath="//h2[text()='Billing History']")
	public WebElement BillingHistorytxtval1;
	@FindBy(xpath="//div[text()='Invoice No']")
	public WebElement invoicenumtxtval1;
	@FindBy(xpath="//div[text()='Amount']")
	public WebElement amountltxtval1;
	@FindBy(xpath="//div[text()='Invoice Date']")
	public WebElement Invoicedatetxtval1;
	@FindBy(xpath="//div[text()='Status']")
	public WebElement statustxtval1;

	


	public void user_navigate_to_Dominpage_Then_validatetabledata() throws Exception  {
		Clickelement(DomainSearch);
		Thread.sleep(5000);



		String Apptabledata1[]= { "Domain ID","Domain Name", "Organisation Name","Registration Date", "Renewal Date", "Status"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Apptabledata1[i]);
			//System.out.println("Code Printed");
		}


	}
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Appsearchsend;

	public void User_Can_Check_DomaintableData_in_Domain_Page(String src) throws Exception  {
		//String Apptabledata2[]= {"2","Rohantech.bank.in","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		sendkeyweb(Appsearchsend, "rohantech.bank.in");
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

		//
		dispalyedattribute(Orgname1.get(1), "1"); //
		validatetext(Orgname1.get(0), ConfigReader.getProperty("Domainnametxtval"));
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatetext(Orgname.get(0), ConfigReader.getProperty("DomRegistrationDate"));
		validatetext(Orgname.get(1),ConfigReader.getProperty("DomRenewalDate"));
		validatetext(Orgname.get(2), ConfigReader.getProperty("Domstatus"));
		//validatetext(Orgname.get(3) ,"5");

	}


	
	public void user_validatetext_AllFields_in_Domainpage() throws Exception { 
		Thread.sleep(3000);
		Clickelement(DomainIDClick);
		Thread.sleep(3000);
		validatetext(DomainDetailstxtval, "Domain Details");


		validatetext(Domaintextval, "Domain");
		validatetext(Organizationtxtval, "Organization");
		validatetext(RegistrationDatetxtval, "Registration Date");
		validatetext(RenewalDatetxtval, "Renewal Date");
		validatetext(DomainStatustxtval, "Domain Status");


		validatetext(Ikcontechbankintxtval1, "rohantech.bank.in");
		validatetext(IkconTechtxtval1, "Rohan Tech"); 
		validatetext(Datetxtval1, "Feb 17, 2025, 12:11 AM");
		validatetext(RenewelDatetxtval1, "Feb 17, 2030, 12:11 AM");
		validatetext(InActivetxtval1, "Active");



		validatetext(Nameserverstxtval1, "Name Servers");
		validatetext(Hostnametxtval, "Host Name"); 
		validatetext(IPaddtxtval1, "IP Address");
		validatetext(TTltxtval1, "TTL");
		validatetext(BillingHistorytxtval1, "Billing History");
		validatetext(invoicenumtxtval1, "Invoice No"); 
		validatetext(amountltxtval1, "Amount");
		validatetext(Invoicedatetxtval1, "Invoice Date");
		validatetext(statustxtval1, "Status");
		Thread.sleep(5000);
	}

	
	
	
}
