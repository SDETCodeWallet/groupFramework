package ShoppingapplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genricFunctions.webUtils;

public class loginPage extends webUtils{
	
	@FindBy(xpath="//input[@id='email_create']")
	private static WebElement newusermail;

	@FindBy(xpath = ".//*[@id='SubmitCreate']")
	private static WebElement createNewUserBtn;

	@FindBy(xpath = ".//*[@id='email']")
	private static WebElement loginEmail;

	@FindBy(xpath = ".//*[@id='passwd']")
	private static WebElement userPassword;

	@FindBy(xpath = ".//*[@id='login_form']/div/p[1]/a")
	private static WebElement forgetUserLink;

	@FindBy(xpath = ".//*[@id='SubmitLogin']")
	private static WebElement lognBtn;

	public static void fn_LoginUser() {
		System.out.println("inside login  func");
      webUtils.inputValue(loginEmail, "test@gmail.comtest");
      webUtils.inputValue(userPassword, "123456789");
      webUtils.clickOnWebelement(lognBtn);
	}
	
	public static SignUpPage fn_signup(){
		webUtils.inputValue(newusermail, "testtng@gmail.com");
		webUtils.clickOnWebelement(createNewUserBtn);
		SignUpPage sgnup=PageFactory.initElements(driver, SignUpPage.class);
		return sgnup;
	}

}
