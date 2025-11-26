package com.appium.screens;

import com.appium.utils.CommonUtils;
import com.appium.utils.requestUtil.HeaderUtil;
import com.appium.utils.requestUtil.RestUtil;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static com.appium.constants.Constants.*;


public class CreditCardScreen extends BaseScreen {
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	private RestUtil restUtil = new RestUtil();
	private HeaderUtil headerUtil = new HeaderUtil();
//	private BodyBuilder bodyBuilder = new BodyBuilder();
	CommonUtils utils = new CommonUtils();
	private int pOCLimit = 0;
	private int onlineLimit = 0;
	private int aTMLimit = 0;
	private BigDecimal pocLimitIos = new BigDecimal(0.00);
	private BigDecimal onlineLimitIos = new BigDecimal(0.00);
	private BigDecimal aTMLimitIos = new BigDecimal(0.00);
	static final int WAIT_SECONDS = 30;

	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Banking']/android.widget.ImageView")
	private MobileElement bankingTab;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_card_number')]")
	private MobileElement cardNumber;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_card_cvv') and not(@text='CVV')]")
	private MobileElement cardcvv;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_card_expiry') and not(@text='Expires on')]")
	private MobileElement cardExpiry;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_card_name_holder')]")
	private MobileElement cardName;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tvErrorMessage')]")
	private MobileElement errTxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_description')]")
	private MobileElement descTxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_title') and not(contains(@text,'Unfreeze'))]")
	private MobileElement titleTxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_sub_title')]")
	private MobileElement subTitleTxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_available_credit_limit_label')]")
	private MobileElement cardLmtTotalCreditLbl;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_credit_limit')]")
	private MobileElement cardLmtTotalCreditAmt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_currency')]")
	private MobileElement cardLmtTotalCreditCur;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label_spend')]")
	private MobileElement cardLmtOutstandingCreditLbl;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_amount_spend')]")
	private MobileElement cardLmtOutstandingCreditAmt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_spend_currency')]")
	private MobileElement cardLmtOutstandingCreditCur;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label_limit')]")
	private MobileElement cardLmtAvailableCreditLbl;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_available_limit')]")
	private MobileElement cardLmtAvailableCreditAmt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_limit_currency')]")
	private MobileElement cardLmtAvailableCreditCur;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'progress_bar')]")
	private MobileElement progress_bar;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'di_credit_cards')]//*[contains(@resource-id,'dot')]")
	private List<MobileElement> cardsNav;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'bv_apply_now')]")
	private MobileElement btnApplyNow;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'ll_view_features')]")
	private MobileElement btnViewFeatures;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_minimum_requirements')]")
	private MobileElement lblMinReq;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_age_label')]/following-sibling::*[contains(@resource-id,'tv_age')]")
	private MobileElement lblAgevalue;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_age_label')]")
	private MobileElement lblAge;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_monthly_income_label')]")
	private MobileElement lblMnthlyIcm;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_monthly_income_label')]/following-sibling::*[contains(@resource-id,'tv_monthly_income')]")
	private MobileElement lblMnthlyIcmValue;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_employment_type_label')]")
	private MobileElement lblEmp;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_employment_type_label')]/following-sibling::*[contains(@resource-id,'tv_employment_type')]")
	private MobileElement lblEmpValue;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'vp_credit_cards')]//*[contains(@resource-id,'iv_card_image')]")
	private List<MobileElement> lblCardImgs;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblCardNm;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_subtitle')]")
	private MobileElement lblCardDetail;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_back')]")
	private MobileElement lblOnboardCardBck;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_header')]")
	private MobileElement lblOnboardCardHeader;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'toolbar')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblViewFeatureHeader;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_chat')]")
	private MobileElement lblOnboardCardChat;

	@AndroidFindBy(xpath = "//*[contains(@content-desc,'Navigate up')]")
	private MobileElement btnFeatureBck;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'bv_apply_now')]")
	private MobileElement btnFeatureApplyNw;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_description')]")
	private List<MobileElement> lblBenefitsDesc;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_view_charges')]")
	private MobileElement lnkViewCharges;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_title_benefits')]")
	private MobileElement lblFeatureBenefits;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'menu_item_chat')]")
	private MobileElement btnChatApplyNow;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'fcv_container')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblGreetUser;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'fcv_container')]//*[contains(@resource-id,'tv_subtitle')]")
	private MobileElement lblContentDesc;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_iban_number')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lbliBANNumber;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_iban_number')]//*[contains(@resource-id,'tv_additional_info')]")
	private MobileElement lbliBANNumber_addInfo;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_iban_number')]//*[contains(@resource-id,'ti_value')]")
	private MobileElement txtiBANNumber;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_iban_number')]//*[contains(@resource-id,'tv_prefix')]")
	private MobileElement txtiBANNumber_prefx;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_iban_number')]//*[contains(@resource-id,'separator')]")
	private MobileElement txtiBANNumber_Sprtr;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label')]")
	private MobileElement lblConsent;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_terms_and_privacy')]//*[contains(@resource-id,'cb_check')]")
	private MobileElement chkTermsPrivacy;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_terms_and_privacy')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblTermsPrivacy;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_key_facts')]//*[contains(@resource-id,'cb_check')]")
	private MobileElement chkKFS;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_key_facts')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblKFS;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_murabaha_agreement')]//*[contains(@resource-id,'cb_check')]")
	private MobileElement chkMurabahaAgree;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_murabaha_agreement')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblMurabahaAgree;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_deals')]//*[contains(@resource-id,'cb_check')]")
	private MobileElement chkUAEFTSConsent;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'cb_deals')]//*[contains(@resource-id,'tv_title')]")
	private MobileElement lblUAEFTSConsent;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'btn_accept')]")
	private MobileElement btnIAccept;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_image')]")
	private MobileElement imgThankYouScreen;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'fcv_container')]//*[contains(@resource-id,'tv_reference_number')]")
	private MobileElement lblAppRefNum;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'fcv_container')]//*[contains(@resource-id,'iv_copy')]")
	private MobileElement iconCopyRefNum;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'fcv_container')]//*[contains(@resource-id,'btn_home_page')]")
	private MobileElement btnHomePageThankYou;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_approval_label')]")
	private MobileElement lblCCInactv;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_activate_card')]")
	private MobileElement btnCCInactvCard;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_status')]")
	private MobileElement lblCCinactvStatus;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'llViews')]//*")
	private List<MobileElement> txtPinBoxes;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'iv_next_button')]")
	private MobileElement btnCCPinNxt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'vp_credit_cards')]")
	private MobileElement cardLayout;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'qac_statement')]//*[contains(@resource-id,'tv_actionTitle')]")
	private MobileElement btnPastStatement;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tic_statement')]//*[contains(@resource-id,'tv_title')]")
	private List<MobileElement> lblCCStatements;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tic_statement')]//*[contains(@resource-id,'iv_icon_end')]")
	private List<MobileElement> btndwnldCCStatements;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'lav_progress')]")
	private MobileElement icnCCLoader;

	//***** Statement Summary Locators *****//
	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_statement_issue')]")
	private MobileElement lblStatementSummary;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_statement_issue_date')]")
	private MobileElement lblStatementIssueDt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label_pay_before')]")
	private MobileElement lblStatementPyBefore;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_pay_before_date')]")
	private MobileElement lblStatementPyBeforeDt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label_payment_due')]")
	private MobileElement lblStatementPyDue;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_payment_due')]")
	private MobileElement lblStatementPyDueAmt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_due_currency')]")
	private MobileElement lblStatementPyDueCCY;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_label_statement_due')]")
	private MobileElement lblStatementDue;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_statement_due')]")
	private MobileElement lblStatementDueAmt;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'tv_statement_currency')]")
	private MobileElement lblStatementDueCCY;

	@AndroidFindBy(xpath = "//*[contains(@resource-id,'bv_pay_now')]")
	private MobileElement btnPayNow;




	//

	//Your credit card application has been received

















	//*[contains(@resource-id,'tv_title')]
	// CONSTRUCTOR
	public CreditCardScreen(AppiumDriver<MobileElement> appDriver) {

		super(appDriver);
	}

	// Tap functionality
	TouchAction touch = new TouchAction(CommonUtils.appDriver);

	// ------------------------METHODS TO ACCESS LOCATORS-------------------------------

	public void bankingTab() {
		bankingTab.click();
	}


	public void hiddenCardNumber(boolean isHidden) throws InterruptedException {
		String expBehavior = "Card Number should NOT be masked.";
		if(isHidden){
			expBehavior	= "Card Number should be masked.";
		}
		boolean isCardDetailHidden = false;

		isCardDetailHidden = cardNumber.getText().contains("*");
		Assert.assertTrue(isCardDetailHidden==isHidden, expBehavior);
	}


	public void hiddenCardCVV(boolean isHidden) throws InterruptedException {
		String expBehavior = "Card CVV should NOT be masked.";
		if(isHidden){
			expBehavior	= "Card CVV should be masked.";
		}
		boolean isCardDetailHidden = false;
		isCardDetailHidden = cardcvv.getText().contains("*");

		Assert.assertTrue(isCardDetailHidden==isHidden, expBehavior);
	}

	public void hiddenCardExpiry(boolean isHidden) throws InterruptedException {
		String expBehavior = "Card Expiry should NOT be masked.";
		if(isHidden){
			expBehavior	= "Card Expiry should be masked.";
		}
		boolean isCardDetailHidden = false;
		isCardDetailHidden = cardExpiry.getText().contains("*");

		Assert.assertTrue(isCardDetailHidden==isHidden, expBehavior);
	}

	public void chkCardName() throws InterruptedException {
		boolean isCardNameDislayed = !cardName.getText().equals("");

		Assert.assertTrue(isCardNameDislayed, "Card Name is not displayed");
	}

	public void validateErrorTxt(String expValTxt) throws InterruptedException {
		String actErrTxt = errTxt.getText();

		Assert.assertTrue(actErrTxt.equalsIgnoreCase(expValTxt), "Validation is not correct. Expected "+expValTxt+", Actual: "+actErrTxt);
	}

	public void validateDescTxt(String expDescTxt) throws InterruptedException {
		String actDescTxt = descTxt.getText().replace("\n","").trim();

		Assert.assertTrue(actDescTxt.trim().equalsIgnoreCase(expDescTxt.trim()), "Description is not correct. Expected "+expDescTxt+", Actual: "+actDescTxt);
	}

	public void validateCardSettingTxt(String expTitle, String expSubTitle) throws InterruptedException {
		String actTitleTxt = titleTxt.getText();
		String actSubTitleTxt = subTitleTxt.getText();

		Assert.assertTrue(actTitleTxt.trim().equalsIgnoreCase(expTitle.trim()), "Title is not correct. Expected "+expTitle+", Actual: "+actTitleTxt);
		Assert.assertTrue(actSubTitleTxt.trim().equalsIgnoreCase(expSubTitle.trim()), "Sub Title is not correct. Expected "+expSubTitle+", Actual: "+actSubTitleTxt);
	}

	public void validateCardLmtProgressBar() throws InterruptedException {
		String actTitleTxt = progress_bar.getText();
		utils.waitUntilVisible(progress_bar,WAIT_SECONDS);

		Assert.assertTrue(progress_bar.isDisplayed(), "Progress Bar is not displayed");
	}

	public void validateCardLimitComponents(String expLabel, String expAmt, String expCur) throws InterruptedException {
		String actLabel="", actAmt="", actCur="";
		utils.scrollTo(ALL_TRANSACTIONS_LBL);
		switch (expLabel){
			case "Total credit limit":
				actLabel = cardLmtTotalCreditLbl.getText();
				actAmt = cardLmtTotalCreditAmt.getText();
				actCur = cardLmtTotalCreditCur.getText();
				break;
			case "Outstanding balance":
				actLabel = cardLmtOutstandingCreditLbl.getText();
				actAmt = cardLmtOutstandingCreditAmt.getText();
				actCur = cardLmtOutstandingCreditCur.getText();
				break;
			case "Available limit":
				actLabel = cardLmtAvailableCreditLbl.getText();
				actAmt = cardLmtAvailableCreditAmt.getText();
				actCur = cardLmtAvailableCreditCur.getText();
				break;
		}

		Assert.assertTrue(actLabel.equalsIgnoreCase(expLabel), "Label is not correct. Expected "+expLabel+", Actual: "+actLabel);
		Assert.assertTrue(!actAmt.equals(""), "Amount is not displayed. Expected "+expAmt+", Actual: "+actAmt);
		Assert.assertTrue(actCur.equalsIgnoreCase(expCur), "Currency is not correct. Expected "+expCur+", Actual: "+actCur);
	}

	public void validateScreenHeader(String expHeader) throws InterruptedException {
		utils.waitUntilVisible(lblOnboardCardHeader,WAIT_SECONDS);
		String actHeaderTxt = lblOnboardCardHeader.getText();

		Assert.assertTrue(actHeaderTxt.equalsIgnoreCase(expHeader), expHeader+" header is not displayed");
		Assert.assertTrue(lblOnboardCardBck.isDisplayed(), " Back icon is not displayed");
		Assert.assertTrue(lblOnboardCardChat.isDisplayed(), " Chat icon is not displayed");
	}

	public void validateFeatureScreenLayout(String expHeader) throws InterruptedException {
		utils.waitUntilVisible(btnFeatureBck,WAIT_SECONDS);
		String actHeaderTxt = lblViewFeatureHeader.getText();

		List<MobileElement> lstBenefitsDesc = lblBenefitsDesc.stream().collect(Collectors.toList());
				//.filter(mobileElement -> mobileElement.getText().toLowerCase().equalsIgnoreCase(""))
		for(MobileElement ele: lstBenefitsDesc){
			Assert.assertTrue(!ele.getText().equals(""), "Benefit descriptions are not displayed");

		}

		Assert.assertTrue(actHeaderTxt.equalsIgnoreCase(expHeader), expHeader+" header is not displayed");
		Assert.assertTrue(btnFeatureBck.isDisplayed(), " Cross icon is not displayed");
		Assert.assertTrue(btnFeatureApplyNw.isDisplayed(), " Apply Now button is not displayed");
		Assert.assertTrue(lnkViewCharges.isDisplayed(), " View charges link is not displayed");
		Assert.assertTrue(lblFeatureBenefits.isDisplayed(), "Features & benefits heading is not displayed");

	}

	public void validateCardLayout(int expCardCount, String expCardName, String expCardDetail) throws InterruptedException {
		int actCardCount = cardsNav.size();
		int actCardImgCount = lblCardImgs.size();
		String actCardName =lblCardNm.getText();
		String actCardDetails = lblCardDetail.getText();

		Assert.assertTrue(actCardCount==expCardCount, "Number of cards are "+actCardCount);
		Assert.assertTrue(actCardImgCount==expCardCount, "Number of card Images are "+actCardImgCount);
		Assert.assertTrue(actCardName.equalsIgnoreCase(expCardName), "Name of card should be "+expCardName);
		Assert.assertTrue(actCardDetails.equalsIgnoreCase(expCardDetail), "Details of card should be "+expCardDetail);
		Assert.assertTrue(btnApplyNow.isDisplayed(), "Apply Now button is not displayed.");
		Assert.assertTrue(btnViewFeatures.isDisplayed(), "View features button is not displayed.");

	}

	public void validateMinimumReq(String expMinReqLbl, String expAgeReqLbl, String expIncmReqLbl,String expEmpReqLbl) throws InterruptedException {

		String actMinReqLbl =lblMinReq.getText();
		String actAgeReqLbl =lblAgevalue.getText();
		String actIncmReqLbl =lblMnthlyIcmValue.getText();
		String actEmpReqLbl = lblEmpValue.getText();

		Assert.assertTrue(actMinReqLbl.equalsIgnoreCase(expMinReqLbl), expMinReqLbl+" is not displayed");
		Assert.assertTrue(actAgeReqLbl.equalsIgnoreCase(expAgeReqLbl), "Minimum age requirement value is not correct. It should be "+expAgeReqLbl);
		Assert.assertTrue(actIncmReqLbl.equalsIgnoreCase(expIncmReqLbl), "Minimum income requirement value is not correct. It should be "+expIncmReqLbl);
		Assert.assertTrue(actEmpReqLbl.equalsIgnoreCase(expEmpReqLbl), "Employment requirement value is not correct. It should be "+expEmpReqLbl);
	}

	public void selectOnboardCardType(String cardType) throws InterruptedException {
		if(cardsNav.size()>0){
			List<MobileElement> lstCardType = cardsNav.stream()
					.filter(mobileElement -> mobileElement.getText().toLowerCase().contains(cardType.toLowerCase()))
					.collect(Collectors.toList());
			utils.waitUntilVisible(lstCardType.get(0),100);
			lstCardType.get(1).click();
		}else{
			Assert.assertTrue(cardsNav.size()==0,"Cards are not displayed");
		}
	}

	public void clickViewFeature(){
		utils.waitUntilVisible(btnViewFeatures,WAIT_SECONDS);
		btnViewFeatures.click();
	}

	public void clickBack(){
		utils.waitUntilVisible(btnFeatureBck,WAIT_SECONDS);
		btnFeatureBck.click();
	}

	public void clickBackOnHomeThankYou(){
		utils.waitUntilVisible(btnHomePageThankYou,WAIT_SECONDS);
		btnHomePageThankYou.click();
	}

	public void clickOnApplyNow(){
		utils.waitUntilVisible(btnApplyNow,WAIT_SECONDS);
		btnApplyNow.click();
	}

	public void clickOnActivateCard(){
		utils.waitUntilVisible(btnCCInactvCard,WAIT_SECONDS);
		btnCCInactvCard.click();
	}

	public void clickOnCCPinNextBtn(){
		utils.waitUntilVisible(btnCCPinNxt,WAIT_SECONDS);
		btnCCPinNxt.click();
	}

	public void clickOnPastStatements(){
		utils.waitUntilVisible(btnPastStatement,WAIT_SECONDS);
		btnPastStatement.click();
	}

	public void clickOnPayNow(){
		if(!lblStatementDue.isDisplayed()){
			utils.scrollTo("Pay now");
		}
		utils.waitUntilVisible(btnPayNow,WAIT_SECONDS);
		btnPayNow.click();
	}

	public void validateApplyNowScreen(List<String> expLabels){
		String screenName="on apply now screen.";
		utils.waitUntilVisible(lblGreetUser,WAIT_SECONDS);


		String actUserGreet =lblGreetUser.getText();
		String actContent =lblContentDesc.getText();
		String actiBANLbl =lbliBANNumber.getText();
		String actiBANAddInfo = lbliBANNumber_addInfo.getText();
		String actConsentLbl = lblConsent.getText();
		String actCCDecl = lblTermsPrivacy.getText();
		String actKFS = lblKFS.getText();
		String actMurabahaAgree = lblMurabahaAgree.getText();
		String actUAEFTSConsent = lblUAEFTSConsent.getText();

		Assert.assertTrue(btnFeatureBck.isDisplayed(),"Back button is not displayed "+screenName);
		Assert.assertTrue(btnChatApplyNow.isDisplayed(),"Chat button is not displayed "+screenName);
		Assert.assertTrue(txtiBANNumber.isEnabled(),"iBAN text box is not displayed "+screenName);
		Assert.assertTrue(actUserGreet.toLowerCase().contains(expLabels.get(0).toLowerCase()), "Greetings is not correct "+screenName+". It should be "+expLabels.get(0)+", instead of "+actUserGreet);
		Assert.assertTrue(actContent.equalsIgnoreCase(expLabels.get(1)), "Content is not correct "+screenName+". It should be "+expLabels.get(1)+", instead of "+actContent);
		Assert.assertTrue(actiBANLbl.equalsIgnoreCase("Account IBAN number"), "iBAN Label is not correct "+screenName+". It should be Account IBAN number, instead of "+actiBANLbl);
		Assert.assertTrue(actiBANAddInfo.equalsIgnoreCase(expLabels.get(2)), "iBAN Add Information is not correct "+screenName+". It should be "+expLabels.get(2)+", instead of "+actiBANAddInfo);

		//Verify iBAN Number details
		Assert.assertTrue(txtiBANNumber.isDisplayed(),"Input field for iBAN is not displayed "+screenName);
		Assert.assertTrue(txtiBANNumber_prefx.isDisplayed(),"Prefix to Input field for iBAN is not displayed "+screenName);
		Assert.assertTrue(txtiBANNumber_Sprtr.isDisplayed(),"Text separater for iBAN is not displayed "+screenName);

		Assert.assertTrue(actConsentLbl.equalsIgnoreCase(expLabels.get(3)), "Consent label is not correct "+screenName+". It should be "+expLabels.get(3)+", instead of "+actConsentLbl);

		//Verify all consents title and checkbox
		Assert.assertTrue(chkTermsPrivacy.isDisplayed(),"CC declaration check box is not displayed "+screenName);
		Assert.assertTrue(chkKFS.isDisplayed(),"KFS checkbox is not displayed "+screenName);
		Assert.assertTrue(chkMurabahaAgree.isDisplayed(),"MMA checkbox is not displayed "+screenName);
		Assert.assertTrue(chkUAEFTSConsent.isDisplayed(),"UAEFTS Checkbox is not displayed "+screenName);

		Assert.assertTrue(actCCDecl.trim().equalsIgnoreCase(expLabels.get(4).trim()), "Consent label is not correct "+screenName+". It should be "+expLabels.get(4)+", instead of "+actCCDecl);
		Assert.assertTrue(actKFS.trim().equalsIgnoreCase(expLabels.get(5).trim()), "Consent label is not correct "+screenName+". It should be "+expLabels.get(5)+", instead of "+actKFS);
		Assert.assertTrue(actMurabahaAgree.trim().equalsIgnoreCase(expLabels.get(6).trim()), "Consent label is not correct "+screenName+". It should be "+expLabels.get(6)+", instead of "+actMurabahaAgree);
		Assert.assertTrue(actUAEFTSConsent.trim().trim().replace("\n","").equalsIgnoreCase(expLabels.get(7)), "Consent label is not correct "+screenName+". It should be "+expLabels.get(7)+", instead of "+actUAEFTSConsent);
	}

	public void validateAppRefNumScreen(String expThankYouLbl, String expThankYouContent) throws InterruptedException {

		String actThankYouLbl =lblGreetUser.getText();
		String actThankYouContent =lblContentDesc.getText();
		String actRefNum =lblAppRefNum.getText().trim().split(":")[1];

		Assert.assertTrue(actThankYouLbl.equalsIgnoreCase(expThankYouLbl), "Thank you label is not correct. It should be "+expThankYouLbl+", instead of "+actThankYouLbl);
		Assert.assertTrue(actThankYouContent.equalsIgnoreCase(expThankYouContent), "Thank you content is not correct. It should be "+expThankYouContent+", instead of "+actThankYouContent);
		Assert.assertTrue(imgThankYouScreen.isDisplayed(),"Image is not displayed on Thank You screen.");
		Assert.assertTrue(!actRefNum.equals(""),"Application reference number is not generated.");
		Assert.assertTrue(iconCopyRefNum.isDisplayed(),"Copy icon is not displayed.");
		Assert.assertTrue(btnHomePageThankYou.isDisplayed(),"Back to homepage button is not displayed.");
	}

	public void validateInactvStatus(String strStatus, String strInactvLbl, String strInactvBtn ) {
		utils.waitUntilVisible(lblCCInactv,WAIT_SECONDS);

		String actStatus = lblCCinactvStatus.getText();
		String actLabel = lblCCInactv.getText();
		String actButtnTxt = btnCCInactvCard.getText();

		Assert.assertTrue(actStatus.equalsIgnoreCase(strStatus),"Status is not correct. Expected: "+strStatus+", Actual: "+actStatus);
		Assert.assertTrue(actLabel.equalsIgnoreCase(strInactvLbl),"Label is not correct. Expected: "+actLabel+", Actual: "+strInactvLbl);
		Assert.assertTrue(actButtnTxt.equalsIgnoreCase(strInactvBtn),"Text on Button is not correct. Expected: "+actButtnTxt+", Actual: "+strInactvBtn);
	}

	public void validateCCPinScreen(String strScreenNm, String strScreenTitle) {
		utils.waitUntilVisible(lblCardNm,WAIT_SECONDS);

		String actScreenNm = lblCardNm.getText();
		String actScreenTitle = lblCardDetail.getText();

		Assert.assertTrue(actScreenNm.equalsIgnoreCase(strScreenNm),"Status is not correct. Expected: "+strScreenNm+", Actual: "+actScreenNm);
		Assert.assertTrue(actScreenTitle.equalsIgnoreCase(strScreenTitle),"Label is not correct. Expected: "+strScreenTitle+", Actual: "+actScreenTitle);
		Assert.assertTrue(txtPinBoxes.size()==4,"Number of input Pin boxes are not correct,should be 4");
		Assert.assertTrue(btnCCPinNxt.isDisplayed(),"Next button on CC is not displayed.");

		for(MobileElement elePinBox: txtPinBoxes){
				elePinBox.sendKeys("1");
		}
	}

	public void waitForCardLayout(){
		utils.waitUntilVisible(cardLayout,60);
	}

	public void validateCCStatementScreen(String expScreenTitle) {
		utils.waitForNotVisible(icnCCLoader,WAIT_SECONDS);
		String actScreenTitle = lblViewFeatureHeader.getText();

		Assert.assertTrue(expScreenTitle.equalsIgnoreCase(actScreenTitle),"Status is not correct. Expected: "+expScreenTitle+", Actual: "+actScreenTitle);
		Assert.assertTrue(lblCCStatements.size()!=0,"CC Statements are not displayed");
		Assert.assertTrue(btndwnldCCStatements.size()!=0,"Download CC Statements icons are not displayed");
	}

	public void validateCCStatementSummary() {
		utils.waitForNotVisible(icnCCLoader,WAIT_SECONDS);

		String actSummayLbl = lblStatementSummary.getText();
		String actSummayIssueDt =lblStatementIssueDt.getText();
		String actPayBeforeLbl =lblStatementPyBefore.getText();
		String actPayBeforeDt =lblStatementPyBeforeDt.getText();
		String actPayDueLbl =lblStatementPyDue.getText();
		String actPayDueAmt =lblStatementPyDueAmt.getText();
		String actPayDueCcy =lblStatementPyDueCCY.getText();

		utils.scrollTo(PAYNOW_LBL);
		String actStatementDueLbl =lblStatementDue.getText();
		String actStatementDueAmt =lblStatementDueAmt.getText();
		String actStatementDueCcy =lblStatementDueCCY.getText();

		Assert.assertTrue(actSummayLbl.equalsIgnoreCase(STATEMENTISSUEDON_LBL),"Statement summary label is not correct.");
		Assert.assertTrue(actPayBeforeLbl.equalsIgnoreCase(PAYBEFORE_LBL),"Pay before label is not correct.");
		Assert.assertTrue(actPayDueLbl.equalsIgnoreCase(MINPAYMENTDUE_LBL),"Minimum payment due label is not correct.");
		Assert.assertTrue(actStatementDueLbl.equalsIgnoreCase(TOTALSTATEMENTDUE_LBL),"Total statement due amount is not correct");
		Assert.assertTrue(actPayDueCcy.equalsIgnoreCase(CCY_LBL),"CCY label as AED is not displayed");
		Assert.assertTrue(actStatementDueCcy.equalsIgnoreCase(CCY_LBL),"CCY label as AED is not displayed");

		Assert.assertTrue(!actSummayIssueDt.isEmpty(),STATEMENTDUEDATE_ISBLANK);
		Assert.assertTrue(!actPayBeforeDt.isEmpty(),PAYBEFOREDATE_ISBLANK);
		Assert.assertTrue(!actPayDueAmt.isEmpty(),MINPAYMENTDUE_ISBLANK);
		Assert.assertTrue(!actStatementDueAmt.isEmpty(),TOTALDUEAMOUNT_ISBLANK);
	}

	public void navigateToPaymentMethod(String expScreenTitle){
		utils.waitForNotVisible(icnCCLoader,WAIT_SECONDS);
		utils.waitUntilVisible(btnFeatureBck,WAIT_SECONDS);

		String actScreenTitle = lblViewFeatureHeader.getText();
		Assert.assertTrue(actScreenTitle.trim().equalsIgnoreCase(expScreenTitle),TITLE_NOT_CORRECT);
	}
}