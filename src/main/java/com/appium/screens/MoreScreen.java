package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

public class MoreScreen extends BaseScreen {
    CommonUtils utils = new CommonUtils();
    SoftAssert softAssert = new SoftAssert();

    public static final Logger log = Logger.getLogger(MoreScreen.class);

    // ------------------PAGE FACTORY--------------------------//
    public MoreScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @AndroidFindBy(id = "navigation_bar_item_icon_view")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name='Tab Bar']/XCUIElementTypeButton")
    public List<MobileElement> moreTab;

    //My Interests

    @AndroidFindBy(id = "iv_account")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Account']")
    public MobileElement accountsBtn;


    @AndroidFindBy(id = "tv_my_interests")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My interests']")
    public MobileElement myInterestsTxt;


    @AndroidFindBy(id = "iv_my_interests")
    public MobileElement myInterestsIcon;


    @AndroidFindBy(id = "tv_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My interests]")
    public List<MobileElement> titleTxt;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'FAQs Onboarding')]")
    public MobileElement FAQPDFTxt;

    @AndroidFindBy(id = "tv_description")
    public MobileElement descriptionTxt;

    @AndroidFindBy(id = "iv_icon")
    public List<MobileElement> interestsIcon;

    @AndroidFindBy(id = "btn_save")
    public MobileElement saveBtn;

    //Notificatons
    @AndroidFindBy(id = "tv_notifications")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Notifications']")
    public MobileElement notificationsBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Marketing communications']")
    public MobileElement receiveMarketingNotification;

    @AndroidFindBy(id = "tv_receive_email_alerts")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Receive email alerts']")
    public MobileElement receiveEmailAlertsTxt;

    @AndroidFindBy(id = "switch_receive_email_alerts")
    public MobileElement receiveEmailAlertsToggle;

    @AndroidFindBy(id = "tv_receive_sms_alerts")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Receive SMS alerts']")
    public MobileElement receiveSmsAlertsTxt;

    @AndroidFindBy(id = "switch_receive_sms_alerts")
    public MobileElement receiveSmsAlertsToggle;

    //Get In Touch
    @AndroidFindBy(id = "tv_get_in_touch")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Get in touch']")
    public MobileElement getInTouchBtn;

    @AndroidFindBy(id = "tv_marketplace_faq")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='FAQ']")
    public MobileElement marketplaceFaqBtn;

    @AndroidFindBy(id = "iv_marketplace_faq")
    public MobileElement marketplaceFaqIcon;

    @AndroidFindBy(className = "android.webkit.WebView")
    public List<MobileElement> web_view;

    //Terms and Conditions
    @AndroidFindBy(id = "tv_terms_and_conditions")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Terms & Conditions']")
    public MobileElement tncBtn;

    @AndroidFindBy(id = "tv_mp_terms_and_conditions")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Marketplace Terms & Conditions']")
    public MobileElement marketplaceTnCBtn;

    @AndroidFindBy(id = "iv_mp_terms_and_conditions")
    public MobileElement marketplaceTnCIcon;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Marketplace Terms & Conditions']")
    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Marketplace Terms')]")
    public MobileElement pdfviewMarketplaceTnC;


    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Terms and Conditions')]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='General Terms & Conditions']")
    public MobileElement pdfGeneralTnC;


    @AndroidFindBy(xpath = "//android.widget.ImageButton")
    public MobileElement pdfBackBtn;

    @AndroidFindBy(id = "tv_gen_terms_and_conditions")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='General Terms & Conditions']")
    public MobileElement GeneralTnCBtn;

    @AndroidFindBy(id = "iv_gen_terms_and_conditions")
    public MobileElement GeneralTnCIcon;


    //Privacy Policy
    @AndroidFindBy(id = "tv_privacy_policy")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Privacy Policy']")
    public MobileElement privacyPolicyBtn;

    @AndroidFindBy(id = "tv_mp_privacy_policy")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Marketplace Privacy Policy']")
    public MobileElement mpPrivacyPolicyBtn;

    @AndroidFindBy(id = "iv_mp_privacy_policy")
    public MobileElement mpPrivacyPolicyIcon;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Privacy Notice')]")
    public MobileElement pdfmpPrivacyPolicyTxt;

    @AndroidFindBy(id = "tv_general_privacy_policy")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='General Privacy Policy']")
    public MobileElement generalPrivacyPolicyBtn;

    @AndroidFindBy(id = "iv_general_privacy_policy")
    public MobileElement generalPrivacyPolicyIcon;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'This policy sets out the terms')]")
    public MobileElement pdfmpGeneralPrivacyPolicyTxt;

    @AndroidFindBy(id = "com.google.android.apps.docs:id/pdf_view")
    public MobileElement pdfPrivacyNoticeTxt;

    //Transparency
    @AndroidFindBy(id = "tv_transparency")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Transparency']")
    public MobileElement transparencyBtn;

    @AndroidFindBy(id = "tv_order_cancellation_policy")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Order cancellation policy']")
    public MobileElement orderCancellationBtn;

    @AndroidFindBy(id = "iv_order_cancellation_policy")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='icMenuCancellationPolicy']")
    public MobileElement orderCancellationIcon;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Order')]")
    public MobileElement pdfviewOrderCancel;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Key Facts Statement']")
    public MobileElement pdfKFSbtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Bank charges & fees']")
    public MobileElement pdfbankchargesbtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Mudarib/Bank profit sharing and weightage of investment']")
    public MobileElement pdfbnkprofitinvestman;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Previous profit distribution rates']")
    public MobileElement pdfprofitrates;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shari'ah Certificate\"]")
    public MobileElement pdfshariahcertificate;

    //My Orders
    @AndroidFindBy(id = "tv_my_orders")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='My orders']")
    public MobileElement myOrdersTxt;

    @AndroidFindBy(id = "iv_my_orders")
    public MobileElement myOrdersIcon;

    @AndroidFindBy(id = "menu_item_chat")
    public MobileElement chatIcon;

    @AndroidFindBy(id = "tv_label_order_on")
    public List<MobileElement> orderIDTxt;

    @AndroidFindBy(id = "tv_label_date")
    public List<MobileElement> orderedOnTxt;

    @AndroidFindBy(id = "tv_item_count")
    public List<MobileElement> itemCountTxt;

    @AndroidFindBy(id = "tv_order_no")
    public List<MobileElement> orderNoTxt;

    @AndroidFindBy(id = "tv_date")
    public List<MobileElement> orderDateTxt;

    @AndroidFindBy(id = "ic_expandable")
    public List<MobileElement> orderIDArrow;

    @AndroidFindBy(id = "siv_item")
    public List<MobileElement> itemPic;

    @AndroidFindBy(id = "tv_item_name")
    public List<MobileElement> itemNameTxt;

    @AndroidFindBy(id = "tv_delivery_info")
    public List<MobileElement> deliveryInfoTxt;

    @AndroidFindBy(id = "tv_item_quantity")
    public List<MobileElement> itemQtyTxt;

    @AndroidFindBy(id = "iv_checkout_icon")
    public List<MobileElement> shipmentStatusIcon;

    @AndroidFindBy(id = "tv_checkout_text")
    public List<MobileElement> shipmentStatusTxt;

    @AndroidFindBy(id = "tv_label_order_summary")
    public MobileElement orderSummaryTxt;

    @AndroidFindBy(id = "ll_order_detail")
    public MobileElement orderDetailTxt;

    @AndroidFindBy(className = "android.widget.TextView")
    public List<MobileElement> orderDetailedTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping address']")
    public MobileElement shippingAddressTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Items subtotal')]")
    public MobileElement itemsSubTotalTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='VAT']")
    public MobileElement vatTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Delivery']")
    public MobileElement deliveryTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Discount']")
    public MobileElement discountTxt;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Total']")
    public MobileElement totalTxt;


    public void iLandOnMoreTab() {
        utils.waitUntilVisible(moreTab.get(0), 5);
        Assert.assertTrue(moreTab.get(3).isDisplayed(), "More Tab is displayed");
        moreTab.get(3).click();
    }

    public void clickAndVerifyOnMoreUiComponents() {
        Assert.assertTrue(accountsBtn.isDisplayed(), "My Account  section is displayed");
        accountsBtn.click();
        Assert.assertTrue(notificationsBtn.isDisplayed(), "My notification  section is displayed");
        notificationsBtn.click();
        Assert.assertTrue(getInTouchBtn.isDisplayed(), "My Get in touch  section is displayed");
        getInTouchBtn.click();
        Assert.assertTrue(tncBtn.isDisplayed(), "My Terms n condition   section  is displayed");
        tncBtn.click();
        Assert.assertTrue(privacyPolicyBtn.isDisplayed(), "My privacyPolicyBtn  section is displayed");
        privacyPolicyBtn.click();
        Assert.assertTrue(transparencyBtn.isDisplayed(), "My transparencyBtn  section is displayed");
        transparencyBtn.click();


    }

    public void iLandOnMyInterests() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                accountsBtn.click();
                Assert.assertTrue(myInterestsIcon.isDisplayed(), "My Interests Icon is displayed");
                Assert.assertTrue(myInterestsTxt.getText().equals("My interests"), "My Interests title is incorrect");
                myInterestsTxt.click();
                break;
            case "ios":
                accountsBtn.click();
                myInterestsTxt.click();
        }
    }

    public void verifyMyInterestsScreen() {

        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(titleTxt.get(0).isDisplayed(), "My Interests Screen is not displayed");
                Assert.assertTrue(titleTxt.get(0).getText().equals("My interests"), "My Interests title is incorrect");
                Assert.assertTrue(descriptionTxt.getText().equals("Select or remove interests to personalize your offers"), "My Interests subtitle is incorrect");

                for (int i = 0; i < interestsIcon.size(); i++) {
                    Assert.assertTrue(titleTxt.get(i + 1).isDisplayed(), "My Interests title is not displayed");
                    Assert.assertTrue(interestsIcon.get(i).isDisplayed(), "My Interests Icon is not displayed");
                }
                Assert.assertTrue(saveBtn.isDisplayed(), "Save Interests button is not displayed");
                break;
            case "ios":
                CommonUtils.backButton();
                break;
        }
    }

    public void verifyMyInterestsSaved() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(titleTxt.get(0).isDisplayed(), "My Interests Screen is not displayed");
                titleTxt.get(2).click();
                saveBtn.click();
                Assert.assertTrue(moreTab.get(3).isDisplayed(), "More Tab is not displayed");
                break;
            case "ios":
                CommonUtils.backButton();
                break;
        }
    }

    public void verifyNotificationsUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(notificationsBtn.isDisplayed(), "Notifications Sub Tab is not displayed");
                notificationsBtn.click();
                Assert.assertTrue(receiveEmailAlertsTxt.isDisplayed(), "Receive Email Text is not displayed");
                Assert.assertTrue(receiveEmailAlertsToggle.isDisplayed(), "Receive Email Toggle is not displayed");
                Assert.assertTrue(receiveSmsAlertsTxt.isDisplayed(), "Receive SMS Text is not displayed");
                Assert.assertTrue(receiveSmsAlertsToggle.isDisplayed(), "Receive SMS Toggle is not displayed");
                break;
            case "ios":
                softAssert.assertTrue(notificationsBtn.isDisplayed(), "Notifications Sub Tab is not displayed");
                notificationsBtn.click();
                softAssert.assertTrue(receiveEmailAlertsTxt.isDisplayed(), "Receive Email Text is not displayed");
                softAssert.assertTrue(receiveSmsAlertsTxt.isDisplayed(), "Receive SMS Text is not displayed");
                softAssert.assertTrue(receiveMarketingNotification.isDisplayed(), "Receive Marketing notification is not displayed");
                softAssert.assertAll();
                break;
        }
    }

    public void verifyMarketplaceFAQUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(getInTouchBtn.isDisplayed(), "Notifications Sub Tab is not displayed");
                getInTouchBtn.click();
                Assert.assertTrue(marketplaceFaqBtn.isDisplayed(), "FAQ Text is not displayed");
                Assert.assertTrue(marketplaceFaqIcon.isDisplayed(), "FAQ Icon is not displayed");
                marketplaceFaqBtn.click();
                Assert.assertTrue(FAQPDFTxt.isDisplayed(), "Marketplace FAQ PDF is not displayed");
                break;
            case "ios":
                softAssert.assertTrue(getInTouchBtn.isDisplayed(), "Notifications Sub Tab is not displayed");
                getInTouchBtn.click();
                Assert.assertTrue(marketplaceFaqBtn.isDisplayed(), "FAQ Text is not displayed");
                marketplaceFaqBtn.click();
                CommonUtils.backButton();
                break;
        }
    }

    public void verifyTermsAndConditionsUI() throws IOException {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(tncBtn.isDisplayed(), "Terms and Conditions Sub Tab is not displayed");
                tncBtn.click();
                Assert.assertTrue(marketplaceTnCBtn.isDisplayed(), "Marketplace TnC Text is not displayed");
                Assert.assertTrue(marketplaceTnCIcon.isDisplayed(), "Marketplace TnC Icon is not displayed");
                marketplaceTnCBtn.click();
                Assert.assertTrue(pdfviewMarketplaceTnC.isDisplayed(), "marketplace TnC PDF Text is incorrect");
                pdfBackBtn.click();
                Assert.assertTrue(GeneralTnCBtn.isDisplayed(), "General TnC Text is not displayed");
                Assert.assertTrue(GeneralTnCIcon.isDisplayed(), "General TnC Icon is not displayed");
                GeneralTnCBtn.click();
                Assert.assertTrue(pdfGeneralTnC.isDisplayed(), "General TnC PDF Text is incorrect");
                break;
            case "ios":
                softAssert.assertTrue(tncBtn.isDisplayed(), "Terms and Conditions Sub Tab is not displayed");
                tncBtn.click();
                softAssert.assertTrue(marketplaceTnCBtn.isDisplayed(), "Marketplace TnC Text is not displayed");
                marketplaceTnCBtn.click();
                CommonUtils.backButton();
                GeneralTnCBtn.click();
                CommonUtils.backButton();
                softAssert.assertAll();
                break;
        }
    }

    public void verifyPrivacyPolicyUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(privacyPolicyBtn.isDisplayed(), "Privacy Policy Sub Tab is not displayed");
                privacyPolicyBtn.click();
                Assert.assertTrue(mpPrivacyPolicyBtn.isDisplayed(), "marketplace Privacy Policy Text is not displayed");
                Assert.assertTrue(mpPrivacyPolicyIcon.isDisplayed(), "marketplace Privacy Policy Icon is not displayed");
                mpPrivacyPolicyBtn.click();
                Assert.assertTrue(pdfmpPrivacyPolicyTxt.isDisplayed(), "marketplace Privacy Policy PDF Text is incorrect");
                pdfBackBtn.click();
                Assert.assertTrue(generalPrivacyPolicyBtn.isDisplayed(), "General Privacy Policy Text is not displayed");
                Assert.assertTrue(generalPrivacyPolicyIcon.isDisplayed(), "General Privacy Policy Icon is not displayed");
                generalPrivacyPolicyBtn.click();
                Assert.assertTrue(pdfmpGeneralPrivacyPolicyTxt.isDisplayed(), "General Privacy Policy PDF Text is incorrect");
                break;
            case "ios":
                softAssert.assertTrue(privacyPolicyBtn.isDisplayed(), "Privacy Policy Sub Tab is not displayed");
                privacyPolicyBtn.click();
                CommonUtils.backButton();
                generalPrivacyPolicyBtn.click();
                CommonUtils.backButton();
                softAssert.assertAll();
                break;
        }
    }

    public void verifyTransparencyUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(transparencyBtn.isDisplayed(), "Transparency Sub Tab is not displayed");
                transparencyBtn.click();
                Assert.assertTrue(orderCancellationBtn.isDisplayed(), "Order Cancellation Policy Text is not displayed");
                Assert.assertTrue(orderCancellationIcon.isDisplayed(), "Order Cancellation Icon is not displayed");
                orderCancellationBtn.click();
                Assert.assertTrue(pdfviewOrderCancel.isDisplayed(), "Order Cancellation PDF Text is incorrect");
                pdfBackBtn.click();
                break;
            case "ios":
                Assert.assertTrue(transparencyBtn.isDisplayed(), "Transparency Sub Tab is not displayed");
                transparencyBtn.click();
                orderCancellationBtn.click();
                CommonUtils.backButton();
                pdfKFSbtn.click();
                CommonUtils.backButton();
                pdfbankchargesbtn.click();
                CommonUtils.backButton();
                pdfbnkprofitinvestman.click();
                CommonUtils.backButton();
                pdfprofitrates.click();
                CommonUtils.backButton();
                pdfshariahcertificate.click();
                CommonUtils.backButton();
        }
    }

    public void iLandOnMyOrdersScreen() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                accountsBtn.click();
                Assert.assertTrue(myOrdersIcon.isDisplayed(), "My Orders Icon is not displayed");
                Assert.assertTrue(myOrdersTxt.getText().equals("My orders"), "My Orders title is incorrect");
                myOrdersTxt.click();
                Assert.assertTrue(titleTxt.get(0).isDisplayed(), "My orders Screen is not displayed");
                Assert.assertTrue(titleTxt.get(0).getText().equals("My orders"), "My orders Screen is not displayed");
                Assert.assertTrue(pdfBackBtn.isDisplayed(), "Back button is not displayed");
                Assert.assertTrue(chatIcon.isDisplayed(), "Chat Icon is not displayed");
                break;
            case "ios":
                accountsBtn.click();
                myOrdersTxt.click();
                break;
        }
    }

    public void verifyMyOrdersScreen() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.waitUntilVisible(orderIDTxt.get(0), 2);
                Assert.assertTrue(orderIDTxt.get(0).isDisplayed(), "Order ID is not displayed");
                Assert.assertTrue(orderedOnTxt.get(0).isDisplayed(), "Ordered On is not displayed");
                Assert.assertTrue(itemCountTxt.get(0).isDisplayed(), "Order Item Count is not displayed");
                Assert.assertTrue(orderNoTxt.get(0).isDisplayed(), "Order No. is not displayed");
                Assert.assertTrue(orderDateTxt.get(0).isDisplayed(), "Order Date is not displayed");
                Assert.assertTrue(orderIDArrow.get(0).isDisplayed(), "Order ID Arrow is not displayed");
                Assert.assertTrue(itemPic.get(0).isDisplayed(), "Order Item Pic is not displayed");
                Assert.assertTrue(itemNameTxt.get(0).isDisplayed(), "Order Item Name is not displayed");
                Assert.assertTrue(deliveryInfoTxt.get(0).isDisplayed(), "Order Delivery Info is not displayed");
                Assert.assertTrue(itemQtyTxt.get(0).isDisplayed(), "Order Item Qty is not displayed");
                break;
            case "ios":
                CommonUtils.backButton();
                break;
        }
    }

    public void iLandOnOrderSummaryScreen() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                itemNameTxt.get(0).click();
                utils.waitUntilVisible(itemNameTxt.get(0), 2);
                Assert.assertTrue(pdfBackBtn.isDisplayed(), "Back button is not displayed");
                Assert.assertTrue(chatIcon.isDisplayed(), "Chat Icon is not displayed");
                Assert.assertTrue(itemPic.get(0).isDisplayed(), "Item Pic is not displayed");
                Assert.assertTrue(itemNameTxt.get(0).isDisplayed(), "Order Item Name is not displayed");
                Assert.assertTrue(itemQtyTxt.get(0).isDisplayed(), "Order Item Qty is not displayed");
                Assert.assertTrue(shipmentStatusIcon.get(0).isDisplayed(), "shipment Status Icon is not displayed");
                Assert.assertTrue(shipmentStatusTxt.get(0).isDisplayed(), "shipment Status Text is not displayed");
                Assert.assertTrue(orderSummaryTxt.isDisplayed(), "Order summary label is not displayed");
                Assert.assertTrue(orderDetailTxt.isDisplayed(), "Order Detail is not displayed");
                utils.scrollTo("Discount");
                Assert.assertTrue(shippingAddressTxt.isDisplayed(), "Shipping address field is not displayed");
                Assert.assertTrue(itemsSubTotalTxt.isDisplayed(), "Items subtotal is not displayed");
                Assert.assertTrue(vatTxt.isDisplayed(), "VAT field is not displayed");
                Assert.assertTrue(deliveryTxt.isDisplayed(), "Delivery field is not displayed");
                Assert.assertTrue(discountTxt.isDisplayed(), "Discount field is not displayed");
                Assert.assertTrue(totalTxt.isDisplayed(), "Total field is not displayed");
                break;
            case "ios":
                CommonUtils.backButton();
        }
    }
}

