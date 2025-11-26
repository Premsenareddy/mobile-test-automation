package com.appium.stepDefinitions;

import com.appium.screens.LoyaltyScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class LoyaltySteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(LoyaltySteps.class);
    LoyaltyScreen loyalty = new LoyaltyScreen(appDriver);
    CommonUtils utils= new CommonUtils();

    @Then("^Verify Loyalty Balance$")
    public void verifyLoyaltyBalance() throws InterruptedException {
        loyalty.verifyLoyaltyBalance();
    }

    @And("^Verify Loyalty Transaction Screen UI$")
    public void verifyLoyaltyTransactionScreenUI() {
        loyalty.verifyLoyaltyTransactionScreenUI();
    }

    @Then("^Navigate to Loyalty Balance$")
    public void navigateToLoyaltyBalance() {
        loyalty.navigateToLoyaltyBalance();
    }

    @And("^Verify Loyalty Transaction Earn More Screen UI$")
    public void verifyLoyaltyTransactionEarnMoreScreenUI() {
        loyalty.verifyLoyaltyTransactionEarnMoreScreenUI();

    }

    @And("^Verify FAQ Earn More Screen UI$")
    public void verifyFAQEarnMoreScreenUI() {
        loyalty.verifyFAQEarnMoreScreenUI();
    }

    @And("^Verify Loyalty Transaction Redeem Screen UI$")
    public void verifyLoyaltyTransactionRedeemScreenUI() {
        loyalty.verifyLoyaltyTransactionRedeemScreenUI();
    }

    @And("^Verify FAQ Redeem Screen UI$")
    public void verifyFAQRedeemScreenUI() {
        loyalty.verifyFAQRedeemScreenUI();
    }
}
