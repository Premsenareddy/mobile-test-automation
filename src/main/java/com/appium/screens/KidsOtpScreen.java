package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class KidsOtpScreen extends BaseScreen {

    CommonUtils utils = new CommonUtils();

    public KidsOtpScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    //__Kids OTP Identifiers__
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'navigation_family')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton[3]")
    public MobileElement familyTab;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_settings')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='engAdultsIcGeneralSettings']")
    public MobileElement childProfileSettings;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_label_receive_otp')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Receive OTPs']")
    public MobileElement receiveOtpLabel;

    @AndroidFindBy(xpath = "//android.view.View[contains(@resource-id,'ls_receive_otp')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpToggle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_subTitle_receive_otp')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Allows your child to authorise the online transactions they make using their Al Hilal debit card']")
    public MobileElement receiveOtpDescription;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_info_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpLayoutTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_sub_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpLayoutSubTitle;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_title')])[1]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement mobileNumberFieldLabel;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'ti_value')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement mobileNumberField;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_error')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement mobileNumberFieldError;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'cl_alert')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpAlert;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_title')])[2]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpAlertTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_description')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpAlertDescription;

    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id,'btn_continue')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement verifyNumberButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement confirmOtpTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_subtitle')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement confirmOtpSubTitle;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'pv_verificationcode')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpField;

    @AndroidFindBy(xpath = "//android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldOne;

    @AndroidFindBy(xpath = "//android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldTwo;

    @AndroidFindBy(xpath = "//android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldThree;

    @AndroidFindBy(xpath = "//android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldFour;

    @AndroidFindBy(xpath = "//android.widget.EditText[5]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldFive;

    @AndroidFindBy(xpath = "//android.widget.EditText[6]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement otpFieldSix;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'cl_alert')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement confirmOtpAlert;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_alert_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement confirmOtpAlertTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_alert_description')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement confirmOtpAlertDescription;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_close')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement receiveOtpClose;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/alertTitle')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement alertTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/message')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement alertMessage;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_number_receive_otp')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement childNumber;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'id/tv_edit_number_receive_otp')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement editChildNumber;


    public KidsOtpScreen gotoFamilyTab() {

        Assert.assertTrue(utils.click(familyTab), "Failed to navigate to Family Tab");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen gotoChildProfileSettings() {

        Assert.assertTrue(utils.click(childProfileSettings), "Failed to navigate to child profile settings");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyReceiveOtpOption() {

        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpLabel), "Receive OTP label is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpToggle), "Receive OTP toggle is not displayed");
        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(receiveOtpDescription, 2);
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpDescription), "Receive OTP description is not displayed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyReceiveOtpState(String status) {

        String attributeValue;
        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            attributeValue = status.equalsIgnoreCase("on") ? "true" : "false";
            Assert.assertTrue(utils.verifyAttribute(receiveOtpToggle, "selected", attributeValue), "Receive OTP is not toggled " + status);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {

        }

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen receiveOtpToggle(String state) {

        String attributeValue;
        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            attributeValue = state.equalsIgnoreCase("on") ? "true" : "false";
            if (!(utils.verifyAttribute(receiveOtpToggle, "selected", attributeValue))) {
                utils.click(receiveOtpToggle);
            }
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {

        }

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyReceiveOtpOverlayScreenElements() {

        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpLayoutTitle), "Receive OTP overlay screen title is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpLayoutSubTitle), "Receive OTP overlay screen subtitle is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(mobileNumberFieldLabel), "Receive OTP phone number field label is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(mobileNumberField), "Receive OTP mobile number field is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpAlert), "Receive OTP alert is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpAlertTitle), "Receive OTP alert title is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpAlertDescription), "Receive OTP alert description is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(verifyNumberButton), "Receive OTP Verify number button is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpClose), "Receive OTP overlay screen close option is not displayed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyConfirmOtpOverlayScreenElements() {

        Assert.assertTrue(utils.eleIsDisplayed(confirmOtpTitle), "Confirm OTP overlay screen title is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(confirmOtpSubTitle), "Confirm OTP overlay screen subtitle is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(otpField), "Confirm OTP fields is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(confirmOtpAlert), "Confirm OTP alert is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(confirmOtpAlertTitle), "Confirm OTP alert title is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(confirmOtpAlertDescription), "Confirm OTP alert description is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(receiveOtpClose), "Confirm OTP overlay screen close option is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(verifyNumberButton), "Confirm OTP Verify number button is not displayed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen enterMobileNumber(String number) {

        utils.enterValue(mobileNumberField, number);

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyMobileNumberFieldError() {

        Assert.assertTrue(utils.eleIsDisplayed(mobileNumberFieldError), "Mobile number field error is not displayed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen tapOnVerifyNumberButton() {

        Assert.assertTrue(utils.click(verifyNumberButton), "Failed to click on Verify number Button");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen tapOnClose() {

        Assert.assertTrue(utils.click(receiveOtpClose), "Failed to click on Close option");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen enterOtp(String otp) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.enterValue(otpFieldOne, Character.toString(otp.charAt(0)));
            utils.enterValue(otpFieldTwo, Character.toString(otp.charAt(1)));
            utils.enterValue(otpFieldThree, Character.toString(otp.charAt(2)));
            utils.enterValue(otpFieldFour, Character.toString(otp.charAt(3)));
            utils.enterValue(otpFieldFive, Character.toString(otp.charAt(4)));
            utils.enterValue(otpFieldSix, Character.toString(otp.charAt(5)));
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {

        }
        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyReceiveOtpOptionNotPresent() {

        Assert.assertTrue(!(utils.eleIsDisplayed(receiveOtpLabel)), "Receive OTP option is present");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyMobileDuplicationError() {

        Assert.assertTrue(utils.validateAndGetText(alertTitle).contains("Mobile number already exists"), "Mobile number duplication alert is not displayed");
        Assert.assertTrue(utils.validateAndGetText(alertMessage).contains("The mobile number you entered is already registered. Please make sure you have the correct format or log in"), "Mobile number duplication alert is not displayed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyMobileSetForChild(String mobileNumber) {

        Assert.assertTrue(utils.validateAndGetText(childNumber).contains(mobileNumber), "Child mobile number verification failed");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyChildMobileNumberNotPresent() {

        Assert.assertTrue(!(utils.eleIsDisplayed(childNumber)), "Child mobile number is displayed in settings");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyChildMobileNumberEditOptionNotPresent() {

        Assert.assertTrue(!(utils.eleIsDisplayed(editChildNumber)), "Child mobile number edit option is present in settings");

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen verifyChildMobileNumberIsPresent() {

        Assert.assertTrue((utils.eleIsDisplayed(childNumber)), "Child mobile number is not displayed in settings");
        JsonUtil.setBacData("existingChildMobileNumber", utils.validateAndGetText(childNumber).replace("+555", "").replace("+971", ""));

        return new KidsOtpScreen(appDriver);

    }

    public KidsOtpScreen tapOnEditNumber() {

        Assert.assertTrue((utils.click(editChildNumber)), "Child mobile number edit option is not present in settings");

        return new KidsOtpScreen(appDriver);

    }

}
