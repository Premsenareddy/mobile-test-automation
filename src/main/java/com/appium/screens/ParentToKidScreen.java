package com.appium.screens;

import com.appium.utils.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;

public class ParentToKidScreen extends BaseScreen {
	CommonUtils utils= new CommonUtils();
	// ------------------PAGE FACTORY--------------------------//
	public ParentToKidScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	@AndroidFindBy(id = "navigation_bar_item_icon_view")
	public List<MobileElement> tabs;

	@AndroidFindBy(id = "iv_user")
	public List<MobileElement> userIcon;

	@AndroidFindBy(id = "iv_balance")
	public List<MobileElement> loyaltyBalanceIcon;

	@AndroidFindBy(id = "tv_balance")
	public MobileElement loyaltyBalanceTxt;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> titleTxt;

	@AndroidFindBy(id = "tv_header")
	public MobileElement headerFamilyTxt;

	@AndroidFindBy(id = "iv_background")
	public List<MobileElement> cardImg;

	@AndroidFindBy(id = "siv_profile")
	public List<MobileElement> profilePic;

	@AndroidFindBy(id = "tv_name")
	public List<MobileElement> kidNameTxt;

	@AndroidFindBy(id = "iv_sub_balance")
	public List<MobileElement> loyaltySubBalanceIcon;

	@AndroidFindBy(id = "tv_sub_points_currency")
	public List<MobileElement> TPTxt;

	@AndroidFindBy(id = "iv_settings")
	public List<MobileElement> settingIcon;

	@AndroidFindBy(id = "tvButtonText")
	public MobileElement addAnotherChildBtn;

