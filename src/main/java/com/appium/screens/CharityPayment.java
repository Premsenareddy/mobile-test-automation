package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CharityPayment extends BaseScreen {

	// ------------------PAGE FACTORY--------------------------//

	// CONSTRUCTOR
		public CharityPayment(AppiumDriver<MobileElement> appDriver) {
			super(appDriver);
		}

	CommonUtils utils = new CommonUtils();
		SoftAssert softAssert = new SoftAssert();
		TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Donate']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Donate']")
	public MobileElement donateSection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Zakat donation']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Zakat donation']")
	public MobileElement zakatDonation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Build a Mosque']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Build a Mosque']")
	public MobileElement buildAMosque;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Zakat Al-Fitr']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Zakat Al-Fitr']")
	public MobileElement zakatAlFitr;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='General donation']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='General donation']")
	public MobileElement generalDonation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Emirates Red Crescent']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Emirates Red Crescent']")
	public MobileElement emiratesRedCrescentSection;


	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm amount']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Confirm amount']")
	public MobileElement nextButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & transfer']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Confirm & transfer']")
	public MobileElement confirmTransfer;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Share confirmation']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Share confirmation']")
	public MobileElement shareConfirmation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Disclaimer: Charitable donation transfers once initiated cannot be recalled or cancelled']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Disclaimer: Charitable donation transfers once initiated cannot be recalled or cancelled']")
	public MobileElement disclaimer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='The maximum amount of charitable donations is 10,000.00 AED']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='The maximum amount of charitable donations is 10,000.00 AED']")
	public MobileElement maxAmountMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Make a donation']")
	@iOSXCUITFindBy(className="//XCUIElementTypeNavigationBar[@name='Make a donation']")
	public MobileElement screenTitleDonation;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Review details']")
	@iOSXCUITFindBy(className="//XCUIElementTypeNavigationBar[@name='Review details']")
	public MobileElement screenTitleReviewScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer amount']")
	@iOSXCUITFindBy(className="//XCUIElementTypeNavigationBar[@name='Payment amount']")
	public MobileElement screenTitlePaymentAmountScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Success!']")
	public MobileElement successMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Your donation has been successfully transferred']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Your donation has been successfully transferred']")
	public MobileElement successfullyTransferMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction ID']")
	@iOSXCUITFindBy(accessibility = "Transaction ID")
	public MobileElement transactionIDSuccessScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer amount']")
	@iOSXCUITFindBy(accessibility = "Transfer amount")
	public MobileElement transferAmountSuccessScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer fees']")
	@iOSXCUITFindBy(accessibility = "Transfer fees")
	public MobileElement transferFees;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer from']")
	@iOSXCUITFindBy(accessibility = "Transfer from")
	public MobileElement transferFrom;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer fees']")
	@iOSXCUITFindBy(accessibility = "Transfer fees")
	public MobileElement transferTo;










	public void verifyDonateIcon() {
		Assert.assertTrue(donateSection.isDisplayed(),"Donate section is not displayed");
	}

	public void clickDonateSection() {
		utils.validateAndClick(donateSection);
	}

	public void validateCharityList() {
		softAssert.assertTrue(zakatDonation.isDisplayed(),"zakat donation is not displayed");
		softAssert.assertTrue(buildAMosque.isDisplayed(),"Build a mosque is not displayed");
		softAssert.assertTrue(generalDonation.isDisplayed(),"General donation is not displayed");
		softAssert.assertTrue(emiratesRedCrescentSection.isDisplayed(), "Emirates Red Crescent section is not displayed");
		softAssert.assertAll();
	}

	public void clickZakatDonation() {
		utils.validateAndClick(zakatDonation);
	}

	public void clickNextButton() {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				utils.validateAndClick(nextButton);
				break;

			case "ios":utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndClick(nextButton);
				break;

		}

	}

	public void validateReviewScreen() {
		softAssert.assertTrue(disclaimer.isDisplayed(),"Disclaimer is not displayed on the review screen");
		softAssert.assertTrue(screenTitleReviewScreen.isDisplayed(),"Disclaimer is not displayed on the review screen");
		softAssert.assertAll();
	}

	public void clickCharityConfirmAndTransferButton() {
		utils.validateAndClick(confirmTransfer);
	}

	public void validateCharitySuccessScreen() {
		utils.waitUntilVisible(tu.transactionID, 15);
		softAssert.assertTrue(transferFees.isDisplayed(), "Transfer fees is not displayed");
		softAssert.assertTrue(transferFrom.isDisplayed(), "Transfer from is not displayed");
		softAssert.assertTrue(transferTo.isDisplayed(), "Transfer to is not displayed");
		softAssert.assertTrue(tu.transactionID.isDisplayed(),"Transaction ID is not displayed");
		softAssert.assertAll();
	}

	public void buildAMosqueDonation() {
		utils.validateAndClick(buildAMosque);
	}

	public void clickGeneralDonationOption() {
		utils.validateAndClick(generalDonation);
	}

	public void valdateShareConfirmationPresence() {
		Assert.assertTrue(shareConfirmation.isDisplayed(),"Share confirmation option is not present");

	}

	public void validateNextButtonDisabled() {
		Assert.assertFalse(nextButton.isEnabled(),"Next buttom is enabled");
	}

	public void validateMaxAmountMessage() {
		Assert.assertTrue(maxAmountMessage.isDisplayed(),"Max amount message is not displayed");
	}

	public void validateScreenHeading() {
		utils.waitUntilVisible(screenTitleDonation, 5);
		Assert.assertTrue(screenTitleDonation.isDisplayed(),"Screen heading is incorrect");
	}

	public void validateAmountScreen() {
		utils.waitUntilVisible(screenTitlePaymentAmountScreen,5);
		softAssert.assertTrue(maxAmountMessage.isDisplayed(),"Max amount message is not displayed");
		softAssert.assertTrue(screenTitlePaymentAmountScreen.isDisplayed(),"Screen heading is incorrect");
		softAssert.assertAll();
	}

	public void zakatAlFitrDonation() {
		utils.validateAndClick(zakatAlFitr);
	}

	public void clickConfirmAmountButton() {
		utils.validateAndClick(nextButton);
	}
}



	

	

		


