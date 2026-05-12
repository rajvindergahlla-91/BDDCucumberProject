package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/login.feature", 
                  glue = {"stepdefinition", "hooks"},
		          plugin = { "pretty", "html:target/cucumber-reports.html" },
		          dryRun = false,
				  publish = true,
				  monochrome= false

)

public class LoginRunner extends AbstractTestNGCucumberTests {

}
