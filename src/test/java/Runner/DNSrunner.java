package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/prakash/Aaoracle_vm3.feature"}
///Registrar Loginpage.feature","src/test/resources/prakash/Registrar Dashboard.feature","src/test/resources/prakash/Registrar Applications.feature","src/test/resources/prakash/Registrar Domainpage.feature","src/test/resources/prakash/Registrar Invoice.feature","src/test/resources/prakash/Registar settings DRuserManagement.feature","src/test/resources/prakash/Registrar settings Registrantusermanagement.feature","src/test/resources/prakash/Registrar settings Registrantofficers.feature","src/test/resources/prakash/Registrar settings Roles.feature","src/test/resources/prakash/Registrar settings Department.feature"}
		,
glue = {"Registrant","Registrar","hooks"},
dryRun = false,
plugin = {"pretty","html:target/cucu-report.html","json:target/cuc"}
//,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//"org.simplestudio.cucumber.XlsFormatter"}	
,monochrome = true
		,publish = true)

public class DNSrunner extends AbstractTestNGCucumberTests {
//	@SuppressWarnings("deprecation")
//	public static void main(String[] args) throws Throwable {
//        String[] arguments = {"-p", "html:C:\\Users\\VenkateshUdaru\\eclip\\UMSAPP\\target\\cuc-rep.html",
//        		"-g","Stepdef",
//        		"Feature\\ums.feature"};
//        cucumber.api.cli.Main.main(arguments);
//    }
			
}


//    public static void main(String[] args) throws Throwable 
//    {
//        Main.main(new String[]{"-g", "C:/work/workspaces/neon2_wks_new1/Cuketest4/src/com/cuke"
//, "C:/work/workspaces/neon2_wks_new1/Cuketest4/src/com/cuke/cukefeature.feature"});
//    }


