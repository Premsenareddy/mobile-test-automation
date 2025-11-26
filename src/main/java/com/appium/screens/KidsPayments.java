package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;

public class KidsPayments extends BaseScreen {

	// ------------------PAGE FACTORY--------------------------//


	CommonUtils utils = new CommonUtils();
    TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
	PaymentsScreen payments = new PaymentsScreen(appDriver);


  //......................................................................Kids ........................


	@AndroidFindBy(xpath="//android.widget.TextView[@text='One of your bank friends']")
	public MobileElement beneficiaryMenu;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Someone on Al Hilal']")
	public MobileElement alHilalBankMenu;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Another friend in the UAE']")
	public MobileElement domesticBankMenu;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Etisalat']")
	public MobileElement etisalatBiller;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='DU']")
	public MobileElement duBiller;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='You can add a bank friend']")
	public MobileElement addBeneficiarySection;

	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='ae.ahb.digital.sit:id/iv_action']")
	public MobileElement addBeneficiaryArrow;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='More things to do']")
	public MobileElement moreThingsToDoSection;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Your money limits']")
	public MobileElement yourMoneyLimits;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Check all permissions']")
	public MobileElement checkAllpermisssion;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='You can send money to']")
	public MobileElement youCanSendMoneyToSection;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='You can pay a bill for']")
	public MobileElement youCanPayABillFor;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Your payments']")
	public MobileElement paymentScreenHeaderKids;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Mobile (GSM)']")
	public MobileElement mobileGSM;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Wasel Recharge']")
	public MobileElement waselRecharge;

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Enter the mobile number']")
	public MobileElement mobileNumberField;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Continue']")
	public MobileElement continueButton;

	@AndroidFindBy(id="ib_next")
	public MobileElement arrowButton;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Check all details']")
	public MobileElement checkAllDetailsButton;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Send money']")
	public MobileElement sendMoneyButton;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Pay this bill']")
	public MobileElement payThisBill;

	@AndroidFindBy(xpath="//android.widget.TextView[@text= 'We need to check your identity after this']")
	public MobileElement reviewDetailsScreenKids;

	@AndroidFindBy(xpath="//android.widget.TextView[@text= 'Well done']")
	public MobileElement wellDoneMessage;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Done']")
	public MobileElement doneButton;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Check all permissions']")
	public MobileElement checkAllPermissions;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Postpaid']")
	public MobileElement duPostpaid;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Prepaid']")
	public MobileElement duPrepaid;

	@AndroidFindBy(id="tv_title")
	public MobileElement bankFriendScreen;

	@AndroidFindBy(id="ti_search")
	public MobileElement searchOnBankFriend;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add new']")
	public MobileElement addNewBeneficiary;

	@AndroidFindBy(id="iv_options")
	public MobileElement threeDotsOptionBeneficiaryListKids;

	@AndroidFindBy(id="iv_options")
	public List<MobileElement> allThreeDotsOptionBeneficiaryListKids;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Send money']")
	public MobileElement sendMoneyOption;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Remove']")
	public MobileElement removeBeneficiaryOption;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Remove']")
	public List<MobileElement> removeBeneficiaryOptions;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Check all details']")
	public MobileElement checkAllDetailsScreen;

	@AndroidFindBy(className = "android.widget.EditText")
	public MobileElement amount;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Choose from the list of reasons']")
	public MobileElement purposeDropdown;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Add your notes here to remember this exchange']")
	public MobileElement remarksField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter their mobile number']")
	public MobileElement ahbPhoneNumberField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Ask for their account number']")
	public MobileElement ahbAccountNumberField;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Ask for their IBAN number']")
	public MobileElement iBANNumberField;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Find details']")
	public MobileElement findDetailsButton;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='You can give them a nickname!']")
	public MobileElement beneficiaryNicknameField;


	@AndroidFindBy(xpath="//android.widget.TextView[@text='Nice!']")
	public MobileElement beneficiaryCreationSuccessScreen;

	@AndroidFindBy(xpath="//android.widget.Button[@text='Send them money']")
	public MobileElement sendThemMoneyButton;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Another bank in the UAE']")
	public MobileElement anotherBankInUAEOption;

	@AndroidFindBy(xpath="//android.widget.Button[@text='REMOVE']")
	public MobileElement removeOptionOnDeleteBeneficiaryOption;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank in the UAE']")
	public MobileElement domesticBankOptionKids;



	public KidsPayments(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}


	public void validateSectionHeadingsOnKidsPaymentTab() {
		Assert.assertTrue(youCanPayABillFor.isDisplayed(), "You can pay a bill section is not displayed");
		Assert.assertTrue(youCanSendMoneyToSection.isDisplayed(), "You can send money section is not displayed");
		Assert.assertTrue(addBeneficiarySection.isDisplayed(), "You can add a bank friend section is not displayed");
		Assert.assertTrue(moreThingsToDoSection.isDisplayed(), "More things to do section is not displayed");
	}

	public void validateKidsPaymentTab() {
		Assert.assertTrue(beneficiaryMenu.isDisplayed(), "Beneficiary section is not displayed");
		Assert.assertTrue(alHilalBankMenu.isDisplayed(), "Al Hilal section is not displayed");
		//utils.swipeTo("Another friend in the UAE");
		//Assert.assertTrue(domesticBankMenu.isDisplayed(), "Another bank in UAE section is not displayed");
		Assert.assertTrue(etisalatBiller.isDisplayed(), "Etisalat section is not displayed");
		Assert.assertTrue(duBiller.isDisplayed(), "DU section is not displayed");
		Assert.assertTrue(addBeneficiarySection.isDisplayed(), "Add a beneficairy section is not displayed");
		Assert.assertTrue(addBeneficiaryArrow.isDisplayed(), "Add a beneficairy arrow is not displayed");
		utils.scrollTo("Check all permissions");
		Assert.assertTrue(moreThingsToDoSection.isDisplayed(), "More things to do section is not displayed");
		Assert.assertTrue(yourMoneyLimits.isDisplayed(), "Your limits section is not displayed");
		Assert.assertTrue(checkAllpermisssion.isDisplayed(), "Check all permission section is not displayed");

	}

	public void validateKidsPaymentScreenTitle() {
		Assert.assertTrue(paymentScreenHeaderKids.isDisplayed(), "Screen title is not correct");


	}

	public void validateEtisalatSubTypesForKids() {
		Assert.assertTrue(mobileGSM.isDisplayed(), "Mobile GSM option is not displayed");
		Assert.assertTrue(waselRecharge.isDisplayed(), "Wasel Recharge option is not displayed");
	}

	public void enterEtislatPhoneNumber(String EtisalatType, String phoneNumber){
		switch (EtisalatType.toUpperCase()) {
			case "MOBILE(GSM)":
				utils.validateAndClick(mobileGSM);
				break;
			case "WASEL":
				utils.validateAndClick(waselRecharge);
				break;
		}
		utils.scrollTo("Add to your list of bills");
		utils.validateAndSendKeys(mobileNumberField, phoneNumber);
		utils.hideKeyboard();
	}

	public void enterUtilityPaymentAmount(String amount, String EtisalatType) {
		switch (EtisalatType.toUpperCase()) {
			case "MOBILE(GSM)":
				System.out.println("This is GSM case");
				utils.waitUntilVisible(continueButton,5);
				utils.validateAndClick(continueButton);
				break;
			case "WASEL":
				System.out.println("Are you doing the WASEL payment");
				utils.waitUntilVisible(tu.amountTextField,5);
				utils.validateAndClick(tu.amountTextField);
				utils.validateAndSendKeys(tu.amountTextField, amount);
				utils.validateAndClick(continueButton);
				break;
		}
	}

	public boolean isKidsReviewScreenDisplayed(){
		return reviewDetailsScreenKids.isDisplayed();
	}

	public void clickSendMoneyButton() {
		utils.validateAndClick(sendMoneyButton);
	}

	public void isBillPaymentSuccessScreenDisplayed() {
        Assert.assertTrue(wellDoneMessage.isDisplayed(), "Well done message is not displayed");
        Assert.assertTrue(doneButton.isDisplayed(), "Done button is not displayed");
        Assert.assertTrue(checkAllPermissions.isDisplayed(), "Check all permissions button is not displayed");

	}

    public void clickDUPaymentOption() {
		utils.validateAndClick(duBiller);
    }


	public void clickDUPostpaidAndEnterMobileNumber(String mobileNumber) {
		utils.validateAndClick(duPostpaid);
		utils.validateAndSendKeys(mobileNumberField,mobileNumber);
	}

	public void clickContinueButton() {
		utils.validateAndClick(continueButton);
	}

	public void clickArrowButton() {
		utils.validateAndClick(arrowButton);
	}

	public void enterAmountForDu(String amount) {
		utils.waitUntilVisible(tu.amountTextField,15);
		utils.validateAndClick(tu.amountTextField);
		utils.validateAndSendKeys(tu.amountTextField, amount);
		utils.validateAndClick(continueButton);

	}

	public void validateDUSubTypes() {
		Assert.assertTrue(duPrepaid.isDisplayed(), "Prepaid option is not displayed");
		Assert.assertTrue(duPostpaid.isDisplayed(), "Postpaid option is not displayed");

	}

    public void clickAddingBankFriendArrow() {
		utils.validateAndClick(addBeneficiaryArrow);

    }

	public void validateKidsBeneficiaryListScreen() {
		Assert.assertTrue(bankFriendScreen.isDisplayed(), "Bank friend screen title is not displayed");
		Assert.assertTrue(searchOnBankFriend.isDisplayed(), "Search bar is not displayed");

	}

	public void clickOptionsIconAgainstBeneficiary() {
		utils.waitUntilVisible(threeDotsOptionBeneficiaryListKids,5);
		utils.validateAndClick(threeDotsOptionBeneficiaryListKids);
	}

	public void validateSendMoneyOptionToFather() {
    Assert.assertTrue(sendMoneyOption.isDisplayed(), "Send money option is not displayed");
	}


	public void clickSendMoneyOptionfromThreeDots() {

		utils.validateAndClick(sendMoneyOption);
	}

	public void enterAmount(String money){

		utils.validateAndSendKeys(amount,money);
	}


