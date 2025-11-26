package com.appium.screens;

import com.appium.utils.CommonUtils;
//import com.appium.utils.requestUtil.BodyBuilder;
import com.appium.utils.requestUtil.EndPoints;
import com.appium.utils.requestUtil.HeaderUtil;
import com.appium.utils.requestUtil.RestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

public class KidzbeeScreen extends BaseScreen {


	// CONSTRUCTOR
	public KidzbeeScreen(AppiumDriver<MobileElement> appDriver) {
		super(appDriver);
	}

	CommonUtils utils = new CommonUtils();
	HeaderUtil headers = new HeaderUtil();
	RestUtil requestUtil = new RestUtil();
	//BodyBuilder bodyBuilder= new BodyBuilder();


	// ------------------PAGE FACTORY--------------------------//

	@AndroidFindBy(id = "tv_game_icon")
	public MobileElement playNowBtn;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[3]")
	public MobileElement transactionListView;

	@AndroidFindBy(id = "ti_search")
	public MobileElement searchTxt;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView")
	public  MobileElement canvasGame;

	@AndroidFindBy(id = "iv_cart")
	public MobileElement cartBtn;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
	public MobileElement exploreScreen;

	@AndroidFindBy(id = "tv_tab_earned")
	public MobileElement earnedTab;

	@AndroidFindBy(id = "tv_tab_spent")
	public MobileElement spentTab;

	@AndroidFindBy(id = "tv_tab_received")
	public MobileElement recievedTab;

	@AndroidFindBy(id="iv_aed")
	public  MobileElement aedIcon;

	@AndroidFindBy(id="iv_tp")
	public  MobileElement tpIcon;

	@AndroidFindBy(id="iv_game_back")
	public  MobileElement backBtn;

	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Banking\"]")
	public  MobileElement bankingTab;

	@AndroidFindBy(id = "cl_container")
	public MobileElement bankingContainer;

	@AndroidFindBy(id="tv_game_icon")
	public  MobileElement gameIcon;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageView[1]")
	public  MobileElement backBtnGameHome;

	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Tasks\"]")
	public MobileElement tasksTab;

	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Explore\"]")
	public MobileElement explorerTab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.view.ViewGroup/android.view.ViewGroup")
	public MobileElement taskContainer;

	//Parent and Child Transfers
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Family\"]/android.widget.ImageView")
	public  MobileElement familyTab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout[1]\n")
	public  MobileElement allChoreLink;

	@AndroidFindBy(id = "ae.ahb.digital.cit:id/tv_header")
	public MobileElement familySectionContainer;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	public MobileElement assignTasksSection;

	@AndroidFindBy(id="tvButtonText")
	public MobileElement clickAssignNewTask;

	@AndroidFindBy(id="bv_add")
	public MobileElement addNewTask;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	public MobileElement enterAssignTask;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	public MobileElement continueBtn;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")
	public MobileElement radioBtnClick;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.ImageView")
	public MobileElement radioAEDBtnClick;

	@AndroidFindBy(id="tv_title")
	public List<MobileElement> touchPointAEDRadioBtn;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.EditText")
	public MobileElement enterAmount;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
	public MobileElement clickConfirmTask;

	@AndroidFindBy(id = "tv_account_type")
	public MobileElement touchpointsTxt;

	@AndroidFindBy(id = "tv_tab_spent")
	public MobileElement spentTransTxt;

	@AndroidFindBy(id = "tv_available_balance")
	public MobileElement touchpointsBtn;

	@AndroidFindBy(id = "bv_place_order")
	public MobileElement selectPaymentMethodBtn;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> titlesTxt;


	@AndroidFindBy(id = "tv_sub_title")
	public List<MobileElement> confirmationTxtn;

	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")
	public MobileElement clickHomePage;

	@AndroidFindBy(id = "cl_parent_container")
	public List<MobileElement> spentContainer;

	@AndroidFindBy(id = "atv_transaction_title")
	public MobileElement confirmationSpentTransTxt;

	@AndroidFindBy(id = "bv_add")
	public MobileElement addCard;

	@AndroidFindBy(id = "tv_title")
	public List<MobileElement> addNewCardBtn1;

	@AndroidFindBy(id = "ivButton")
	public List<MobileElement> addNewCardBtn2;

	@AndroidFindBy(xpath = "//android.widget.RadioButton")
	public List<MobileElement> cardTypeVisaRadio;

	@AndroidFindBy(xpath = "//*[@resource-id='card_number']")
	public MobileElement cardNumberTxt;

	@AndroidFindBy(xpath = "//*[@resource-id='card_expiry_month']")
	public MobileElement cardExpiryMonthDpd;

	@AndroidFindBy(xpath = "//android.widget.CheckedTextView")
	public List<MobileElement> cardExpiryText;

	@AndroidFindBy(xpath = "//*[@resource-id='card_expiry_year']")
	public MobileElement cardExpiryYearDpd;

	@AndroidFindBy(xpath = "//*[@resource-id='card_cvn']")
	public MobileElement cardCvnTxt;

	@AndroidFindBy(className = "android.widget.Button")
	public List<MobileElement> webViewBtn;

	@AndroidFindBy(xpath = "//android.widget.Image[contains(@text,'bank logo')]")
	public List<MobileElement> bankLogo;

	@AndroidFindBy(xpath = "//*[@resource-id='password']")
	public MobileElement passwordTxt;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Submit']")
	public List<MobileElement> submitBtn;


	//Success Task Added Message
	@AndroidFindBy(xpath="//android.widget.TextView[@text= 'Task added!']")
	public MobileElement taskAddedMessage;

	@AndroidFindBy(xpath="//android.widget.TextView[@text= 'You can now check the status of your child's task']")
	public MobileElement checkTaskStatus;

	@AndroidFindBy(id = "iv_icon")
	public MobileElement taskIcon;

	// ------------------------METHODS TO ACCESS LOCATORS-------------------------------
	public void tapPlayNowBtn() {
		utils.waitUntilVisible(playNowBtn,20);
		utils.validateAndClick(playNowBtn);
	}

