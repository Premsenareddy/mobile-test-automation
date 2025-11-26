package com.appium.stepDefinitions;

import com.appium.screens.ParentToKidScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class ParentToKidSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(ParentToKidSteps.class);
    ParentToKidScreen parentKid= new ParentToKidScreen(appDriver);
    CommonUtils utils = new CommonUtils();


    @Then("^I land on the Family Tab$")
    public void iLandOnTheFamilyTab() {
        parentKid.iLandOnTheFamilyTab();
    }

    @And("^Verify Kid Card UI$")
    public void verifyKidCardUI() {
        parentKid.verifyKidsCardUI();
    }

    @And("^I Click On Family Tab$")
    public void iClickOnFamilyTab()
    {
        parentKid.clickFamilyTab();
    }

    @And("^Verify Family Tab UI$")
    public void verifyFamilyTabUI()
    {
        parentKid.verifyFamilyUIAndScrolltoAllTasks();
    }



    @And("^Verify Kid Card Settings UI$")
    public void verifyKidCardSettingsUI() {
        parentKid.verifyKidsCardSettingsUI();
    }

    @And("^I click on add a beneficiary button$")
    public void I_click_on_add_a_beneficiary_button() throws Throwable {
        //utils.validateAndClick(mb.addBeneficiary);
        parentKid.addBeneficiary();
        log.info("User can see option to add beneficiary for AHB and Other");

    }

    @And("^I Click on All Tasks Button$")
    public void iClickonAllTasksButton() throws Throwable {
        parentKid.clickAllTasksTab();
        log.info("User is able to scroll to all tasks button and click on add tasks button");

    }


    @And("^User enters \"([^\"]*)\" to be transferred$")
    public void user_enters_something_to_be_transferred(String amount) throws Throwable {

        utils.validateAndSendKeys(parentKid.amountForPayment, amount);
        log.info("User enters amount as !!");
    }


}