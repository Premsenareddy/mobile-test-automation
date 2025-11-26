package com.appium.stepDefinitions;

import java.util.HashMap;
import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.appium.base.BaseClass;
import com.appium.screens.BacCurrentEmploymentScreen;
import com.appium.screens.BacFatcaScreen;
import com.appium.screens.BacReviewAndVerifyScreen;
import com.appium.screens.BacTaxSelfDeclarationScreen;
import com.appium.screens.BacYourAddressScreen;
import com.appium.screens.BankOnboardingScreen;
import com.appium.screens.EmailVerificationScreen;
import com.appium.screens.ExploreScreen;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.RegistrationScreen;
import com.appium.screens.ScanYourEIDScreen;
import com.appium.screens.ScanYourPassportScreen;
import com.appium.screens.UAEPassSelectionScreen;
import com.appium.utils.ApiUtil;
import com.appium.utils.CommonUtils;
import com.appium.utils.requestUtil.RestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class RegistrationStepDef extends CommonUtils {
	public static final Logger log = Logger.getLogger(PaymentsSteps.class);
	public static String debitAmount = null;
	public static String balanceBeforePayment = null;
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	RegistrationScreen registerationScreen = new RegistrationScreen(appDriver);
	EmailVerificationScreen emailVerificationScreen = new EmailVerificationScreen(appDriver);
	ExploreScreen exploreDashboardScreen = new ExploreScreen(appDriver);
	BankOnboardingScreen bankOnboardingScreen = new BankOnboardingScreen(appDriver);
	UAEPassSelectionScreen uaePassSelection = new UAEPassSelectionScreen(appDriver);
	ScanYourPassportScreen scanYourPassportScreen = new ScanYourPassportScreen(appDriver);
	ScanYourEIDScreen scanYourEIDScreen = new ScanYourEIDScreen(appDriver);
	BacReviewAndVerifyScreen reviewAndVerifyScreen = new BacReviewAndVerifyScreen(appDriver);
	BacYourAddressScreen yourAddressScreen = new BacYourAddressScreen(appDriver);
	BacCurrentEmploymentScreen currentEmploymentScreen = new BacCurrentEmploymentScreen(appDriver);
	BacFatcaScreen fatcaScreen = new BacFatcaScreen(appDriver);
	BacTaxSelfDeclarationScreen taxSelfDeclarationScreen = new BacTaxSelfDeclarationScreen(appDriver);

	CommonUtils utils = new CommonUtils();
	ApiUtil apiUtil = new ApiUtil();
	RestUtil restUtil = new RestUtil();

	HashMap<String, String> transactionDetails = new HashMap<>();
	SoftAssert softAssert = new SoftAssert();

	Random rand = new Random();
	String email = String.format("%04d", rand.nextInt(10000));
	static String emailid;
	static String customerID;
	static String number;

	// data to be used
	String passportNumber = "S20981235";
	String firstName = "Shekhar Kapil";
	String lastName = "Kapil";
	String fullName = "Shekhar Kapil";
	String gender = "FEMALE";
	String nationality = "IN";
	String IrNationality = "AF";
	String dob = "2000-04-18";
	String expiryDate = "2028-11-22";
	int expectedStatusCode = 200;

	@When("^User Clicks on Start Exploring on Registration page$")
	public void user_clicks_on_start_exploring_on_registration_page() throws Throwable {
		registerationScreen.startExploringbtn.click();
	}

	@When("^User clicks on Skip button on Explore,shop & Earn page$")
	public void user_clicks_on_skip_button_on_exploreshop_earn_page() throws Throwable {
		registerationScreen.skipBtn.click();
	}

	@When("^User enters mobile number as \"([^\"]*)\" to register the device$")
	public void user_enters_mobile_number_as_something_to_register_the_device(String strArg1) throws Throwable {
		Random rand = new Random();
		String id = String.format("%04d", rand.nextInt(10000));
		number = strArg1 + id;
		registerationScreen.phoneNumberElement.sendKeys(number);
	}

	@When("^User click next button$")
	public void user_click_next_button() throws Throwable {
		registerationScreen.nextbtnElement.click();//
	}

	@When("^User click on next button$")
	public void user_click_on_next_button() throws Throwable {
		registerationScreen.onnextbtnElement.click();//
	}

	@When("^Enter OTP received by APIs$")
	public void enter_otp_received_by_apis() throws Throwable {

		registerationScreen.enterPasswordValueInTextFields("111111");

	}

	@When("^User Enters personal info first name as \"([^\"]*)\", Date of Birth as \"([^\"]*)\", nationality as \"([^\"]*)\", Unique Email Address as \"([^\"]*)\", Gender as \"([^\"]*)\"$")
	public void user_enters_personal_info_first_name_as_something_date_of_birth_as_something_nationality_as_something_unique_email_address_as_something_gender_as_something(
			String firstname, String dob, String nationality, String emailId, String gender) throws Throwable {

		registerationScreen.firstNametxtElement.sendKeys(firstname);

		emailid = emailId + email + "@gmail.com";

		registerationScreen.emailAddresstxtElement.sendKeys(emailid);

		registerationScreen.nationalityElement.click();
		Actions newAction = new Actions(appDriver);
		newAction.sendKeys(nationality).perform();
		Thread.sleep(3000);

		TouchAction touchAction = new TouchAction(appDriver);
		touchAction.tap(PointOption.point(65, 1240)).perform();
		appDriver.hideKeyboard();

		registerationScreen.dobtxtElement.click();
		Actions action = new Actions(appDriver);
		action.sendKeys(dob).perform();
		appDriver.hideKeyboard();
		if (gender.equalsIgnoreCase("FEMALE")) {
			registerationScreen.genderRadioBtn.get(0).click();
		} else {
			registerationScreen.genderRadioBtn.get(1).click();
		}

	}

	@When("^User accepts terms & conditions$")
	public void user_accepts_terms_conditions() throws Throwable {
		registerationScreen.termsNConditionschkbox_1.click();//
		utils.scrollAndClick(
				"I want to receive the latest offers from Al Hilal and its trusted partners via SMS and all other channels");
		registerationScreen.termsNConditionschkbox_2.click();//
		registerationScreen.clickNextButtonAfterCustomerDetails();//
	}

	@When("^User enter passcode as \"([^\"]*)\" and click next$")
	public void user_enter_passcode_as_something_and_click_next(String passcode) throws Throwable {
		registerationScreen.enterPasswordValueInTextFields(passcode);
		registerationScreen.onnextbtnElement.click();//
	}

	@When("^User confirms passcode as \"([^\"]*)\" and click next$")
	public void user_confirms_passcode_as_something_and_click_next(String passcode) throws Throwable {
		registerationScreen.enterPasswordValueInTextFields(passcode);
		waitUntilVisible(registerationScreen.onnextbtnElement, 5);
		registerationScreen.onnextbtnElement.click();//
	}

	@When("^User selects interests$")
	public void user_selects_interests() throws Throwable {

		registerationScreen.interstedElements.get(1).click();
		registerationScreen.interstedElements.get(2).click();//

	}

	@When("^User clicks on Start Exploring button$")
	public void user_clicks_on_start_exploring_button() throws Throwable {
		waitUntilVisible(registerationScreen.exploreBtn, 5);
		registerationScreen.exploreBtn.click();//
	}

	@Then("^verify \"([^\"]*)\" banner is dsiplayed on page$")
	public void verify_something_banner_is_dsiplayed_on_page(String strArg1) throws Throwable {
		Thread.sleep(4000);
		registerationScreen.doneBtn.click();//

	}

	@Then("^\"([^\"]*)\" message should be displayed$")
	public void something_message_should_be_displayed(String strArg1) throws Throwable {

	}

	@When("^I click on done button$")
	public void i_click_on_done_button() throws Throwable {
		registerationScreen.doneBtn.click();
	}

	@When("^I go to more menu tab$")
	public void i_go_to_more_menu_tab() throws Throwable {
		registerationScreen.moreMenuBtn.click();
	}

	@When("^I open account section$")
	public void i_open_account_section() throws Throwable {
		registerationScreen.accountBtn.click();
	}

	@When("^I click on user profile details section$")
	public void i_click_on_user_profile_details_section() throws Throwable {
		registerationScreen.userProfileBtn.click();
	}

	@Then("^I validate the \"([^\"]*)\" on profile section is same as provide at registration$")
	public void i_validate_the_Namekapil_on_profile_section_is_same_as_provide_at_registration(String name)
			throws Throwable {
		waitUntilVisible(registerationScreen.userNameBtn, 5);
	}

	@When("I validate the email")
	public void i_validate_the_email() {
		registerationScreen.clickContinueButton();
		waitUntilVisible(registerationScreen.openYourEmailAppBtn, 5);
		HashMap<String, String> response_body = apiUtil.getEmailToken(emailid, 200);
		Object emailObj = response_body.get("email");
		Object tokenObj = response_body.get("token");
		System.out.println(response_body);
		apiUtil.verifyEmail(emailObj.toString(), tokenObj.toString(), 200);

	}

	@When("I return back to the dashboard screen")
	public void i_return_back_to_the_dashboard_screen() {
		waitUntilVisible(emailVerificationScreen.crossIcon, 5);
		emailVerificationScreen.clickCrossIcon();
	}

	@When("I click on bank onboarding banner")
	public void i_click_on_bank_onboarding_banner() {
		exploreDashboardScreen.selectBankOnboardingBanner();
		waitUntilVisible(bankOnboardingScreen.bankingLabel, 5);
	}

	@When("I select open bank account option")
	public void i_select_open_bank_account_option() {
		bankOnboardingScreen.clickOpenBankAccount();

	}

	@Then("I verify Account options")
	public void i_verify_account_options() {
		bankOnboardingScreen.verifyPickYourAccountsScreenFirstHalfUI();
	}

	@When("^User accepts banking terms & conditions$")
	public void user_accepts_banking_terms_conditions() throws Throwable {
		bankOnboardingScreen.acceptTermsAndConditions();
		// Select lets go button
		utils.scrollToAnElementByText("Let's go");
		bankOnboardingScreen.acceptKeyFactStatements();
		// Select lets go button
		bankOnboardingScreen.selectLetsGoBtn();
	}

	@Then("^User lands on UAE Pass Selection Screen and validates the elements$")
	public void user_lands_on_uae_pass_selection_screen_and_validates_the_elements() throws Throwable {

	}

	@When("^User lands on UAE Pass Selection Screen and selects standard account option$")
	public void user_lands_on_uae_pass_selection_screen_and_selects_standard_account_option() throws Throwable {
		uaePassSelection.selectStandardOption();

	}

	@Then("^User validates passport screen details$")
	public void user_validates_passport_screen_details() throws Throwable {
		scanYourPassportScreen.verifyPassportScreenUI();

	}

	@Then("^User selects passport scanning option$")
	public void user_selects_passport_scanning_option() throws Throwable {
		scanYourPassportScreen.selectScanYourPassportBtn();
		waitUntilVisible(scanYourPassportScreen.allowPermissionsBtn, 5);
		scanYourPassportScreen.selectAllowPermissionsBtn();

	}

	@Then("^Validate passport details from backend$")
	public void validate_passport_details_from_backend() throws Throwable {
		// added random number
		customerID = apiUtil.retrieveCustomerId("+555" + number, 200);
		System.out.println("CUSTOMERID------->" + customerID);

		HashMap<String, String> response_body = apiUtil.retrieveApplicantId(customerID, "PASSPORT", 200);
		Object applicantId = response_body.get("applicantId");

		System.out.println(response_body);

		apiUtil.updatePassportRecords(applicantId.toString(), passportNumber, firstName, lastName, fullName, gender,
				nationality, dob, expiryDate, expectedStatusCode);

	}

	@Then("^Validate IR passport details from backend$")
	public void validate_IR_passport_details_from_backend() throws Throwable {
		// added random number
		customerID = apiUtil.retrieveCustomerId("+555" + number, 200);
		System.out.println("CUSTOMERID------->" + customerID);

		HashMap<String, String> response_body = apiUtil.retrieveApplicantId(customerID, "PASSPORT", 200);
		Object applicantId = response_body.get("applicantId");

		System.out.println(response_body);

		apiUtil.updatePassportRecords(applicantId.toString(), passportNumber, firstName, lastName, fullName, gender,
				IrNationality, dob, expiryDate, expectedStatusCode);

	}

	@When("^I click on your bank account is waiting banner")
	public void i_click_on_your_bank_account_is_waiting_banner() {
		waitUntilVisible(scanYourEIDScreen.yourAccountIsWaiting, 5);
		scanYourEIDScreen.selectAccountIsWaitingBtn();
		waitUntilVisible(scanYourEIDScreen.scanYourEIDTitle, 5);
	}

	@Then("^User selects EID scanning option$")
	public void user_selects_EID_scanning_option() throws Throwable {
		scanYourEIDScreen.selectScanYourEIDBtn();//

	}

	@Then("^Validate EID details from backend$")
	public void validate_EID_details_from_backend() throws Throwable {

		HashMap<String, String> response_body = apiUtil.retrieveApplicantId(customerID, "EID", 200);
		Object applicantId = response_body.get("applicantId");

		Random rand = new Random();
		String id = String.format("%04d", rand.nextInt(10000));

		apiUtil.updateEidRecords(applicantId.toString(), "784-5024-3" + id + "58-1", firstName, lastName, gender,
				nationality, dob, expiryDate, expectedStatusCode);
		Thread.sleep(10000);
	}

	@Then("^Validate IR EID details from backend$")
	public void validate_IR_EID_details_from_backend() throws Throwable {

		HashMap<String, String> response_body = apiUtil.retrieveApplicantId(customerID, "EID", 200);
		Object applicantId = response_body.get("applicantId");

		Random rand = new Random();
		String id = String.format("%04d", rand.nextInt(10000));

		apiUtil.updateEidRecords(applicantId.toString(), "784-5024-3" + id + "58-1", firstName, lastName, gender,
				IrNationality, dob, expiryDate, expectedStatusCode);
		Thread.sleep(10000);
	}

	@Then("^User validates ID verification successful message$")
	public void user_validates_id_verification_successful_message() throws Throwable {
		waitUntilVisible(mp.idVerificationSuccessfulBanner, 5);//

	}

	@When("^User clicks ID verification successful message$")
	public void user_clicks_id_verification_successful_message() throws Throwable {
		waitUntilVisible(mp.idVerificationSuccessfulBanner, 5);
		mp.selectidVerificationSuccessfulBanner();

	}

	@Then("^User validates data on review screen$")
	public void user_validates_data_on_review_screen() throws Throwable {

		waitUntilVisible(reviewAndVerifyScreen.reviewAndVerifyHeader, 5);
		reviewAndVerifyScreen.verifyBacReviewAndVerifyScreen();

	}

	@Then("^User selects continue option$")
	public void user_selects_continue_option() throws Throwable {

		utils.scrollToAnElementByText("Continue");
		reviewAndVerifyScreen.selectContinueBtn();//
		utils.validateAndAcceptAlert(appDriver);//

	}

	@When("User Enters Villa as {string},Street as {string}, city as {string} and Emirate as {string}")
	public void user_enters_villa_as_street_as_city_as_and_emirate_as(String villa, String street, String city,
			String emirate) throws InterruptedException {
		yourAddressScreen.enterVillaDetails(villa);
		yourAddressScreen.enterStreetDetails(street);
		utils.scrollToAnElementByText("Emirate");
		yourAddressScreen.selectCityFromDropDown(city);
		yourAddressScreen.selectEmirateFromDropDown(emirate);
		yourAddressScreen.selectContinueBtn();//

	}

	@When("User bypasses your address screen")
	public void user_bypasses_your_address_screen() {

		utils.scrollToAnElementByText("Emirate");
		yourAddressScreen.selectContinueBtn();

	}

	@Then("User enters {string}")
	public void user_enters(String income) throws InterruptedException {

		currentEmploymentScreen.verifyCurrentEmplooymentScreen();
		currentEmploymentScreen.selectOther();
		currentEmploymentScreen.selectSpouseDropDown();
		currentEmploymentScreen.enterIncome(income);
		currentEmploymentScreen.selectContinueBtn();//

	}

	@When("User bypasses current employment screen")
	public void user_bypasses_current_employment_screen() {

		yourAddressScreen.selectContinueBtn();

	}

	@When("User enters {string} and {string} on FATCA screen")
	public void user_enters_country_and_city_on_fatca_screen(String Country, String city) throws InterruptedException {
		fatcaScreen.verifyFatcaScreen();
		fatcaScreen.selectCountry();
		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(appDriver);
		touchAction.tap(PointOption.point(65, 1240)).perform();
		appDriver.hideKeyboard();
		fatcaScreen.enterCity(city);
		fatcaScreen.selectContinueBtn();//

	}

	@When("User bypasses fatca screen")
	public void user_bypasses_fatca_screen() {

		fatcaScreen.selectContinueBtn();
		waitUntilVisible(taxSelfDeclarationScreen.countryOfTaxResidence, 5);

	}

	@When("User enters {string} and tax identification details")
	public void user_enters_country_and_tax_identification_details(String Country) throws InterruptedException {

		taxSelfDeclarationScreen.selectCountryOfTaxResidence();

		Actions newAction = new Actions(appDriver);
		newAction.sendKeys(Country).perform();
		Thread.sleep(3000);

		@SuppressWarnings("rawtypes")
		TouchAction touchAction = new TouchAction(appDriver);
		touchAction.tap(PointOption.point(55, 950)).perform();
		appDriver.hideKeyboard();

		taxSelfDeclarationScreen.selectNoFromTaxIdentification();

	}

	@Then("Select no from tax identification")
	public void select_no_from_tax_identification() {
		taxSelfDeclarationScreen.selectNoFromReason();

	}

	@Then("User Accepts terms and conditions for tax declaration")
	public void user_accepts_terms_and_conditions_for_tax_declaration() throws InterruptedException {
		taxSelfDeclarationScreen.acceptTermsAndCondition();

		utils.scrollToAnElementByText("Submit");

		taxSelfDeclarationScreen.selectContinueBtn();//
	}

	@When("User bypasses tax declaration screen")
	public void user_bypasses_tax_declaration_screen() throws InterruptedException {

		waitUntilVisible(taxSelfDeclarationScreen.countryOfTaxResidence, 5);
		utils.scrollToAnElementByText("Submit");
		taxSelfDeclarationScreen.selectContinueBtn();//

	}

	@Given("^User confirms pin$")
	public void already_registered_customer() throws Throwable {
		mp.enterPin(BaseClass.prop.getProperty("PIN"));//

	}

	@Then("^Validate banner for IR Nationality$")
	public void validate_banner_for_IR_Nationality() throws Throwable {

		waitUntilVisible(reviewAndVerifyScreen.reviewAndVerifyHeader, 5);
		reviewAndVerifyScreen.verifyBacIRNationalityBanner();

	}

}
