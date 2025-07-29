package hooks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Datepicker.Dateformatter;
import Drivermanager.Driver;

public class Baseclass {
	WebDriver vc = Driver.getDriver();
	WebDriverWait wait=new WebDriverWait(vc, Duration.ofSeconds(20));
	ExtentTest test=Hooks.getExtentTest();
		
	public String validatefont(WebElement web) {
	    // Extract font properties
	    String fontFamily = web.getCssValue("font-family");
	    String fontSize = web.getCssValue("font-size");
	    // Prepare the message
	    String message = "Font-family is " + fontFamily + " and font-size is " + fontSize;
	    // Determine if the font is as expected (Roboto)sans-serif
	    boolean isExpectedFont = fontFamily.contains("Roboto") || fontFamily.contains("sans-serif") ;
	    // Log result with color based on pass/fail
	    logFontValidation(isExpectedFont, message,message, test,web);
	    System.out.println(isExpectedFont ? "Robot font":"Not Roboto font");
	    return message;
	}

	// Utility method to handle logging based on the font validation result
	private void logFontValidation(boolean isPassed, String Expected,String Actual, ExtentTest test,WebElement web) {
	    // Set color based on the result
	    ExtentColor color = isPassed ? ExtentColor.GREEN : ExtentColor.RED;
	    // Capture the screenshot
	    //String screenshotBase64 = Dateformatter.elementcapsre(web);
	    // Construct the log message with color label and embedded image
	    String logMessage = MarkupHelper.createLabel(Expected, color).getMarkup();// +
	                      //  "<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";
	    // Log pass/fail status with embedded image
	    if (isPassed) {
	        test.pass(logMessage)
	        .info("Expected result: " + Expected)
            .info("Actual result:"+ Actual);
	    } else {
	        test.fail(logMessage)
	        .info("Expected result: " + Expected)
            .info("Actual result:"+ Actual);
	    }
	    }
	private void logStatus(boolean isPassed, String Expected,String Actual, ExtentTest test,WebElement web) {
        ExtentColor color = isPassed ? ExtentColor.GREEN : ExtentColor.RED;
        String screenshotBase64 = Dateformatter.elementcapsre(web);
        String logMessage = MarkupHelper.createLabel(Expected, color).getMarkup() 
                            +"<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";
        if (isPassed) {
            test.pass(logMessage)
            .info("Actual result: " + Expected)
            .info("Expected result: "+ Actual);
        } else {
            test.fail(logMessage)
            .info("Actual result: " + Expected)
            .info("Expected result: "+ Actual);
        }
    }
	
	
	
	private void logStatusalert(boolean isPassed, String Expected,String Actual, ExtentTest test) {
        ExtentColor color = isPassed ? ExtentColor.GREEN : ExtentColor.RED;
        String screenshotBase64 = Dateformatter.Capsre();
        String logMessage = MarkupHelper.createLabel(Expected, color).getMarkup()
                            +"<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";
        if (isPassed) {
            test.pass(logMessage)
            .info("Actual result: " + Expected)
            .info("Expected result: "+ Actual);
        } else {
            test.fail(logMessage)
            .info("Actual result: " + Expected)
            .info("Expected result: "+ Actual);
        }
    }
	
	public void validatealert(String expectedText) {
		  	        
	        try {
	            // Wait for alert to be present
	            wait.until(ExpectedConditions.alertIsPresent());
	            // Switch to alert and get text
	            Alert alert = vc.switchTo().alert();
	            String actualText = alert.getText();
	            // Compare actual vs expected text
	            boolean isMatched = actualText.equals(expectedText);
	            // Log the status
	            logStatusalert(isMatched, actualText, expectedText, test);

	            System.out.println("Alert text verified: " + actualText);
	        } catch (NoAlertPresentException e) {
	            System.err.println("No alert present when expected: " + e.getMessage());
	        } catch (Exception e) {
	            System.err.println("Unexpected exception while handling alert: " + e.getMessage());
	        }
		
	}
	public void Table_properties(List<WebElement> tableElements,List<String> expectedTexts ) {
		int j=0;
        for (int i = 0; i < tableElements.size(); i++) {
            if (tableElements.get(i).isDisplayed() && !tableElements.get(i).getText().isEmpty()) {
            	validatetext(tableElements.get(i), expectedTexts.get(j));
            	j++;
            }
        }
    }
	
	public void Selectdropdown(WebElement dropdown,String valueOrIndex) {
		try {
            new Select(dropdown).selectByVisibleText(valueOrIndex);
        } catch (Exception e) {
            new Select(dropdown).selectByIndex(Integer.parseInt(valueOrIndex));
        }
        logStatus(true, valueOrIndex,valueOrIndex, test,dropdown);
		}
		
