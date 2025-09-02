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

public class Registrar_Reports_Objects extends Baseclass {

	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();
	public Registrar_Reports_Objects(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath="//span[text()='Reports']")
	public WebElement ClickReports ;
	@FindBy(xpath="//a[text()='Domain Application Summary']")
	public WebElement ClickDomainappsum ;
	@FindBy(xpath="//a[text()='Domain Application Metrics']")
	public WebElement ClickDomainappmat ;
	@FindBy(xpath="//a[text()='Domain Orphan Data']")
	public WebElement ClickDomainappalp ;
	@FindBy(xpath="//h1[text()=' Domain Application Summary']")
	public WebElement Domainappsumtxtval;
	@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]//*[name()='svg']")
	public WebElement InvoiceDownloadbutton;
	
	
	
	public void Registrar_can_Navigate_to_Reports_Page_check_Textvalidations() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//span[text()='Reports']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappsum);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappmat);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappalp);
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
	
	
	public void Registrar_Reports_Domain_Application_Summary() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//span[text()='Reports']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		

		Thread.sleep(3000);
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappsum);
		Thread.sleep(3000);
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappmat);
		
		
		
		//sendkeyweb(Appsearchsend, ConfigReader.getProperty("OrgName"));

		
			
List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//following-sibling::td"));
WebElement Orgname1=driver.findElement(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//preceding-sibling::td"));
 try {
		dispalyedattribute(Orgname1, "ID");
	} catch (Exception e1) {
		// TODO Auto-generated catch block
	e1.printStackTrace();
	}
        configWriter.setProperty("EntityMobile", Orgname.get(0).getText());
        validatetext(Orgname.get(0), ConfigReader.getProperty("EntityMobile"));
		configWriter.setProperty("EntityTelephone", Orgname.get(1).getText());
		validatetext(Orgname.get(1), ConfigReader.getProperty("EntityTelephone"));
		configWriter.setProperty("EntityAddress", Orgname.get(2).getText());
	    validatetext(Orgname.get(2),  ConfigReader.getProperty("EntityAddress"));
		configWriter.setProperty("DomainName", Orgname.get(3).getText());
		validatetext(Orgname.get(3),  ConfigReader.getProperty("DomainName"));
		configWriter.setProperty("TotalPayableAmount", Orgname.get(4).getText());
		validatetext(Orgname.get(4),  ConfigReader.getProperty("TotalPayableAmount"));
		configWriter.setProperty("TDSAmount", Orgname.get(5).getText());
		validatetext(Orgname.get(5) , ConfigReader.getProperty("TDSAmount"));
		configWriter.setProperty("GSTAmount", Orgname.get(6).getText());
		validatetext(Orgname.get(6) , ConfigReader.getProperty("GSTAmount"));
		configWriter.setProperty("PaymentDate", Orgname.get(7).getText());
		validatetext(Orgname.get(7) , ConfigReader.getProperty("PaymentDate"));
		configWriter.setProperty("PaymentStatus", Orgname.get(8).getText());
		validatetext(Orgname.get(8) , ConfigReader.getProperty("PaymentStatus"));
		configWriter.setProperty("ApplicationStatus", Orgname.get(9).getText());
		validatetext(Orgname.get(9) , ConfigReader.getProperty("ApplicationStatus"));
		configWriter.setProperty("DomainStatus", Orgname.get(10).getText());
		validatetext(Orgname.get(10) , ConfigReader.getProperty("DomainStatus"));
	
		
		
	}
	
	public void Registrar_Reports_Domain_Application_Matrix() throws Exception {
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Reports']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		Clickelement(ClickReports);
		Thread.sleep(3000);
		Clickelement(ClickDomainappmat);
	
		
		driver.navigate().back();
		
	}
	
public void Registrar_Reports_Domain_Application_Orphandata() throws Exception {
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='Reports']"));
	Actions act = new Actions(driver);
	act.moveToElement(ele).build().perform();
	Thread.sleep(3000);
	Clickelement(ClickReports);
	Thread.sleep(3000);
	Clickelement(ClickDomainappalp);
	
	List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//following-sibling::td"));
	WebElement Orgname1=driver.findElement(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//preceding-sibling::td"));
	 try {
			dispalyedattribute(Orgname1, "APPID");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
		e1.printStackTrace();
		}
	 
	 try {
			dispalyedattribute(Orgname1, "ID");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
		e1.printStackTrace();
		}
	 configWriter.setProperty("DomainName", Orgname.get(0).getText());
	validatetext(Orgname.get(0), ConfigReader.getProperty("DomainName"));
	configWriter.setProperty("AppStatus", Orgname.get(1).getText());
	validatetext(Orgname.get(1),  ConfigReader.getProperty("AppStatus"));
	configWriter.setProperty("SubmissionDate", Orgname.get(2).getText());
	validatetext(Orgname.get(2), ConfigReader.getProperty("SubmissionDate"));
	configWriter.setProperty("OverDueDays", Orgname.get(3).getText());
	validatetext(Orgname.get(3),  ConfigReader.getProperty("OverDueDays"));
	configWriter.setProperty("Action", Orgname.get(4).getText());
	validatetext(Orgname.get(4),  ConfigReader.getProperty("Action"));
	
	driver.navigate().back();
	
}

}
