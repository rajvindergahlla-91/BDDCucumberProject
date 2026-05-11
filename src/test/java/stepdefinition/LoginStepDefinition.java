package stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manger.DriverManager;
import pageclasses.LoginPagePage;
import pageclasses.SecureAreaPage;
import pageclasses.WelcomeToTheInternetPage;
import utils.BaseUtils;

public class LoginStepDefinition {
	WelcomeToTheInternetPage welcome;
	LoginPagePage login;
	SecureAreaPage msg;

	@Given("user is on url {string}")
	public void user_is_on_url(String string) throws IOException {
		DriverManager.goToUrl(BaseUtils.getConfigValue("url"));
		System.out.println("The desired url is opened");
	}

	@When("user clicks on Form Authentication link")
	public void user_clicks_on_form_authentication_link() {
		welcome = new WelcomeToTheInternetPage();
		welcome.clickFormAuthentication();
		System.out.println("User has clicked on form authentication");

	}

	@Then("user should land to Login page")
	public void user_should_land_to_login_page() {
		login = new LoginPagePage();
		String headText = login.getLoginHeading();
		Assert.assertEquals(headText, "Login Page");
		System.out.println("User has landed on login page successfully");

	}

	@When("user enters username {string}")
	public void user_enters_correct_username(String username) {
		login = new LoginPagePage();
		login.enterUsername(username);
		System.out.println("Username entered");
	}

	@When("user enters password {string}")
	public void correct_password(String string) {
		login = new LoginPagePage();
		login.enterPassword(string);
		System.out.println("Password is entered ");
	}

	@When("enter Login button")
	public void enter_login_button() {
		login = new LoginPagePage();
		login.clickLoginButton();
		System.out.println("Login button is clicked successfully");
	}

	@Then("user should see {string}")
	public void user_should_see(String result) {

		switch (result.toLowerCase()) {

		case "success":

			break;

		case "error":

			break;

		case "username required":

			break;

		case "password required":

			break;
		}
	}
}
