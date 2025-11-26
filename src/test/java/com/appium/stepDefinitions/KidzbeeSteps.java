package com.appium.stepDefinitions;

import com.appium.screens.KidzbeeScreen;
import com.appium.utils.CommonUtils;
import com.appium.utils.requestUtil.EndPoints;
import com.appium.utils.requestUtil.HeaderUtil;
import com.appium.utils.requestUtil.RestUtil;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.HashMap;

public class KidzbeeSteps extends CommonUtils {
	public static final Logger log = Logger.getLogger(KidzbeeSteps.class);
	String  accessToken;
	KidzbeeScreen playnow = new KidzbeeScreen(appDriver);
	CommonUtils utils = new CommonUtils();
	HashMap<String, String> transactionDetails = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();
	HeaderUtil headers = new HeaderUtil();
	RestUtil requestUtil = new RestUtil();




	@And("^Tap Play Now$")
	public void i_click_on_play_now() throws Throwable {
		log.info("User is able to see the Game view and click on play now button!!");
		playnow.tapPlayNowBtn();
		System.out.println("Navigate to game view");
	}

	@When("^I land on the Explore tab$")
	public void iLandOnTheExploreTab() {
		playnow.VerifyExploreTab();
		log.info("User is on Explore tab!!");
	}

	@When("^I land on the Game View$")
	public void iLandOnTheGameView() {
		playnow.VerifyGameView();
		log.info("User is on Explore tab!!");
	}

	@And("^User Clicks on transactionlistview$")
	public void user_clicks_on_transactionlistview() throws Throwable {
		playnow.tapTransactionListView();
		log.info("User is inside the game view and click on transactionListView!!");
		Thread.sleep(2000);
	}

	@And("^User Clicks on earnedTab$")
	public void user_clicks_on_earnedtab() throws Throwable{
		playnow.tapEarnedTab();
		log.info("User Click succesfully on Earned Tab in the App");
	}

	@And("^User Clicks on spentTab$")
	public void user_clicks_on_spenttab() throws Throwable{
		playnow.tapSpentTab();
		log.info("User Click succesfully on Spent Tab in tab");
	}

	@And("^User Clicks on receivedTab$")
	public void user_clicks_on_receivedTab() throws Throwable{
		playnow.tapRecievedTab();
		log.info("User Click succesfully on Received Tab in App");
	}

	@And("^I see the AED and Touchpoint Icons in the App$")
	public void i_see_the_AED_and_Touchpoint_Icons_in_the_App() throws Throwable {
		Assert.assertTrue(playnow.aedIcon.isDisplayed(), "AED Icon Is not getting displayed");
		Assert.assertTrue(playnow.tpIcon.isDisplayed(), "Touchpoint Icon Is not getting displayed");
		log.info("User is able to see the AED and Touchpoint Icon in the App");
	}

	@And("^User Clicks on back button$")
	public void user_clicks_on_back_button() throws Throwable {
		playnow.clickBackBtn();
		log.info("User clicks on back button to navigate into game view ");
	}


	//******** Verify the header Section for all the tabs **************************
	@And("^I click on Banking tab$")
	public void i_click_on_banking_tab() throws Throwable {
		playnow.clickBankingTab();
		log.info("User clicks on banking navigate in main App ");
	}

	@And("^User navigate to Banking Screen$")
	public void user_navigate_to_banking_screen() throws Throwable {
		Assert.assertTrue(playnow.bankingContainer.isDisplayed(), "Banking Tab is not getting Displayed");
		log.info("User succesfully navigates to the banking tab");
	}

	@And("^I Click on playnow in Banking header section$")
	public void i_click_on_playnow_in_header_section() throws Throwable
	{
		playnow.clickBankingGameIcon();
		log.info("After clicking on game icon in banking user lands to Gaming view");
	}

	@And("^I Click on back button in game view$")
	public  void i_click_on_back_button_in_game_view() throws  Throwable
	{
		playnow.clickBackBtnGameHome();
		log.info("Click on back button in game view to return back to home screen");
	}

	@And("^I click on explorer tab$")
	public  void i_click_on_explorer_tab() throws  Throwable
	{
		playnow.clickExplorerTab();
		log.info("User succesfully navigates to the Tasks tab");
	}

