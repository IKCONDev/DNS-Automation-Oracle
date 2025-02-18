package Registrar.obj;


import java.util.List;
import java.util.Scanner;

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


public class Registrar_LoginObject extends Baseclass {

	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


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
		validatetext(Nextbuttontextvl,"Next");
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
		

	       configWriter.setProperty("RGUsername", UN);
	       configWriter.setProperty("RGPPAss", Password);
	      configWriter.saveProperties();
		
		
		sendkeyweb(Enteremailtextbox, UN);		
		
		sendkeyweb(passwordentertxtbox, Password);
		Clickelement(ClickNextbutton);
		validatetext(Toastermessage,"An OTP has been sent to you email.");
		System.out.println("Enter OTP : ");
		String OTP = myObj.nextLine();
		sendkeyweb(Regemailotp, OTP);
		Clickelement(Verifyotp);
		Thread.sleep(1500);
		validatetext(Toastermessage, "Login Success");
	}
	@FindBy(xpath="//mat-icon[normalize-space()='apps']")
	public WebElement Appsearch; 
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
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(DomainSearch);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Clickelement(Invoicesearch);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//Clickelement(Reportssearch);
		//Thread.sleep(3000);
		//driver.navigate().back();
		//Thread.sleep(3000);
		Clickelement(Settingssearch);
		Thread.sleep(3000);
		
		  Clickelement(DRUserManagementSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrantUserManagementSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrantOfficerDetailsSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
		  Clickelement(RegistrarRolesSearch); Thread.sleep(3000);
		  Clickelement(Settingssearch); Thread.sleep(3000);
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
	@FindBy(xpath="//div[@class='status Approved']")
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
	    //validatetext(Rejectstatustxtval, "Approved");
	   // validatetext(Rejectstatus2txtval, "Approved ");
	    validatetext(Toastermsgappovedoc, "Document  Approved Successfully");
		//Clickelement(ClosebuttonClick);
		Thread.sleep(3000);
		Clickelement(PANsearch);
		Thread.sleep(3000);
		Clickelement(Approve2Click);
		validatetext(Toastermsgappovedoc, "Document  Approved Successfully");
		Thread.sleep(3000);
		//Clickelement(Close2buttonClick);
		Thread.sleep(3000);
		validatetext(Approvedstatustxtval, "Approved");
		Thread.sleep(3000);
		validatetext(Rejectstatus2txtval, "Approved");
		Thread.sleep(3000);
		validatetext(Toastermsgappovedoc, "Document  Approved Successfully");
		Thread.sleep(3000);
		Clickelement(LicenceNumberdocsearch);
		Thread.sleep(3000);
		Clickelement(Approve3Click);
		//Thread.sleep(5000);
		//Clickelement(Close3buttonClick);
		Thread.sleep(5000);
		validatetext(Approvedstatustxtval, "Approved");
		Thread.sleep(5000);
		validatetext(Rejectstatus2txtval, "Approved");
		validatetext(Toastermsgappovedoc, "Document  Approved Successfully");
		Clickelement(BoardResolutionsearch);
		Thread.sleep(5000);
		Clickelement(Approve4Click);
		Thread.sleep(3000);
		Clickelement(Close4buttonClick);
		
		///Thread.sleep(5000);
		validatetext(Approvedstatustxtval, "Approved");
		Thread.sleep(5000);
		validatetext(Rejectstatus2txtval, "Approved");
		validatetext(Toastermessage, "Document  Approved");
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
		
		
		
		Clickelement(AoDocviewclick);
		Thread.sleep(3000);
		/////////////////////// 2
		
		
		List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
		List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

		//
		validatetext(ADocumentType1.get(0), "1"); //
		validatetext(ADocumentType1.get(1),"Aadhaar_445588776688.jpg");
		validatetext(ADocumentType.get(0), "");
		validatetext(ADocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
		validatetext(ADocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
		
		List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
		List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
		//
		//
		validatetext(PDocumentType1.get(0), "2"); //
		validatetext(PDocumentType1.get(1), "PAN_DXZOO7654R.jpg");
		validatetext(PDocumentType.get(0), "");
		validatetext(PDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
		validatetext(PDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
			
			
		Thread.sleep(5000);			
		List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
		List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
		//

		//
		validatetext(OrgDocumentType1.get(0), "3"); //
		validatetext(OrgDocumentType1.get(1), "Organisation_ID.jpg");
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
		Thread.sleep(5000);
		Clickelement(TODocviewclick);
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
		Clickelement(BODocviewclick);
		Thread.sleep(3000);
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


	@FindBy(xpath="//div[normalize-space()='rohantech.bank.in']")
	public WebElement Ikcontechbankintxtval1;
	@FindBy(xpath="//div[normalize-space()='Rohan Tech']")
	public WebElement IkconTechtxtval1;
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



		String Apptabledata1[]= { "Domain ID","Domain Name", "Organisation Name","Registration Date", "Renewal Date", "Status"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Apptabledata1[i]);
			//System.out.println("Code Printed");
		}


	}
	public void User_Can_Check_DomaintableData_in_Domain_Page(String src) throws Exception  {
		//String Apptabledata2[]= {"2","Rohantech.bank.in","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		sendkeyweb(Appsearchsend, "Rohan Tech");
		List<WebElement> Orgname=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"']/following-sibling::td"));
		List<WebElement> Orgname1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

		//
		dispalyedattribute(Orgname1.get(1), "1"); //
		validatetext(Orgname1.get(0), ConfigReader.getProperty("Domainnametxtval"));
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatetext(Orgname.get(0), ConfigReader.getProperty("DomRegistrationDate"));
		validatetext(Orgname.get(1),ConfigReader.getProperty("DomRenewalDate"));
		validatetext(Orgname.get(2), ConfigReader.getProperty("Domstatus"));
		//validatetext(Orgname.get(3) ,"5");

	}


	
	public void user_validatetext_AllFields_in_Domainpage() throws Exception { 
		Thread.sleep(3000);
		Clickelement(DomainIDClick);
		Thread.sleep(3000);
		validatetext(DomainDetailstxtval, "Domain Details");


		validatetext(Domaintextval, "Domain");
		validatetext(Organizationtxtval, "Organization");
		validatetext(RegistrationDatetxtval, "Registration Date");
		validatetext(RenewalDatetxtval, "Renewal Date");
		validatetext(DomainStatustxtval, "Domain Status");


		validatetext(Ikcontechbankintxtval1, "rohantech.bank.in");
		validatetext(IkconTechtxtval1, "Rohan Tech"); 
		validatetext(Datetxtval1, "Feb 17, 2025, 12:11 AM");
		validatetext(RenewelDatetxtval1, "Feb 17, 2030, 12:11 AM");
		validatetext(InActivetxtval1, "Active");



		validatetext(Nameserverstxtval1, "Name Servers");
		validatetext(Hostnametxtval, "Host Name"); 
		validatetext(IPaddtxtval1, "IP Address");
		validatetext(TTltxtval1, "TTL");
		validatetext(BillingHistorytxtval1, "Billing History");
		validatetext(invoicenumtxtval1, "Invoice No"); 
		validatetext(amountltxtval1, "Amount");
		validatetext(Invoicedatetxtval1, "Invoice Date");
		validatetext(statustxtval1, "Status");
		Thread.sleep(5000);
	}

	
	
	
	//INVOICE____MODULE
	public void user_navigate_to_Invoicepage1(String src) throws Exception {
		Thread.sleep(8000);

		Clickelement(Invoicesearch);
		
		String Apptabledata1[]= { "","SNo","Organisations Name", "Domain Name","Amount","Invoice","Payment Status"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Apptabledata1[i]);
			//System.out.println("Code Printed");
		}
		
		sendkeyweb(Appsearchsend, "rohantech.bank.in");
		List<WebElement> Domain=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("Domain")+"']/following-sibling::td"));
		List<WebElement> Domain1=driver.findElements(By.xpath("//td[normalize-space()='"+src+"']/preceding-sibling::td"));

		//
