package com.appium.screens;
import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.util.List;
public class LoyaltyScreen extends BaseScreen {
    CommonUtils utils = new CommonUtils();
    SoftAssert softAssert = new SoftAssert();

    // ------------------PAGE FACTORY--------------------------//
    public LoyaltyScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    @iOSXCUITFindBy(id = "icons/icGeneralCurrencyAanahPoints")
    public MobileElement loyalityblanceicon;

    @AndroidFindBy(id = "tv_balance")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement balanceTxt;

    @AndroidFindBy(id = "tv_tp_balance")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement loyaltyBalanceTxt;

    @AndroidFindBy(id = "tv_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='TouchPoints']")
    public List<MobileElement> titleTxt;

    @AndroidFindBy(id = "tv_sub_title")
    public List<MobileElement> subtitleTxt;

    @AndroidFindBy(id = "iv_icon")
    public List<MobileElement> loyaltyIcon;

    @AndroidFindBy(id = "tv_earn_more")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Earn more TouchPoints']")
    public MobileElement earnMoreTxt;

    @AndroidFindBy(id = "tv_redeem")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Redeem your TouchPoints']")
    public MobileElement redeemTxt;

    @AndroidFindBy(id = "tv_label_transaction")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"My transactions\"])[1]")
    public MobileElement myTransactionsTxt;

    @AndroidFindBy(id = "iv_show_all_transaction")
    public MobileElement myTransactionsArrow;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeNavigationBar[@name='All transactions']")
    public MobileElement alltransactiontitle;

    @AndroidFindBy(id = "tv_info_title")
    public MobileElement loyTitleTxt;

    @AndroidFindBy(id = "iv_back")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Back']")
    public MobileElement backBtn;

    @AndroidFindBy(id = "tv_faq_header_action")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='FAQ']")
    public MobileElement faqBtn;

    @AndroidFindBy(id = "ll_earn_more_info_list")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Earn more TouchPoints\"]")
    public MobileElement earnMoreListTxt;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Redeem your TouchPoints\"]")
    public MobileElement redeemlisttext;

    @AndroidFindBy(id = "tv_faqs_title")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Frequently Asked Questions\"]")
    public MobileElement faqTitleTxt;

    @AndroidFindBy(id = "iv_arrow")
    public List<MobileElement> faqArrow;

    //earn more screen
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Registering to Al Hilal's marketplace\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Registering to Al Hilal's marketplace\")]")
    public MobileElement earnmorelist1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1,500 TouchPoints earned\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,500 TouchPoints earned\")]")
    public MobileElement earnmorelistdescp1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Opening a bank account with Al Hilal\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Opening a bank account with Al Hilal\")]")
    public MobileElement earnmorelist2;

    @iOSXCUITFindBy(xpath = " //XCUIElementTypeStaticText[@name=\"8,000 TouchPoints earned\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"8,000 TouchPoints earned\")]")
    public MobileElement earnmorelistdescp2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Introducing your children to the marketplace']")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Introducing your children to the marketplace\")]")
    public MobileElement earnmorelist3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1,000 TouchPoints earned by the child\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,000 TouchPoints earned by the child\")]")
    public MobileElement earnmorelistdescp3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Opening an Al Hilal account for your child\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Opening an Al Hilal account for your child\")]")
    public MobileElement earnmorelist4;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"2,500 TouchPoints earned by the parent 1,500 TouchPoints earned by the child\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"2,500 TouchPoints earned by the parent 1,500 TouchPoints earned by the child\")]")
    public MobileElement earnmorelistdescp4;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Using your Al Hilal debit card in the marketplace\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Using your Al Hilal debit card in the marketplace\")]")
    public MobileElement earnmorelist5;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"3 TouchPoints earned for every 10 AED spent\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"3 TouchPoints earned for every 10 AED spent\")]")
    public MobileElement earnmorelistdescp5;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Using your debit card outside of Al Hilal's marketplace\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Using your debit card outside of Al Hilal's marketplace\")]")
    public MobileElement earnmorelist6;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1 TouchPoint for every 10 AED spent \"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1 TouchPoint for every 10 AED spent\")]")
    public MobileElement earnmorelistdescp6;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Approving your child's first task\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Approving your child's first task\")]")
    public MobileElement earnmorelist7;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1,000 TouchPoints earned by the parent (applicable once)\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,000 TouchPoints earned by the parent (applicable once)\")]")
    public MobileElement earnmorelistdescp7;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Birthday gift\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Birthday gift\")]")
    public MobileElement earnmorelist8;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1,000 TouchPoints for children 2,000 TouchPoints for teens\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,000 TouchPoints for children 2,000 TouchPoints for teens\")]")
    public MobileElement earnmorelistdescp8;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Topping up your account for the first time\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Topping up your account for the first time\")]")
    public MobileElement earnmorelist9;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"1,000 TouchPoints earned\"])[1]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,000 TouchPoints earned\")]")
    public MobileElement earnmorelistdescp9;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Completing 24 months with Al Hilal\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Completing 24 months with Al Hilal\")]")
    public MobileElement earnmorelist10;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"1,000 TouchPoints earned\"])[2]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"1,000 TouchPoints earned\")]")
    public MobileElement earnmorelistdescp10;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icArrowsUpArrow\"]")
    public MobileElement faqlistuparrow;

    // earn more faq question
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"When will I get these points?\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"When will I get these points?\")]")
    public MobileElement earnmorefaqlist1;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[3]")
    public MobileElement earnmorefaqlistarrowdown1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Earning TouchPoints is easy, enjoy using your Al Hilal App and you will be rewarded immediately!\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Earning TouchPoints is easy, enjoy using your Al Hilal App and you will be rewarded immediately!\")]")
    public MobileElement earnmorefaqlistans1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How will I know how many TouchPoints I have?\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"How will I know how many TouchPoints I have?\")]")
    public MobileElement earnmorefaqlist2;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[1]")
    public MobileElement earnmorefaqlistarrowdown2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The top right corner of your screen will display your TouchPoints balance for you to see\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"The top right corner of your screen will display your TouchPoints balance for you to see\")]")
    public MobileElement earnmorefaqlistans2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Where can I use my TouchPoints?\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Where can I use my TouchPoints?\")]")
    public MobileElement earnmorefaqlist3;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[2]")
    public MobileElement earnmorefaqlistarrowdown3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Al Hilal's marketplace is the best place to spend these points and enjoy guilt-free shopping\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Al Hilal's marketplace is the best place to spend these points and enjoy guilt-free shopping\")]")
    public MobileElement earnmorefaqlistans3;
    // redeem list
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Paying your utility bills with TouchPoints\"]")
    public MobileElement redeemlist1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shopping from the marketplace using your TouchPoints\"]")
    public MobileElement redeemlist2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rewarding your child with TouchPoints\"]")
    public MobileElement redeemlist3;
    // earn more faq question
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"I don't have an account with Al Hilal, can I still use my TouchPoints on the marketplace?\"]")
    public MobileElement redeemmfaqlist1;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[3]")
    public MobileElement redeemfaqlistarrowdown1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Absolutely, you may use your TouchPoints and enjoy shopping on the marketplace even if you don't hold an account with Al Hilal\"]")
    public MobileElement redeemfaqlistans1;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"What can I buy from Al Hilal's marketplace?\"]")
    public MobileElement redeemmfaqlist2;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[3]")
    public MobileElement redeemfaqlistarrowdown2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The marketplace is a dedicated online store that offers retail shopping, restaurant bookings, food orders and much more\"]")
    public MobileElement redeemfaqlistans2;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"How soon will I get the product I bought on the marketplace?\"]")
    public MobileElement redeemmfaqlist3;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"icArrowsDownArrow\"])[3]")
    public MobileElement redeemfaqlistarrowdown3;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"All digital products are processed immediately. Physical products may take between 2 and 7 working days to be shipped directly to your preferred address \"]")
    public MobileElement redeemfaqlistans3;

    public void verifyLoyaltyBalance() throws InterruptedException {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(balanceTxt.isDisplayed(), "Loyalty balance is displayed");
                String loyaltyBalance = balanceTxt.getText();
                balanceTxt.click();
                utils.waitUntilVisible(loyaltyBalanceTxt, 2);
                Assert.assertTrue(loyaltyBalance.equals(loyaltyBalanceTxt.getText()), "Loyalty balance is incorrect");
                break;
            case "ios":
                utils.waitUntilVisible(balanceTxt, 5);
                String exploretp = balanceTxt.getText();
                balanceTxt.click();
                utils.waitUntilVisible(loyaltyBalanceTxt, 5);
                String loyalitytp = loyaltyBalanceTxt.getText();
                loyalitytp = loyalitytp.replaceAll("TouchPoints", "");
                Assert.assertTrue(exploretp.equals(loyalitytp), "Loyalty balance is mismatching");
                break;
        }
    }

    public void verifyLoyaltyTransactionScreenUI() {

        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(titleTxt.get(0).getText().equals("TouchPoints"), "Loyalty Transaction screen title is incorrect");
                Assert.assertTrue(earnMoreTxt.isDisplayed(), "Earn More section is displayed");
                Assert.assertTrue(redeemTxt.isDisplayed(), "Redeem section is displayed");
                Assert.assertTrue(myTransactionsTxt.getText().equals("My transactions"), "My transactions screen title is incorrect");
                Assert.assertTrue(myTransactionsArrow.isDisplayed(), "My transactions arrow is missing");
                myTransactionsArrow.click();
                Assert.assertTrue(titleTxt.get(0).getText().equals("All transactions"), "All Transaction screen title is incorrect");
                break;
            case "ios":
                softAssert.assertTrue(titleTxt.get(0).getText().equals("TouchPoints"), "Loyalty Transaction screen title is incorrect");
                softAssert.assertTrue(earnMoreTxt.isDisplayed(), "Earn More section is displayed");
                softAssert.assertTrue(redeemTxt.isDisplayed(), "Redeem section is displayed");
                softAssert.assertTrue(myTransactionsTxt.getText().equals("My transactions"), "My transactions screen title is incorrect");
                myTransactionsTxt.click();
                //  softAssert.assertTrue(alltransactiontitle.getText().equals("All transactions"), "All Transaction screen title is incorrect");
                softAssert.assertAll();
                break;
        }
    }

    public void navigateToLoyaltyBalance() {
        balanceTxt.click();
    }

    public void verifyLoyaltyTransactionEarnMoreScreenUI() {
        Assert.assertTrue(earnMoreTxt.isDisplayed(), "Earn More section is displayed");
        earnMoreTxt.click();
        utils.waitUntilVisible(earnMoreListTxt, 2);
        Assert.assertTrue(backBtn.isDisplayed(), "Back Button is not displayed");
        Assert.assertTrue(faqBtn.isDisplayed(), "FAQ Button is  not displayed");
        Assert.assertTrue(earnmorelist1.isDisplayed(), "Registering to al hilal marketplace text  is incorrect");
        Assert.assertTrue(earnmorelistdescp1.isDisplayed(), "Registering to al hilal marketplace text  is incorrect");
        Assert.assertTrue(earnmorelist2.isDisplayed(), "bank account opening  to al hilal marketplace text  is incorrect");
        Assert.assertTrue(earnmorelistdescp2.isDisplayed(), "bank account opening tp text  is incorrect");
        Assert.assertTrue(earnmorelist3.isDisplayed(), "child to  marketplace text  is incorrect");
        Assert.assertTrue(earnmorelistdescp3.isDisplayed(), "child  to al hilal marketplace text  is incorrect");

        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Using your Al Hilal debit card in the marketplace");
                break;
            case "ios":
                utils.SwipeUpDown(700, 400, 3000);
                break;
        }
        Assert.assertTrue(earnmorelist4.isDisplayed(), "child account opening text  is incorrect");
        //Assert.assertTrue(earnmorelistdescp4.isDisplayed(), "child account tp text  is incorrect");
        Assert.assertTrue(earnmorelist5.isDisplayed(), "debit card inside market place text  is incorrect");
        Assert.assertTrue(earnmorelistdescp5.isDisplayed(), "debit card inside market tp text  is incorrect");
        Assert.assertTrue(earnmorelist6.isDisplayed(), "debit card outside market text is incorrect");
        Assert.assertTrue(earnmorelistdescp6.isDisplayed(), "debit card outside market tp text  is incorrect");
        Assert.assertTrue(earnmorelist7.isDisplayed(), "child first task text  is incorrect");
        Assert.assertTrue(earnmorelistdescp7.isDisplayed(), "child first task text  is incorrect");
        Assert.assertTrue(earnmorelist8.isDisplayed(), "birthday gift text  is incorrect");
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Completing 24 months with Al Hilal");
                break;
            case "ios":
                utils.SwipeUpDown(500, 150, 1500);
                break;
        }
        //Assert.assertTrue(earnmorelistdescp8.isDisplayed(), "birthday tp is incorrect");
        Assert.assertTrue(earnmorelist9.isDisplayed(), "topping  text  is incorrect");
        Assert.assertTrue(earnmorelistdescp9.isDisplayed(), "topping tp text  is incorrect");
        Assert.assertTrue(earnmorelist10.isDisplayed(), "Completing 24 months text  is incorrect");
        Assert.assertTrue(earnmorelistdescp10.isDisplayed(), "Completing  tp touch points  is incorrect");
    }

    public void verifyFAQEarnMoreScreenUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                faqBtn.click();
                Assert.assertTrue(faqTitleTxt.isDisplayed(), "FAQ title is not displayed");
                Assert.assertTrue(faqTitleTxt.getText().equals("Frequently Asked Questions"), "Frequently Asked Questions is incorrect");
                Assert.assertTrue(earnmorefaqlist1.getText().equals("When will I get these points?"), "Title1 of Earn More FAQ is incorrect");
                faqArrow.get(0).click();
                Assert.assertTrue(earnmorefaqlistans1.getText().equals("Earning TouchPoints is easy, enjoy using your Al Hilal App and you will be rewarded immediately!"), "SubTitle1 of Earn More FAQ is incorrect");
                faqArrow.get(0).click();
                Assert.assertTrue(earnmorefaqlist2.getText().equals("How will I know how many TouchPoints I have?"), "Title2 of Earn More FAQ is incorrect");
                faqArrow.get(1).click();
                Assert.assertTrue(earnmorefaqlistans2.getText().equals("The top right corner of your screen will display your TouchPoints balance for you to see"), "SubTitle2 of Earn More FAQ is incorrect");
                faqArrow.get(1).click();
                Assert.assertTrue(earnmorefaqlist3.getText().equals("Where can I use my TouchPoints?"), "Title3 of Earn More FAQ is incorrect");
                faqArrow.get(2).click();
                Assert.assertTrue(earnmorefaqlistans3.getText().contains("Al Hilal's marketplace is the best place to spend these points"), "SubTitle3 of Earn More FAQ is incorrect");
                faqArrow.get(2).click();
                break;
            case "ios":
                faqBtn.click();
                Assert.assertTrue(faqTitleTxt.getText().equals("Frequently Asked Questions"), "Frequently Asked Questions is incorrect");
                Assert.assertTrue(earnmorefaqlist1.isDisplayed(), "FAQ title is not displayed");
                earnmorefaqlistarrowdown1.click();
                Assert.assertTrue(earnmorefaqlistans1.isDisplayed(), "FAQ title is not displayed");
                faqlistuparrow.click();
                Assert.assertTrue(earnmorefaqlist2.isDisplayed(), "FAQ title is not displayed");
                earnmorefaqlistarrowdown2.click();
                Assert.assertTrue(earnmorefaqlist2.isDisplayed(), "FAQ title is not displayed");
                faqlistuparrow.click();
                Assert.assertTrue(earnmorefaqlist3.isDisplayed(), "FAQ title is not displayed");
                earnmorefaqlistarrowdown3.click();
                utils.iOSScroll("down");
                Assert.assertTrue(earnmorefaqlist3.isDisplayed(), "FAQ title is not displayed");
                break;
        }
    }

    public void verifyLoyaltyTransactionRedeemScreenUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                Assert.assertTrue(redeemTxt.isDisplayed(), "Redeem section is displayed");
                redeemTxt.click();
                utils.waitUntilVisible(loyTitleTxt, 2);
                Assert.assertTrue(loyTitleTxt.getText().contains("Redeem your"), "Redeem Touchpoints screen title is incorrect");
                Assert.assertTrue(loyTitleTxt.getText().contains("TouchPoints"), "Redeem Touchpoints screen title is incorrect");
                Assert.assertTrue(backBtn.isDisplayed(), "Back Button is displayed");
                Assert.assertTrue(faqBtn.isDisplayed(), "FAQ Button is displayed");
                Assert.assertTrue(earnMoreListTxt.isDisplayed(), "Redeem List is displayed");
                Assert.assertTrue(titleTxt.get(0).getText().equals("Paying your utility bills with TouchPoints"), "Title1 of Redeem is incorrect");
                Assert.assertTrue(loyaltyIcon.get(0).isDisplayed(), "Loyalty Icon is displayed");
                Assert.assertTrue(titleTxt.get(1).getText().equals("Shopping from the marketplace using your TouchPoints"), "Title2 of Redeem is incorrect");
                Assert.assertTrue(loyaltyIcon.get(1).isDisplayed(), "Loyalty Icon is displayed");
                Assert.assertTrue(titleTxt.get(2).getText().equals("Rewarding your child with TouchPoints"), "Title3 of Redeem is incorrect");
                Assert.assertTrue(loyaltyIcon.get(2).isDisplayed(), "Loyalty Icon is displayed");
                break;
            case "ios":
                redeemTxt.click();
                //redeemlisttext.isDisplayed();
                Assert.assertTrue(redeemlist1.getText().equals("Paying your utility bills with TouchPoints"), "Title1 of Redeem is incorrect");
                Assert.assertTrue(redeemlist2.getText().equals("Shopping from the marketplace using your TouchPoints"), "Title2 of Redeem is incorrect");
                Assert.assertTrue(redeemlist3.getText().equals("Rewarding your child with TouchPoints"), "Title3 of Redeem is incorrect");
                break;
        }
    }

    public void verifyFAQRedeemScreenUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Frequently Asked Questions");
                Assert.assertTrue(faqTitleTxt.isDisplayed(), "FAQ title is not displayed");
                Assert.assertTrue(faqTitleTxt.getText().equals("Frequently Asked Questions"), "Frequently Asked Questions is incorrect");
                faqBtn.click();

                Assert.assertTrue(titleTxt.get(3).getText().equals("I don't have an account with Al Hilal, can I still use my TouchPoints on the marketplace?"), "Title1 of Redeem FAQ is incorrect");
                faqArrow.get(0).click();
                Assert.assertTrue(subtitleTxt.get(3).getText().contains("Absolutely, you may use your TouchPoints and enjoy shopping on the marketplace"), "SubTitle1 of Redeem FAQ is incorrect");
                faqArrow.get(0).click();

                Assert.assertTrue(titleTxt.get(4).getText().equals("What can I buy from Al Hilal's marketplace?"), "Title2 of Redeem FAQ is incorrect");
                faqArrow.get(1).click();
                Assert.assertTrue(subtitleTxt.get(3).getText().equals("The marketplace is a dedicated online store that offers retail shopping, restaurant bookings, food orders and much more"), "SubTitle2 of Redeem FAQ is incorrect");
                faqArrow.get(1).click();

                Assert.assertTrue(titleTxt.get(5).getText().equals("How soon will I get the product I bought on the marketplace?"), "Title3 of Redeem FAQ is incorrect");
                faqArrow.get(2).click();
                Assert.assertTrue(subtitleTxt.get(3).getText().contains("ll digital products are processed immediately. Physical products may take between 2 and 7 working days to be shipped directly to your preferred address"), "SubTitle3 of Redeem FAQ is incorrect");
                faqArrow.get(2).click();
                break;
            case "ios":
                faqBtn.click();
                Assert.assertTrue(faqTitleTxt.getText().equals("Frequently Asked Questions"), "Redeeem more Frequently Asked Questions is incorrect");
                Assert.assertTrue(redeemmfaqlist1.getText().equals("I don't have an account with Al Hilal, can I still use my TouchPoints on the marketplace?"), "Title1 of Redeem FAQ is incorrect");
                earnmorefaqlistarrowdown1.click();
                Assert.assertTrue(redeemfaqlistans1.getText().contains("Absolutely, you may use your TouchPoints and enjoy shopping on the marketplace"), "SubTitle1 of Redeem FAQ is incorrect");
                faqlistuparrow.click();
                Assert.assertTrue(redeemmfaqlist2.getText().equals("What can I buy from Al Hilal's marketplace?"), "Title2 of Redeem FAQ is incorrect");
                earnmorefaqlistarrowdown2.click();
                Assert.assertTrue(redeemfaqlistans2.getText().equals("The marketplace is a dedicated online store that offers retail shopping, restaurant bookings, food orders and much more"), "SubTitle2 of Redeem FAQ is incorrect");
                faqlistuparrow.click();
                Assert.assertTrue(redeemmfaqlist3.getText().equals("How soon will I get the product I bought on the marketplace?"), "Title3 of Redeem FAQ is incorrect");
                earnmorefaqlistarrowdown3.click();
                utils.iOSScroll("down");
                String s = redeemfaqlistans3.getText();
                System.out.println(s + " string");
                Assert.assertTrue(redeemfaqlistans3.getText().trim().equals("All digital products are processed immediately. Physical products may take between 2 and 7 working days to be shipped directly to your preferred address"), "SubTitle3 of Redeem FAQ is incorrect");
                break;
        }
    }
}