package com.appium.stepDefinitions;

import com.appium.screens.ManageBeneficiaryScreens;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.PaymentsScreen;
import com.appium.utils.CommonUtils;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class ManageBeneficiariesSteps extends CommonUtils {


    public static final Logger log = Logger.getLogger(ManageBeneficiariesSteps.class);
    MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
    ManageBeneficiaryScreens mb = new ManageBeneficiaryScreens(appDriver);
    PaymentsScreen payments = new PaymentsScreen(appDriver);

    @When("^I click on the payments tab$")
    public void i_click_on_the_payments_tab(MobileElement element) throws Throwable {
        validateAndClick(payments.paymentsTab);
        log.info("User is on payments tab!!");

    }

    @And("^I click on Manage Beneficiary section$")
    public void i_click_on_Manage_Beneficiary_section() throws Throwable {
        waitUntilVisible(mb.manageBeneficiarySection,5);
        validateAndClick(mb.manageBeneficiarySection);
        log.info("User is on Manage beneficiary section!");

    }

    @And("^I click on add a beneficiary link and skip already added Beneficiary$")
    public void i_click_on_add_a_beneficiary_link_and_skip_already_added_Beneficiary() throws Throwable {
        mb.addBeneficiaryOption(true);
        log.info("User can see option to add beneficiary for AHB and Other");
    }

    @And("^I click on add a beneficiary link$")
    public void i_click_on_add_a_beneficiary_link() throws Throwable {
        mb.addBeneficiaryOption(false);
        log.info("User can see option to add beneficiary for AHB and Other");

    }

    @And("^I click on add a beneficiary plus button$")
    public void i_click_on_add_a_beneficiary_plus_button() throws Throwable {
        mb.addBeneficiaryOption(false);
        log.info("User can see option to add beneficiary for AHB and Other");

    }

    @And("^I click on Al Hilal Bank Digital$")
    public void i_click_on_Al_Hilal_Bank_Digital() throws Throwable {
        validateAndClick(mb.alHilalBank);
        log.info("User can see option to enter phone number or account number");

    }


    @And("^I click on phone number field and enter \"([^\"]*)\"$")
    public void i_click_on_phone_number_field_and_enter_something(String mobileNumber) throws Throwable {
        mb.enterAlHilalPhoneNumber(mobileNumber);
        log.info("User entered the phone number");
    }

    @Then("^I see the pop up saying beneficiary already exists$")
    public void i_see_the_pop_up_saying_beneficiary_already_exists() throws Throwable {
        mb.validateBeneficiaryExistPopup();
        log.info("Beneficiary was already added");
    }

    @And("^I click on OK to close the pop up$")
    public void i_click_on_ok_to_close_the_pop_up() throws Throwable {
        mb.closeBeneficiaryExistPopup();
        log.info("Beneficiary already exist pop up got closed");
    }

    @And("^I click on account number field and enter \"([^\"]*)\"$")
    public void I_click_on_account_number_field_and_enter_account_number(String accountNumber) throws Throwable {
        mb.enterAHBAccountNumber(accountNumber);
        log.info("User entered the account number in the text box");
    }


    @And("^I click on fetch details button$")
    public void I_click_on_fetch_details_button() throws Throwable {
        mb.clickFetchDetailsButton();
        log.info("User clicked on fetched details button after searching");
    }


    @And("^I click Confirm Details button$")
    public void i_click_Confirm_Details_button() throws Throwable {
        mb.clickConfirmDetailsButton();
        log.info("User clicks confirm details button");
    }


    @And("^I authenticates using passcode$")
    public void i_authenticates_using_passcode() throws Throwable {
        mp.enterPin("test");
        log.info("User is on authentication screen");
    }

    @Then("^I see the beneficiary creation success screen$")
    public void i_see_the_beneficiary_creation_success_screen() throws Throwable {
        waitUntilVisible(mb.beneficiaryCreationSuccessScreen,10);
        Assert.assertTrue(mb.beneficiaryCreationSuccessScreen.isDisplayed(), "Beneficiary creation failed");
        log.info("User is on beneficiary success screen!");
    }

    @And("^I click on Another Bank$")
    public void i_click_on_another_bank() throws Throwable {
       mb.clickAnotherBankOption();
        log.info("User see option to choose domestic or international");
    }

    @And("^I click on Domestic Bank$")
    public void i_click_on_domestic_bank() throws Throwable {
        mb.clickDomesticBankOption();
        log.info("User see option to enter iban");
    }

    @And("^I click on iBAN field and enter \"(.*)\"$")
    public void i_click_on_iban_field_and_enter_iban(String iBAN) throws Throwable {
        mb.enterIBANNumber(iBAN);
        log.info("User enter iBAN");
    }


    @And("^I check the domestic bank details are correct$")
    public void i_check_the_domestic_bank_details_are_correct() throws Throwable {
        scrollTo("Mashreqbank");
        Assert.assertTrue(mb.Mashreqbank.isDisplayed(), "Bank Details are not fetched correctly");
        log.info("Bank details are displayed");
    }

    @And("^I check the legacy bank details are correct$")
    public void i_check_the_legacy_bank_details_are_correct() throws Throwable {
        scrollTo("Al Hilal Bank");
        Assert.assertTrue(mb.AlHilalBank.isDisplayed(), "Bank Details are not fetched correctly");
        log.info("Bank details correctness is checked");
    }

    @Then("^I should see empty beneficiary list$")
    public void i_should_see_empty_beneficiary_list() throws Throwable {
        Assert.assertTrue(mb.addFirstBeneficiary.isDisplayed(), "Beneficiary list is not empty");
    }

    @And("^I click on three dots icon against all the beneficiaries and delete$")
    public void i_click_on_three_dots_icon_against_all_the_beneficiaries_and_delete() throws Throwable {
        mb.deleteAllBene();
    }

    @And("^I click on International Bank$")
    public void i_click_on_international_bank() throws Throwable {
        mb.clickInternationalBankOption();

    }

    @And("^I select \"([^\"]*)\" from the country list$")
    public void i_select_something_from_the_country_list(String country) throws Throwable {
        mb.selectCountryFromInternationalCountryListDropDown(country);
        log.info("User selected" +country +"from the dropdown");
        // Thread.sleep(3000);
    }


    @And("^I check the international bank details are correct$")
    public void i_check_the_international_bank_details_are_correct() throws Throwable {

    }

    @And("^I enter \"([^\"]*)\" for \"([^\"]*)\"$")
    public void i_enter_something_for_something(String routingcode, String country) throws Throwable {
        mb.enterRoutingCodesForCountry(routingcode,country);

    }

    @And("^I enter the \"(.*?)\", \"(.*?)\",\"(.*?)\" and \"(.*?)\"$")
    public void i_enter_the_something_something_and_something(String addressline1,String addressline2, String city, String beneficiarycountry) throws Throwable {
        mb.enterBeneficiaryDetailsForInternationalBeneficiary(addressline1,addressline2,city,beneficiarycountry);
        log.info("User entered the search parameter to fetch bank");

    }

    @And("^I enter details like \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_details_like_something_and_something(String swift, String accountnumber) throws Throwable {
        mb.enterAccountNumberSwiftCode(swift,accountnumber);
        log.info("User entered details like swift code etc");

    }

    @Then("^I see the chat icon is present on the screen$")
    public void i_see_the_chat_icon_is_present_on_the_screen() throws Throwable {
        Assert.assertTrue(mb.chatIcon.isDisplayed(), "Chat icon is not displayed on the screen");

    }


    @Then("^I should see inline error message on the mobile number field as \"([^\"]*)\"$")
    public void i_should_see_inline_error_message_on_the_screen_as_something(String errorMessage) throws Throwable {
        Assert.assertTrue(mb.invalidMobileNumberInlineMessage.isDisplayed(), "Error message is not correct");
        log.info("User see inline message on the phone number field");
    }

    @Then("^I should see inline error message on the account number field as \"([^\"]*)\"$")
    public void i_should_see_inline_error_message_on_the_account_number_field_as_something(String errorMessage) throws Throwable {
        Assert.assertTrue(mb.invalidAccountNumberInlineMessage.isDisplayed(), "Error message is not correct");
        log.info("User see inline message on the accoutn number field");
    }

    @And("^I click on phone number field and enter invalid phone number as \"([^\"]*)\"$")
    public void i_click_on_phone_number_field_and_enter_invalid_phone_number_as_something(String phoneNumber) throws Throwable {
        mb.enterInvalidPhoneNumber(phoneNumber);
        log.info("User entered invalid phone number");

    }

    @And("^I click on account number field and enter invalid account number as \"([^\"]*)\"$")
    public void i_click_on_account_number_field_and_enter_invalid_account_number_as_something(String accountNumber) throws Throwable {
        mb.enterInvalidAccountNumber(accountNumber);
        log.info("User entered invalid account number");
    }

    @And("^I click on done button to land on the beneficiary list screen$")
    public void i_click_on_done_button_to_land_on_the_beneficiary_list_screen() throws Throwable {
        mb.clickDoneButtonOnBeneficiarySuccessScreen();
        log.info("User landed on the beneficiary list screen");
    }


    @And("^I enter the nickname of beneficiary$")
    public void iEnterTheNicknameOfBeneficiary() {
        mb.enterNicknameForDomesticAndInternationalBank();
    }

    @And("I enter the Account Holder Name for {string}")
    public void iEnterTheAccountHolderNameFor(String transferType) {
        mb.enterAccountHolderName(transferType);

    }

    @And("I enter the nickname for {string}")
    public void iEnterTheNicknameFor(String transferType) {
        mb.enterNicknameForAHBBeneficiary(transferType);
    }
}