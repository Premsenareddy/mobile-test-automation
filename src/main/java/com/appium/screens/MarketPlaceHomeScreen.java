package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class MarketPlaceHomeScreen extends BaseScreen {

	// ------------------PAGE FACTORY--------------------------

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[1]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[4]")
	public MobileElement pinDetail_1;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[2]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[1]")
	public MobileElement pinDetail_2;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[3]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[2]")
	public MobileElement pinDetail_3;

	//To enter pin
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText[4]")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField[3]")
	public MobileElement pinDetail_4;

	//To tap friends
	@AndroidFindBy(id = "ae.ahb.digital.sit:id/ti_search")
	public MobileElement searchBar;

	@AndroidFindBy(id = "ae.ahb.digital.sit:id/iv_product")
	public MobileElement clickProduct;
	
	//Assertions for Friends Screen
	@AndroidFindBy(id = "ae.ahb.digital.sit:id/iv_back")
	public MobileElement backBtn;
	
	@AndroidFindBy(id = "icl_open_account_status_card")
	public MobileElement idVerificationSuccessfulBanner;
	

	// -------------Second Scenario--------------------

	//To tap back
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
	public MobileElement back;

	// CONSTRUCTOR
	public MarketPlaceHomeScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	// Tap functionality
	TouchAction touch = new TouchAction(CommonUtils.appDriver);

	// ------------------------METHODS TO ACCESS LOCATORS-------------------------------
	//To Add comment
	public void enterPin(String text) throws InterruptedException {//
		//touch.tap(tapOptions().withElement(element(pinDetail))).perform();
		Thread.sleep(4000);
		//appDriver.navigate().back();
		pinDetail_1.sendKeys("1");
		pinDetail_2.sendKeys("2");
		pinDetail_3.sendKeys("3");
		pinDetail_4.sendKeys("4");
		//touch.tap(tapOptions().withElement(element(pinDetail))).perform();
	}
	
	//To Add comment
	public void searchProduct(String text) {
		
		//touch.tap(tapOptions().withElement(element(searchBar))).perform();
		searchBar.sendKeys(text);
	}

	//To tap back
	public void tapBack() {
		touch.tap(tapOptions().withElement(element(backBtn))).perform();
	}
	
	//To tap back
	public void clickProduct() {
		touch.tap(tapOptions().withElement(element(clickProduct))).perform();
	}

	public void searchInvalidProduct(String property) {
		searchBar.sendKeys(property);
		
	}
	
	public void selectidVerificationSuccessfulBanner() {
		idVerificationSuccessfulBanner.click();
		
	}
	


}
