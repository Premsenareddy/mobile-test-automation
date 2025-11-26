package com.appium.stepDefinitions;

import com.appium.screens.*;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class KidsPaymentsAndTransfersSteps extends CommonUtils {


    public static final Logger log = Logger.getLogger(KidsPaymentsAndTransfersSteps.class);
    KidsPayments kidsPaymentHomeScreen = new KidsPayments(appDriver);
    PaymentsScreen payments = new PaymentsScreen(appDriver);
    ManageBeneficiaryScreens mb = new ManageBeneficiaryScreens(appDriver);
    MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
    TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);

    @Then("^I see that the payment tab is properly displayed for kids with all components$")
    public void i_see_that_the_payment_tab_is_properly_displayed_for_kids_with_all_components() throws Throwable {
        kidsPaymentHomeScreen.validateKidsPaymentTab();
        log.info("Payment tab is correctly displayed");
    }

    @Then("^I see that all the section headings are displayed correctly on the kids payment home screen$")
    public void i_see_that_all_the_section_headings_are_displayed_correctly_on_the_kids_payment_home_screen() throws Throwable {
        kidsPaymentHomeScreen.validateSectionHeadingsOnKidsPaymentTab();
        log.info("All section headings are displayed correctly on the kids payment tab");
    }

    @Then("^I see that the header title is Your Payments$")
    public void i_see_that_the_header_title_is_your_payments() throws Throwable {
        kidsPaymentHomeScreen.validateKidsPaymentScreenTitle();

    }


    @Then("^I can see that only GSM and Wasel Recharge option are there for kids$")
    public void iCanSeeThatOnlyGSMAndWaselRechargeOptionAreThereForKids() {
        kidsPaymentHomeScreen.validateEtisalatSubTypesForKids();
    }

    @And("^I click on the \"([^\"]*)\" and enter \"([^\"]*)\"$")
    public void iClickOnTheAndEnter(String EtisalatType, String phoneNumber) throws Throwable {
        kidsPaymentHomeScreen.enterEtislatPhoneNumber(EtisalatType,phoneNumber);
    }

    @And("^I uncheck the Add to your list of bills checkbox$")
    public void i_uncheck_the_saved_payee_checkbox() throws Throwable {
        scrollTo("Add to your list of bills");
        validateAndClick(tu.savePayeeCheckBox);
    }

    @And("^I add \"([^\"]*)\" for \"([^\"]*)\"$")
    public void i_add_something_for_something(String amount,String EtisalatType) throws Throwable {
        kidsPaymentHomeScreen.enterUtilityPaymentAmount(amount,EtisalatType);
    }

    @Then("^I see the kids review details screen$")
    public void i_See_The_Kids_ReviewDetails_Screen() {
        Assert.assertTrue(kidsPaymentHomeScreen.isKidsReviewScreenDisplayed(), "Review screen is not displayed");
    }

    @And("^I click on send money button$")
    public void iClickOnSendMoneyButton() {
        kidsPaymentHomeScreen.clickSendMoneyButton();
    }

    @Then("^I should see the bill payment request success screen$")
    public void iShouldSeeTheBillPaymentRequestSuccessScreen() {
        kidsPaymentHomeScreen.isBillPaymentSuccessScreenDisplayed();
    }

    @And("^I click on DU option$")
    public void i_click_on_DU_option() {
        kidsPaymentHomeScreen.clickDUPaymentOption();
    }

    @And("^I click on the Postpaid and enter \"([^\"]*)\"$")
    public void i_click_on_the_Postpaid_And_Enter(String mobileNumber) throws Throwable {
        kidsPaymentHomeScreen.clickDUPostpaidAndEnterMobileNumber(mobileNumber);
    }

    @And("^I click on Continue button$")
    public void i_click_on_continue_button() {
        kidsPaymentHomeScreen.clickContinueButton();
    }


    @And("^I add \"([^\"]*)\" for DU and press Continue button$")
    public void iAddForDUAndPressContinueButton(String amount) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        kidsPaymentHomeScreen.enterAmountForDu(amount);

    }

    @Then("^I should see only prepaid and postpaid option for DU$")
    public void i_should_see_only_prepaid_and_postpaid_option_for_DU() {
        kidsPaymentHomeScreen.validateDUSubTypes();
    }

    @And("^I click on arrow against bank friend section$")
    public void iClickOnArrowAgainstBankFriendSection() {
        kidsPaymentHomeScreen.clickAddingBankFriendArrow();
    }

    @Then("^I land on the bank friends screen$")
    public void iLandOnTheBankFriendsScreen() {
        kidsPaymentHomeScreen.validateKidsBeneficiaryListScreen();
    }

    @And("^I click on three dots options against the parent$")
    public void iClickOnThreeDotsOptionsOnTheBeneficiaryList() {
        kidsPaymentHomeScreen.clickThreeDotsOptionAgainstParent();
    }

    @Then("^I see the option to send money to father$")
    public void iSeeTheOptionToSendMoneyToFather() {
        kidsPaymentHomeScreen.validateSendMoneyOptionToFather();
    }

    @And("^I click the option to send money to parent$")
    public void iClickTheOptionToSendMoneyToParent() {
        kidsPaymentHomeScreen.clickSendMoneyOptionfromThreeDots();
    }

    @And("^I click on continue button on the account selection screen$")
    public void iClickOnContinueButtonOnTheAccountSelectionScreen() {
        kidsPaymentHomeScreen.clickContinueButton();
    }

    @And("^I enter the amount as \"([^\"]*)\" on transfer screen$")
    public void iEnterTheAmountAsOnTransferScreen(String amount) throws Throwable {
        kidsPaymentHomeScreen.enterAmount(amount);
        kidsPaymentHomeScreen.clickArrowButton();
    }

    @Then("^I can see the transfer getting success and transactionID getting displayed on success screen$")
    public void iCanSeeTheTransferGettingSuccessAndTransactionIDGettingDisplayedOnSuccessScreen() {
        waitUntilVisible(tu.transactionID, 15);
        Assert.assertTrue(tu.transactionID.isDisplayed(), "Money transfer did not happen");
    }


    @And("^I select the reason of transfer$")
    public void iSelectTheReasonOfTransfer() {
        kidsPaymentHomeScreen.selectReasonOfTransfer();
        log.info("User selected family support from purpose drop down !!");
    }

    @And("^I validate the check all details screen$")
    public void iValidateTheCheckAllDetailsScreen() {
        kidsPaymentHomeScreen.validateCheckAllDetailsScreen();
    }

    @And("^I enter the remarks and click on Check all details button$")
    public void iEnterTheRemarksAndClickOnCheckAllDetailsButton() {
        kidsPaymentHomeScreen.enterRemarksAndClickButton();

    }

    @Then("^I see that remove option is not there against the parent beneficiary$")
    public void iSeeThatRemoveOptionIsNotThereAgainstTheParentBeneficiary() {
        kidsPaymentHomeScreen.validateRemoveBeneficiaryOptionAgainstParent();
    }

    @And("^I click on add beneficiary option$")
    public void iClickOnAddBeneficiaryOption() {
        kidsPaymentHomeScreen.clickAddNewButtonOnBeneficiaryList();
    }

    @And("^I enter \"([^\"]*)\" in phone number field$")
    public void iEnterInPhoneNumberField(String phoneNumber) throws Throwable {
        kidsPaymentHomeScreen.enterAHBBeneficiaryPhoneNumber(phoneNumber);
    }

    @And("^I click on find details button$")
    public void iClickOnFindDetailsButton() {
        kidsPaymentHomeScreen.clickFindDetailsButton();
    }

    @And("^I enter the nickname for beneficiary$")
    public void i_enter_the_nickname() throws Throwable {
        kidsPaymentHomeScreen.enterNicknameForBeneficiary();
        log.info("User enters the nickname");
    }

    @Then("^I validate the beneficiary creation success screen$")
    public void iValidateTheBeneficiaryCreationSuccessScreen() {
        kidsPaymentHomeScreen.validateBeneficiarySuccessScreen();
    }

    @And("^I enter \"([^\"]*)\" in account number field$")
    public void iEnterInAccountNumberField(String accountNumber) throws Throwable {
        kidsPaymentHomeScreen.enterAHBBeneficiaryAccountNumber(accountNumber);
    }

    @And("^I click on Another Bank in UAE option$")
    public void iClickOnAnotherBankInUAEOption() {
        kidsPaymentHomeScreen.clickAnotherBankinUAEOption();

    }

    @Then("^I am able to delete all beneficiaries except parent account$")
    public void iAmAbleToDeleteAllBeneficiariesExceptParentAccount() {
        kidsPaymentHomeScreen.deleteAllBeneficiaries();
    }

    @And("I click on pay this bill")
    public void iClickOnPayThisBill() {
        kidsPaymentHomeScreen.clickPayThisBill();
    }

    @And("I click on Domestic Bank for kids")
    public void iClickOnDomesticBankForKids() {
        kidsPaymentHomeScreen.clickDomesticBankOptions();
    }

    @And("I click on iBAN field for kids and enter {string}")
    public void iClickOnIBANFieldForKidsAndEnter(String iBAN) {
        kidsPaymentHomeScreen.enterIBANumber(iBAN);
    }
}