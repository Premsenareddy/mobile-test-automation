package com.appium.stepDefinitions;

import com.appium.base.BaseClass;
import com.appium.screens.DashboardScreen;
import com.appium.screens.PersonalFinanceScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalFinanceSteps extends CommonUtils {
    DashboardScreen dashboard= new DashboardScreen(appDriver);
    PersonalFinanceScreen personalFianceScreen = new PersonalFinanceScreen(appDriver);


    @When("^User clicks on Personal Finance$")
    public void user_clicks_on_personal_finance() throws Throwable {
        dashboard.verifyPersonalFinanceQuickLink();
    }

    @And("^Verify Previous loans$")
    public void previousLoans(){
        personalFianceScreen.verifyPreviousLoans();
    }

    @Then("^Verify Previous Loan Summary$")
    public void previousLoanSummary(){
        personalFianceScreen.verifyPreviousLoanSummary();
    }

    @Then("^User applies for New Finance$")
    public void user_clicks_on_apply_new_finance() {
        personalFianceScreen.applyNewFinance();
    }

    @Then("^Verify Personal Finance Eligibility Content$")
    public void verifyPersonalFinanceEligibilityContent(){
        personalFianceScreen.verifyPersonalFinanceEligibilityContent();
    }

    @And("^User clicks on Calculate Monthly Payments Button$")
    public void calculateMonthlyPaymentsButton(){

        personalFianceScreen.clickCalculateMonthlyPaymentsButton();
    }

    @Then("^Verify Calculator Screen$")
    public void verifyCalculatorScreen(){

        personalFianceScreen.verifyCalculatorScreenContent();
    }

    @And("^Verify Lead Confirmation Screen$")
    public void verifyLeadConfirmationScreen(){
        personalFianceScreen.leadCaptureConfirmation();
    }





}
