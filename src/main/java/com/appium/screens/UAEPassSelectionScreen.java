package com.appium.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UAEPassSelectionScreen extends BaseScreen {

	// Constructor
	public UAEPassSelectionScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}


	@AndroidFindBy(id = "bv_continue_without_uaepass")
	public MobileElement continueWithoutUaePassOption;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[1]")
	public MobileElement continueWithUaePass;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
	public MobileElement navigateBackOption;
	

	public void navigateBack() {

		navigateBackOption.click();
	}

	public void selectStandardOption() {
		continueWithoutUaePassOption.click();
		
	}

}
