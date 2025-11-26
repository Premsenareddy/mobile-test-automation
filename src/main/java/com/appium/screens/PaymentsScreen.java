package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.Keys;
import java.util.List;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class PaymentsScreen extends BaseScreen {

	CommonUtils utils = new CommonUtils();
	TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
	// CONSTRUCTOR
	public PaymentsScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}
	// ------------------PAGE FACTORY--------------------------//
	
	//To tap tips title
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Payments\"]/android.widget.ImageView")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[2]")
	public MobileElement paymentsTab;
	
	//To tap friends
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")
	public MobileElement billPayments;

	// -------------Second Scenario--------------------

	//To tap back
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement back;
	
	//To tap transfer money
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Transfer money']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Transfer money']")
	public MobileElement transferMoney;
	
	//To tap transfer money myself
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Myself']")
	public MobileElement transferMoneyMyself;
	
	//To tap proceed to payment
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public MobileElement proceedToPayment;

	//To tap amount
	@AndroidFindBy(className = "android.widget.EditText")
	public MobileElement amount;
	
	//To tap confirm amount
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
	public MobileElement confirmAmount;
	
	//To tap confirm and review
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm & review\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & review']")
	public MobileElement confirmAndReview;
	
	//To tap confirm and send
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public MobileElement confirmAndSend;
	
	//To tap digital bank
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Al Hilal account']")
	public MobileElement digitalBank;
	
	//To tap new account option
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='A new account']")
	public MobileElement newAccount;
	
	//To enter phone number
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='50 123 4567']")
	public MobileElement enterPhoneNumber;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Account number']")
	public MobileElement enterNumber;
	
	//To confirm phone number
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm details']")
	public MobileElement confirmDetails;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Proceed']")
	public MobileElement proceedButton;
	
	//To click purpose drop down
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Choose from the list']")
	public MobileElement purposeDropdown;
	
	//To selectValue purpose drop down
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.EditText")
	public MobileElement purposeDropdownSelect;
	
	//To selectValue purpose drop down
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[1]")
	public MobileElement doneBtn;
	
	//To tap done
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Done\"]")
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Done']")
	public MobileElement done;
	
	@AndroidFindBy(className="android.widget.CheckBox")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='icChoicesActiveCheckOn']")
	public MobileElement addBeneCheckBox;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Another bank']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Another bank']")
	public MobileElement transferMoneytoAnotherBank;
	
	//@AndroidFindBy(className="android.widget.TextView")
	@AndroidFindBy(id="tv_title")
	public List<MobileElement> biller;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Account number']")
	public MobileElement accountNumber ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='IBAN number']")
	public MobileElement iBANNumber ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='IBAN number']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Al Hilal SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]")
	public MobileElement iBanNumber ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Country']")
	public MobileElement beneficiaryCountryDropDown;
	
	//@AndroidFindBy(id="ae.ahb.digital.sit:id/iv_radio")
	@AndroidFindBy(id="iv_radio")
	public List<MobileElement> transactionType;
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='SWIFT code']")
	public MobileElement swiftCode ;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Sort code']")
	public MobileElement sortCode ;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='IFSC code']")
	public MobileElement ifscCode;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='BSB number']")
	public MobileElement bsbNumber ;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Transit code']")
	public MobileElement transitCode ;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Fedwire/ABA code']")
	public MobileElement fedwireCode ;
	

	@AndroidFindBy(xpath="//android.widget.EditText[@text='Street, apartment number']")
	public MobileElement benAddressLine1 ;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Floor, landmark or other']")
	public MobileElement benAddressLine2 ;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='City']")
	public MobileElement benAddressCity;
	@AndroidFindBy(xpath="//android.widget.EditText[@text='Country']")
	public MobileElement benAddressCountry;
	//@AndroidFindBy(xpath="//android.widget.EditText[@text='Account holder name']")
	@AndroidFindBy(xpath="//android.widget.EditText[@text='As listed on their ID or trade license']")
	public MobileElement receipientName;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Confirm details']")
	public MobileElement confirmDetailsBtnInternationalPayment ;
	
	@AndroidFindBy(id = "atmAmountEditText")
	public MobileElement amountForPayment;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='International bank']")
	public MobileElement internationalBankOption ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Domestic bank']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Domestic bank']")
	public MobileElement domesticBankOption ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shared - No fee charged by Al Hilal']")
	public MobileElement sharedCharges;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Beneficiary - No fee charged by Al Hilal']")
	public MobileElement chargePaidByBeneficiary;

	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Myself - Other banks' fees paid by me\"]")
	public MobileElement chargePaidByMyself;
	
	//To selectValue purpose drop down
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	public MobileElement chargeBearerDropdownSelect;
	//id=	
	//		ae.ahb.digital.sit:id/tv_item
	
	//To click purpose drop down
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Choose from the list']")
	public MobileElement purposeDropdown2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
	public MobileElement successElement;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Failure!']")
	public MobileElement failureElement;
	
	@AndroidFindBy(id ="tv_header")
	public List<MobileElement> successPageHeaderElements;
	
	@AndroidFindBy(id ="tv_description")
	public List<MobileElement> successPageHeaderElementVals;

	
	@AndroidFindBy(className="android.widget.TextView")
	public List<MobileElement> dropDownList;

	@iOSXCUITFindBy(className = "XCUIElementTypeTextView")
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Groceries, phone bill, etc…']")
	public MobileElement remarks;	
	
	@AndroidFindBy(id = "cb_check")
	public MobileElement chkboxAddBeneficiary;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nickname']")
	public MobileElement nicName;
	
	@AndroidFindBy(id ="tv_transfer_amount_aed")
	public List<MobileElement> transferCreditDebitAmtElements;
	
	@AndroidFindBy(id ="tv_suffix")
	public List<MobileElement> tranferAmtCurrencyElements;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Bank name']")
	public MobileElement lastElement;
	
	@AndroidFindBy(id = "tv_available_balance")
	public MobileElement balanceElement;
	
	@AndroidFindBy(id = "tv_currency")
	public MobileElement currencyDropDown;
	
	
	@AndroidFindBy(id = "iv_radio")
	public MobileElement paymentUsingBy;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue to payment']")
	public MobileElement proceedToPaymentBtn;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	public MobileElement continueTransferButton;
	
	@AndroidFindBy(id = "bv_confirm_details")
	public MobileElement proceedToPaymentBtn2;
	
	@AndroidFindBy(id = "ibc_next")
	public MobileElement confirmAmtBtn2;
	//Utility Payment
	//touch.tap(tapOptions().withElement(element(confirmAmtBtn2))).perform();
	@AndroidFindBy(id = "bv_primary")
	public MobileElement confirmAndSendBtn2;
	//utility payment
	//touch.tap(tapOptions().withElement(element(confirmAndSendBtn2))).perform();

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm amount']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='Confirm amount']")
	public MobileElement confirmAmtBtn;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Confirm & transfer']")
	public MobileElement confirmAndSendBtn;

	@AndroidFindBy(id = "tv_error")
	public List<MobileElement> fieldErrorMessage;
	
	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> screenErrMessage;
	
	//@AndroidFindBy(id = "tv_description")
	@AndroidFindBy(xpath = "android.widget.TextView[@text='Sorry! Please try again']")
	public MobileElement screenErrMessagetext;
	
	@AndroidFindBy(id = "tv_exchange_rate")
	public MobileElement exchange_rate;

	@AndroidFindBy(xpath ="//android.widget.TextView[@text='TouchPoints']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='TouchPoints']")
	public MobileElement touchpointSelection;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='DEWA']")
	@iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@name='DEWA']")
	public MobileElement DEWA;

	public void selectTouchPointOption() {
		//touch.tap(tapOptions().withElement(element(paymentsTab))).perform();
		touchpointSelection.click();
	}

	// Tap functionality
	TouchAction touch = new TouchAction(CommonUtils.appDriver);

	// ------------------------METHODS TO ACCESS LOCATORS-------------------------------
	// To tap payments Tab
	public void tapPaymentsTab() {
		paymentsTab.click();
	}

	//To tap Bill Payments
	public void tapBillPayments() {
		touch.tap(tapOptions().withElement(element(billPayments))).perform();
	}


	//To tap back
	public void tapBack() {
		touch.tap(tapOptions().withElement(element(back))).perform();
	}
	
	//To tap tapTransferMoney
	public void tapTransferMoney() {
		touch.tap(tapOptions().withElement(element(transferMoney))).perform();
	}
	
	//To tap transferMoneyMyself
	public void tapTransferMoneyMyself() {
		touch.tap(tapOptions().withElement(element(transferMoneyMyself))).perform();
	}
	
	//To tap ProceedToPayment
	public void tapProceedToPayment() {
		//touch.tap(tapOptions().withElement(element(proceedToPayment))).perform();
		touch.tap(tapOptions().withElement(element(proceedToPaymentBtn))).perform();
	}

	public void continueTransfer() {
		//touch.tap(tapOptions().withElement(element(proceedToPayment))).perform();
		touch.tap(tapOptions().withElement(element(continueTransferButton))).perform();
	}
	
	//To tap enterAmount
	public void enterAmount() {
		amount.sendKeys("5000");
	}

	//To tap tapConfirmAmount
	public void tapConfirmAmount() {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
            utils.validateAndClick(confirmAmtBtn);
            break;

			case"ios":
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				utils.validateAndClick(confirmAmtBtn);
		}
	}
	
	//To tap tapConfirmAndReview
	public void tapConfirmAndReview() {
		touch.tap(tapOptions().withElement(element(confirmAndReview))).perform();
	}
	
	//To tap tapConfirmAndSend
	public void tapConfirmAndSend() {
		//touch.tap(tapOptions().withElement(element(confirmAndSend))).perform();
		touch.tap(tapOptions().withElement(element(confirmAndSendBtn))).perform();
			
	}
	
	//To tap tapDone
	public void tapDone() {
		touch.tap(tapOptions().withElement(element(done))).perform();
	}
	
	//To tap digital bank
	public void tapDigitalBank() {
		touch.tap(tapOptions().withElement(element(digitalBank))).perform();
	}
	
	//To tap selectNewAccount
	public void selectNewAccount() {
		touch.tap(tapOptions().withElement(element(newAccount))).perform();
	}
	
	//To tap enterPhoneNumber
	public void enterPhoneNumber() {
		enterPhoneNumber.sendKeys("521153368");
	}
	
	//To tap confirmPhoneNumber
	public void confirmPhoneNumber() {
		touch.tap(tapOptions().withElement(element(confirmDetails))).perform();
	}
	
	//To tap confirmDetails after entering phone number
	public void confirmDetails() {
		touch.tap(tapOptions().withElement(element(confirmDetails))).perform();
	}
	
	//To tap clickPurposeDropdown
	public void clickPurposeDropdown() {
		touch.tap(tapOptions().withElement(element(purposeDropdown))).perform();
	}
	public void clickPurposeDropdown2() {
		touch.tap(tapOptions().withElement(element(purposeDropdown2))).perform();
	}
	//To tap purposeDropdownSelect
	public void purposeDropdownSelect() {
		touch.tap(tapOptions().withElement(element(purposeDropdownSelect))).perform();
	}
	
	//To tap doneBtn
	public void doneBtn() {
		touch.tap(tapOptions().withElement(element(done))).perform();
	}
	
	public void enterRemarks(String comments) {
		remarks.sendKeys(comments);
		utils.acceptInput(done);
	}
	public void tapTransferMoneyAnotherBank() {
		touch.tap(tapOptions().withElement(element(transferMoneytoAnotherBank))).perform();
	}

	public void clickDEWA()
	{
		utils.validateAndClick(DEWA);
	}
		
	public void selectBiller(String BillerName) {
		int count= biller.size();
		for(int i=0;i<count;i++)
	    {
			String text=biller.get(i).getText();
			System.out.print(text);
			
			if(text.equalsIgnoreCase(BillerName))
		    {
				biller.get(i).click();
				break;
		    	
		    }
	    }

	}

	public void selectCountry(String CountyName) {
		int count= biller.size();
		for(int i=0;i<count;i++)
	    {
			String text=biller.get(i).getText();
			System.out.print("\n"+text);
			
			if(text.equalsIgnoreCase(CountyName))
		    {
				biller.get(i).click();
				break;
		    }
	    }
	}
		
	public void clearField(MobileElement element) {
		/*Actions action = new Actions(appDriver);
		action.moveToElement(element);
		action.doubleClick();
		action.perform();*/
		touch.tap(tapOptions().withTapsCount(2).withElement(element(accountNumber))).perform();
		element.sendKeys("");
		//touch.perform();
		//payments.accountNumber.clear();
		//element.click();
		  //element.sendKeys(Keys.CONTROL + "a");
		  //element.sendKeys(Keys.DELETE);
	}

	public void clear2(MobileElement element)
	{
		while (!element.getText().isEmpty()) {
		   touch.longPress(element(accountNumber));
		   appDriver.getKeyboard().sendKeys(Keys.DELETE);
		}
	}
		
	public void tapConfirmDetailsOnIntrenationPaymentScreen() {
	
		//touch.tap(tapOptions().withElement(element(confirmDetailsBtnInternationalPayment))).perform();
		confirmDetailsBtnInternationalPayment.click();
		
	}
	public void enterAmountForPayment(String amt) {
		
		//double actualamt=Double.valueOf(amt)*10;
		//System.out.print("Amount After multiply entering"+actualamt);
		//amountForPayment.sendKeys(String.valueOf(actualamt));
		amountForPayment.sendKeys(String.valueOf(amt));
	}
	
