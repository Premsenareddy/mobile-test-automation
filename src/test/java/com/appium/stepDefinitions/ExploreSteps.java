package com.appium.stepDefinitions;

import com.appium.screens.*;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class ExploreSteps extends CommonUtils {
	public static final Logger log = Logger.getLogger(ExploreSteps.class);
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	ExploreScreen explore = new ExploreScreen(appDriver);
	DashboardScreen dashboard= new DashboardScreen(appDriver);
	CommonUtils utils= new CommonUtils();

	@Then("^User search for product \"([^\"]*)\"$")
	public void userSearchForProduct(String product) throws Throwable {
		explore.userSearchForProduct(product);
	}

	@Then("^Verify Shopping Category screen first half UI$")
	public void verifyShoppingCategoryScreenFirstHalfUI() {
		explore.verifyShoppingCategoryScreenFirstHalfUI();
	}

	@Then("^Verify Shop By Brand Categories UI$")
	public void verifyShopByBrandCategoriesUI() {
		explore.verifyShopByBrandCategoriesUI();
	}

	@And("^Verify product listing for each shop sub category$")
	public void verifyProductListingForEachShopSubCategory() {
		explore.verifyProductListingForEachShopSubCategory();
	}

	@When("^I navigate to Shop tab$")
	public void iNavigateToShopTab() {
		explore.iNavigateToShopTab();
	}

	@And("^Verify \"([^\"]*)\" is displayed$")
	public void verifyIsDisplayed(String title) throws Throwable {
		log.info("User is on title screen!!");
		explore.verifyIsDisplayed(title);
	}

	@And("^Select the first product$")
	public void selectTheFirstProduct() {
		explore.selectTheFirstProduct();
	}

	@And("^Select Buy Now$")
	public void selectBuyNow() {
		explore.selectBuyNow();
	}

	@When("^Clear cart$")
	public void clearCart() {
		explore.clearCart();
	}

	@And("^Verify cart has items added$")
	public void verifyCartHasItemsAdded() {
		explore.verifyCartHasItemsAdded();
	}

	@And("^Select Add to Cart And Checkout$")
	public void selectAddToCartAndCheckout() {
		explore.selectAddToCartAndCheckout();
	}

	@And("^Select Add to Cart$")
	public void selectAddToCart() {
		explore.selectAddToCart();
	}

	@And("^Choose shipping address$")
	public void chooseShippingAddress() {
		explore.chooseShippingAddress();
	}

	@And("^Select Add a new card flow$")
	public void selectAddANewCardFlow() {
		explore.selectAddANewCardFlow();
	}

	@And("Verify mixed payment screen UI")
	public void verifyMixedPaymentScreenUI() {
		explore.verifyMixedPaymentUI();
	}

	@And("Make payment by Touchpoints {string}")
	public void makePaymentByTouchpoints(String Touchpoints) {
		explore.makePaymentByTouchpoints(Touchpoints);
	}

	@And("Make payment by card")
	public void makePaymentByCard() {
		explore.makePaymentByCard();
	}

	@And("^Make payment by new card in AED \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void makePaymentByNewCardAED(String CardNumber, String CVN1, String CVN2) {
		explore.makePaymentByNwCardAED(CardNumber, CVN1, CVN2);
	}

	@And("Make payment by old card in AED \"([^\"]*)\"$")
	public void makePaymentByOldCardInAED(String CVN) {
		explore.makePaymentByOldCardInAED(CVN);
	}

	@And("^Verify Listing Screen UI$")
	public void verifyListingScreenUI() {
		explore.verifyListingScreenUI();
	}

	@And("^Verify Product Details Screen UI$")
	public void verifyProductDetailsScreenUI() {
		explore.verifyProductDetailsScreenUI();
	}


	@And("^Click on Continue shopping$")
	public void clickOnContinueShopping() {
		explore.clickOnContinueShopping();
	}



	@And("Verify Successful Payment")
	public void verifySuccessfulPayment() {
		explore.verifySuccessfulPayment();
	}

	@And("^Verify Suggested for you Offers screen UI$")
	public void verifySuggestedForYouCards() {
		dashboard.verifySuggestedForYou();
	}

	@And("^Scroll to set quick actions on dashboard$")
	public void scrollQuickActionDashboard() throws Throwable {
		if(CommonUtils.platform.equalsIgnoreCase("android")) {
			explore.scrollToQuickActions();
		}
	}

	@And("^User clicks on banner from dashboard$")
	public void userSelectsBanner() throws Throwable{
		explore.clickOnBanner();
	}

	@And("^User should see \"([^\"]*)\" banner on dashboard$")
	public void userValidateBannerDetails(String strBannerNm) throws Throwable{
		explore.validateBannerDetails(strBannerNm);
	}

	@And("^User selects Credit Cards from dashboard$")
	public void selectOptionDashboard() throws Throwable{
		explore.selectCreditQuickAction();
	}
}