package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BacReviewAndVerifyScreen extends BaseScreen {

	// Constructor
	public BacReviewAndVerifyScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}


	@AndroidFindBy(id = "tv_info_title")
	public MobileElement reviewAndVerifyHeader;
	
	@AndroidFindBy(id = "btn_continue")
	public MobileElement continueBtn;
	
	@AndroidFindBy(id = "tv_title_disabled")
	public MobileElement fullNameTitle;
	
	@AndroidFindBy(id = "tv_header")
	public List<MobileElement> idNumber;
	
	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> nameLbl;
	
	@AndroidFindBy(id = "tv_title_passport")
	public MobileElement passportTitle;
	
	@AndroidFindBy(id = "btn_report")
	public MobileElement detailsIncorrectBtn;
	
	@AndroidFindBy(id = "tv_subtitle")
	public MobileElement message_5Days;
	
	
	

	public void selectContinueBtn() {

		continueBtn.click();
	}
	
	public void selectDetailsIncorrectBtnBtn() {

		detailsIncorrectBtn.click();
	}
	
	public void verifyBacReviewAndVerifyScreen() {
		Assert.assertTrue(idNumber.get(0).isDisplayed(), "EID is not displayed");
		Assert.assertTrue(idNumber.get(0).getText().equals("ID number"), "ID number title is incorrect");
		Assert.assertTrue(idNumber.get(1).isDisplayed(), "Expiry date is not displayed");
		Assert.assertTrue(idNumber.get(1).getText().equals("ID expiry date"), "ID expiry date title is incorrect");
		Assert.assertTrue(nameLbl.get(0).isDisplayed(), "EID is not displayed");
		Assert.assertTrue(nameLbl.get(0).getText().equals("First name"), "First name title is incorrect");
		Assert.assertTrue(nameLbl.get(1).isDisplayed(), "Last Name is not displayed");
		Assert.assertTrue(nameLbl.get(1).getText().equals("Last name"), "Last name date title is incorrect");


}
	public void verifyBacIRNationalityBanner() {
		Assert.assertTrue(message_5Days.getText().equals("Thank you for providing the required details. We will update you once the verification is complete or if anything else is needed. This can take up to 5 working days"), "Message Incorrect");

}
}