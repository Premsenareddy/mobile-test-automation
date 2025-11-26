package com.appium.screens;

import java.util.List;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EmailVerificationScreen extends BaseScreen {

	// Constructor
	public EmailVerificationScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}


//	@AndroidFindBy(id = "iv_next_button")
//	public MobileElement nextBtnAfterOTP;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
	public MobileElement crossIcon;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Your email address']")
	public MobileElement emailAddresstxtElement;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.EditText")
	public MobileElement dobtxtElement;

	@AndroidFindBy(id = "iv_radio")
	public List<MobileElement> genderRadioBtn;

	@AndroidFindBy(id = "cb_personal_details_terms_n_conditions")
	public MobileElement termsNConditionschkbox;

	@AndroidFindBy(id = "ib_next_button")
	public MobileElement nextButtonAfterEnteringDetails;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> interstedElements;

	@AndroidFindBy(id = "btn_explore")
	public MobileElement exploreBtn;

	@AndroidFindBy(id = "autoCompleteView")
	public MobileElement nationalityElement;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.CheckBox")
	public MobileElement termsNConditionschkbox_1;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.CheckBox")
	public MobileElement termsNConditionschkbox_2;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.CheckBox")
	public MobileElement termsNConditionschkbox_3;
	
	@AndroidFindBy(id = "bv_done")
	public MobileElement doneBtn;
	
	@AndroidFindBy(id = "navigation_more")
	public MobileElement moreMenuBtn;
	
	@AndroidFindBy(id = "iv_account")
	public MobileElement accountBtn;
	
	@AndroidFindBy(id = "iv_user_profile")
	public MobileElement userProfileBtn;
	
	@AndroidFindBy(id = "tv_user_name")
	public MobileElement userNameBtn;
	
	@AndroidFindBy(id = "tv_error")
	public MobileElement userEmailMsg;
	
	@AndroidFindBy(id = "tv_description")
	public MobileElement bannerMsg;
	
	@AndroidFindBy(id = "tv_continue")
	public MobileElement continueBtn;
	
	@AndroidFindBy(id = "bv_open_email_app")
	public MobileElement openYourEmailAppBtn;
	

	public void clickCrossIcon() {

		crossIcon.click();
	}
	
//	public void clickContinueButton() {
//
//		continueBtn.click();
//	}
	
//	public void validateEmail() {
//
//		continueBtn.click();
//	}

}
