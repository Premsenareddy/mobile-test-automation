package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UtilityPaymentScreen extends BaseScreen {
    public UtilityPaymentScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    CommonUtils utils = new CommonUtils();
    TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Premise number']")
    @iOSXCUITFindBy(xpath ="//XCUIElementTypeStaticText[@value='Premise number']")
    public MobileElement premiseNumber;

    @AndroidFindBy(id = "cb_check")
    public MobileElement addPayeeCheckbox;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New provider']")
    public MobileElement newPayee;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Saved payee']")
    public MobileElement savedPayee;

    @AndroidFindBy(id = "tv_delete_payee")
    public MobileElement deletePayeeBtn;

    @AndroidFindBy(id = "tv_action")
    public MobileElement selectSavedPayee;

    @AndroidFindBy(id = "iv_radio")
    public MobileElement paymentUsingBy;

    @AndroidFindBy(id = "alertTitle")
    public MobileElement alertTitle;

    @AndroidFindBy(id = "message")
    public MobileElement alertMessage;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    public MobileElement alertOkBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter payee nickname']")
    public MobileElement payeeNickName;

    public void enterDewaPremiseNumber(String number) {

        switch (CommonUtils.platform.toLowerCase()){
            case "android":
                  utils.validateAndSendKeys(premiseNumber,number);
                break;

            case "ios":
                utils.validateAndSendKeys(premiseNumber,number);
                utils.validateAndClick(tu.doneButtonOniOSKeyboard);

        }
    }
}
