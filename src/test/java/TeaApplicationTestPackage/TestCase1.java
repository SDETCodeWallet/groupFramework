package TeaApplicationTestPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GreenTeaAplication.CheckOut;
import GreenTeaAplication.HomePage;
import GreenTeaAplication.LetsTalkTea;
import GreenTeaAplication.Menu;
import GreenTeaAplication.OurPassion;
import genricFunctions.webUtils;
import genricFunctions.webdriverUtils;

public class TestCase1 extends webUtils {
	HomePage hm;

	@Parameters("browser")
	@BeforeMethod
	public void launchapp(@Optional String browser) {
		webUtils.launchbrowser(webUtils.getValue("cbrowser"), webUtils.getValue("url"));
		hm = PageFactory.initElements(driver, HomePage.class);
		webUtils.verifyTitle("Welcome");
	}

	@Test(enabled = false)
	public void tc1() {
		hm.checkAllLinks();
	}

	@Test(enabled = false)
	public void tc2() {
		hm.getURLOfAllLinks();
	}

	@Test(enabled = true)
	public void tc3() {
		CheckOut chkOut = HomePage.fn_NavigateToCheckoutPage();
		chkOut.userEmail("testmail@gmail.com");
		chkOut.userName("test");
		chkOut.userAdd("testaddress");
		chkOut.cardType(1);
		chkOut.cardNumber(123456789);
		chkOut.cardHolderName("testCardName");
		chkOut.verificationCode("testcode");
		chkOut.placeOrderButton();
		webUtils.verifyTitle("Menu");

	}

	@Test
	public void tc4() {
		LetsTalkTea page = HomePage.fn_NavigateToLetsTalkPage();
	}

	@Test
	public void tc5() {
		Menu page = hm.fn_NavigateToMenuPage();
	}

	@Test
	public void tc6() {
		OurPassion Page = hm.fn_NavigateToOurPassion();
	}

	 @AfterMethod
	 public void closeApp(){
	 webdriverUtils.closeDriver();
	
	 }
}
