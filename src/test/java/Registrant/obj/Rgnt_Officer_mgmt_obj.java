package Registrant.obj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		String Table_col = "Id,Entity Name,Person Name,Designation,Mobile Number,Email ID,Role,View Documents,Login Status,Delete Officer";
		Table_prop(Table_cols, Table_col);

		validatetext(AO_F.get(1), "NA");
		validatetext(AO_P.get(2), "Entity name");
		validatetext(AO_P.get(3), "Personname");
		validatetext(AO_P.get(4), "Designation");
		validatetext(AO_P.get(5), "Mobile Number");
		validatetext(AO_P.get(6), "Email ID");

		validatetext(TO_F.get(1), "View");
		validatetext(TO_P.get(2), "Entity name");
		validatetext(TO_P.get(3), "Personname");
		validatetext(TO_P.get(4), "Designation");
		validatetext(TO_P.get(5), "Mobile Number");
		validatetext(TO_P.get(6), "Email ID");

		validatetext(FO_F.get(1), "View");
		validatetext(FO_P.get(2), "Entity name");
		validatetext(FO_P.get(3), "Personname");
		validatetext(FO_P.get(4), "Designation");
		validatetext(FO_P.get(5), "Mobile Number");
		validatetext(FO_P.get(6), "Email ID");

//		Clickelement(AO_F.get(1));

	}
}
