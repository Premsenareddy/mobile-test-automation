package com.appium.stepDefinitions;

import com.appium.screens.FamilyScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import java.io.IOException;

public class FamilyStepDef extends CommonUtils {
    public static final Logger log = Logger.getLogger(FamilyStepDef.class);
    FamilyScreen family = new FamilyScreen(appDriver);
    CommonUtils utils = new CommonUtils();


    @Then("^I land on Family Tab$")
    public void iLandOnFamilyTab() {
        family.iLandOnFamilyTab();
    }

    @And("^Verify Kids Card UI$")
    public void verifyKidsCardUI() throws InterruptedException {
        family.verifyKidsCardUI();
    }

    @And("^Verify Kids Card Settings UI$")
    public void verifyKidsCardSettingsUI() {
        family.verifyKidsCardSettingsUI();
    }
}