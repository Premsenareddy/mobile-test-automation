package com.appium.stepDefinitions;

import com.appium.screens.*;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class CharitySteps extends CommonUtils {
	

	public static final Logger log = Logger.getLogger(TransactionLimits.class);
	CharityPayment charity = new CharityPayment(appDriver);

    @Then("^I see that Donate option is present on the payment home screen$")
    public void i_see_that_donate_option_is_present_on_the_payment_home_screen() throws Throwable {
        charity.verifyDonateIcon();
    }


    @Then("I click on Donate Section")
    public void iClickOnDonateSection() {
        charity.clickDonateSection();
    }

    @Then("I see all charities options displayed on the screen")
    public void iSeeAllCharitiesOptionsDisplayedOnTheScreen() {
        charity.validateCharityList();
    }

    @And("I click on Zakat donation option")
    public void iClickOnZakatDonationOption() {
        charity.clickZakatDonation();
    }

    @And("I press the next button on the screen")
    public void iPressTheNextButtonOnTheScreen() {
        charity.clickNextButton();
    }

    @And("I validate the charity review screen")
    public void iValidateTheCharityReviewScreen() {
        charity.validateReviewScreen();
    }

    @And("I click on confirm and transfer button for charity")
    public void iClickOnConfirmAndTransferButtonForCharity() {
        charity.clickCharityConfirmAndTransferButton();
    }

    @Then("The success screen gets displayed with transaction ID")
    public void theSuccessScreenGetsDisplayedWithTransactionID() {
    charity.validateCharitySuccessScreen();

    }

    @And("I click on build a mosque donation option")
    public void iClickOnBuildAMosqueDonationOption() {
        charity.buildAMosqueDonation();
    }

    @And("I click on Zakat Al Fitr donation option")
    public void iClickOnZakatAlFitrDonationOption() {
        charity.zakatAlFitrDonation();
    }

    @And("I click on general donation option")
    public void iClickOnGeneralDonationOption() {
        charity.clickGeneralDonationOption();
    }

    @And("I see that share confirmation option is there on the success screen")
    public void iSeeThatShareConfirmationOptionIsThereOnTheSuccessScreen() {
        charity.valdateShareConfirmationPresence();
    }

    @Then("I validate that the next button is not enabled and user can not move ahead")
    public void iValidateThatTheNextButtonIsNotEnabledAndUserCanNotMoveAhead() {
        charity.validateNextButtonDisabled();
    }

    @Then("I see the information on the max allowed transfer")
    public void iSeeTheInformationOnTheMaxAllowedTransfer() {
        charity.validateMaxAmountMessage();
    }

    @Then("I see that the screen heading is correct")
    public void iSeeThatTheScreenHeadingIs() {
        charity.validateScreenHeading();
    }

    @Then("I land on amount screen")
    public void iLandOnAmountScreen() {
        charity.validateAmountScreen();
    }

    @And("I press the confirm amount button on the screen")
    public void iPressTheConfirmAmountButtonOnTheScreen() {
        charity.clickConfirmAmountButton();
    }
}