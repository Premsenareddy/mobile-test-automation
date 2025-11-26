package com.appium.stepDefinitions;

import com.appium.utils.WaitUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;
import com.appium.screens.TelecomUtilityPayments;
import com.appium.screens.TransactionLimits;
import com.appium.utils.CommonUtils;

public class TelecomUtilityPaymentSteps extends CommonUtils {
	

	public static final Logger log = Logger.getLogger(TransactionLimits.class);
	TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);

    @Then("^I see the pay bills option on the payment home screen$")
    public void i_see_the_pay_bills_option_on_the_payment_home_screen() throws Throwable {
        tu.validatePayABillOption();
    }

    @Then("^I see all the payment types of etisalat$")
    public void i_see_all_the_payment_types_of_etisalat() throws Throwable {
       Assert.assertTrue(tu.mobileGSM.isDisplayed(), "GSM is not displayed");
       Assert.assertTrue(tu.landlineElife.isDisplayed(), "Elife is not displayed");
       Assert.assertTrue(tu.waselRecharge.isDisplayed(), "Wasel Recharge is not displayed");
       Assert.assertTrue(tu.alShamil.isDisplayed(), "Al Shamil is not displayed");
       Assert.assertTrue(tu.eVision.isDisplayed(), "Evision");
    }


    @And("^I click pay bills option$")
    public void i_click_pay_bills_option() throws Throwable {
        validateAndClick(tu.paymentMainMenu);
    }

    @And("^I see list of all billers$")
    public void i_see_list_of_all_billers() throws Throwable {
        tu.validateAllBillers();
    }

    @And("^I click on Etisalat option$")
    public void i_click_on_etisalat_option() throws Throwable {
        WaitUtil.pause();
        validateAndClick(tu.etisalatBiller);
    }


    @Then("^I see the review screen$")
    public void i_see_the_review_screen() throws Throwable {
        Assert.assertTrue(tu.reviewDetailsScreen.isDisplayed(), "Review Details screen is not displayed");
    }

    @Then("^I should see the payment success screen$")
    public void i_should_see_the_payment_success_screen() throws Throwable {
    	 waitUntilVisible(tu.successScreen, 15);
    	 Assert.assertTrue(tu.successScreen.isDisplayed(), "Success Details screen is not displayed");
    	 Assert.assertTrue(tu.transactionID.isDisplayed(), "Payment was failed");
    }


    @And("^I click on \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void i_click_on_something_and_enter_something(String etisalattype, String accountphonenumber) throws Throwable {
       tu.enterAccountNumberOrPhoneNumber(etisalattype, accountphonenumber);
    }

    @And("^I uncheck the saved payee checkbox$")
    public void i_uncheck_the_saved_payee_checkbox() throws Throwable {
       tu.clickSavePayeeCheckbox();
    }

    @And("^I click on Proceed to Payment button$")
    public void i_click_on_button_to_do_payment_enquiry() throws Throwable {
       tu.clickContinueButtonAfterEnquiry();
    }


    @And("^I click on confirm and transfer button$")
    public void i_click_on_confirm_and_send_button() throws Throwable {
      validateAndClick(tu.confirmPaymentOnReviewScreen);
    }

    @And("^I enter the \"([^\"]*)\" for \"([^\"]*)\"$")
    public void i_enter_the_something(String amount,String EtisalatType) throws Throwable {
       //utils.waitUntilVisible(tu.amountTextField, 120);
      tu.enterUtilityPaymentAmount(EtisalatType,amount);
    }

    @And("^I click on Salik icon$")
    public void i_click_on_salik_icon() throws Throwable {
        tu.clickSalikIcon();
    }


    @And("^I enter the account number as \"([^\"]*)\"$")
    public void i_enter_the_account_number_as_something(String salikAccountNumber) throws Throwable {
        tu.enterSalikAcountNumber(salikAccountNumber);
    }

    @And("^I enter the pin as \"([^\"]*)\"$")
    public void i_enter_the_pin_as_something(String accountNumberPin) throws Throwable {
        tu.enterSalikPin(accountNumberPin);
    }

    @And("^I enter the amount as \"([^\"]*)\"$")
    public void i_enter_the_amount_as_something(String amount) throws Throwable {
        tu.enterAmount(amount);
    }
}