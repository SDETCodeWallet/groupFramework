package ShoppingapplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricFunctions.webUtils;

public class HomePage {

	@FindBy(xpath = "//a[@title='Contact Us']")
	private WebElement contactus;

	@FindBy(xpath = ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	private static WebElement userSignBtn;
	
	@FindBy(xpath = ".//*[@id='email_create']")
	private static WebElement newUserMail;

	public static WebDriver driver;

	public static void fn_AllLinks() {

	}

	public static loginPage fn_signIn() {
		webUtils.clickOnElement(userSignBtn);
		loginPage sgnIn_lgInpage = PageFactory.initElements(driver, loginPage.class);
		return sgnIn_lgInpage;

	}
	
	public static loginPage fn_singup(){
		webUtils.clickOnElement(userSignBtn);
		loginPage sgnIn_lgInpage = PageFactory.initElements(driver, loginPage.class);
		return sgnIn_lgInpage;
	}
}
