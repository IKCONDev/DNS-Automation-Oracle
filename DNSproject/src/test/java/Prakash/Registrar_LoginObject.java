package Prakash;


import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Configuration.ConfigReader;
import Drivermanager.Driver;
import hooks.Baseclass;


public class Registrar_LoginObject extends Baseclass {

	WebDriver driver = Driver.getDriver();


	public Registrar_LoginObject(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}

	Scanner myObj = new Scanner(System.in);// Create a Scanner object
	//Login Page
	@FindBy(xpath="//div[text()='Login to your registrar account']")
	public WebElement logintoacctextval ;
	@FindBy(xpath="//div[text()='Email']")
	public WebElement loginemailtextval;
	@FindBy(xpath="//input[@id='email']")
	public WebElement EnterEmailPlaceholder;
	@FindBy(xpath="//input[@type='password']")
	public WebElement EnterpasswordPlaceholder;
	@FindBy(xpath="//div[text()='Password']")
	public WebElement loginpasstextval;
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	public WebElement Forgitpasswordtext;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement Nextbuttontextvl;

	public void User_textvaladation_in_Login_Page1() {
		validatetext(logintoacctextval, "Login to your registrar account");
		validatetext(loginemailtextval, "Email");
		validateattribute(EnterEmailPlaceholder,"placeholder", "Enter your email");
		validatetext(loginpasstextval, "Password");
		validateattribute(EnterpasswordPlaceholder,"placeholder", "Enter the strong password");
		validatetext(Forgitpasswordtext, "Forgot password?");
		validatetext(Nextbuttontextvl, "Next");
	}

	@FindBy(xpath="//input[@id='email']")
	public WebElement Enteremailtextbox;
	@FindBy(xpath="//input[@placeholder='Enter the strong password']")
	public WebElement passwordentertxtbox;
	@FindBy(xpath="//button[text()='Next']")
	public WebElement ClickNextbutton;

	@FindBy(xpath = "//input[@placeholder='Enter OTP']")
	public WebElement Regemailotp;
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement Verifyotp;
	@FindBy(xpath="//div[@role='alert']")
	public WebElement Toastermessage;
	public void User_enter_Username_Password_to_navigate_Home_Page1(String UN, String Password) throws Exception {
		sendkeyweb(Enteremailtextbox, UN);
		sendkeyweb(passwordentertxtbox, Password);
		Clickelement(ClickNextbutton);
		validatet(Toastermessage,"An OTP has been sent to you email");
		System.out.println("Enter OTP : ");
		String OTP = myObj.nextLine();
		sendkeyweb(Regemailotp, OTP);
		Clickelement(Verifyotp);
		Thread.sleep(1500);
		validatet(Toastermessage, "Login Success");
	}
	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement Appsearch; ;
	@FindBy(xpath="//mat-icon[normalize-space()='public']")
	public WebElement DomainSearch ;
	@FindBy(xpath="//mat-icon[normalize-space()='description']")
	public WebElement Invoicesearch ;
	@FindBy(xpath="//a[@routerlink='/reports']//mat-icon[@role='img'][normalize-space()='dashboard']")
	public WebElement Reportssearch;
	@FindBy(xpath="//mat-icon[text()='settings']")
	public WebElement Settingssearch ;



	@FindBy(xpath="//a[normalize-space()='DR User Management']")
	public WebElement DRUserManagementSearch ;
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement UserManagementSearchtxtbox ;
	@FindBy(xpath="//a[normalize-space()='Registrant User Management']")
	public WebElement RegistrantUserManagementSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrant Officer Details']")
	public WebElement RegistrantOfficerDetailsSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrar Roles']")
	public WebElement RegistrarRolesSearch ;
	@FindBy(xpath="//a[normalize-space()='Registrar Department']")
	public WebElement RegistrarDepartmentSearch ;
	@FindBy(xpath="//mat-icon[normalize-space()='dashboard']")
	public WebElement Dashboardsearch ;

	public void User_check_allfields_in_Home_Page1() throws Exception {
		Thread.sleep(8000);
		Clickelement(Appsearch);
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		Clickelement(DomainSearch);
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		Clickelement(Invoicesearch);
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		//Clickelement(Reportssearch);
		//Thread.sleep(6000);
		//driver.navigate().back();
		//Thread.sleep(6000);
		Clickelement(Settingssearch);
		Thread.sleep(6000);
		
		  Clickelement(DRUserManagementSearch); Thread.sleep(6000);
		  Clickelement(Settingssearch); Thread.sleep(6000);
		  Clickelement(RegistrantUserManagementSearch); Thread.sleep(6000);
		  Clickelement(Settingssearch); Thread.sleep(6000);
		  Clickelement(RegistrantOfficerDetailsSearch); Thread.sleep(6000);
		  Clickelement(Settingssearch); Thread.sleep(6000);
		  Clickelement(RegistrarRolesSearch); Thread.sleep(6000);
		  Clickelement(Settingssearch); Thread.sleep(6000);
		 Clickelement(RegistrarDepartmentSearch);
		 
		Thread.sleep(8000);
		Clickelement(Dashboardsearch);

		//driver.navigate().back();
	}

