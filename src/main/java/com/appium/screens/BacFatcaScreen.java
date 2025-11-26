package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BacFatcaScreen extends BaseScreen {

	// Constructor
	public BacFatcaScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "tv_info_title")
	public MobileElement fatcaHeader;

	@AndroidFindBy(id = "tv_employment_type")
	public MobileElement fatcaSubHeader;

	@AndroidFindBy(id = "ti_value")
	public List<MobileElement> countryLbl;

	@AndroidFindBy(id = "toolbar")
	public MobileElement countryHeader;

	@AndroidFindBy(xpath = "android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.EditText")
	public MobileElement villaNumber;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.TextView[1]")
	public MobileElement selectSpouse;

	@AndroidFindBy(id = "spinner_view")
	public List<MobileElement> sourceOfIncomeValue;

	@AndroidFindBy(id = "btn_continue")
	public MobileElement continueBtn;

	public void selectContinueBtn() {

		continueBtn.click();
	}

	public void verifyFatcaScreen() {
		Assert.assertTrue(fatcaHeader.isDisplayed(), "Current employment title is not displayed");
		Assert.assertTrue(fatcaHeader.getText().equals("FATCA (for USA citizens)"),
				"FATCA (for USA citizens) title is incorrect");
		Assert.assertTrue(fatcaSubHeader.isDisplayed(),
				"Do you hold a US passport or Permanent Resident Card? title is not displayed");

	}

	public void selectCountry() {

		countryLbl.get(0).click();
		countryHeader.click();

	}

	public void enterCity(String value) {

		countryLbl.get(1).sendKeys(value);

	}

}