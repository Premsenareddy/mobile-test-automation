package com.appium.screens;

import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScanYourPassportScreen extends BaseScreen {

	// Constructor
	public ScanYourPassportScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}


	@AndroidFindBy(id = "bv_continue_without_uaepass")
	public MobileElement continueWithoutUaePassOption;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout/android.widget.Button[1]")
	public MobileElement continueWithUaePass;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎‏‎‎‏‎\"]")
	public MobileElement navigateBackOption;
	
	@AndroidFindBy(id = "tv_title")
	public MobileElement scanYourPassportTitle;
	
	@AndroidFindBy(id = "tv_subtitle")
	public MobileElement scanYourPassportSubTitle;
	
	@AndroidFindBy(id = "iv_placeholder")
	public MobileElement scanYourPassportImage;
	
	@AndroidFindBy(id = "tv_corners")
	public MobileElement getDocumentsReadyTxt;
	
	@AndroidFindBy(id = "tv_light")
	public MobileElement makeSureCornersCoveredTxt;
	
	@AndroidFindBy(id = "btn_save")
	public MobileElement scanYourPassportBtn;
	
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public MobileElement allowPermissionsBtn;
	
	
	

	public void navigateBack() {

		navigateBackOption.click();
	}

	public void selectStandardOption() {
		continueWithoutUaePassOption.click();
		
	}
	
	public void selectAllowPermissionsBtn() {
		allowPermissionsBtn.click();
		
	}

	public void verifyPassportScreenUI() {
        Assert.assertTrue(scanYourPassportTitle.isDisplayed(), "Scan your passport title is not displayed");
        Assert.assertTrue(scanYourPassportSubTitle.isDisplayed(), "Subtitile not displayed");
        Assert.assertTrue(scanYourPassportImage.isDisplayed(), "Scan your passport Image is not displayed");
        Assert.assertTrue(getDocumentsReadyTxt.isDisplayed(), "Keep your documents ready message not displayed");
        Assert.assertTrue(makeSureCornersCoveredTxt.isDisplayed(), "Make sure you cover all 4 corners text is not displayed");
		
	}
	
	public void selectScanYourPassportBtn() {
		scanYourPassportBtn.click();
		
	}
	


}
