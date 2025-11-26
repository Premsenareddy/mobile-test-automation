package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.cucumber.java.en.And;
import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExploreScreen extends BaseScreen {
    CommonUtils utils = new CommonUtils();
    public static final Logger log = Logger.getLogger(ExploreScreen.class);

    // ------------------PAGE FACTORY--------------------------//
    public ExploreScreen(AppiumDriver<MobileElement> appDriver) {
        super(appDriver);
    }

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

    @AndroidFindBy(id = "iv_widget")
    public MobileElement shopWidget;

    @AndroidFindBy(id = "tv_label")
    public MobileElement shopLabelTxt;

    @AndroidFindBy(id = "tv_description")
    public MobileElement shopDescTxt;

    @AndroidFindBy(id = "iv_logo")
    public MobileElement childLogo;

    @AndroidFindBy(id = "iv_actionImage")
    public List<MobileElement> categoryIcon;

    @AndroidFindBy(id = "tv_actionTitle")
    public List<MobileElement> categoryTxt;

    //Shopping screen
    @AndroidFindBy(id = "iv_back")
    public MobileElement backBtn;

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

    @AndroidFindBy(id = "tv_discounted_price")
    public MobileElement priceTxt;

    @AndroidFindBy(id = "tv_currency")
    public List<MobileElement> currencyTxt;

    @AndroidFindBy(id = "tv_anah_points")
    public List<MobileElement> tpPointsCart;

    @AndroidFindBy(id = "tv_points_currency")
    public List<MobileElement> tpPointsCurrencyCart;

    @AndroidFindBy(id = "tv_total")
    public MobileElement totalCartTxt;

    @AndroidFindBy(id = "bv_continue_shopping")
    public MobileElement continueShoppingBtn;

    @AndroidFindBy(id = "iv_anah_sym")
    public MobileElement tpIcon;

    @AndroidFindBy(id = "tv_anah_balance")
    public MobileElement tpAmount;

    @AndroidFindBy(id = "tv_anah_symbol")
    public MobileElement tpTouchpoints;

    @AndroidFindBy(id = "iv_arrow")
    public MobileElement descArrow;

    @AndroidFindBy(id = "tv_description_label")
    public MobileElement ratingTxt;

    @AndroidFindBy(id = "iv_rating")
    public MobileElement ratingStar;

    @AndroidFindBy(id = "tv_rating")
    public MobileElement ratingValue;

    @AndroidFindBy(id = "tv_delivery_label")
    public MobileElement deliveryLabel;

    @AndroidFindBy(id = "tv_price")
    public List<MobileElement> productPriceAED;

    @AndroidFindBy(id = "tv_points")
    public MobileElement productPriceTP;

    @AndroidFindBy(id = "iv_product")
    public List<MobileElement> productList;

    @AndroidFindBy(id = "iv_remove")
    public List<MobileElement> removeBtn;

    @AndroidFindBy(id = "tv_count")
    public List<MobileElement> productCountTxt;

    @AndroidFindBy(id = "iv_add")
    public List<MobileElement> addBtn;

    @AndroidFindBy(id = "btn_buy_now")
    public MobileElement buyNowBtn;

    @AndroidFindBy(id = "btn_add_cart")
    public MobileElement addToCartBtn;

    @AndroidFindBy(id = "iv_delete")
    public List<MobileElement> cartDeleteBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1' and @text='REMOVE']")
    public MobileElement cartRemoveBtn;

    @AndroidFindBy(id = "bv_explore")
    public MobileElement cartExploreBtn;

    @AndroidFindBy(id = "bv_checkout")
    public MobileElement checkoutBtn;

    @AndroidFindBy(id = "cl_item_shipping_address")
    public List<MobileElement> shippingAddressBox;

    @AndroidFindBy(id = "bv_continue")
    public MobileElement saveBtn;

    @AndroidFindBy(id = "bv_place_order")
    public MobileElement selectPaymentMethodBtn;

    //tp flow
    @AndroidFindBy(id = "iv_annah_points")
    public MobileElement touchpointsIcon;

    @AndroidFindBy(id = "tv_tp_balance")
    public MobileElement touchpointsBalanceTxt;

    @AndroidFindBy(id = "tv_tp_currency")
    public MobileElement tpTxt;

    @AndroidFindBy(id = "tv_tp_label")
    public MobileElement tpAvBalTxt;

    @AndroidFindBy(id = "tv_mixed_payment_label")
    public MobileElement splitInfo;

    @AndroidFindBy(id = "circular_seekbar")
    public MobileElement circularSeekbar;

    @AndroidFindBy(id = "ti_value")
    public List<MobileElement> tpAEDTxt;

    @AndroidFindBy(id = "iv_tp_suffix")
    public MobileElement tpSuffixIcon;

    @AndroidFindBy(id = "tv_suffix")
    public MobileElement aedSuffixIcon;

    @AndroidFindBy(id = "tv_label_tp")
    public MobileElement totalTxt;

    @AndroidFindBy(id = "tv_amount_aed")
    public MobileElement totalAedAmt;

    @AndroidFindBy(id = "tv_label_aed")
    public MobileElement totalAedIcon;

    @AndroidFindBy(id = "iv_tp_icon")
    public MobileElement totalTPIcon;

    @AndroidFindBy(id = "tv_amount_tp")
    public MobileElement totalTPAmt;

    @AndroidFindBy(id = "button_view")
    public MobileElement continueBtn;

    //Mixed payment UI - screen2
    @AndroidFindBy(id = "tv_pay_by_tp")
    public MobileElement payByTpTxt;

    @AndroidFindBy(id = "tv_pay_by_cash")
    public MobileElement payByCardTp;

    @AndroidFindBy(id = "tv_change")
    public MobileElement changeBtn;

    @AndroidFindBy(id = "tv_pay_by_card_previously")
    public MobileElement selectCardTxt;

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

    //card flow
    @AndroidFindBy(id = "cb_select")
    public List<MobileElement> addOldCardBtn;

    @AndroidFindBy(id = "tv_add_card")
    public MobileElement addNewCardBtn;

    @AndroidFindBy(id = "alertTitle")
    public MobileElement addNewCardTxt;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement addNewCardMsg;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement addNewCardOKBtn;

    @AndroidFindBy(id = "tv_title")
    public List<MobileElement> addNewCardBtn1;

    @AndroidFindBy(xpath = "//android.widget.RadioButton")
    public List<MobileElement> cardTypeVisaRadio;

    @AndroidFindBy(xpath = "//*[@resource-id='card_number']")
    public MobileElement cardNumberTxt;

    @AndroidFindBy(xpath = "//*[@resource-id='card_expiry_month']")
    public MobileElement cardExpiryMonthDpd;

    @AndroidFindBy(xpath = "//*[@resource-id='card_expiry_year']")
    public MobileElement cardExpiryYearDpd;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView")
    public List<MobileElement> cardExpiryText;

    @AndroidFindBy(xpath = "//*[@resource-id='card_cvn']")
    public MobileElement cardCvnTxt;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'qac_credit_card')]//*[contains(@resource-id,'tv_actionTitle')]")
    public MobileElement optnCreditCard;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'icl_open_account_status_card')]//*[contains(@resource-id,'tv_title')]")
    public MobileElement dashboardBannerTitle;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'icl_open_account_status_card')]//*[contains(@resource-id,'iv_widget')]")
    public MobileElement dashboardBannerWidget;

    @AndroidFindBy(xpath = "//*[contains(@resource-id,'icl_open_account_status_card')]//*[contains(@resource-id,'tv_description')]")
    public MobileElement dashboardBannerDesc;

    @AndroidFindBy(className = "android.widget.Button")
    public List<MobileElement> webViewBtn;

    @AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'bank logo')]")
    public List<MobileElement> bankLogo;

    @AndroidFindBy(xpath = "//*[@resource-id='password']")
    public MobileElement passwordTxt;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
    public List<MobileElement> submitBtn;

    //Product Search and Listing
    @AndroidFindBy(id = "iv_search")
    public MobileElement searchIcon;

    @AndroidFindBy(id = "iv_close")
    public MobileElement searchCancelBtn;

    @AndroidFindBy(id = "tv_search_results_count")
    public MobileElement resultsCountTxt;

    @AndroidFindBy(id = "iv_img_state")
    public List<MobileElement> noResultsCount;

    @AndroidFindBy(id = "tv_title_state")
    public MobileElement noResultsTitleTxt;

    @AndroidFindBy(id = "tv_subtitle_state")
    public MobileElement noResultsSubtitleTxt;

    @AndroidFindBy(id = "iv_sort")
    public MobileElement sortBtn;

    @AndroidFindBy(id = "iv_filter")
    public MobileElement filterBtn;

    @AndroidFindBy(id = "cl_product_images")
    public MobileElement prodImg;

    @AndroidFindBy(id = "included_bottom_sheet")
    public MobileElement prodDesc;

    @AndroidFindBy(id = "tv_header_category_description")
    public MobileElement categoryDescTxt;

    @AndroidFindBy(id = "iv_background")
    public List<MobileElement> backgroundImg;

    @AndroidFindBy(id = "tv_offer_title")
    public List<MobileElement> providerOfferTxt;

    //category bottom sheet
    @AndroidFindBy(id = "design_bottom_sheet")
    public MobileElement categoryBottomSheet;

    @AndroidFindBy(id = "iv_icon")
    public List<MobileElement> bsProviderIcon;

    @AndroidFindBy(id = "bv_go_to_app")
    public MobileElement goToAppBtn;

	@AndroidFindBy(id = "icl_banner_open_account")
	public MobileElement bankOnboardingBanner;
    
    public void verifyExploreScreenUI() {
        Assert.assertTrue(userIcon.isDisplayed(), "user Icon is not displayed");
        Assert.assertTrue(tpBalanceIcon.get(0).isDisplayed(), "Touchpoints balance Icon is not displayed");
        Assert.assertTrue(tpBalanceTxt.isDisplayed(), "Touchpoints balance is not displayed");
        Assert.assertTrue(chatIcon.isDisplayed(), "Chat icon is not displayed");
        Assert.assertTrue(cartIcon.isDisplayed(), "Cart Button is not displayed");
//        Assert.assertTrue(headerTxt.getText().equals("Welcome"), "Welcome header is not displayed");

        utils.scrollTo("Assign a task");
        Assert.assertTrue(childLogo.isDisplayed(), "Child Logo is not displayed");
//        Assert.assertTrue(childSubTitleTxt.getText().equals("Reward hard work and positive habits"), "Child logo sub title is not displayed");
//        Assert.assertTrue(assignTaskTxt.getText().equals("Assign a task"), "Assign a task header is not displayed");
    }

    public void iLandOnExploreTab() {
//        Assert.assertTrue(headerTxt.getText().equals("Welcome"), "Welcome header is not displayed");
    }

    public void verifyBrandLogosOnExplore(String logo1, String logo2, String logo3, String logo4, String logo5, String logo6, String logo7, String logo8) {
        utils.scrollTo(logo1);
        for (int i = 0; i < 8; i++) {
            Assert.assertTrue(categoryIcon.get(i).isDisplayed(), "Category Logo is not displayed");
        }
    }

    @AndroidFindBy(id = "tv_sub_title")
    public List<MobileElement> subTitle;


    public void verifyShoppingCategoryScreenFirstHalfUI() {
        Assert.assertTrue(backBtn.isDisplayed(), "Back Button is displayed");
        Assert.assertTrue(tpBalanceIcon.get(0).isDisplayed(), "Touch points balance Icon is not displayed");
        Assert.assertTrue(tpBalanceTxt.isDisplayed(), "Touchpoints balance is not displayed");
        Assert.assertTrue(chatIcon.isDisplayed(), "Chat icon is not displayed");
        Assert.assertTrue(searchTxt.isDisplayed(), "Search TextBox is not displayed");
        Assert.assertTrue(cartBtn.isDisplayed(), "Cart icon is not displayed");
    }

    public void verifyShopByBrandCategoriesUI() {
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Shop by brand"), "Shop by brand title is incorrect");
        for (int i = 0; i < 8; i++) {
            Assert.assertTrue(categoryIcon.get(i).isDisplayed(), "Category Logo is not displayed");
        }
    }

    public void verifyProductListingForEachShopSubCategory() {
        utils.scrollTo("Top offers for you");
        for (int i = 0; i < 8; i++) {
            Assert.assertTrue(categoryIcon.get(i).isDisplayed(), "Category Logo is not displayed");
            categoryIcon.get(i).click();
            utils.waitUntilVisible(sortBtn, 5);
            Assert.assertTrue(backBtn.isDisplayed(), "Back Button is displayed");
            Assert.assertTrue(titlesTxt.get(0).getText().equals("Shop"), "Product details screen title is incorrect");
            Assert.assertTrue(searchTxt.isDisplayed(), "Search Bar is not displayed");
            Assert.assertTrue(resultsCountTxt.getText().contains("results found"), "results found title is incorrect");
            Assert.assertTrue(sortBtn.isDisplayed(), "Sort is not displayed");
            Assert.assertTrue(filterBtn.isDisplayed(), "Filter is not displayed");
            boolean flag = false;
            if (productList.size() > 0) {
                flag = true;
            } else if (noResultsCount.size() > 0) {
                Assert.assertTrue(noResultsCount.get(0).isDisplayed(), "noResultsCount image is not displayed");
                Assert.assertTrue(noResultsTitleTxt.isDisplayed(), "noResultsCount title text is not displayed");
                Assert.assertTrue(noResultsSubtitleTxt.isDisplayed(), "noResultsCount subtitle text is not displayed");
                flag = true;
            }

            Assert.assertTrue(flag, "Product listing Screen is not displayed");
            backBtn.click();
        }
    }

    public void iNavigateToShopTab() {
        utils.scrollTo("Travel");
        exploreIcons.get(0).click();
    }

    public void userSearchForProduct(String product) throws InterruptedException, IOException {
        searchTxt.click();
        searchTxt.sendKeys(product);
        appDriver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    public void verifyIsDisplayed(String title) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(titlesTxt.get(0).getText().equals(title), "Product details screen title is incorrect");
    }

    public void selectTheFirstProduct() {
        productList.get(0).click();
    }

    public void selectBuyNow() {
        utils.waitUntilVisible(buyNowBtn, 2);
        buyNowBtn.click();
    }

    public void verifyCartHasItemsAdded() {
        utils.waitUntilVisible(totalCartTxt, 5);
        Assert.assertTrue(titlesTxt.get(0).getText().contains("My cart"), "Cart screen is not displayed");

        for (int i = 0; i < 2; i++) {
            Assert.assertTrue(productList.get(i).isDisplayed(), "Product Image is not displayed");
            Assert.assertTrue(titlesTxt.get(i + 1).isDisplayed(), "Product Title is not displayed");
            Assert.assertTrue(removeBtn.get(i).isDisplayed(), "Product remove is not displayed");
            Assert.assertTrue(productCountTxt.get(i).isDisplayed(), "Product Count is not displayed");
            Assert.assertTrue(addBtn.get(i).isDisplayed(), "Product add is not displayed");
            Assert.assertTrue(cartDeleteBtn.get(i).isDisplayed(), "Cart delete button is not displayed");

            Assert.assertTrue(productPriceAED.get(i).isDisplayed(), "Product price is not displayed");
            Assert.assertTrue(currencyTxt.get(i).isDisplayed(), "Product add is not displayed");
            Assert.assertTrue(tpBalanceIcon.get(i).isDisplayed(), "Product tp icon is not displayed");
            Assert.assertTrue(tpPointsCart.get(i).isDisplayed(), "Product tp points is not displayed");
            Assert.assertTrue(tpPointsCurrencyCart.get(i).isDisplayed(), "Product tp points text is not displayed");
        }

        Assert.assertTrue(productPriceAED.get(2).isDisplayed(), "Total Product price is not displayed");
        Assert.assertTrue(currencyTxt.get(2).isDisplayed(), "Total Product currencyTxt is not displayed");
        Assert.assertTrue(tpBalanceIcon.get(2).isDisplayed(), "Total Product tpBalanceIcon is not displayed");
        Assert.assertTrue(productPriceTP.isDisplayed(), "Total Product tp points is not displayed");
        Assert.assertTrue(tpPointsCurrencyCart.get(2).isDisplayed(), "Total Product tpPointsCurrencyCart is not displayed");

        Assert.assertTrue(totalCartTxt.isDisplayed(), "Product total text is not displayed");
        Assert.assertTrue(continueShoppingBtn.isDisplayed(), "continueShoppingBtn is not displayed");
        Assert.assertTrue(checkoutBtn.isDisplayed(), "checkoutBtn is not displayed");
    }

    public void clearCart() {
        utils.waitUntilVisible(cartIcon, 2);
        cartIcon.click();
        utils.waitUntilVisible(titlesTxt.get(0), 2);
        Assert.assertTrue(titlesTxt.get(0).getText().contains("My cart"), "Cart screen is not displayed");
        int cartsize = cartDeleteBtn.size();
        if (cartsize > 0) {
            for (int i = 0; i < cartsize; i++) {
                cartDeleteBtn.get(0).click();
                cartRemoveBtn.click();
            }
        }
        utils.waitUntilVisible(cartExploreBtn, 2);
        cartExploreBtn.click();
    }

    public void selectAddToCartAndCheckout() {
        utils.waitUntilVisible(addToCartBtn, 5);
        addToCartBtn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartBtn.click();

        utils.waitUntilVisible(checkoutBtn, 5);
        Assert.assertTrue(titlesTxt.get(0).getText().contains("My cart"), "Cart screen is not displayed");
        checkoutBtn.click();
    }

    public void selectAddToCart() {
        utils.waitUntilVisible(addToCartBtn, 5);
        addToCartBtn.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cartBtn.click();
    }

    public void chooseShippingAddress() {
        utils.waitUntilVisible(descArrow, 2);
        descArrow.click();

        utils.waitUntilVisible(saveBtn, 2);
        shippingAddressBox.get(0).click();
        saveBtn.click();
        selectPaymentMethodBtn.click();
    }


    public void selectAddANewCardFlow() {
        utils.scrollTo("Add a new card");
        addNewCardBtn.click();
        Assert.assertTrue(addNewCardTxt.getText().equals("Add a new card?"));
        Assert.assertTrue(addNewCardMsg.getText().equals("You will be redirected to the payment gateway to add your new card and complete your payment."));
        addNewCardOKBtn.click();
    }

    public void makePaymentByOldCardInAED(String CVN) {
        addOldCardBtn.get(0).click();
        continueBtn.click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webViewBtn.get(0).click();

        System.out.println("aa" + bankLogo.size());
        if (bankLogo.size() > 0) {
            passwordTxt.sendKeys(CVN);
            submitBtn.get(0).click();
        }
    }

    public void makePaymentByNwCardAED(String CardNumber, String CVN1, String CVN2) {
        utils.waitUntilVisible(cardTypeVisaRadio.get(0), 10);
        CommonUtils.waitUntilClickable(cardTypeVisaRadio.get(0), 5);
        cardTypeVisaRadio.get(0).click();

        CommonUtils.waitUntilClickable(cardNumberTxt, 5);
        cardNumberTxt.click();
        cardNumberTxt.sendKeys(CardNumber);

        cardExpiryMonthDpd.click();
        cardExpiryText.get(3).click();

        cardExpiryYearDpd.click();
        cardExpiryText.get(3).click();

        cardCvnTxt.click();
        cardCvnTxt.sendKeys(CVN1);
        appDriver.hideKeyboard();
        webViewBtn.get(1).click();

        if (bankLogo.size() > 0) {
            passwordTxt.sendKeys(CVN2);
            submitBtn.get(0).click();
        }
    }

    public void verifyMixedPaymentUI() {
        Assert.assertTrue(titlesTxt.get(0).getText().equals("Split payment"), "Split payment title is incorrect");
        Assert.assertTrue(touchpointsIcon.isDisplayed(), "Touchpoints Icon is not displayed");
        Assert.assertTrue(touchpointsBalanceTxt.isDisplayed(), "touchpointsBalanceTxt is not displayed");
        Assert.assertTrue(tpTxt.getText().equals("TouchPoints"), "TouchPoints is not displayed");
        Assert.assertTrue(tpAvBalTxt.getText().equals("Available balance"), "Available balance is not displayed");

        System.out.println("aa " + splitInfo.getText());
        Assert.assertTrue(splitInfo.getText().contains("Slide the pointer to split your payment \n" +
                "between TouchPoints and money"), "Split Info is not displayed");
        Assert.assertTrue(circularSeekbar.isDisplayed(), "circularSeekbar is not displayed");

        utils.scrollTo("Minimum amount is 1 TP");
        Assert.assertTrue(titlesTxt.get(1).getText().equals("TouchPoints"), "TouchPoints title is incorrect");
        Assert.assertTrue(titlesTxt.get(2).getText().equals("Money (AED)"), "Money (AED) title is incorrect");
        Assert.assertTrue(tpAEDTxt.get(0).isDisplayed(), "TouchPoints textbox is not displayed");
        Assert.assertTrue(tpAEDTxt.get(1).isDisplayed(), "Money textbox is not displayed");
        Assert.assertTrue(tpSuffixIcon.isDisplayed(), "TouchPoints icon is not displayed");
        Assert.assertTrue(aedSuffixIcon.isDisplayed(), "aed icon is not displayed");

        Assert.assertTrue(totalTxt.isDisplayed(), "Total label is not displayed");
        Assert.assertTrue(totalAedAmt.isDisplayed(), "totalAedAmt is not displayed");
        Assert.assertTrue(totalAedIcon.isDisplayed(), "totalAedIcon is not displayed");
        Assert.assertTrue(totalTPIcon.isDisplayed(), "totalTPIcon is not displayed");
        Assert.assertTrue(totalTPAmt.isDisplayed(), "totalTPAmt is not displayed");
        Assert.assertTrue(continueBtn.isDisplayed(), "continueBtn is not displayed");
    }

    public void makePaymentByTouchpoints(String touchpoints) {
        Assert.assertTrue(totalTPAmt.isDisplayed(), "Touchpoints");
        splitInfo.click();
        utils.scrollTo("Minimum amount is 1 TP");
        tpAEDTxt.get(0).clear();
        tpAEDTxt.get(0).click();
        tpAEDTxt.get(0).sendKeys(touchpoints);
        utils.hideKeyboard();
        continueBtn.click();
    }

    public void makePaymentByCard() {
        splitInfo.click();
        continueBtn.click();
        Assert.assertTrue(payByTpTxt.isDisplayed(), "Touchpoints text is not displayed");
        Assert.assertTrue(payByCardTp.isDisplayed(), "card text is not displayed");
        Assert.assertTrue(changeBtn.isDisplayed(), "change btn text is not displayed");
        Assert.assertTrue(selectCardTxt.isDisplayed(), "select card title text is not displayed");
    }

    public void verifySuccessfulPayment() {
        utils.waitUntilVisible(confirmationTxtn.get(0), 20);
        Assert.assertTrue(confirmationTxtn.get(0).getText().contains("We sent a confirmation email to:"), "Order is not placed sucessfully");
    }

    public void verifyListingScreenUI() {
        Assert.assertTrue(backBtn.isDisplayed(), "Back Button is not displayed");
        Assert.assertTrue(searchTxt.isDisplayed(), "Search Bar is not displayed");
        Assert.assertTrue(searchIcon.isDisplayed(), "Search Icon is not displayed");
        Assert.assertTrue(searchCancelBtn.isDisplayed(), "Search Cancel Button is not displayed");
        Assert.assertTrue(resultsCountTxt.isDisplayed(), "Search Count Text is not displayed");
        Assert.assertTrue(sortBtn.isDisplayed(), "Sort is not displayed");
        Assert.assertTrue(filterBtn.isDisplayed(), "Filter is not displayed");
        Assert.assertTrue(productList.get(0).isDisplayed(), "Product List is not displayed");
        Assert.assertTrue(productList.get(2).isDisplayed(), "Product List is not displayed");
    }

    public void verifyProductDetailsScreenUI() {
        Assert.assertTrue(titlesTxt.get(1).isDisplayed(), "First product is not displayed");
        String prodName = titlesTxt.get(1).getText();
        String prodPriceAED = productPriceAED.get(0).getText();
        String prodPriceTP = productPriceTP.getText();
        selectTheFirstProduct();

        utils.waitUntilVisible(backBtn, 5);
        Assert.assertTrue(backBtn.isDisplayed(), "Back Button is displayed");
        Assert.assertTrue(searchIcon.isDisplayed(), "Search Icon is displayed");
        Assert.assertTrue(cartBtn.isDisplayed(), "Cart Button is displayed");
        Assert.assertTrue(productName.getText().equals(prodName), "product name is not correct");

        Assert.assertTrue(priceTxt.getText().equals(prodPriceAED), "price is not correct");
        Assert.assertTrue(currencyTxt.get(0).isDisplayed(), "price currency is not displayed");
        Assert.assertTrue(tpIcon.isDisplayed(), "touchpoint icon is not displayed");
        Assert.assertTrue(tpAmount.getText().equals(prodPriceTP), "tp price is not correct");
        Assert.assertTrue(tpTouchpoints.isDisplayed(), "touchpoint text is not displayed");
        Assert.assertTrue(addToCartBtn.isDisplayed(), "Add to Cart Button is displayed");
        Assert.assertTrue(buyNowBtn.isDisplayed(), "Buy Now Button is displayed");

        utils.scrollTo("Description");
        Assert.assertTrue(descArrow.isDisplayed(), "Description arrow Button is not displayed");
        Assert.assertTrue(ratingTxt.getText().contains("Product rating"), " Product rating is not displayed");
        Assert.assertTrue(ratingStar.isDisplayed(), "rating Star is not displayed");
        Assert.assertTrue(ratingValue.isDisplayed(), "rating Value is not displayed");
        Assert.assertTrue(deliveryLabel.isDisplayed(), "deliveryLabel is not displayed");
    }

    public void clickOnContinueShopping() {
        continueShoppingBtn.click();
    }

    public void scrollToQuickActions() {
        utils.scrollTo("Credit cards");
    }

    public void clickOnBanner(){
        appDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        utils.waitUntilVisible(dashboardBannerTitle,30);
        dashboardBannerTitle.click();
    }

    public void validateBannerDetails(String strBannnerNm){
        appDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        utils.waitUntilVisible(dashboardBannerTitle,30);
        String actBannerTitle = dashboardBannerTitle.getText();
        String actBannerDesc = dashboardBannerDesc.getText();

        Assert.assertTrue(dashboardBannerWidget.isDisplayed(),"Banner widget is not displayed.");
        Assert.assertTrue(actBannerTitle.equalsIgnoreCase(strBannnerNm.split("%")[0].trim()),"Title of banner is not correct. Expected: "+strBannnerNm.split("%")[0].trim()+", Actual:"+actBannerTitle);
        Assert.assertTrue(actBannerDesc.equalsIgnoreCase(strBannnerNm.split("%")[1].trim()),"Desc of banner is not correct. Expected: "+strBannnerNm.split("%")[1].trim()+", Actual:"+actBannerDesc);
    }

    public void selectCreditQuickAction() {
        appDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        utils.waitUntilVisible(optnCreditCard,30);
        utils.waitUntilClickable(optnCreditCard,30);
        optnCreditCard.click();

    }

    public void scrollToQuickActions(String strValue) {
        utils.scrollTo(strValue);
    }
    
    public void selectBankOnboardingBanner() {
        utils.waitUntilVisible(bankOnboardingBanner, 5);
        bankOnboardingBanner.click();

    }
}
