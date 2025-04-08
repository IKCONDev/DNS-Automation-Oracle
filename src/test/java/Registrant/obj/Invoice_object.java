package Registrant.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Invoice_object extends Baseclass {

	WebDriver driver = Driver.getDriver();
	public Invoice_object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath = "//span[contains(text(),'Invoice')]")
	public WebElement Invoice;	
	public void user_navigate_to_invoice_page() {
	    Clickelement(Invoice);
	}
	
	@FindBy(xpath = "//table[@id='table1']//th")
	public List<WebElement> table;
	public void user_validate_the_invoice_page() {
	    String st="Invoice ID,Organization Name,Domain Name,Amount,Invoice,Payment Status";
		Table_prop(table, st);
	}
	//configWriter.setProperty("DomainName"
	public void proforma_InvoiceDownload() {
	List<WebElement> table1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/following-sibling::td"));
	List<WebElement> table2=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/preceding-sibling::td"));
	validatetext(table1.get(0),table1.get(0).getText());
	validatetext(table1.get(1),"Proforma Invoice");
	validatetext(table1.get(2),"Approved for payment");
	dispalyedattribute(table2.get(0), "Invoice ID");
	validatetext(table2.get(1),ConfigReader.getProperty("OrgName"));
	WebElement download=driver.findElement(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/following-sibling::td//span//*[name()='svg']"));
	Clickelement(download);
	}
	
	public void InvoiceDownload() throws Exception {
		
		
		List<WebElement> table1=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/following-sibling::td"));
		List<WebElement> table2=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']/preceding-sibling::td"));
		validatetext(table1.get(0),table1.get(0).getText());
		validatetext(table1.get(1),"Invoice");
		validatetext(table1.get(2),"Approved for payment");
		dispalyedattribute(table2.get(0), "Invoice ID");
		validatetext(table2.get(1),ConfigReader.getProperty("OrgName"));
		Thread.sleep(1000);
		WebElement download=driver.findElement(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DomainName")+"']//following-sibling::td//span//*[name()='svg']"));
		Clickelement(download);
	}
	
	
	
}
