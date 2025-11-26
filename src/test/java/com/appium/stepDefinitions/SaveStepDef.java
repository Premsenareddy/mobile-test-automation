package com.appium.stepDefinitions;

import org.apache.log4j.Logger;

import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.PaymentsScreen;
import com.appium.screens.BankingScreen;
import com.appium.utils.CommonUtils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaveStepDef extends CommonUtils {
	public static final Logger log = Logger.getLogger(SaveStepDef.class);
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	PaymentsScreen payments = new PaymentsScreen(appDriver);
	BankingScreen bankingTab = new BankingScreen(appDriver);
	CommonUtils utils= new CommonUtils();
	
	@When("^I click on banking Tab$")
    public void i_click_on_banking_tab() throws Throwable {
		bankingTab.bankingTab();
    }

	@When("^I view top up banner$")
    public void i_view_top_up_banner() throws Throwable {
		bankingTab.isTopUpBannerDisplayed();
    }

    @When("^User clicks on TopUp Button from Quick Links$")
    public void i_click_on_topup_button_from_quick_links() throws Throwable {
        bankingTab.topUpButtonfromQuickLinks();
    }

    @When("^User top up user account$")
    public void user_top_up_user_account() throws Throwable {
    	bankingTab.topUPAccount();
    }
	
    @Then("^User topup account using debit card$")
    public void user_topup_account_using_debit_card() throws Throwable {
        bankingTab.topUPDebitCard();
    }

    @Then("^user navigates to transfer details screen (.+) , (.+) , (.+) , (.+) , (.+)$")
    public void user_navigates_to_transfer_details_screen_(String amount, String card, String name, String expirydate, String cvv) throws Throwable {
    		switch (CommonUtils.platform.toLowerCase()){
                case "android":
                    bankingTab.topupTransferScreen(amount, card, name, expirydate, cvv);
                    break;

                case "ios":
                    bankingTab.topupTransferScreenIOS(amount, card, name, expirydate, cvv);
                    break;
    		}
    }



    @When("^User notices missing of topup banner$")
    public void user_notices_missing_of_topup_banner() throws Throwable {
    	bankingTab.bannerRemoved();
    }

    @Then("^validate topup banner removal$")
    public void validate_topup_banner_removal() throws Throwable {

    }
    

    @And("^Select cards$")
    public void select_cards() throws Throwable {
        bankingTab.clickCardsTab();
    }

    @And("^Select \"([^\"]*)\" card from Banking tab$")
    public void select_cardsType(String strCardType) throws Throwable {
        bankingTab.clickCardsTab(strCardType);
    }

    @And("User Clicks on back button on banking tab")
    public void clickBackBankingTab() throws Throwable{
        bankingTab.clickBackBankingTab();
    }


    @And("^Scroll to set debit card limits in ios$")
    public void scroll_to_set_debit_card_limits_in_ios() throws Throwable {
        bankingTab.scrollToDebitCardLimitsIos();
    }

    @And("^Validate card details are hidden \"([^\"]*)\"$")
    public void validate_card_details_are_hidden_something(String strArg1) throws Throwable {
        bankingTab.hiddenCardNumber();
        bankingTab.hiddenCardCVV(strArg1);
        bankingTab.hiddenCardExpiry(strArg1);
    }

    @And("^Validate card details are hidden \"([^\"]*)\" \"([^\"]*)\"$")
    public void validate_card_details_are_hidden_something_something(String env, String osType) throws Throwable {

        if("ios".equalsIgnoreCase(osType)){
            bankingTab.hiddenCardNumberIos();
        } else {
            bankingTab.hiddenCardNumber();
            bankingTab.hiddenCardCVV(env);
            bankingTab.hiddenCardExpiry(env);
        }
    }

    @And("^Click on Show Details text$")
    public void click_on_show_details_text() throws Throwable {
        bankingTab.showDetails();
    }
    
    @Then("^User changes the linking of the cards account from current to savings$")
    public void user_changes_the_linking_of_the_cards_account_from_current_to_savings() throws Throwable {
        bankingTab.changeCardLink();
    }

    @Then("^User changes the linking of the cards account from current to savings \"([^\"]*)\"$")
    public void user_changes_the_linking_of_the_cards_account_from_current_to_savings_something(String oSType) throws Throwable {
        bankingTab.changeCardLinkIos(oSType);
    }
    
    
    @Then("^User views notification upon card Freeze$")
    public void user_views_notification_upon_card_freeze() throws Throwable {
    	bankingTab.verifyCardFrozen();
    }

    @Then("^User views notification upon card Unfreeze$")
    public void user_views_notification_upon_card_unfreeze() throws Throwable {
        bankingTab.verifyCardNoLongerFrozenNotification();
    }

    @And("^Scroll to Freeze card section$")
    public void scroll_to_freeze_card_section() throws Throwable {
        bankingTab.scrollFreezeCardSctn();
    }

    @And("^Freeze the card$")
    public void freeze_the_card() throws Throwable {
    	bankingTab.freezecard();
    }

    @And("^validate the text and freeze the card$")
    public void validate_the_text_and_freeze_the_card() throws Throwable {
    	bankingTab.verifyFreezeText();
    }

    @And("^Scroll to Unfreeze card section$")
    public void scroll_to_unfreeze_card_section() throws Throwable {
        bankingTab.scrollUnfreezeCardSctn();
    }

    @And("^UnFreeze the card$")
    public void unfreeze_the_card() throws Throwable {
        bankingTab.unFreezecard();
    }

    @And("^validate the text and Unfreeze the card$")
    public void validate_the_text_and_unfreeze_the_card() throws Throwable {
        bankingTab.verifyUnFreezeText();
    }

    @And("^validate the text and Unfreeze the card in ios$")
    public void validate_the_text_and_unfreeze_the_card_in_ios() throws Throwable {
        bankingTab.verifyUnFreezeTextIos();
    }
    
    @Then("^User views notification upon pin change$")
    public void user_views_notification_upon_pin_change() throws Throwable {
        bankingTab.verifyCardPINChngNotification();
    }

    @And("^Scroll to Change pin buton$")
    public void scroll_to_change_pin_buton() throws Throwable {
        bankingTab.scrollTooChnPIN();
    }

    @And("^Click change pin$")
    public void click_change_pin() throws Throwable {
       bankingTab.clickChangePIN();
    }

    @And("^User should see change pin is (enabled|disabled)$")
    public void click_change_pin(String strCardState) throws Throwable {
        bankingTab.validateChangePinState(strCardState);
    }

    @And("^Enter pin ann confirm (.+) (.+) (.+)$")
    public void enter_pin_ann_confirm(String passcode, String debitcardpin, String confirmpin) throws Throwable {
    	bankingTab.confirmPasscodeAndDebitPIN(passcode, debitcardpin, confirmpin);
    }

    //Online Payments
    
    @And("^Scroll to Online payments$")
    public void scroll_to_online_payments() throws Throwable {
        bankingTab.scrollToOP();
    }

    @And("^Toggle off Online Payments$")
    public void toggle_off_online_payments() throws Throwable {
        bankingTab.clickToggleOnlinePayment();
    }

    @And("^validate the notification upon switching off online payment toggle$")
    public void validate_the_notification_upon_switching_off_online_payment_toggle() throws Throwable {
        bankingTab.verifyTOPNotification();
    }
    
    @Then("^toggle on Online Payments and view for the notification upon toggling$")
    public void toggle_on_online_payments_and_view_for_the_notification_upon_toggling() throws Throwable {
    	bankingTab.clickToggleOnlinePayment();
    	bankingTab.verifyOPNotificationUP();
    }
    
    // International Payments

    @And("^Scroll to International payments$")
    public void scroll_to_international_payments() throws Throwable {
       bankingTab.scrollToInternationalP();
    }

    @And("^Toggle off International Payments$")
    public void toggle_off_international_payments() throws Throwable {
    	bankingTab.clickToggleInternationalPayment();
    }

    @And("^validate the notification upon switching off International payment toggle$")
    public void validate_the_notification_upon_switching_off_international_payment_toggle() throws Throwable {
    	bankingTab.verifyTIPNotification();
    }
    
    
    @Then("^toggle on International Payments and view for the notification upon toggling$")
    public void toggle_on_international_payments_and_view_for_the_notification_upon_toggling() throws Throwable {
    	bankingTab.clickToggleInternationalPayment();
    	bankingTab.verifyIPNotificationUP();
    }

    // @SetDCLpoc
      

    @And("^Scroll to set debit card limits$")
    public void scroll_to_set_debit_card_limits() throws Throwable {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                bankingTab.scrollToDebitCardLimits();
                break;
            case "ios":
                bankingTab.scrollToDebitCardLimitsIos();
                break;
        }
    }

    @And("^Click on set debit card limits$")
    public void click_on_set_debit_card_limits() throws Throwable {
       bankingTab.clickDebitCardLimits();
    }

    @And("^Verify and Select POC limit$")
    public void verify_and_select_poc_limit() throws Throwable {
        bankingTab.clickPOCCardLimits();
    }

    @And("^Verify and Select POC limit in ios$")
    public void verify_and_select_poc_limit_in_ios() throws Throwable {
        bankingTab.clickPOCCardLimitsIos();
    }

    @And("^navigate to limit change screen to enter poc limit and save$")
    public void navigate_to_limit_change_screen_to_enter_poc_limit_and_save() throws Throwable {
       bankingTab.setPOCCardLimits();
    }

    @And("^navigate to limit change screen in ios to enter poc limit and save$")
    public void navigate_to_limit_change_screen_in_ios_to_enter_poc_limit_and_save() throws Throwable {
        bankingTab.setPOCCardLimitsIos();
    }
    
    @Then("^User returns back and validates notification upon successful POC limit change$")
    public void user_returns_back_and_validates_notification_upon_successful_poc_limit_change() throws Throwable {
    	bankingTab.verifyPOCLimitUpdate();
    }

    @Then("^User returns back and validates notification upon successful POC limit change in ios$")
    public void user_returns_back_and_validates_notification_upon_successful_poc_limit_change_in_ios() throws Throwable {
        bankingTab.verifyPOCLimitUpdateIos();
    }
    
    //@SetDCLOnlinePayments
    
    

    @And("^Verify and Select Online Payments limit$")
    public void verify_and_select_online_payments_limit() throws Throwable {
        bankingTab.clickOnlinePLimits();
    }

    @And("^Verify and Select Online Payments limit in ios$")
    public void verify_and_select_online_payments_limit_in_ios() throws Throwable {
        bankingTab.clickOnlinePLimitsIos();
    }

    
    @And("^navigate to limit change screen to enter op limit and save$")
    public void navigate_to_limit_change_screen_to_enter_op_limit_and_save() throws Throwable {
    	bankingTab.setOnlinePaymentLimits();
    }

    @And("^navigate to limit change screen in ios to enter op limit and save$")
    public void navigate_to_limit_change_screen_in_ios_to_enter_op_limit_and_save() throws Throwable {
        bankingTab.setOnlinePaymentLimitsIos();
    }


    @Then("^User returns back and validates notification upon successful OP limit change$")
    public void user_returns_back_and_validates_notification_upon_successful_op_limit_change() throws Throwable {
       bankingTab.verifyOnlinePaymentLimitUpdate();
    }

    @Then("^User returns back and validates notification upon successful OP limit change in ios$")
    public void user_returns_back_and_validates_notification_upon_successful_op_limit_change_in_ios() throws Throwable {
        bankingTab.verifyOnlinePaymentLimitUpdateIos();
    }
    
    
    //@SetDCLatmWithdrawals   

    @And("^Verify and Select ATM Payments limit$")
    public void verify_and_select_atm_payments_limit() throws Throwable {
         bankingTab.clickATMChangeLimits();
    }

    @And("^Verify and Select ATM Payments limit in ios$")
    public void verify_and_select_atm_payments_limit_in_ios() throws Throwable {
        bankingTab.clickATMChangeLimitsIos();
    }

    @And("^navigate to limit change screen to enter atm limit and save$")
    public void navigate_to_limit_change_screen_to_enter_atm_limit_and_save() throws Throwable {
        bankingTab.setATMLimits();
    }

    @And("^navigate to limit change screen in ios to enter atm limit and save$")
    public void navigate_to_limit_change_screen_in_ios_to_enter_atm_limit_and_save() throws Throwable {
        bankingTab.setATMLimitsIos();
    }
    
    @Then("^User returns back and validates notification upon successful ATM limit change$")
    public void user_returns_back_and_validates_notification_upon_successful_atm_limit_change() throws Throwable {
       bankingTab.verifyATMLimitUpdate();
    }

    @Then("^User returns back and validates notification upon successful ATM limit change in ios$")
    public void user_returns_back_and_validates_notification_upon_successful_atm_limit_change_in_ios() throws Throwable {
        bankingTab.verifyATMLimitUpdateIos();
    }
    
    //@CompleteAccountCreation
    
    @And("^I click on Account verification button$")
    public void i_click_on_account_verification_button() throws Throwable {
       // bankingTab.clickActnVerfnBanner();
    }

    @And("^I click on Account verification button in ios$")
    public void i_click_on_account_verification_button_in_ios() throws Throwable {
        bankingTab.clickActnVerfnBannerIos();
    }
    
    @And("^Select card color and Schedule debit card delivery$")
    public void select_card_color_and_schedule_debit_card_delivery() throws Throwable {
       //  bankingTab.selectCardToDeliver();
    }

    @And("^Select card color and Schedule debit card delivery \"([^\"]*)\"$")
    public void select_card_color_and_schedule_debit_card_delivery(String platform) throws Throwable {
        bankingTab.selectCardToDeliver(platform);
    }

    @And("^I click on Account verification button \"([^\"]*)\"$")
    public void i_click_on_account_verification_button(String platform) throws Throwable {
        bankingTab.clickActnVerfnBanner(platform);
    }

    @And("^Select card delivery address and time slot$")
    public void select_card_delivery_address_and_time_slot() throws Throwable {
        bankingTab.selectLocationToDeliver();
    }
    
