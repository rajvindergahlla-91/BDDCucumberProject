package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;
import utils.WaitUtils;

public class JavaScriptAlertPage {
	private By JsAlert = By.xpath("//button[text()='Click for JS Alert']");
	private By JsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	private By JsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
	private By jsResult = By.id("result");
	private By pageHead = By.tagName("h3");

	

	public void clickOnClickForJsAlert() {
		UTActionsUtils.click(JsAlert, "JS Alert");
	    WaitUtils.alertIsPresent().accept();
	}

	
	public void clickOnClickForJsConfirm() {
		UTActionsUtils.click(JsConfirm," JS Confirm Alert");
		WaitUtils.alertIsPresent().dismiss();
	}

	public void clickOnClickForJsPrompt(String name) {
		UTActionsUtils.click(JsPrompt, "JS Prompt Alert");
		WaitUtils.alertIsPresent().sendKeys(name);
		WaitUtils.alertIsPresent().accept();

	}
	public String getTextOfJsAlert() {
		 UTActionsUtils.click(JsAlert, " JS Alert Text");
		    String text = WaitUtils.alertIsPresent().getText();
		    WaitUtils.alertIsPresent().accept();  //  MUST CLOSE ALERT
		    return text;
	    
	}
	public String getTextOfJsConfirm()
	{
		UTActionsUtils.click(JsConfirm," JS Confirm Alert Text");
		String text1=WaitUtils.alertIsPresent().getText();
		WaitUtils.alertIsPresent().accept();
		return text1;
	}
	public String getTextOfJsPrompt()
	{
		UTActionsUtils.click(JsPrompt,"JS Prompt Alert Text");
		String text2=WaitUtils.alertIsPresent().getText();
		WaitUtils.alertIsPresent().accept();
		return text2;
	}
	
	public String getResultTextForJsAlert()
	{
		UTActionsUtils.click(JsAlert, "JS Alert Result");
	    WaitUtils.alertIsPresent().accept();
	  return  WaitUtils.visibilityOfElementLocated(jsResult).getText();
	}
	public String getResultTextforJsConfirm()
	{
		UTActionsUtils.click(JsConfirm," JS Confirm Alert Result");
		WaitUtils.alertIsPresent().dismiss();
		return WaitUtils.visibilityOfElementLocated(jsResult).getText();
		
	}
	public String getResultTextforJsPrompt(String name)
	{
		UTActionsUtils.click(JsPrompt,"JS Prompt Alert Result");
	    WaitUtils.alertIsPresent().sendKeys(name);
	    WaitUtils.alertIsPresent().accept();
		return WaitUtils.visibilityOfElementLocated(jsResult).getText();
		
	}
	public String getpageHeading()
	{
		return UTActionsUtils.getText(pageHead, "Page haeding");
	}
	
	public String getResult()
	{
		return UTActionsUtils.getText(jsResult,"Result");
	}
	public void clickForJSPrompt()
	{
		UTActionsUtils.click(JsPrompt, "JSPrompt");
	}
	public void clickOnJSAl()
	{
		UTActionsUtils.click(JsAlert, "JS alert");
	}
}