	@And("^I click on Tasks tab$")
	public  void i_click_on_tasks_tab() throws  Throwable
	{
		playnow.clickTasksTab();
		log.info("User succesfully navigates to the Tasks tab");
	}

	@And("^User navigate to Tasks Screen$")
	public void user_navigate_to_tasks_screen() throws Throwable {
		Assert.assertTrue(playnow.taskContainer.isDisplayed(), "Tasks Tab is not getting Displayed");
		log.info("User succesfully navigates to the Tasks tab");
	}

	@And("^I Click on playnow in Tasks header section$")
	public void i_click_on_playnow_in_tasks_header_section() throws Throwable
	{
		playnow.clickBankingGameIcon();
		log.info("After clicking on game icon in Tasks user lands to Gaming view");
	}

	// Scenario : Parent anc child TP and AED Transfer
	@When("^I click on family tab$")
	public void i_click_on_family_tab() throws Throwable
	{
		Thread.sleep(2000);
		playnow.clickFamilyTab();
		log.info("Navigate to parent account and click on Family Tab");
	}

	@And("^Verify Family Tab Section$")
	public void verify_family_tab_section() throws Throwable
	{
		Assert.assertTrue(playnow.familySectionContainer.isDisplayed(), "Family Tab is not getting Displayed");
		log.info("Succesfully Lands to the Family Tab ");
	}

	@And("^I Click on All Chores tasks$")
	public void i_click_on_all_chores_tasks() throws Throwable
	{
		utils.scrollTo("2,979,756");
		playnow.allChoresTask();
		log.info("Click on All chores link to transfer the tasks");
	}

	@And("^I see the assign tasks page$")
	public void i_see_the_assign_tasks_page() throws Throwable
	{
		Assert.assertTrue(playnow.assignTasksSection.isDisplayed(), "Assign Tasks is not getting Displayed");
		log.info("Succesfully Lands to the Assign Tasks Page ");
	}

	@And("^I click on Assign new task$")
	public void i_click_on_assign_new_task() throws Throwable
	{
		playnow.clickAssignNewTask();
		log.info("Click on Assign new task Button");

	}

	@When("^I enter and assign \"([^\"]*)\" and click on continue$")
	public void i_enter_and_assign_something_and_click_on_continue(String task) throws Throwable {
		playnow.clickEnterAssignTask();
		utils.validateAndSendKeys(playnow.enterAssignTask,task);
		log.info("Parent assign task to the children");
		appDriver.navigate().back();
		utils.waitUntilVisible(playnow.continueBtn,10);
		playnow.clickContinueButton();
		Thread.sleep(3000);
	}

	@And("^I enter and assign new task and click on continue$")
	public void i_enter_and_assign_new_task_and_click_on_continue() throws Throwable
	{
		playnow.clickEnterAssignTask();
		utils.validateAndSendKeys(playnow.enterAssignTask, "Task one");
		log.info("Parent assign task to the children");
		appDriver.navigate().back();
		utils.waitUntilVisible(playnow.continueBtn,10);
		playnow.clickContinueButton();
		Thread.sleep(3000);
	}

	@And("^I click on radio button$")
	public void i_click_on_radio_button() throws Throwable
	{
			playnow.clickRadioBtn();
			playnow.clickContinueButton();
			log.info("Click on radio button to choose the deadline and click on continue button");
	}

	@And("^I click on AED radio button$")
	public void i_click_on_AED_radio_button() throws Throwable
	{
		playnow.clickAEDRadioBtn();
		log.info("Click on AED Radio button");
	}

	@And("^I enter \"([^\"]*)\" and click on continue button$")
	public void i_enter_aed_and_click_on_continue_button(String aedamount) throws Throwable {
		playnow.clickEnterAmountBox();
		utils.validateAndSendKeys(playnow.enterAmount, aedamount);
		log.info("Parent assign TP and AED to the children");
		appDriver.navigate().back();
		utils.waitUntilVisible(playnow.clickConfirmTask,10);
		playnow.clickConfirmAssignTask();
		Thread.sleep(3000);
	}

//	@And("^I enter AED and click on continue button$")
//	public void i_enter_AED_and_click_on_continue_button() throws Throwable
//	{
//		playnow.clickEnterAmountBox();
//		utils.validateAndSendKeys(playnow.enterAmount, "20");
//		log.info("Parent assign TP and AED to the children");
//		appDriver.navigate().back();
//		utils.waitUntilVisible(playnow.clickConfirmTask,10);
//		playnow.clickConfirmAssignTask();
//		Thread.sleep(3000);
//	}