public void chooseParentFromBeneficiaryList(){
	int countOfBeneficiaries = allThreeDotsOptionBeneficiaryListKids.size();
	for (int i=0;i<countOfBeneficiaries;i++) {
		utils.validateAndClick(allThreeDotsOptionBeneficiaryListKids.get(i));

	}
}


public void clickThreeDotsOptionAgainstParent(){
		utils.validateAndClick(allThreeDotsOptionBeneficiaryListKids.get(0));
	}

	public void selectReasonOfTransfer() {
		utils.waitUntilVisible(purposeDropdown,5);
		utils.validateAndClick(purposeDropdown);
		//payments.purposeDropdownSelect();
		payments.selectValueFromDropDown("Family");

	}

	public void enterRemarksAndClickButton() {
		utils.validateAndSendKeys(remarksField, "Test kids transfers");
		utils.validateAndClick(checkAllDetailsButton);



	}

	public void validateCheckAllDetailsScreen() {
		Assert.assertTrue(checkAllDetailsScreen.isDisplayed(), "Check all details screen is not displayed");
	}

	public void validateRemoveBeneficiaryOptionAgainstParent() {
		Assert.assertTrue(removeBeneficiaryOptions.size()==0, "Remove option against parent beneficiary is displayed");
	}

	public void clickAddNewButtonOnBeneficiaryList() {
		utils.waitUntilVisible(addNewBeneficiary,10);
		utils.validateAndClick(addNewBeneficiary);
	}

	public void enterAHBBeneficiaryAccountNumber(String accountNumber) {
		utils.validateAndSendKeys(ahbAccountNumberField,accountNumber );
	}

	public void enterAHBBeneficiaryPhoneNumber(String phoneNumber) {
		utils.validateAndSendKeys(ahbPhoneNumberField,phoneNumber );
	}

	public void clickFindDetailsButton() {
		utils.validateAndClick(findDetailsButton);
	}

	public void enterNicknameForBeneficiary() {
		utils.validateAndSendKeys(beneficiaryNicknameField,utils.generateNickname());
	}

	public void validateBeneficiarySuccessScreen(){
		utils.waitUntilVisible(beneficiaryCreationSuccessScreen,10);
		Assert.assertTrue(beneficiaryCreationSuccessScreen.isDisplayed(), "Success screen is not displayed");
		Assert.assertTrue(sendThemMoneyButton.isDisplayed(), "Success screen is not displayed");
		Assert.assertTrue(doneButton.isDisplayed(), "Success screen is not displayed");

	}

	public void clickAnotherBankinUAEOption() {
		utils.validateAndClick(anotherBankInUAEOption);
	}

	public void deleteAllBeneficiaries() {
		int countOfBeneficiaries = allThreeDotsOptionBeneficiaryListKids.size();

		try{
				while(countOfBeneficiaries>2) {
					utils.validateAndClick(allThreeDotsOptionBeneficiaryListKids.get(2));
					utils.validateAndClick(removeBeneficiaryOption);
					utils.validateAndClick(removeOptionOnDeleteBeneficiaryOption);
					countOfBeneficiaries = allThreeDotsOptionBeneficiaryListKids.size();
					Thread.sleep(5000);
				}}
				catch(ArrayIndexOutOfBoundsException | InterruptedException e) {
					System.out.println("The index you have entered is invalid");


			}
			}


	public void clickPayThisBill() {
		utils.validateAndClick(payThisBill);
	}

	public void clickDomesticBankOptions() {
		utils.validateAndClick(domesticBankOptionKids);
	}

	public void enterIBANumber(String iBAN) {
		utils.validateAndSendKeys(iBANNumberField,iBAN);
	}
}
