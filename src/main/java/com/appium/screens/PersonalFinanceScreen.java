package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class PersonalFinanceScreen extends BaseScreen{

    CommonUtils utils = new CommonUtils();
    public static final Logger log = Logger.getLogger(ExploreScreen.class);

    // ------------------PAGE FACTORY--------------------------//
    public PersonalFinanceScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "tv_pf_title")
    public MobileElement pfTitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Al Hilal Personal Finance\"]")
    public MobileElement pfTitleIOS;

    @AndroidFindBy(id = "tv_pf_condition")
    public MobileElement pfCondition;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Why should you apply?\"]")
    public MobileElement pfConditionIOS;

    @AndroidFindBy(id = "tv_title")
    public MobileElement pfLimit;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Financing up to 4 Million AED\"]")
    public MobileElement pfLimitIOS;

    @AndroidFindBy(id = "bv_im_interested")
    public MobileElement calMonthlyPaymentBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I'm interested\"]")
    public MobileElement calMonthlyPaymentBtnIOS;

    @AndroidFindBy(id = "tv_calculator_title")
    public MobileElement calScrTitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Enter your finance amount and preferred term, and we will calculate your monthly payments\"]")
    public MobileElement calScrTitleIOS;

    @AndroidFindBy(id= "tv_calculated_amount")
    public MobileElement monthlyPaymentAmt;

    @AndroidFindBy(id = "bv_apply_now")
    public MobileElement LeadCaptureBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Apply now\"]")
    public MobileElement LeadCaptureBtnIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")
    public MobileElement LeadCnfmMsg;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you for your interest!\"]")
    public MobileElement LeadCnfmMsgIOS;

    @AndroidFindBy(id= "tv_reference_number")
    public MobileElement appRefNo;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Application ref. number: \"]")
    public MobileElement appRefNoIOS;

    @AndroidFindBy(id = "btn_home_page")
    public MobileElement backToHomeBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back to homepage\"]")
    public MobileElement backToHomeBtnIOS;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,\"Apply for a new personal finance\")]")
    public MobileElement applyNewPfText;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apply for a new personal finance\"]")
    public MobileElement applyNewPfTextIOS;

    @AndroidFindBy(id="iv_apply")
    public MobileElement applyNewPfIcon;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Apply for a new personal finance\"]")
    public MobileElement applyNewPfIconIOS;

    @AndroidFindBy(id="tv_account_type")
    public MobileElement accountType;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Finance account\"]")
    public MobileElement accountTypeIOS;

    @AndroidFindBy(id = "tv_account_number")
    public MobileElement accountNumber;

    @AndroidFindBy(id="tv_available_balance")
    public MobileElement outstandingBalance;

    @AndroidFindBy(id="tv_available_balance_label")
    public MobileElement outstandingBalLable;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Outstanding amount\"]")
    public MobileElement outstandingBalLableIOS;

    @AndroidFindBy(id="tv_sub_title")
    public MobileElement pleaseNoteTxt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Please note\"]")
    public MobileElement pleaseNoteTxtIOS;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[2]")
    public MobileElement acNumberInSummary;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Finance account\"]")
    public MobileElement finActTxtIOS;

    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.TextView[2]")
    public MobileElement outstandingBalanceInSummary;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Outstanding amount\"]")
    public MobileElement outStandBalInSumryTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.TextView[2]")
    public MobileElement nextPaymentAmt;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Next payment amount\"]")
    public MobileElement nextPayAmtTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.TextView[2]")
    public MobileElement nextPayDueDate;
    @iOSXCUITFindBy(id="//XCUIElementTypeStaticText[@name=\"Next payment due date\"]")
    public MobileElement nextPayDueDateTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[5]/android.widget.TextView[2]")
    public MobileElement remainingPayments;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Remaining payments\"]")
    public MobileElement remainingPayTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[6]/android.widget.TextView[2]")
    public MobileElement paymentAccount;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Payment account\"]")
    public MobileElement paymentAccountTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView[2]")
    public MobileElement contractDate;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Contract date\"]")
    public MobileElement contractDateTxtIOS;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup[8]/android.widget.TextView[2]")
    public MobileElement overDueAmt;
    @iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Overdue amount\"]")
    public MobileElement overDueAmtTxtIOS;

    public void applyNewFinance(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(applyNewPfText.getText().contains("Apply for a new personal finance"), "Apply New PF Text is missing");
                applyNewPfIcon.click();
                break;
            case "ios":
                Assert.assertTrue(applyNewPfTextIOS.isDisplayed(), "Apply New PF Text is missing");
                applyNewPfIconIOS.click();
        }

    }

    public void verifyPreviousLoans(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(accountType.getText().contains("Finance Account"), "Account Type is missing");
                Assert.assertTrue(accountNumber.isDisplayed());
                Assert.assertTrue(outstandingBalance.isDisplayed());
                Assert.assertTrue(outstandingBalLable.isDisplayed());
                Assert.assertTrue(pleaseNoteTxt.isDisplayed(), "please note text is missing");
                accountType.click();
                break;
            case "ios":
                Assert.assertTrue(accountTypeIOS.isDisplayed(), "Account Type is missing");
                Assert.assertTrue(outstandingBalLableIOS.isDisplayed());
                Assert.assertTrue(pleaseNoteTxtIOS.isDisplayed(), "please note text is missing");
                accountTypeIOS.click();
        }

    }

    public void verifyPreviousLoanSummary(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(acNumberInSummary.isDisplayed());
                Assert.assertTrue(outstandingBalanceInSummary.isDisplayed());
                Assert.assertTrue(nextPaymentAmt.isDisplayed());
                Assert.assertTrue(nextPayDueDate.isDisplayed());
                Assert.assertTrue(remainingPayments.isDisplayed());
                Assert.assertTrue(paymentAccount.isDisplayed());
                Assert.assertTrue(contractDate.isDisplayed());
                Assert.assertTrue(overDueAmt.isDisplayed());
                break;
            case "ios":
                utils.waitUntilVisible(finActTxtIOS, 30);
                Assert.assertTrue(finActTxtIOS.isDisplayed());
                Assert.assertTrue(outStandBalInSumryTxtIOS.isDisplayed());
                Assert.assertTrue(nextPayAmtTxtIOS.isDisplayed());
                Assert.assertTrue(nextPayDueDateTxtIOS.isDisplayed());
                Assert.assertTrue(remainingPayTxtIOS.isDisplayed());
                Assert.assertTrue(paymentAccountTxtIOS.isDisplayed());
                Assert.assertTrue(contractDateTxtIOS.isDisplayed());
                Assert.assertTrue(overDueAmtTxtIOS.isDisplayed());
        }
    }



    public void verifyPersonalFinanceEligibilityContent() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(pfTitle.getText().contains("Al Hilal Personal Finance"), "PF Title is not matching");
                Assert.assertTrue(pfCondition.isDisplayed(), "pfCondition is not displayed");
                break;
            case "ios":
                Assert.assertTrue(pfTitleIOS.isDisplayed(), "pfTitle is not displayed");
                Assert.assertTrue(pfConditionIOS.isDisplayed(), "pfCondition is not displayed");

        }

    }

    public void clickCalculateMonthlyPaymentsButton(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("I’m interested");
                calMonthlyPaymentBtn.click();
                break;
            case "ios":
                utils.scrollTo("I'm interested");
                calMonthlyPaymentBtnIOS.click();

        }


    }

    public void verifyCalculatorScreenContent(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(calScrTitle.isDisplayed(), "calculator Title is not displayed");
                Assert.assertTrue(monthlyPaymentAmt.getText().contains("2,534.68 AED"));
                utils.scrollTo("I’m interested");
                LeadCaptureBtn.click();
                break;
            case "ios":
                Assert.assertTrue(calScrTitleIOS.isDisplayed(), "calculator Title is not displayed");
                LeadCaptureBtnIOS.click();

        }

    }

    public void leadCaptureConfirmation(){
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(LeadCnfmMsg.getText().contains("Thank you for your interest!"),  "Lead confirmation Text is missing");
                Assert.assertTrue(appRefNo.isDisplayed(), "Application Reference number is missing");
                backToHomeBtn.click();
                break;

            case "ios":
                Assert.assertTrue(LeadCnfmMsgIOS.getText().contains("Thank you for your interest!"),  "Lead confirmation Text is missing");
                Assert.assertTrue(appRefNoIOS.isDisplayed(), "Application Reference number is missing");
                backToHomeBtnIOS.click();

        }
    }
}
