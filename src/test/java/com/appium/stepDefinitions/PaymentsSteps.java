package com.appium.stepDefinitions;

import com.appium.base.BaseClass;
import com.appium.screens.ManageBeneficiaryScreens;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.PaymentsScreen;
import com.appium.screens.TelecomUtilityPayments;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PaymentsSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(PaymentsSteps.class);
    public static String debitAmount=null;
    public static String balanceBeforePayment= null;
    public static String balanceAfterPayment= null;
    public static String transferredAmountInAED=null;
    public static String netCreditedAmountInAED=null;

    MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
    PaymentsScreen payments = new PaymentsScreen(appDriver);
    TelecomUtilityPayments tu = new TelecomUtilityPayments(appDriver);
    ManageBeneficiaryScreens mb = new ManageBeneficiaryScreens(appDriver);
    CommonUtils utils= new CommonUtils();
    HashMap<String, String> transactionDetails = new HashMap<>();
    SoftAssert softAssert = new SoftAssert();

    @When("^I click on payments tab$")
    public void i_click_on_payments_tab() throws Throwable {
        waitUntilVisible(payments.paymentsTab,5);
        payments.tapPaymentsTab();
        log.info("User is on payments tab!!");
        Thread.sleep(2000);
    }

    @When("^User navigate to Pay bills screen$")
    public void user_navigate_to_Pay_bills_screen() throws Throwable {
        payments.tapBillPayments();
        log.info("User is on bill payments screen!!");
        Thread.sleep(2000);
    }

    @Then("^User Navigates back to payments tab$")
    public void user_Navigates_back_to_payments_tab() throws Throwable {
        payments.tapBack();
        log.info("User is on Payments home screen!!");
        Thread.sleep(2000);
    }

    @When("^User to Pay bills screen$")
    public void user_to_Pay_bills_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User navigate to Transfer money screen$")
    public void user_navigate_to_Transfer_money_screen() throws Throwable {
        payments.tapTransferMoney();
        log.info("User is on transfer money section!!");

    }

    @When("^User selects myself option to Transfer money$")
    public void user_selects_myself_option_to_Transfer_money() throws Throwable {
        payments.tapTransferMoneyMyself();
        log.info("User selects myself option!!");

    }

    @When("^User clicks on proceed to payment$")
    public void user_clicks_on_proceed_to_payment() throws Throwable {
        utils.scrollTo("Continue");
        payments.continueTransfer();
        log.info("User selects proceed to payment option!!");
        Thread.sleep(2000);
    }


    @When("^User enters amount to be transferred$")
    public void user_enters_amount_to_be_transferred() throws Throwable {
        payments.enterAmount();
        log.info("User enters amount as 50!!");
        Thread.sleep(2000);
    }
    @When("^User enters amount to be transferred on international Payment$")
    public void user_enters_amount_to_be_transferred_on_international_Payment() throws Throwable {
        //payments.enterAmount(BaseClass.prop.getProperty("Amount"));
        payments.enterAmountForPayment("15000");
        log.info("User enters amount as 150!!");
        Thread.sleep(2000);
    }
    @When("^User enters amount as \"([^\"]*)\" to be transferred on Payment$")
    public void user_enters_amount_as_something_to_be_transferred_on_payment(String strArg1) throws Throwable {
        //payments.enterAmountForPayment((strArg1+"00").toString());
        payments.enterAmountForPayment(strArg1);
        log.info("User enters amount as !!"+strArg1);
        Thread.sleep(2000);
    }

    @When("^User selects confirm amount$")
    public void user_selects_confirm_amount() throws Throwable {
        payments.tapConfirmAmount();
        log.info("User selects confirm amount button!!");

    }

    @When("^User selects Confirm and Review$")
    public void user_selects_Confirm_and_Review() {
        payments.tapConfirmAndReview();
        log.info("User selects confirm and review button!!");
    }

    @When("^User selects Confirm and Send$")
    public void user_selects_Confirm_and_Send() throws Throwable {
        utils.scrollTo("Confirm & transfer");
        payments.confirmAndSendBtn.click();
        log.info("User selects confirm and send button!!");
    }

    @Then("^The money gets tranferred from Current account to savings account$")
    public void the_money_gets_tranferred_from_Current_account_to_savings_account() throws Throwable {
        utils.waitUntilVisible(tu.transactionID, 10);
        Assert.assertTrue(tu.transactionID.isDisplayed(), "Transaction ID is not displayed and hence transaction was failed");
    }

    @And("^user selects the touchpoint option$")
    public void user_selects_the_touchpoint_option() throws Throwable {
        payments.selectTouchPointOption();
    }

    @Then("^user clicks on Done button to return back to payments tab$")
    public void user_clicks_on_Done_button_to_return_back_to_payments_tab() throws Throwable {
        payments.tapDone();
        log.info("User selects done button to return back to payments tab!!");
    }

    @When("^User selects Al Hilal Bank Digital option to Transfer money$")
    public void user_selects_Al_Hilal_Bank_Digital_option_to_Transfer_money() throws Throwable {
        payments.tapDigitalBank();
        log.info("User selects digital bank !!");
    }

    @When("^User selects a new account option to Transfer money$")
    public void user_selects_a_new_account_option_to_Transfer_money() throws Throwable {
        payments.selectNewAccount();
        log.info("User selects new account option to transfer money to bank !!");

    }

    @And("^User enters a new mobile number to Transfer money$")
    public void user_enters_a_new_mobile_number_to_Transfer_money() throws Throwable {
        utils.scrollTo("Account number");
        payments.enterPhoneNumber();
        log.info("User enters mobile number to transfer money !!");

    }


    @And("^User enters a new account number to Transfer money as \"([^\"]*)\"$")
    public void user_enters_a_new_account_number_to_Transfer_money(String accountNumber) throws Throwable {
        utils.scrollTo("Account number");
        utils.validateAndSendKeys(payments.accountNumber, accountNumber);
        log.info("User enters mobile number to transfer money !!");

        //SwipeUpDown(1349, 600, 672);
    }

    @And("^User enters a new IBAN number to Transfer money as \"([^\"]*)\"$")
    public void user_enters_a_new_IBAN_number_to_Transfer_money(String iBAN) throws Throwable {
        payments.enterIBANNumberForDomesticTransfer(iBAN);
        log.info("User enters mobile number to transfer money !!");

        //SwipeUpDown(1349, 600, 672);
    }

    @And("^User uncheck the checkbox for saving beneficiaries$")
    public void user_uncheck_the_checkbox_for_saving_beneficiaries() throws Throwable {
        payments.uncheckSavedBeneficiaryCheckbox();

    }

    @And("^User selects confirm details button$")
    public void user_selects_confirm_phone_number_details_button() throws Throwable {
        payments.confirmPhoneNumber();
        log.info("User clicks confirm button !!");
    }


    @And("^User clicks on proceed button$")
    public void user_clicks_on_proceed_button() throws Throwable {
        utils.validateAndClick(payments.proceedButton);
        log.info("User clicks confirm button !!");
    }
    @When("^User selects confirm details button again$")
    public void user_selects_confirm_details_button_again() throws Throwable {
        log.info("User is trying to click confirm details button again !!");
        //utils.scrollTo("Confirm details");
        payments.confirmDetails();
        log.info("User clicks confirm details button again !!");
    }

    @When("^User selects confirm details button on international Payment$")
    public void user_selects_confirm_details_button_on_Intrenational_Payment() throws Throwable {
        log.info("User is trying to click confirm details button again !!");
        //utils.findElementByTextonPage("Confirm details");
        utils.scrollTo("Confirm details");
        payments.confirmDetailsBtnInternationalPayment.click();
        //payments.tapConfirmDetailsOnIntrenationPaymentScreen();

        //Actions action = new Actions(driver);
        //action.sendKeys(DOB).perform();
        log.info("User clicks confirm details button again !!");
        Thread.sleep(2000);
    }
    @When("^User selects purpose from dropdown$")
    public void user_selects_purpose_from_dropdown() throws Throwable {
        waitUntilVisible(payments.purposeDropdown,5);
        payments.clickPurposeDropdown();
        //payments.purposeDropdownSelect();
        payments.selectValueFromDropDown("Family support");
        log.info("User clicks purpose drop down !!");
        Thread.sleep(2000);
    }
    @When("^User selects purpose from dropdown on payment$")
    public void user_selects_purpose_from_dropdown_on_payment() throws Throwable {
        payments.clickPurposeDropdown2();
        payments.selectValueFromDropDown("Family support");
        log.info("User clicks purpose drop down !!");
        Thread.sleep(2000);
    }

    @And("^User selects purpose from dropdown on payment as \"([^\"]*)\"$")
    public void user_selects_purpose_from_dropdown_on_payment_as_something(String strArg1) throws Throwable {
        payments.clickPurposeDropdown2();
        utils.scrollTo(strArg1);
        payments.selectValueFromDropDown(strArg1);
        log.info("User clicks purpose drop down !!");
        Thread.sleep(2000);
    }
    @When("^User enters Remarks as \"([^\"]*)\"$")
    public void user_enters_remarks_as_something(String strArg1) throws Throwable {
        payments.enterRemarks(strArg1);
    }

    @When("^User enters the pin$")
    public void user_enters_the_pin() throws Throwable {
        mp.enterPin(BaseClass.prop.getProperty("PIN"));//
        Thread.sleep(4000);
    }
    @And("^User selects Another bank option to Transfer money$")
    public void user_selects_another_bank_option_to_transfer_money() throws Throwable {
        log.info("User is trying to click Another Bank option!!");
        payments.clickAnotherBankOption();

    }

    @And("^User selects a International bank to Transfer money$")
    public void user_selects_a_international_bank_to_transfer_money() throws Throwable {
        utils.scrollTo("International bank");
        utils.validateAndClick(payments.internationalBankOption);
    }

    @And("^User selects a Domestic Bank option to Transfer money$")
    public void user_selects_a_domestic_bank_to_transfer_money() throws Throwable {
        payments.clickDomesticBankOption();
    }

    @And("^User selects a Country as \"([^\"]*)\"$")
    public void user_selects_a_country_as_something(String country) throws Throwable {
        utils.scrollTo("Type or choose from the list");
        validateAndClick(mb.countryDropDown);
        utils.validateAndSendKeys(mb.countryDropDown, country);
    }

   /* @When("^User selects a Bank Country as (.+)$")
    public void user_selects_a_bank_country_as(String Country) throws Throwable {
    	payments.clickCountryDropdown();
    	utils.scrollTo(Country);
        payments.selectCountry(Country);
    }*/

    @And("^User enters Account Number as \"([^\"]*)\"$")
    public void user_enters_account_number_as_something(String strArg1) throws Throwable {
        utils.scrollTo("Account number");
        utils.hideKeyboard();
        payments.accountNumber.click();
        //utils.findElementByTextonPage("Account number");
        payments.accountNumber.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }
    @And("^User enters IBAN Number as \"([^\"]*)\"$")
    public void user_enters_IBAN_number_as_something(String strArg1) throws Throwable {
        //utils.scrollTo("IBAN number");
        appDriver.hideKeyboard();
        //utils.findElementByTextonPage("Account number");
        payments.iBanNumber.sendKeys(strArg1);

    }

    @And("^User enters Swift Code as \"([^\"]*)\"$")
    public void user_enters_swift_code_as_something(String strArg1) throws Throwable {
        //utils.findElementByTextonPage("SWIFT code");
        utils.scrollTo("SWIFT code");
        payments.swiftCode.sendKeys(strArg1);
        appDriver.hideKeyboard();

    }

    @And("^User enters Sort Code as \"([^\"]*)\"$")
    public void user_enters_sort_code_as_something(String strArg1) throws Throwable {
        payments.sortCode.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }

    @And("^User enters Fedwire Code as \"([^\"]*)\"$")
    public void user_enters_fedwire_code_as_something(String strArg1) throws Throwable {
        payments.fedwireCode.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }

    @And("^User enters BSB Number as \"([^\"]*)\"$")
    public void user_enters_bsb_number_as_something(String strArg1) throws Throwable {
        payments.bsbNumber.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }

    @And("^User enters Transit Code as \"([^\"]*)\"$")
    public void user_enters_transit_code_as_something(String strArg1) throws Throwable {
        payments.transitCode.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }
    @And("^User enters IFSC Code as \"([^\"]*)\"$")
    public void user_enters_ifsc_code_as_something(String strArg1) throws Throwable {
        payments.ifscCode.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }
    @And("^User enters Beneficiary Address Line1 Details \"([^\"]*)\"$")
    public void user_enters_beneficiary_address_line1_details_something(String strArg1) throws Throwable {
        payments.benAddressLine1.sendKeys(strArg1);
        appDriver.hideKeyboard();
    }

    @And("^User enters Beneficiary Address Line2 Details \"([^\"]*)\"$")
    public void user_enters_beneficiary_address_line2_details_something(String strArg1) throws Throwable {
        payments.benAddressLine2.sendKeys(strArg1);
    }

    @And("^User enters Beneficiary Address City Details \"([^\"]*)\"$")
    public void user_enters_beneficiary_address_city_details_something(String strArg1) throws Throwable {
        payments.benAddressCity.sendKeys(strArg1);
    }

    @And("^User Select Beneficiary Address Country \"([^\"]*)\"$")
    public void user_select_beneficiary_address_country_something(String strArg1) throws Throwable {

        utils.scrollTo("Country");
        validateAndClick(payments.beneficiaryCountryDropDown);
        utils.validateAndSendKeys(payments.beneficiaryCountryDropDown, strArg1);


    }

    @And("^User enters Receipient Bank Details Account holder Name  \"([^\"]*)\"$")
    public void user_enters_receipient_bank_details_account_holder_name_something(String strArg1) throws Throwable {
        utils.scrollTo("As listed on their ID or trade license");
        payments.receipientName.sendKeys(strArg1);
    }

    @And("^User enters Receipient Bank Details Account holder Name for domestic transfers as \"([^\"]*)\"$")
    public void user_enters_receipient_bank_details_account_holder_name_for_domestic_transfers_as_something(String strArg1) throws Throwable {
        //utils.scrollTo("As listed on their ID or trade license");
        payments.receipientName.sendKeys(strArg1);
    }


    @And("^User selects Applicable fees paid by as \"([^\"]*)\"$")
    public void user_selects_applicable_fees_paid_by_as_something(String purppose) throws Throwable {
        payments.selectFeesPaidBy(purppose);
        log.info("User clicks applible fee paid by drop down !!");
        Thread.sleep(2000);
    }
    @Then("^Verify Add Beneficiary checbox should be checked by default$")
    public void verify_add_beneficiary_checbox_should_be_checked_by_default() throws Throwable {
        log.info("Checking Add Beneficiary Checkbox state"+payments.chkboxAddBeneficiary.getAttribute("Checked"));
        softAssert.assertTrue(Boolean.valueOf(payments.chkboxAddBeneficiary.getAttribute("Checked")));
    }
    @When("^User Select Add Beneficiary checbox as \"(.*?)\"$")
    public void user_Select_Add_Beneficiary_checbox_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Add Beneficiary Checbox state"+payments.chkboxAddBeneficiary.getAttribute("Checked"));
        if(arg1.equalsIgnoreCase("UNCHECKED")) {
            if(payments.chkboxAddBeneficiary.getAttribute("Checked").equalsIgnoreCase("TRUE")) {
                payments.chkboxAddBeneficiary.click();
            }
        }
        else {
            if(payments.chkboxAddBeneficiary.getAttribute("Checked").equalsIgnoreCase("FALSE")) {
                payments.chkboxAddBeneficiary.click();
            }
        }

        log.info("User clicks Add Beneficiary Checkbox as "+arg1 +"!!");
    }

    @When("^User enters nic name as \"(.*?)\"$")
    public void user_enters_nic_name_as(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        payments.nicName.sendKeys(arg1);
    }
    @Then("^The money gets tranferred from Current account to digital bank account$")
    public void the_money_gets_tranferred_from_Current_account_to_digital_bank_account() throws Throwable {
        utils.waitUntilVisible(tu.transactionID, 15);
        Assert.assertTrue(tu.transactionID.isDisplayed(), "Money transfer did not happen");
    }
    @And("^User enters Secondary Identification as \"([^\"]*)\" for Country \"([^\"]*)\"$")
    public void user_enters_secondary_identification_as_something_for_country_something(String bsbsortifscfedwiretransitcode, String country) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        switch (country.toUpperCase()) {
            case "CANADA":
                payments.transitCode.sendKeys(bsbsortifscfedwiretransitcode);
                break;
            case "AUSTRALIA":
                payments.bsbNumber.sendKeys(bsbsortifscfedwiretransitcode);
                break;
        /*case "IRELAND":
        	payments.sortCode.sendKeys(bsbsortifscfedwiretransitcode);
            break;
        case"GREAT BRITAIN":
        	payments.sortCode.sendKeys(bsbsortifscfedwiretransitcode);
            break;*/
            case "GREAT BRITAIN": case "IRELAND":
                payments.sortCode.sendKeys(bsbsortifscfedwiretransitcode);
                break;
            case "INDIA":
                payments.ifscCode.sendKeys(bsbsortifscfedwiretransitcode);
                break;
            case "USA":
                payments.fedwireCode.sendKeys(bsbsortifscfedwiretransitcode);
                break;
        }
    }

    @Then("^user clicks on payment Done button to return back to payments tab$")
    public void user_clicks_on_payment_Done_button_to_return_back_to_payments_tab() throws Throwable {
        payments.doneBtn();
        log.info("User clicks done button to return back to payments tab !!");
    }



    @Then("^validate Sucess screen of international Payment$")
    public void validate_Sucess_screen_of_international_Payment() throws Throwable {

        Thread.sleep(10000);
        log.info("********AHBDB-9564 user story **********");
        transferredAmountInAED=payments.transferCreditDebitAmtElements.get(0).getText();
        transferredAmountInAED=transferredAmountInAED.replace("AED", "");
        transferredAmountInAED=transferredAmountInAED.replace(",", "");
        netCreditedAmountInAED= payments.transferCreditDebitAmtElements.get(1).getText();
        netCreditedAmountInAED=netCreditedAmountInAED.replace("AED", "");
        netCreditedAmountInAED=netCreditedAmountInAED.replace(",", "");
        log.info("\n Debit Amount Value"+ payments.transferCreditDebitAmtElements.get(0).getText());
        log.info("\n Credit Amount Value"+ payments.transferCreditDebitAmtElements.get(1).getText());
        log.info("\n Debit Amount Value after modification"+ transferredAmountInAED);
        log.info("\n Credit Amount Value after modification "+ netCreditedAmountInAED);
        softAssert.assertTrue(payments.successElement.isDisplayed());
        List<String> keyswithSecondaryIdentification = Arrays.asList("Success!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Transaction ID","Account number","Purpose","Remarks","Country","Transfer to","SWIFT code","Transit code","BSB code","Sort code");
        List<String> successkeys = Arrays.asList("Success!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Transaction ID","Account number","Purpose","Remarks","Country","Transfer to","SWIFT code","Transfer from");
        List<String> successkeysWithIBan = Arrays.asList("Success!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Transaction ID","Purpose","Remarks","Country","Transfer to","IBAN number","SWIFT code","Transfer from");
        List<String> failurekeys = Arrays.asList("Failure!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Account number","Purpose","Remarks","Country","Transfer to","SWIFT code","Transfer from");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);

        utils.scrollTo("Transfer to");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);
        utils.scrollTo("Bank name");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);


        log.info("Payment Details are as follows: "+ transactionDetails);

        // System.out.println(utils.checkRequestParams(transactionDetails, keyswithSecondaryIdentification));
        log.info("Transaction Details matched with Success Fields"+utils.checkRequestParams(transactionDetails, successkeys));
        log.info("Transaction Details matched with Success Fields with IBAN"+utils.checkRequestParams(transactionDetails, successkeysWithIBan));
        log.info("Transaction Details matched with Failure Fields"+utils.checkRequestParams(transactionDetails, failurekeys));
        if(transactionDetails.get("Success!")!=null) {
            log.info("Transaction got Succeed and Transtion ID"+ transactionDetails.get("Transaction ID"));

        }
        else if(transactionDetails.get("Failure!")!=null)
        {
            log.info("Transaction got failed");
        }
        //transactionDetails.get("Success!").substring(0, 18)
        log.info(transactionDetails.get("Success!"));
        softAssert.assertTrue((transactionDetails.get("Success!").toLowerCase()).contains("transfer completed"), "Transfer completed");
        softAssert.assertAll();

    }
    @Then("^validate failure screen of international Payment$")
    public void validate_Failure_screen_of_international_Payment() throws Throwable {

        Thread.sleep(10000);
        log.info("********AHBDB- user story **********");
        transferredAmountInAED=payments.transferCreditDebitAmtElements.get(0).getText();
        transferredAmountInAED=transferredAmountInAED.replace("AED", "");
        transferredAmountInAED=transferredAmountInAED.replace(",", "");
        netCreditedAmountInAED= payments.transferCreditDebitAmtElements.get(1).getText();
        netCreditedAmountInAED=netCreditedAmountInAED.replace("AED", "");
        netCreditedAmountInAED=netCreditedAmountInAED.replace(",", "");
        log.info("\n Debit Amount Value"+ payments.transferCreditDebitAmtElements.get(0).getText());
        log.info("\n Credit Amount Value"+ payments.transferCreditDebitAmtElements.get(1).getText());
        log.info("\n Debit Amount Value after modification"+ transferredAmountInAED);
        log.info("\n Credit Amount Value after modification "+ netCreditedAmountInAED);
        //List<String> failurekeys = Arrays.asList("Transaction failure!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Account number","Purpose","Comments","Country","Transfer to","SWIFT code","Transfer from","Transit code","BSB code","Sort code");
        List<String> failurekeys = Arrays.asList("Transaction failed!", "Total debit amount", "Transfer fees","Transfer amount","Applicable fees paid by","Net credit amount","Account number","Purpose","Comments","Country","Transfer to","SWIFT code","Transfer from");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);

        utils.scrollTo("Transfer to");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);
        utils.scrollTo("Bank name");
        utils.transactionDetails(transactionDetails,payments.successPageHeaderElements,payments.successPageHeaderElementVals);


        log.info("Payment Details are as follows: "+ transactionDetails);

        log.info("Transaction Details matched with Failure Fields"+utils.checkRequestParams(transactionDetails, failurekeys));
        if(transactionDetails.get("Transaction failed!")!=null) {

            log.info("Transaction got failed");
        }

        Assert.assertNotNull(transactionDetails.get("Transaction failed!"));
        softAssert.assertTrue((transactionDetails.get("Transaction failure!").toLowerCase()).contains("Any debited amount will be credited back to your account shortly"));
        softAssert.assertAll();

    }
    @Then("^validate Amount is deducted from transferred Account when Applicable fees paid by as \"([^\"]*)\"$")
    public void validate_amount_is_deducted_from_transferred_account_when_applicable_fees_paid_by_as_something(String chargebearer)throws Throwable {


        double expectedDebitAmt = 0;
        double expectedCreditAmt=0;
        switch (chargebearer.toUpperCase()) {
            case "MYSELF": case "SHARED":
                //log.info(Integer.valueOf(transactionDetails.get("Transfer fees"))+"Transfer fees and Transafer amt"+Integer.valueOf(transactionDetails.get("Transfer amount"))+"Balance on Payment page"+ payments.balanceElement.getText());
                expectedDebitAmt= Double.valueOf(transactionDetails.get("Transfer fees")) + Double.valueOf(transferredAmountInAED);
                expectedCreditAmt=Double.valueOf(transferredAmountInAED);
                log.info("\n Entered Transferred Amount Value"+ transferredAmountInAED);
                log.info("\n Net Credit Amount Value"+ netCreditedAmountInAED);
                //Need to get actual converted amount in AED
                softAssert.assertEquals(expectedDebitAmt,Double.valueOf(transactionDetails.get("Total debit amount")));
                softAssert.assertEquals(expectedCreditAmt,Double.valueOf(netCreditedAmountInAED));
                break;

            case "BENEFICIARY":

                expectedCreditAmt= Double.valueOf(transferredAmountInAED)- Double.valueOf(transactionDetails.get("Transfer fees")) ;
                expectedDebitAmt=Double.valueOf(transferredAmountInAED);
                log.info("\n Entered Transferred Amount Value"+ transferredAmountInAED);
                log.info("\n Net Credit Amount Value"+ netCreditedAmountInAED);
                //Need to get actual converted amount in AED
                softAssert.assertEquals(expectedDebitAmt,Double.valueOf(transactionDetails.get("Total debit amount")));
                softAssert.assertEquals(expectedCreditAmt,Double.valueOf(netCreditedAmountInAED));
                break;

        }

        double expectedBalanceAmt=Double.valueOf(balanceBeforePayment)- expectedDebitAmt;

        softAssert.assertEquals(expectedBalanceAmt, Double.valueOf(balanceAfterPayment));
    }
    @Then("^verify balance is displayed correctly after payment$")
    public void verify_balance_is_displayed_correctly_after_payment() throws Throwable {

    }
    @When("^Get Balance Before Payment$")
    public void get_balance_before_payment() throws Throwable {
        balanceBeforePayment= payments.balanceElement.getText();
        balanceBeforePayment=balanceBeforePayment.replace("AED", "");
        balanceBeforePayment=balanceBeforePayment.replace(",", "");
        log.info("Balance Before payment"+balanceBeforePayment);
    }

    @When("^Get Balance After Payment$")
    public void get_balance_after_payment() throws Throwable {
        balanceAfterPayment= payments.balanceElement.getText();
        balanceAfterPayment=balanceAfterPayment.replace("AED", "");
        balanceAfterPayment=balanceAfterPayment.replace(",", "");
        log.info("Balance After payment"+balanceAfterPayment);
    }

    @Then("^Select Biller as \"([^\"]*)\"$")
    public void select_biller_as_something(String strArg1) throws Throwable {
        payments.selectBiller(strArg1);
        log.info("User is on Utility Payments home screen!!");
    }






    @When("^User selects currency as \"([^\"]*)\"$")
    public void user_selects_currency_as_something(String currency) throws Throwable {
        payments.currencyDropDown.click();
        utils.scrollTo(currency);
        //payments.selectCountry(strArg1);
        payments.selectValueFromDropDown(currency);
    }

    @When("^Verify User should not be able to do payment without mandatory details and confirm button should be disabled$")
    public void verify_user_should_not_be_able_to_do_payment_without_mandatory_details_and_confirm_button_should_be_disabled() throws Throwable {
        utils.scrollTo("Confirm details");
        log.info("Confirm Details Should be false "+payments.confirmDetailsBtnInternationalPayment.getAttribute("enabled"));
        Assert.assertFalse(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmDetailsBtnInternationalPayment, "enabled")));
        Thread.sleep(1000);
    }

    @When("^Verify User should be able to proceed for payment when all mandatory details are entered and confirm button should be enabled$")
    public void verify_user_should_be_able_to_proceed_for_payment_when_all_mandatory_details_are_entered_and_confirm_button_should_be_enabled() throws Throwable {
        utils.scrollTo("Confirm details");
        log.info("Confirm Details Should be True"+payments.confirmDetailsBtnInternationalPayment.getAttribute("enabled"));
        Assert.assertTrue(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmDetailsBtnInternationalPayment, "enabled")));
        Thread.sleep(1000);
    }
    @When("^User verify error message as \"([^\"]*)\"$")
    public void user_verify_error_message_as_something(String errmessage) throws Throwable {
        appDriver.hideKeyboard();
        log.info("Validte Error message"+errmessage + payments.validateErrorMessage(errmessage));
        Assert.assertTrue(payments.validateErrorMessage(errmessage));
    }
    @When("^User remove value from field as \"([^\"]*)\"$")
    public void user_remove_value_from_field_as_something(String fieldName) throws Throwable {
        log.info("Removing text from field"+fieldName);
        switch (fieldName.toUpperCase()) {
            case "ACCOUNT NO":
                //payments.accountNumber.click();

                //payments.accountNumber.clear();
                //payments.accountNumber.sendKeys("");
                //payments.clear2(payments.accountNumber);
                //payments.clearField(payments.accountNumber);
                payments.clear2(payments.accountNumber);
                break;

            case "IBAN":
                //payments.iBanNumber.sendKeys("");
                payments.accountNumber.clear();
                break;
        }
    }

    @When("^User verify error message as \"(.*?)\" on invalid details$")
    public void user_verify_error_message_as_on_invalid_details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        utils.findElementByTextonPage(arg1);
        //log.
        log.info("Error message 2"+utils.validateAndGetText(payments.screenErrMessagetext))	;
        int count= payments.screenErrMessage.size();
        for(int i=0;i<count;i++)
        {
            String text=payments.screenErrMessage.get(i).getText();
            System.out.print("Title value\n"+text);

            if(text.equalsIgnoreCase("Error"))
            {
                log.info("Error message exist");

            }

        }
        log.info("Error message 2"+utils.validateAndGetText(payments.screenErrMessagetext));
    }

    @When("^Verify User should not be able to do payment without mandatory or invalid details and \"(.*?)\" button should be disabled$")
    public void verify_User_should_not_be_able_to_do_payment_without_mandatory_invalid_details_and_button_should_be_disabled(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        switch (arg1.toUpperCase()) {
            case "CONFIRM AMOUNT":
                utils.scrollTo("Confirm amount");
                log.info("Confirm Amount Should be False"+payments.confirmAmtBtn.getAttribute("enabled"));
                Assert.assertFalse(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmAmtBtn, "enabled")));
                Thread.sleep(1000);
                break;

            case "CONFIRM & REVIEW":
                utils.scrollTo("Confirm & review");
                log.info("Confirm & Review Should be False"+payments.confirmAndReview.getAttribute("enabled"));
                Assert.assertFalse(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmAndReview, "enabled")));
                Thread.sleep(1000);
                break;

            case "CONFIRM & SEND":
                utils.scrollTo("Confirm & send");
                log.info("Confirm & send Should be False"+payments.confirmAndSendBtn.getAttribute("enabled"));
                Assert.assertFalse(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmAndSendBtn, "enabled")));
                Thread.sleep(1000);
                break;

            case "CONFIRM DETAILS":

                utils.scrollTo("Confirm details");
                log.info("Confirm Details Should be False"+payments.confirmDetailsBtnInternationalPayment.getAttribute("enabled"));
                Assert.assertFalse(Boolean.valueOf(utils.validateAndGetAttribute(payments.confirmDetailsBtnInternationalPayment, "enabled")));
                Thread.sleep(1000);
                break;


        }
    }

    @When("^User enters amount more than available balance on Payment$")
    public void user_enters_amount_more_than_available_balance_on_Payment() throws Throwable {
        Thread.sleep(1000);
        // Write code here that turns the phrase above into concrete actions
		/*log.info(payments.exchange_rate.getText().toString());
		log.info(payments.exchange_rate.getText().substring(22).toString());
		log.info(payments.exchange_rate.getText().substring(22).replace("AED", ""));
		log.info(payments.exchange_rate.getText().substring(22).replace("AED", ""));*/
        log.info(utils.validateAndGetText(payments.exchange_rate));
        log.info(utils.validateAndGetText(payments.exchange_rate).substring(22));
        log.info((utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", ""));
        String exchange_rate=(utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", "");
        //String exchange_rate=payments.exchange_rate.getText().substring(22).replace("AED", "");
		/*log.info("Balance Before payment +1 is "+String.valueOf(Double.valueOf(balanceBeforePayment)+Double.valueOf(1)));
		log.info("Balance Before payment +1 is "+String.valueOf(Double.valueOf(balanceBeforePayment)+1));
		log.info("Balance Before payment +1 is "+String.valueOf((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate)));
		log.info("Balance Before payment +1 is "+String.valueOf(Math.round((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate))));*/
        //double AmountInOtherCurrency= Math.round((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate));
        double AmountInOtherCurrency= (Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate);
        BigDecimal bigDecimal = new BigDecimal(AmountInOtherCurrency);
        BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        log.info("Rounded value with setting scale = "+roundedWithScale);

        double roundTwoDec=Math.round(AmountInOtherCurrency);
        payments.enterAmountForPayment(String.valueOf(roundedWithScale));
    }

    @When("^User enters amount as available balance on Payment$")
    public void user_enters_amount_as_available_balance_on_Payment() throws Throwable {
        Thread.sleep(1000);
        // Write code here that turns the phrase above into concrete actions
		/*log.info(payments.exchange_rate.getText().toString());
		log.info(payments.exchange_rate.getText().substring(22).toString());
		log.info(payments.exchange_rate.getText().substring(22).replace("AED", ""));
		log.info(payments.exchange_rate.getText().substring(22).replace("AED", ""));*/
        log.info(utils.validateAndGetText(payments.exchange_rate));
        log.info(utils.validateAndGetText(payments.exchange_rate).substring(22));
        log.info((utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", ""));
        String exchange_rate=(utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", "");
        //String exchange_rate=payments.exchange_rate.getText().substring(22).replace("AED", "");
		/*log.info("Balance Before payment +1 is "+String.valueOf(Double.valueOf(balanceBeforePayment)+Double.valueOf(1)));
		log.info("Balance Before payment +1 is "+String.valueOf(Double.valueOf(balanceBeforePayment)+1));
		log.info("Balance Before payment +1 is "+String.valueOf((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate)));
		log.info("Balance Before payment +1 is "+String.valueOf(Math.round((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate))));*/
        //double AmountInOtherCurrency= Math.round((Double.valueOf(balanceBeforePayment)+1)/Double.valueOf(exchange_rate));
        double AmountInOtherCurrency= (Double.valueOf(balanceBeforePayment))/Double.valueOf(exchange_rate);
        BigDecimal bigDecimal = new BigDecimal(AmountInOtherCurrency);

        //BigDecimal roundedWithScale2 = bigDecimal.setScale(2, BigDecimal.ROUND_FLOOR);
        BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_FLOOR);


        double roundTwoDec=Math.round(AmountInOtherCurrency);
        log.info("Rounded value with setting scale with floor= "+roundedWithScale);
        log.info("Rounded value with two decimals = "+roundTwoDec);
        log.info("Rounded value with two decimals with down = "+bigDecimal.setScale(2, BigDecimal.ROUND_DOWN));
        payments.enterAmountForPayment(String.valueOf(roundedWithScale));
    }
    @When("^User enters amount as \"([^\"]*)\" to be transferred on Payment in AED$")
    public void user_enters_amount_as_something_to_be_transferred_on_payment_in_aed(String amount) throws Throwable {

        log.info(utils.validateAndGetText(payments.exchange_rate));
        log.info(utils.validateAndGetText(payments.exchange_rate).substring(22));
        log.info((utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", ""));
        String exchange_rate=(utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", "");
        log.info("Amount Value"+amount);
        double AmountInOtherCurrency= Double.valueOf(amount)/ Double.valueOf(exchange_rate);
        BigDecimal bigDecimal = new BigDecimal(AmountInOtherCurrency);

        // BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);

        BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_FLOOR);

        log.info("Rounded value with setting scale = "+roundedWithScale);
        payments.enterAmountForPayment(String.valueOf(roundedWithScale));

        //Exchange rate: 1 AUD = 2.751260 AED
    }

    @And("^User enters amount available balance minus bearer charges to be transferred on Payment for \"([^\"]*)\"$")
    public void user_enters_amount_available_balance_minus_bearer_charges_to_be_transferred_on_payment_for_something(String chargebearer) throws Throwable {

        log.info(utils.validateAndGetText(payments.exchange_rate));
        log.info(utils.validateAndGetText(payments.exchange_rate).substring(22));
        log.info((utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", ""));
        String exchange_rate=(utils.validateAndGetText(payments.exchange_rate).substring(22)).replace("AED", "");
        //double AmountInOtherCurrency= (Double.valueOf(balanceBeforePayment)-Double.valueOf(chargebearer))/Double.valueOf(exchange_rate);
        double AmountInOtherCurrency= (Double.valueOf(balanceBeforePayment)-Double.valueOf(chargebearer))/Double.valueOf(exchange_rate);
        BigDecimal bigDecimal = new BigDecimal(AmountInOtherCurrency);
        BigDecimal roundedWithScale = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        log.info("Rounded value with setting scale = "+roundedWithScale);

        double roundTwoDec=Math.round(AmountInOtherCurrency);
        payments.enterAmountForPayment(String.valueOf(roundedWithScale));
    }

    @And("^I click on DEWA$")
    public void iClickOnDEWA() {
        payments.clickDEWA();
    }

    @And("User selects Confirm and pay")
    public void userSelectsConfirmAndPay() {
        tu.clickConfirmAndPay();
    }
}
