package Registrant_Application_page;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigWriter;
import Configuration.MultiConfigReader;
import Drivermanager.Driver;
import hooks.Baseclass;

public class Regst_App_obj extends Baseclass {
	WebDriver driver = Driver.getDriver();
	
	ConfigWriter configWriter = new ConfigWriter();
	
	public Regst_App_obj(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Applications')]")
	public WebElement Domains;
	
	
	public void user_navigate_to_application_page() {
	   Clickelement(Domains);
	    
	}
	
	@FindBy(xpath = "//th")
	public List<WebElement> Table_col ;
	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Search ;
	@FindBy(xpath = "//button[contains(@aria-label,'Next page')]")
	public WebElement nextpage ;
	
	public void elementnot(WebElement e) {
		if(e.isDisplayed()) {
			
		}else {
			Clickelement(nextpage);
			elementnot(e);
		}
	}
	
	public void user_validate_application_page() {
		

		String s="Application ID,Organisations Name,Domain Name,,Submission Date,Status,Payment Status,NS Record Status,Tenure (yrs),Payment";
		Table_prop(Table_col, s);
		List<WebElement> APP_ID=driver.findElements(By.xpath("(//td[normalize-space()='"+MultiConfigReader.getConfig2Property("Domain")+".bank.in'])[1]/preceding-sibling::td"));
		dispalyedattribute(APP_ID.get(0), "Org Name");
		List<WebElement> Table_data=driver.findElements(By.xpath("(//td[normalize-space()='"+MultiConfigReader.getConfig2Property("Domain")+".bank.in'])[1]/following-sibling::td"));
		configWriter.setProperty("submissiondate", Table_data.get(1).getText());
		configWriter.saveProperties();
		validatetext(Table_data.get(2), "Pending");
		validatetext(Table_data.get(3), "Unpaid");
		validatetext(Table_data.get(4), "OnHold");
		validatetext(Table_data.get(5), "5");
		validatetext(Table_data.get(6), "Pay Now");
		validatetext(Table_data.get(1), MultiConfigReader.getConfig2Property("submissiondate"));
		validateattribute(Search, "placeholder","Search");
		Clickelement(APP_ID.get(0));
		    
	}
	@FindBy(xpath = "//h3[normalize-space()='Applications Details']")
	public WebElement Details_page_title ;
	@FindBy(xpath = "//p[normalize-space()='Organization Name']")
	public WebElement Org_name ;
	@FindBy(xpath = "//p[normalize-space()='Domain Name']")
	public WebElement dn_name ;
	@FindBy(xpath = "//p[normalize-space()='Application No']")
	public WebElement App_no ;
	@FindBy(xpath = "//p[normalize-space()='Submission Date']")
	public WebElement sub_date ;
	@FindBy(xpath = "//p[normalize-space()='Application Status']")
	public WebElement status ;
	@FindBy(xpath = "//p[normalize-space()='Organization Name']/following-sibling::div")
	public WebElement AOrg_name ;
	@FindBy(xpath = "//p[normalize-space()='Domain Name']/following-sibling::div")
	public WebElement Adn_name ;
	@FindBy(xpath = "//p[normalize-space()='Application No']/following-sibling::div")
	public WebElement AApp_no ;
	@FindBy(xpath = "//p[normalize-space()='Submission Date']/following-sibling::div")
	public WebElement Asub_date ;
	@FindBy(xpath = "//p[normalize-space()='Application Status']/following-sibling::div")
	public WebElement Astatus ;
	
	
	public void user_navigates_the_domain_applications_details_page() {
		configWriter.setProperty("Appno", AApp_no.getText());
		configWriter.saveProperties();
		validatetext(Details_page_title, "Applications Details");
		validatetext(Org_name, "Organization Name");
		validatetext(dn_name, "Domain Name");
		validatetext(App_no, "Application No");
		validatetext(sub_date, "Submission Date");
		validatetext(status, "Status");
		validatetext(AOrg_name, MultiConfigReader.getConfig2Property("Orgname"));
		validatetext(Adn_name, MultiConfigReader.getConfig2Property("Domain")+".bank.in");
		validatetext(AApp_no, MultiConfigReader.getConfig2Property("Appno"));
		validatetext(Asub_date, MultiConfigReader.getConfig2Property("submissiondate"));
		validatetext(Astatus, "Inactive");
	    
	}

	
	@FindBy(xpath = "//h4[contains(text(),'Organization Details')]")
	public WebElement Org_details ;
	@FindBy(xpath = "//h5[contains(text(),'Institution Name')]")
	public WebElement INS_Name;
	@FindBy(xpath = "//h5[contains(text(),'Pin Code')]")
	public WebElement Pin_code;
	@FindBy(xpath = "//h5[contains(text(),'Address')]")
	public WebElement Address ;
	@FindBy(xpath = "//h5[contains(text(),'Email ID')]")
	public WebElement Email_id;
	@FindBy(xpath = "//h5[contains(text(),'Payment Receipt')]")
	public WebElement PayementR;
	@FindBy(xpath = "//h5[contains(text(),'Payment Status')]")
	public WebElement PaymentS;
	@FindBy(xpath = "//h5[contains(text(),'NS Status')]")
	public WebElement NSstatus;
	@FindBy(xpath = "//h5[contains(text(),'Domain Status')]")
	public WebElement DomainSta;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	public WebElement Submit_app;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	public List<WebElement> Submit_close;
	
	public void user_validate_the_domain_applications_details_page() throws AWTException, InterruptedException {
		validatetext(Org_details, "Organization Details");
		validatetext(INS_Name, "Institution Name");
		validatetext(INS_Name, "Pin Code");
		validatetext(INS_Name, "Address");
		validatetext(INS_Name, "Email ID");
		validatetext(INS_Name, "Payment Receipt");
		validatetext(INS_Name, "Payment Status");
		validatetext(INS_Name, "NS Status");
		validatetext(INS_Name, "Domain Status");
		validatetext(INS_Name, "Institution Name");
		validatetext(INS_Name, "Institution Name");
		validatetext(INS_Name, "Institution Name");
		
	}
	
	@FindBy(xpath = "//h4[normalize-space()='Organization Documents']")
	public WebElement ORG_doc;
	@FindBy(xpath = "//span[contains(text(),'GSTIN')]")
	public WebElement ORGST;
	@FindBy(xpath = "//span[contains(text(),'PAN')]")
	public WebElement ORPAN;
	@FindBy(xpath = "//span[contains(text(),'Licence Number')]")
	public WebElement ORLic;
	@FindBy(xpath = "//span[contains(text(),'Board Resolution')]")
	public WebElement ORBoard;
	
	@FindBy(xpath = "//div[contains(@style,'space-between') and contains(.,'Board Resolution')]")
	public WebElement BoardStatus;
	@FindBy(xpath = "//div[contains(@style,'space-between') and contains(.,'Licence Number')]")
	public WebElement LicenseStatus;
	@FindBy(xpath = "//div[contains(@style,'space-between') and contains(.,'PAN')]")
	public WebElement PANStatus;
	@FindBy(xpath = "//div[contains(@style,'space-between') and contains(.,'GSTIN')]")
	public WebElement GSTStatus;
	
	@FindBy(xpath = "//div[@id='reuploadModal']//input")
	public WebElement reuploadInput;
	@FindBy(xpath = "//div[@id='reuploadModal']//button[contains(text(),'Upload')]")
	public WebElement upload;
	@FindBy(xpath = "//div[@id='reuploadModal']//button[contains(text(),'Save')]")
	public WebElement Save;
	@FindBy(xpath = "//div[@id='reuploadModal']//button[contains(text(),'Cancel')]")
	public WebElement Cancel;
	public void user_validate_org_documents() throws AWTException, InterruptedException {
		validatetext(ORG_doc, "Organization Documents");
//		validatetext(ORGST, "GSTIN");
		validatetext(ORPAN, "PAN");
		validatetext(ORLic, "Licence Number");
		validatetext(ORBoard, "Board Resolution");
		if(GSTStatus.getText().contains("Rejected")) {
			Clickelement(RGST);
			sendkeyweb(reuploadInput, MultiConfigReader.getConfig2Property("OGSTnum"));
			Clickelement(upload);
			fileupload_robot(MultiConfigReader.getConfig1Property("GSTIN"));
			Thread.sleep(4000);
			Clickelement(Save);
			popupvalidate(null, null);
			Clickelement(Cancel);
		}
		
		if(GSTStatus.getText().contains("Rejected")) {
			Clickelement(RGST);
			sendkeyweb(reuploadInput, MultiConfigReader.getConfig2Property("OGSTnum"));
			Clickelement(upload);
			fileupload_robot(MultiConfigReader.getConfig1Property("GSTIN"));
			Thread.sleep(4000);
			Clickelement(Save);
			popupvalidate(null, null);
			Clickelement(Cancel);
		}
		
		
	}
	@FindBy(xpath = "//div[contains(@style,'space-between') and contains(.,'GSTIN')]//div[contains(@style,'underline')]")
	public WebElement RGST;
	

	public void user_subit_the_domain_applications_details_page() throws AWTException, InterruptedException {
		user_validate_org_documents();
		validatetext(Submit_app, "Submit");
		Clickelement(Submit_app);
		for(WebElement e: Submit_close) {
	    	if(e.isDisplayed()) {
	    		validatetext(e, "Cancel");
	    	}
	    }
		popupvalidate("Domain data updated successfully.", "");
		try {
		clickmultipleweb(Submit_close);
		}catch (Exception e) {
		}
	    
	}
	
	

}
