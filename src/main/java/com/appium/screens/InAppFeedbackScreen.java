package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class InAppFeedbackScreen extends BaseScreen {
	CommonUtils utils= new CommonUtils();
	// ------------------PAGE FACTORY--------------------------//
	public InAppFeedbackScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "navigation_bar_item_icon_view")
	public List<MobileElement> moreTab;
	//text
	@AndroidFindBy(xpath = "//android.widget.RatingBar[@text='0.0']")
	public MobileElement emptyFiceStar;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTabBar[@name=\"Tab Bar\"]/XCUIElementTypeButton[4]")
	public MobileElement moreTabBar;
	@AndroidFindBy(id = "navigation_bar_item_icon_view")
	public List<MobileElement> moreTab1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Rate us\"]")
	public MobileElement getRateUSHeaderiOS;

	@AndroidFindBy(id = "tv_rate_us")
	public MobileElement rateUSHeader;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Maximum character limit is 500\"]")
	public MobileElement feedbackLimitIOS;
	@AndroidFindBy(xpath = "//*[@text='Maximum character limit is 500']")
	public MobileElement feedBackCharacterLimit;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rating\"]")
	public MobileElement ratingStarsiOS;
	@AndroidFindBy(id = "rb_rate_us")
	public List<MobileElement> ratingStars;
	@AndroidFindBy(id = "rb_rate_us")
	public MobileElement ratingStars1;


	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Rating\"])[2]")
	public  MobileElement ratingStarPopupIOS;
	@AndroidFindBy(id = "rb_rating")
	public List<MobileElement> ratingStarsPopUpScreen;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Al Hilal SIT\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextView")
	public  MobileElement feedbackBoxIOS;
	@AndroidFindBy(id = "ti_value")
	public MobileElement commentBox;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Submit\"]")
	public  MobileElement submitBtnIOS;
	@AndroidFindBy(id = "bv_submit")
	public MobileElement submitBtn;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"ic general close\"]")
	public  MobileElement closeBtnIOS;
	@AndroidFindBy(id = "iv_close_rate_us")
	public MobileElement closeButton;


	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Success!\"]")
	public  MobileElement successLabelIOS;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Success!']")
	public MobileElement successLabel;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name=\"More/Ratings/success\"]")
	public MobileElement imageSuccessIOS;
	@AndroidFindBy(id = "iv_rate_us_status")
	public MobileElement imageSuccess;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Thank you! We have received your feedback\"]")
	public MobileElement successMsgIOS;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thank you! We have received your feedback']")
	public MobileElement successMsg;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Rating\"]")
	public MobileElement selectedStarIOS;
	@AndroidFindBy(xpath = "//android.widget.RatingBar[@text='3.0']")
	public MobileElement selectedStar;


	public void iLandMoreTab() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				Assert.assertTrue(moreTab1.get(3).isDisplayed(), "More Tab is Not displayed");
				moreTab1.get(3).click();
				break;
			case "ios":
				utils.waitUntilVisible(moreTabBar, 10);
				Assert.assertTrue(moreTabBar.isDisplayed(),"More Tab is Not displayed");
				utils.validateAndClick(moreTabBar);
		}

	}

	public void firstTimeRateUsFiveStarsIsEmpty() {
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(rateUSHeader,20);
				Assert.assertEquals(rateUSHeader.getText(), "Rate us", "Rate us title is incorrect");
				Assert.assertTrue(ratingStars1.isDisplayed(), "Rate Us option is not Empty");
				break;
			case "ios":
				utils.waitUntilVisible(getRateUSHeaderiOS, 10);
				Assert.assertTrue(getRateUSHeaderiOS.isDisplayed(),"Rate Us Heading is not displayed");
				utils.waitUntilVisible(ratingStarsiOS,5);
				Assert.assertTrue(ratingStarsiOS.isDisplayed(),"Rating Star with empty items are not displayed");
		}
	}

	public void verifyEmptyFiveStar()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(rateUSHeader,20);
				utils.validateAndClick(ratingStars.get(0));
				utils.waitUntilVisible(commentBox,30);
				Assert.assertTrue(commentBox.isDisplayed(),"Comment box with Pop up screen is not Displayed");
				Assert.assertTrue(submitBtn.isDisplayed(),"Submit Button is not getting displayed on the page");
				Assert.assertTrue(closeButton.isDisplayed(),"Close Button is not getting displayed on the page");
				Assert.assertTrue(ratingStarsPopUpScreen.get(0).isDisplayed(),"Close Button is not getting displayed on the page");
				break;
			case "ios":
				utils.waitUntilVisible(getRateUSHeaderiOS, 10);
				Assert.assertTrue(getRateUSHeaderiOS.isDisplayed(),"Rate Us Heading is not displayed");
				utils.waitUntilVisible(ratingStarsiOS,5);
				Assert.assertTrue(ratingStarsiOS.isDisplayed(),"Rating Star with empty items are not displayed");
				utils.validateAndClick(ratingStarsiOS);
				Assert.assertTrue(submitBtnIOS.isDisplayed(),"Submit Button is not getting displayed on the page");
				Assert.assertTrue(closeBtnIOS.isDisplayed(),"Close Button is not getting displayed on the page");
				Assert.assertTrue(ratingStarPopupIOS.isDisplayed(),"Rating Star in popup is not displayed");
		}
	}

	public void submitComment(String comment)
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(commentBox,25);
				Assert.assertTrue(commentBox.isDisplayed(),"Comment box with Pop up screen is not Displayed");
				utils.validateAndSendKeys(commentBox,comment);
				break;
			case "ios":
				utils.waitUntilVisible(feedbackBoxIOS, 20);
				Assert.assertTrue(feedbackBoxIOS.isDisplayed(),"More Tab is Not displayed");
				utils.validateAndSendKeys(feedbackBoxIOS,comment);
		}

	}

	public void clickSubmitButton()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(submitBtn,25);
				Assert.assertTrue(submitBtn.isDisplayed(),"Submit Button  is not displayed");
				utils.validateAndClick(submitBtn);
				break;
			case "ios":
				utils.waitUntilVisible(submitBtnIOS, 20);
				Assert.assertTrue(submitBtnIOS.isDisplayed(),"Submit Button  is not displayed");
				utils.validateAndClick(submitBtnIOS);
		}

	}
	public  void verifySubmitBtn()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(submitBtn,10);
				Assert.assertTrue(submitBtn.isDisplayed(),"Submit Button is not displayed");
				break;
			case "ios":
				utils.waitUntilVisible(submitBtnIOS,10);
				Assert.assertTrue(submitBtnIOS.isDisplayed(),"Submit Button is not displayed");
		}

	}


	public void verifyCharacterLimit()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(feedBackCharacterLimit,10);
				Assert.assertTrue(feedBackCharacterLimit.isDisplayed(),"Feedback Label is not displayed");
				break;
			case "ios":
				utils.waitUntilVisible(feedbackLimitIOS, 10);
				Assert.assertTrue(feedbackLimitIOS.isDisplayed(),"Feedback Label is not displayed");
		}

	}

	public void verifySuccessScreen()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(successLabel,10);
				Assert.assertTrue(successLabel.isDisplayed(),"Success Label is not displayed");
				utils.waitUntilVisible(imageSuccess,10);
				Assert.assertTrue(imageSuccess.isDisplayed(),"Success Image is not displayed");
				utils.waitUntilVisible(successMsg,10);
				Assert.assertTrue(successMsg.isDisplayed(),"Successfull Message is not displayed");
				utils.waitUntilVisible(closeButton,10);
				Assert.assertTrue(closeButton.isDisplayed(),"Close Button is not displayed");
				break;
			case "ios":
				utils.waitUntilVisible(successLabelIOS,10);
				Assert.assertTrue(successLabelIOS.isDisplayed(),"Success Label is not displayed");
				utils.waitUntilVisible(imageSuccessIOS,10);
				Assert.assertTrue(imageSuccessIOS.isDisplayed(),"Success Image is not displayed");
				utils.waitUntilVisible(successMsgIOS,10);
				Assert.assertTrue(successMsgIOS.isDisplayed(),"Successfull Message is not displayed");
				utils.waitUntilVisible(closeBtnIOS,10);
				Assert.assertTrue(closeBtnIOS.isDisplayed(),"Close Button is not displayed");
		}

	}

	public void verifyCloseButton()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(closeButton,10);
				Assert.assertTrue(closeButton.isDisplayed(),"Close Button is not displayed");
				utils.validateAndClick(closeButton);
				break;
			case "ios":
				utils.waitUntilVisible(closeBtnIOS,10);
				Assert.assertTrue(closeBtnIOS.isDisplayed(),"Close Button is not displayed");
				utils.validateAndClick(closeBtnIOS);
		}

	}

	public void verifySelectedStar()
	{
		switch (CommonUtils.platform.toLowerCase()) {
			case "android":
				utils.waitUntilVisible(selectedStar,10);
				utils.waitUntilVisible(rateUSHeader,10);
				Assert.assertTrue(selectedStar.isDisplayed(),"Selected Star is not displayed");
				break;
			case "ios":
				utils.waitUntilVisible(getRateUSHeaderiOS,10);
				Assert.assertTrue(getRateUSHeaderiOS.isDisplayed(),"Rate us Heading is not displayed");
				utils.waitUntilVisible(selectedStarIOS,10);
				Assert.assertTrue(selectedStarIOS.isDisplayed(),"Selected Star is not displayed");

		}

	}

}