	//HOME PAGE

	@FindBy(xpath="//div[contains(text(),'Total Registrants')]")
	public WebElement TotalRegistrantstxtval ;
	@FindBy(xpath="//div[contains(text(),'Total Domains')]")
	public WebElement TotalDomainstxtval ;
	@FindBy(xpath="//div[contains(text(),'Application in queue')]")
	public WebElement Applicationinqueuetxtval;
	@FindBy(xpath="//div[contains(text(),'Active Users')]")
	public WebElement ActiveUserstxtval;
	@FindBy(xpath="//p[normalize-space()='Domain Registration Trends']")
	public WebElement DomainRegistrationTrendstextval;
	@FindBy(xpath="//p[normalize-space()='Application By Status']")
	public WebElement ApplicationByStatustext;
	@FindBy(xpath="//p[normalize-space()='Application In Queue']")
	public WebElement ApplicationInQueuetextvl;

	public void User_textvaladation_in_Home_Main_Page1() {
		validatetext(TotalRegistrantstxtval, "Total Registrants");
		validatetext(TotalDomainstxtval, "Total Domains");
		validatetext(Applicationinqueuetxtval,"Application in queue");
		validatetext(ActiveUserstxtval, "Active Users");
		validatetext(DomainRegistrationTrendstextval, "Domain Registration Trends");
		validatetext(ApplicationByStatustext, "Application By Status");
		validatetext(ApplicationInQueuetextvl, "Application In Queue");
	}

