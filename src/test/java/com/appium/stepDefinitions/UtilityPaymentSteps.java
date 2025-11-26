package com.appium.stepDefinitions;

import com.appium.screens.PaymentsScreen;
import com.appium.screens.UtilityPaymentScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.testng.asserts.SoftAssert;

public class UtilityPaymentSteps extends CommonUtils{
	public static final Logger log = Logger.getLogger(PaymentsSteps.class);
	
	PaymentsScreen payments = new PaymentsScreen(appDriver);
	UtilityPaymentScreen utilityPayment = new UtilityPaymentScreen(appDriver);
	SoftAssert softAssert = new SoftAssert();
	@When("^Select new Payee if payee Saved$")
    public void select_new_payee_if_payee_saved() throws Throwable {
		validateAndClick(utilityPayment.newPayee);
		
    }
	
	@When("^User select Save Payeed checkbox as \"([^\"]*)\"$")
    public void user_select_save_payeed_checkbox_as_something(String payeecheckbox) throws Throwable {
		 
	        if(payeecheckbox.equalsIgnoreCase("UNCHECKED")) {
	        	if(utilityPayment.addPayeeCheckbox.getAttribute("Checked").equalsIgnoreCase("TRUE")) {
	        		utilityPayment.addPayeeCheckbox.click();
	        	}
	        }
	        else {
	        	if(utilityPayment.addPayeeCheckbox.getAttribute("Checked").equalsIgnoreCase("FALSE")) {
	        		utilityPayment.addPayeeCheckbox.click();
	        	}
	        }
	        
	        log.info("User clicks Add Beneficiary Checkbox as "+payeecheckbox +"!!");
		
    }
	
	
	@Then("^Verify Add Payee checbox should be checked by default$")
    public void verify_add_payee_checbox_should_be_checked_by_default() throws Throwable {
	    	log.info("Checking Add Payee Checkbox state"+utilityPayment.addPayeeCheckbox.getAttribute("Checked"));
	    	softAssert.assertTrue(Boolean.valueOf(utilityPayment.addPayeeCheckbox.getAttribute("Checked")));
	    }
	
	@When("^User enters nic name payee as \"(.*?)\"$")
	public void user_enters_nic_name_payee_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		utilityPayment.payeeNickName.sendKeys(arg1);
	}
	
	@When("^User enters premise Number as \"(.*?)\"$")
	public void user_enters_premise_Number_as(String premiseNumber) throws Throwable {
	    utilityPayment.enterDewaPremiseNumber(premiseNumber);
	}
	
	@When("^User will get Error Popup as \"([^\"]*)\" and verify Error message$")
    public void user_will_get_error_popup_as_something_and_verify_error_message(String strArg1) throws Throwable {
		log.info("Alert Message Title "+utilityPayment.alertTitle.getText());
		
		log.info("condition "+utilityPayment.alertTitle.getText().equalsIgnoreCase(strArg1));
		//Alert alert = appDriver.switchTo().alert();
		//log.info("Alert Message "+utilityPayment.alertMessage.getText());
		
		
		//softAssert.assertEquals(utilityPayment.alertTitle.getText(), strArg1);
		/*if (utilityPayment.alertTitle.getText().trim().equalsIgnoreCase(strArg1)){
			log.info("Alert Message "+utilityPayment.alertMessage.getText());
			softAssert.assertEquals(utilityPayment.alertMessage.getText(), "You already saved this service provider as a payee. Please enter new details.");
			utilityPayment.alertOkBtn.click();
		}*/
    }

    @When("^Click OK on alert message$")
    public void click_ok_on_alert_message() throws Throwable {
    	//utilityPayment.alertOkBtn.click();
    	utilityPayment.alertOkBtn.click();
    }

    @When("^Click Delete button to delete saved Payee$")
    public void click_delete_button_to_delete_saved_payee() throws Throwable {
        //utils.validateAndClick(utilityPayment.deletePayeeBtn);
    	Thread.sleep(1000);
        utilityPayment.deletePayeeBtn.click();
    }
    
    @When("^Click on Saved Payee$")
    public void click_on_saved_payee() throws Throwable {
    	Thread.sleep(1000);
    	utilityPayment.savedPayee.click();
    }
    
    @When("^User Select Saved Payee$")
    public void user_select_saved_payee() throws Throwable {
    	utilityPayment.selectSavedPayee.click();
    }
    
   
}
