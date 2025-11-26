package com.appium.screens;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegistrationScreen extends BaseScreen {

	// Constructor
	public RegistrationScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "tv_right_top")
	public MobileElement skipBtn;

	@AndroidFindBy(id = "iv_next")
	public MobileElement nextbtnElement;

	@AndroidFindBy(id = "iv_next_button")
	public MobileElement onnextbtnElement;

	@AndroidFindBy(id = "bv_create_account")
	public MobileElement startExploringbtn;

	@AndroidFindBy(id = "ti_value")
	public MobileElement phoneNumberElement;

	@AndroidFindBy(className = "android.widget.EditText")
	public List<MobileElement> textFields;

	@AndroidFindBy(id = "iv_next_button")
	public MobileElement nextBtnAfterOTP;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Name']")
	public MobileElement firstNametxtElement;

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

	public void enterPasswordValueInTextFields(String password) {
		int count = textFields.size();
		for (int i = 0; i < count; i++) {
			textFields.get(i).sendKeys(String.valueOf(password.charAt(i)));

		}

	}

	public void clickNextButtonAfterCustomerDetails() {
		MobileElement element = (MobileElement) appDriver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().resourceIdMatches(\".*ib_next_butto.*\"))"));
		nextButtonAfterEnteringDetails.click();
	}

	public void clickNextButton() {

		nextbtnElement.click();
	}

	public void clickContinueButton() {

		continueBtn.click();
	}

//	public void validateEmail() {
//
//		continueBtn.click();
//	}

}
