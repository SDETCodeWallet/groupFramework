package genricFunctions;

import java.io.File;
import java.net.URL;

import javax.management.DescriptorRead;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class webdriverUtils extends webUtils {

	public static void closeDriver() {
		driver.close();
	}

	public static void quitDriver() {
		driver.quit();
	}

	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	public static void deleteCookiebyName(String cookieName) {
		driver.manage().deleteCookieNamed(cookieName);
	}

	public static void remoteWebDriver(String browserName, String ExePath, String remoteMachineUrl, String appUrl) {
		DesiredCapabilities capObj = null;
		WebDriver remoteWebDriver = null;
		if (browserName.equalsIgnoreCase("ff")) {
			try {
				capObj = DesiredCapabilities.firefox();
				capObj.setCapability(FirefoxDriver.BINARY, new File(ExePath).getAbsolutePath());
				remoteWebDriver = new RemoteWebDriver(new URL(remoteMachineUrl), capObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (browserName.equalsIgnoreCase("ch")) {
			try {
				ChromeOptions chrmOptn = new ChromeOptions();
				chrmOptn.setBinary(new File(ExePath));
				capObj = DesiredCapabilities.chrome();
				capObj.setCapability(ChromeOptions.CAPABILITY, chrmOptn);
				remoteWebDriver = new RemoteWebDriver(new URL(remoteMachineUrl), capObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.get(appUrl);
	}
}
