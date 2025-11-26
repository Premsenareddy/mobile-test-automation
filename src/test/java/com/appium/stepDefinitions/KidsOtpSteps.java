package com.appium.stepDefinitions;

import com.appium.screens.KidsOtpScreen;
import com.appium.screens.LoginScreen;
import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class KidsOtpSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(KidsOtpSteps.class);
    LoginScreen login = new LoginScreen(appDriver);
    KidsOtpScreen kidsOtp = new KidsOtpScreen(appDriver);

    @When("I login to the application with mobile number as {string} and passcode as {string} and debit pin as {string}")
    public void i_login_to_the_application_with_mobile_number_as_and_passcode_as_and_debit_pin_as(String mobileNumber, String passcode, String debitPin) {
        login
                .allowNotification()
                .skipIntroScreen()
                .tapOnLogin()
                .enterUserMobileNumber(getBacData(mobileNumber))
                .tapOnLoginNextButton()
                .acceptReplacementDevice()
                .enterPasscode(getBacData(passcode))
                .enterOtp("123456")
                .tapOnNextButton()
                .enterDebitPin(getBacData(debitPin))
                .tapOnNextButton()
                .tapOnOkButton()
                .enterPasscode(getBacData(passcode));
    }

    @When("I login to the application with mobile number as {string} and passcode as {string}")
    public void i_login_to_the_application_with_mobile_number_as_and_passcode_as(String mobileNumber, String passcode) {
        login
                .allowNotification()
                .skipIntroScreen()
                .tapOnLogin()
                .enterUserMobileNumber(getBacData(mobileNumber))
                .tapOnLoginNextButton()
                .acceptReplacementDevice()
                .enterPasscode(getBacData(passcode))
                .enterOtp("123456")
                .tapOnNextButton();
    }

    @And("I tap on Ok button from alert popup")
    public void i_tap_on_ok_button_from_alert_popup() {
        login.tapOnOkButton();
    }

    @When("I tap on Family tab")
    public void i_tap_on_family_tab() {
        kidsOtp.gotoFamilyTab();
    }

    @When("I tap on settings of my child's account")
    public void i_tap_on_settings_of_my_child_s_account() {
        kidsOtp.gotoChildProfileSettings();
    }

    @Then("I should see the option to enable OTP reception by my child while doing online transaction")
    public void i_should_see_the_option_to_enable_otp_reception_by_my_child_while_doing_online_transaction() {
        kidsOtp.verifyReceiveOtpOption();
    }

    @Then("the enable Otp option should be toggled {string}")
    public void the_enable_otp_option_should_be_toggled(String toggle) {
        kidsOtp.verifyReceiveOtpState(toggle);
    }

    @When("I toggle {string} the option to receive Otp in my child mobile number")
    public void i_toggle_the_option_to_receive_otp_in_my_child_mobile_number(String toggle) {
        kidsOtp.receiveOtpToggle(toggle);
    }

    @Then("I should see the Receive Otp overlay screen")
    public void i_should_see_the_receive_otp_overlay_screen() {
        kidsOtp.verifyReceiveOtpOverlayScreenElements();
    }

    @Then("I close the Receive Otp overlay screen")
    public void i_close_the_receive_otp_overlay_screen() {
        kidsOtp.tapOnClose();
    }

    @Then("I should see the mobile number field error")
    public void i_should_see_the_mobile_number_field_error() {
        kidsOtp.verifyMobileNumberFieldError();
    }

    @Then("I enter mobile number as {string} in Receive Otp screen")
    public void i_enter_mobile_number_as_in_receive_otp_screen(String mobile) {
        String mobileNumber;
        mobileNumber = mobile.equalsIgnoreCase("Generate") ? generateUAEMobileNumber().replace("+971", "") : getBacData(mobile);
        JsonUtil.setBacData("childMobileNumber", mobileNumber);
        kidsOtp.enterMobileNumber(mobileNumber);
    }

    @When("I tap on Verify mobile button")
    public void i_tap_on_verify_mobile_button() {
        kidsOtp.tapOnVerifyNumberButton();
    }

    @Then("I should see the mobile duplication error")
    public void i_should_see_the_mobile_duplication_error() {
        kidsOtp.verifyMobileDuplicationError();
    }

    @Then("I should see the Confirm Otp overlay screen")
    public void i_should_see_the_confirm_otp_overlay_screen() {
        kidsOtp.verifyConfirmOtpOverlayScreenElements();
    }

    @Then("I close the Confirm Otp overlay screen")
    public void i_close_the_confirm_otp_overlay_screen() {
        kidsOtp.tapOnClose();
    }

    @Then("I enter the otp received in child mobile number")
    public void i_enter_the_otp_received_in_child_mobile_number() {
        kidsOtp.enterOtp("123456");
    }

    @Then("the mobile number should be set for the child")
    public void the_mobile_number_should_be_set_for_the_child() {
        kidsOtp.verifyMobileSetForChild(JsonUtil.getBacData("childMobileNumber"));
    }

    @Then("I should not see the option to enable OTP reception by my child while doing online transaction")
    public void i_should_not_see_the_option_to_enable_otp_reception_by_my_child_while_doing_online_transaction() {
        kidsOtp.verifyReceiveOtpOptionNotPresent();
    }

    @And("my child mobile number should not be displayed")
    public void my_child_mobile_number_should_not_be_displayed() {
        kidsOtp.verifyChildMobileNumberNotPresent();
    }

    @And("mobile number edit option should not be present")
    public void mobile_number_edit_option_should_not_be_present() {
        kidsOtp.verifyChildMobileNumberEditOptionNotPresent();
    }

    @And("my child mobile number should be displayed")
    public void my_child_mobile_number_should_be_displayed() {
        kidsOtp.verifyChildMobileNumberIsPresent();
    }

    @When("I tap on edit number option")
    public void i_tap_on_edit_number_option() {
        kidsOtp.tapOnEditNumber();
    }

    @Then("I enter my child's existing mobile number in Receive Otp screen")
    public void i_enter_my_child_s_existing_mobile_number_in_receive_otp_screen() {
        kidsOtp.enterMobileNumber(JsonUtil.getBacData("existingChildMobileNumber"));
    }

    @Then("my child's number should be same as before")
    public void my_child_s_number_should_be_same_as_before() {
        kidsOtp.verifyMobileSetForChild(JsonUtil.getBacData("existingChildMobileNumber"));
    }


}