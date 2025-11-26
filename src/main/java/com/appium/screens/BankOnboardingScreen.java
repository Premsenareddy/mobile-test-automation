package com.appium.screens;

import java.util.List;

import org.testng.Assert;

import com.appium.utils.CommonUtils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BankOnboardingScreen extends BaseScreen {

	CommonUtils utils = new CommonUtils();

	// Constructor
	public BankOnboardingScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

    @AndroidFindBy(id = "layout_title_with_checkbox")
    public List<MobileElement> savingCurrentAccountOptions;

	@AndroidFindBy(id = "tv_label")
	public MobileElement bankingLabel;

	@AndroidFindBy(id = "iv_arrow")
	public MobileElement nextArrowIcon;

	@AndroidFindBy(id = "iv_next")
	public MobileElement letsGetStartedArrowIcon;
	
	@AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[1]")
	public MobileElement pickYourAccountsText;
	
	@AndroidFindBy(id = "tv_subtitle")
	public MobileElement subtitileText;
	
	@AndroidFindBy(id = "cb_check")
	public MobileElement acceptTermCondition;
	
    @AndroidFindBy(id = "cb_check")
    public List<MobileElement> keyFactStatementsCheckbox;
    
	@AndroidFindBy(id = "btn_lets_go")
	public MobileElement letsGoBtn;
	
	
	
	
	public void clickOpenBankAccount() {

		nextArrowIcon.click();
	}

	public void verifyPickYourAccountsScreenFirstHalfUI() {
        Assert.assertTrue(pickYourAccountsText.isDisplayed(), "Pick your accounts text is displayed");
        Assert.assertTrue(pickYourAccountsText.isDisplayed(), "Pick your accounts text is not displayed");
        Assert.assertTrue(savingCurrentAccountOptions.get(0).isDisplayed(), "Current Account option not displayed");
        Assert.assertTrue(savingCurrentAccountOptions.get(1).isDisplayed(), "Savings Account option not displayed");

    }
	
	public void acceptTermsAndConditions() {

		acceptTermCondition.click();
	}
	
	public void acceptKeyFactStatements() {

		keyFactStatementsCheckbox.get(1).click();
	}

	public void selectLetsGoBtn() {

		letsGoBtn.click();
	}
}
