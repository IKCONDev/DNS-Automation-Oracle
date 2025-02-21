package Registrant.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigWriter;
import Configuration.ConfigReader;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Rs_Settings_obj extends Baseclass{
	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();
	public Rs_Settings_obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	Actions actions = new Actions(driver);
	
	
	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	public WebElement Settings;	
	@FindBy(xpath = "//a[contains(text(),'User Management')]")
	public List<WebElement> User_mang;	
	//div[contains(@class,'box visible')]
	@FindBy(xpath = "//a[contains(text(),'Officer Details Management')]")
	public List<WebElement> Officer_details_manage;	
	public void user_navigate_to_user_management_page() {
	   actions.moveToElement(Settings).perform();
	    clickmultipleweb(User_mang);
	}
	@FindBy(xpath = "//th")
	public List<WebElement> table;	
	public void user_validate_the_user_management_page() {
	   String st="Sl.No,User Id,User Name,Organisation Name,Role,Status";
	  //"24	venkateshl@ikcontech.com	Charan T	Orgname	Super Admin	Active"
	    Table_prop(table, st);
	    List<WebElement> tabledata=driver.findElements(By.xpath("//td[contains(text(),'"+ConfigReader.getProperty("Username")+"')]/following-sibling::td"));
	    validatetext(tabledata.get(0), ConfigReader.getProperty("nameuser"));
	    validatetext(tabledata.get(1), ConfigReader.getProperty("Orgname"));
	    validatetext(tabledata.get(2), "Super Admin");
	    validatetext(tabledata.get(3), "Active");
	    WebElement IDs=driver.findElement(By.xpath("//td[contains(text(),'"+ConfigReader.getProperty("Username")+"')]/preceding-sibling::td"));
	    dispalyedattribute(IDs, "Super Admin Id");
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='View']")
	public List<WebElement> view;

	public void user_navigate_to_officer_details_management_page() {
		actions.moveToElement(Settings).perform();
	    clickmultipleweb(Officer_details_manage);
	    String st="Id,Organisation Name,Person Name,Designation,Mobile Number,Email Id,Role,Verify Documents,Login Status,Actions";
	    Table_prop(table, st);
	  	    
	    List<WebElement> AO1=driver.findElements(By.xpath("//td[contains(text(),'Administrative')]/following-sibling::td"));
	    List<WebElement> AO2=driver.findElements(By.xpath("//td[contains(text(),'Administrative')]/preceding-sibling::td"));
	    validatetext(AO1.get(0), "View");
	    validatetext(AO1.get(1), "NA");
	    validatetext(AO2.get(5), ConfigReader.getProperty("admin_email"));
	    validatetext(AO2.get(4), ConfigReader.getProperty("admin_phone"));
	    validatetext(AO2.get(3), ConfigReader.getProperty("admin_desig"));
	    validatetext(AO2.get(2), ConfigReader.getProperty("admin_fname"));
	    validatetext(AO2.get(1), ConfigReader.getProperty("Orgname"));
	    dispalyedattribute(AO2.get(0), "Admin Id");
	    
//	    validate_document_table(view.get(0));
	    
	    List<WebElement> TO1=driver.findElements(By.xpath("//td[contains(text(),'Technical')]/following-sibling::td"));
	    List<WebElement> TO2=driver.findElements(By.xpath("//td[contains(text(),'Technical')]/preceding-sibling::td"));
	    validatetext(TO1.get(0), "View");
	    validatetext(TO1.get(1), "NA");
	    validatetext(TO2.get(5), ConfigReader.getProperty("tech_email"));
	    validatetext(TO2.get(4), ConfigReader.getProperty("tech_phone"));
	    validatetext(TO2.get(3), ConfigReader.getProperty("tech_desig"));
	    validatetext(TO2.get(2), ConfigReader.getProperty("tech_fname"));
	    validatetext(TO2.get(1), ConfigReader.getProperty("Orgname"));
	    dispalyedattribute(TO2.get(0), "Admin Id");
	    
	    validate_document_table(view.get(1));
	    
	    List<WebElement> BO1=driver.findElements(By.xpath("//td[contains(text(),'Billing')]/following-sibling::td"));
	    List<WebElement> BO2=driver.findElements(By.xpath("//td[contains(text(),'Billing')]/preceding-sibling::td"));
	    
	    
	    validatetext(BO1.get(0), "View");
	    validatetext(BO1.get(1), "NA");
	    validatetext(BO2.get(5), ConfigReader.getProperty("bill_email"));
	    validatetext(BO2.get(4), ConfigReader.getProperty("bill_phone"));
	    validatetext(BO2.get(3), ConfigReader.getProperty("bill_desig"));
	    validatetext(BO2.get(2), ConfigReader.getProperty("bill_fname"));
	    validatetext(BO2.get(1), ConfigReader.getProperty("Orgname"));
	    dispalyedattribute(BO2.get(0), "Admin Id");
	    
	    validate_document_table(view.get(2));
	    
	}
	
	
	@FindBy(xpath = "//td[contains(text(),'Aadhaar')]/following-sibling::td")
	public List<WebElement> AA;	
	@FindBy(xpath = "//td[contains(text(),'Aadhaar')]/preceding-sibling::td")
	public List<WebElement> AA1;	
	@FindBy(xpath = "//td[contains(text(),'PAN')]/following-sibling::td")
	public List<WebElement> PA;	
	@FindBy(xpath = "//td[contains(text(),'PAN')]/preceding-sibling::td")
	public List<WebElement> PA1;	
	@FindBy(xpath = "//td[contains(text(),'Organisation Id')]/following-sibling::td")
	public List<WebElement> OI;	
	@FindBy(xpath = "//td[contains(text(),'Organisation Id')]/preceding-sibling::td")
	public List<WebElement> OI1;	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public List<WebElement> close;	
	
	
	
	public void validate_document_table(WebElement e) {
		Clickelement(e);
		String st="Id,Document,Document Type,Status,Comment,Reupload Document";

		Table_prop(table, st);
		validatetext(AA.get(0), "Aadhaar");
	    validatetext(AA.get(1), "NA");
	    validatetext(AA.get(2), "NA");
	    validatetext(AA.get(3), "Reupload");
	    dispalyedattribute(AA1.get(0), "Aadhar ID");
	    Clickelement(AA1.get(1));
	    clickmultipleweb(close);
	    
	    
	    validatetext(PA.get(0), "PAN");
	    validatetext(PA.get(1), "NA");
	    validatetext(PA.get(2), "NA");
	    validatetext(PA.get(3), "Reupload");
	    dispalyedattribute(PA1.get(0), "Aadhar ID");
	    Clickelement(PA1.get(1));
	    clickmultipleweb(close);
	    
	    
	    validatetext(OI.get(0), "NA");
	    validatetext(OI.get(1), "NA");
	    validatetext(OI.get(2), "Reupload");
	    dispalyedattribute(OI1.get(0), "Aadhar ID");
	    Clickelement(OI1.get(1));
	    clickmultipleweb(close);
		
		driver.navigate().back();
	}

	public void user_validate_the_officer_details_management_page() {
	   
	    
	}
}
