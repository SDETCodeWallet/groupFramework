package GreenTeaAplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genricFunctions.webUtils;

public class CheckOut {

	@FindBy(css = "css=input#email")
	private WebElement userEmail;

	@FindBy(css = "css=input#name")
	private WebElement userName;

	@FindBy(css = "css=textarea#address")
	private WebElement userAddress;

	@FindBy(css = "css=select#card_type")
	private WebElement paymentCardType;

	@FindBy(css = "css=input#card_number")
	private WebElement userCardNumber;

	@FindBy(css = "css=input#cardholder_name")
	private WebElement cardHolderName;

	@FindBy(css = "css=input#verification_code")
	private WebElement verificationCode;

	@FindBy(css = "css=a.btn")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[contains(@class, 'btn btn-primary')]")
	private WebElement placeOrderButton;

	public void userEmail(String Email) {
		webUtils.inputValue(userEmail, Email);
	}

	public void userName(String uName) {
		webUtils.inputValue(userEmail, uName);
	}

	public void userAdd(String adds) {
		webUtils.inputValue(userEmail, adds);
	}

	public void cardType(String adds) {
		webUtils.selectByIndex(paymentCardType, 1);
	}

	public void cardNumber(String cardNumber) {
		webUtils.inputValue(userCardNumber, cardNumber);
	}

	public void cardHolderName(String cardName) {
		webUtils.inputValue(cardHolderName, cardName);
	}

	public void verificationCode(String verifCode) {
		webUtils.inputValue(verificationCode, verifCode);
	}

}
