package TeaApplicationTestPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import genricFunctions.webUtils;
import genricFunctions.webdriver;

public class HomePage {

	@BeforeMethod
	public static void launchapp(){
		System.out.println(webUtils.getValue("url"));
		webUtils.launchbrowser(webUtils.getValue("fbrowser"),webUtils.getValue("url"));
		System.out.println(webUtils.getValue("url"));
		
	}

	@Test
	public void tc1() {

		System.out.println("ïnsode method");

	}
}
