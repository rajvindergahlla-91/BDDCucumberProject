package pageclasses;

import org.openqa.selenium.By;

import manger.ExtentTestManager;
import utils.UTActionsUtils;

public class WelcomeToTheInternetPage {

	private By formAuth = By.xpath("//a[text()='Form Authentication']");
	private By heading = By.className("heading");
	private By dragDrop = By.xpath("//a[text()='Drag and Drop']");
	private By contextMenu = By.xpath("//a[text()='Context Menu']");
	private By javaScript = By.xpath("//a[text()='JavaScript Alerts']");
	private By dropdown= By.xpath("//a[text()='Dropdown']");

	public void clickFormAuthentication() {

		UTActionsUtils.click(formAuth, "Form Authentication");

	}

	public String getFormAuthPageTitle(String nameOfTheElement) {

		String titleText = UTActionsUtils.getText(heading, nameOfTheElement);
		ExtentTestManager.log.info("Title text is :" + titleText);
		return titleText;
	}

	public void clickDragAndDrop() {
		UTActionsUtils.click(dragDrop, "Drag and Drop");

	}

	public void clickContextMenu() {
		UTActionsUtils.click(contextMenu, "context menu");

	}

	public void clickJavaScriptAlerts() {
		UTActionsUtils.click(javaScript, "javaScript Alerts");

	}
	public void clickDropDown()
	{
		UTActionsUtils.click(dropdown, "dropdown");
	}
}
