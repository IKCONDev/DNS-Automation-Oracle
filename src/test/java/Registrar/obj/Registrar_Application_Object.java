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

public class Registrar_Application_Object extends Baseclass {
	
	
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Application_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement App1search; ;
	@FindBy(xpath="//div[text()='Organisations Name']")
	public WebElement Organisationnametxtval; 
	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement Appsearch; 

	@FindBy(xpath="//div[@role='alert']")
	public WebElement Toastermessage;

public void User_textvaladation_in_Application_Page1() throws Exception  {
	Thread.sleep(5000);
	Clickelement(Appsearch);
	//Thread.sleep(5000);
	String Apptableextvalues[] = {"Application ID", "Organisations Name","Domain Name","", "Submission Date", "Application Status","Payment Status","NS Record Status","Tenure (yrs)"};
	List<WebElement> val = driver.findElements(By.xpath("//table[@id='table1']//th"));
	//Thread.sleep(3000);
	for (int i = 0; i < val.size(); i++) {
        if(val.get(i).isDisplayed()) {
		validatetext(val.get(i), Apptableextvalues[i]);	
        }
	}	 

}

@FindBy(xpath="//input[@placeholder='Search']")
public WebElement searchbuttonclick; 
@FindBy(xpath="//td[normalize-space()='1']")
public WebElement AppCountsearch; 
@FindBy(xpath="//table[@id=\"table1\"]//tbody//tr[2]//td[1]")
public WebElement DomainCountsearch; 
@FindBy(xpath="//h3[text()='Applications Details']")
public WebElement Domainapptxtval;
@FindBy(xpath="//p[text()='Organization Name']")
public WebElement OrganizationNametxtval;
@FindBy(xpath="//p[text()='Domain Name']")
public WebElement DomainNametxtval;
@FindBy(xpath="//p[text()='Submission Date']")
public WebElement SubmissionDatetxtval;
@FindBy(xpath="//p[text()='Application No']")
public WebElement ApplicationNotxtval;
@FindBy(xpath="//p[text()='Application Status']")
public WebElement Statustxtval;

@FindBy(xpath="//div[text()='Rohan Tech']")
public WebElement IkconTechtxtval;
@FindBy(xpath="//div[contains(text(),'rohantech.bank.in')]")
public WebElement Ikcontechbankintxtval;
@FindBy(xpath="//div[contains(text(),'Feb 17, 2025, 12:11 AM')]")
public WebElement Datetxtval;
@FindBy(xpath="//div[contains(text(),'IDR302701')]")
public WebElement IDR110427txtval ;
@FindBy(xpath="(//div[@class='box-content'])[2]")
public WebElement InActivetxtval;
@FindBy(xpath="//input[@placeholder='Search']")
public WebElement Appsearchsend;



public void User_Can_Check_Application_Tabledatatextvaladation_in_Applications_Page(String src) throws Exception {

	//String Apptabledata[]= {"2","Vtech.bank.in","Onboarding Pending","Feb 2, 2025, 6:54 AM","Feb 2, 2030, 6:54 AM","InActive","Unpaid","OnHold","5"};
	//List<WebElement> val1 = driver.findElements(By.xpath("(//table[@id='table1']//tr[1]//td)"));
sendkeyweb(Appsearchsend, "Rohan Tech");
	
	List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']//following-sibling::td"));
	List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']//preceding-sibling::td"));

	//
	 dispalyedattribute(Orgname1.get(0), "1");
	validatetext(Orgname.get(0), ConfigReader.getProperty("AppDomainname"));
	System.out.println("HI"+Orgname.get(2));
	//validatetext(Orgname.get(1), ""); 
	validatetext(Orgname.get(2), ConfigReader.getProperty("AppSubmissionDate"));
	validatetext(Orgname.get(3),  ConfigReader.getProperty("AppStatus"));
	validatetext(Orgname.get(4),  ConfigReader.getProperty("AppPaymentStatus"));
	validatetext(Orgname.get(5),  ConfigReader.getProperty("AppNSRecordStatus"));
	validatetext(Orgname.get(6) , ConfigReader.getProperty("AppTenure"));
	// dispalyedattribute(Orgname.get(7), "");


	//sendkeyweb(searchbuttonclick,"Ikcon");

	Thread.sleep(8000); //
	Clickelement(Orgname1.get(0));

}
//Applications ---org details 

@FindBy(xpath="//h4[contains(text(),' Organization Details')]")
public WebElement OrganizationDetailstxtval;
@FindBy(xpath="//h5[normalize-space()='Institution Name']")
public WebElement InstitutionNametxtval;
@FindBy(xpath="//input[@placeholder='Enter your Institute Name']")
public WebElement Institionnameplaceholderval;
@FindBy(xpath="//h5[normalize-space()='Pin Code']")
public WebElement PinCodetxtval;
@FindBy(xpath="//input[@placeholder='Enter a pin code']")
public WebElement PinCodeeditval;

@FindBy(xpath="//h5[normalize-space()='Address']")
public WebElement Addresstxtval;
@FindBy(xpath="//h5[normalize-space()='Email ID']")
public WebElement Emailtxtval;
@FindBy(xpath="//input[@placeholder='Enter your Email id']")
public WebElement Emailtxtbox;
@FindBy(xpath="//h5[normalize-space()='Payment Status']")
public WebElement Paystatustxtval;
@FindBy(xpath= "(//select)[1]")
public WebElement Selectpaymentoption;
@FindBy(xpath="//p[contains(text(), 'View Payment Receipt ')]")
public WebElement Viewpaymentclick;
@FindBy(xpath="(//button[text()='Reject'])[1]")
public WebElement paydocrejectclick;
@FindBy(xpath="//div[@id='viewThePaymentReciept']//span[@aria-hidden='true'][normalize-space()='×']")
public WebElement payrejcloseclick;


@FindBy(xpath="(//select)[2]")
public WebElement NSstatus;

@FindBy(xpath="(//div[@class='box-content'])[5]")
public WebElement Domainstatus ;



public void User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page() throws Exception{
	validatetext(Domainapptxtval, "Applications Details");
	validatetext(ApplicationNotxtval, "Application No");
	validatetext(Statustxtval, "Application Status");
	validatetext(OrganizationNametxtval, "Organization Name");
	validatetext(DomainNametxtval, "Domain Name");
	validatetext(SubmissionDatetxtval, "Submission Date");


	validatetext(IDR110427txtval, "IDR302701");
	validatetext(InActivetxtval,  "Approved");   
	validatetext(IkconTechtxtval, "Rohan Tech"); //
	validatetext(Ikcontechbankintxtval, "rohantech.bank.in");
	validatetext(Datetxtval, "Feb 17, 2025, 12:11 AM");


	validatetext(OrganizationDetailstxtval, "Organization Details"); //
	validatetext(InstitutionNametxtval, "Institution Name");
	validateattribute(Institionnameplaceholderval,"placeholder", "Enter your Institute Name");
	validatetext(PinCodetxtval, "Pin Code");
    sendkeyweb(PinCodeeditval,"130003");
	validatetext(Addresstxtval, "Address");
	validatetext(Emailtxtval, "Email ID"); //
	sendkeyweb(Emailtxtbox,"bhargav@gmail.com");
	validatetext(Paystatustxtval, "Payment Status");
	//Selectdropdown(Selectpaymentoption, "Paid");
	//Clickelement(Viewpaymentclick);
	//Clickelement(paydocrejectclick);
	Thread.sleep(3000);
	//Clickelement(payrejcloseclick);

	//Selectdropdown(NSstatus, "Inprogress");
	//Selectdropdown(Domainstatus, "Active");


	validatetext(NSstatustxtval, "NS Status");
	validatetext(Domainstatustxtval, "Domain Status");
}
@FindBy(xpath="//h5[normalize-space()='NS Status']")
public WebElement NSstatustxtval;
@FindBy(xpath="//h5[normalize-space()='Domain Status']")
public WebElement Domainstatustxtval;

@FindBy(xpath="//h4[contains(text(),'Organization Documents')]")
public WebElement OrganizationDocstxtval;
@FindBy(xpath="//span[text()='GSTIN']")
public WebElement  GSTINsearch;
@FindBy(xpath="(//button[contains(text(),'Approve')])[2]")
public WebElement  ApproveClick;
//1st case
@FindBy(xpath="//select[@class='form-control ng-valid ng-touched ng-dirty']")
public WebElement  selectstatustxtval;
@FindBy(xpath="(//div[@class='status approved'])[1]")
public WebElement  Approved1statustxtval;
@FindBy(xpath="(//div[@class='status approved'])[2]")
public WebElement  Approved2statustxtval;
@FindBy(xpath="(//div[@class='status approved'])[3]")
public WebElement  Approved3statustxtval;
@FindBy(xpath="(//div[@class='status approved'])[4]")
public WebElement  Approved4statustxtval;
@FindBy(xpath="(//div[text()=' Approved '])[1]")
public WebElement  Rejectstatus2txtval;


//Toaster Message///////////////
@FindBy(xpath="//div[@role='alert']")
public WebElement  ToastermessageApproved;



@FindBy(xpath="//div[@id='viewTheOrgGstDocs']//span[@aria-hidden='true'][normalize-space()='×']")
public WebElement  ClosebuttonClick;
@FindBy(xpath="//span[text()='PAN']")
public WebElement PANsearch ;
@FindBy(xpath="//div[@id='viewTheOrgPanDocs']//button[@class='btn btn-primary'][normalize-space()='Approve']")
public WebElement  Approve2Click;
@FindBy(xpath="//div[@id='viewTheOrgPanDocs']//span[@aria-hidden='true'][normalize-space()='×']")
public WebElement  Close2buttonClick;
@FindBy(xpath="//span[text()='Licence Number']")
public WebElement LicenceNumberdocsearch ;
@FindBy(xpath="//div[@id='viewTheOrgLicenceDocs']//button[@class='btn btn-primary'][normalize-space()='Approve'][1]")
public WebElement  Approve3Click;
@FindBy(xpath="//div[@id='viewTheOrgLicenceDocs']//span[@aria-hidden='true'][normalize-space()='×']")
public WebElement  Close3buttonClick;
@FindBy(xpath="//span[text()='Board Resolution']")
public WebElement BoardResolutionsearch  ;
@FindBy(xpath="//div[@id='viewTheBoardDocs']//button[@class='btn btn-primary'][normalize-space()='Approve'][1]")
public WebElement  Approve4Click;
@FindBy(xpath="//div[@id='viewTheBoardDocs']//span[@aria-hidden='true'][normalize-space()='×']")
public WebElement  Close4buttonClick;
@FindBy(xpath="//div[@role='alert' and @aria-label='Document Approved']")
public WebElement  Toastermsgappovedoc;
public void User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page() throws Exception {
	validatetext(OrganizationDocstxtval, "Organization Documents");
	
	
	
	Thread.sleep(3000);
	Clickelement(GSTINsearch);
	Thread.sleep(3000);
	Clickelement(ApproveClick);
	//Thread.sleep(5000);
	//Selectdropdown(selectstatustxtval, "Approved for payment");
    validatetext(Approved1statustxtval, "Approved");
   // validatetext(Rejectstatus2txtval, "Approved ");
    validatetext(Toastermsgappovedoc, "Document  Approved");
	//Clickelement(ClosebuttonClick);
	Thread.sleep(3000);
	Clickelement(PANsearch);
	Thread.sleep(3000);
	Clickelement(Approve2Click);
	validatetext(Approved2statustxtval, "Approved");
	validatetext(Toastermsgappovedoc, "Document  Approved");
	//Thread.sleep(3000);
	//Clickelement(Close2buttonClick);
	//Thread.sleep(3000);
	
	//Thread.sleep(3000);
	//validatetext(Rejectstatus2txtval, "Approved");
	//Thread.sleep(3000);
	//validatetext(Toastermsgappovedoc, "Document  Approved Successfully");
	Thread.sleep(3000);
	Clickelement(LicenceNumberdocsearch);
	Thread.sleep(3000);
	Clickelement(Approve3Click);
	//Thread.sleep(5000);
	//Clickelement(Close3buttonClick);
	//Thread.sleep(5000);
	validatetext(Approved3statustxtval, "Approved");
	//Thread.sleep(5000);
	//validatetext(Rejectstatus2txtval, "Approved");
	validatetext(Toastermsgappovedoc, "Document  Approved");
	Thread.sleep(2000);
	Clickelement(BoardResolutionsearch);
	Thread.sleep(2000);
	Clickelement(Approve4Click);
	Thread.sleep(2000);
	//Clickelement(Close4buttonClick);
	
	///Thread.sleep(5000);
	validatetext(Approved4statustxtval, "Approved");
	//Thread.sleep(5000);
	//validatetext(Rejectstatus2txtval, "Approved");
	validatetext(Toastermsgappovedoc, "Document  Approved");
	validatetext(offtxtval, "Officers"); //
	validatetext(ststxtval, "Status");
	validatetext(linktxtval, "Links");
	validatetext(AOofftxtval, "Administrative Officer");
	validatetext(TOofftxtval, "Technical Officer"); //
	validatetext(BOofftxtval, "Billing Officer");
}
//AO
@FindBy(xpath="//td[contains(text(),'Administrative Officer')]/following-sibling::td//a")
public WebElement setAoviewclick ;
@FindBy(xpath="//td[contains(text(),'Administrative Officer')]/following-sibling::td//p")
public WebElement Aoviewclick ;
@FindBy(xpath="(//a[contains(text(),'View')])[1]")
public WebElement AoDocviewclick ;
@FindBy(xpath="//table[@id='table1']//tr[1]//td[2]")
public WebElement AOAdharverify ;
@FindBy(xpath="(//button[text()='Close'])[1]")
public WebElement AOadharclosebutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//td[4]//span)[1]")
public WebElement AOadharAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement AOadharApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement AOadharApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[1]/td[5]")
public WebElement AOadharApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[2]//td[2]")
public WebElement AOpanverify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement AOpanclosebutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[2]//td[4]//span)[1]")
public WebElement AOPanAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement AOpanApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement AOpanApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[2]/td[5]")
public WebElement AOpanApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[3]//td[2]")
public WebElement AOODVerify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement AOODclosebutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[3]//td[4]//span)[1]")
public WebElement AOODAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement AOODApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement AOODApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[3]/td[5]")
public WebElement AodApprovalchecktxtval ;

public void User_Can_Check_AdministrativeOfficier_Functionalities_in_Applications_Page(String src,String src4,String src5,String src6) throws Exception {
	//AO
	Clickelement(Aoviewclick);
	Thread.sleep(3000);
	/*
///////////////////////////	1
	List<WebElement> Orgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[1]/following-sibling::td"));
	List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[1]/preceding-sibling::td"));
	//
	validatetext(Orgname1.get(0), "1"); //
	validatetext(Orgname.get(0), ConfigReader.getProperty("AOPersonname"));
	validatetext(Orgname.get(1), ConfigReader.getProperty("AODesignation"));
	validatetext(Orgname.get(2), ConfigReader.getProperty("AOMobileNumber"));
	validatetext(Orgname.get(3), ConfigReader.getProperty("AOEmailId"));
	validatetext(Orgname.get(4), ConfigReader.getProperty("AORole"));
	validatetext(Orgname.get(5), "View");
	validatetext(Orgname.get(6), "");
	validatetext(Orgname.get(7), ConfigReader.getProperty("AOLoginStatus"));
	validatetext(Orgname.get(8), ConfigReader.getProperty("AOIsActive"));
	validatetext(Orgname.get(9), "");
	
	
	List<WebElement> BOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[2]/following-sibling::td"));
	List<WebElement> BOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[2]/preceding-sibling::td"));
	//
	//
	validatetext(BOOrgname1.get(0), "2"); //
	validatetext(BOOrgname.get(0), ConfigReader.getProperty("BOPersonname")); 
	validatetext(BOOrgname.get(1), ConfigReader.getProperty("BODesignation")); 
	validatetext(BOOrgname.get(2), ConfigReader.getProperty("BOMobileNumber"));
	validatetext(BOOrgname.get(3), ConfigReader.getProperty("BOEmailId"));
	validatetext(BOOrgname.get(4), ConfigReader.getProperty("BORole"));
	validatetext(BOOrgname.get(5), "View");
	validatetext(BOOrgname.get(6), "");
	validatetext(BOOrgname.get(7), ConfigReader.getProperty("BOLoginStatus"));
	validatetext(BOOrgname.get(8), ConfigReader.getProperty("BOIsActive"));
	validatetext(BOOrgname.get(9), "");
		
	
	List<WebElement> TOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[3]/following-sibling::td"));
	List<WebElement> TOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[3]/preceding-sibling::td"));
	//

	//
	validatetext(TOOrgname1.get(0), "3"); //
	validatetext(TOOrgname.get(0), ConfigReader.getProperty("TOPersonname"));
	validatetext(TOOrgname.get(1),ConfigReader.getProperty("TODesignation"));
	validatetext(TOOrgname.get(2),ConfigReader.getProperty("TOMobileNumber")); 
	validatetext(TOOrgname.get(3),ConfigReader.getProperty("TOEmailId")); 
	validatetext(TOOrgname.get(4),ConfigReader.getProperty("TORole")); 
	validatetext(TOOrgname.get(5), "View");
	validatetext(TOOrgname.get(6), "");
	validatetext(TOOrgname.get(7), ConfigReader.getProperty("TOLoginStatus"));
	validatetext(TOOrgname.get(8), ConfigReader.getProperty("TOIsActive"));
	validatetext(TOOrgname.get(9), "");
	
	*/
	
	//Clickelement(AoDocviewclick);
	Thread.sleep(3000);
	/////////////////////// 2
	
	
	List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
	List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

	//
	validatetext(ADocumentType1.get(0), "1"); //
	validatetext(ADocumentType1.get(1),"Organisation_ID.jpg");
	validatetext(ADocumentType.get(0), "");
	validatetext(ADocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
	validatetext(ADocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
	
	List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
	List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
	//
	//
	validatetext(PDocumentType1.get(0), "2"); //
	validatetext(PDocumentType1.get(1), "PAN_DXZOO7654R.jpeg");
	validatetext(PDocumentType.get(0), "");
	validatetext(PDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
	validatetext(PDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
		
		
	Thread.sleep(5000);			
	List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
	List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
	//

	//
	validatetext(OrgDocumentType1.get(0), "3"); //
	validatetext(OrgDocumentType1.get(1), "Licence.jpeg");
	validatetext(OrgDocumentType.get(0), "");
	validatetext(OrgDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
	validatetext(OrgDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
	
	
	
	
	
	
	
	
	
	
	Clickelement(AOAdharverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(AOadharAproveClick);
	Thread.sleep(3000);
	sendkeyweb(AOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(AOadharApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(AOpanverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(AOPanAproveClick);
	Thread.sleep(3000);
	sendkeyweb(AOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(AOpanApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(AOODVerify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(AOODAproveClick);
	Thread.sleep(3000);
	sendkeyweb(AOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(AOODApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
}
//TO
@FindBy(xpath="//td[contains(text(),'Technical Officer')]/following-sibling::td//a")
public WebElement setToviewclick ;
@FindBy(xpath="//td[contains(text(),'Technical Officer')]/following-sibling::td//p")
public WebElement ToViewclick ;
@FindBy(xpath="(//a[contains(text(),'View')])[2]")
public WebElement TODocviewclick ;
@FindBy(xpath="//table[@id='table1']//tr[1]//td[2]")
public WebElement TOAdharverify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement TOadharclosebutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//td[4]//span)[1]")
public WebElement TOadharAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement TOadharApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement TOadharApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[1]/td[5]")
public WebElement TOAdharApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[2]//td[2]")
public WebElement TOpanverify ;
@FindBy(xpath="//button[text()='Close']")
public List<WebElement>closedocbutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[2]//td[4]//span)[1]")
public WebElement TOPanAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement TOpanApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement TOpanApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[2]/td[5]")
public WebElement TOPanApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[3]//td[2]")
public WebElement TOODVerify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement TOODclosebutton ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[3]//td[4]//span)[1]")
public WebElement TOODAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement TOODApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement TOODApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[3]/td[5]")
public WebElement TOODApprovalchecktxtval ;

//TO
public void User_Can_Check_TechnicalOfficier_Functionalities_in_Applications_Page() throws Exception {
	Clickelement(Appsearch);
	Thread.sleep(3000);
	Clickelement(AppCountsearch);
	Thread.sleep(3000);
	Clickelement(ToViewclick);
	//Thread.sleep(5000);
	//Clickelement(TODocviewclick);
	Thread.sleep(3000);
	Clickelement(TOAdharverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(TOadharAproveClick);
	Thread.sleep(3000);
	sendkeyweb(TOadharApprovalCommentClick, "");
	Clickelement(TOadharApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(TOpanverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(TOPanAproveClick);
	Thread.sleep(3000);
	sendkeyweb(TOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(TOpanApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(TOODVerify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(TOODAproveClick);
	Thread.sleep(3000);
	sendkeyweb(TOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(TOODApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");

}
//BO
//BO
@FindBy(xpath="//td[contains(text(),'Billing Officer')]/following-sibling::td//a")
public WebElement setBoviewclick ;
@FindBy(xpath="//td[contains(text(),'Billing Officer')]/following-sibling::td//p")
public WebElement Boclickiew  ;
@FindBy(xpath="(//a[contains(text(),'View')])[3]")
public WebElement BODocviewclick ;
@FindBy(xpath="//table[@id='table1']//tr[1]//td[2]")
public WebElement BOAdharverify ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement BOadharclosebutBOn ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//td[4]//span)[1]")
public WebElement BOadharAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement BOadharApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement BOadharApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[1]/td[5]")
public WebElement BOAdharApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[2]//td[2]")
public WebElement BOpanverify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement BOpanclosebutBOn ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[2]//td[4]//span)[1]")
public WebElement BOPanAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement BOpanApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement BOpanApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[2]/td[5]")
public WebElement BOPanApprovalchecktxtval ;
@FindBy(xpath="//table[@id='table1']//tr[3]//td[2]")
public WebElement BOODVerify ;
@FindBy(xpath="(//button[text()='Close'])[3]")
public WebElement BOODclosebutBOn ;
@FindBy(xpath="(//tbody[@class='mdc-data-table__content']//tr[3]//td[4]//span)[1]")
public WebElement BOODAproveClick ;
@FindBy(xpath="(//textarea[@class='ng-untouched ng-pristine ng-valid'])[1]")
public WebElement BOODApprovalCommentClick ;
@FindBy(xpath="(//button[text()='Save changes'])[1]")
public WebElement BOODApprovalSavechangesClick ;
@FindBy(xpath="//tbody/tr[3]/td[5]")
public WebElement BOODApprovalchecktxtval ;

//APP Textval 
@FindBy(xpath="//th[normalize-space()='Officers']")
public WebElement offtxtval ;
@FindBy(xpath="//th[normalize-space()='Status']")
public WebElement ststxtval ;
@FindBy(xpath="//th[normalize-space()='Links']")
public WebElement linktxtval  ;
@FindBy(xpath="//td[normalize-space()='Administrative Officer']")
public WebElement AOofftxtval ;
@FindBy(xpath="//td[normalize-space()='Technical Officer']")
public WebElement TOofftxtval ;
@FindBy(xpath="//td[normalize-space()='Billing Officer']")
public WebElement BOofftxtval  ;

@FindBy(xpath="//button[text()='Submit']")
public WebElement submitclick ;

public void User_Can_Check_BillingOfficier_Functionalities_in_Applications_Page() throws Exception {
	
	Clickelement(Appsearch);
	Thread.sleep(3000);
	Clickelement(AppCountsearch);
	Thread.sleep(3000);
	Clickelement(Boclickiew);
	Thread.sleep(3000);
	//Clickelement(BODocviewclick);
	//Thread.sleep(3000);
	Clickelement(BOAdharverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(BOadharAproveClick);
	Thread.sleep(3000);
	sendkeyweb(BOadharApprovalCommentClick, " ");
	Thread.sleep(3000);
	Clickelement(BOadharApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(BOpanverify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(BOPanAproveClick);
	Thread.sleep(3000);
	sendkeyweb(TOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(BOpanApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	Clickelement(BOODVerify);
	Thread.sleep(3000);
	clickmultipleweb(closedocbutton);
	Thread.sleep(3000);
	Clickelement(BOODAproveClick);
	Thread.sleep(3000);
	sendkeyweb(BOadharApprovalCommentClick, "");
	Thread.sleep(3000);
	Clickelement(BOODApprovalSavechangesClick);
	Thread.sleep(3000);
	validatetext(Toastermessage, "Document  Approved");
	driver.navigate().back();
	Thread.sleep(5000);
	//driver.navigate().back();
	Thread.sleep(5000);
	Clickelement(submitclick);
	//Thread.sleep(5000);
	Thread.sleep(5000);


}
}
