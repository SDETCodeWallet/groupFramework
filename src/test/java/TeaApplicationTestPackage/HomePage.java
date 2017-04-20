package TeaApplicationTestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import genricFunctions.webUtils;

public class HomePage {

	@Parameters("browser")
	@BeforeMethod
	public static void launchapp(String browser) {
		webUtils.launchbrowser(browser,webUtils.getValue("url"));
		
		
	}

	@Test
	public void tc1() {

		System.out.println("ïnsode method");

	}
}
