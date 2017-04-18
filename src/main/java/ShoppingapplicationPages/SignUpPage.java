package ShoppingapplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

	@FindBy(xpath = ".//*[@id='id_gender1']")
	private static WebElement titleMr;

	@FindBy(xpath = ".//*[@id='id_gender2']")
	private static WebElement titleMrs;

	@FindBy(xpath = ".//*[@id='customer_firstname']")
	private static WebElement newUserFirstName;

	@FindBy(xpath = ".//*[@id='customer_lastname']")
	private static WebElement newUserLastName;

	@FindBy(xpath = ".//*[@id='email']")
	private static WebElement signupEmail;

	@FindBy(xpath = ".//*[@id='passwd']")
	private static WebElement newUserPassword;

	@FindBy(xpath = ".//*[@id='days']")
	private static WebElement DOBDate;

	@FindBy(xpath = ".//*[@id='months']")
	private static WebElement DOBMonth;

	@FindBy(xpath = ".//*[@id='years']")
	private static WebElement DOBYear;

	@FindBy(xpath = ".//*[@id='newsletter']")
	private static WebElement newsLtrChckbox;

	@FindBy(xpath = ".//*[@id='optin']")
	private static WebElement specialOfferChckBox;

	@FindBy(xpath = ".//*[@id='firstname']")
	private static WebElement newUserFrstName;

	@FindBy(xpath = ".//*[@id='lastname']")
	private static WebElement newUserLstName;

	@FindBy(xpath = ".//*[@id='company']")
	private static WebElement newUserCompnyName;

	@FindBy(xpath = ".//*[@id='address1']")
	private static WebElement newUseraddress1;

	@FindBy(xpath = ".//*[@id='address2']")
	private static WebElement newUseraddress2;

	@FindBy(xpath = ".//*[@id='city']")
	private static WebElement newUserCity;

	@FindBy(xpath = ".//*[@id='id_state']")
	private static WebElement newUserState;

	@FindBy(xpath = ".//*[@id='postcode']")
	private static WebElement newUserZipCode;

	@FindBy(xpath = ".//*[@id='id_country']")
	private static WebElement newUserCountry;

	@FindBy(xpath = ".//*[@id='other']")
	private static WebElement newUserOtherInfo;

	@FindBy(xpath = ".//*[@id='phone']")
	private static WebElement newUserHomeNum;

	@FindBy(xpath = ".//*[@id='phone_mobile']")
	private static WebElement newUserPhoneNumber;

	@FindBy(xpath = ".//*[@id='alias']")
	private static WebElement newUserFutureReferenceAddress;

	@FindBy(xpath = ".//*[@id='newsletter-input']")
	private static WebElement newUserRegisterBtn;

}
