package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.testng.Assert;

public class KidsDocumentsScreen extends BaseScreen {

    CommonUtils utils = new CommonUtils();

    public KidsDocumentsScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    //__Kids Documents Identifiers__

    private String androidKidsSettings = "//android.widget.TextView[contains(@text,'%s')]/preceding-sibling::android.widget.ImageView[contains(@resource-id,'iv_settings')]";
    private String iosKidsSettings = "";

    private String androidKidsDocument = "//android.widget.TextView[contains(@resource-id,'tv_document_item') and contains(@text,'%s')]";
    private String iosKidsDocument = "";

    private String androidKidsDocumentDownload = "//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.widget.ImageView[contains(@resource-id,'iv_document_item')]";
    private String iosKidsDocumentDownload = "";

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id,'tv_documents')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement myDocuments;

    @AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id,'iv_documents')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement myDocumentsDropdown;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id,'el_documents')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement documentsFrameLayout;

    @AndroidFindBy(id = "android:id/contentPanel")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement documentViewDownload;

    public KidsDocumentsScreen gotoChildProfileSettings(String childName) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            Assert.assertTrue(utils.scrollAndClick(By.xpath(utils.getXpath(androidKidsSettings, childName)), 3), "Failed to tap on settings for the kid: " + childName);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyMyDocumentsOption() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(myDocuments, 2);
        Assert.assertTrue(utils.eleIsDisplayed(myDocuments), "Kids documents section is not displayed");
        Assert.assertTrue(utils.eleIsDisplayed(myDocumentsDropdown), "Kids documents section is not displayed");

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyMyDocumentsOptionNotPresent() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(myDocuments,2);
        Assert.assertTrue(!utils.eleIsDisplayed(myDocuments), "Kids documents section is displayed");

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen tapOnDocumentsDropdown() {

        utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(myDocumentsDropdown,2);
        Assert.assertTrue(utils.click(myDocumentsDropdown), "Failed to click on documents dropdown");

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyMyDocumentsFrameLayout() {

        Assert.assertTrue(utils.eleIsDisplayed(documentsFrameLayout), "Kids documents list is not displayed");

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyKidsDocumentIsPresent(String document) {

        Assert.assertTrue(utils.eleIsDisplayed(By.xpath(utils.getXpath(androidKidsDocumentDownload, document))), "Document is not present: " + document);

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyKidsDocumentNotPresent(String document) {

        Assert.assertTrue(!utils.eleIsDisplayed(By.xpath(utils.getXpath(androidKidsDocumentDownload, document))), "Document is present: " + document);

        return new KidsDocumentsScreen(appDriver);

    }

    public KidsDocumentsScreen verifyKidsDocumentViewOrDownloadOption(String document) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            Assert.assertTrue(utils.click(utils.getElement(By.xpath(utils.getXpath(androidKidsDocumentDownload, document)))), "Failed to click on document download option");
            Assert.assertTrue(utils.eleIsDisplayed(documentViewDownload), "Android option to view or save document is not displayed");
            utils.backButton();
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new KidsDocumentsScreen(appDriver);

    }

}
