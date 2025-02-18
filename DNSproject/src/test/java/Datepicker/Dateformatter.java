package Datepicker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Drivermanager.Driver;

public class Dateformatter {
	static WebDriver driver=Driver.getDriver();
	
	public String Datefun(int i,int m,int d) {
		DateTimeFormatter dtf1;
		if(i==0) {
		 dtf1= DateTimeFormatter.ofPattern("dd-MM-00yyyyhh:mma");
		}else if(i==1){
			dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		}
		else{
			dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyyhh:mma");
		}
		LocalDateTime today1 = LocalDateTime.now();
		LocalDateTime pday1 = today1.plusYears(0).plusWeeks(0).plusMonths(m).plusDays(d).plusHours(1).plusMinutes(2);
		String strq = dtf1.format(pday1);
		return strq;
	}
	
	public static String Capsre() {
		TakesScreenshot takes = (TakesScreenshot) driver;
		String bs4 = takes.getScreenshotAs(OutputType.BASE64);
		return bs4;
	}
	public static String elementcapsre(WebElement web) {
		String bs4 = web.getScreenshotAs(OutputType.BASE64);
		return bs4;
	}
	
}
