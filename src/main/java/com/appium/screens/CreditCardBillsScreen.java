package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class CreditCardBillsScreen extends BaseScreen {
	private static final String ACCOUNTS_XPATH = "//XCUIElementTypeStaticText[@name=\"Available balance\"]//" +
			"following-sibling::XCUIElementTypeStaticText[1] | " +
			"//android.widget.TextView[@resource-id='ae.ahb.digital.dev:id/tv_account_number']\n";

	// ------------------PAGE FACTORY--------------------------//

	CommonUtils utils = new CommonUtils();
	TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
	TouchAction touch = new TouchAction(appDriver);
	SoftAssert softAssert = new SoftAssert();

	public CreditCardBillsScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	public String selectedAccountNo = "";
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit card']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Credit card']")
	public MobileElement creditCardPaymentTab;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Scan a UAE credit card']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Scan a UAE credit card']")
	public MobileElement scanACard;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Enter your card details']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Enter your card details']")
	public MobileElement enterCardDetailsManually;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Add card']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Add card']")
	public MobileElement addCardButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement doneButtonOnSuccessScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter your credit card number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter your credit card number']")
	public MobileElement creditCardNumber;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Paying credit card bills?']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Paying credit card bills?']")
	public MobileElement payingCreditCardBillsMessage;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter the name printed on the card']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Enter the name printed on the card'']")
	public MobileElement cardHolderName;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit card number']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Credit card number']")
	public MobileElement ccNumberCreditCardDetailsScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cardholder name']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Cardholder name']")
	public MobileElement cardHoldernameCreditCardDetailsScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cardholder name']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Cardholder name']")
	public MobileElement bankNameCreditCardDetailsScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Credit card not found']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name='Credit card not found']")
	public MobileElement creditCardNotFoundErrorMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please use letters only']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please use letters only']")
	public MobileElement useOnlyLettersInlineMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please use letters only']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please use letters only']")
	public MobileElement lengthErrorMessageCCNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='For bill payment of CC']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='For bill payment of CC']")
	public MobileElement remarksForCCPayment;

	@AndroidFindBy(className = "android.widget.Button")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton")
	public MobileElement nextButton;

	@AndroidFindBy(className = "android.widget.CheckBox")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='icChoicesActiveCheckOff']")
	public MobileElement saveCreditCardCheckBox;

    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Al Hilal credit cards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Al Hilal credit cards']")
	public MobileElement alhilalCreditCardsSection;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='UAE credit cards']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='UAE credit cards']")
	public MobileElement uaeCreditCardsSection;

	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Add another UAE credit card']")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add another UAE credit card']")
	public MobileElement addAnotherCreditCard;

	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Al Hilal credit cards\"]//parent::" +
			"XCUIElementTypeCell" +
			"//following-sibling::XCUIElementTypeCell[2]//child::XCUIElementTypeStaticText[contains" +
			"(@name,\" **** **** \")])[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='Al Hilal credit cards']//following-sibling::" +
			"androidx.recyclerview.widget.RecyclerView//child::androidx.cardview.widget.CardView)[1]")
	public MobileElement firstDigitalCard;

	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"UAE credit cards\"]//parent::XCUIElementTypeCell" +
			"//following-sibling::XCUIElementTypeCell[2]//child::XCUIElementTypeStaticText" +
			"[contains(@name,\" **** **** \")])[1]")
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='UAE credit cards']//following-sibling::" +
			"android.widget.LinearLayout//child::androidx.cardview.widget.CardView)[1]")
	public MobileElement firstLegacyCard;

	@AndroidFindBy(className = "android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	public MobileElement amountTextField;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Done\"]")
	public MobileElement done;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'more account')]")
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'more account')]")
	public MobileElement moreAccountLink;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"My accounts\"]")
	@AndroidFindBy(xpath = "//*[@text=\"My accounts\"]")
	public MobileElement myAccountsHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Payment amount\"]")
	@AndroidFindBy(xpath = "//*[@text=\"Payment amount\"]")
	public MobileElement paymentScreeHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Pay a bill\"]")
	@AndroidFindBy(xpath = "//*[@text=\"Pay a bill\"]")
	public MobileElement payBillScreeHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Review details\"]")
	@AndroidFindBy(xpath = "//*[@text=\"Review details\"]")
	public MobileElement reviewScreeHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Payment details\"]")
	@AndroidFindBy(xpath = "//*[@text=\"Payment details\"]")
	public MobileElement paymentDetailsScreeHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	@iOSXCUITFindBy(xpath = "//android.widget.ImageButton[contains(@content-desc, 'Navigate up')]")
	public MobileElement backButton;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Available balance\"]" +
			"//preceding-sibling::XCUIElementTypeStaticText[1]")
	@AndroidFindBy(id = "ae.ahb.digital.dev:id/tv_account_number")
	public MobileElement selectedAccount;

	@iOSXCUITFindBy(xpath = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insufficient balance']")
	public MobileElement inSufficientBalanceError;

	@iOSXCUITFindBy(xpath = "")
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='ae.ahb.digital.dev:id/tv_available_balance']")
	public MobileElement availableBalance;

	public void validateCreditCardBillTab() {
		Assert.assertTrue(creditCardPaymentTab.isDisplayed(),"Credit card payment tab is not present");
	}

	public void clickCCPaymentTab() {
		utils.validateAndClick(creditCardPaymentTab);
	}


	public void validateCCBillPaymentHomeScreen() {
		try {
			softAssert.assertFalse(enterCardDetailsManually.isDisplayed(),
					"Enter card details button is not present");
			softAssert.assertFalse(payingCreditCardBillsMessage.isDisplayed(),
					"Pay credit card bill message is not present");
			softAssert.assertAll();
		}
		catch (NoSuchElementException e) {
			softAssert.assertTrue(true);
		}
	}

	public void clickEnterCCDetails() {
		utils.validateAndClick(enterCardDetailsManually);
	}

	public void validateCCEntryScreen() {
		softAssert.assertTrue(creditCardNumber.isDisplayed(),"Credit card payment tab is not present");
		softAssert.assertTrue(addCardButton.isDisplayed(),"Credit card payment tab is not present");
		softAssert.assertTrue(cardHolderName.isDisplayed(),"Credit card payment tab is not present");
		softAssert.assertAll();
	}

	public void enterCreditCardDetails(String creditCardNum, String name){
		utils.validateAndSendKeys(creditCardNumber,creditCardNum);
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				utils.validateAndSendKeys(cardHolderName,name);
				break;

			case "ios":
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndSendKeys(cardHolderName,name);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
		}
	}

	public void clickAddCardButton() {
		utils.validateAndClick(addCardButton);
	}

	public void validateCreditCardDetailsScreen() {
		softAssert.assertTrue(ccNumberCreditCardDetailsScreen.isDisplayed(),
				"Credit card number label is not displayed");
		softAssert.assertTrue(cardHoldernameCreditCardDetailsScreen.isDisplayed(),
				"Card holder name label is not displayed");
		softAssert.assertTrue(bankNameCreditCardDetailsScreen.isDisplayed(), "Bank name label is not displayed");
		softAssert.assertAll();
	}

	public void clickDoneButtonOnSuccessScreen() {
		utils.validateAndClick(doneButtonOnSuccessScreen);
	}

	public void validateCardNotFoundErrorMessage() {
		Assert.assertTrue(creditCardNotFoundErrorMessage.isDisplayed(),
				"Credit card not found error message is not displayed");
	}

	public void validateInlineErrorMessageCardHolderName() {
		Assert.assertTrue(useOnlyLettersInlineMessage.isDisplayed(), "Inline message is not displayed");
	}

	public void enterCreditCardNumber(String creditCardNum) {
		utils.validateAndSendKeys(creditCardNumber,creditCardNum);
	}

	public void validateInlineLengthMessageCCNumberField() {
		Assert.assertTrue(lengthErrorMessageCCNumber.isDisplayed(), "Inline message for CC length is not displayed");
	}

	public void enterRemarksForCCPayments(String remarks) {
		utils.validateAndSendKeys(remarksForCCPayment,remarks);
	}

	public void clickNextButton() {
		utils.validateAndClick(nextButton);
	}

	public void clickSaveCreditCardCheckBox() {
		utils.validateAndClick(saveCreditCardCheckBox);
	}

	public void validateCCHomeScreenWithCardsSaved() {
		softAssert.assertTrue(alhilalCreditCardsSection.isDisplayed(),"Al hilal cards section is not displayed");
		softAssert.assertTrue(uaeCreditCardsSection.isDisplayed(),"Al hilal cards section is not displayed");
//		Below step would be enabled when addition of cards functionality is available
//		softAssert.assertTrue(addAnotherCreditCard.isDisplayed(),"Add another card option is not displayed");
		softAssert.assertAll();
	}

	/**
	 * If digital card is available click on the first card
	 * In case of no card skip all the ongoing steps of the scenario
	 */
	public void clickDigitalCard() {
		try {
			if(firstDigitalCard.isDisplayed()) {
				utils.validateAndClick(firstDigitalCard);
			} else{
				throw new SkipException("No digital cards found");
			}
		} catch (NoSuchElementException e) {
			throw new SkipException("No digital cards found");
		}
	}

	public void enterAmount(String amount) {
		utils.waitUntilVisible(amountTextField, 10);
		utils.validateAndSendKeys(amountTextField, amount);
		utils.acceptInput(done);
		if(CommonUtils.platform.equalsIgnoreCase("android")) {
			utils.validateAndClick(amountTextField);
			utils.hideKeyboard();
		}
	}

	public void clickConfirmAmountButton() {
		String availableBalanceTxt = availableBalance.getText();
		float availableAccBalance = Float.parseFloat(availableBalanceTxt);
		if(inSufficientBalanceError.isDisplayed() && availableBalanceTxt.equalsIgnoreCase("0.00")) {
			throw new SkipException("Account balance is Null ❌❌❌❌");
		} else if (inSufficientBalanceError.isDisplayed() && !availableBalanceTxt.equalsIgnoreCase("0.00"))
		{
			enterAmount(availableBalanceTxt);
		} else {
			utils.validateAndClick(tu.confirmAmountButton);
		}
	}

	public void clickLegacyCard() {
		try {
			if(firstLegacyCard.isDisplayed()) {
				utils.validateAndClick(firstLegacyCard);
			} else{
				throw new SkipException("No digital cards found");
			}
		} catch (NoSuchElementException e) {
			throw new SkipException("No digital cards found");
		}
	}

	public void clickMoreAccountOption() {
		selectedAccountNo = selectedAccount.getText();
		System.out.println("selected Account no - >"+ selectedAccountNo);
		utils.validateAndClick(moreAccountLink);
	}

	public void validateMyAccountScreen() {
		utils.waitUntilVisible(myAccountsHeader, 5);
		softAssert.assertTrue(myAccountsHeader.isDisplayed(),
				"User is not navigated to my account screen ❌❌❌❌");
	}

	public void selectAnotherAccount() {
		List<MobileElement> accounts = utils.appDriver.findElements(By.xpath(ACCOUNTS_XPATH));
		utils.validateAndClick(accounts.stream()
				.filter(acc -> !acc.getText().equalsIgnoreCase(selectedAccountNo))
				.findFirst().orElse(null));

	}

	public void validatePaymentScreen() {
		utils.waitUntilVisible(paymentScreeHeader, 5);
		softAssert.assertTrue(paymentScreeHeader.isDisplayed(),
				"User is not navigated to Payment screen ❌❌❌❌");
	}

	public void clickBackButton() {
		utils.validateAndClick(backButton);
	}

	public void validateReviewDetailsScreen() {
		utils.waitUntilVisible(reviewScreeHeader, 5);
		softAssert.assertTrue(paymentScreeHeader.isDisplayed(),
				"User is not navigated to Review Details screen ❌❌❌❌");
	}

	public void validatePaymentDetailsScreen() {
		utils.waitUntilVisible(paymentDetailsScreeHeader, 5);
		softAssert.assertTrue(paymentScreeHeader.isDisplayed(),
				"User is not navigated to Payment Details screen ❌❌❌❌");
	}

	public void validatePayBillScreen() {
		utils.waitUntilVisible(payBillScreeHeader, 5);
		softAssert.assertTrue(paymentScreeHeader.isDisplayed(),
				"User is not navigated to Pay a bill screen ❌❌❌❌");
	}
}



	

	

		