//	public void getAuthenticationToken()
//	{
//
//		Response res = (Response) requestUtil.postRequest(EndPoints.getLoginEndpoint(),headers.loginHeaders(),bodyBuilder.getLoginPayload("deviceId","mobileNumber","passcode"));
//
//		System.out.println(res);
//	}
	public void clickExplorerTab() throws InterruptedException{
		utils.waitUntilVisible(explorerTab,10);
		utils.validateAndClick(explorerTab);
	}

	public void VerifyExploreTab() {
		Assert.assertTrue(searchTxt.isDisplayed(), "Search TextBox is not displayed");
		Assert.assertTrue(cartBtn.isDisplayed(), "Cart Button is not displayed");
		Assert.assertTrue(exploreScreen.isDisplayed(), "Explore bottom Screen is not displayed");
	}

	public void VerifyGameView() {
		utils.waitUntilVisible(backBtnGameHome,50);
		Assert.assertTrue(backBtnGameHome.isDisplayed(), "Search TextBox is not displayed");
		Assert.assertTrue(canvasGame.isDisplayed(), "Cart Button is not displayed");
	}

	public void tapTransactionListView() throws InterruptedException {
		Set<String> contextNames = appDriver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		utils.validateAndClick(transactionListView);
	}

	public void tapEarnedTab() throws InterruptedException{
		utils.waitUntilVisible(earnedTab,20);
		utils.validateAndClick(earnedTab);
	}

	public void tapSpentTab() throws InterruptedException{
		utils.waitUntilVisible(recievedTab,20);
		utils.validateAndClick(spentTab);
	}

	public void tapRecievedTab() throws InterruptedException{
		utils.waitUntilVisible(recievedTab,20);
		utils.validateAndClick(recievedTab);
	}

	public void clickBackBtn() throws InterruptedException{
		utils.waitUntilVisible(backBtn,30);
		utils.validateAndClick(backBtn);
	}

	public void clickBankingTab() throws InterruptedException{
		utils.waitUntilVisible(bankingTab,50);
		utils.validateAndClick(bankingTab);
	}

	public void clickBankingGameIcon() throws InterruptedException{
		utils.waitUntilVisible(gameIcon,50);
		utils.validateAndClick(gameIcon);
	}

	public void  clickBackBtnGameHome() throws  InterruptedException{
		utils.waitUntilVisible(backBtnGameHome,50);
		utils.validateAndClick(backBtnGameHome);
	}

	public  void clickTasksTab() throws  InterruptedException{
		utils.waitUntilVisible(tasksTab,50);
		utils.validateAndClick(tasksTab);
	}

	//Parent anc child AED chores Transfers
	public  void clickFamilyTab() throws  InterruptedException{
		utils.waitUntilVisible(familyTab,50);
		utils.validateAndClick(familyTab);
	}

	public  void allChoresTask() throws  InterruptedException{
		utils.waitUntilVisible(allChoreLink,50);
		utils.validateAndClick(allChoreLink);
	}

	public  void clickAssignNewTask() throws  InterruptedException{
		if(addNewTask.isDisplayed()) {
			utils.waitUntilVisible(addNewTask,20);
			utils.validateAndClick(addNewTask);
		}
		else
		{
			utils.waitUntilVisible(clickAssignNewTask,20);
			utils.validateAndClick(clickAssignNewTask);
		}
	}

	public  void clickContinueButton() throws  InterruptedException{
		utils.waitUntilVisible(continueBtn,5);
		utils.validateAndClick(continueBtn);
	}

	public  void clickEnterAssignTask() throws  InterruptedException{
		utils.waitUntilVisible(enterAssignTask,5);
		utils.validateAndClick(enterAssignTask);
	}

	public  void clickRadioBtn() throws  InterruptedException{
		utils.waitUntilVisible(radioBtnClick,5);
		utils.validateAndClick(radioBtnClick);
	}

	public  void clickAEDRadioBtn() throws  InterruptedException{
		utils.waitUntilVisible(touchPointAEDRadioBtn.get(2),5);
		utils.validateAndClick(touchPointAEDRadioBtn.get(2));
	}

	public  void clickTouchPointRadioBtn() throws  InterruptedException{
		utils.waitUntilVisible(touchPointAEDRadioBtn.get(1),5);
		utils.validateAndClick(touchPointAEDRadioBtn.get(1));
	}

	public  void clickEnterAmountBox() throws  InterruptedException{
		utils.waitUntilVisible(enterAmount,5);
		utils.validateAndClick(enterAmount);
	}

	public void isTaskAddedSuccessScreenDisplayed() throws InterruptedException{
		Assert.assertTrue(taskAddedMessage.isDisplayed(), "Task Added Message is not Displayed");
		//Assert.assertTrue(checkTaskStatus.isDisplayed(), "Task Status is not displayed");
		Assert.assertTrue(taskIcon.isDisplayed(), "Task Icon is not displayed");
	}
	public  void clickConfirmAssignTask() throws  InterruptedException{

		utils.waitUntilVisible(clickConfirmTask,5);
		utils.validateAndClick(clickConfirmTask);
	}

	public void makePaymentByNwCardAED(String CardNumber, String CVN) {

		utils.waitUntilVisible(cardTypeVisaRadio.get(0), 5);
		CommonUtils.waitUntilClickable(cardTypeVisaRadio.get(0), 5);
		cardTypeVisaRadio.get(0).click();

		CommonUtils.waitUntilClickable(cardNumberTxt, 5);
		cardNumberTxt.click();
		cardNumberTxt.sendKeys(CardNumber);

		cardExpiryMonthDpd.click();
		cardExpiryText.get(3).click();

		cardExpiryYearDpd.click();
		cardExpiryText.get(3).click();

		cardCvnTxt.click();
		cardCvnTxt.sendKeys(CVN);
		appDriver.hideKeyboard();
		webViewBtn.get(1).click();

		if(bankLogo.size() >0){
			passwordTxt.sendKeys(CVN);
			submitBtn.get(0).click();
		}

		utils.waitUntilVisible(titlesTxt.get(0), 10);
		utils.waitUntilVisible(confirmationTxtn.get(0), 30);
		//Assert.assertTrue(confirmationTxtn.get(0).getText().contains("We sent a confirmation email to:"), "Order is not placed sucessfully");

	}

	public void makePaymentByTP() {
		Assert.assertTrue(touchpointsTxt.isDisplayed(), "Touchpoints");
		touchpointsBtn.click();
		selectPaymentMethodBtn.click();
		utils.waitUntilVisible(titlesTxt.get(0), 10);
		utils.waitUntilVisible(confirmationTxtn.get(0), 5);
	}

	public void clickGotoHomePage() throws  InterruptedException{
		//utils.waitUntilVisible(confirmationTxtn.get(0),20);
		utils.scrollTo("Go to homepage");
		utils.waitUntilVisible(clickHomePage,30);
		utils.validateAndClick(clickHomePage);
	}

	public void verifySpentAtMarketplace() throws  InterruptedException{
		utils.waitUntilVisible(spentTransTxt,10);
		Assert.assertTrue(spentTransTxt.isDisplayed(), "Spent");
		spentTab.click();
		utils.waitUntilVisible(spentContainer.get(0), 5);
		utils.waitUntilVisible(confirmationSpentTransTxt, 5);
		Assert.assertEquals(confirmationSpentTransTxt.getText(), "Spent at marketplace");
	}

	public void verifycontext() throws InterruptedException {
		Set<String> contextNames = appDriver.getContextHandles();
		for (String contextName : contextNames) {
			System.out.println(contextName);
		}
	}

	public void selectAddANewCard() {

		//utils.scrollTo("Add a new card");
		utils.waitUntilVisible(addCard,20);
		utils.validateAndClick(addCard);

//		if(addNewCardBtn1.size() > 0){
//			addNewCardBtn1.get(1).click();
//		}else
//		if(addNewCardBtn2.size() > 0){
//			addNewCardBtn2.get(0).click();
//		}
		utils.waitUntilVisible(titlesTxt.get(0), 20);

	}
}