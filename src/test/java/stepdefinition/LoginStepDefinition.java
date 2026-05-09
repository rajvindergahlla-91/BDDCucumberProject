package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;
	WebDriverWait wait;

	@Given("Chrome browser is opened")
	public void chrome_browser_is_opened() {
		driver = new ChromeDriver();
		System.out.println("Chrome browser is launched successfully");
	}

	@Given("user is on url {string}")
	public void user_is_on_url(String string) {
		driver.navigate().to("https://the-internet.herokuapp.com/");
		System.out.println("The desired url is opened");
	}

	@When("user clicks on Form Authentication link")
	public void user_clicks_on_form_authentication_link() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Form Authentication']"))).click();
		System.out.println("User has clicked on form authentication");
	}

	@Then("user should land to Login page")
	public void user_should_land_to_login_page() {
		WebElement heading = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Login Page']")));
		String headText = heading.getText();
		Assert.assertEquals(headText, "Login Page");
		System.out.println("User has landed on login page successfully");

	}

	@When("user enters correct username {string}")
	public void user_enters_correct_username(String string) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("username"))).sendKeys("tomsmith");
		System.out.println("Username 'tomsmith' is entered");
	}

	@When("correct password {string}")
	public void correct_password(String string) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("SuperSecretPassword!");
		System.out.println("Password is entered successfully");
	}

	@When("enter Login button")
	public void enter_login_button() {
		wait.until(ExpectedConditions.elementToBeClickable(By.tagName("button"))).click();
		System.out.println("Login button is clicked successfully");
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		WebElement heading = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()=' Secure Area']")));
		String headText = heading.getText();
		Assert.assertEquals(headText, "Secure Area");
		System.out.println("User has login successfully");
		driver.quit();
	}
}
