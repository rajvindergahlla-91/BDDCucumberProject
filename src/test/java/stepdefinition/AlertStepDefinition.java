package stepdefinition;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.JavaScriptAlertPage;
import pageclasses.WelcomeToTheInternetPage;
import utils.WaitUtils;

public class JSAlertStepDefinition {
	WelcomeToTheInternetPage welcome;
	JavaScriptAlertPage js;

	/*
	 * @Given("user is on url {string}") public void user_is_on_url(String string)
	 * throws IOException { DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
	 * System.out.println("The desired url is opened"); }
	 */

	@When("user click on JavaScript Alerts link")
	public void user_click_on_java_script_alerts_link() {
		welcome = new WelcomeToTheInternetPage();
		welcome.clickJavaScriptAlerts();

	}

	@Then("user should land on JavaScript Alerts page")
	public void user_should_land_on_java_script_alerts_page() {
		js = new JavaScriptAlertPage();
		String head = js.getpageHeading();
		Assert.assertEquals(head, "JavaScript Alerts");
	}

	@When("user click on Click for JS Alert button")
	public void user_click_on_JS_Alert_button() {
		js = new JavaScriptAlertPage();
		js.clickOnJSAl();

	}

	@When("user click on ok")
	public void user_performs() {

		WaitUtils.alertIsPresent().accept();

	}

	@Then("result message should contain {string}")
	public void result_message_should_contain(String text) {
		js = new JavaScriptAlertPage();
		String result = js.getResult();
		Assert.assertTrue(result.contains(text));
	}

}
