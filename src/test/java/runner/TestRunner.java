package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/login.feauture",
		glue = {"stepdefinition", "hooks"},
		plugin = {"pretty"},
		monochrome = true,
		dryRun = true
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
