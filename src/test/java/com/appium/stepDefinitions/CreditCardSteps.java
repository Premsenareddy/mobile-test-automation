package com.appium.stepDefinitions;

import com.appium.screens.*;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;

import java.util.*;

public class CreditCardSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(CreditCardSteps.class);
    public static String debitAmount=null;
    public static String balanceBeforePayment= null;
    public static String balanceAfterPayment= null;
    public static String transferredAmountInAED=null;
    public static String netCreditedAmountInAED=null;

    MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
    PaymentsScreen payments = new PaymentsScreen(appDriver);
    TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
    ManageBeneficiaryScreens mb = new ManageBeneficiaryScreens(appDriver);
    CreditCardScreen creditCardScreen = new CreditCardScreen(appDriver);
    ExploreScreen exploreScreen = new ExploreScreen(appDriver);
    CommonUtils utils= new CommonUtils();
    HashMap<String, String> transactionDetails = new HashMap<>();
    SoftAssert softAssert = new SoftAssert();

    @And("^Validate card details (are not|are) hidden$")
    public void validateCardDetailsMasked(String strCondition) throws Throwable {
        boolean isHidden = !strCondition.toLowerCase().contains("not");

        creditCardScreen.hiddenCardNumber(isHidden);
        creditCardScreen.hiddenCardCVV(isHidden);
        creditCardScreen.hiddenCardExpiry(isHidden);
        creditCardScreen.hiddenCardExpiry(isHidden);
        creditCardScreen.chkCardName();
    }

    @Then("^User verify the validation text \"([^\"]*)\" on screen$")
    public void verifyValidationTxt(String expValidationTxt) throws Throwable{
        creditCardScreen.validateErrorTxt(expValidationTxt);
    }

    @Then("^User validate the description (.+) on screen$")
    public void verifyDescription(String strContent) throws Throwable{
        creditCardScreen.validateDescTxt(strContent);
    }

    @Then("^User validate the information \"([^\"]*)\" \"([^\"]*)\" on screen$")
    public void verifycardSettingInfo(String strTitle, String strSubTitle) throws Throwable{
        creditCardScreen.validateCardSettingTxt(strTitle,strSubTitle);
    }

    @Then("^User can see \"([^\"]*)\" label, linked amount \"([^\"]*)\" and currency \"([^\"]*)\"$")
    public void verifyLimitSectionComponents(String strLabel, String strAmount, String strCur) throws Throwable{
        creditCardScreen.validateCardLimitComponents(strLabel,strAmount,strCur);
    }

    @Then("User can see progress bar")
    public void verifyLimitSectionProgressBar() throws Throwable{
        creditCardScreen.validateCardLmtProgressBar();
    }

    @Then("^User navigates to onboard \"([^\"]*)\" screen and verify header")
    public void navigateOnboardCreditScreen(String expHeader) throws Throwable{
        creditCardScreen.validateScreenHeader(expHeader);
    }

    @Then("^User verify Card layout with card count as (\\d+) and name is \"([^\"]*)\" and detail is \"([^\"]*)\"$")
    public void userVerifyCardLayout(int crdCount,String expCardName, String expCardDetail) throws Throwable{
        creditCardScreen.validateCardLayout(crdCount,expCardName,expCardDetail);
    }

    @Then("^User verify \"([^\"]*)\" section for age is \"([^\"]*)\", and monthly income \"([^\"]*)\" and employment type is \"([^\"]*)\"$")
    public void userVerifyCardLayout(String expMinReqLbl, String expAgeReqLbl, String expIncmReqLbl,String expEmpReqLbl) throws Throwable{
        creditCardScreen.validateMinimumReq(expMinReqLbl,expAgeReqLbl,expIncmReqLbl,expEmpReqLbl);
    }

    @And("^User selects \"([^\"]*)\" from credit card screen$")
    public void selectCardType(String strCardType) throws Throwable{
        creditCardScreen.selectOnboardCardType(strCardType);
    }

    @And("User clicks on View Features")
    public void userClicksViewFeatures() throws Throwable{
        creditCardScreen.clickViewFeature();
    }

    @Then("^User navigates to feature \"([^\"]*)\" screen and verify layout")
    public void userNavigateFeatureScreen(String featureHeader) throws Throwable{
        creditCardScreen.validateFeatureScreenLayout(featureHeader);
    }

    @And("User clicks on Apply Now button on CC screen")
    public void userClickOnApplyNow() throws Throwable{
        creditCardScreen.clickOnApplyNow();
    }

    @Then("^User validates Apply Now Screen and its content \"([^\"]*)\"$")
    public void userValidateApplyNowScreen(String expStrLabels) throws Throwable{
        List<String> expLstLabels = new LinkedList();
        for(String strLabel: expStrLabels.split("%")){
            expLstLabels.add(strLabel);
        }

        creditCardScreen.validateApplyNowScreen(expLstLabels);
    }

    @And("^Scroll to \"([^\"]*)\" button$")
    public void scrollToElement(String strValue){
        exploreScreen.scrollToQuickActions(strValue);
    }

    @And("User Clicks on back button on apply now screen")
    public void userClickBack() throws Throwable{
        creditCardScreen.clickBack();
    }

    @And("^User is navigated to \"([^\"]*)\" screen, having label as \"([^\"]*)\"$")
    public void userAppRefNumScreen(String strThankYouS, String strContentThnkYou) throws Throwable{
        creditCardScreen.validateAppRefNumScreen(strThankYouS,strContentThnkYou);
    }

    @And("User clicks on back to homepage button")
    public void userClickBackHomeThnkYou() throws Throwable{
        creditCardScreen.clickBackOnHomeThankYou();
    }

    @Then("^User should see status as \"([^\"]*)\", label as \"([^\"]*)\" and button with \"([^\"]*)\" for inactive details$")
    public void userValidatesInactiveStatus(String strStatus, String strInactvLbl, String strInactvBtn) throws Throwable{
        creditCardScreen.validateInactvStatus(strStatus,strInactvLbl,strInactvBtn);
    }

    @And("User clicks on Activate your card button on credit card screen")
    public void userClickActivateCard() throws Throwable{
        creditCardScreen.clickOnActivateCard();
    }

    @Then("^User should see \"([^\"]*)\" screen with title as \"([^\"]*)\" and components$")
    public void userValidateSetCCPinScreen(String strScreenNm, String strScreenTitle) throws Throwable{
        creditCardScreen.validateCCPinScreen(strScreenNm,strScreenTitle);
    }

    @And("^User clicks on next button on set credit card Pin$")
    public void userClicksCCPinNext() throws Throwable{
        creditCardScreen.clickOnCCPinNextBtn();
    }

    @And("User waits for Card screen to populate proper")
    public void userWaitForCardLayout() throws Throwable{
        creditCardScreen.waitForCardLayout();
    }

    @And("User clicks on Past Statements")
    public void userClickPastStatement() throws Throwable{
        creditCardScreen.clickOnPastStatements();
    }

    @And("User clicks on PayNow button")
    public void userClickPayNow() throws Throwable{
        creditCardScreen.clickOnPayNow();
    }

    @Then("User validates \"([^\"]*)\" screen")
    public void userValidatesCCStatements(String expScreenTitle) throws Throwable{
        creditCardScreen.validateCCStatementScreen(expScreenTitle);
    }

    @Then("User should see statement summary details on credit card tab")
    public void userValidateStatementSummary () throws Throwable{
        creditCardScreen.validateCCStatementSummary();
    }

    @Then("^User navigates to \"([^\"]*)\" screen$")
    public void userNavigatesTo(String screnTitle) throws Throwable {
        creditCardScreen.navigateToPaymentMethod(screnTitle);
    }

    @And("User Clicks on back button on payment method screen")
    public void userClickBackPayment() throws Throwable{
        creditCardScreen.clickBack();
    }
}
