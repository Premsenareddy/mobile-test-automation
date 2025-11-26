package com.appium.stepDefinitions;

import com.appium.screens.CreditCardBillsScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class CreditCardBillsSteps extends CommonUtils {


    public static final Logger log = Logger.getLogger(CreditCardBillsSteps.class);
    CreditCardBillsScreen screen = new CreditCardBillsScreen(appDriver);


    @Then("I see credit Card bill tab")
    public void iSeeCreditCardBillTab() {
        screen.validateCreditCardBillTab();

    }

    @When("I click on credit card bill tab")
    public void iClickOnCreditCardBillTab() {
        screen.clickCCPaymentTab();

    }

    @Then("I see Credit card bill payment home screen with no card saved")
    public void iSeeCreditCardBillPaymentHomeScreenWithNoCardSaved() {
        screen.validateCCBillPaymentHomeScreen();

    }

    @And("I click on enter card details option")
    public void iClickOnEnterCardDetailsOption() {
        screen.clickEnterCCDetails();
    }

    @Then("I see option to enter credit card number and card holder name on the screen")
    public void iSeeOptionToEnterCreditCardNumberAndCardHolderNameOnTheScreen() {
        screen.validateCCEntryScreen();
    }


    @And("I enter credit card number as {string}and card holder name as {string}")
    public void iEnterCreditCardNumberAsAndCardHolderNameAs(String creditCardNumber, String accountHolderName) {
        screen.enterCreditCardDetails(creditCardNumber,accountHolderName);

    }

    @And("I click on Add card button")
    public void iClickOnAddCardButton() {
        screen.clickAddCardButton();
    }

    @Then("I should be able to see the card details")
    public void iShouldBeAbleToSeeTheCardDetails() {
        screen.validateCreditCardDetailsScreen();
    }

    @And("I click on done button on the success screen")
    public void iClickOnDoneButtonOnTheSuccessScreen() {
        screen.clickDoneButtonOnSuccessScreen();
    }

    @Then("I see credit card not found error message")
    public void iSeeCreditCardNotFoundErrorMessage() {
        screen.validateCardNotFoundErrorMessage();

    }

    @Then("I should see inline error message on the account holder field")
    public void iShouldSeeInlineErrorMessageOnTheAccountHolderField() {
        screen.validateInlineErrorMessageCardHolderName();
    }

    @And("I enter credit card number as {string}")
    public void iEnterCreditCardNumberAs(String creditcardnum) {
        screen.enterCreditCardNumber(creditcardnum);

    }

    @Then("I should see inline error message on the credit card number field")
    public void iShouldSeeInlineErrorMessageOnTheCreditCardNumberField() {
        screen.validateInlineLengthMessageCCNumberField();
    }

    @And("I enters Remarks for CC payments as {string}")
    public void iEntersRemarksForCCPaymentsAs(String remarks) {
        screen.enterRemarksForCCPayments(remarks);
    }

    @And("I click the next button on screen")
    public void iClickTheNextButtonOnScreen() {
        screen.clickNextButton();
    }

    @And("I check the save card checkbox")
    public void iCheckTheSaveCardCheckbox() {
        screen.clickSaveCreditCardCheckBox();
    }

    @Then("I see Credit card bill payment home screen with legacy and digital cards saved")
    public void iSeeCreditCardBillPaymentHomeScreenWithLegacyAndDigitalCardsSaved() {
        screen.validateCCHomeScreenWithCardsSaved();
    }

    @And("I click on my saved AHB digital card")
    public void iClickOnMySavedAHBDigitalCard() {
        screen.clickDigitalCard();
    }

    @And("User enter the amount as {string} in Other field")
    public void userEnterTheAmountAsInOtherField(String amount) {
        screen.enterAmount(amount);
    }

    @And("user clicks on Confirm amount")
    public void userClicksOnConfirmAmount() {
        screen.clickConfirmAmountButton();
    }

    @And("I click on my saved AHB legacy card")
    public void iClickOnMySavedAHBLegacyCard() {
        screen.clickLegacyCard();
    }

    @When("user click on more account option")
    public void userClickOnMoreAccountOption() {
        screen.clickMoreAccountOption();
    }

    @Then("user is able to navigate to My Accounts screen")
    public void userIsAbleToNavigateToMyAccountsScreen() {
        screen.validateMyAccountScreen();
    }

    @When("user selects another account")
    public void userSelectsAnotherAccount() {
        screen.selectAnotherAccount();
    }

    @Then("user is able to navigate to payment amount screen")
    public void userIsAbleToNavigateToPaymentAmountScreen() {
        screen.validatePaymentScreen();
    }

    @When("user click on back button")
    public void userClickOnBackButton() {
        screen.clickBackButton();
    }

    @Then("User is able to navigate to Review details screen")
    public void userIsAbleToNavigateToReviewDetailsScreen() {
        screen.validateReviewDetailsScreen();
    }

    @Then("user is able to navigate to Payment details screen")
    public void userIsAbleToNavigateToPaymentDetailsScreen() {
        screen.validatePaymentDetailsScreen();
    }

    @Then("user is able to navigate to Pay a bill screen")
    public void userIsAbleToNavigateToPayABillScreen() {
        screen.validatePayBillScreen();
    }
}