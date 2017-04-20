package GreenTeaAplication;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricFunctions.webUtils;

public class HomePage extends webUtils {
	@FindBy(xpath = "//a")
	private static List<WebElement> homePageAllLinks;
	
	@FindBy(xpath = "//a[@data-url='our-passion.html']")
	private static WebElement passion;

	@FindBy(xpath = "//a[@data-url='menu.html']")
	private static WebElement menu;

	@FindBy(xpath = "//a[@data-url='let-s-talk-tea.html']")
	private static WebElement letsTalkTea;

	@FindBy(xpath = "//a[@data-url='check-out.html']")
	private static WebElement checkOut;

	
	public static void checkAllLinks() {
		webUtils.getTextOfAllLinks(homePageAllLinks);
	}

	public static void getURLOfAllLinks() {
		webUtils.getUrlOfAllLinks(homePageAllLinks);
	}

	public static void fn_WelcomePage() {
		verifyTitle("Welcome");
	}

	public static OurPassion fn_NavigateToOurPassion() {
		webUtils.clickOnWebelement(passion);
		verifyTitle("Our Passion");
		OurPassion passionPage = PageFactory.initElements(driver, OurPassion.class);
		return passionPage;
	}

	public static Menu fn_NavigateToMenuPage() {
		clickOnWebelement(menu);
		verifyTitle("Menu");
		Menu Page = PageFactory.initElements(driver, Menu.class);
		return Page;
	}

	public static LetsTalkTea fn_NavigateToLetsTalkPage() {
		clickOnWebelement(letsTalkTea);
		verifyTitle("Let's Talk Tea");
		LetsTalkTea page = PageFactory.initElements(driver, LetsTalkTea.class);
		return page;
	}

	public static CheckOut fn_NavigateToCheckoutPage() {
		webUtils.clickOnWebelement(checkOut);
		webUtils.verifyTitle("Check Out");
		CheckOut chckOut = PageFactory.initElements(driver, CheckOut.class);
		return chckOut;
	}
}
