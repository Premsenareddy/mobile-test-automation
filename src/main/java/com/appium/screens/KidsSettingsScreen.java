package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class KidsSettingsScreen extends BaseScreen {

    CommonUtils utils = new CommonUtils();

    public KidsSettingsScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "idic_emirates_id")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement eidDetails;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement eidNumberTitle;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.ImageView[contains(@resource-id,'iv_right_icon')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement rightIcon;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_subTitle1')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement eidNumber;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_subTitle2')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement eidExpiryDate;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_description')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement eidExpiryDescription;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.Button[contains(@resource-id,'buttonView')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement updateEmiratesIdButton;


    public ScanYourEIDScreen tapOnUpdateEmiratesIdButton() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(updateEmiratesIdButton, 1);
        Assert.assertTrue(utils.click(updateEmiratesIdButton), "Failed to tap on Update EID button");

        return new ScanYourEIDScreen(appDriver);

    }

    public KidsSettingsScreen verifyEmiratesIdCardViewTitle(String title) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(eidNumberTitle, 3);
        String actualTitle = utils.validateAndGetText(eidNumberTitle);
        Assert.assertTrue(actualTitle.contains(title), "EID card view title is not as expected. Expected: " + title + " | Actual: " + actualTitle);
        Assert.assertTrue(utils.eleIsDisplayed(rightIcon), "Right icon is not displayed");

        return new KidsSettingsScreen(appDriver);

    }

    public KidsSettingsScreen verifyEmiratesIdCardViewNumber() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(eidNumber, 3);
        Assert.assertTrue(utils.eleIsDisplayed(eidNumber), "EID number is not displayed");

        return new KidsSettingsScreen(appDriver);

    }

    public KidsSettingsScreen verifyEmiratesIdExpiryDateLabel(String expDate) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(eidExpiryDate, 3);
        String exp_Date = utils.validateAndGetText(eidExpiryDate);
        Assert.assertTrue(exp_Date.contains(expDate), "Expiry date is not displayed");

        return new KidsSettingsScreen(appDriver);

    }

    public KidsSettingsScreen verifyEmiratesIdCardViewInfo(String description) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(eidExpiryDescription, 3);
        String info = utils.validateAndGetText(eidExpiryDescription);
        Assert.assertTrue(info.contains(description), "EID card view info is not displayed. Expected: " + description + " | Actual: " + info);

        return new KidsSettingsScreen(appDriver);

    }

    public KidsSettingsScreen verifyUpdateEmirateIdButton(String buttonText) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(updateEmiratesIdButton, 3);
        String text = utils.validateAndGetText(updateEmiratesIdButton);
        Assert.assertTrue(text.contains(buttonText), "Button text is not as expected");

        return new KidsSettingsScreen(appDriver);

    }

    public KidsSettingsScreen verifyEmiratesIdCardViewNotPresent() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(eidNumberTitle, 2);
        Assert.assertTrue(!utils.eleIsDisplayed(eidNumberTitle), "EID card view is present");

        return new KidsSettingsScreen(appDriver);

    }

}