//	public void clickChargeBearerTypeDropdown() {
//		touch.tap(tapOptions().withElement(element(ChargeBearerTypeDropdownSelect))).perform();
//	}
		
	public void selectChargeBearer(String chargeBearerType) {
		int count= biller.size();
		for(int i=0;i<count;i++)
	    {
			String text=biller.get(i).getText();
			System.out.print("\n"+text);
			
			if(text.equalsIgnoreCase(chargeBearerType))
		    {
				biller.get(i).click();
				break;
		    	
		    }
	    }
	}
		
	public void selectValueFromDropDown(String value) {
		int count= dropDownList.size();
		for(int i=0;i<count;i++)
	    {
			String text=dropDownList.get(i).getText();
			System.out.print("\n"+text);
			
			if(text.equalsIgnoreCase(value))
		    {
				dropDownList.get(i).click();
				break;
		    	
		    }
	    }
	}
	
	public boolean validateErrorMessage(String errMessage) {
		int count= fieldErrorMessage.size();
		for(int i=0;i<count;i++)
	    {
			String text=fieldErrorMessage.get(i).getText();
			System.out.print("\n"+text);
			
			if(text.equalsIgnoreCase(errMessage))
		    {
				return true;
		    }
	    }
		return false;
	}


	public void selectFeesPaidBy(String purppose) {

		switch(purppose.toUpperCase()){
			case "SHARED":
				utils.validateAndClick(sharedCharges);
				break;

			case "BENEFICARY":
				utils.validateAndClick(chargePaidByBeneficiary);
				break;

			case "MYSELF":
				utils.validateAndClick(chargePaidByMyself);
				break;

		}
	}

	public void clickAnotherBankOption() {

		utils.waitUntilVisible(transferMoneytoAnotherBank,5);
		utils.validateAndClick(transferMoneytoAnotherBank);
	}

	public void clickDomesticBankOption() {
		switch (CommonUtils.platform.toLowerCase()){
			case "android":
		utils.scrollTo("Domestic bank");
		utils.validateAndClick(domesticBankOption);
		break;

			case "ios":

	}
	}

	public void enterIBANNumberForDomesticTransfer(String iBAN) {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.scrollTo("Add to beneficiaries");
				utils.validateAndSendKeys(iBanNumber, iBAN);
				break;
			case "ios":
				touch.tap(tapOptions().withElement(element(iBanNumber))).perform();
				utils.validateAndSendKeys(iBanNumber, iBAN);
				utils.validateAndClick(tu.doneButtonOniOSKeyboard);
				break;
		}
	}

	public void uncheckSavedBeneficiaryCheckbox() {
		utils.validateAndClick(addBeneCheckBox);
	}
}
