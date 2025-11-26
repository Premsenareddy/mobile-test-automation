package com.appium.stepDefinitions;

import com.appium.screens.MoreScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import java.io.IOException;

public class MoreSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(MoreSteps.class);
    MoreScreen more = new MoreScreen(appDriver);

    @Then("^I land on More Tab$")
    public void iLandAtMoreTab() {

        log.info("User is on more tab!!");
        more.iLandOnMoreTab();
    }

    @And("^Verify More Screen UI$")
    public void verifyMoreComponentsClickable() {

        log.info("User is checking  clickable UI components on More tab!!");
        more.clickAndVerifyOnMoreUiComponents();
    }


    @And("^I land On My Interests$")
    public void iLandOnMyInterests() {
        more.iLandOnMyInterests();
    }

    @And("^Verify My Interests Screen$")
    public void verifyMyInterestsScreen() {
        more.verifyMyInterestsScreen();
    }

    @And("^Verify My Interests Saved$")
    public void verifyMyInterestsSaved() {
        more.verifyMyInterestsSaved();
    }

    @And("^Verify Notifications UI$")
    public void verifyNotificationsUI() {
        more.verifyNotificationsUI();
    }

    @And("^Verify Marketplace FAQ UI$")
    public void verifyFAQUI() {
        more.verifyMarketplaceFAQUI();
    }

    @And("^Verify Terms and Conditions UI$")
    public void verifyTermsAndConditionsUI() throws IOException {
        more.verifyTermsAndConditionsUI();
    }

    @And("^Verify Privacy Policy UI$")
    public void verifyPrivacyPolicyUI() {
        more.verifyPrivacyPolicyUI();
    }

    @And("^Verify Transparency UI$")
    public void verifyTransparencyUI() {
        more.verifyTransparencyUI();
    }

    @And("^I land on My Orders Screen$")
    public void iLandOnMyOrdersScreen() {
        more.iLandOnMyOrdersScreen();
    }

    @And("^Verify My Orders Screen$")
    public void verifyMyOrdersScreen() {
        more.verifyMyOrdersScreen();
    }

    @And("^I land on Order Summary Screen$")
    public void iLandOnOrderSummaryScreen() {
        more.iLandOnOrderSummaryScreen();
    }
}