package Registrant.obj;

import java.awt.AWTException;
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

public class Rgst_domain_obj extends Baseclass{

	WebDriver driver = Driver.getDriver(); 
	Registrant_login_object RL=new Registrant_login_object(driver);
	ConfigWriter configWriter = new ConfigWriter();
	public Rgst_domain_obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Domains')]")
	public WebElement Domains;
	
	public void user_navigate_to_domain_page() {
		Clickelement(Domains);
	   
	}
	@FindBy(xpath = "//table[@id='table1']//th")
	public List<WebElement> Table_col ;
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search ;
	public void user_validate_domain_page() {
	    String s="Domain ID,Domain Status,Domain Name,Organization Name,Registration Date,Renewal Date";
	    Table_prop(Table_col, s);
	}
	    public void user_validate_domain_data() {
	    List<WebElement> Domain_ID=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("Domain")+".bank.in'])[1]/preceding-sibling::td"));
		dispalyedattribute(Domain_ID.get(0), "Domain Id");
		List<WebElement> Table_data=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("Domain")+".bank.in'])[1]/following-sibling::td"));
		validatetext(Table_data.get(0), ConfigReader.getProperty("Orgname"));
		validatetext(Table_data.get(1), ConfigReader.getProperty("submissiondate"));
		configWriter.setProperty("Renewal", Table_data.get(2).getText());
		
		validatetext(Table_data.get(2), ConfigReader.getProperty("Renewal"));
		validatetext(Domain_ID.get(1), "Inactive");
		validateattribute(Search, "placeholder","Search");
		Clickelement(Domain_ID.get(0));
	}
	
	@FindBy(xpath = "//h3[normalize-space()='Domain Details']")
	public WebElement Details_page_title ;
	@FindBy(xpath = "//p[normalize-space()='Domain']")
	public WebElement domain_name ;
	@FindBy(xpath = "(//p[normalize-space()='Organization'])[2]")
	public WebElement org_name ;
	@FindBy(xpath = "//p[normalize-space()='Registration Date']")
	public WebElement Reg_date ;
	@FindBy(xpath = "//p[normalize-space()='Renewal Date']")
	public WebElement Ren_date ;
	@FindBy(xpath = "//p[normalize-space()='Domain Status']")
	public WebElement status ;
	@FindBy(xpath = "//p[normalize-space()='Domain']/following-sibling::div")
	public WebElement Adomain_name ;
	@FindBy(xpath = "//p[normalize-space()='Organization']/following-sibling::div")
	public WebElement Aorg_name ;
	@FindBy(xpath = "//p[normalize-space()='Registration Date']/following-sibling::div")
	public WebElement Areg_no ;
	@FindBy(xpath = "//p[normalize-space()='Renewal Date']/following-sibling::div")
	public WebElement Aren_date ;
	@FindBy(xpath = "//p[normalize-space()='Domain Status']/following-sibling::div")
	public WebElement Astatus ;

	public void user_navigates_the_domain_details_page() {
		validatetext(Details_page_title, "Domain Details");
		validatetext(domain_name, "Domain");
		validatetext(org_name, "Organization");
		validatetext(Reg_date, "Registration Date");
		validatetext(Ren_date, "Renewal Date");
		validatetext(status, "Domain Status");
		validatetext(Aorg_name, ConfigReader.getProperty("Orgname"));
		validatetext(Adomain_name, ConfigReader.getProperty("Domain")+".bank.in");
		validatetext(Areg_no, ConfigReader.getProperty("submissiondate"));
		validatetext(Aren_date, ConfigReader.getProperty("Renewal"));
		validatetext(Astatus, "Inactive");
	   
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Name Servers']")
	public WebElement Nameserver;
	@FindBy(xpath = "//div[normalize-space()='Host Name']")
	public WebElement Hostname ;
	@FindBy(xpath = "//div[normalize-space()='IP Address']")
	public WebElement Ipaddr ;
	@FindBy(xpath = "//div[normalize-space()='TTL']")
	public WebElement TTL ;
	@FindBy(xpath = "//div[normalize-space()='Invoice No']")
	public WebElement invoice ;
	@FindBy(xpath = "//div[normalize-space()='Amount']")
	public WebElement Amount;
	@FindBy(xpath = "//div[normalize-space()='Invoice Date']")
	public WebElement Invocedate;
	@FindBy(xpath = "//div[normalize-space()='Status']")
	public WebElement nsstatus;
	@FindBy(xpath = "//h2[normalize-space()='Billing History']")
	public WebElement Bill_history;
	
	public void user_validate_the_domain_domain_details_page(String NS1,String IP1,String N2,String IP2) throws AWTException, InterruptedException {
		validatetext(Nameserver, "Name Servers");
		validatetext(Hostname,"Host Name");
		validatetext(Ipaddr ,"IP Address");
		validatetext(TTL,"TTL");
		validatetext(invoice,"Invoice No");
		validatetext(Amount,"Amount");
		validatetext(Invocedate,"Invoice Date");
		validatetext(nsstatus,"Status");
		validatetext(Bill_history,"Billing History");
		try {
		List<WebElement> NS_records=driver.findElements(By.xpath("(//div[contains(@class,'row row-cols-')]//div[contains(text(),'"+ConfigReader.getProperty("NS1")+"')])/following::div"));
//		validatetext(NS_records.get(0),ConfigReader.getProperty("NS1"));
		validatetext(NS_records.get(0),ConfigReader.getProperty("IP1"));
		validatetext(NS_records.get(1),"10");
		validatetext(NS_records.get(4),ConfigReader.getProperty("NS2"));
		validatetext(NS_records.get(5),ConfigReader.getProperty("IP2"));
		}catch (Exception e) {
			System.out.println(e);
		}
		Clickelement(ADD_NS);
		RL.User_enters_name_server_details(NS1,IP1,N2,IP2);
		Clickelement(DeleteNS.get(2));
		Clickelement(DeleteNS.get(2));
		
	}
	
	
	@FindBy(xpath = "//button[@id='trashIcon']")
	public List<WebElement> DeleteNS;
	@FindBy(xpath = "//h2[normalize-space()='Name Servers']/following::div[1]")
	public WebElement ADD_NS;
	
	public void user_subit_the_domain_details_page() {
	    
		
	   
	}
	
}