	public void Create_ApplicationQuee_TextValidations_in_Home_Page(String src) throws InterruptedException {

		String Apptableextvalues[] = { "Domain ID", "Domain Name", "Organisation Name","Registration Date", "Renewal Date", "Status"};
		List<WebElement> val = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));

		for (int i = 0; i < val.size(); i++) {

			validatetext(val.get(i), Apptableextvalues[i]);
		}
		//String Apptabledata[]= {"21","Vtech.bank.in","Vtech","Feb 2, 2025, 6:54 AM","Feb 2, 2030, 6:54 AM","Pending"};
		//List<WebElement> val1 = driver.findElements(By.xpath("(//table[@id='table1']//tr[1]//td)"));
		/*
				List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
				List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

				 //
			validatet(Orgname1.get(1), "1"); //
			validatet(Orgname1.get(0), "yuva.bank.in");
			validatet(Orgname.get(0), "Feb 2, 2025, 9:02 AM");
			validatet(Orgname.get(1), "Feb 2, 2025, 9:02 AM");
			validatet(Orgname.get(2), "Pending");

		}*/
	}
		@FindBy(xpath="//mat-icon[normalize-space()='apps']")
		public WebElement App1search; ;
		@FindBy(xpath="//div[text()='Organisations Name']")
		public WebElement Organisationnametxtval; 

	


	public void User_textvaladation_in_Application_Page1() throws Exception {
		Thread.sleep(8000);
		Clickelement(Appsearch);
		Thread.sleep(8000);
		String Apptableextvalues[] = { "Application ID", "Organisations Name","Domain Name","", "Submission Date", "Status","Payment Status","NS Record Status","Tenure (yrs)"};
		List<WebElement> val = driver.findElements(By.xpath("//table[@id='table1']//th"));

		for (int i = 0; i < val.size(); i++) {

			validatetext(val.get(i), Apptableextvalues[i]);	
		}	 




	}

	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement searchbuttonclick; 
	@FindBy(xpath="//td[normalize-space()='1']")
	public WebElement AppCountsearch; 
	@FindBy(xpath="//table[@id=\"table1\"]//tbody//tr[2]//td[1]")
	public WebElement DomainCountsearch; 
	@FindBy(xpath="//h3[text()='Domain Applications Details']")
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

	@FindBy(xpath="//div[text()='Ikcontech solutions']")
	public WebElement IkconTechtxtval;
	@FindBy(xpath="//div[contains(text(),'yuva.bank.in')]")
	public WebElement Ikcontechbankintxtval;
	@FindBy(xpath="//div[contains(text(),'Feb 6, 2025, 8:43 PM')]")
	public WebElement Datetxtval;
	@FindBy(xpath="//div[contains(text(),'IDR489363')]")
	public WebElement IDR110427txtval ;
	@FindBy(xpath="//div[contains(text(),'Active')]")
	public WebElement InActivetxtval;



	public void User_Can_Check_Application_Tabledatatextvaladation_in_Applications_Page(String src) throws Exception {

		//String Apptabledata[]= {"2","Vtech.bank.in","Onboarding Pending","Feb 2, 2025, 6:54 AM","Feb 2, 2030, 6:54 AM","InActive","Unpaid","OnHold","5"};
		//List<WebElement> val1 = driver.findElements(By.xpath("(//table[@id='table1']//tr[1]//td)"));

		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

		//
		validatet(Orgname1.get(0), "1"); //
		validatet(Orgname.get(0), "yuva.bank.in");
		validatet(Orgname.get(1), "Feb 6, 2025, 8:43 PM");
		validatet(Orgname.get(2), "Active");
		validatet(Orgname.get(3), "Paid");
		validatet(Orgname.get(4), "Inprogress");
		validatet(Orgname.get(5) ,"5");


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

	@FindBy(xpath="(//select)[3]")
	public WebElement Domainstatus ;



	public void User_Can_Check_OrganisationDetails_Textvalidations_in_Applications_Page() throws Exception{
		validatet(Domainapptxtval, "Domain Applications Details");
		validatet(ApplicationNotxtval, "Application No");
		validatet(Statustxtval, "Application Status");
		validatet(OrganizationNametxtval, "Organization Name");
		validatet(DomainNametxtval, "Domain Name");
		validatet(SubmissionDatetxtval, "Submission Date");


		validatet(IDR110427txtval, "IDR489363");
		validatet(InActivetxtval,  "Active");   
		validatet(IkconTechtxtval, "Ikcontech solutions"); //
		validatet(Ikcontechbankintxtval, "yuva.bank.in");
		validatet(Datetxtval, "Feb 6, 2025, 8:43 PM");


		validatet(OrganizationDetailstxtval, "Organization Details"); //
		validatet(InstitutionNametxtval, "Institution Name");
		validateattribute(Institionnameplaceholderval,"placeholder", "Enter your Institute Name");
		validatet(PinCodetxtval, "Pin Code");
	    sendkeyweb(PinCodeeditval,"160003");
		validatet(Addresstxtval, "Address");
		validatet(Emailtxtval, "Email ID"); //
		sendkeyweb(Emailtxtbox,"bhargav@gmail.com");
		validatet(Paystatustxtval, "Payment Status");
		Selectdropdown(Selectpaymentoption, "Paid");
		Clickelement(Viewpaymentclick);
		//Clickelement(paydocrejectclick);
		Thread.sleep(3000);
		Clickelement(payrejcloseclick);

		Selectdropdown(NSstatus, "Inprogress");
		Selectdropdown(Domainstatus, "In Active");


		validatet(NSstatustxtval, "NS Status");
		validatet(Domainstatustxtval, "Domain Status");
	}
	@FindBy(xpath="//h5[normalize-space()='NS Status']")
	public WebElement NSstatustxtval;
	@FindBy(xpath="//h5[normalize-space()='Domain Status']")
	public WebElement Domainstatustxtval;

	@FindBy(xpath="//h4[contains(text(),'Organization Documents')]")
	public WebElement OrganizationDocstxtval;
	@FindBy(xpath="//span[text()='GSTIN']")
	public WebElement  GSTINsearch;
	@FindBy(xpath="//div[@id='viewTheOrgGstDocs']//button[@class='btn btn-danger'][normalize-space()='Reject']")
	public WebElement  Reject1Click;
	//1st case
	@FindBy(xpath="//div[@class='status rejected']")
	public WebElement  Rejectstatustxtval;
	@FindBy(xpath="//div[@class='status approved']")
	public WebElement  Approvedstatustxtval;
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

	public void User_Can_Check_OrganisationDetails_DocumentsUpload_Functionalities_in_Applications_Page() throws Exception {
		validatet(OrganizationDocstxtval, "Organization Documents");
		Thread.sleep(5000);
		Clickelement(GSTINsearch);
		Thread.sleep(5000);
		Clickelement(Reject1Click);
		Thread.sleep(5000);
	    validatetext(Rejectstatustxtval, "Rejected");
	    validatetext(Rejectstatus2txtval, " Approved ");
	    validatet(Toastermessage, "Toaster message Document  Approved");
		//Clickelement(ClosebuttonClick);
		Thread.sleep(5000);
		Clickelement(PANsearch);
		Thread.sleep(5000);
		Clickelement(Approve2Click);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Thread.sleep(5000);
		//Clickelement(Close2buttonClick);
		Thread.sleep(5000);
		validatetext(Approvedstatustxtval, " Approved ");
		Thread.sleep(5000);
		validatetext(Rejectstatus2txtval, " Approved ");
		Thread.sleep(5000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(LicenceNumberdocsearch);
		Thread.sleep(5000);
		Clickelement(Approve3Click);
		Thread.sleep(5000);
		//Clickelement(Close3buttonClick);
		Thread.sleep(5000);
		validatetext(Approvedstatustxtval, " Approved ");
		Thread.sleep(5000);
		validatetext(Rejectstatus2txtval, " Approved ");
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(BoardResolutionsearch);
		Thread.sleep(5000);
		Clickelement(Approve4Click);
		Thread.sleep(5000);
		//Clickelement(Close4buttonClick);
		
		Thread.sleep(5000);
		validatetext(Approvedstatustxtval, " Approved ");
		Thread.sleep(5000);
		validatetext(Rejectstatus2txtval, " Approved ");
		validatet(Toastermessage, "Toaster message Document  Approved");
		validatet(offtxtval, "Officers"); //
		validatet(ststxtval, "Status");
		validatet(linktxtval, "Links");
		validatet(AOofftxtval, "Administrative Officer");
		validatet(TOofftxtval, "Technical Officer"); //
		validatet(BOofftxtval, "Billing Officer");
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
	///////////////////////////	1
		List<WebElement> Orgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[1]/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[1]/preceding-sibling::td"));
		//
		validatet(Orgname1.get(0), "1"); //
		validatet(Orgname.get(0), "virat");
		validatet(Orgname.get(1), "Admin1");
		validatet(Orgname.get(2), "2342343343");
		validatet(Orgname.get(3), "virat@ikcontechcom");
		validatet(Orgname.get(4), "Administrative Officer");
		validatet(Orgname.get(5), "View");
		validatet(Orgname.get(6), "");
		validatet(Orgname.get(7), "Approved");
		validatet(Orgname.get(8), "true");
		validatet(Orgname.get(9), "");
		
		List<WebElement> BOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[2]/following-sibling::td"));
		List<WebElement> BOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[2]/preceding-sibling::td"));
		//
		//
		validatet(BOOrgname1.get(0), "2"); //
		validatet(BOOrgname.get(0), "Gill");
		validatet(BOOrgname.get(1), "Tester2");
		validatet(BOOrgname.get(2), "1234532533");
		validatet(BOOrgname.get(3), "gill@ikcontec");
		validatet(BOOrgname.get(4), "Billing Officer");
		validatet(BOOrgname.get(5), "View");
		validatet(BOOrgname.get(6), "");
		validatet(BOOrgname.get(7), "Approved");
		validatet(BOOrgname.get(8), "true");
		validatet(BOOrgname.get(9), "");
			
		
		List<WebElement> TOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[3]/following-sibling::td"));
		List<WebElement> TOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[3]/preceding-sibling::td"));
		//

		//
		validatet(TOOrgname1.get(0), "3"); //
		validatet(TOOrgname.get(0), "Rohit");
		validatet(TOOrgname.get(1), "Tester2");
		validatet(TOOrgname.get(2), "2345675434");
		validatet(TOOrgname.get(3), "rohit@ikcontechcom");
		validatet(TOOrgname.get(4), "Technical Officer");
		validatet(TOOrgname.get(5), "View");
		validatet(TOOrgname.get(6), "");
		validatet(TOOrgname.get(7), "Approved");
		validatet(TOOrgname.get(8), "false");
		validatet(TOOrgname.get(9), "");
		
		
		
		Clickelement(AoDocviewclick);
		Thread.sleep(3000);
		/////////////////////// 2
		
		
		List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
		List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

		//
		validatet(ADocumentType1.get(0), "1"); //
		validatet(ADocumentType1.get(1), "Aadhaar_445588776688.jpg");
		validatet(ADocumentType.get(0), "");
		validatet(ADocumentType.get(1), "Rejected");
		validatet(ADocumentType.get(2), "NA");
		
		
		List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
		List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
		//
		//
		validatet(PDocumentType1.get(0), "2"); //
		validatet(PDocumentType1.get(1), "PAN_DXZOO7654R.jpg");
		validatet(PDocumentType.get(0), "");
		validatet(PDocumentType.get(1), "Approved");
		validatet(PDocumentType.get(2), "NA");
			
		Thread.sleep(5000);			
		List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
		List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
		//

		//
		validatet(OrgDocumentType1.get(0), "3"); //
		validatet(OrgDocumentType1.get(1), "Organisation_ID.jpg");
		validatet(OrgDocumentType.get(0), "");
		validatet(OrgDocumentType.get(1), "Approved");
		validatet(OrgDocumentType.get(2), "NA");
		
		
		
		
		
		
		
		
		
		
		Clickelement(AOAdharverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(AOadharAproveClick);
		Thread.sleep(3000);
		sendkeyweb(AOadharApprovalCommentClick, "AO AadhaarCard document is Verified");
		Thread.sleep(3000);
		Clickelement(AOadharApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(AOpanverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(AOPanAproveClick);
		Thread.sleep(3000);
		sendkeyweb(AOadharApprovalCommentClick, "AO Pancard document is Verified");
		Thread.sleep(3000);
		Clickelement(AOpanApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(AOODVerify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(AOODAproveClick);
		Thread.sleep(3000);
		sendkeyweb(AOadharApprovalCommentClick, "AO Organisation ID is Verified");
		Thread.sleep(3000);
		Clickelement(AOODApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
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
		Thread.sleep(5000);
		Clickelement(TODocviewclick);
		Thread.sleep(3000);
		Clickelement(TOAdharverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(TOadharAproveClick);
		Thread.sleep(3000);
		sendkeyweb(TOadharApprovalCommentClick, "TO AadhaarCard document is Verified");
		Clickelement(TOadharApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(TOpanverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(TOPanAproveClick);
		Thread.sleep(3000);
		sendkeyweb(TOadharApprovalCommentClick, "TO PanCard document is Verified");
		Thread.sleep(3000);
		Clickelement(TOpanApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(TOODVerify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(TOODAproveClick);
		Thread.sleep(3000);
		sendkeyweb(TOadharApprovalCommentClick, "BO Orgnisation ID is Verified");
		Thread.sleep(3000);
		Clickelement(TOODApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");

	}
	//BO
	//BO
	@FindBy(xpath="//td[contains(text(),'Billing Officer')]/following-sibling::td/a")
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
		Clickelement(BODocviewclick);
		Thread.sleep(3000);
		Clickelement(BOAdharverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(BOadharAproveClick);
		Thread.sleep(3000);
		sendkeyweb(BOadharApprovalCommentClick, " BO AadhaarCard document is Verified");
		Thread.sleep(3000);
		Clickelement(BOadharApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(BOpanverify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(BOPanAproveClick);
		Thread.sleep(3000);
		sendkeyweb(TOadharApprovalCommentClick, "BO PanCard document is Verified");
		Thread.sleep(3000);
		Clickelement(BOpanApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		Clickelement(BOODVerify);
		Thread.sleep(3000);
		clickmultipleweb(closedocbutton);
		Thread.sleep(3000);
		Clickelement(BOODAproveClick);
		Thread.sleep(3000);
		sendkeyweb(BOadharApprovalCommentClick, " Organisation ID Document is Verified");
		Thread.sleep(3000);
		Clickelement(BOODApprovalSavechangesClick);
		Thread.sleep(3000);
		validatet(Toastermessage, "Toaster message Document  Approved");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		Clickelement(submitclick);
		Thread.sleep(5000);
		Thread.sleep(5000);


	}
	//Domain Module
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Domainsearchclick;

	@FindBy(xpath="//td[normalize-space()='1']")
	public WebElement DomainIDClick;

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


	@FindBy(xpath="//div[normalize-space()='yuva.bank.in']")
	public WebElement Ikcontechbankintxtval1;
	@FindBy(xpath="//div[normalize-space()='Ikcontech solutions']")
	public WebElement IkconTechtxtval1;
	@FindBy(xpath="//div[normalize-space()='Feb 6, 2025, 8:43 PM']")
	public WebElement Datetxtval1;
	@FindBy(xpath="//div[normalize-space()='Feb 6, 2030, 8:43 PM']")
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



		String Apptabledata1[]= {  "Domain ID","Domain Name", "Organisation Name","Registration Date", "Renewal Date", "Status"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Apptabledata1[i]);
			//System.out.println("Code Printed");
		}


	}
	public void User_Can_Check_DomaintableData_in_Domain_Page(String src) throws Exception  {
		//String Apptabledata2[]= {"2","Rohantech.bank.in","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

		//
		validatet(Orgname1.get(0), "1"); //
		validatet(Orgname1.get(1), "yuva.bank.in");
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatet(Orgname.get(0), "Feb 6, 2025, 8:43 PM");
		validatet(Orgname.get(1), "Feb 6, 2030, 8:43 PM");
		validatet(Orgname.get(2), "Active");
		//validatet(Orgname.get(5) ,"5");

	}

	public void user_validatetext_AllFields_in_Domainpage() throws Exception { 
		Thread.sleep(6000);
		Clickelement(DomainIDClick);
		Thread.sleep(6000);
		validatet(DomainDetailstxtval, "Domain Details");


		validatet(Domaintextval, "Domain");
		validatet(Organizationtxtval, "Organization");
		validatet(RegistrationDatetxtval, "Registration Date");
		validatet(RenewalDatetxtval, "Renewal Date");
		validatet(DomainStatustxtval, "Domain Status");


		validatet(Ikcontechbankintxtval1, "yuva.bank.in");
		validatet(IkconTechtxtval1, "Ikcontech solutions"); 
		validatet(Datetxtval1, "Feb 6, 2025, 8:43 PM");
		validatet(RenewelDatetxtval1, "Feb 6, 2030, 8:43 PM");
		validatet(InActivetxtval1, "Active");



		validatet(Nameserverstxtval1, "Name Servers");
		validatet(Hostnametxtval, "Host Name"); 
		validatet(IPaddtxtval1, "IP Address");
		validatet(TTltxtval1, "TTL");
		validatet(BillingHistorytxtval1, "Billing History");
		validatet(invoicenumtxtval1, "Invoice No"); 
		validatet(amountltxtval1, "Amount");
		validatet(Invoicedatetxtval1, "Invoice Date");
		validatet(statustxtval1, "Status");
		//Thread.sleep(5000);
	}

	
	//INVOICE____MODULE
	public void user_navigate_to_Invoicepage1() throws Exception {
		Thread.sleep(5000);
		Clickelement(Invoicesearch);
		Thread.sleep(6000);


	}
	//SETTINGS MODULE
	@FindBy(xpath="(//*[name()='svg'])[46]")
	public WebElement arrow;
	@FindBy(xpath="//span[contains(text(),'20')]")
	public WebElement arrowsel;
	
	
	@FindBy(xpath="//button[@id='addUser']")
	public WebElement adduserbtnclick;
	@FindBy(xpath="//div[@id='userModal']//input[@id='name']")
	public WebElement Addusername;
	@FindBy(xpath="//div[@id='userModal']//input[@placeholder='Enter your email id']")
	public WebElement Adduseremailid;
	@FindBy(xpath="//div[@id='userModal']//input[@placeholder='+91 Enter your number']")
	public WebElement Addusermobnum;
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Clickarrowbutton;
	@FindBy(xpath=" //span[contains(text(),'IDRBTADMIN ')]")
	public WebElement addusrrolesel;
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	public WebElement Clickarrowbutton2;
	@FindBy(xpath=" //span[contains(text(),'IT ')]")
	public WebElement addusrdeptsel;
	@FindBy(xpath="//div[@id='userModal']//button[@type='button'][normalize-space()='Save changes']")
	public WebElement Clicklastselbutton;
	public void user_navigate_to_Settingspage_and_Check_DRUserManagement_Textvalidations(String src1) throws Exception {

		WebElement ele = driver.findElement(By.xpath("//span[text()='Settings']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(6000);
		Clickelement(Settingssearch);
		Thread.sleep(6000);
		Clickelement(DRUserManagementSearch);
		Thread.sleep(6000);


		String SettingDrtabledata[]= { "Sl.No","User Id","User Name","Department", "Role", "Access","Status", "Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}




		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> UserId=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserId")+"']/following-sibling::td"));
		List<WebElement> UserId1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		validatet(UserId1.get(0), "1"); //
		validatet(UserId.get(0), "Kumar"); //
		validatet(UserId.get(1), "IT");
		validatet(UserId.get(2), "IDRBTADMIN");
		validatet(UserId.get(3), "");
		validatet(UserId.get(4), "Active");
		validatet(UserId.get(5), "");
		validatet(UserId.get(6), "");
/*

		Clickelement(adduserbtnclick);
		sendkeyweb(Addusername, "Bhargaviprakash");
		sendkeyweb(Adduseremailid, "bhargav@gmail.com");
		sendkeyweb(Addusermobnum, "9876543210");
		Clickelement(Clickarrowbutton);
		Clickelement(addusrrolesel);
		Clickelement(Clickarrowbutton2);
		Clickelement(addusrdeptsel);
		Clickelement(Clicklastselbutton);*/
		
		Thread.sleep(3000);
		
		Clickelement(Dashboardsearch);
	}

	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(String src1) throws Exception {

		Clickelement(Settingssearch);
		Thread.sleep(6000);
		Clickelement(RegistrantUserManagementSearch);
		Thread.sleep(6000);

		String SettingDrtabledata[]= {  "Sl.No","User Id","User Name","Organisation Name", "Role", "Access","Status", "Actions"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}

		Clickelement(arrow);
		Clickelement(arrowsel);

		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> UserID=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserID")+"']/following-sibling::td"));
		List<WebElement> UserID1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		String ID=UserID1.get(0).getText();
		validatet(UserID1.get(0), ID); //
		validatet(UserID.get(0), "prakash raju"); //
		validatet(UserID.get(1), "Ikcontech solutions");
		validatet(UserID.get(2), "Super Admin");
		validatet(UserID.get(3), "");
		validatet(UserID.get(4), "Active");
		validatet(UserID.get(5), "");
		//validatet(UserID.get(6), "");



	}
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	public WebElement OfficersDDClick;
	@FindBy(xpath="//span[normalize-space()='Ikcontech solutions']")
	public WebElement OfficersDDSel;
	
	public void registrar_can_check_registrant_officer_details_textvalidations_and_functionalities_in_settings_page(String src,String src4,String src5,String src6) throws Exception {
	   
		Clickelement(Settingssearch);
		Thread.sleep(6000);

		Clickelement(RegistrantOfficerDetailsSearch);
		Thread.sleep(6000);
		String SettingDrtabledata[]= {"Id","Organisation Name","Person Name", "Designation", "MobileNumber","EmailId", 
				"Role","Verify Documents","Approve/Reject Login","Login Status","Is Active","Actions"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		Clickelement(OfficersDDClick);
		Clickelement(OfficersDDSel);
		List<WebElement> Orgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[1]/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[1]/preceding-sibling::td"));
		//
		validatet(Orgname1.get(0), "1"); //
		validatet(Orgname.get(0), ConfigReader.getProperty("AOPersonname"));
		validatet(Orgname.get(1), ConfigReader.getProperty("AODesignation"));
		validatet(Orgname.get(2), ConfigReader.getProperty("AOMobileNumber"));
		validatet(Orgname.get(3), ConfigReader.getProperty("AOEmailId"));
		validatet(Orgname.get(4), ConfigReader.getProperty("AORole"));
		validatet(Orgname.get(5), "View");
		validatet(Orgname.get(6), "");
		validatet(Orgname.get(7), ConfigReader.getProperty("AOLoginStatus"));
		validatet(Orgname.get(8), ConfigReader.getProperty("AOIsActive"));
		validatet(Orgname.get(9), "");
		
		List<WebElement> BOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[2]/following-sibling::td"));
		List<WebElement> BOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[2]/preceding-sibling::td"));
		//
		//
		validatet(BOOrgname1.get(0), "2"); //
		validatet(BOOrgname.get(0), "Gill");
		validatet(BOOrgname.get(1), "Tester2");
		validatet(BOOrgname.get(2), "1234532533");
		validatet(BOOrgname.get(3), "gill@ikcontec");
		validatet(BOOrgname.get(4), "Billing Officer");
		validatet(BOOrgname.get(5), "View");
		validatet(BOOrgname.get(6), "");
		validatet(BOOrgname.get(7), "Approved");
		validatet(BOOrgname.get(8), "true");
		validatet(BOOrgname.get(9), "");
			
		
		List<WebElement> TOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[3]/following-sibling::td"));
		List<WebElement> TOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[3]/preceding-sibling::td"));
		//

		//
		validatet(TOOrgname1.get(0), "3"); //
		validatet(TOOrgname.get(0), "Rohit");
		validatet(TOOrgname.get(1), "Tester2");
		validatet(TOOrgname.get(2), "2345675434");
		validatet(TOOrgname.get(3), "rohit@ikcontechcom");
		validatet(TOOrgname.get(4), "Technical Officer");
		validatet(TOOrgname.get(5), "View");
		validatet(TOOrgname.get(6), "");
		validatet(TOOrgname.get(7), "Approved");
		validatet(TOOrgname.get(8), "false");
		validatet(TOOrgname.get(9), "");
		
		//AO
		        Thread.sleep(5000);
				Clickelement(setAoviewclick);
				Thread.sleep(3000);
				

				List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
				List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

				//
				validatet(ADocumentType1.get(0), "1"); //
				validatet(ADocumentType1.get(1), "Aadhaar_445588776688.jpg");
				validatet(ADocumentType.get(0), "");
				validatet(ADocumentType.get(1), "Rejected");
				validatet(ADocumentType.get(2), "NA");
				
				
				List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
				List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
				//
				//
				validatet(PDocumentType1.get(0), "2"); //
				validatet(PDocumentType1.get(1), "PAN_DXZOO7654R.jpg");
				validatet(PDocumentType.get(0), "");
				validatet(PDocumentType.get(1), "Approved");
				validatet(PDocumentType.get(2), "NA");
					
				Thread.sleep(5000);			
				List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
				List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
				//

				//
				validatet(OrgDocumentType1.get(0), "3"); //
				validatet(OrgDocumentType1.get(1), "Organisation_ID.jpg");
				validatet(OrgDocumentType.get(0), "");
				validatet(OrgDocumentType.get(1), "Approved");
				validatet(OrgDocumentType.get(2), "NA");
				
				
				
				
				Thread.sleep(6000);
				//Clickelement(AoDocviewclick);
				Thread.sleep(3000);
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
			    validatet(AOadharApprovalchecktxtval, "Approved");
			    validatet(Toastermessage, "Toaster message Document  Approved");
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
				validatet(AOpanApprovalchecktxtval, "Approved");
				validatet(Toastermessage, "Toaster message Document  Approved");
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
				validatet(AodApprovalchecktxtval, "Approved");
				validatet(Toastermessage, "Toaster message Document  Approved");
				Clickelement(Settingssearch);
				Clickelement(RegistrantOfficerDetailsSearch);
				Clickelement(OfficersDDClick);
				Clickelement(OfficersDDSel);
	
	//Bo		
			
				Clickelement(setBoviewclick);
				Thread.sleep(3000);
				//Clickelement(BODocviewclick);
				Thread.sleep(3000);
				Clickelement(BOAdharverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
				Clickelement(BOadharAproveClick);
				Thread.sleep(3000);
				sendkeyweb(BOadharApprovalCommentClick, " BO AadhaarCard document is Verified");
				Thread.sleep(3000);
				Clickelement(BOadharApprovalSavechangesClick);
				Thread.sleep(3000);
				validatet(BOAdharApprovalchecktxtval, "Approved");
				validatet(Toastermessage, "Toaster message Document  Approved");
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
				validatet(BOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				validatet(Toastermessage, "Toaster message Document  Approved");
				Clickelement(BOODVerify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
				Clickelement(BOODAproveClick);
				Thread.sleep(3000);
				sendkeyweb(BOadharApprovalCommentClick, " ");
				Thread.sleep(3000);
				Clickelement(BOODApprovalSavechangesClick);
				Thread.sleep(3000);	
				validatet(BOODApprovalchecktxtval, "Approved");
				validatet(Toastermessage, "Toaster message Document  Approved");
				Clickelement(Settingssearch);
				Clickelement(RegistrantOfficerDetailsSearch);
				Clickelement(OfficersDDClick);
				Clickelement(OfficersDDSel);
			
//TO
				Thread.sleep(3000);
				Clickelement(setToviewclick);
				//Thread.sleep(5000);
				//Clickelement(TODocviewclick);
				
				Clickelement(TOAdharverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
				Clickelement(TOadharAproveClick);
				Thread.sleep(3000);
				sendkeyweb(TOadharApprovalCommentClick, "");
				Thread.sleep(3000);
				Clickelement(TOadharApprovalSavechangesClick);
				Thread.sleep(3000);
			    validatet(TOAdharApprovalchecktxtval, "Approved");
			    validatet(Toastermessage, "Toaster message Document  Approved");
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
				validatet(TOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				validatet(Toastermessage, "Toaster message Document  Approved");
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
				validatet(TOODApprovalchecktxtval, "Approved");
				validatet(Toastermessage, "Toaster message Document  Approved");
				
			
			
			
		}
	@FindBy(xpath="//button[contains(text(),'Add Role')]")
	public WebElement Clickaddrole;
	@FindBy(xpath="//input[@id='addRoleName']")
	public WebElement AddRolename;
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	public WebElement Clickaddrolesavebutton;
	
	
	public void user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(String src1) throws Exception {

		Clickelement(Settingssearch);
		Thread.sleep(6000);
		Clickelement(RegistrarRolesSearch);
		Thread.sleep(6000);
		String SettingDrtabledata[]= {"ID","Role Name","Created", "Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> RoleName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("RoleName")+"']/following-sibling::td"));
		List<WebElement> RoleName1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		validatet(RoleName1.get(0), "1"); //
		//validatet(RoleName.get(1), " IDRBTADMIN "); //
		validatet(RoleName.get(0), "");
		validatet(RoleName.get(1), "NA");
		validatet(RoleName.get(2), "");
		validatet(RoleName.get(3), "NA");
		validatet(RoleName.get(4), "");
		validatet(RoleName.get(5), "");
/*
		Clickelement(Clickaddrole);
		sendkeyweb(AddRolename, "");
		
		Clickelement(Clickaddrolesavebutton); */

	}

	@FindBy(xpath="//button[normalize-space()='Add Department']")
	public WebElement Clickadddept;
	@FindBy(xpath="//div[@id='addModal']//input[@placeholder='Department Name']")
	public WebElement Adddeptname;
	@FindBy(xpath="//div[@id='addModal']//input[@id='departmentCode']")
	public WebElement Adddeptcode;
	@FindBy(xpath="//div[@id='addModal']//button[@type='submit'][normalize-space()='Save']")
	public WebElement Clicksavebutton;
	
	
	
	
	public void user_navigate_to_Settingspage_and_Check_RegistrarDepartmentSearch_Textvalidations(String src1) throws Exception {
		Clickelement(Settingssearch);
		Thread.sleep(6000);
		Clickelement(RegistrarDepartmentSearch);
		Thread.sleep(8000);
		String Settingtabledata[]= {"ID","Department Name","Department Code", "Created By","Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(6000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Settingtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> DepartmentName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DepartmentName")+"']/following-sibling::td"));
		List<WebElement> DepartmentName1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		validatet(DepartmentName1.get(0), "1"); //
		//validatet(DepartmentName.get(1), "IT"); //
		validatet(DepartmentName.get(0), "001");
		validatet(DepartmentName.get(1), "");
		validatet(DepartmentName.get(2), "NA");
		validatet(DepartmentName.get(3), "");
		validatet(DepartmentName.get(4), "NA");
		validatet(DepartmentName.get(5), "");
		validatet(DepartmentName.get(6), "");
		/*
		Clickelement(Clickadddept);
		sendkeyweb(Adddeptname, "");
		sendkeyweb(Adddeptcode, "");
		Clickelement(Clicksavebutton);*/
		
		Clickelement(Dashboardsearch);
		
		
		
		
		
		
		
		
	}
}