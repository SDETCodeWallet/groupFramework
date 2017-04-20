package GreenTeaAplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import genricFunctions.webUtils;

public class CheckOut {

	@FindBy(css = "input#email")
	private WebElement userEmail;

	@FindBy(css = "input#name")
	private WebElement userName;

	@FindBy(css = "textarea#address")
	private WebElement userAddress;

	@FindBy(css = "select#card_type")
	private WebElement paymentCardType;

	@FindBy(css = "input#card_number")
	private WebElement userCardNumber;

	@FindBy(css = "input#cardholder_name")
	private WebElement cardHolderName;

	@FindBy(css = "input#verification_code")
	private WebElement verificationCode;

	@FindBy(css = "a.btn")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[contains(@class, 'btn btn-primary')]")
	private WebElement placeOrderButton;

	public void userEmail(String Email) {
		webUtils.inputValue(userEmail, Email);
	}

	public void userName(String uName) {
		webUtils.inputValue(userName, uName);
	}

	public void userAdd(String adds) {
		webUtils.inputValue(userAddress, adds);
	}

	public void cardType(int indexnum) {
		webUtils.selectByIndex(paymentCardType, indexnum);
	}

	public void cardNumber(int cardNumber) {
		webUtils.inputnumericvalue(userCardNumber, cardNumber);
	}

	public void cardHolderName(String cardName) {
		webUtils.inputValue(cardHolderName, cardName);
	}

	public void verificationCode(String verifCode) {
		webUtils.inputValue(verificationCode, verifCode);
	}

	public void cancelButton() {
		webUtils.clickOnWebelement(cancelButton);
	}

	public void placeOrderButton() {
		webUtils.clickOnWebelement(placeOrderButton);
	}
}