	@AndroidFindBy(id="ll_allchores")
	public MobileElement addTasks;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Family\"]/android.widget.ImageView")
	public MobileElement familyTab;


	//Settings
	@AndroidFindBy(id = "tv_label_title")
	public MobileElement labelTxt;
	@AndroidFindBy(id = "cl_family_set_up")
	public MobileElement familySetUp;
	@AndroidFindBy(id = "iv_setip_kids")
	public MobileElement setUpIcon;
	@AndroidFindBy(id = "tv_qr_title")
	public MobileElement qrTitleTxt;
	@AndroidFindBy(id = "tv_title")
	public MobileElement nameTitleTxt;
	@AndroidFindBy(id = "ti_value")
	public MobileElement nameValueTxt;

	@AndroidFindBy(id = "cl_mp_access")
	public MobileElement shoppingGroup;
	@AndroidFindBy(id = "tv_label_mp_access")
	public MobileElement mpAccessLabel1;
	@AndroidFindBy(id = "tv_mp_access")
	public MobileElement mpAccessSubLabel1;
	@AndroidFindBy(id = "ls_mp_access")
	public MobileElement mpAccessToggle;
	@AndroidFindBy(id = "tv_label_mp_interest_access")
	public MobileElement mpAccessLabel2;
	@AndroidFindBy(id = "iv_mp_access")
	public MobileElement mpAccessIcon;

	@AndroidFindBy(id = "cl_cd_access")
	public MobileElement viewCardGroup;
	@AndroidFindBy(id = "tv_label_cd_access")
	public MobileElement viewCardLabel;
	@AndroidFindBy(id = "ls_cd_access")
	public MobileElement viewCardToggle;

	@AndroidFindBy(id = "cl_transfer_access")
	public MobileElement moneyTransferGroup;
	@AndroidFindBy(id = "tv_label_transfer_access")
	public MobileElement moneyTransfeLabel;
	@AndroidFindBy(id = "ls_transfer_access")
	public MobileElement moneyTransferToggle;

	@AndroidFindBy(id = "cl_tel_bill_payment_access")
	public MobileElement billGroup;
	@AndroidFindBy(id = "tv_label_tel_bill_payment_access")
	public MobileElement billLabel;
	@AndroidFindBy(id = "ls_tel_bill_payment_access")
	public MobileElement billToggle;

	//Payment

	@AndroidFindBy(xpath="//android.widget.TextView")
	public List<MobileElement> searches;

	@AndroidFindBy(xpath="//android.widget.TextView[@text='Add new']")
	public MobileElement addManageBeneficiary;

	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	public MobileElement addFirstBeneficiary;

	@AndroidFindBy(id = "atmAmountEditText")
	public MobileElement amountForPayment;

	public void iLandOnTheFamilyTab() {
		// banking child
		Assert.assertTrue(tabs.get(2).isDisplayed(), "Family Tab is displayed");
		tabs.get(2).click();
	}

	public void verifyKidsCardUI() {
		Assert.assertTrue(userIcon.get(0).isDisplayed(), "User Icon is not displayed");
		Assert.assertTrue(loyaltyBalanceIcon.get(0).isDisplayed(), "loyalty Balance Icon is not displayed");
		Assert.assertTrue(loyaltyBalanceTxt.isDisplayed(), "loyalty Balance text is not displayed");
		Assert.assertTrue(headerFamilyTxt.isDisplayed(), "Family Header is not displayed");
		Assert.assertTrue(cardImg.get(0).isDisplayed(), "Kd Card is not displayed");

		Assert.assertTrue(profilePic.get(0).isDisplayed(), "Profile Pic is not displayed");
		Assert.assertTrue(kidNameTxt.get(0).isDisplayed(), "Kid Name is not displayed");
		Assert.assertTrue(loyaltySubBalanceIcon.get(0).isDisplayed(), "loyalty Balance Icon is not displayed");

		Assert.assertTrue(TPTxt.get(0).isDisplayed(), "TouchPoint Currency is not displayed");
		Assert.assertTrue(settingIcon.get(0).isDisplayed(), "Settings Icon is not displayed");

		utils.scrollTo("Add another child");
		Assert.assertTrue(addAnotherChildBtn.isDisplayed(), "Add Another child button is not displayed");
	}

	public void verifyFamilyUIAndScrolltoAllTasks() {

		Assert.assertTrue(userIcon.get(0).isDisplayed(), "User Icon is not displayed");
		Assert.assertTrue(loyaltyBalanceIcon.get(0).isDisplayed(), "loyalty Balance Icon is not displayed");
		Assert.assertTrue(loyaltyBalanceTxt.isDisplayed(), "loyalty Balance text is not displayed");
		Assert.assertTrue(headerFamilyTxt.isDisplayed(), "Family Header is not displayed");
		Assert.assertTrue(cardImg.get(0).isDisplayed(), "Kid Card is not displayed");
		Assert.assertTrue(settingIcon.get(0).isDisplayed(), "Settings Icon is not displayed");

		//Kid card
		Assert.assertTrue(profilePic.get(0).isDisplayed(), "Profile Pic is not displayed");
		Assert.assertTrue(kidNameTxt.get(0).isDisplayed(), "Kid Name is not displayed");
		Assert.assertTrue(loyaltyBalanceIcon.get(1).isDisplayed(), "loyalty Balance Icon of kid card is not displayed");

		utils.scrollTo("All tasks");
		Assert.assertTrue(addTasks.isDisplayed(), "Add Tasks Button is not displayed");
	}

	public void verifyKidsCardSettingsUI() {
		Assert.assertTrue(settingIcon.get(0).isDisplayed(), "Settings Icon is not displayed");
		settingIcon.get(0).click();
		Assert.assertTrue(labelTxt.getText().contains("Settings - "), "Settings label is incorrect");
		Assert.assertTrue(familySetUp.isDisplayed(), "Settings Set Up Box is not displayed");

		Assert.assertTrue(setUpIcon.isDisplayed(), "Set Up Icon is not displayed");
		Assert.assertTrue(qrTitleTxt.getText().equals("Generate a QR code to activate the app for your child"), "Generate a QR code to activate the app for your child is incorrect");
		Assert.assertTrue(nameTitleTxt.isDisplayed(), "name Title Text is not displayed");
		Assert.assertTrue(nameValueTxt.isDisplayed(), "name Title Box is not displayed");

		//Shopping
		Assert.assertTrue(shoppingGroup.isDisplayed(), "Marketplace Box is not displayed");
		Assert.assertTrue(mpAccessLabel1.getText().equals("Shopping"), "Shopping label is incorrect");
		//Assert.assertTrue(mpAccessSubLabel1.getText().contains("Allows your child to shop for games, electronics, and more, with money or Touchpoints"), "Shopping Sub Label is not displayed");
		Assert.assertTrue(mpAccessToggle.isDisplayed(), "Marketplace toggle is not displayed");

		Assert.assertTrue(mpAccessLabel2.getText().equals("Marketplace interests"), "Marketplace interests label is incorrect");
		Assert.assertTrue(mpAccessIcon.isDisplayed(), "Marketplace Interests Icon is not displayed");

		//View Card Details
		utils.scrollTo("Allow bill payments");
		Assert.assertTrue(viewCardGroup.isDisplayed(), "View Card Group is not displayed");
		Assert.assertTrue(viewCardLabel.getText().contains("View card details"), "View card details label is incorrect");
		Assert.assertTrue(viewCardToggle.isDisplayed(), "View card details toggle is not displayed");

		//Allow Money Transfers
		Assert.assertTrue(moneyTransferGroup.isDisplayed(), "Allow money transfers Group is not displayed");
		Assert.assertTrue(moneyTransfeLabel.getText().contains("Allow money transfers"), "Allow money transfers label is incorrect");
		Assert.assertTrue(moneyTransferToggle.isDisplayed(), "Allow money transfers Toggle is not displayed");

		//Bill Payments
		Assert.assertTrue(billGroup.isDisplayed(), "Bill Payments is not displayed");
		Assert.assertTrue(billLabel.getText().equals("Allow bill payments"), "Access to telecom bill payments label is incorrect");
		Assert.assertTrue(billToggle.isDisplayed(), "Bill Payments Toggle is not displayed");
	}

	public void addBeneficiary() throws InterruptedException {
		if(searches.size()>0) {

			utils.validateAndClick(addManageBeneficiary);
		}else {

			utils.validateAndClick(addFirstBeneficiary);
		}
	}

	public void enterAmountFrPayment(String amt) {

		//double actualamt=Double.valueOf(amt)*10;
		//System.out.print("Amount After multiply entering"+actualamt);
		//amountForPayment.sendKeys(String.valueOf(actualamt));
		amountForPayment.sendKeys(String.valueOf(amt));
	}

	public void clickAllTasksTab(){
		utils.validateAndClick(addTasks);
	}

	public  void clickFamilyTab()
	{
		utils.validateAndClick(familyTab);
	}


}