package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BacTaxSelfDeclarationScreen extends BaseScreen {

	// Constructor
	public BacTaxSelfDeclarationScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "ti_value")
	public MobileElement countryOfTaxResidence;

	@AndroidFindBy(id = "iv_radio")
	public List<MobileElement> radioBtn;

	@AndroidFindBy(id = "btn_continue")
	public MobileElement continueBtn;

	@AndroidFindBy(id = "cb_check")
	public MobileElement acceptTermsAndCondition;

	public void selectContinueBtn() {

		continueBtn.click();
	}

	public void selectCountryOfTaxResidence() {

		countryOfTaxResidence.click();

	}

	public void acceptTermsAndCondition() {

		acceptTermsAndCondition.click();

	}

	public void selectNoFromTaxIdentification() {

		radioBtn.get(1).click();

	}

	public void selectNoFromReason() {

		radioBtn.get(2).click();

	}

}