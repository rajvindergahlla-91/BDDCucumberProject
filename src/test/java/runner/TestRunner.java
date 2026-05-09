package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/login.feature", glue = { "stepdefinition",
		"hooks" }, plugin = { "pretty", "html:target/cucumber-reports.html" },
		 monochrome = true,
		dryRun = false, publish = true

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
