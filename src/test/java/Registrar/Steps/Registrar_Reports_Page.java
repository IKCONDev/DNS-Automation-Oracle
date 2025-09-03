package Registrar.Steps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Configuration.ConfigReader;
import Drivermanager.Driver;

import Registrar.obj.Registrar_Reports_Objects;
import io.cucumber.java.en.Then;

public class Registrar_Reports_Page {
	
	WebDriver driver = Driver.getDriver();
	
	Registrar_Reports_Objects RRO = new Registrar_Reports_Objects(driver);
	
	
	@Then("Registrar Reports Domain Application Summary")
	public void Registrar_Reports_Domain_Application_Summary() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RRO.Registrar_Reports_Domain_Application_Summary();
		
	}
	@Then("Registrar Reports Domain Application Matrix")
	public void Registrar_Reports_Domain_Application_Matrix() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RRO.Registrar_Reports_Domain_Application_Matrix();
		
	}
	
	@Then("Registrar Reports Domain Application Oraphandata")
	public void Registrar_Reports_Domain_Application_Orphandata() throws Exception  {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		RRO.Registrar_Reports_Domain_Application_Orphandata();
		
	}
	
}