	public void selectdropmultipleweb(List<WebElement> web,String src) {
		for (WebElement e : web) {
			if (e.isDisplayed()) {
			Selectdropdown(e,src);
			}
		}
	}
	public void selectdropmultipleweb(List<WebElement> web,String[] src) {
		int i=0;
		for (WebElement e : web) {
			if(e.isDisplayed()) {
				Selectdropdown(e,src[i]);
				i++;
			}
		}
	}
		
	public void selectdropindexmultipleweb(List<WebElement> web,String src) {
		for (WebElement e : web) {
			Selectdropdown(e,src);
		}
	}
	
	public void attributeselected(WebElement web, String str) {
		try{if (web.isSelected()) {
			System.out.println(str + " is selected");
		} else {
			System.out.println(str + " is not selected");
		}}
		catch (Exception e) {
            System.err.println("Unexpected error while validating element text: " + e.getMessage());
        }
				
	}
				//validatetext
	public void validatetext(WebElement element, String expectedText) {
        try {
            // Check if element is displayed and text matches
            if (element != null && element.isDisplayed()) {
                String actualText = element.getText();
                boolean isMatched = actualText.contains(expectedText);
                // Print and log the result
                System.out.println(isMatched ? actualText + " is matched" : actualText + " is not matched");
                logStatus(isMatched, actualText, expectedText, test, element);
                // Validate font after checking text
                validatefont(element);
            } else {
                System.err.println("Element is either null or not displayed.");
                logStatus(false, "Element not visible", expectedText, test, element);
            }
        } catch (NoSuchElementException e) {
            System.err.println("No Such Element Exception: Element not found in the DOM.");
        } catch (StaleElementReferenceException e) {
            System.err.println("Stale Element Reference: Element is no longer attached to the DOM.");
        } catch (Exception e) {
            System.err.println("Unexpected error while validating element text: " + e.getMessage());
        }

    }
	
	public void validatetextmultiweb(List<WebElement> elements, String expectedText) {
		
		elements.stream().filter(WebElement::isDisplayed).forEach(e -> validatetext(e, "Cancel"));

    }

	public void validateattribute(WebElement element, String attribute, String expectedValue) {
		 try { 
			wait.until(ExpectedConditions.visibilityOf(element));
	        boolean isMatched = element.isDisplayed() && element.getAttribute(attribute).contains(expectedValue);
	        System.out.println(isMatched ? element.getText()+"is matched":element.getText()+"is not matched");
	        logStatus(isMatched, "Attribute " + attribute + ": " + element.getAttribute(attribute),expectedValue, test,element);
	        validatefont(element);
	        
	} catch (NoSuchElementException e) {
        System.err.println("No Such Element Exception: Element not found in the DOM.");
    } catch (StaleElementReferenceException e) {
        System.err.println("Stale Element Reference: Element is no longer attached to the DOM.");
    } catch (Exception e) {
        System.err.println("Unexpected error while validating element text: " + e.getMessage());
    }
	    }

	public void dispalyedattribute(WebElement element, String message) {
		 try{boolean isDisplayed = element.isDisplayed();
		 System.out.println(isDisplayed ? element.getText()+"is displayed":element.getText()+"is not displayed");
	        logStatus(isDisplayed, message + " is " + (isDisplayed ? "displayed" : "not displayed"),message, test,element);
//	        validatefont(element);
	        
	 	} catch (NoSuchElementException e) {
	         System.err.println("No Such Element Exception: Element not found in the DOM.");
	     } catch (StaleElementReferenceException e) {
	         System.err.println("Stale Element Reference: Element is no longer attached to the DOM.");
	     } catch (Exception e) {
	         System.err.println("Unexpected error while validating element text: " + e.getMessage());
	     }
	    }

