package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TransactionLimits extends BaseScreen {

	// ------------------PAGE FACTORY--------------------------//
	
	// CONSTRUCTOR
		public TransactionLimits(AppiumDriver<MobileElement> appDriver) {
			super(appDriver);
		}

	CommonUtils utils = new CommonUtils();
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup")
	public MobileElement manageBeneficiarySection;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Transaction limits']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Transaction limits']")
	public MobileElement transactionLimitsMenu;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Al Hilal transfers']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Al Hilal Digital Transfer']")
	public MobileElement alHilalDigitalTransfer;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Domestic transfers']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Domestic Transfer']")
	public MobileElement domesticTransfer;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='International transfers']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='International Transfer']")
	public MobileElement internationalTransfer;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='250,000.00']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='250,000.00AED']")
	public MobileElement transfersLimitValue;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Payments']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Payments']")
	public MobileElement utilityPaymentsLimitTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Transfers']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Transfers']")
	public MobileElement transferTab;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Utility bills payments']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Utility bills payments']")
	public MobileElement utilityBillPaymentLimit;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='50,000.00']")
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='50,000.00AED']")
	public MobileElement utiityPaymentslimitValue;
	
	
	@AndroidFindBy(xpath="//android.widget.ImageButton[@content-desc='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‏‏‏‏‎‏‎‎‎‏‏‎‏‎‎‎‏‏‎‎‎‏‏‏‏‎‏‎‎‎‎‏‏‎‏‏‎‏‎‎‏‎‎‏‎‎‎‎‎‎‏‎‏‎‎‎‎‏‏‏‎‎‎‎‎Navigate up‎']")
	public MobileElement backButton;
}



	

	

		


