package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.PropertyUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


import java.util.List;


public class FamilyScreen extends BaseScreen {
    CommonUtils utils = new CommonUtils();
    public static final Logger log = Logger.getLogger(FamilyScreen.class);
    SoftAssert softAssert = new SoftAssert();

    // ------------------PAGE FACTORY--------------------------//
    public FamilyScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "navigation_bar_item_icon_view")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton")
    public List<MobileElement> tabs;

    @AndroidFindBy(id = "iv_user")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='icons/icUser']")
    public List<MobileElement> userIcon;

    @AndroidFindBy(id = "iv_balance")
    public List<MobileElement> loyaltyBalanceIcon;

    @AndroidFindBy(id = "tv_balance")
    public MobileElement loyaltyBalanceTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeActivityIndicator[@name=\"In progress\"]")
    public List<MobileElement> loyalityblanceprogress;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"engAdultsIcGeneralRefresh\"]")
    public List<MobileElement> loyalityblnceerror;

    @AndroidFindBy(id = "tv_title")
    public List<MobileElement> titleTxt;

    @AndroidFindBy(id = "tv_header")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Family\"] ")
    public MobileElement headerFamilyTxt;

    @AndroidFindBy(id = "iv_background")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
    public List<MobileElement> cardImg;

    @AndroidFindBy(id = "siv_profile")
    public List<MobileElement> profilePic;

    @AndroidFindBy(id = "tv_name")
    public List<MobileElement> kidNameTxt;

    @AndroidFindBy(id = "tv_points")
    public List<MobileElement> kidTPBalanceTxt;

    @AndroidFindBy(id = "tv_points_currency")
    public List<MobileElement> kidTPCurrencyTxt;

    @AndroidFindBy(id = "iv_settings")
    //(//XCUIElementTypeButton[@name="engAdultsIcGeneralSettings"])[1]
    public List<MobileElement> settingIcon;

    @AndroidFindBy(id = "tvButtonText")
    public MobileElement addAnotherChildBtn;

    //Settings
    @AndroidFindBy(id = "tv_label_title")
    public MobileElement labelTxt;

    @AndroidFindBy(id = "cl_family_set_up")
    public MobileElement familySetUp;

    @AndroidFindBy(id = "iv_setip_kids")
    public MobileElement setUpIcon;

    @AndroidFindBy(id = "tv_qr_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Generate a QR code to activate your child's App\"]")
    public MobileElement qrTitleTxt;

    @AndroidFindBy(id = "tv_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Name\"]")
    public MobileElement nameTitleTxt;

    @AndroidFindBy(id = "ti_value")
    public MobileElement nameValueTxt;

    @AndroidFindBy(id = "cl_mp_access")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marketplace interests\"]")
    public MobileElement shoppingGroup;

    @AndroidFindBy(id = "tv_label_mp_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primaryHeader\"])[1]")
    public MobileElement mpAccessLabel1;

    @AndroidFindBy(id = "tv_mp_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primarySubheader\"])[1]")

    public MobileElement mpAccessSubLabel1;

    @AndroidFindBy(id = "ls_mp_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"switchControl\"])[1]")
    public MobileElement mpAccessToggle;

    @AndroidFindBy(id = "tv_label_mp_interest_access")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Marketplace interests\"]")
    public MobileElement mpAccessLabel2;

    @AndroidFindBy(id = "iv_mp_access")
    public MobileElement mpAccessIcon;

    @AndroidFindBy(id = "cl_cd_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primaryHeader\"])[2]")
    public MobileElement viewCardGroup;

    @AndroidFindBy(id = "tv_label_cd_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primarySubheader\"])[2]")
    public MobileElement viewCardLabel;

    @AndroidFindBy(id = "ls_cd_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"switchControl\"])[2]")
    public MobileElement viewCardToggle;

    @AndroidFindBy(id = "cl_transfer_access")
    public MobileElement moneyTransferGroup;

    @AndroidFindBy(id = "tv_label_transfer_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primaryHeader\"])[3]")
    public MobileElement moneyTransfeLabel;
    @AndroidFindBy(id = "ls_transfer_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"switchControl\"])[3]")
    public MobileElement moneyTransferToggle;

    @AndroidFindBy(id = "cl_tel_bill_payment_access")
    public MobileElement billGroup;

    @AndroidFindBy(id = "tv_label_tel_bill_payment_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"primaryHeader\"])[4]")
    public MobileElement billLabel;

    @AndroidFindBy(id = "ls_tel_bill_payment_access")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"switchControl\"])[4]")
    public MobileElement billToggle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    public MobileElement backbtn;

    //KYC Update
    private String androidKidsExpiryBanner = "//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.view.ViewGroup[contains(@resource-id,'dbc_doc_expiry_banner')]";
    private String iosKidsExpiryBanner = "";

    private String androidKidsExpiryIcon = "//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.view.ViewGroup/android.widget.ImageView[contains(@resource-id,'iv_widget')]";
    private String iosKidsExpiryIcon = "";

    private String androidKidsExpiryTitle = "//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_title')]";
    private String iosKidsExpiryTitle = "";

    private String androidKidsExpiryDescription = "//android.widget.TextView[contains(@text,'%s')]/following-sibling::android.view.ViewGroup/android.widget.TextView[contains(@resource-id,'tv_description')]";
    private String iosKidsExpiryDescription = "";

    public void iLandOnFamilyTab() {
        utils.waitUntilVisible(tabs.get(0), 15);
        Assert.assertTrue(tabs.get(2).isDisplayed(), "Family Tab is displayed");
        tabs.get(2).click();
    }

    public void verifyKidsCardUI() throws InterruptedException {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(userIcon.get(0).isDisplayed(), "User Icon is not displayed");
                Assert.assertTrue(loyaltyBalanceIcon.get(0).isDisplayed(), "loyalty Balance Icon is not displayed");
                Assert.assertTrue(loyaltyBalanceTxt.isDisplayed(), "loyalty Balance text is not displayed");
                Assert.assertTrue(headerFamilyTxt.isDisplayed(), "Family Header is not displayed");
                Assert.assertTrue(cardImg.get(0).isDisplayed(), "Kid Card is not displayed");
                Assert.assertTrue(settingIcon.get(0).isDisplayed(), "Settings Icon is not displayed");
                //Kid card
                Assert.assertTrue(profilePic.get(0).isDisplayed(), "Profile Pic is not displayed");
                Assert.assertTrue(kidNameTxt.get(0).isDisplayed(), "Kid Name is not displayed");
                Assert.assertTrue(loyaltyBalanceIcon.get(1).isDisplayed(), "loyalty Balance Icon of kid card is not displayed");
                Assert.assertTrue(kidTPBalanceTxt.get(0).isDisplayed(), "loyalty Balance of kid card is not displayed");
                Assert.assertTrue(kidTPCurrencyTxt.get(0).isDisplayed(), "loyalty Balance TP Text of kid card is not displayed");
                utils.scrollTo("Add another child");
                Assert.assertTrue(addAnotherChildBtn.isDisplayed(), "Add Another child button is not displayed");
                break;
            case "ios":
                utils.waitUntilVisible(userIcon.get(0), 5);
                softAssert.assertTrue(userIcon.get(0).isDisplayed(), "User Icon is not displayed");
                softAssert.assertTrue(headerFamilyTxt.isDisplayed(), "Family Header is not displayed");
                if (cardImg.size() > 4) {
                    log.info(cardImg.size() - 4 + " :kids are present");
                    for (int i = 1; i <= cardImg.size() - 4; i++) {
                        MobileElement childname = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
                        log.info("kid name is: " + childname.getText());
                        if (!childname.isDisplayed()) {
                            utils.iOSScroll("down");
                        }
                        MobileElement assigntask = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeButton[1]"));
                        log.info("Assign a task is displayed");
                        MobileElement openbankaccount = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[\"+i+\"]/XCUIElementTypeStaticText[3]"));
                        if (openbankaccount.getText().contains("Open a bank account for " + childname.getText() + "")) {
                            log.info("open account banner displayed");
                        } else {
                            MobileElement accountdetails = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[\"+i+\"]/XCUIElementTypeStaticText[2]"));
                            log.info("Account is present for this kid");
                            MobileElement permisiion = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[\"+i+\"]/XCUIElementTypeStaticText[3]"));
                            log.info(" Permisiion tab present for this kid");
                        }
                        MobileElement childsettingicon = appDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"engAdultsIcGeneralSettings\"]"));
                        childsettingicon.isDisplayed();
                        break;
                    }
                } else {
                    log.info("No kid present");
                    break;
                }
                int x = cardImg.size() - 1;
                utils.iOSScroll("down");
                MobileElement addanotherchild = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[" + x + "]"));
                if (addanotherchild.isDisplayed() == false) {
                    utils.iOSScroll("down");
                    addanotherchild.click();
                    log.info("Able to click add another child");
                }
                softAssert.assertAll();
                break;
        }
    }

    public void verifyKidsCardSettingsUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(settingIcon.get(0).isDisplayed(), "Settings Icon is not displayed");
                settingIcon.get(0).click();
                Assert.assertTrue(labelTxt.getText().contains("Settings - "), "Settings label is incorrect");
                Assert.assertTrue(familySetUp.isDisplayed(), "Settings Set Up Box is not displayed");
                Assert.assertTrue(setUpIcon.isDisplayed(), "Set Up Icon is not displayed");
                Assert.assertTrue(qrTitleTxt.getText().equals("Generate a QR code to activate your child's App"), "Generate a QR code to activate the app for your child is incorrect");
                Assert.assertTrue(nameTitleTxt.isDisplayed(), "name Title Text is not displayed");
                Assert.assertTrue(nameValueTxt.isDisplayed(), "name Title Box is not displayed");
                //Shopping
                Assert.assertTrue(shoppingGroup.isDisplayed(), "Marketplace Box is not displayed");
                Assert.assertTrue(mpAccessLabel1.getText().equals("Shopping"), "Shopping label is incorrect");
                Assert.assertTrue(mpAccessSubLabel1.getText().contains("Allows your child to shop for games, electronics and more, with money or TouchPoints"), "Shopping Sub Label is not displayed");
                Assert.assertTrue(mpAccessToggle.isDisplayed(), "Marketplace toggle is not displayed");
                Assert.assertTrue(mpAccessLabel2.getText().equals("Marketplace interests"), "Marketplace interests label is incorrect");
                Assert.assertTrue(mpAccessIcon.isDisplayed(), "Marketplace Interests Icon is not displayed");
                //View Card Details
                utils.scrollTo("Allow bill payments");
                Assert.assertTrue(viewCardGroup.isDisplayed(), "View Card Group is not displayed");
                Assert.assertTrue(viewCardLabel.getText().contains("View card details"), "View card details label is incorrect");
                Assert.assertTrue(viewCardToggle.isDisplayed(), "View card details toggle is not displayed");
                //Allow Money Transfers
                Assert.assertTrue(moneyTransferGroup.isDisplayed(), "Allow money transfers Group is not displayed");
                Assert.assertTrue(moneyTransfeLabel.getText().contains("Allow money transfers"), "Allow money transfers label is incorrect");
                Assert.assertTrue(moneyTransferToggle.isDisplayed(), "Allow money transfers Toggle is not displayed");
                //Bill Payments
                Assert.assertTrue(billGroup.isDisplayed(), "Bill Payments is not displayed");
                Assert.assertTrue(billLabel.getText().equals("Allow bill payments"), "Access to telecom bill payments label is incorrect");
                Assert.assertTrue(billToggle.isDisplayed(), "Bill Payments Toggle is not displayed");
                break;
            case "ios":
                if (cardImg.size() > 4) {

                    log.info(cardImg.size() - 4 + " :child are present");
                    for (int i = 1; i <= cardImg.size() - 4; i++) {
                        MobileElement childname = appDriver.findElement(By.xpath("//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[" + i + "]/XCUIElementTypeStaticText[1]"));
                        if (!childname.isDisplayed()) {
                            utils.iOSScroll("down");
                        }
                        log.info(childname.getText());
                        String childnametoverify = childname.getText();
                        MobileElement childsettingicon = appDriver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"engAdultsIcGeneralSettings\"]"));

                        childsettingicon.click();
                        softAssert.assertTrue(qrTitleTxt.getText().equals("Generate a QR code to activate your child's App"), "Generate a QR code to activate the app for your child is incorrect");
                        MobileElement qrdesc = appDriver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='This allows " + childnametoverify + " to register, recover their passcode and register on a new device']"));
                        softAssert.assertTrue(qrdesc.getText().equals("This allows " + childnametoverify + " to register, recover their passcode and register on a new device"), "Qr description kis wrong");
                        softAssert.assertTrue(nameTitleTxt.isDisplayed(), "name Title Text is not displayed");
                        //Shopping
                        softAssert.assertTrue(mpAccessLabel1.getText().equals("Shopping"), "Shopping label is incorrect");
                        softAssert.assertTrue(mpAccessToggle.isDisplayed(), "Shopping toggle is not displayed");
                        softAssert.assertTrue(mpAccessSubLabel1.getText().contains("Allows your child to shop for games, electronics and more, with money or TouchPoints"), "Shopping Sub Label is not displayed");
                        softAssert.assertTrue(mpAccessLabel2.getText().equals("Marketplace interests"), "Marketplace interests label is incorrect");
                        //View Card Details
                        softAssert.assertTrue(viewCardGroup.isDisplayed(), "View Card Group is not displayed");
                        softAssert.assertTrue(viewCardLabel.getText().contains("View card details"), "View card details label is incorrect");
                        softAssert.assertTrue(viewCardToggle.isDisplayed(), "View card details toggle is not displayed");
                        utils.scrollTo("Allow bill payments");
                        //Allow Money Transfers
                        softAssert.assertTrue(moneyTransfeLabel.getText().contains("Allow money transfers"), "Allow money transfers label is incorrect");
                        softAssert.assertTrue(moneyTransferToggle.isDisplayed(), "Allow money transfers Toggle is not displayed");
                        //Bill Payments
                        softAssert.assertTrue(billLabel.getText().equals("Allow bill payments"), "Access to telecom bill payments label is incorrect");
                        softAssert.assertTrue(billToggle.isDisplayed(), "Bill Payments Toggle is not displayed");
                        backbtn.click();
                        log.info("child setting test case pass");
                        softAssert.assertAll();
                        break;
                    }
                } else {
                    log.info("No kid  hence skipping setting testcase");
                    break;
                }
                break;
        }
    }

    public ScanYourEIDScreen tapOnExpiryBanner(String childName) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            Assert.assertTrue(utils.scrollAndClick(By.xpath(utils.getXpath(androidKidsExpiryBanner, childName)), 2), "Failed to tap on expiry banner for the kid: " + childName);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new ScanYourEIDScreen(appDriver);

    }

    public FamilyScreen verifyExpiryBanner(String childName) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(By.xpath(utils.getXpath(androidKidsExpiryBanner, childName)), 3);
            Assert.assertTrue(utils.eleIsDisplayed(By.xpath(utils.getXpath(androidKidsExpiryBanner, childName))), "Expiry banner is not present for the kid: " + childName);
            utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(By.xpath(utils.getXpath(androidKidsExpiryIcon, childName)), 2);
            Assert.assertTrue(utils.eleIsDisplayed(By.xpath(utils.getXpath(androidKidsExpiryIcon, childName))), "Expiry banner icon is not present for the kid: " + childName);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new FamilyScreen(appDriver);

    }

    public FamilyScreen verifyExpiryBannerTitle(String childName, String bannerTitle) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(By.xpath(utils.getXpath(androidKidsExpiryTitle, childName)), 3);

            String title = utils.validateAndGetText(utils.getElement(By.xpath(utils.getXpath(androidKidsExpiryTitle, childName))));
            Assert.assertTrue(title.contains(bannerTitle), "KYC expiry banner title is not as expected. Expected: " + bannerTitle + " | Actual: " + title);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new FamilyScreen(appDriver);

    }

    public FamilyScreen verifyExpiryBannerDescription(String childName, String bannerDescription) {

        if (PropertyUtil.getValue("platform").equalsIgnoreCase("android")) {
            utils.scrollFromDownToUpInAppUsingPointerInputUntilElementIsVisible(By.xpath(utils.getXpath(androidKidsExpiryDescription, childName)), 3);

            String description = utils.validateAndGetText(utils.getElement(By.xpath(utils.getXpath(androidKidsExpiryDescription, childName))));
            Assert.assertTrue(description.contains(bannerDescription), "KYC expiry banner description is not as expected. Expected: " + bannerDescription + " | Actual: " + description);
        } else if (PropertyUtil.getValue("platform").equalsIgnoreCase("ios")) {
            //--to be developed
        }

        return new FamilyScreen(appDriver);

    }

}