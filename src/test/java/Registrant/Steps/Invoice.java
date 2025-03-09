package Registrant.Steps;

import org.openqa.selenium.WebDriver;

import Drivermanager.Driver;
import Registrant.obj.Invoice_object;
import io.cucumber.java.en.Then;

public class Invoice {
	WebDriver driver = Driver.getDriver();
	Invoice_object IO=new Invoice_object(driver);
	
	
	@Then("User navigate to Invoice page")
	public void user_navigate_to_invoice_page() {
	   IO.user_navigate_to_invoice_page();
	    
	}

	@Then("User validate the Invoice page")
	public void user_validate_the_invoice_page() {
	   IO.user_validate_the_invoice_page();
	    
	}
	
	@Then("User download the proforma invoice")
	public void user_download_the_proforma_invoice_page() {
	   IO.proforma_InvoiceDownload();
	    
	}
	
	@Then("User download the invoice")
	public void user_download_the_invoice_page() {
	   IO.InvoiceDownload();
	    
	}
	
}
