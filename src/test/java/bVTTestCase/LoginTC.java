package bVTTestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ShoppingapplicationPages.HomePage;
import ShoppingapplicationPages.loginPage;
import genricFunctions.webUtils;

public class LoginTC extends webUtils {

	@BeforeTest
	public static void lunchbrowser() {
		webUtils.launchbrowser("CH", "http://automationpractice.com/index.php");

	}

	@Test
	public static void m1() {

		HomePage Hmpage = PageFactory.initElements(driver, HomePage.class);
		loginPage lgnpage = Hmpage.fn_signIn();
		lgnpage.fn_LoginUser();
	}

}
