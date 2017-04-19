package GreenTeaAplication;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricFunctions.webUtils;

public class HomePage extends webUtils {

	@FindBy(xpath = "//a")
	private static List<WebElement> homePageAllLinks;

	public static void checkAllLinks() {
		webUtils.getTextOfAllLinks(homePageAllLinks);
	}

	public static void getURLOfAllLinks() {
		webUtils.getUrlOfAllLinks(homePageAllLinks);
	}

	public static void fn_WelcomePage() {

	}

	public static void fn_NavigateToOurPassion() {

	}

	public static void fn_NavigateToMenuPage() {

	}

	public static void fn_NavigateToLetsTalkPage() {

	}

	public static CheckOut fn_NavigateToCheckoutPage() {

		CheckOut chckOut=PageFactory.initElements(driver, CheckOut.class);
		return chckOut;
	}
}
