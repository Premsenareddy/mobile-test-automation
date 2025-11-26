package com.appium.stepDefinitions;

import com.appium.screens.*;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class KycUpdateSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(KycUpdateSteps.class);
    DashboardScreen dashboardScreen = new DashboardScreen(appDriver);
    ProfileScreen profileScreen = new ProfileScreen(appDriver);
    ScanYourEIDScreen scanYourEIDScreen = new ScanYourEIDScreen(appDriver);
    IdNowScreen idNowScreen = new IdNowScreen(appDriver);
    FamilyScreen familyScreen = new FamilyScreen(appDriver);
    KidsSettingsScreen kidsSettingsScreen = new KidsSettingsScreen(appDriver);

    @When("I tap on profile icon")
    public void i_tap_on_profile_icon() {
        dashboardScreen.gotoProfileScreen();
    }

    @Then("I should see the Emirates ID details and update option")
    public void i_should_see_the_emirates_id_details_and_update_option() {
        profileScreen.verifyEmiratesIdCardViewTitle("Emirates ID number")
                .verifyEmiratesIdCardViewNumber()
                .verifyEmiratesIdExpiryDateLabel("Expiry date:")
                .verifyEmiratesIdCardViewInfo("Please update your Emirates ID to avoid service interruption")
                .verifyUpdateEmirateIdButton("Update Emirates ID");
    }

    @When("I tap on Update Emirates ID option")
    public void i_tap_on_update_emirates_id_option() {
        profileScreen.tapOnUpdateEmiratesIdButton();
    }

    @Then("I should see Scan Emirates ID screen")
    public void i_should_see_scan_emirates_id_screen() {
        scanYourEIDScreen.verifyEidScanInstructionScreen("Scan your original Emirates ID");
    }

    @When("I tap on Scan original ID button")
    public void i_tap_on_scan_original_id_button() {
        scanYourEIDScreen.selectScanYourEIDBtn();
    }

    @Then("I should redirect to scan ID screen")
    public void i_should_redirect_to_scan_id_screen() {
        idNowScreen.verifyEIDScanScreen();
    }

    @Then("I should see the expiry banner as my EID is expiring")
    public void i_should_see_the_expiry_banner_as_my_eid_is_expiring() {
        dashboardScreen.verifyExpiryBanner()
                .verifyExpiryBannerTitle("Your Emirates ID is about to expire!")
                .verifyExpiryBannerDescription("Your Emirates ID will expire soon on ")
                .verifyExpiryBannerDescription(", please renew it to continue benefitting from our banking services");
    }

    @When("I tap on the EID expiry banner")
    public void i_tap_on_the_eid_expiry_banner() {
        dashboardScreen.tapOnExpiryBanner();
    }

    @Then("I should see the expiry banner as my EID is expired")
    public void i_should_see_the_expiry_banner_as_my_eid_is_expired() {
        dashboardScreen.verifyExpiryBanner()
                .verifyExpiryBannerTitle("Your Emirates ID has expired!")
                .verifyExpiryBannerDescription("Please renew your Emirates ID by ");
    }

    @Then("I should see EID expiry banner for my child {string} whose Emirates ID is expiring")
    public void i_should_see_eid_expiry_banner_for_my_child_whose_emirates_id_is_expiring(String childName) {
        String child_Name = getBacData(childName);
        familyScreen.verifyExpiryBanner(child_Name)
                .verifyExpiryBannerTitle(child_Name, child_Name + "'s Emirates ID is about to expire!")
                .verifyExpiryBannerDescription(child_Name, child_Name + "’s Emirates ID will expire soon on ")
                .verifyExpiryBannerDescription(child_Name, ", please renew it to continue benefitting from our banking services");
    }

    @When("I tap on the EID expiry banner for my child {string}")
    public void i_tap_on_the_eid_expiry_banner_for_my_child(String childName) {
        familyScreen.tapOnExpiryBanner(getBacData(childName));
    }

    @Then("I should see Scan Emirates ID screen for my child")
    public void i_should_see_scan_emirates_id_screen_for_my_child() {
        scanYourEIDScreen.verifyChildEidScanInstructionScreen("Scan your child's original ID");
    }

    @Then("I should see EID expiry banner for my child {string} whose Emirates ID is expired")
    public void i_should_see_eid_expiry_banner_for_my_child_whose_emirates_id_is_expired(String childName) {
        String child_Name = getBacData(childName);
        familyScreen.verifyExpiryBanner(child_Name)
                .verifyExpiryBannerTitle(child_Name, child_Name + "'s Emirates ID has expired!")
                .verifyExpiryBannerDescription(child_Name, "Please renew " + child_Name + "'s Emirates ID by ");
    }

    @Then("I should see the Emirates ID details and update option for my child {string}")
    public void i_should_see_the_emirates_id_details_and_update_option_for_my_child(String childName) {
        String child_Name = getBacData(childName);
        kidsSettingsScreen.verifyEmiratesIdCardViewTitle("Emirates ID number")
                .verifyEmiratesIdCardViewNumber()
                .verifyEmiratesIdExpiryDateLabel("Expiry date:")
                .verifyEmiratesIdCardViewInfo("Please update " + child_Name + "'s Emirates ID to avoid service interruption")
                .verifyUpdateEmirateIdButton("Update Emirates ID");
    }

    @When("I tap on Update Emirates ID for my child")
    public void i_tap_on_update_emirates_id_for_my_child() {
        kidsSettingsScreen.tapOnUpdateEmiratesIdButton();
    }

    @Then("I should not see the Emirates ID details and update option for my child")
    public void i_should_not_see_the_emirates_id_details_and_update_option_for_my_child() {
        kidsSettingsScreen.verifyEmiratesIdCardViewNotPresent();
    }

    @Then("I should not see the Emirates ID details and update option")
    public void i_should_not_see_the_emirates_id_details_and_update_option() {
        profileScreen.verifyEmiratesIdCardViewNotPresent();
    }

}