	public void clickmultipleweb(List<WebElement> elements) {
		 elements.stream().filter(WebElement::isDisplayed).forEach(this::Clickelement);
    }
	public void Clickelement(WebElement element) {
		try { wait.until(ExpectedConditions.visibilityOf(element));
	     wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	     
		}catch (NoSuchElementException e) {
	            System.err.println("No Such Element: The element was not found - " + element);
	        } catch (StaleElementReferenceException e) {
	            System.err.println("Stale Element: The element is no longer attached to the DOM - " + element);
	        } catch (ElementClickInterceptedException e) {
	            System.err.println("Element Click Intercepted: Another element is blocking the click - " + element);
	        } catch (Exception e) {
	            System.err.println("Exception occurred while clicking the element - " + element + " : " + e.getMessage());
	        }
	    }
	    
	
	public void sendkeysmultipleweb(List<WebElement> elements,String text) {
		elements.stream().filter(WebElement::isDisplayed).forEach(e -> sendkeyweb(e, text));
    }
	public void sendkeyweb(WebElement element,String text) {
		try {
		wait.until(ExpectedConditions.visibilityOf(element));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
        element.sendKeys(text);}
		catch (NoSuchElementException e) {
            System.err.println("No Such Element: The element was not found - " + element);
        } catch (StaleElementReferenceException e) {
            System.err.println("Stale Element: The element is no longer attached to the DOM - " + element);
        } catch (ElementClickInterceptedException e) {
            System.err.println("Element Click Intercepted: Another element is blocking the click - " + element);
        } catch (Exception e) {
            System.err.println("Exception occurred while clicking the element - " + element + " : " + e.getMessage());
        }
    }
//	public void validatet(WebElement element, String expectedText) {
//		
//		boolean isMatched = element.isDisplayed() && element.getText().equals(expectedText);
//		System.out.println(isMatched ? element.getText()+"is matched":element.getText()+"is not matched");
//        logStatus(isMatched, "Text: " + element.getText(),expectedText, test,element);
//        validatefont(element);
//    }
	
	public void validatealert(WebElement element, String expectedText ,String wrongexpect) {
		try{
		boolean isMatched = element.isDisplayed() && (element.getText().contains(expectedText) || element.getText().contains(expectedText));
		System.out.println(isMatched ? element.getText()+" is matched":element.getText()+" is not matched");
        logStatus(isMatched, element.getText(),expectedText, test,element);
        validatefont(element);
		}catch (NoSuchElementException e) {
            System.err.println("No Such Element: The element was not found - " + element);
        } catch (StaleElementReferenceException e) {
            System.err.println("Stale Element: The element is no longer attached to the DOM - " + element);
        } catch (ElementClickInterceptedException e) {
            System.err.println("Element Click Intercepted: Another element is blocking the click - " + element);
        } catch (Exception e) {
            System.err.println("Exception occurred while clicking the element - " + element + " : " + e.getMessage());
        }
    }
	public void Table_prop(List<WebElement> tableElements,String expectedText ) {
		vc.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<String> list = new ArrayList<String>(Arrays.asList(expectedText.split(","))); 
        for (int i = 0; i < tableElements.size(); i++) {
            if (tableElements.get(i).isDisplayed()) {
            	try {
            	validatetext(tableElements.get(i), list.get(i));
            }catch (NoSuchElementException e) {
                System.err.println("No Such Element: The element was not found - " + tableElements.get(i));
            } catch (StaleElementReferenceException e) {
                System.err.println("Stale Element: The element is no longer attached to the DOM - " + tableElements.get(i));
            } catch (ElementClickInterceptedException e) {
                System.err.println("Element Click Intercepted: Another element is blocking the click - " + tableElements.get(i));
            } catch (Exception e) {
                System.err.println("Exception occurred while clicking the element - " + tableElements.get(i)+ " : " + e.getMessage());
            }
            }
        }
    }
	@FindBy(xpath = "//div[@role='alert']")
	public List<WebElement> alert_popup;
	
	public void popupvalidate(String str,String str1) {
//		wait.until(ExpectedConditions.visibilityOf(alert_popup));
		for(WebElement e: alert_popup) {
		if(e.isDisplayed()) {
			String st = e.getText();
			validatealert(e, str,str1);
			System.out.println(st);

	}else {
		System.out.println("pop up not displayed");
	}}
	}
	public static String absolutepath(String src) {
	    File f = new File("src/test/resources/Documents/"+src); 
	    String absolutepath=f.getAbsolutePath().toString();
	    return absolutepath;
	    }
	
	public void fileupload_robot(String path) throws AWTException, InterruptedException {
		StringSelection selection = new StringSelection(absolutepath(path));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot = new Robot();
		// Wait for the file dialog to appear
		robot.delay(2000);
		// Paste the file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		// Press Enter to close the file dialog
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
JavascriptExecutor js = (JavascriptExecutor) vc;
	
	public void jssendkeys(WebElement e,String src) {
		js.executeScript("arguments[0].value = arguments[1];", e, src);
 
		// Optionally trigger 'input' or 'change' events
		js.executeScript("arguments[0].dispatchEvent(new Event('input'));", e);
 
	}

	
}

