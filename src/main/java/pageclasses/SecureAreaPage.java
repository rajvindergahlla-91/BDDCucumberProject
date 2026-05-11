package pageclasses;

import org.openqa.selenium.By;

import utils.UTActionsUtils;

public class SecureAreaPage {

	private By header = By.tagName("h2");

	public String getSuccessMsg(String nameOfTheElement) {
		return UTActionsUtils.getText(header,nameOfTheElement);
	}
}
