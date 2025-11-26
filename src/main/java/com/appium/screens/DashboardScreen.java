package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.List;

public class DashboardScreen extends BaseScreen {


    CommonUtils utils = new CommonUtils();
    public static final Logger log = Logger.getLogger(ExploreScreen.class);

    // ------------------PAGE FACTORY--------------------------//
    public DashboardScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

    //Quick LInks - Personal Finance
    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,\"Personal finance\")]")
    public MobileElement personalFinanceTxt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Personal finance\"]")
    public MobileElement personalFinanceTxtIOS;

    @AndroidFindBy(id = "iv_user")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"icons/icUser\"]")
    public MobileElement userIcon;

    @AndroidFindBy(id = "iv_balance")
    public List<MobileElement> tpBalanceIcon;

    @AndroidFindBy(id = "tv_balance")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton")
    public MobileElement tpBalanceTxt;

    @AndroidFindBy(id = "iv_chat")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icGeneralChat\"]")
    public MobileElement chatIcon;

    @AndroidFindBy(id = "iv_cart_dashboard")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icGeneralCart\"]")
    public MobileElement cartIcon;

    //XCUIElementTypeStaticText[@name="Let's find something you like!"]
    //XCUIElementTypeStaticText[@name="Explore"]
    //XCUIElementTypeStaticText[@name="My cart"]

    @AndroidFindBy(id = "tv_label")
    public MobileElement shopLabelTxt;

    @AndroidFindBy(id = "tv_description")
    public MobileElement shopDescTxt;

    @AndroidFindBy(id = "tv_header")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Welcome\"]")
    public MobileElement headerTxt;

    @AndroidFindBy(id = "iv_logo")
    public MobileElement childLogo;

    @AndroidFindBy(id = "iv_actionImage")
    public List<MobileElement> categoryIcon;

    @AndroidFindBy(id = "tv_actionTitle")
    public List<MobileElement> categoryTxt;

    @AndroidFindBy(id = "ti_search")
    public MobileElement searchTxt;

    @AndroidFindBy(id = "iv_actionImage")
    public List<MobileElement> exploreIcons;

    @AndroidFindBy(id = "iv_cart")
    public MobileElement cartBtn;

    @AndroidFindBy(id = "tv_title")
    public List<MobileElement> titlesTxt;

    @AndroidFindBy(id = "tv_product_name")
    public MobileElement productName;

    @AndroidFindBy(id = "tv_currency")
    public List<MobileElement> currencyTxt;

    @AndroidFindBy(id = "tv_points_currency")
    public List<MobileElement> tpPointsCurrencyCart;

    @AndroidFindBy(id = "tv_total")
    public MobileElement totalCartTxt;

    @AndroidFindBy(id = "bv_continue_shopping")
    public MobileElement continueShoppingBtn;

    @AndroidFindBy(id = "tv_anah_symbol")
    public MobileElement tpTouchpoints;

    @AndroidFindBy(id = "iv_arrow")
    public MobileElement descArrow;

    @AndroidFindBy(id = "tv_price")
    public List<MobileElement> productPriceAED;

    @AndroidFindBy(id = "tv_points")
    public MobileElement productPriceTP;

    @AndroidFindBy(id = "iv_product")
    public List<MobileElement> productList;

    @AndroidFindBy(id = "iv_add")
    public List<MobileElement> addBtn;

    @AndroidFindBy(id = "btn_buy_now")
    public MobileElement buyNowBtn;

    @AndroidFindBy(id = "tv_account_type")
    public MobileElement touchpointsTxt;

    @AndroidFindBy(id = "tv_available_balance")
    public MobileElement touchpointsBtn;

    @AndroidFindBy(id = "tv_sub_title")
    public List<MobileElement> confirmationTxtn;

    @AndroidFindBy(id = "tv_promo_code")
    public MobileElement txtPromoCode;

    @AndroidFindBy(id = "tv_promo_code_value")
    public MobileElement txtPromoCodeValue;

    @AndroidFindBy(id = "tv_promo_code_values")
    public MobileElement txtPromoCodeCopy;

    @AndroidFindBy(id = "iv_close")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic general close\"]")
    public MobileElement searchCancelBtn;

    @AndroidFindBy(id = "tv_search_results_count")
    public MobileElement resultsCountTxt;

    @AndroidFindBy(id = "tv_title_state")
    public MobileElement noResultsTitleTxt;


    //food category
    @AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
    public MobileElement categoryBackBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Shopping\"]")
    public MobileElement shoppingCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Bills\"]")
    public MobileElement billsCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Food\"]")
    public MobileElement foodCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Activities\"]")
    public MobileElement activitiesCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Family\"]")
    public MobileElement familyCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Wellness\"]")
    public MobileElement wellnessCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Groceries\"]")
    public MobileElement groceriesCategory;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Travel\"]")
    public MobileElement travelCategory;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Special offers\"]")
    public MobileElement specialoffertxt;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Etihad Airways\"]")
    public MobileElement specialoffereithad;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Up to 10% off\"]")
    public MobileElement specialoffereithad1;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"KidZania giveaway\"])[1]")
    public MobileElement specialofferekidzmania;
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"KidZania giveaway\"])[2]")
    public MobileElement specialofferekidzmania1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Million a month\"]")
    public MobileElement specialofferwinmillion;

    @AndroidFindBy(id = "tv_header_category_description")
    public MobileElement categoryDescTxt;

    @AndroidFindBy(id = "iv_background")
    public List<MobileElement> backgroundImg;

    @AndroidFindBy(id = "iv_provider_logo")
    public List<MobileElement> providerLogo;

    @AndroidFindBy(id = "tv_provider_name")
    public List<MobileElement> providerNameTxt;

    @AndroidFindBy(id = "tv_offer_title")
    public List<MobileElement> providerOfferTxt;

    //category bottom sheet
    @AndroidFindBy(id = "design_bottom_sheet")
    public MobileElement categoryBottomSheet;

    @AndroidFindBy(id = "iv_provider_name")
    public MobileElement bsProviderNameTxt;

    @AndroidFindBy(id = "tv_offer_details")
    public MobileElement bsOfferDetailsTxt;

    @AndroidFindBy(id = "iv_icon")
    public List<MobileElement> bsProviderIcon;

    @AndroidFindBy(id = "bv_go_to_app")
    public MobileElement goToAppBtn;

    @AndroidFindBy(id = "icl_banner_open_account")
    public MobileElement openBankAccBanner;

    @AndroidFindBy(xpath = "//*[contains(@text, 'Open an Al Hilal bank account')]")
    public MobileElement bannerTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Suggested for you\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Suggested for you\")]")
    public List<MobileElement> suggested4u;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@text,\"Apply for a Credit Card\")]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Apply for a credit card\")]")
    public List<MobileElement> applyCreditCard;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Monthly chance to win 1 million AED\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Monthly chance to win 1 million AED\")]")
    public MobileElement oneMillionChance;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Up to 10% off with Etihad Airways \"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Up to 10% off with Etihad Airway\")]")
    public MobileElement etihadAirways;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open a children’s Savings Account\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Open a children’s Savings Account\")]")
    public List<MobileElement> childSavingAccount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Assign a task for your child\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Assign a task for your child\")]")
    public List<MobileElement> assigntask;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Win a ticket to KidZania\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Win a ticket to KidZania\")]")
    public MobileElement tickettokidzania;

    @AndroidFindBy(id = "tv_sub_title")
    public List<MobileElement> subTitle;


    @AndroidFindBy(id = "iv_next")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"icRightArrow\"]")
    public MobileElement nextarrow;


    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Let's get started!\"]")
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,\"Let's get started!\")]")
    public MobileElement getStarted;

    //Million story
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"1 Million AED A life-changing draw just for you A monthly chance to win AED 1 million with your Al Hilal Savings Accounts\"]")
    public MobileElement winmilliontitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Deposit 5,000 AED or more to join the monthly 1 million AED draw\"]")
    public MobileElement winmillionsubtitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Get an additional entry to the draw with every 5,000 AED in your Account\"]")
    public MobileElement winmillionsubtitle1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Transfer your salary to your Al Hilal Account and get an additional entry\"]")
    public MobileElement winmillionsubtitle2;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"The draw is open to anyone with a Savings Account, including kids and teens!\"]")
    public MobileElement winmillionsubtitle3;

    //Ethihad travel
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Travel in style with this special offer\"]")
    public MobileElement etihadtraveltitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Travel in style with this special offer\"]")
    public MobileElement etihadtravelsubtitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Up to 10% off for Economy & Business class tickets\"]")
    public MobileElement etihadtravelsubtitle1;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pay using your Al Hilal debit card and enjoy up to 10% off at checkout. Select destinations only\"]")
    public MobileElement etihadtravelsubtitle2;

    //childsavingaccount
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open a child Savings Account, assign tasks and reward them with money or TouchPoints\"]")
    public MobileElement childaccsavingtitle;

    //kidzmania
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Boost family fun with extra offers\"]")
    public MobileElement kidmaniatitle;
    @iOSXCUITFindBy(xpath = "//(//XCUIElementTypeStaticText[@name=\"Admission ticket\"])[1]")
    public MobileElement kidmaniasubtitle;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open your child’s marketplace account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support\"]")
    public MobileElement kidmaniasubtitle2;
    @iOSXCUITFindBy(xpath = "//(//XCUIElementTypeStaticText[@name=\"Admission ticket\"])[2]")
    public MobileElement kidmaniasubtitle3;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Open your child’s Savings Account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support\"]")
    public MobileElement kidmaniasubtitle4;

    //KYC Update
    @AndroidFindBy(id = "dbc_id_doc_status")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement kycBanner;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'dbc_id_doc_status')]/android.widget.ImageView[contains(@resource-id,'iv_widget')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement kycBannerIcon;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'dbc_id_doc_status')]/android.widget.TextView[contains(@resource-id,'tv_title')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement kycBannerTitle;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[contains(@resource-id,'dbc_id_doc_status')]/android.widget.TextView[contains(@resource-id,'tv_description')]")
    @iOSXCUITFindBy(xpath = "")
    public MobileElement kycBannerDescription;

    public void verifyExploreScreenBanner() {
        Assert.assertTrue(openBankAccBanner.isDisplayed(), "Banner is not displayed");
        Assert.assertTrue(bannerTitle.isDisplayed(), "Banner title text is wrong");
        Assert.assertTrue(shopDescTxt.getText().contains("and get 30% cashback when you shop using your Al Hilal debit card"), "Banner subtitle is incorrect");
        Assert.assertTrue(descArrow.isDisplayed(), "arrow is not displayed");
    }


    public void verifyExploreScreenUI() {

        switch (CommonUtils.platform) {
            case "android":
                Assert.assertTrue(userIcon.isDisplayed(), "user Icon is not displayed");
                Assert.assertTrue(tpBalanceIcon.get(0).isDisplayed(), "Touchpoints balance Icon is not displayed");
                Assert.assertTrue(tpBalanceTxt.isDisplayed(), "Touchpoints balance is not displayed");
                Assert.assertTrue(chatIcon.isDisplayed(), "Chat icon is not displayed");
                Assert.assertTrue(cartIcon.isDisplayed(), "Cart Button is not displayed");
                break;
            case "ios":
                Assert.assertTrue(userIcon.isDisplayed(), "user Icon is not displayed");
                Assert.assertTrue(tpBalanceTxt.isDisplayed(), "Touchpoints balance is not displayed");
                Assert.assertTrue(chatIcon.isDisplayed(), "Chat icon is not displayed");
                Assert.assertTrue(cartIcon.isDisplayed(), "Cart Button is not displayed");
                break;
        }
    }

    public void iLandOnExploreTab() {
        Assert.assertTrue(userIcon.isDisplayed(), "User icon is not displayed");
    }

    public void verifyBrandLogosOnExplore(String logo1, String logo2, String logo3, String logo4, String logo5, String logo6, String logo7, String logo8) {
        switch (CommonUtils.platform) {
            case "android":
                utils.scrollTo(logo1);
                for (int i = 0; i < 8; i++) {
                    Assert.assertTrue(categoryIcon.get(i).isDisplayed(), "Category Logo is not displayed");
                }
                Assert.assertTrue(categoryTxt.get(0).getText().equals(logo1), "Category name:1 is not correct");
                Assert.assertTrue(categoryTxt.get(1).getText().equals(logo2), "Category name:2 is not correct");
                Assert.assertTrue(categoryTxt.get(2).getText().equals(logo3), "Category name:3 is not correct");
                Assert.assertTrue(categoryTxt.get(3).getText().equals(logo4), "Category name:4 is not correct");
                Assert.assertTrue(categoryTxt.get(4).getText().equals(logo5), "Category name:5 is not correct");
                Assert.assertTrue(categoryTxt.get(5).getText().equals(logo6), "Category name:6 is not correct");
                Assert.assertTrue(categoryTxt.get(6).getText().equals(logo7), "Category name:7 is not correct");
                Assert.assertTrue(categoryTxt.get(7).getText().equals(logo8), "Category name:8 is not correct");
                break;
            case "ios":
                Assert.assertTrue(shoppingCategory.isDisplayed(), "Category name:1 is not correct");
                Assert.assertTrue(billsCategory.isDisplayed(), "Category name:2 is not correct");
                Assert.assertTrue(foodCategory.isDisplayed(), "Category name:3 is not correct");
                Assert.assertTrue(activitiesCategory.isDisplayed(), "Category name:4 is not correct");
                Assert.assertTrue(familyCategory.isDisplayed(), "Category name:5 is not correct");
                Assert.assertTrue(wellnessCategory.isDisplayed(), "Category name:6 is not correct");
                Assert.assertTrue(groceriesCategory.isDisplayed(), "Category name:7 is not correct");
                Assert.assertTrue(travelCategory.isDisplayed(), "Category name:8 is not correct");
                break;
        }
    }

    public void iNavigateOnCategory(String category) {
        utils.scrollTo(category);
        for (int i = 0; i < exploreIcons.size(); i++) {
            if (categoryTxt.get(i).getText().equals(category)) {
                categoryTxt.get(i).click();
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public void iScrollToSpecialOffersUI() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Special offers");
                break;
            case "ios":
                utils.iOSScroll("Special offers");
                break;
        }
    }

    public void verifySpecialOffersScreenUI() {
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                if (backgroundImg.size() == 0) {
                    Assert.fail("special offers do not exist");
                } else {
                    Assert.assertTrue(providerNameTxt.get(0).getText().equals("Etihad Airways"), "sp offer 1 is not matching");
                    Assert.assertTrue(providerNameTxt.get(1).getText().equals("KidZania giveaway"), "sp offer 2 is not matching");
                    for (int i = 0; i < 2; i++) {
                        Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                        Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
                        Assert.assertTrue(providerOfferTxt.get(i).isDisplayed(), "providerOfferTxt is not displayed");
                    }
                }
                break;
            case "ios":
                Assert.assertTrue(specialoffertxt.isDisplayed(), "sp offer 1 is not matching");
                Assert.assertTrue(specialoffereithad.isDisplayed(), "sp offer 1 is not matching");
                Assert.assertTrue(specialoffereithad1.isDisplayed(), "sp offer 1 is not matching");
                Assert.assertTrue(specialofferekidzmania.isDisplayed(), "sp offer 1 is not matching");
                Assert.assertTrue(specialofferekidzmania1.isDisplayed(), "sp offer 1 is not matching");
                Assert.assertTrue(specialofferwinmillion.isDisplayed(), "sp offer 1 is not matching");
                break;
        }
    }

    public void verifySpecialOffersSubCategoryScreenUI() {
        String subtitle1 = "Travel in style with this special offer";
        String subtitle2 = "Boost family fun with extra offers";

        if (backgroundImg.size() == 0) {
            Assert.fail("No special offer is present");
        } else {
            //category 1
            backgroundImg.get(0).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle1), "categoryBottomSheet offer details is not correct");

            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().contains("cashback offer"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Shop in the marketplace with your new Al Hilal debit card"), "categoryBottomSheet subtitle is not displayed");

            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(1).getText().contains("off for Economy & Business class tickets"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Pay using your Al Hilal debit card and enjoy up to 10% off at checkout. Select destinations only"), "categoryBottomSheet subtitle2 is not displayed");
            searchCancelBtn.click();
            //category 2
            backgroundImg.get(1).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle2), "categoryBottomSheet offer details is not correct");

            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().contains("Admission ticket"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Open your child’s marketplace account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support"), "categoryBottomSheet subtitle is not displayed");

            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(1).getText().contains("Admission ticket"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Open your child’s Savings Account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support"), "categoryBottomSheet subtitle2 is not displayed");
            searchCancelBtn.click();
        }
    }

    public void verifySuggestedForYou() {
        String milliontitle1 = "1 Million AED\n" +
                "\n" +
                "A life-changing draw just for you\n" +
                "\n" +
                "A monthly chance to win AED 1 million with your Al Hilal Savings Accounts\n";
        String millionsubtitle1 = "Deposit 5,000 AED or more to join the monthly 1 million AED draw";
        String millionsubtitle2 = "Get an additional entry to the draw with every 5,000 AED in your Account";
        String millionsubtitle3 = "Transfer your salary to your Al Hilal Account and get an additional entry";
        String millionsubtitle4 = "The draw is open to anyone with a Savings Account, including kids and teens!";
        String eithadoffertitle = "Travel in style with this special offer";
        String ethihadsubtitle = "Up to 10% off for Economy & Business class tickets";
        String ethihadsubtitle2 = "Pay using your Al Hilal debit card and enjoy up to 10% off at checkout. Select destinations only";
        String kidzaniaoffertitle = "Boost family fun with extra offers";
        String kidzaniaoffertitle1 = "Admission ticket";
        String kidzaniaoffersubtitle1 = "Open your child’s marketplace account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support";
        String kidzaniaoffersubtitle2 = "Open your child’s Savings Account and get the chance to win an entry ticket to Kidzania. For more details, please call Customer Support";
        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Travel");
                if (suggested4u.size() > 0) {
                    Assert.assertTrue(suggested4u.get(0).isDisplayed(), " Suggested for you not displayed");
                    //credit card
                    if (applyCreditCard.size() > 0) {
                        Assert.assertTrue(applyCreditCard.get(0).isDisplayed(), " Apply for a credit card not display");
                    }
                    //one million
                    Assert.assertTrue(oneMillionChance.isDisplayed(), " Monthly Chance to win 1 million  is not displayed");
                    oneMillionChance.click();
                    try {
                        //  utils.SwipeUpDown(500, 1100, 1500);
                        utils.scrollTo(millionsubtitle4);
                    } catch (Exception e) {
                        log.info(e);
                    }
                    //System.out.println(bsOfferDetailsTxt.getText());
                    //Assert.assertTrue(bsOfferDetailsTxt.getText().equals(milliontitle1), "Chance a million  offer details is not correct");
                    Assert.assertTrue(titlesTxt.get(0).getText().contains(millionsubtitle1), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(titlesTxt.get(1).getText().contains(millionsubtitle2), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(titlesTxt.get(2).getText().contains(millionsubtitle3), "categoryBottomSheet title1 is not displayed");
                    //Assert.assertTrue(titlesTxt.get(3).getText().contains(millionsubtitle4), "categoryBottomSheet title1 is not displayed");
                    searchCancelBtn.click();
                    utils.SwipeLeftRight(900, 250, 1500);
                    utils.swipyleftrightbytext("Win a ticket to KidZania");
                    //Etihad
                    Assert.assertTrue(etihadAirways.isDisplayed(), " Etihad airways offer  is  not displayed");
                    etihadAirways.click();
                    Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(bsOfferDetailsTxt.getText().equals(eithadoffertitle), "Chance a million  offer details is not correct");
                    Assert.assertTrue(titlesTxt.get(0).getText().contains(ethihadsubtitle), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(subTitle.get(0).getText().contains(ethihadsubtitle2), "categoryBottomSheet provider name is not displayed");
                    searchCancelBtn.click();
                    utils.SwipeLeftRight(900, 200, 1500);
                    if (childSavingAccount.size() > 0) {
                        String childAccountTitle = "Open a child Savings Account, assign tasks and reward them with money or TouchPoints";
                        childSavingAccount.get(0).isDisplayed();
                        childSavingAccount.get(0).click();
                        Assert.assertTrue(titlesTxt.get(0).getText().contains(childAccountTitle), "categoryBottomSheet title1 is not displayed");
                        utils.scrollTo("Let's get started!");
                        Assert.assertTrue(getStarted.isDisplayed(), " Lets get started not displayed");
                        Assert.assertTrue(nextarrow.isDisplayed(), " Next Arrow not displayed");
                        CommonUtils.backButton();
                    } else if (assigntask.size() > 0) {
                        assigntask.get(0).isDisplayed();
                        assigntask.get(0).click();
                        CommonUtils.backButton();
                    }
                    //kidzania
                    utils.SwipeLeftRight(800, 200, 1500);
                    Assert.assertTrue(tickettokidzania.isDisplayed(), " Win a ticket to KidZania  is not displayed");
                    tickettokidzania.click();
                    Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(bsOfferDetailsTxt.getText().equals(kidzaniaoffertitle), "Chance a million  offer details is not correct");
                    Assert.assertTrue(titlesTxt.get(0).getText().contains(kidzaniaoffertitle1), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(subTitle.get(0).getText().trim().contains(kidzaniaoffersubtitle1), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(titlesTxt.get(1).getText().trim().contains(kidzaniaoffertitle1), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(subTitle.get(1).getText().trim().contains(kidzaniaoffersubtitle2), "sub title name is not displayed");
                    searchCancelBtn.click();
                } else {
                    log.info("Toggle off, No Suggested offer");
                    iScrollToSpecialOffersUI();
                    verifySpecialOffersScreenUI();
                    verifySpecialOffersSubCategoryScreenUI();
                }
                break;
            case "ios":
                utils.iOSScroll("down");

                if (suggested4u.size() > 0) {
                    Assert.assertTrue(suggested4u.get(0).isDisplayed(), " Suggested for you not displayed");
                    //credit card
                    if (applyCreditCard.size() > 0) {
                        Assert.assertTrue(applyCreditCard.get(0).isDisplayed(), " Apply for a credit card not display");
                    }
                    //one million
                    Assert.assertTrue(oneMillionChance.isDisplayed(), " Monthly Chance to win 1 million  is not displayed");
                    oneMillionChance.click();
                    try {
                        utils.SwipeUpDown(500, 1100, 1500);
                        // utils.scrollTo(millionsubtitle4);
                    } catch (Exception e) {
                        log.info(e);
                    }
                    //System.out.println(bsOfferDetailsTxt.getText());
                    //Assert.assertTrue(winmilliontitle.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(winmillionsubtitle.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(winmillionsubtitle1.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(winmillionsubtitle2.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(winmillionsubtitle3.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    searchCancelBtn.click();
                    utils.SwipeLeftRight(900, 250, 1500);
                    utils.swipyleftrightbytext("Win a ticket to KidZania");
                    //Etihad
                    Assert.assertTrue(etihadAirways.isDisplayed(), " Etihad airways offer  is  not displayed");
                    etihadAirways.click();
                    Assert.assertTrue(etihadtraveltitle.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(etihadtravelsubtitle.isDisplayed(), "Chance a million  offer details is not correct");
                    Assert.assertTrue(etihadtravelsubtitle1.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(etihadtravelsubtitle2.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    searchCancelBtn.click();
                    utils.SwipeLeftRight(900, 200, 1500);
                    if (childSavingAccount.size() > 0) {
                        String childAccountTitle = "Open a child Savings Account, assign tasks and reward them with money or TouchPoints";
                        childSavingAccount.get(0).isDisplayed();
                        childSavingAccount.get(0).click();
                        Assert.assertTrue(childaccsavingtitle.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                        utils.scrollTo("down");
                        Assert.assertTrue(getStarted.isDisplayed(), " Lets get started not displayed");
                        Assert.assertTrue(nextarrow.isDisplayed(), " Next Arrow not displayed");
                        CommonUtils.backButton();
                    } else if (assigntask.size() > 0) {
                        assigntask.get(0).isDisplayed();
                        assigntask.get(0).click();
                        CommonUtils.backButton();
                    }
                    //kidzania
                    utils.SwipeLeftRight(800, 200, 1500);
                    Assert.assertTrue(tickettokidzania.isDisplayed(), " Win a ticket to KidZania  is not displayed");
                    tickettokidzania.click();
                    Assert.assertTrue(kidmaniatitle.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(kidmaniasubtitle.getText().equals(kidzaniaoffertitle), "Chance a million  offer details is not correct");
                    Assert.assertTrue(kidmaniasubtitle2.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                    Assert.assertTrue(kidmaniasubtitle3.isDisplayed(), "categoryBottomSheet title1 is not displayed");
                    Assert.assertTrue(kidmaniasubtitle4.isDisplayed(), "sub title name is not displayed");
                    searchCancelBtn.click();
                } else {
                    log.info("Toggle off, No Suggested offer");
                    iScrollToSpecialOffersUI();
                    verifySpecialOffersScreenUI();
                }
                break;
        }
    }

    public void verifyFoodSubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");

        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("Talabat"), "providerName 1 is not matching");
            Assert.assertTrue(providerNameTxt.get(1).getText().equals("Deliveroo"), "providerName 2 is not matching");
            Assert.assertTrue(providerNameTxt.get(2).getText().equals("Zomato"), "providerName is 3 not matching");

            for (int i = 0; i < 3; i++) {
                Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
                Assert.assertTrue(providerOfferTxt.get(i).getText().equals("30% cashback"), "providerOfferTxt is not correctly displayed");
            }
        }
    }

    public void clickOnBackButtonOnCategory() {
        categoryBackBtn.click();
    }

    public void verifyFoodSubCategoryBottomSheetScreenUI() {
        String subtitle = "Delicious food deals and offers delivered to you in the UAE";
        if (backgroundImg.size() == 0) {
            Assert.fail("No sub category is present");
        } else {
            for (int i = 0; i < 3; i++) {
                backgroundImg.get(i).click();
                utils.waitUntilVisible(categoryBottomSheet, 2);
                Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
                Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
                Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");
                Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
                Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
                Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
                //Assert.assertTrue(goToAppBtn.isDisplayed(), "goToApp button is not displayed");
                searchCancelBtn.click();
            }
        }
    }

    public void verifyActivitiesSubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");

        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("KidZania"), "providerName 1 is not matching");
            Assert.assertTrue(backgroundImg.get(0).isDisplayed(), "backgroundImg is not displayed");
            Assert.assertTrue(providerLogo.get(0).isDisplayed(), "providerLogo is not displayed");
            Assert.assertTrue(providerOfferTxt.get(0).getText().equals("Up to 50% off"), "providerOfferTxt is not displayed");
        }
    }

    public void verifyActivitiesSubCategoryBottomSheetScreenUI() {
        String subtitle = "Boost family fun with extra offers";
        backgroundImg.get(0).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("50% off weekday admissions"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("50% discount on weekdays when you pay with your Al Hilal debit card at the counter"), "categoryBottomSheet subtitle1 is not displayed");

        Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(1).getText().equals("30% off weekend admissions"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(1).getText().equals("30% discount on weekends when you pay with your Al Hilal debit card at the counter"), "categoryBottomSheet subtitle2 is not displayed");
        searchCancelBtn.click();
    }

    public void verifyFamilySubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");

        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("KidZania"), "providerName 1 is not matching");
            Assert.assertTrue(providerNameTxt.get(1).getText().equals("Mumzworld"), "providerName 2 is not matching");

            for (int i = 0; i < 2; i++) {
                Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
            }
            Assert.assertTrue(providerOfferTxt.get(0).getText().equals("Up to 50% off"), "providerOfferTxt is not displayed");
            Assert.assertTrue(providerOfferTxt.get(1).getText().equals("10% off & more"), "providerOfferTxt is not displayed");
        }
    }

    public void verifyFamilySubCategoryBottomSheetScreenUI() {
        String subtitle = "Boost family fun with extra offers";
        //kidZania
        backgroundImg.get(0).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("50% off weekday admissions"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("50% discount on weekdays when you pay with your Al Hilal debit card at the counter"), "categoryBottomSheet subtitle1 is not displayed");

        Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(1).getText().equals("30% off weekend admissions"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(1).getText().equals("30% discount on weekends when you pay with your Al Hilal debit card at the counter"), "categoryBottomSheet subtitle2 is not displayed");
        searchCancelBtn.click();

        //Mumzworld
        backgroundImg.get(1).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("10% off"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Copy the promo code and paste it at checkout on the merchant’s app. Not valid on sale item. Cannot be combined with any other offers or promotions. Not valid on wipes, diapers, milk, gift cards, or BabyZen, Skip Hop, or Apple products"), "categoryBottomSheet subtitle2 is not displayed");
        Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
        Assert.assertTrue(txtPromoCodeValue.getText().equals("ALHILAL10"), "PromoCode Value is not displayed");

        utils.scrollTo("Shop anywhere using an Al Hilal debit card");
        if (bsProviderIcon.size() > 1) {
            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        } else {
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        }

        if (titlesTxt.size() > 1) {
            Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        } else {
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        }

        if (confirmationTxtn.size() > 1) {
            Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
        } else {
            Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
        }
        searchCancelBtn.click();
    }

    public void verifyWellnessSubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");

        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("Fitbit"), "providerName 1 is not matching");
            Assert.assertTrue(providerNameTxt.get(1).getText().equals("Feelunique"), "providerName 2 is not matching");
            Assert.assertTrue(providerNameTxt.get(2).getText().equals("Tips & Toes"), "providerName 3 is not matching");
            Assert.assertTrue(providerNameTxt.get(3).getText().equals("Urban Company"), "providerName 4 is not matching");
            Assert.assertTrue(providerNameTxt.get(4).getText().equals("Smile Handyy"), "providerName 5 is not matching");
            Assert.assertTrue(providerNameTxt.get(5).getText().equals("Bodytree Wellness Studio"), "providerName 6 is not matching");

            for (int i = 0; i < 6; i++) {
                Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
            }
            Assert.assertTrue(providerOfferTxt.get(0).getText().equals("30% cashback"), "providerOfferTxt1 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(1).getText().equals("15% off & more"), "providerOfferTxt2 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(2).getText().equals("30% cashback"), "providerOfferTxt3 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(3).getText().equals("10% off and more"), "providerOfferTxt4 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(4).getText().equals("30% off and more"), "providerOfferTxt5 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(5).getText().equals("15% off & more"), "providerOfferTxt6  is not displayed");
        }
    }

    public void verifyWellnessSubCategoryBottomSheetScreenUI() {
        String subtitle = "Offers that combine pampering with a healthy lifestyle";
        //fitbit
        backgroundImg.get(0).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");
        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle2 is not displayed");
        //Assert.assertTrue(goToAppBtn.isDisplayed(), "go to app button is not displayed");
        searchCancelBtn.click();

        //feelunique
        backgroundImg.get(1).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("15% off"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Copy the promo code and paste it at checkout on the merchant’s app"), "categoryBottomSheet subtitle is not displayed");
        Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
        Assert.assertTrue(txtPromoCodeValue.getText().equals("ALHILAL15"), "PromoCode Value is not displayed");

        Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(1).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle2 is not displayed");
        searchCancelBtn.click();

        //Tip & Toes
        backgroundImg.get(2).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");
        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle2 is not displayed");
        //Assert.assertTrue(goToAppBtn.isDisplayed(), "go to app button is not displayed");
        searchCancelBtn.click();

        //Urban Company
        backgroundImg.get(3).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Free Gold subscription & 10% off"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().contains("10% off each booking: Copy the promo code and paste it at checkout on the merchant’s app or website. Maximum discount is 200 AED"), "categoryBottomSheet subtitle is not displayed");
        Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
        Assert.assertTrue(txtPromoCodeValue.getText().equals("AHBUC"), "PromoCode Value is not displayed");

        utils.scrollTo("Shop anywhere using an Al Hilal debit card");
        if (bsProviderIcon.size() > 1) {
            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        } else {
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        }

        if (titlesTxt.size() > 1) {
            Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        } else {
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        }

        if (confirmationTxtn.size() > 1) {
            Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
        } else {
            Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
        }
        searchCancelBtn.click();

        //Smile Handyy
        backgroundImg.get(4).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("30% off"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().contains("30% discount on selected services: Copy the promo code and paste it at checkout on the merchant’s app or website. Cannot be combined with any other promotions or discounts. Excluded services: Home cleaning, one item move, carpet cleaning, full-time maid, AC maintenance, garden maintenance, pool cleaning and painting"), "categoryBottomSheet subtitle is not displayed");
        Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
        Assert.assertTrue(txtPromoCodeValue.getText().equals("ALHILAL30"), "PromoCode Value is not displayed");

        utils.scrollTo("Shop anywhere using an Al Hilal debit card");
        if (bsProviderIcon.size() > 1) {
            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        } else {
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        }

        if (titlesTxt.size() > 1) {
            Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        } else {
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
        }

//        if(confirmationTxtn.size() > 1){
//            Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
//        }else{
//            Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
//        }
        searchCancelBtn.click();

        //Bodytree Wellness Studio
        backgroundImg.get(5).click();
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("15% off"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().contains("15% discounts on regular, premium and specialty classes. Show your Al Hilal card at reception or copy the promo code and paste it at checkout on the merchant’s app or website. Applies to both single classes and class packages. Cannot be combined with any other promotions or discounts. All class purchases non-refundable and non-transferable"), "categoryBottomSheet subtitle is not displayed");

        utils.scrollTo("Shop anywhere using an Al Hilal debit card");
        Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
        Assert.assertTrue(txtPromoCodeValue.getText().equals("ALHILAL15"), "PromoCode Value is not displayed");

//        Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
//        Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
//        Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
        searchCancelBtn.click();
    }

    public void verifyGroceriesSubCategoryBottomSheetScreenUI() {
        String subtitle = "Fresh grocery deals and offers delivered to your home";
        if (backgroundImg.size() == 0) {
            Assert.fail("No sub category is present");
        } else {
            for (int i = 0; i < 2; i++) {
                backgroundImg.get(i).click();
                utils.waitUntilVisible(categoryBottomSheet, 2);
                Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
                Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
                Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
                Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
                Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");
                Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
                Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
                Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
                // Assert.assertTrue(goToAppBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
                searchCancelBtn.click();
            }

            //NRTC Fresh
            backgroundImg.get(2).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("20% off"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Copy the promo code and paste it at checkout on the merchant’s app. Valid for purchases over 60 AED. Not valid on sale items. Cannot be combined with any special promotion. Promo code not redeemable for cash"), "categoryBottomSheet subtitle is not displayed");
            Assert.assertTrue(txtPromoCode.isDisplayed(), "PromoCode text is not displayed");
            Assert.assertTrue(txtPromoCodeValue.getText().equals("ALHILAL20"), "PromoCode Value is not displayed");

            utils.scrollTo("Shop anywhere using an Al Hilal debit card");
            if (bsProviderIcon.size() > 1) {
                Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
            } else {
                Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            }

            if (titlesTxt.size() > 1) {
                Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
            } else {
                Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title1 is not displayed");
            }

            if (confirmationTxtn.size() > 1) {
                Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
            } else {
                Assert.assertTrue(confirmationTxtn.get(0).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail"), "categoryBottomSheet subtitle2 is not displayed");
            }
            searchCancelBtn.click();

            //Talabat
            backgroundImg.get(3).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
            //Assert.assertTrue(goToAppBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            searchCancelBtn.click();
        }
    }

    public void verifyGroceriesSubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");
        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("Carrefour"), "providerName 1 is not matching");
            Assert.assertTrue(providerNameTxt.get(1).getText().equals("Noon Daily"), "providerName 2 is not matching");
            Assert.assertTrue(providerNameTxt.get(2).getText().equals("NRTC Fresh"), "providerName 3 is not matching");
            Assert.assertTrue(providerNameTxt.get(3).getText().equals("Talabat"), "providerName 4 is not matching");
            for (int i = 0; i < 4; i++) {
                Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
            }
            Assert.assertTrue(providerOfferTxt.get(0).getText().equals("30% cashback"), "providerOfferTxt1 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(1).getText().equals("30% cashback"), "providerOfferTxt2 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(2).getText().equals("20% off & more"), "providerOfferTxt3 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(3).getText().equals("30% cashback"), "providerOfferTxt4 is not displayed");
        }
    }

    public void verifyTravelSubCategoryScreen(String category, String title) {
        Assert.assertTrue(categoryBackBtn.isDisplayed(), "Category back button is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals(category), "category title is incorrect");
        Assert.assertTrue(categoryDescTxt.getText().equals(title), "category subtitle is incorrect");
        if (backgroundImg.size() == 0) {
            Assert.fail("providers do not exist");
        } else {
            Assert.assertTrue(providerNameTxt.get(0).getText().equals("Etihad Airways"), "providerName 1 is not matching");
            Assert.assertTrue(providerNameTxt.get(1).getText().equals("Budget Car Rental"), "providerName 2 is not matching");
            Assert.assertTrue(providerNameTxt.get(2).getText().equals("EuropCar"), "providerName 3 is not matching");
            Assert.assertTrue(providerNameTxt.get(3).getText().equals("ClearTrip"), "providerName 4 is not matching");

            for (int i = 0; i < 4; i++) {
                Assert.assertTrue(backgroundImg.get(i).isDisplayed(), "backgroundImg is not displayed");
                Assert.assertTrue(providerLogo.get(i).isDisplayed(), "providerLogo is not displayed");
            }
            Assert.assertTrue(providerOfferTxt.get(0).getText().equals("Up to 10% off"), "providerOfferTxt1 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(1).getText().equals("30% cashback"), "providerOfferTxt2 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(2).getText().equals("15% off & more"), "providerOfferTxt3 is not displayed");
            Assert.assertTrue(providerOfferTxt.get(3).getText().equals("30% cashback"), "providerOfferTxt4 is not displayed");
        }
    }

    public void verifyTravelSubCategoryBottomSheetScreenUI() {
        String subtitle1 = "Travel in style with this special offer";
        String subtitle2 = "Find deals that make moving around a breeze";

        if (backgroundImg.size() == 0) {
            Assert.fail("No sub category is present");
        } else {
            //Etihad
            backgroundImg.get(0).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle1), "categoryBottomSheet offer details is not correct");

            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Up to 10% off for Economy & Business class tickets"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Pay using your Al Hilal debit card and enjoy up to 10% off at checkout. Select destinations only"), "categoryBottomSheet subtitle is not displayed");

            Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
            Assert.assertTrue(confirmationTxtn.get(1).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
            searchCancelBtn.click();

            //Budget car rental
            backgroundImg.get(1).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle2), "categoryBottomSheet offer details is not correct");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
            //Assert.assertTrue(goToAppBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            searchCancelBtn.click();

            //EuropeCar
            backgroundImg.get(2).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle2), "categoryBottomSheet offer details is not correct");

            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("15% off worldwide"), "categoryBottomSheet title1 is not displayed");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Copy the promo code and paste it at checkout on the merchant’s Abu Dhabi website. Valid on car rentals worldwide. Cannot be combined with any other promotions or discounts. Mileage restrictions apply. Subject to availability and driver qualifications. Driver must present valid credit card and driver's license at checkout. Standard Europcar Terms and Conditions apply"), "categoryBottomSheet subtitle2 is not displayed");

            utils.scrollTo("Shop anywhere using an Al Hilal");
            //Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
            //Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
            //Assert.assertTrue(confirmationTxtn.get(1).getText().contains("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale"), "categoryBottomSheet subtitle is not displayed");
            searchCancelBtn.click();

            //Cleartrip
            backgroundImg.get(3).click();
            utils.waitUntilVisible(categoryBottomSheet, 2);
            Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
            Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle2), "categoryBottomSheet offer details is not correct");
            Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
            Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
            //Assert.assertTrue(goToAppBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
            searchCancelBtn.click();
        }
    }

    public void clickOnSuggestedForYou(String section) {
        Assert.assertTrue(etihadAirways.isDisplayed(), section + " : offer is not displayed");
        if (section.equals("Million")) {
            oneMillionChance.click();
        } else if (section.equals("Etihad")) {
            etihadAirways.click();
        } else if (section.equals("Child")) {
            childSavingAccount.get(0).click();
        } else if (section.equals("Assign")) {
            assigntask.get(0).click();
        }
    }

    public void verifySuggestedForYouOffersEtihadAirways() {
        String subtitle = "Travel in style with this special offer";
        utils.waitUntilVisible(categoryBottomSheet, 2);
        Assert.assertTrue(categoryBottomSheet.isDisplayed(), "categoryBottomSheet is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "categoryBottomSheet cancel button is not displayed");
        Assert.assertTrue(bsProviderNameTxt.isDisplayed(), "categoryBottomSheet provider name is not displayed");
        Assert.assertTrue(bsOfferDetailsTxt.getText().equals(subtitle), "categoryBottomSheet offer details is not correct");

        Assert.assertTrue(bsProviderIcon.get(0).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Up to 10% off for Economy & Business class tickets"), "categoryBottomSheet title1 is not displayed");
        Assert.assertTrue(confirmationTxtn.get(0).getText().equals("Pay using your Al Hilal debit card and enjoy up to 10% off at checkout. Select destinations only"), "categoryBottomSheet subtitle is not displayed");

        Assert.assertTrue(bsProviderIcon.get(1).isDisplayed(), "categoryBottomSheet icon is not displayed");
        Assert.assertTrue(titlesTxt.get(1).getText().equals("Enjoy shopping and 30% cashback too!"), "categoryBottomSheet title is not correct");
        Assert.assertTrue(confirmationTxtn.get(1).getText().equals("Shop anywhere using an Al Hilal debit card and get 30% cashback on retail, point-of-sale, or online purchases within or outside the UAE with a maximum cashback amount of AED 300. Promotion is valid from April 1st to May 31st 2022"), "categoryBottomSheet subtitle is not displayed");
        searchCancelBtn.click();
    }

    public ProfileScreen gotoProfileScreen() {

        Assert.assertTrue(utils.click(userIcon), "Failed to navigate to Profile Screen");

        return new ProfileScreen(appDriver);

    }

    public DashboardScreen tapOnExpiryBanner() {

        Assert.assertTrue(utils.click(kycBanner), "Expiry banner is not displayed on the dashboard");

        return new DashboardScreen(appDriver);

    }

    public DashboardScreen verifyExpiryBanner() {

        Assert.assertTrue(utils.eleIsDisplayed(kycBanner), "Expiry banner is not displayed on the dashboard");
        Assert.assertTrue(utils.eleIsDisplayed(kycBannerIcon), "Expiry banner icon is not present");

        return new DashboardScreen(appDriver);

    }

    public DashboardScreen verifyExpiryBannerTitle(String bannerTitle) {

        String title = utils.validateAndGetText(kycBannerTitle);
        Assert.assertTrue(title.contains(bannerTitle), "KYC expiry banner title is not as expected. Expected: " + bannerTitle + " | Actual: " + title);

        return new DashboardScreen(appDriver);

    }

    public DashboardScreen verifyExpiryBannerDescription(String bannerDescription) {

        String description = utils.validateAndGetText(kycBannerDescription);
        Assert.assertTrue(description.contains(bannerDescription), "KYC expiry banner description is not as expected. Expected: " + bannerDescription + " | Actual: " + description);

        return new DashboardScreen(appDriver);

    }

    public void verifyPersonalFinanceQuickLink(){

        switch (CommonUtils.platform.toLowerCase()) {
            case "android":
                utils.scrollTo("Personal finance");
                Assert.assertTrue(utils.click(personalFinanceTxt));
                break;
            case "ios":
                utils.waitUntilVisible(personalFinanceTxtIOS,20);
                Assert.assertTrue(utils.click(personalFinanceTxtIOS), "personal Finance quick link is not displayed");

        }

    }
}
