package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

public class ProfileScreen extends BaseScreen {

    CommonUtils utils = new CommonUtils();

    public ProfileScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "idic_emirates_id")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement emiratesIdDetails;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement emiratesIdCardViewTitle;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.ImageView[contains(@resource-id,'iv_right_icon')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement rightIcon;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_subTitle1')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement emiratesIdCardViewEidNumber;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_subTitle2')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement emiratesIdCardViewExpiryDate;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[contains(@resource-id,'idic_emirates_id')]//android.widget.TextView[contains(@resource-id,'tv_description')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement emiratesIdCardViewInfo;

    @AndroidFindBy(id = "buttonView")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement updateEmirateIdButton;


    public ScanYourEIDScreen tapOnUpdateEmiratesIdButton() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(updateEmirateIdButton, 1);
        Assert.assertTrue(utils.click(updateEmirateIdButton), "Failed to tap on Update EID button");

        return new ScanYourEIDScreen(appDriver);

    }

    public ProfileScreen verifyEmiratesIdCardViewTitle(String title) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(emiratesIdCardViewTitle, 1);
        String actualTitle = utils.validateAndGetText(emiratesIdCardViewTitle);
        Assert.assertTrue(actualTitle.contains(title), "EID card view title is not as expected. Expected: " + title + " | Actual: " + actualTitle);
        Assert.assertTrue(utils.eleIsDisplayed(rightIcon), "Right icon is not displayed");

        return new ProfileScreen(appDriver);

    }

    public ProfileScreen verifyEmiratesIdCardViewNumber() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(emiratesIdCardViewEidNumber, 1);
        Assert.assertTrue(utils.eleIsDisplayed(emiratesIdCardViewEidNumber), "EID number is not displayed");

        return new ProfileScreen(appDriver);

    }

    public ProfileScreen verifyEmiratesIdExpiryDateLabel(String expDate) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(emiratesIdCardViewExpiryDate, 1);
        String exp_Date = utils.validateAndGetText(emiratesIdCardViewExpiryDate);
        Assert.assertTrue(exp_Date.contains(expDate), "Expiry date is not displayed");

        return new ProfileScreen(appDriver);

    }

    public ProfileScreen verifyEmiratesIdCardViewInfo(String description) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(emiratesIdCardViewInfo, 1);
        String info = utils.validateAndGetText(emiratesIdCardViewInfo);
        Assert.assertTrue(info.contains(description), "EID card view info is not displayed");

        return new ProfileScreen(appDriver);

    }

    public ProfileScreen verifyUpdateEmirateIdButton(String buttonText) {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(updateEmirateIdButton, 1);
        String text = utils.validateAndGetText(updateEmirateIdButton);
        Assert.assertTrue(text.contains(buttonText), "Button text is not as expected");

        return new ProfileScreen(appDriver);

    }

    public ProfileScreen verifyEmiratesIdCardViewNotPresent() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(emiratesIdCardViewTitle, 1);
        Assert.assertTrue(!utils.eleIsDisplayed(emiratesIdCardViewTitle), "EID card view is present");

        return new ProfileScreen(appDriver);

    }

}