//    @Then("^user navigates to Tracking card screen \"([^\"]*)\"$")
//    public void user_navigates_to_tracking_card_screen(String platform) throws Throwable {
//        bankingTab.verifyTrackCardScreen(platform);
//    }

    @Then("^user navigates to Tracking card screen \"([^\"]*)\"$")
    public void user_navigates_to_tracking_card_screen(String platform) throws Throwable {
        bankingTab.verifyTrackCardScreen(platform);
    }

    @And("^Click on Card Activate \"([^\"]*)\"$")
    public void click_on_card_activate_something(String platform) throws Throwable {
        bankingTab.isCardActivated(platform);
    }
    
    @Then("^Activate card by setting pin and confirm$")
    public void activate_card_by_setting_pin_and_confirm() throws Throwable {
    	bankingTab.activateDebitPIN();
    }
    
   // @deliverCard

    @And("^User clicks on the Account$")
    public void user_clicks_on_the_account() throws Throwable {
        bankingTab.selectAccount();
    }

    @Then("^capture Tracking ID \"([^\"]*)\"$")
    public void capture_tracking_id_something(String platform) throws Throwable {
//        bankingTab.getTrackingId(platform);
    }
    
    //
    
    @When("^User scrolls to filter icon$")
    public void user_scrolls_to_filter_icon() throws Throwable {
        bankingTab.scrollToFilter();
    }

    //child :

    @When("^User scrolls to child account filter icon$")
    public void user_scrolls_to_child_account_filter_icon() throws Throwable {
        bankingTab.scrollToChildFilter();
    }



    @When("^User clicks on filter icon and select filter by month$")
    public void user_clicks_on_filter_icon_and_select_filter_by_month() throws Throwable {
        bankingTab.isLastMonthDisplayed();
    }

    @Then("^user redirects to accounts tab and validate transactions by month$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_month() throws Throwable {
        bankingTab.isLastMonthTxnDisplayed();
    }

    @Then("^user redirects to child accounts tab and validate transactions by month$")
    public void user_redirects_to_child_accounts_tab_and_validate_transactions_by_month() throws Throwable {
        bankingTab.childLastMonthTxnDisplayed();
    }

    @Then("^user redirects to child accounts tab and validate transactions by filter$")
    public void user_redirects_to_child_accounts_tab_and_validate_transactions_by_filter() throws Throwable {
        bankingTab.childAmtTxnDisplayed();
    }

    @Then("^user redirects to accounts tab and validate transactions by date range (.+) (.+) (.+)$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_date_range(String frommonth, String tomonth, String date) throws Throwable {
    	bankingTab.isDateRangeDisplayed(frommonth, tomonth, date);
    }

    @Then("^user redirects to accounts tab in ios device and validate transactions by date range (.+) (.+) (.+)$")
    public void user_redirects_to_accounts_tab_in_ios_device_and_validate_transactions_by_date_range(String frommonth, String tomonth, String date) throws Throwable {
        bankingTab.isDateRangeDisplayedIos(frommonth, tomonth, date);
    }

    @Then("^user redirects to child accounts tab and validate transactions by date range (.+) (.+) (.+)$")
    public void user_redirects_to_child_accounts_tab_and_validate_transactions_by_date_range(String frommonth, String tomonth, String date) throws Throwable {
        bankingTab.childDateRangeDisplayed(frommonth, tomonth, date);
    }
    
    @Then("^user redirects to accounts tab and validate transactions by filter$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_filter() throws Throwable {
    	bankingTab.isLastMonthTxnDisplayed();
    }
    
    @Then("^user redirects to accounts tab and validate transactions by date range$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_date_range() throws Throwable {
    	bankingTab.isLastMonthTxnDisplayed();
    }

    @Then("^user navigate to select date range (.+) (.+)$")
    public void user_navigate_to_select_date_range(String min, String max) throws Throwable {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                bankingTab.isAmountRangeSelected(min, max);
                break;
            case "ios":
                bankingTab.isAmountRangeSelectedIos(min, max);
                break;
        }
    }

    @Then("^user navigate to child select date range (.+) (.+)$")
    public void user_navigate_to_child_select_date_range(String min, String max) throws Throwable {
        bankingTab.childAmountRangeSelected(min, max);
    }
    
    @Then("^user selects Transaction type as credit$")
    public void user_selects_transaction_type_as_credit() throws Throwable {
        bankingTab.isTransactionTypeSelected();
    }
    
    @Then("^user redirects to accounts tab and validate transactions by filter credit$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_filter_credit() throws Throwable {
        bankingTab.isTxnTypeListDisplayed();
    }

    @Then("^user redirects to child accounts tab and validate transactions by filter credit$")
    public void user_redirects_to_child_accounts_tab_and_validate_transactions_by_filter_credit() throws Throwable {
        bankingTab.childTxnTypeListDisplayedCredited();
    }

    @Then("^user redirects to child accounts tab and validate transactions by filter Debited$")
    public void user_redirects_to_child_accounts_tab_and_validate_transactions_by_filter_debited() throws Throwable {
        bankingTab.childTxnTypeListDisplayedDebited();
    }
    
    @When("^User scrolls to all transactions arrow$")
    public void user_scrolls_to_all_transactions_arrow() throws Throwable {
        bankingTab.scrollToTxnArrow();
    }

    @Then("^User selects Spent Transactions$")
    public void user_selects_spent_transactions() throws Throwable {
        bankingTab.isSpentTransactionsDisplayed();
    }

    @Then("^user redirects to accounts tab and validate transactions by Spent$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_spent() throws Throwable {
        bankingTab.isSpentListDisplayed();
    }
    
    @Then("^User selects received Transactions$")
    public void user_selects_received_transactions() throws Throwable {
        bankingTab.isReceivedTxnTypeDisplayed();
    }

    @Then("^user redirects to accounts tab and validate transactions by received$")
    public void user_redirects_to_accounts_tab_and_validate_transactions_by_received() throws Throwable {
        bankingTab.isReceiveListDisplayed();
    }

    //UAE PASS

    @And("^User clicks on the Bank Account$")
    public void user_clicks_on_the_bank_account() throws Throwable {
        bankingTab.clickBankAccount();
    }

    @When("^User scrolls to lets start icon$")
    public void user_scrolls_to_lets_start_icon() throws Throwable {
        bankingTab.scrollToStart();
    }

    @And("^Select bundled accounts$")
    public void select_bundled_accounts() throws Throwable {
        bankingTab.selectBundledAccounts();
    }

    @And("^Continue with uae pass$")
    public void continue_with_uae_pass() throws Throwable {
        bankingTab.continueWithUAEPass();
    }

    @And("^User navigates to UAE PASS App and validates documents$")
    public void user_navigates_to_uae_pass_app_and_validates_documents() throws Throwable {
        bankingTab.validateDocuments();
    }

    @And("^User toggles On and clicks Allow Documents sharing$")
    public void user_toggles_on_and_clicks_allow_documents_sharing() throws Throwable {
        bankingTab.allowDocumentsSharing();
    }

    @And("^User Authenticates uae pass \"([^\"]*)\"$")
    public void user_authenticates_uae_pass_something(String env) throws Throwable {
        bankingTab.authUAEPass(env);
    }

    @And("^scroll to Unfreeze card section and selects unfreeze$")
    public void scroll_to_unfreeze_card_section_and_selects_unfreeze() throws Throwable {
        bankingTab.childUnfreezePermission();
    }

    @And("^User verifies Quick actions link$")
    public void user_verifies_quick_actions_link() throws Throwable {
       // bankingTab.validateQuickActionsLink();
    }

    @And("^User verifies Quick actions link \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
    public void user_verifies_quick_actions_link(String transferMoney, String myCard, String accountDetails) throws Throwable {
        bankingTab.validateQuickActionsLink(transferMoney, myCard, accountDetails);
    }

    @Then("^user navigates to transfer from and transfer to screen successfully$")
    public void user_navigates_to_transfer_from_and_transfer_to_screen_successfully() throws Throwable {
        bankingTab.navigateToTransferMoneyScreen();
    }

    @Then("^user navigates to cards section from Explore Tab \"([^\"]*)\"$")
    public void user_navigates_to_cards_section_from_explore_tab_something(String actionLink) throws Throwable {
        bankingTab.navigateToCardsScreen(actionLink);
    }

    @Then("^user navigates to related quick action link section from Explore Tab \"([^\"]*)\"$")
    public void user_navigates_to_account_details_section_from_explore_tab(String strArg1) throws Throwable {
        bankingTab.navigateToCardsScreen(strArg1);
    }

    @Then("^validate title of the Screen for Transfer Money$")
    public void validate_title_of_the_screen_for_transfer_money() throws Throwable {
        bankingTab.validateScreenTMTitle();
    }

    @Then("validate title of the cards navigation Screen {string}")
    public void validate_title_of_the_cards_navigation_screen(String string) {
        //bankingTab.validateCardScreenTitle(string);
    }

    @Then("^validate title of the related quick action link Screen \"([^\"]*)\" \"([^\"]*)\"$")
    public void validate_title_of_the_related_quick_action_link_screen(String screentitle, String platform) throws Throwable {
        bankingTab.validateCardScreenTitle(screentitle, platform);
    }

    @Then("validate title of the related quick action link {string}")
    public void validate_title_of_the_accounts_navigation_screen(String string) {

    }

    @Then("^validate title of the related quick action link Screen \"([^\"]*)\"$")
    public void validate_title_of_the_related_quick_action_link_screen_something(String screentitle) throws Throwable {
       // bankingTab.validateCardScreenTitle(screentitle);
    }
}
