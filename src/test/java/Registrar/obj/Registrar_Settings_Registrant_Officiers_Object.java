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

public class Registrar_Settings_Registrant_Officiers_Object extends Baseclass{
	WebDriver driver = Driver.getDriver();
	ConfigWriter configWriter = new ConfigWriter();


	public Registrar_Settings_Registrant_Officiers_Object(WebDriver RC) {
		driver = RC;
		PageFactory.initElements(RC, this);
	}
	@FindBy(xpath="//span[@class='ng-arrow-wrapper']")
	public WebElement OfficersDDClick;
	@FindBy(xpath="//span[normalize-space()='Canara Bank']")
	public WebElement OfficersDDSel;
	@FindBy(xpath="//button[contains(text(),'Add User')]")
	public WebElement ClickAddUser;
	
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
	@FindBy(xpath="//a[normalize-space()='Registrant Officer Details']")
	public WebElement RegistrantOfficerDetailsSearch ;

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
	@FindBy(xpath="//div[@role='alert']")
	public WebElement  ToastermessageApproved;
    
	@FindBy(xpath="//div[@role='alert']")
	public WebElement Toastermessage;


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
		
		try {
		Clickelement(OfficersDDClick);
		}catch (Exception e) {
			System.out.println(e);
		}
		WebElement id1=driver.findElement(By.xpath("//span[contains(text(),' "+ConfigReader.getProperty("OrgName")+"')]"));
	
		
		try {
			Clickelement(id1);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		/*
		
		
		
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
		
		//validatetext(BOOrgname1.get(0), "2"); //
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
		//validatetext(TOOrgname1.get(0), "3"); //
		validatetext(TOOrgname.get(0), ConfigReader.getProperty("TOPersonname"));
		validatetext(TOOrgname.get(1),ConfigReader.getProperty("TODesignation"));
		validatetext(TOOrgname.get(2),ConfigReader.getProperty("AOMobileNumber")); 
		validatetext(TOOrgname.get(3),ConfigReader.getProperty("BOEmailId")); 
		validatetext(TOOrgname.get(4),ConfigReader.getProperty("TORole")); 
		validatetext(TOOrgname.get(5), "View");
		//validatet(TOOrgname.get(6), "");
		validatetext(TOOrgname.get(7), ConfigReader.getProperty("TOLoginStatus"));
		validatetext(TOOrgname.get(8), ConfigReader.getProperty("TOIsActive"));
		validatetext(TOOrgname.get(9), "");*/
		
		
		//AO
		        Thread.sleep(5000);
				Clickelement(setAoviewclick);
				Thread.sleep(3000);
				

				List<WebElement> ADocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("ADocumentType")+"']/following-sibling::td"));
				List<WebElement> ADocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src4+"']/preceding-sibling::td"));

				//
				configWriter.setProperty("1", ADocumentType1.get(0).getText());
				configWriter.saveProperties();
				validatetext(ADocumentType1.get(0), "1"); //
				configWriter.setProperty("Adahhar-Documents - 04.jpg", ADocumentType1.get(1).getText());
				configWriter.saveProperties();
				validatetext(ADocumentType1.get(1),"Adahhar-Documents - 04.jpg");
				validatetext(ADocumentType.get(0), "");
				configWriter.setProperty("AOAdharDocStatus", ADocumentType.get(1).getText());
				configWriter.saveProperties();
				validatetext(ADocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				configWriter.setProperty("AOAdharDocComment", ADocumentType.get(2).getText());
				configWriter.saveProperties();
				validatetext(ADocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
				
				
				List<WebElement> PDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("PDocumentType")+"']/following-sibling::td"));
				List<WebElement> PDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src5+"']/preceding-sibling::td"));
				//
				//
				configWriter.setProperty("2", PDocumentType1.get(0).getText());
				configWriter.saveProperties();
				validatetext(PDocumentType1.get(0), "2"); //
				configWriter.setProperty("Pan-Documents - 05.jpg", PDocumentType1.get(1).getText());
				configWriter.saveProperties();
				validatetext(PDocumentType1.get(1), "Pan-Documents - 05.jpg");
				validatetext(PDocumentType.get(0), "");
				configWriter.setProperty("AOAdharDocStatus", PDocumentType.get(1).getText());
				configWriter.saveProperties();
				validatetext(PDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				configWriter.setProperty("AOAdharDocComment", PDocumentType.get(2).getText());
				configWriter.saveProperties();
				validatetext(PDocumentType.get(2), ConfigReader.getProperty("AOAdharDocComment"));
					
				Thread.sleep(5000);			
				List<WebElement> OrgDocumentType=driver.findElements(By.xpath("//td[normalize-space()='"+ConfigReader.getProperty("OrgDocumentType")+"']/following-sibling::td"));
				List<WebElement> OrgDocumentType1=driver.findElements(By.xpath("//td[normalize-space()='"+src6+"']/preceding-sibling::td"));
				//

				//
				configWriter.setProperty("3", OrgDocumentType1.get(0).getText());
				configWriter.saveProperties();
				validatetext(OrgDocumentType1.get(0), "3"); //
				configWriter.setProperty("Licence-Documents - 01.jpg", OrgDocumentType1.get(1).getText());
				configWriter.saveProperties();
				validatetext(OrgDocumentType1.get(1), "Licence-Documents - 01.jpg");
				validatetext(OrgDocumentType.get(0), "");
				configWriter.setProperty("AOAdharDocStatus", OrgDocumentType1.get(1).getText());
				configWriter.saveProperties();
				validatetext(OrgDocumentType.get(1), ConfigReader.getProperty("AOAdharDocStatus")); 
				configWriter.setProperty("AOAdharDocComment", OrgDocumentType1.get(2).getText());
				configWriter.saveProperties();
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
			  //  validatetext(AOadharApprovalchecktxtval, "Approved");
			   // validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(AOpanApprovalchecktxtval, "Approved");
				//validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(AodApprovalchecktxtval, "Approved");
				//validatetext(Toastermessage, "Document  Approved");
				Clickelement(Settingssearch);
				Thread.sleep(3000);

				Clickelement(RegistrantOfficerDetailsSearch);
				Thread.sleep(3000);
				Clickelement(OfficersDDClick);
				Thread.sleep(3000);

				WebElement id2=driver.findElement(By.xpath("//span[contains(text(),' "+ConfigReader.getProperty("OrgName")+"')]"));

				try {
					Clickelement(id2);
				}catch (Exception e) {
					System.out.println(e);
				}
				Thread.sleep(3000);
	
	//Bo		
				Thread.sleep(3000);
				Clickelement(setBoviewclick);
				Thread.sleep(6000);
				//Clickelement(BODocviewclick);
				
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
				//validatetext(BOAdharApprovalchecktxtval, "Approved");
				//validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(BOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				//validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(BOODApprovalchecktxtval, "Approved");
				//validatetext(Toastermessage, "Document  Approved");
				Clickelement(Settingssearch);
				Thread.sleep(3000);

				Clickelement(RegistrantOfficerDetailsSearch);
				Thread.sleep(3000);
				Clickelement(OfficersDDClick);
				Thread.sleep(3000);

				WebElement id3=driver.findElement(By.xpath("//span[contains(text(),' "+ConfigReader.getProperty("OrgName")+"')]"));

				try {
					Clickelement(id3);
				}catch (Exception e) {
					System.out.println(e);
				}
			
//TO
				Thread.sleep(3000);
				Clickelement(setToviewclick);
				Thread.sleep(6000);
				//Clickelement(TODocviewclick);
				
				Clickelement(TOAdharverify);
				Thread.sleep(3000);
				clickmultipleweb(closedocbutton);
				Thread.sleep(6000);
//				Clickelement(TOadharAproveClick);
//				Thread.sleep(3000);
//				sendkeyweb(TOadharApprovalCommentClick, "");
//				Thread.sleep(3000);
//				Clickelement(TOadharApprovalSavechangesClick);
//				Thread.sleep(3000);
			   // validatetext(TOAdharApprovalchecktxtval, "Approved");
			    //validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(TOPanApprovalchecktxtval, "Approved");
				//Thread.sleep(3000);
				//validatetext(Toastermessage, "Document  Approved");
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
				//validatetext(TOODApprovalchecktxtval, "Approved");
				//validatetext(Toastermessage, "Document  Approved");
				
				driver.navigate().back();
			
			
		}
}
