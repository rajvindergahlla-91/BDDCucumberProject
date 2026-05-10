package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;


public class LoginPagePage {
	private By username = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.className("radius");
	private By loginHead=By.xpath("//h2[text()='Login Page']");

	public void enterUsername(String name) {
		UTActionsUtils.sendKeys(username, name);
	}

	public void enterPassword(String pswd) {
		UTActionsUtils.sendPswd(password, pswd);
	}

	public void clickLoginButton() {
		UTActionsUtils.click(loginButton, "Login Button");
	}
	public String getLoginHeading()
	{
		return UTActionsUtils.getText(loginHead, "Login page");
	}
}
