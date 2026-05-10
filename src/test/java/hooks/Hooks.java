package hooks;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import manger.DriverManager;
import manger.ExtentManager;
import manger.ExtentTestManager;
import utils.BaseUtils;
import utils.WaitUtils;

public class Hooks {
	@BeforeAll
	public static void initialise() throws IOException {
		ExtentManager.initReport();
	}

	@Before
	public void preReqBaseTest(Scenario scenario) throws NumberFormatException, IOException {
		ExtentTestManager.createTest(scenario.getName());
		DriverManager.initDriver();
		WaitUtils.initWait();
	}

	@After
	public void packUptest(Scenario scenario) throws IOException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		if (scenario.getStatus().equals(Status.PASSED)) {
			ExtentTestManager.log.pass("Test passed");
			
		} else if (scenario.isFailed()) {
			Field delegate= scenario.getClass().getDeclaredField("delegate");
			delegate.setAccessible(true);
			Object testCaseState= delegate.get(scenario);
			
			Field errorField = testCaseState.getClass().getDeclaredField("error");
			errorField.setAccessible(true);
			Throwable error = (Throwable) errorField.get(testCaseState);
			
			ExtentTestManager.log.fail(error.getMessage(), MediaEntityBuilder
					.createScreenCaptureFromPath(BaseUtils.getScreenShotPath(DriverManager.getDriver(),
							scenario.getClass().getName() + "." + scenario.getName()))
					.build());
		} else if (scenario.getStatus().equals(Status.SKIPPED)) {
			ExtentTestManager.log.skip("Test Skipped");
		}
		DriverManager.quitDriver();

	}

	@AfterAll
	public static void tearDown() {
		ExtentManager.flushReport();
	}
}
