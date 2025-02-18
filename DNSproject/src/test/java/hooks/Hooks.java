package hooks;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import Datepicker.Dateformatter;
import Drivermanager.Driver;
import io.cucumber.java.*;

public class Hooks {

    static WebDriver driver = Driver.getDriver();
    static ExtentReports exp;
    static ExtentTest test1;

    public static ExtentTest getExtentTest() {
        return test1;
    }

    @BeforeAll
    public static void before_all() {
        System.out.println("================ BEFORE ALL ================");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Initialize ExtentReports and configure it once
        ExtentSparkReporter srp = new ExtentSparkReporter("Reports/DNS_Report.html")
                .viewConfigurer()
                .viewOrder()
                .as(new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY })
                .apply();
        srp.config().setTheme(Theme.STANDARD);
        srp.config().setDocumentTitle("UMS Consolidated Report");
        srp.config().setReportName("Extent Report for All Scenarios");

        exp = new ExtentReports();
        exp.attachReporter(srp);
    }

    @AfterAll
    public static void after_all() {
        System.out.println("================ AFTER ALL ================");
        if (exp != null) {
            exp.flush(); // Finalize the report
        }
       // driver.quit(); // Close WebDriver after all tests
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
    	ExtentColor color = ExtentColor.RED;
        String screenshotBase64 = Dateformatter.Capsre();
	    
	    // Construct the log message with color label and embedded image
	    String logMessage = MarkupHelper.createLabel("failed step", color).getMarkup() +
	                        "<br><img src='data:image/png;base64," + screenshotBase64 + "' height='200' width='300'/>";

        if (scenario.isFailed()) {
            test1.fail(logMessage);
        } 
    }

    @Before
    public void bef(Scenario scenario) {
        // Create a new test for each scenario
        test1 = exp.createTest(scenario.getName());
    }

    @After
    public void cleanup() throws IOException {
        // You no longer need to flush here since it's done in @AfterAll
    }
}
