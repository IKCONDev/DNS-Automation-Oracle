package Registrant.obj;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	@FindBy(xpath = "//th")
	public List<WebElement> table;
	public void user_validate_the_invoice_page() {
	    String st="SNo,Organization Name,Domain Name,Amount,Invoice,Payment Status";
		Table_prop(table, st);
	}
}
