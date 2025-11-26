package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BacYourAddressScreen extends BaseScreen {

	// Constructor
	public BacYourAddressScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "tv_info_title")
	public MobileElement yourAddressHeader;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> nameLbl;

	@AndroidFindBy(xpath = "android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.EditText")
	public MobileElement villaNumber;

	@AndroidFindBy(xpath = "//android.widget.ListView/android.widget.TextView[1]")
	public MobileElement selectCity;

	@AndroidFindBy(id = "ti_value")
	public List<MobileElement> fieldsLbl;

	@AndroidFindBy(id = "spinner_view")
	public List<MobileElement> cityValue;

	@AndroidFindBy(id = "btn_continue")
	public MobileElement continueBtn;

	@AndroidFindBy(id = "tv_title_disabled")
	public MobileElement fullNameTitle;

	@AndroidFindBy(id = "tv_header")
	public List<MobileElement> idNumber;

	@AndroidFindBy(id = "btn_report")
	public MobileElement detailsIncorrectBtn;

	public void selectContinueBtn() {

		continueBtn.click();
	}

	public void selectDetailsIncorrectBtnBtn() {

		detailsIncorrectBtn.click();
	}

	public void verifyBacYourAddressScreen() {
		Assert.assertTrue(yourAddressHeader.isDisplayed(), "Your address title is not displayed");
		Assert.assertTrue(yourAddressHeader.getText().equals("Your address"), "Your address title is incorrect");
		Assert.assertTrue(idNumber.get(0).isDisplayed(), "Villa or flat number is not displayed");
		Assert.assertTrue(idNumber.get(1).isDisplayed(), "Building name (optional) is not displayed");
		Assert.assertTrue(idNumber.get(2).isDisplayed(), "Building number (optional) is not displayed");
		Assert.assertTrue(idNumber.get(3).isDisplayed(), "Street or area is not displayed");
		Assert.assertTrue(idNumber.get(4).isDisplayed(), "City is not displayed");
		Assert.assertTrue(idNumber.get(0).getText().equals("Villa or flat number"),
				"Villa or flat number title is incorrect");
		Assert.assertTrue(idNumber.get(1).getText().equals("Building name (optional)"),
				"Building name (optional) title is incorrect");
		Assert.assertTrue(idNumber.get(2).getText().equals("Building number (optional)"),
				"Building number (optional) title is incorrect");
		Assert.assertTrue(idNumber.get(3).getText().equals("Street or area"), "Street or area title is incorrect");
		Assert.assertTrue(idNumber.get(4).getText().equals("City"), "City title is incorrect");

	}

	public void enterVillaDetails(String villa) {

		fieldsLbl.get(0).sendKeys(villa);
	}

	public void enterStreetDetails(String street) {

		fieldsLbl.get(3).sendKeys(street);
	}

	public void selectCityFromDropDown(String City) {

		cityValue.get(0).click();
		selectCity.click();

	}

	public void selectEmirateFromDropDown(String Emirate) {

		cityValue.get(2).click();
		selectCity.click();

	}

}