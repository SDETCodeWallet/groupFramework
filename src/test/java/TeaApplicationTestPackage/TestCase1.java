package TeaApplicationTestPackage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import GreenTeaAplication.HomePage;
import genricFunctions.webUtils;
import genricFunctions.webdriverUtils;

public class TestCase1 extends webUtils{
	 HomePage hm;

	@Parameters("browser")
	@BeforeMethod
	public  void launchapp(@Optional String browser) {
		webUtils.launchbrowser(webUtils.getValue("cbrowser"), webUtils.getValue("url"));
	    hm=PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void tc1() {
		hm.checkAllLinks();
	}
	
	@Test
	public void tc2(){
		hm.getURLOfAllLinks();
	}
	
	@AfterMethod
	public void closeApp(){
		webdriverUtils.closeDriver();
		
	}
}
