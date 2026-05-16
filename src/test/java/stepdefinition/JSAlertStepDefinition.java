package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.WelcomeToTheInternetPage;

public class JSAlertStepDefinition {
	WelcomeToTheInternetPage welcome;
	
	@When("user clicks on JavaScript Alerts link")
	public void user_clicks_on_java_script_alerts_link() {
		welcome = new  WelcomeToTheInternetPage();
		welcome.clickJavaScriptAlerts();
	   
	}
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user handles the alert with {string}")
	public void user_handles_the_alert_with(String alertType) {
	    
	}
	@Then("{string} is displayed")
	public void is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
