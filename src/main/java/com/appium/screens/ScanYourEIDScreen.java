package com.appium.screens;

import com.appium.utils.CommonUtils;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScanYourEIDScreen extends BaseScreen {

    CommonUtils utils = new CommonUtils();

    // Constructor
    public ScanYourEIDScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }


    @AndroidFindBy(id = "bv_continue_without_uaepass")
    public MobileElement continueWithoutUaePassOption;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[1]")
    public MobileElement continueWithUaePass;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
    public MobileElement navigateBackOption;

    @AndroidFindBy(id = "tv_title")
    public MobileElement scanYourEIDTitle;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@resource-id,'tv_title')])[2]")
    public MobileElement scanYourEIDTitle_family;

    @AndroidFindBy(id = "tv_subtitle")
    public MobileElement scanYourEIDSubTitle;

    @AndroidFindBy(id = "iv_placeholder")
    public MobileElement scanYourEIDImage;

    @AndroidFindBy(id = "tv_corners")
    public MobileElement getDocumentsReadyTxt;

    @AndroidFindBy(id = "tv_light")
    public MobileElement makeSureCornersCoveredTxt;

    @AndroidFindBy(id = "btn_save")
    public MobileElement scanYourEIDBtn;

    @AndroidFindBy(id = "tv_description")
    public MobileElement yourAccountIsWaiting;


    public void navigateBack() {

        navigateBackOption.click();
    }

    public void selectStandardOption() {
        continueWithoutUaePassOption.click();

    }

    public void selectAccountIsWaitingBtn() {
        yourAccountIsWaiting.click();

    }

    public void verifyEidScreenUI() {
        Assert.assertTrue(scanYourEIDTitle.isDisplayed(), "Scan your EID title is not displayed");
        Assert.assertTrue(scanYourEIDSubTitle.isDisplayed(), "Subtitile not displayed");
        Assert.assertTrue(scanYourEIDImage.isDisplayed(), "Scan your passport Image is not displayed");
        Assert.assertTrue(getDocumentsReadyTxt.isDisplayed(), "Keep your documents ready message not displayed");
        Assert.assertTrue(makeSureCornersCoveredTxt.isDisplayed(), "Make sure you cover all 4 corners text is not displayed");

    }

    public IdNowScreen selectScanYourEIDBtn() {

        scanYourEIDBtn.click();

        return new IdNowScreen(appDriver);

    }

    public ScanYourEIDScreen verifyEidScanInstructionScreen(String title) {

        String actualTitle = utils.validateAndGetText(scanYourEIDTitle);
        Assert.assertTrue(actualTitle.contains(title), "EID scan screen title is not as expected. Expected: " + title + " | Actual: " + actualTitle);

        return new ScanYourEIDScreen(appDriver);

    }

    public ScanYourEIDScreen verifyChildEidScanInstructionScreen(String title) {

        String actualTitle = utils.validateAndGetText(scanYourEIDTitle_family);
        Assert.assertTrue(actualTitle.contains(title), "EID scan screen title is not as expected. Expected: " + title + " | Actual: " + actualTitle);

        return new ScanYourEIDScreen(appDriver);

    }
    
}
