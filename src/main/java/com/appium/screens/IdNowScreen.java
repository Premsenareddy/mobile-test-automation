package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class IdNowScreen extends BaseScreen {

	CommonUtils utils = new CommonUtils();

	public IdNowScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "instruction_title")
	public MobileElement adultEidScanInstructionTitle;
	
	@AndroidFindBy(id = "button_continue")
	public MobileElement startScanningButton;

	public IdNowScreen verifyEIDScanScreen() {

		Assert.assertTrue(utils.eleIsDisplayed(adultEidScanInstructionTitle), "EID scan instruction title is not present");
		Assert.assertTrue(utils.eleIsDisplayed(startScanningButton), "Continue button is not present");

		return new IdNowScreen(appDriver);

	}

}
