package Runner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Runner File
@CucumberOptions(features = "src/test/java/Features", glue = { "StepDefinations", "Hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
		"rerun:target/cucumber-reports/rerun.txt" }, tags = { "@test" }

)
@Listeners({ ExtentITestListenerClassAdapter.class })
public class Test_RunnerFile extends AbstractTestNGCucumberTests {

}
