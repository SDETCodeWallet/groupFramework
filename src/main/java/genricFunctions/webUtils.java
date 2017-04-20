package genricFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webUtils {

	public static WebDriver driver;

	/* browser methods */
	public static WebDriver launchbrowser(String Browsername, String url) {
		if (Browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver", "Drivers/geckodriverfirefox.exe");
			WebDriver driver = new FirefoxDriver();
		} else if (Browsername.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equalsIgnoreCase("iE")) {
			System.setProperty("webdriver.ie.driver", "Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (Browsername.equalsIgnoreCase("ed")) {
			System.setProperty("webdriver.edge.driver", "Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();

		}

		driver.get(url);
		return driver;

	}

	public static WebDriver launchbrowserforgrid(String Gridbrowsername, Platform pl, String browsername) {

		System.setProperty("webdriver.gecko.driver",
				"C:////Users////Deepak////workspace////Training_PoaDevEnv////Software////geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName(Gridbrowsername);
		cap.setPlatform(pl);
		driver = new FirefoxDriver(cap);
		driver.get(browsername);
		return driver;

	}

	public static void clearCookies(WebDriver driver) throws InterruptedException {
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
	}

	public static void clickOnWebelement(WebElement we) {
		we.click();
	}

	/* send keys */
	public static void inputValue(WebElement inputelement, String userinput) {
		inputelement.sendKeys(userinput);
	}

	public static void inputnumericvalue(WebElement inputelement, int userinput) {
		String stringvalue = Integer.toString(userinput);
		inputelement.sendKeys(stringvalue);
	}

	public static void refreshByKey(WebElement we) {
		we.sendKeys(Keys.F5);
	}

	public static void clickOnElement(WebElement ClickBtn) {
		ClickBtn.click();
	}

	public static void verifyTitle(String actual, String expectedtitle) {
		Assert.assertEquals(actual, expectedtitle);
	}

	public static void getText(WebElement we) {
		String text = we.getText();
		System.out.println(text);
	}

	public static void checkAllLinks(List<WebElement> alllinkscollection) {

		int totallinks = alllinkscollection.size();
		System.out.println(totallinks);

		for (int i = 0; i <= totallinks - 1; i++) {
			WebElement perlink = alllinkscollection.get(i);
			String linkname = perlink.getText();
			System.out.println(linkname);
			perlink.click();
			int totallinks1 = alllinkscollection.size();

		}
	}

	public static void clickonradiobutton(WebElement we) {
		boolean value = we.isEnabled();
		if (value == true) {
			we.click();
		}
	}

	public static void tkeScrnshot(String savefileloc) {
		File sht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File path = new File(savefileloc + ".png");
		try {
			FileUtils.copyFile(sht, path);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/* Alert Methods */
	public static String txtAlert() {
		Alert txt = driver.switchTo().alert();
		String txtvalue = txt.getText();
		return txtvalue;
	}

	public static void acceptAlert() {
		Alert actlrt = driver.switchTo().alert();
		actlrt.accept();
	}

	public static void dsmssAlert() {
		Alert dsmmss = driver.switchTo().alert();
		dsmmss.dismiss();
	}

	public static void alertInput(String inputvalue) {
		Alert input = driver.switchTo().alert();
		input.sendKeys(inputvalue);
	}

	/* Wait Methods */
	public static void explictWait(int timedur, By locator) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, timedur);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

	public static void threadSlp(int timedur) throws InterruptedException {
		Thread.sleep(timedur);
	}

	public static void implWait(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	/* frame methods */
	public static void switchFrameId(int i) {
		try {
			driver.switchTo().frame(i);
		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void switchFrameString(String St1) {
		try {
			driver.switchTo().frame(St1);
		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void switchFrameString(WebElement we) {
		try {
			driver.switchTo().frame(we);

		} catch (Exception IO) {
			System.out.println(IO);
		}
	}

	public static void windowHandle(String expectedtitle, String xpath) {

		String mainwin = driver.getWindowHandle();
		Set<String> hndles = driver.getWindowHandles();
		Iterator<String> itr = hndles.iterator();
		while (itr.hasNext() == true) {
			String win = itr.next();
			driver.switchTo().window(win);
			String title = driver.getTitle();

			if (title.equalsIgnoreCase(expectedtitle)) {
				driver.switchTo().window(win);
				driver.findElement(By.xpath(xpath)).click();
				;

			}

			driver.switchTo().window(mainwin);
		}

	}

	/* navigation methods */
	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static void navigateUrl(String St1) {
		driver.navigate().to(St1);
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static String getValue(String propertyValue) {
		String St1 = null;
		File fPath = new File("src//main//resources//testData//Teadatafile.properties");

		FileInputStream fileinputstream = null;

		try {
			fileinputstream = new FileInputStream(fPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fileinputstream);
			St1 = prop.getProperty(propertyValue);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return St1;

	}

}
