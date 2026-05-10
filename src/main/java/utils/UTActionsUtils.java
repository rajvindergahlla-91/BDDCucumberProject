package utils;

import org.openqa.selenium.By;

import manger.ExtentTestManager;

public class UTActionsUtils {
	public static String getText(By locator, String nameOfTheElement) {
		String uiText= WaitUtils.visibilityOfElementLocated(locator).getText();
		ExtentTestManager.log.info("UI text " + nameOfTheElement + "Text :"+ uiText);
		return uiText;
	}

	public static void sendKeys(By locator, String text) {
		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
		ExtentTestManager.log.info("Entered text is :" + text);
	}

	public static void sendPswd(By locator, String text) {
		WaitUtils.visibilityOfElementLocated(locator).sendKeys(text);
		ExtentTestManager.log.info("Entered password is :" + "*******");
	}
	public static void click(By locator, String text) {
		JSUtils.jsClick(WaitUtils.elementToBeClicakable(locator));
		ExtentTestManager.log.info("click on " + text);
	}
}
