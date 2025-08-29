package Registrant.obj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Rgnt_Officer_mgmt_obj extends Baseclass {
	WebDriver driver = Driver.getDriver();

	public Rgnt_Officer_mgmt_obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath = "//span[contains(text(),'User Management')]")
	public WebElement USRMGMT;

	public void user_navigate_to_USERmgmt_page() {
		Clickelement(USRMGMT);
		Actions act = new Actions(driver);
		act.moveToElement(USRMGMT).build().perform();
	}

	@FindBy(xpath = "//a[contains(text(),'Super Admin Management')]")
	public WebElement SUPERMGMT;
	@FindBy(xpath = "//a[contains(text(),'Officer Details Management')]")
	public WebElement Ofcmgmt;

	@FindBy(xpath = "//div[contains(text(),'Officer Details Management')]")
	public WebElement OFCMGMTtitle;
	@FindBy(xpath = "//button[contains(text(),'Add Officer Details')]")
	public WebElement Addofc_button;
	@FindBy(xpath = "//tr/th")
	public List<WebElement> Table_cols;

	@FindBy(xpath = "//td[contains(text(),'Administrative Officer')]/following-sibling::td")
	public List<WebElement> AO_F;
	@FindBy(xpath = "//td[contains(text(),'Administrative Officer')]/preceding-sibling::td")
	public List<WebElement> AO_P;
	@FindBy(xpath = "//td[contains(text(),'Technical Officer')]/following-sibling::td")
	public List<WebElement> TO_F;
	@FindBy(xpath = "//td[contains(text(),'Technical Officer')]/preceding-sibling::td")
	public List<WebElement> TO_P;
	@FindBy(xpath = "//td[contains(text(),'Financial Officer')]/following-sibling::td")
	public List<WebElement> FO_F;
	@FindBy(xpath = "//td[contains(text(),'Financial Officer')]/preceding-sibling::td")
	public List<WebElement> FO_P;

	public void user_validate_the_officer_management_page() {
		validatetext(SUPERMGMT, "Super Admin Management");
		validatetext(Ofcmgmt, "Officer Details Management");
		try {
			Clickelement(Ofcmgmt);
		} catch (Exception e) {
			Clickelement(Ofcmgmt);
		}

		validatetext(OFCMGMTtitle, "Officer Details Management");
		validatetext(Addofc_button, "Add Officer Details");
		String Table_col = "Id,Entity Name,Officer Name,Designation,Mobile Number,Email ID,Role,View Documents,Login Status,Contact Approved,Delete Officer";
		Table_prop(Table_cols, Table_col);

		validatetext(AO_F.get(0), "View");
		validatetext(AO_P.get(1), ConfigReader.getProperty("Domain").toUpperCase());
		validatetext(AO_P.get(2), AO_P.get(2).getText());
		validatetext(AO_P.get(3), AO_P.get(3).getText());
		validatetext(AO_P.get(4), AO_P.get(4).getText());
		validatetext(AO_P.get(5), AO_P.get(5).getText());

		validatetext(TO_F.get(0), "View");
		validatetext(TO_P.get(1), ConfigReader.getProperty("Domain").toUpperCase());
		validatetext(TO_P.get(2), TO_P.get(2).getText());
		validatetext(TO_P.get(3), TO_P.get(3).getText());
		validatetext(TO_P.get(4), TO_P.get(4).getText());
		validatetext(TO_P.get(5), TO_P.get(5).getText());
		
		validatetext(FO_F.get(0), "View");
		validatetext(FO_P.get(1), ConfigReader.getProperty("Domain").toUpperCase());
		validatetext(FO_P.get(2), FO_P.get(2).getText());
		validatetext(FO_P.get(3), FO_P.get(3).getText());
		validatetext(FO_P.get(4), FO_P.get(4).getText());
		validatetext(FO_P.get(5), FO_P.get(5).getText());

//		Clickelement(AO_F.get(1));
		Clickelement(AO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();
		Clickelement(TO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();
		Clickelement(FO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();

	}
	
	

	@FindBy(xpath = "//div[contains(text(),'Super Admin Management')]")
	public WebElement SAtitle;
	@FindBy(xpath = "//button[contains(text(),'Add Super Admin')]")
	public WebElement AddSA_button;
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search ;

	public void Super_admin_management(){
		user_navigate_to_USERmgmt_page();
		validatetext(SUPERMGMT, "Super Admin Management");
		try {
			Clickelement(SUPERMGMT);
		} catch (Exception e) {
			Clickelement(SUPERMGMT);
		}
		

		validatetext(SAtitle, "Super Admin Management");
		validatetext(AddSA_button, "Add Super Admin");
		String Table_col = "Sl.No,User Id,User Name,Entity Name,Mobile Number,Role,Status,Actions";
		Table_prop(Table_cols, Table_col);
		List<WebElement> Domain_ID=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("Domain").toUpperCase()+"'])[1]/preceding-sibling::td"));
		dispalyedattribute(Domain_ID.get(1), "1");
		List<WebElement> Table_data1=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("Domain").toUpperCase()+"'])[1]/following-sibling::td"));
		validatetext(Table_data1.get(0), Table_data1.get(0).getText());
		validatetext(Table_data1.get(1), "Super Admin");
		validatetext(Table_data1.get(2), "Active");
		validatetext(Table_data1.get(3), "");
		validateattribute(Search, "placeholder","Search");
		
	}
	@FindBy(xpath = "//td[contains(text(),'Rejected')]")
	public List<WebElement> Status_doc ;
	@FindBy(xpath = "//button[contains(text(),'Reupload')]")
	public List<WebElement> reupload_doc ;
	public void Re_upload_documents(){
		if(Status_doc.get(0).isDisplayed()) {
			Clickelement(reupload_doc.get(0));
		}
		if(Status_doc.get(1).isDisplayed()) {
			Clickelement(reupload_doc.get(1));
		}
		if(Status_doc.get(2).isDisplayed()) {
			Clickelement(reupload_doc.get(2));
		}
		
	}
	public void user_reupload_the_officer_DOC() {
		validatetext(SUPERMGMT, "Super Admin Management");
		validatetext(Ofcmgmt, "Officer Details Management");
		try {
			Clickelement(Ofcmgmt);
		} catch (Exception e) {
			Clickelement(Ofcmgmt);
		}
		Clickelement(AO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();
		Clickelement(TO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();
		Clickelement(FO_F.get(0));
		Re_upload_documents();
		driver.navigate().back();


	}
	

	
}
