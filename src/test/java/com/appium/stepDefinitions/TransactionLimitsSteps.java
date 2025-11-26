package com.appium.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.testng.Assert;
import com.appium.screens.ManageBeneficiaryScreens;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.screens.PaymentsScreen;
import com.appium.screens.TransactionLimits;
import com.appium.utils.CommonUtils;

public class TransactionLimitsSteps extends CommonUtils {
	

	public static final Logger log = Logger.getLogger(TransactionLimits.class);
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);
	ManageBeneficiaryScreens mb = new ManageBeneficiaryScreens(appDriver);
	PaymentsScreen payments = new PaymentsScreen(appDriver);
	TransactionLimits tl = new TransactionLimits(appDriver);
	
	@Then("^I see the transaction limit section on the payment home screen$")
    public void i_see_the_transaction_limit_section_on_the_payment_home_screen() throws Throwable {
        Assert.assertTrue(tl.transactionLimitsMenu.isDisplayed(), "Transaction limits menu is not displayed");
    }
	
	@And("^I see the limits for alhilal, domestic and international transfer is correct$")
    public void i_see_the_limits_for_alhilal_domestic_and_international_transfer_as_something() throws Throwable {
        Assert.assertTrue(tl.alHilalDigitalTransfer.isDisplayed(), "Al Hilal Bank Transfer option is not present");
        Assert.assertTrue(tl.domesticTransfer.isDisplayed(), "Domestic Transfer option is not present");
        Assert.assertTrue(tl.internationalTransfer.isDisplayed(), "International Transfer option is not present");
        Assert.assertTrue((tl.transfersLimitValue.isDisplayed()), "Limit displayed on the screen is not correct");
        
    }

    @And("^I click on transaction limits$")
    public void i_click_on_tranasaction_limits() throws Throwable {
       validateAndClick(tl.transactionLimitsMenu);
       
    }
    
    @Then("^I see transfers and payments tab$")
    public void i_see_transfers_and_payments_tab() throws Throwable {
    	waitUntilVisible(tl.transferTab,5);
	    Assert.assertTrue(tl.transferTab.isDisplayed(), "Transfer tab is not displayed");
        Assert.assertTrue(tl.utilityPaymentsLimitTab.isDisplayed(), "Transfer tab is not displayed");
    }
    
    @Then("^I see the limits for utility payments is correct$")
    public void i_see_the_limits_for_utility_payments_as_something() throws Throwable {
    	Assert.assertTrue(tl.utiityPaymentslimitValue.isDisplayed(), "Limit displayed on the screen is not correct");
    }
    

    @And("^I click on payment tab$")
    public void i_click_on_payment_tab() throws Throwable {
       validateAndClick(tl.utilityPaymentsLimitTab);
    }
	}