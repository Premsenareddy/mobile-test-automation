package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BacCurrentEmploymentScreen extends BaseScreen {

	// Constructor
	public BacCurrentEmploymentScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "tv_info_title")
	public MobileElement currentEmploymentHeader;

	@AndroidFindBy(id = "tv_sub_title")
	public MobileElement currentEmploymentSubHeader;

	@AndroidFindBy(id = "tv_employment_type")
	public MobileElement currentEmploymentTypeHeader;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> employmentTypeLbl;

	@AndroidFindBy(xpath = "android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.EditText")
	public MobileElement villaNumber;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.TextView[1]")
	public MobileElement selectSpouse;

	@AndroidFindBy(id = "ti_value")
	public MobileElement incomeBox;

	@AndroidFindBy(id = "spinner_view")
	public List<MobileElement> sourceOfIncomeValue;

	@AndroidFindBy(id = "btn_continue")
	public MobileElement continueBtn;

	public void selectContinueBtn() {

		continueBtn.click();
	}

	public void verifyCurrentEmplooymentScreen() {
		Assert.assertTrue(currentEmploymentHeader.isDisplayed(), "Current employment title is not displayed");
		Assert.assertTrue(currentEmploymentHeader.getText().equals("Current employment"),
				"Current employment title is incorrect");
		Assert.assertTrue(currentEmploymentSubHeader.isDisplayed(), "Current employment title is not displayed");

		Assert.assertTrue(currentEmploymentTypeHeader.isDisplayed(), "Employment type title is not displayed");
		Assert.assertTrue(currentEmploymentTypeHeader.getText().equals("Employment type"),
				"Employment type title is incorrect");

		Assert.assertTrue(employmentTypeLbl.get(0).isDisplayed(), "Employed is not displayed");
		Assert.assertTrue(employmentTypeLbl.get(1).isDisplayed(), "Self-Employed is not displayed");
		Assert.assertTrue(employmentTypeLbl.get(2).isDisplayed(), "Others is not displayed");
		Assert.assertTrue(employmentTypeLbl.get(0).getText().equals("Employed"), "Employed title is incorrect");
		Assert.assertTrue(employmentTypeLbl.get(1).getText().equals("Self-employed"),
				"Self-employed title is incorrect");
		Assert.assertTrue(employmentTypeLbl.get(2).getText().equals("Other"), "Other title is incorrect");

	}

	public void selectSpouseDropDown() {

		sourceOfIncomeValue.get(0).click();
		selectSpouse.click();

	}

	public void selectOther() {

		employmentTypeLbl.get(2).click();

	}

	public void enterIncome(String income) {

		incomeBox.sendKeys(income);

	}

}