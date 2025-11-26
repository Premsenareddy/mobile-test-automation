package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.util.List;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ManageBeneficiaryScreens extends BaseScreen {

	// ------------------PAGE FACTORY--------------------------//

	CommonUtils utils = new CommonUtils();
	TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
	TouchAction touch = new TouchAction(appDriver);

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage beneficiaries']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Manage beneficiaries']")
	public MobileElement manageBeneficiarySection;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transaction limits']")
	public MobileElement transactionLimitsMenu;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Let's add your first one!\") or contains(@text,'Add new')]")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name=\"Let's add your first one!\"]")
	public MobileElement addFirstBeneficiary;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Add new']")
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Add a new beneficiary\"])[1]")
	public MobileElement addBeneficiary;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	public MobileElement noBeneficiaryScreen;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
	public MobileElement searchTextbox;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Search']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name='Search']")
	public List<MobileElement> searches;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='generalOptions']")
	public List<MobileElement> countOfBeneficiaries;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='generalOptions'])[1]")
	public MobileElement firstBeneficiaryInList;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name='generalOptions'])")
	public MobileElement singleBeneInList;

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc='Chat']")
	public MobileElement chatIcon;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Al Hilal account']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Al Hilal account']")
	public MobileElement alHilalBank;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Another bank']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Another bank']")
	public MobileElement anotherBank;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='50 123 4567']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='50 123 4567']")
	public MobileElement mobileNumberField;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a valid mobile number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid mobile number']")
	public MobileElement invalidMobileNumberInlineMessage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter a valid account number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Please enter a valid account number']")
	public MobileElement invalidAccountNumberInlineMessage;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Account number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Account number']")
	public MobileElement accountNumberField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='As listed on their ID or trade license']")
	public MobileElement accountHolderName;

	@AndroidFindBy(id = "ae.ahb.digital.cit:id/rc_mobile_number")
	public MobileElement mobileNumberDisplay;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='You can add a nickname']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value ='Nickname']")
	public MobileElement nicknameTextInput;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value ='You can add a nickname']")
	public MobileElement nicknameiOSInternational;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nickname']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value ='Nickname']")
	public MobileElement nicknameTextInputDomesticInternational;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm details']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Confirm details']")
	public MobileElement confirmDetails;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='0']")
	public MobileElement otpBox1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='1']")
	public MobileElement otpBox2;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='2']")
	public MobileElement otpBox3;

	@AndroidFindBy(xpath = "//android.widget.EditText[@index='3']")
	public MobileElement otpBox4;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Domestic bank']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Domestic bank']")
	public MobileElement domesticBank;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='International bank']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='International bank']")
	public MobileElement internationalBank;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='IBAN number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Al Hilal SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
	public MobileElement iBANTextInput;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='IBAN number']")
	public MobileElement iBANNumberText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Fetch details']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Fetch details']")
	public MobileElement fetchDetailsButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Ok']")
	public MobileElement deleteOptionOnDeletionPopup;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='CANCEL']")
	public MobileElement cancelOptionOnDeletionPopup;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='As listed on their ID or trade license']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Account holder name']")
	public MobileElement accoutnHolderNameTextInput;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='As listed on their ID or trade license']")
	public MobileElement accoutnHolderNameInternatonal;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Success!']")
	public MobileElement beneficiaryCreationSuccessScreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Mashreqbank']")
	public MobileElement Mashreqbank;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Al Hilal Bank']")
	public MobileElement AlHilalBank;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Transfer money']")
	public MobileElement transferMoneyButton;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Done']")
	public MobileElement doneButton;


	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	public MobileElement threeDotsOption;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@index='2']")
	public List<MobileElement> threeDotsOptionlist;


	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Delete']")
	public MobileElement deleteBeneficiaryOptionFromThreeDots;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete']")
	public List<MobileElement> deleteBeneficiaryOptionFromThreeDotsList;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@index='0']")
	public MobileElement transferOptionFromThreeDots;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Done']")
	public MobileElement deleteBeneficiaryBanner;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Type or choose from the list']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Al Hilal SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]")
	public MobileElement countryDropDown;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Type or choose from the list']")
	public MobileElement innerCountryDropDown;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Country']")
	public MobileElement beneficiaryCountryDropDown;

	@AndroidFindBy(className = "android.widget.TextView")
	public List<MobileElement> countryList;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Account number']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value='Account number']")
	public MobileElement accountNumberInternationalTransfer;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Street, apartment number']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value='Street, apartment number']")
	public MobileElement benAddressLine1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Floor, landmark or other']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value='Street, apartment number']")
	public MobileElement benAddressLine2;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='City']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[@value='City']")
	public MobileElement benAddressCity;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Country']")

	public MobileElement benAddressCountry;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='SWIFT code']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='SWIFT code']")
	public MobileElement swiftCode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='IFSC code']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='IFSC code']")
	public MobileElement ifscCode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='BSB number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='BSB number']")
	public MobileElement bsbNumber;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Transit code']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Transit code']")
	public MobileElement transitCode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Sort code']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Sort code']")
	public MobileElement sortCode;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Fedwire/ABA code']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value='Fedwire/ABA code']")
	public MobileElement fedwireCode;


	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true))" +
			".scrollIntoView(new UiSelector().text(\"exact_text\"))")
	public MobileElement dropdownElement;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Beneficiary already exists']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeAlert[@name='Beneficiary already exists']")
	public MobileElement beneficiaryAlreayExistsPopUp;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Ok']")
	public MobileElement beneficiaryExistPopUpClose;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='ae.ahb.digital.sit:id/iv_options']")
	public List<MobileElement> threeDotIcons;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='ae.ahb.digital.sit:id/iv_options']")
	public MobileElement threeDotIcon;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='India']")
	public MobileElement countryIndia;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Australia']")
	public MobileElement countryAustralia;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Canada']")
	public MobileElement countryCanada;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='USA']")
	public MobileElement countryUSA;


	public void deleteAllBene() throws InterruptedException {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				while (searches.size() > 0) {
					threeDotIcon.click();
					deleteBeneficiaryOptionFromThreeDots.click();
					deleteOptionOnDeletionPopup.click();
					Thread.sleep(3000);
					//break;
				}
			case "ios":
				while(countOfBeneficiaries.size()>0){

					if(countOfBeneficiaries.size() ==1){
						singleBeneInList.click();
					}
					else {
						firstBeneficiaryInList.click();
					}
						deleteBeneficiaryOptionFromThreeDots.click();
						deleteOptionOnDeletionPopup.click();
						Thread.sleep(3000);
					continue;
				}
		}
	}

	public void enterNicknameForDomesticAndInternationalBank() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(nicknameTextInputDomesticInternational, 10);
				utils.validateAndSendKeys(nicknameTextInputDomesticInternational, utils.generateNickname());
				break;

			case "ios":
				utils.waitUntilVisible(nicknameTextInputDomesticInternational, 10);
				utils.validateAndSendKeys(nicknameTextInputDomesticInternational, utils.generateNickname());
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				break;
		}
	}

	public void selectCountryFromDropDown(String country) {
		int count = countryList.size();
		System.out.println("Count is " + count);
		for (int i = 0; i < count; i++) {
			String text = countryList.get(i).getText();
			System.out.print("\n" + text);
			if (text.equalsIgnoreCase(country)) {
				countryList.get(i).click();
				break;
			}
		}
	}

	public void selectPurposeFromDropDown(String purpose) {
		int count = countryList.size();
		for (int i = 0; i < count; i++) {
			String text = countryList.get(i).getText();
			System.out.print("\n" + text);
			if (text.equalsIgnoreCase(purpose)) {
				countryList.get(i).click();
				break;
			}
		}
	}


	public void addBeneficiaryOption(boolean skip) throws InterruptedException {
		if (searches.size() > 0 && skip != true) {
			deleteAllBene();
		}
		Thread.sleep(2000);
		utils.validateAndClick(addFirstBeneficiary);
	}

	// CONSTRUCTOR
	public ManageBeneficiaryScreens(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	// Tap functionality

	public void enterRoutingCodes(String Country, String routingCode) {
		switch (Country.toUpperCase()) {
					case "CANADA":
						utils.validateAndSendKeys(transitCode, routingCode);
						break;
					case "AUSTRALIA":
						utils.validateAndSendKeys(bsbNumber, routingCode);
						break;
					case "GREAT BRITAIN":
					case "IRELAND":
						utils.validateAndSendKeys(sortCode, routingCode);
						break;
					case "INDIA":
						utils.validateAndSendKeys(ifscCode, routingCode);
						break;
					case "USA":
						utils.validateAndSendKeys(fedwireCode, routingCode);
						break;
				}
	}

	public void scrollToRoutingCodeField(String Country) {
		switch (Country.toUpperCase()) {
			case "CANADA":
				utils.scrollTo("Transit code");
				;
				break;
			case "AUSTRALIA":
				utils.scrollTo("BSB number");
				break;
			case "GREAT BRITAIN":
			case "IRELAND":
				utils.scrollTo("Sort code");
				break;
			case "INDIA":
				utils.scrollTo("IFSC code");
				break;
			case "USA":
				utils.scrollTo("Fedwire/ABA code");

				break;
		}
	}


	public void enterAlHilalPhoneNumber(String mobileNumber) {

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(mobileNumberField, mobileNumber);
				break;

			case "ios":
				utils.validateAndSendKeys(mobileNumberField, mobileNumber);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);

		}

	}

	public void clickFetchDetailsButton() throws InterruptedException {

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("Fetch details");
				utils.validateAndClick(fetchDetailsButton);
				Thread.sleep(2000);
				break;

			case "ios":
				utils.validateAndClick(fetchDetailsButton);
				break;
		}

	}

	public void enterNicknameForAHBBeneficiary(String transferType) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(nicknameTextInput, utils.generateNickname());
				break;

			case "ios":
				switch ((transferType.toUpperCase())){
					case "AHB":
						utils.validateAndSendKeys(nicknameTextInput, utils.generateNickname());
						utils.validateAndClick(tu.doneButtonOniOSKeyboard);
						break;

					case "INTERNATIONAL":
						utils.validateAndSendKeys(nicknameiOSInternational, utils.generateNickname());
						utils.validateAndClick(tu.doneButtonOniOSKeyboard);
						break;
				}



		}

	}

	public void clickConfirmDetailsButton() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":

				utils.scrollTo("Confirm details");
				utils.validateAndClick(confirmDetails);
				break;

			case "ios":
				utils.scrollToTextInDirection("down","name","Confirm details");
				utils.validateAndClick(confirmDetails);
				break;
		}

	}

	public void clickDoneButtonOnBeneficiarySuccessScreen() {
		utils.waitUntilVisible(doneButton, 5);
		utils.validateAndClick(doneButton);

		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(searchTextbox, 5);
				Assert.assertTrue(searchTextbox.isDisplayed(), "User didnt land on beneficiary list screen after clicking done button");
				break;

			case "ios":
				utils.waitUntilVisible(manageBeneficiarySection, 5);
				Assert.assertTrue(manageBeneficiarySection.isDisplayed(), "User didnt land on beneficiary list screen after clicking done button");
		}
	}

	public void validateBeneficiaryExistPopup() {
		Assert.assertTrue(beneficiaryAlreayExistsPopUp.isDisplayed(), "Beneficiary already exist pop up is not displayed");
	}

	public void closeBeneficiaryExistPopup() {
		utils.validateAndClick(beneficiaryExistPopUpClose);
		Assert.assertTrue(fetchDetailsButton.isDisplayed(), "Pop up is not closed");
	}

	public void enterAHBAccountNumber(String accountNumber) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(accountNumberField, accountNumber);
				break;

			case "ios":
				utils.validateAndSendKeys(accountNumberField, accountNumber);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);


		}
	}

	public void clickAnotherBankOption() {
		utils.validateAndClick(anotherBank);
	}

	public void clickDomesticBankOption() {
		utils.validateAndClick(domesticBank);
	}

	public void enterIBANNumber(String iBAN) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(iBANTextInput, iBAN);
				break;

			case "ios":
				touch.tap(tapOptions().withElement(element(iBANTextInput))).perform();
				utils.validateAndSendKeys(iBANTextInput, iBAN);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				break;
		}

	}

	public void enterAccountHolderName(String transferType) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("As listed on their ID or trade license");
				utils.validateAndSendKeys(accoutnHolderNameTextInput, "Hasneet Singh Nehra");
				break;

			case "ios":
				switch (transferType.toUpperCase()){
					case "DOMESTIC":
						utils.validateAndSendKeys(accoutnHolderNameTextInput, "Hasneet Singh Nehra");
						utils.validateAndClick(tu.doneButtonOniOSKeyboard);
						break;

					case "INTERNATIONAL":
						utils.validateAndSendKeys(accoutnHolderNameInternatonal, "Hasneet Singh Nehra");
						utils.validateAndClick(tu.doneButtonOniOSKeyboard);
						break;
				}


		}
	}

	public void enterInvalidPhoneNumber(String phoneNumber) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(mobileNumberField, phoneNumber);
				break;

			case "ios":
				utils.validateAndSendKeys(mobileNumberField, phoneNumber);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);

		}
	}

	public void enterInvalidAccountNumber(String accountNumber) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.validateAndSendKeys(accountNumberField, accountNumber);
				break;

			case "ios":
				utils.validateAndSendKeys(accountNumberField, accountNumber);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);

		}
	}

	public void clickInternationalBankOption() {
		utils.validateAndClick(internationalBank);
	}

	public void selectCountryFromInternationalCountryListDropDown(String country) {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				utils.validateAndClick(countryDropDown);
				utils.validateAndClick(countryDropDown);
				utils.validateAndSendKeys(countryDropDown, country);
				break;

			case "ios":
				utils.waitUntilVisible(countryDropDown,5);
				utils.validateAndClick(countryDropDown);
				utils.validateAndSendKeys(innerCountryDropDown, country);
				switch (country.toUpperCase()){
					case "INDIA":
						utils.waitUntilVisible(countryIndia,5);
						utils.validateAndClick(countryIndia);
						break;
					case "AUSTRALIA":
						utils.waitUntilVisible(countryAustralia,5);
						utils.validateAndClick(countryAustralia);
						break;
					case "USA":
						utils.waitUntilVisible(countryUSA,5);
						utils.validateAndClick(countryUSA);
						break;
					case "CANADA":
						utils.waitUntilVisible(countryCanada,5);
						utils.validateAndClick(countryCanada);
						break;
				}

		}

	}

	public void enterAccountNumberSwiftCode(String swiftCod, String accountNumber ) {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				utils.scrollTo("SWIFT code");
				utils.validateAndSendKeys(swiftCode,swiftCod);
				utils.scrollTo("Account number");
				utils.hideKeyboard();
				utils.validateAndSendKeys(accountNumberInternationalTransfer,accountNumber);
				break;

			case "ios":
				utils.iOSScroll("down");
				utils.validateAndSendKeys(accountNumberInternationalTransfer,accountNumber);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndSendKeys(swiftCode,swiftCod);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
		}
	}

	public void enterRoutingCodesForCountry(String routingcode, String country) {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				scrollToRoutingCodeField(country);
				enterRoutingCodes(country, routingcode);
				break;

			case "ios":
				enterRoutingCodes(country, routingcode);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);

		}


	}

	public void enterBeneficiaryDetailsForInternationalBeneficiary(String addressline1,String addressline2, String city, String beneficiarycountry) {

		switch (CommonUtils.platform.toLowerCase()){
			case "android":
				utils.validateAndSendKeys(benAddressLine1, addressline1);
				utils.validateAndSendKeys(benAddressLine2, addressline2);
				utils.validateAndSendKeys(benAddressCity, city);
				utils.validateAndClick(beneficiaryCountryDropDown);
				utils.validateAndSendKeys(beneficiaryCountryDropDown, beneficiarycountry);
				//utils.hideKeyboard();
				break;

			case "ios":
				utils.validateAndSendKeys(benAddressLine1, addressline1);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndSendKeys(benAddressLine2, addressline2);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndSendKeys(benAddressCity, city);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndSendKeys(innerCountryDropDown, "India");
				utils.validateAndClick(countryIndia);




		}

	}
}



	

	

		


