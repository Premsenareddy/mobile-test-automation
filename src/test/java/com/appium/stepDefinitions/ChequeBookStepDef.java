package com.appium.stepDefinitions;

import com.appium.screens.BankingScreen;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.PaymentsScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class ChequeBookStepDef extends CommonUtils {
	public static final Logger log = Logger.getLogger(ChequeBookStepDef.class);
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	PaymentsScreen payments = new PaymentsScreen(appDriver);
	BankingScreen bankingTab = new BankingScreen(appDriver);
	CommonUtils utils= new CommonUtils();

    @Given("^Select Request Cheque Book \"([^\"]*)\"$")
    public void select_request_cheque_book(String platform) throws Throwable {
        bankingTab.passcode();
        bankingTab.validateQuickActionsLinks(platform);
    }

    @When("^Validate the redirection to Request Cheque Book Tab$")
    public void validate_the_redirection_to_request_cheque_book_tab() throws Throwable {
        bankingTab.valiadateChequeBookPage();
    }

    @And("^select check box and click continue \"([^\"]*)\"$")
    public void select_check_box_and_click_continue_something(String platform) throws Throwable {
        bankingTab.clickContinue(platform);
    }

    @And("^User enters Debit PIN details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void user_enters_debit_pin_details(String pinOne, String pinTwo, String pinThree, String pinFour) throws Throwable {
        bankingTab.confirmDebitPin(pinOne,pinTwo,pinThree,pinFour);
    }

    @Then("^Navigate to eligibility success screen and clicks Next Button$")
    public void navigate_to_eligibility_success_screen_and_clicks_next_button() throws Throwable {
        bankingTab.verifyEligibilitySucesScrn();
    }

    @Then("^Validate error pop up$")
    public void validate_error_pop_up() throws Throwable {
        bankingTab.popUpError();
    }

    @Then("^Clicks on OK button$")
    public void clicks_on_ok_button() throws Throwable {
        bankingTab.clickOK();
    }

    @And("^Scroll till Request chequebook quick link in current account$")
    public void scroll_till_request_chequebook_quick_link_in_current_account() throws Throwable {
        bankingTab.scrollTillCheqbook();
    }

    @And("^Navigates to Savings account and validates for the absence of cheque book link$")
    public void navigates_to_savings_account_and_validates_for_the_absence_of_cheque_book_link() throws Throwable {
        bankingTab.navigateToSavingsActn();
    }

    @Then("^Navigates to Savings account and validates for the presence of cheque book link$")
    public void navigates_to_savings_account_and_validates_for_the_presence_of_cheque_book_link() throws Throwable {
        bankingTab.navigateToSavingsExploreTab();
    }

    @Then("^User clicks on Chat button and wait untill screen loads$")
    public void user_clicks_on_chat_button_and_wait_untill_screen_loads() throws Throwable {
        bankingTab.clickOnChatIcon();
    }

    @Then("^User clicks on back button and wait untill screen loads$")
    public void user_clicks_on_back_button_and_wait_untill_screen_loads() throws Throwable {
        bankingTab.clickOnBckBtn();
    }

    @Then("^User clicks on work address and fills address fields \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_clicks_on_work_address_and_fills_address_fields_something_something(String area, String platform) throws Throwable {
        bankingTab.selectOfcAdd(area, platform);
    }

    @Then("^select Home address$")
    public void select_home_address() throws Throwable {
        bankingTab.selectHomeAddress();
    }

    @And("^select Home address to navigates to oder review screen \"([^\"]*)\"$")
    public void select_home_address_to_navigates_to_oder_review_screen_something(String platform) throws Throwable {
        bankingTab.selectHomeAddress();
        bankingTab.validateOrderReviewScreen(platform);
    }

    @And("^select office address to navigates to oder review screen \"([^\"]*)\"$")
    public void select_office_address_to_navigates_to_oder_review_screen_something(String platform) throws Throwable {
        bankingTab.selectOfficeAddress();
        bankingTab.validateOrderReviewScreen(platform);
    }

    @Then("^validates for the successful request message for cheque book$")
    public void validates_for_the_successful_request_message_for_cheque_book() throws Throwable {
        bankingTab.validateSuccessMsg();
    }

    @Then("^validates for the unsuccessful request message for cheque book$")
    public void validates_for_the_unsuccessful_request_message_for_cheque_book() throws Throwable {
        bankingTab.validateUnSuccessfulMsg();
    }

    @And("^confirm uploaded signature$")
    public void confirm_uploaded_signature() throws Throwable {
        bankingTab.confirmSignature();
    }

    @And("^Navigate to signature consent screen to confirm signature$")
    public void navigate_to_signature_consent_screen_to_confirm_signature() throws Throwable {

    }

    @And("^Navigate to signature consent screen to confirm signature \"([^\"]*)\"$")
    public void navigate_to_signature_consent_screen_to_confirm_signature_something(String olatform) throws Throwable {
        bankingTab.validateConsentScreen(platform);
    }

    @Then("^finally redirected to order review screen to confirm and order the cheque book \"([^\"]*)\"$")
    public void finally_redirected_to_order_review_screen_to_confirm_and_order_the_cheque_book_something(String platform) throws Throwable {
        bankingTab.validateOrderReviewScreen(platform);
        bankingTab.validateSuccessMsg();    }

    @And("^User clicks on the Account to navigate to banking tab$")
    public void user_clicks_on_the_account_to_navigate_to_banking_tab() throws Throwable {
        bankingTab.selectAccountBT();
    }

}
