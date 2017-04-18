package genricFunctions;

import org.openqa.selenium.WebDriver.Options;

public class webdriver extends webUtils {

	



	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void deleteCookiebyName(String cookieName) {
		driver.manage().deleteCookieNamed(cookieName);
	}
}
