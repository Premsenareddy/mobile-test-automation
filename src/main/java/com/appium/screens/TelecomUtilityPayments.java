package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.DirectionType;
import com.appium.utils.IosScrollUtil;
import com.appium.utils.WaitUtil;
import com.beust.jcommander.JCommander;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.imagecomparison.ComparisonMode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import lombok.val;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.Locale;

public class TelecomUtilityPayments extends BaseScreen {

	private final String SALIK_LABEL = "Salik";

	// ------------------PAGE FACTORY--------------------------//

	// CONSTRUCTOR
	public TelecomUtilityPayments(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	CommonUtils utils = new CommonUtils();

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Pay a bill']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Pay a bill']")
	public MobileElement paymentMainMenu;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeScrollView")
	private MobileElement parentElement;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ETISALAT'] | //android.widget.TextView[@text='Etisalat']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Etisalat']")
	public MobileElement etisalatBiller;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mobile (GSM)']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Mobile (GSM)']")
	public MobileElement mobileGSM;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='E-Vision']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='E-Vision']")
	public MobileElement eVision;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Landline/Elife']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Landline/Elife']")
	public MobileElement landlineElife;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Al Shamil (Broadband)']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Al Shamil (Broadband)']")
	public MobileElement alShamil;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Internet (Dial-up)']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Internet (Dial-up)']")
	public MobileElement dialup;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Wasel Recharge']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Wasel Recharge']")
	public MobileElement waselRecharge;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ADDC']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='ADDC']")
	public MobileElement ADDC;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='AADC']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='AADC']")
	public MobileElement AADC;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='SEWA']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='SEWA']")
	public MobileElement SEWA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DEWA']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='DEWA']")
	public MobileElement DEWA;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='DU']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='DU']")
	public MobileElement DU;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Salik']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Salik']")
	public MobileElement Salik;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Etisalat']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Etisalat']")
	public MobileElement etisalatServicerProvider;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Current Account']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Service provider']")
	public MobileElement serviceProviderText;


	@AndroidFindBy(xpath = "//android.widget.EditText[@text='50 123 4567']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='50 123 4567']")
	public MobileElement mobileNumberField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Account number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Account number']")
	public MobileElement accountNumberField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Consumer PIN']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField[@value='Consumer PIN']")
	public MobileElement salikPIN;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Change']")
	public MobileElement changeServiceType;

	@AndroidFindBy(className = "android.widget.CheckBox")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='icChoicesActiveCheckOn']")
	public MobileElement savePayeeCheckBox;

	@AndroidFindBy(className = "android.widget.CheckBox")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='icChoicesActiveCheckOff']")
	public MobileElement savePayeeCheckBoxOff;


	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter payee nickname']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='You can add a nickname']")
	public MobileElement paymentNickname;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Continue']")
	public MobileElement proceedTOPaymentButton;

	@AndroidFindBy(id = "ae.ahb.digital.cit:id/atmAmountEditText")
	public MobileElement paymentAmount;

	@AndroidFindBy(id = "ae.ahb.digital.cit:id/ibc_next")
	public MobileElement confirmAmount;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & pay']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm & transfer']")
	public MobileElement confirmPaymentOnReviewScreen;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & pay']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm & transfer'] " +
			"| //XCUIElementTypeStaticText[@name='Confirm & pay']")
	public MobileElement confirmAndPay;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm amount']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm amount']")
	public MobileElement confirmAmountButton;

	@AndroidFindBy(className = "android.widget.EditText")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
	public MobileElement amountTextField;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	public MobileElement errorMessageEnquriy;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text= \"You'll need to authenticate in the next step\"]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm & transfer']")
	public MobileElement reviewDetailsScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction ID']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transaction ID']")
	public MobileElement transactionID;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Success!']")
	public MobileElement successScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction amount cannot be 0!']")
	public MobileElement zeroAmountErrorMessage;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Done']")
	public MobileElement doneButtonOniOSKeyboard;

	public void clickDoneButtonOniOsKeyboard() {

	}

	public void enterAccountNumberOrPhoneNumber(String EtisalatType, String accountNumber) {
		WaitUtil.pause();
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				switch (EtisalatType.toUpperCase()) {
					case "MOBILE(GSM)":
						utils.validateAndClick(mobileGSM);
						utils.scrollTo("50 123 4567");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.hideKeyboard();
						break;
					case "WASEL":
						utils.validateAndClick(waselRecharge);
						utils.scrollTo("50 123 4567");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.hideKeyboard();
						break;
					case "EVISION":
						utils.validateAndClick(eVision);
						utils.scrollTo("Account number");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.hideKeyboard();
						break;
					case "ALSHAMIL":
						utils.validateAndClick(alShamil);
						utils.scrollTo("Account number");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.hideKeyboard();
						break;
					case "DIALUP":
						utils.validateAndClick(dialup);
						utils.scrollTo("Account number");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.hideKeyboard();
						break;
					case "ELIFE":
						utils.validateAndClick(landlineElife);
						utils.scrollTo("Mobile number");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.hideKeyboard();
						break;
				}
				break;
			case "ios":
				switch (EtisalatType.toUpperCase()) {
					case "MOBILE(GSM)":
						utils.validateAndClick(mobileGSM);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
					case "WASEL":
						utils.validateAndClick(waselRecharge);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
					case "EVISION":
						utils.validateAndClick(eVision);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
					case "ALSHAMIL":
						utils.validateAndClick(alShamil);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
					case "DIALUP":
						utils.validateAndClick(dialup);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(accountNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
					case "ELIFE":
						utils.validateAndClick(landlineElife);
						utils.iOSScroll("down");
						utils.validateAndSendKeys(mobileNumberField, accountNumber);
						utils.validateAndClick(doneButtonOniOSKeyboard);
						break;
				}
		}


	}

	public void enterUtilityPaymentAmount(String EtisalatType, String amount) {

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				switch (EtisalatType.toUpperCase()) {
					case "MOBILE(GSM)":
					case "EVISION":
					case "ALSHAMIL":
					case "DIALUP":
					case "ELIFE":
						utils.validateAndClick(confirmAmountButton);
						break;
					case "WASEL":
						utils.validateAndClick(amountTextField);
						utils.validateAndSendKeys(amountTextField, amount);
						utils.validateAndClick(confirmAmountButton);
						break;
				}
				break;
			case "ios":
				switch (EtisalatType.toUpperCase()) {
					case "MOBILE(GSM)":
					case "EVISION":
					case "ALSHAMIL":
					case "DIALUP":
					case "ELIFE":
						utils.validateAndClick(confirmAmountButton);
						break;

					case "WASEL":
						utils.waitUntilVisible(amountTextField, 10);
						utils.validateAndClick(amountTextField);
						utils.validateAndSendKeys(amountTextField, "5000");
						utils.validateAndClick(doneButtonOniOSKeyboard);
						utils.validateAndClick(confirmAmountButton);
						break;
				}
		}
	}

	public void enquiryRetry() {
		if (errorMessageEnquriy.isDisplayed()) {
			errorMessageEnquriy.click();
			proceedTOPaymentButton.click();
		}
	}

	public void clearAmountField(MobileElement element) {
		while (!amountTextField.getText().equalsIgnoreCase("0.00") || !amountTextField.getText()
				.equalsIgnoreCase("0"))
			element.sendKeys(Keys.DELETE);
	}

	public void validatePayABillOption() {
		WaitUtil.pause();
		Assert.assertTrue(paymentMainMenu.isDisplayed(), " Pay a bill option is not present");
	}

	public void clickSavePayeeCheckbox() {

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("Save this payee for future payments");
				utils.validateAndClick(savePayeeCheckBox);
				break;
			case "ios":
				utils.validateAndClick(savePayeeCheckBox);
				break;
		}
	}

	public void clickContinueButtonAfterEnquiry() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("Continue");
				utils.validateAndClick(proceedTOPaymentButton);
				break;
			case "ios":
				utils.validateAndClick(proceedTOPaymentButton);
				break;
		}
	}

	public void clickSalikIcon() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("Salik");
				utils.validateAndClick(Salik);
				break;
			case "ios":
				IosScrollUtil.scrollElementToText(
						CommonUtils.appDriver,
						DirectionType.DOWN,
						parentElement,
						SALIK_LABEL);
				utils.validateAndClick(Salik);
				break;
		}
	}

	public void enterSalikPin(String salikPin) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(salikPIN, salikPin);
				break;
			case "ios":
				utils.validateAndSendKeys(salikPIN, salikPin);
				utils.validateAndClick(doneButtonOniOSKeyboard);
				break;
		}
	}

	public void enterAmount(String amount) {
		utils.waitUntilVisible(amountTextField, 10);
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":

			case "ios":
				utils.validateAndSendKeys(amountTextField, amount);
				break;
		}
	}

	public void enterSalikAcountNumber(String salikAccountNumber) {

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(accountNumberField, salikAccountNumber);
				break;

			case "ios":
				utils.validateAndSendKeys(accountNumberField, salikAccountNumber);
				utils.validateAndClick(doneButtonOniOSKeyboard);
		}
	}

	public void validateAllBillers() {
		WaitUtil.pause(WaitUtil.DEFAULT_WAIT_MILLIS * 2);
		Assert.assertTrue(etisalatBiller.isDisplayed(), "Etisalat is not displayed");
		Assert.assertTrue(DU.isDisplayed(), "DU is not displayed");
		Assert.assertTrue(DEWA.isDisplayed(), "DEWA is not displayed");
		Assert.assertTrue(SEWA.isDisplayed(), "SEWA is not displayed");
		Assert.assertTrue(ADDC.isDisplayed(), "ADDC is not displayed");
		Assert.assertTrue(AADC.isDisplayed(), "AADC is not displayed");
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo(SALIK_LABEL);
				Assert.assertTrue(Salik.isDisplayed(), "Salik is not displayed");
				break;
			case "ios":
				IosScrollUtil.scrollElementToText(
						CommonUtils.appDriver,
						DirectionType.DOWN,
						parentElement,
						SALIK_LABEL);
				Assert.assertTrue(Salik.isDisplayed(), "Salik is not displayed");
				break;
		}
	}

	public void clickConfirmAndPay() {
		utils.validateAndClick(confirmAndPay);
	}
}







	

	

		


