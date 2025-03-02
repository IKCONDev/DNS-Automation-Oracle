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

	@FindBy(xpath="//td[normalize-space()='Canara Bank']/preceding-sibling::td")
	public WebElement DomainIDClick;
	
	@FindBy(xpath="//mat-icon[normalize-space()='public']")
	public WebElement DomainSearch ;

	



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
	
	@FindBy(xpath="//div[normalize-space()=\"mario\"]")
	public WebElement organisationname;
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



		String Apptabledata1[]= { "Domain ID","Domain Name", "Organization Name","Registration Date", "Renewal Date", "Status"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Apptabledata1[i]);
			//System.out.println("Code Printed");
		}


	}
	
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Appsearchsend;
	

	public void User_Can_Check_DomaintableData_in_Domain_Page() throws Exception  {
		//String Apptabledata2[]= {"2","Rohantech.bank.in","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		sendkeyweb(Appsearchsend, ConfigReader.getProperty("DomainName"));
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/preceding-sibling::td"));

		//
		dispalyedattribute(Orgname1.get(0), "ID"); //
		validatetext(Orgname1.get(1), ConfigReader.getProperty("DomainName"));
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatetext(Orgname.get(0), ConfigReader.getProperty("AppSubmissionDate"));
		configWriter.setProperty("DomRenewalDate", Orgname.get(1).getText());
		configWriter.saveProperties();
		validatetext(Orgname.get(1),ConfigReader.getProperty("DomRenewalDate"));
		validatetext(Orgname.get(2), ConfigReader.getProperty("Domstatus"));
		//validatetext(Orgname.get(3) ,"5");

	}

	@FindBy(xpath="(//*[local-name()='svg' or xmlns='http://www.w3.org/2000/svg'])[6]")
	public WebElement Clicknameseraddbtn;
	@FindBy(xpath="//input[@id='3host']")
	public WebElement Nameserver3hostinbox;
	@FindBy(xpath="//input[@id='4host']")
	public WebElement Nameserver4hostinbox;
	@FindBy(xpath="//input[@id='3ipAddress']")
	public WebElement Nameserver3addinbox;
	@FindBy(xpath="//input[@id='4ipAddress']")
	public WebElement Nameserver4addinbox;
	@FindBy(xpath="//button[normalize-space()='Add More NS']")
	public WebElement addmorebuttonns;
	@FindBy(xpath="//button[normalize-space()='Save & Next']")
	public WebElement savebuttonns;
	@FindBy(xpath="//div[contains(text(),'47.25.36.12')]//following-sibling::div//button[@id='trashIcon']")
	public WebElement delete3;
	@FindBy(xpath="//div[contains(text(),'77.25.36.31')]//following-sibling::div//button[@id='trashIcon']")
	public WebElement delete4;
	@FindBy(xpath="//th")
	public List<WebElement> Tabledata;
	@FindBy(xpath = "//p[normalize-space()='Organization']/following-sibling::div")
	public WebElement AOrg_name ;
	@FindBy(xpath = "//p[normalize-space()='Domain']//following-sibling::div")
	public WebElement Adn_name ;
	@FindBy(xpath = "//p[normalize-space()='Renewal Date']//following-sibling::div")
	public WebElement AApp_rendate ;
	@FindBy(xpath = "//p[normalize-space()='Registration Date']//following-sibling::div")
	public WebElement Asub_date ;
	@FindBy(xpath = "//p[normalize-space()='Domain Status']/following-sibling::div")
	public WebElement Astatus ;
 
	@FindBy(xpath = "//p[contains(text(),'Do you have Name Server Details?')]")
	public WebElement DOUhavennsd ;
	@FindBy(xpath = "//label[@for='hasNSDetailsYes']")
	public WebElement nsdetailstxtval;
	@FindBy(xpath = "//label[@for='hasNSDetailsNo']")
	public WebElement nsdnotxtval ;
	@FindBy(xpath = "//label[normalize-space()='Name Server 3 Host Name']")
	public WebElement nhns3txtval ;
	@FindBy(xpath = "//label[normalize-space()='Name Server 3 IP Address']")
	public WebElement ns3hipaddtxtval; 
	@FindBy(xpath = "//label[normalize-space()='Name Server 4 Host Name']")
	public WebElement nhns4txtval ;
	@FindBy(xpath = "//label[normalize-space()='Name Server 4 IP Address']")
	public WebElement nsh4ipaddtxtval; 
	
	
	
	
	public void user_validatetext_AllFields_in_Domainpage(String src1) throws Exception { 
		Thread.sleep(3000);
		List<WebElement> DomainName1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/preceding-sibling::td"));
		Clickelement(DomainName1.get(0));
		Thread.sleep(3000);
		validatetext(DomainDetailstxtval, "Domain Details");
		

		validatetext(Domaintextval, "Domain");
		validatetext(DomainStatustxtval, "Domain Status"); 
		validatetext(Organizationtxtval, "Organization");
		validatetext(RegistrationDatetxtval, "Registration Date");
		validatetext(RenewalDatetxtval, "Renewal Date");
		


		/*
		validatetext(IkconTechtxtval1, "tambola.bank.in"); 
		validatetext(InActivetxtval1, "Inactive");
		validatetext(organisationname, "mario");
		validatetext(Datetxtval1, "Feb 20, 2025, 5:11 PM");
		validatetext(RenewelDatetxtval1, "Feb 20, 2030, 5:11 PM");*/
		
		
		
		validatetext(Adn_name, ConfigReader.getProperty("DomainName"));
		configWriter.setProperty("Domstatus", Astatus.getText());
		validatetext(Astatus, ConfigReader.getProperty("Domstatus"));
	    validatetext(AOrg_name, ConfigReader.getProperty("OrgName"));	
	    configWriter.setProperty("AppSubmissionDate", Asub_date.getText());
		validatetext(Asub_date, ConfigReader.getProperty("AppSubmissionDate"));
		//configWriter.setProperty("DomRenewalDate", Orgname.get(1).getText());
		//configWriter.saveProperties();
		 configWriter.setProperty("DomRenewalDate", AApp_rendate.getText());
		validatetext(AApp_rendate, ConfigReader.getProperty("DomRenewalDate"));
		
	 
		
/*
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		dispalyedattribute(Orgname1.get(1), "1"); //
		validatetext(Orgname1.get(0), ConfigReader.getProperty("Domain"));
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatetext(Orgname.get(0), ConfigReader.getProperty("AppSubmissionDate"));
		validatetext(Orgname.get(1),ConfigReader.getProperty("DomRenewalDate"));
		validatetext(Orgname.get(2), ConfigReader.getProperty("Domstatus"));
		//validatetext(Orgname.get(3) ,"5");*/

		validatetext(Nameserverstxtval1, "Name Servers");
		Thread.sleep(3000);
		Clickelement(Clicknameseraddbtn);
		Thread.sleep(3000);
		Clickelement(addmorebuttonns);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(Clicknameseraddbtn);
	    Thread.sleep(2000);
		validatetext(DOUhavennsd,"Do you have Name Server Details?");
		Thread.sleep(2000);
		validatetext(nsdetailstxtval,"I have NS details (can be updated later)");
		Thread.sleep(2000);
		validatetext(nsdnotxtval," I will set it later");
		Thread.sleep(2000);
		validatetext(nhns3txtval,"Name Server 3 Host Name");
		Thread.sleep(2000);
		validatetext(ns3hipaddtxtval,"Name Server 3 IP Address");
		Thread.sleep(2000);
		validatetext(nhns4txtval,"Name Server 4 Host Name");
		Thread.sleep(2000);
		validatetext(nsh4ipaddtxtval,"Name Server 4 IP Address");
		Thread.sleep(2000);
		sendkeyweb(Nameserver3hostinbox,"Groundfloor");
		Thread.sleep(2000);
		sendkeyweb(Nameserver4hostinbox,"Topfloor");
		Thread.sleep(2000);
		sendkeyweb(Nameserver3addinbox, "47.25.36.12");
		Thread.sleep(2000);
		sendkeyweb(Nameserver4addinbox, "77.25.36.31");
		Thread.sleep(2000);
		//Clickelement(addmorebuttonns);
		Clickelement(savebuttonns);
		Thread.sleep(3000);
		Clickelement(delete3);
		Thread.sleep(3000);
		//validatealert("Are you sure, you really want to delete this name server record ?");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		Clickelement(delete4);
		//validatealert("Are you sure, you really want to delete this name server record ?");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		validatetext(Hostnametxtval, "Host Name"); 
		validatetext(IPaddtxtval1, "IP Address");
		validatetext(TTltxtval1, "TTL");
		validatetext(BillingHistorytxtval1, "Billing History");
		validatetext(invoicenumtxtval1, "Invoice No"); 
		validatetext(amountltxtval1, "Amount");
		validatetext(Invoicedatetxtval1, "Invoice Date");
		validatetext(statustxtval1, "Status");
		Thread.sleep(5000);
		List<WebElement> Status=driver.findElements(By.xpath("//div[normalize-space()='"+src1+"']/preceding-sibling::div"));

		//
		dispalyedattribute(Status.get(0), "6"); //
		configWriter.setProperty("InAmount", Status.get(1).getText());
		validatetext(Status.get(1), ConfigReader.getProperty("InAmount"));
		configWriter.setProperty("InvoiceDate", Status.get(2).getText());
		validatetext(Status.get(2), ConfigReader.getProperty("InvoiceDate"));
		
		
		
		
	}



	
	
	
}
