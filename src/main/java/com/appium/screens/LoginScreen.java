package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class LoginScreen extends BaseScreen {

    public static final Logger log = Logger.getLogger(LoginScreen.class);

    CommonUtils utils = new CommonUtils();

    public LoginScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    //__Login Identifiers__
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Allow")
    public MobileElement allowNotification;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_right_top')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Skip']")
    public MobileElement skipIntro;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_login')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Already have an account? Log in']")
    public MobileElement loginOption;

    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id,'ti_value')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mobile number']/following::XCUIElementTypeTextField")
    public MobileElement userMobileNumberField;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id,'iv_next')]")
    @iOSXCUITFindBy(accessibility = "icRightArrow")
    public MobileElement loginNextButton;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Ok")
    public MobileElement replacementDevicePopup;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[4]")
    public MobileElement passcodeFieldOne;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[1]")
    public MobileElement passcodeFieldTwo;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[2]")
    public MobileElement passcodeFieldThree;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[3]")
    public MobileElement passcodeFieldFour;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[6]")
    public MobileElement otpFieldOne;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[1]")
    public MobileElement otpFieldTwo;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[2]")
    public MobileElement otpFieldThree;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[3]")
    public MobileElement otpFieldFour;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[5]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[4]")
    public MobileElement otpFieldFive;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[6]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[5]")
    public MobileElement otpFieldSix;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[4]")
    public MobileElement debitPinOne;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[1]")
    public MobileElement debitPinTwo;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[2]")
    public MobileElement debitPinThree;

    @AndroidFindBy(xpath =  "//android.widget.LinearLayout[contains(@resource-id,'llViews')]/android.widget.EditText[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeSecureTextField)[3]")
    public MobileElement debitPinFour;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_next_button')]")
    @iOSXCUITFindBy(accessibility = "icRightArrow")
    public MobileElement nextButton;

    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(accessibility = "Ok")
    public MobileElement okButton;

//driver.findElement(MobileBy.AndroidUIAutomator(“new UiSelector().textContains(“Click here”)”)).click();

    public LoginScreen allowNotification() {

        if (utils.eleIsDisplayed(allowNotification)) {
            Assert.assertTrue(utils.click(allowNotification), "Failed to allow app notification");
        }

        return new LoginScreen(appDriver);

    }

    public LoginScreen skipIntroScreen() {

        if (utils.eleIsDisplayed(skipIntro)) {
            Assert.assertTrue(utils.click(skipIntro), "Failed to skip intro screen");
        }

        return new LoginScreen(appDriver);

    }

    public LoginScreen tapOnLogin() {

        Assert.assertTrue(utils.click(loginOption), "Failed to find login option");

        return new LoginScreen(appDriver);

    }

    public LoginScreen enterUserMobileNumber(String mobileNumber) {

        Assert.assertTrue(utils.eleIsDisplayed(userMobileNumberField), "Failed to find mobile number field");
        utils.enterValue(userMobileNumberField, mobileNumber);

        return new LoginScreen(appDriver);

    }

    public LoginScreen tapOnLoginNextButton() {

        Assert.assertTrue(utils.click(loginNextButton), "Failed to click on Next button from mobile number screen");

        return new LoginScreen(appDriver);

    }

    public LoginScreen acceptReplacementDevice() {

        Assert.assertTrue(utils.click(replacementDevicePopup), "Failed to click on Ok button from replacement device popup");

        return new LoginScreen(appDriver);

    }

    public LoginScreen enterPasscode(String passcode) {

        utils.waitFor(4);

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.enterValue(passcodeFieldOne, Character.toString(passcode.charAt(0)));
            utils.enterValue(passcodeFieldTwo, Character.toString(passcode.charAt(1)));
            utils.enterValue(passcodeFieldThree, Character.toString(passcode.charAt(2)));
            utils.enterValue(passcodeFieldFour, Character.toString(passcode.charAt(3)));
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
                utils.enterValue(passcodeFieldOne, passcode);

        }

        return new LoginScreen(appDriver);

    }

    public LoginScreen enterOtp(String otp) {

        utils.waitFor(4);

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.enterValue(otpFieldOne, Character.toString(otp.charAt(0)));
            utils.enterValue(otpFieldTwo, Character.toString(otp.charAt(1)));
            utils.enterValue(otpFieldThree, Character.toString(otp.charAt(2)));
            utils.enterValue(otpFieldFour, Character.toString(otp.charAt(3)));
            utils.enterValue(otpFieldFive, Character.toString(otp.charAt(4)));
            utils.enterValue(otpFieldSix, Character.toString(otp.charAt(5)));
        } else if(PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            utils.enterValue(otpFieldOne, otp);
        }

        return new LoginScreen(appDriver);

    }

    public LoginScreen enterDebitPin(String debitPin) {

        utils.waitFor(4);

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.enterValue(debitPinOne, Character.toString(debitPin.charAt(0)));
            utils.enterValue(debitPinTwo, Character.toString(debitPin.charAt(1)));
            utils.enterValue(debitPinThree, Character.toString(debitPin.charAt(2)));
            utils.enterValue(debitPinFour, Character.toString(debitPin.charAt(3)));
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            utils.enterValue(debitPinOne, debitPin);
        }

        return new LoginScreen(appDriver);

    }

    public LoginScreen tapOnNextButton() {

        Assert.assertTrue(utils.click(nextButton), "Failed to click on next button");

        return new LoginScreen(appDriver);

    }

    public LoginScreen tapOnOkButton() {

        Assert.assertTrue(utils.click(okButton), "Failed to tap on Ok button from popup");

        return new LoginScreen(appDriver);

    }

}
