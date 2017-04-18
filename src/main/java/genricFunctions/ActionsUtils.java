package genricFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtils extends webUtils {
	static Actions actnObj = new Actions(driver);

	public static void clickOnWebElement(WebElement we) {
		actnObj.click(we);
	}

	public static void contextClick(WebElement we) {
		actnObj.contextClick(we);
	}

	public static void doubleClick(WebElement we) {
		actnObj.doubleClick(we);
	}

	public static void dragdrop(WebElement src, WebElement dest) {
		actnObj.dragAndDrop(src, dest).build().perform();
	}
	public static void clickAndHold(WebElement we){
		actnObj.clickAndHold(we);
	}
}