//		validatetext(Domain1.get(0)
		dispalyedattribute(Domain1.get(0), "checkbox");
		dispalyedattribute(Domain1.get(1), "ID");
		//validatetext(Domain1.get(1), ConfigReader.getProperty("1"));
		validatetext(Domain1.get(2), ConfigReader.getProperty("InORGname"));
		//validatet(Orgname.get(0), "Ikcontech solutions");
		validatetext(Domain.get(0), ConfigReader.getProperty("InAmount"));
		validatetext(Domain.get(1),ConfigReader.getProperty("Invoicedownload"));
		validatetext(Domain.get(2), ConfigReader.getProperty("InPayStatus"));
		//validatetext(Domain.get(3) ,"");

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
		
		Thread.sleep(3000);
		Clickelement(Settingssearch);
		Thread.sleep(3000);
		Clickelement(DRUserManagementSearch);
		Thread.sleep(3000);


		String SettingDrtabledata[]= { "Sl.No","User Id","User Name","Department", "Role", "Access","Status", "Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}




		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> UserId=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserId")+"']/following-sibling::td"));
		List<WebElement> UserId1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));

		//
		validatetext(UserId1.get(0), "1"); //
		validatetext(UserId.get(0),ConfigReader.getProperty("RDRUserName")); 
		validatetext(UserId.get(1), ConfigReader.getProperty("RDRDepartment")); 
		validatetext(UserId.get(2), ConfigReader.getProperty("RDRUserRole"));
		validatetext(UserId.get(3), "");
		validatetext(UserId.get(4), ConfigReader.getProperty("RDRUserstatus")); 
		validatetext(UserId.get(5), "");
		validatetext(UserId.get(6), "");
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

	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement Registrantsearchbutton;
	
	
	public void user_navigate_to_Settingspage_and_Check_RegistrantUserManagement_Textvalidations(String src1) throws Exception {

		Clickelement(Settingssearch);
		Thread.sleep(3000);
		Clickelement(RegistrantUserManagementSearch);
		Thread.sleep(3000);

		String SettingDrtabledata[]= {"Sl.No","User Id","User Name","Organisation Name", "Role", "Access","Status", "Actions"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		sendkeyweb(Registrantsearchbutton, "ramesh@123.com");

		
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));
		

		List<WebElement> UserID=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("UserID")+"']/following-sibling::td"));
		List<WebElement> UserID1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']/preceding-sibling::td"));
		Thread.sleep(3000);
		//
		String ID=UserID1.get(0).getText();
		validatetext(UserID1.get(0), ID); //
		validatetext(UserID.get(0), ConfigReader.getProperty("RMusername"));
		validatetext(UserID.get(1),ConfigReader.getProperty("RMOrgname")); 
		validatetext(UserID.get(2), ConfigReader.getProperty("RMRole"));
		validatetext(UserID.get(3), "");
		validatetext(UserID.get(4),ConfigReader.getProperty("RMStatus")); 
		validatetext(UserID.get(5), "");
		//validatet(UserID.get(6), "");



	}
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	public WebElement OfficersDDClick;
	@FindBy(xpath="//span[normalize-space()='Rohan Tech']")
	public WebElement OfficersDDSel;
	@FindBy(xpath="//button[contains(text(),'Add User')]")
	public WebElement ClickAddUser;
	
	public void Registrar_can_check_registrant_officer_details_textvalidations_and_functionalities_in_settings_page(String src,String src4,String src5,String src6) throws Exception {
	   
		Clickelement(Settingssearch);
		//Thread.sleep(3000);

		Clickelement(RegistrantOfficerDetailsSearch);
		Thread.sleep(3000);
		String SettingDrtabledata[]= {"Id","Organisation Name","Person Name", "Designation", "MobileNumber","EmailId", 
				"Role","Verify Documents","Approve/Reject Login","Login Status","Is Active","Actions"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		Clickelement(OfficersDDClick);
		Clickelement(OfficersDDSel);
		
		
		
		
		
		
		
		
		List<WebElement> AOOrgname=driver.findElements(By.xpath("(//td[normalize-space()='"+ConfigReader.getProperty("OrgName")+"'])[1]/following-sibling::td"));
		List<WebElement> AOOrgname1=driver.findElements(By.xpath("(//td[normalize-space()='"+src+"'])[1]/preceding-sibling::td"));
		//
		Thread.sleep(3000);
		try {
//		validatetext(AOOrgname1.get(0), "1"); 
		validatetext(AOOrgname.get(0), ConfigReader.getProperty("AOPersonname"));
		validatetext(AOOrgname.get(1), ConfigReader.getProperty("AODesignation"));
		validatetext(AOOrgname.get(2), ConfigReader.getProperty("AOMobileNumber"));
		validatetext(AOOrgname.get(3), ConfigReader.getProperty("AOEmailId"));
		validatetext(AOOrgname.get(4), ConfigReader.getProperty("AORole"));
		validatetext(AOOrgname.get(5), "View");
		//validatet(Orgname.get(6), "AOApprove/rejectlogin");
		validatetext(AOOrgname.get(7), ConfigReader.getProperty("AOLoginStatus"));
		validatetext(AOOrgname.get(8), ConfigReader.getProperty("AOIsActive"));
		validatetext(AOOrgname.get(9), "");
		}catch (Exception e) {
			// TODO: handle exception
		}
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
		//validatet(BOOrgname.get(6), "");
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
		validatetext(TOOrgname.get(2),ConfigReader.getProperty("AOMobileNumber")); 
		validatetext(TOOrgname.get(3),ConfigReader.getProperty("BOEmailId")); 
		validatetext(TOOrgname.get(4),ConfigReader.getProperty("TORole")); 
		validatetext(TOOrgname.get(5), "View");
		//validatet(TOOrgname.get(6), "");
		validatetext(TOOrgname.get(7), ConfigReader.getProperty("TOLoginStatus"));
		validatetext(TOOrgname.get(8), ConfigReader.getProperty("TOIsActive"));
		validatetext(TOOrgname.get(9), "");
		
		
		//AO
		        Thread.sleep(5000);
				Clickelement(setAoviewclick);
				Thread.sleep(3000);
				

				List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
				List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

				//
				validatetext(ADocumentType1.get(0), "1"); //
				validatetext(ADocumentType1.get(1),"Aadhaar_445588776688.jpg");
				validatetext(ADocumentType.get(0), "");
				validatetext(ADocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				validatetext(ADocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
				
				
				List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
				List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
				//
				//
				validatetext(PDocumentType1.get(0), "2"); //
				validatetext(PDocumentType1.get(1), "PAN_DXZOO7654R.jpg");
				validatetext(PDocumentType.get(0), "");
				validatetext(PDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				validatetext(PDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
					
				Thread.sleep(5000);			
				List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
				List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
				//

				//
				validatetext(OrgDocumentType1.get(0), "3"); //
				validatetext(OrgDocumentType1.get(1), "Organisation_ID.jpg");
				validatetext(OrgDocumentType.get(0), "");
				validatetext(OrgDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				validatetext(OrgDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
				
				
				
				
				Thread.sleep(3000);
				//Clickelement(AoDocviewclick);
				Thread.sleep(3000);
				Clickelement(AOAdharverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
//				Thread.sleep(3000);
//				//Clickelement(AOadharAproveClick);
//				Thread.sleep(3000);
//				//sendkeyweb(AOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				//Clickelement(AOadharApprovalSavechangesClick);
//				Thread.sleep(3000);
			    validatetext(AOadharApprovalchecktxtval, "Approved");
			    validatetext(Toastermessage, "Document  Approved");
				Clickelement(AOpanverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(AOPanAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(AOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(AOpanApprovalSavechangesClick);
//				Thread.sleep(3000);
				validatetext(AOpanApprovalchecktxtval, "Approved");
				validatetext(Toastermessage, "Document  Approved");
				Clickelement(AOODVerify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(AOODAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(AOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(AOODApprovalSavechangesClick);	
//				Thread.sleep(3000);
				validatetext(AodApprovalchecktxtval, "Approved");
				validatetext(Toastermessage, "Document  Approved");
				Clickelement(Settingssearch);
				Clickelement(RegistrantOfficerDetailsSearch);
				Clickelement(OfficersDDClick);
				Clickelement(OfficersDDSel);
	
	//Bo		
				Thread.sleep(2000);
				Clickelement(setBoviewclick);
				Thread.sleep(3000);
				//Clickelement(BODocviewclick);
				Thread.sleep(3000);
				Clickelement(BOAdharverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(BOadharAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(BOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(BOadharApprovalSavechangesClick);
//				Thread.sleep(3000);
				validatetext(BOAdharApprovalchecktxtval, "Approved");
				validatetext(Toastermessage, "Document  Approved");
				Clickelement(BOpanverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(BOPanAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(TOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(BOpanApprovalSavechangesClick);
//				Thread.sleep(3000);
				validatetext(BOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				validatetext(Toastermessage, "Document  Approved");
				Clickelement(BOODVerify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(BOODAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(BOadharApprovalCommentClick, " ");
//				Thread.sleep(3000);
//				Clickelement(BOODApprovalSavechangesClick);
//				Thread.sleep(3000);	
				validatetext(BOODApprovalchecktxtval, "Approved");
				validatetext(Toastermessage, "Document  Approved");
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
//				Clickelement(TOadharAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(TOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(TOadharApprovalSavechangesClick);
//				Thread.sleep(3000);
			    validatetext(TOAdharApprovalchecktxtval, "Approved");
			    validatetext(Toastermessage, "Document  Approved");
				Clickelement(TOpanverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(TOPanAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(TOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(TOpanApprovalSavechangesClick);
//				Thread.sleep(3000);
				validatetext(TOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				validatetext(Toastermessage, "Document  Approved");
				Clickelement(TOODVerify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(3000);
//				Clickelement(TOODAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(TOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(TOODApprovalSavechangesClick);
//				Thread.sleep(3000);
				validatetext(TOODApprovalchecktxtval, "Approved");
				validatetext(Toastermessage, "Document  Approved");
				
			
			
			
		}
	@FindBy(xpath="//button[contains(text(),'Add Role')]")
	public WebElement Clickaddrole;
	@FindBy(xpath="//input[@id='addRoleName']")
	public WebElement AddRolename;
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	public WebElement Clickaddrolesavebutton;
	
	
	public void user_navigate_to_Settingspage_and_Check_RegistrarRolesSearch_Textvalidations(String src1) throws Exception {
		Thread.sleep(3000);
		Clickelement(Settingssearch);
		//Thread.sleep(3000);
		Clickelement(RegistrarRolesSearch);
		
		String SettingDrtabledata[]= {"ID","Role Name","Created", "Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), SettingDrtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> RoleName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("RoleName")+"']//following-sibling::td"));
		List<WebElement> RoleName1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']//preceding-sibling::td"));

		//
		validatetext(RoleName1.get(0), "1"); //
		//validatet(RoleName.get(1), " IDRBTADMIN "); //
		validatetext(RoleName.get(0), "");
		validatetext(RoleName.get(1),ConfigReader.getProperty("RegistrarCreatedDate&Time")); 
		validatetext(RoleName.get(2),ConfigReader.getProperty("RegistrarModified"));  
		validatetext(RoleName.get(3),ConfigReader.getProperty("RegistrarModifiedDate&Time")); 
		validatetext(RoleName.get(4), "");
		validatetext(RoleName.get(5), "");
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
		Thread.sleep(3000);
		Clickelement(Settingssearch);
		
		Clickelement(RegistrarDepartmentSearch);
		//Thread.sleep(3000);
		String Settingtabledata[]= {"ID","Department Name","Department Code", "Created By","Created Date & Time", "Modified By","Modified Date & Time", 
				"Edit","Delete"};
		List<WebElement> values = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
		Thread.sleep(3000);
		for (int i= 0; i< values.size(); i++) {

			validatetext(values.get(i), Settingtabledata[i]);
			//System.out.println("Code Printed");
		}
		//String Apptabledata2[]= {"2","Bharat Kumar","Vtech","Feb 2, 2025, 9:02 AM, Feb 2, 2030, 9:02 AM","InActive"};
		//List<WebElement> values1 = driver.findElements(By.xpath("//tbody[@class='mdc-data-table__content']//tr[1]"));

		List<WebElement> DepartmentName=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("DepartmentName")+"']//following-sibling::td"));
		List<WebElement> DepartmentName1=driver.findElements(By.xpath("//td[normalize-space()='"+src1+"']//preceding-sibling::td"));

		//
		validatetext(DepartmentName1.get(0), "1"); //
		//validatet(DepartmentName.get(1), "IT"); //
		validatetext(DepartmentName.get(0), "B001");
		validatetext(DepartmentName.get(1), "");
		validatetext(DepartmentName.get(2), ConfigReader.getProperty("RegistrarDepCreatedDate&Time")); 
		validatetext(DepartmentName.get(3), "");
		validatetext(DepartmentName.get(4),ConfigReader.getProperty("RegistrarDepModifiedDate&Time"));  
		validatetext(DepartmentName.get(5), "");
		validatetext(DepartmentName.get(6), "");
		/*
		Clickelement(Clickadddept);
		sendkeyweb(Adddeptname, "");
		sendkeyweb(Adddeptcode, "");
		Clickelement(Clicksavebutton);*/
		
		Clickelement(Dashboardsearch);
		
		
		
		
		
		
		
		
	}
}