	@And("^I click on touchpoint radio button$")
	public void i_click_on_touchpoint_radio_button() throws Throwable
	{
		playnow.clickTouchPointRadioBtn();
		log.info("Click on TouchPoint Radio button");
	}

	@And("^I enter \"([^\"]*)\" and click continue button$")
	public void i_enter_tp_and_click_continue_button(String touchpoints) throws Throwable {
		playnow.clickEnterAmountBox();
		utils.validateAndSendKeys(playnow.enterAmount, touchpoints);
		log.info("Parent assign TP and AED to the children");
		appDriver.navigate().back();
		utils.waitUntilVisible(playnow.clickConfirmTask,10);
		playnow.clickConfirmAssignTask();
		Thread.sleep(3000);
	}

	@And("^I should see the success message once task is added$")
	public void i_should_see_the_success_message_once_task_is_added() throws Throwable {
		//appDriver.switchTo().frame();
		playnow.isTaskAddedSuccessScreenDisplayed();
	}

	@And("^I enter touchpoints and click on continue button$")
	public void i_enter_touchpoints_and_click_on_continue_button() throws Throwable
	{
		playnow.clickEnterAmountBox();
		utils.validateAndSendKeys(playnow.enterAmount, "20");
		log.info("Parent assign TP and AED to the children");
		appDriver.navigate().back();
		utils.waitUntilVisible(playnow.clickConfirmTask,10);
		playnow.clickConfirmAssignTask();
		Thread.sleep(3000);
	}

//	@And("^Login through API on Parents Account$")
//	public void loginthroughAPI() {
//
//		playnow.getAuthenticationToken();
//	}

//		Response res = restUtil.postRequest(EndPoints.getLoginEndpoint(),headerUtil.loginHeaders(),bodyBuilder.getLoginAccess("AccessToken"));

//		Response response = (Response) restUtil.postRequest(EndPoints.getLoginEndpoint(), headerUtil.loginHeaders(),
//				bodyBuilder.getLoginPayload("0567ba3e-6978-43ae-b123-5eac7e1639468205932e0f5157", "+971501820055", "d404559f602eab6fd602ac7680dacbfaadd13630335e951f097af3900e9de176b6db28512f2e000b9d04fba5133e8b1c6e8df59db3a8ab9d60be4b97cc9e81db"));
//		System.out.println(response.getBody().asString());
//		JsonPath fetchToken = response.jsonPath();
//		accessToken = fetchToken.get("token.accessToken");
//		Assert.assertEquals(restUtil.getStatusCode(response), 200);
//	}

	@And("^I add Chores through an API$")
//	public void getChores() {
//		Response response = (Response) restUtil.patchRequest(EndPoints.getChores(), headerUtil.tokenWithHeaders(accessToken),
//				bodyBuilder.getChoresPayload("PENDING", "moved to pending", "5811888"));
//		System.out.println(response);
//		System.out.println(response.getBody().asString());
//		Assert.assertEquals(restUtil.getStatusCode(response), 200);
//	}

	@And("^Make payment by TP$")
	public void make_payment_by_TP() {
		playnow.makePaymentByTP();
	}

	@And("^I Click on GotoHomepage$")
	public void i_click_on_gotohomepage() throws InterruptedException {
		playnow.clickGotoHomePage();
	}

	@And("^Verify the poduct in marketplace$")
	public void verify_the_product_in_marketplace() throws InterruptedException {
		playnow.verifySpentAtMarketplace();
	}

	@And("^verify Context$")
	public void verify_context() throws Throwable {
		playnow.verifycontext();
	}

	@And("^Add a card flow$")
	public void selectAddANewCardFlow() {
		playnow.selectAddANewCard();
	}

	@And("^Make payment by card in AED \"([^\"]*)\", \"([^\"]*)\"$")
	public void makePaymentByNwCardAED(String CardNumber, String CVN) {
		playnow.makePaymentByNwCardAED(CardNumber, CVN);
	}



}