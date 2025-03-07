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

public class Registrar_Invoice_Object extends Baseclass {
	
	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Invoice_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	@FindBy(xpath="//mat-icon[normalize-space()='description']")
	public WebElement Invoicesearch ;
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Appsearchsend;
	@FindBy(xpath="//tbody/tr[1]/td[6]/span[1]//*[name()='svg']")
	public WebElement InvoiceDownloadbutton;
	////span[@class='ng-star-inserted']//*[name()='svg']
//	@FindBy(xpath="(//td[normalize-space()='Approved for payment']/preceding-sibling::td)[5]")
//	@FindBy(xpath="//td[normalize-space()='cbse.bank.in']/following-sibling::td//span//*[name()='svg']")
	public WebElement InvoiceDownloadbutton1;
	//INVOICE____MODULE
		public void user_navigate_to_Invoicepage1() throws Exception {
			Thread.sleep(8000);

			Clickelement(Invoicesearch);
			
			String Apptabledata1[]= { "","SNo","Organization Name", "Domain Name","Amount","Invoice","Payment Status"};
			List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
			Thread.sleep(3000);
			for (int i= 0; i< values.size(); i++) {

				validatetext(values.get(i), Apptabledata1[i]);
				//System.out.println("Code Printed");
			}
			sendkeyweb(Appsearchsend, ConfigReader.getProperty("DomainName"));
			//sendkeyweb(Appsearchsend, "rohantech.bank.in");
			List<WebElement> DomainName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/following-sibling::td"));
			List<WebElement> DomainName1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/preceding-sibling::td"));
			
			//
//			validatetext(Domain1.get(0)
			//dispalyedattribute(DomainName1.get(0), "checkbox");
			dispalyedattribute(DomainName1.get(0), "ID");
			//validatetext(Domain1.get(1), ConfigReader.getProperty("6"));
			validatetext(DomainName1.get(1), ConfigReader.getProperty("OrgName"));
			//validatet(Orgname.get(0), "Ikcontech solutions");
			configWriter.setProperty("InAmount", DomainName.get(0).getText());
			validatetext(DomainName.get(0), ConfigReader.getProperty("InAmount"));
			configWriter.setProperty("Invoicedownload", DomainName.get(1).getText());
			validatetext(DomainName.get(1),ConfigReader.getProperty("Invoicedownload"));
			WebElement inv_down=driver.findElement(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/following-sibling::td//span//*[name()='svg']"));
			Clickelement(inv_down);
			configWriter.setProperty("InvoiceStatus", DomainName.get(2).getText());
			validatetext(DomainName.get(2), ConfigReader.getProperty("Status"));
			//validatetext(Domain.get(3) ,"");
			
			
			Actions act = new Actions(driver);
			Thread.sleep(3000);
			act.doubleClick(InvoiceDownloadbutton1);
			Thread.sleep(1000);
			act.doubleClick(InvoiceDownloadbutton1);
			
			
			
			

		}
	

}
