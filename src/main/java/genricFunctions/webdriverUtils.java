package genricFunctions;

import org.openqa.selenium.WebDriver.Options;

public class webdriverUtils extends webUtils {

	public static void closeDriver(){
		driver.close();
	}
	
	public static void quitDriver(){
		driver.quit();
	}
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void deleteCookiebyName(String cookieName) {
		driver.manage().deleteCookieNamed(cookieName);
	}
}
