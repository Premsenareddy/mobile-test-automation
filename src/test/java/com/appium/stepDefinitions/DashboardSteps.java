package com.appium.stepDefinitions;

import com.appium.screens.DashboardScreen;

import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class DashboardSteps extends CommonUtils {

    public static final Logger log = Logger.getLogger(ExploreSteps.class);
    DashboardScreen dashboard= new DashboardScreen(appDriver);
    @When("Verify Explore Screen Banner")
    public void verifyExploreScreenBanner() {
        dashboard.verifyExploreScreenBanner();
    }

    @When("^Verify Explore Screen UI$")
    public void verifyExploreScreenUI() {
        dashboard.verifyExploreScreenUI();
    }

    @When("^I land on Explore tab$")
    public void iLandOnExploreTab() {
        dashboard.iLandOnExploreTab();
    }

    @When("^I navigate on \"([^\"]*)\" category$")
    public void iNavigateOnCategory(String category) throws Throwable {
        dashboard.iNavigateOnCategory(category);
    }

    @Then("^Verify Brand Logos on Explore \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",$")
    public void verifyBrandLogosOnExplore(String logo1, String logo2, String logo3, String logo4, String logo5, String logo6, String logo7, String logo8) throws Throwable {
        dashboard.verifyBrandLogosOnExplore(logo1,logo2,logo3,logo4,logo5,logo6,logo7,logo8);
    }
    @When("I scroll to Special Offers UI")
    public void iScrollToSpecialOffersUI() {
        dashboard.iScrollToSpecialOffersUI();
    }

    @Then("Verify Special Offers screen UI")
    public void verifySpecialOffersScreenUI() {
        dashboard.verifySpecialOffersScreenUI();
    }

    @And("Verify Special Offers sub Category screen UI")
    public void verifySpecialOffersSubCategoryScreenUI() {
        dashboard.verifySpecialOffersSubCategoryScreenUI();
    }


    @And("^Verify Food sub Category bottom sheet screen UI$")
    public void verifyFoodSubCategoryBottomSheetScreenUI() {
        dashboard.verifyFoodSubCategoryBottomSheetScreenUI();
    }

    @Then("Verify Activities {string} sub Category screen {string}")
    public void verifyActivitiesSubCategoryScreen(String category, String title) {
        dashboard.verifyActivitiesSubCategoryScreen(category, title);
    }

    @And("^Verify Activities sub Category bottom sheet screen UI$")
    public void verifyActivitiesSubCategoryBottomSheetScreenUI() {
        dashboard.verifyActivitiesSubCategoryBottomSheetScreenUI();
    }

    @Then("Verify Food {string} sub Category screen {string}")
    public void verifyFoodSubCategoryScreen(String category, String title) {
        dashboard.verifyFoodSubCategoryScreen(category, title);
    }

    @And("^Click on back Button on Category$")
    public void clickOnBackButtonOnCategory() {
        dashboard.clickOnBackButtonOnCategory();
    }

    @Then("Verify Family {string} sub Category screen {string}")
    public void verifyFamilySubCategoryScreen(String category, String title) {
        dashboard.verifyFamilySubCategoryScreen(category, title);
    }

    @And("^Verify Family sub Category bottom sheet screen UI$")
    public void verifyFamilySubCategoryBottomSheetScreenUI() {
        dashboard.verifyFamilySubCategoryBottomSheetScreenUI();
    }

    @Then("Verify Wellness {string} sub Category screen {string}")
    public void verifyWellnessSubCategoryScreen(String category, String title) {
        dashboard.verifyWellnessSubCategoryScreen(category, title);
    }

    @And("^Verify Wellness sub Category bottom sheet screen UI$")
    public void verifyWellnessSubCategoryBottomSheetScreenUI() {
        dashboard.verifyWellnessSubCategoryBottomSheetScreenUI();
    }


    @Then("Verify Groceries {string} sub Category screen {string}")
    public void verifyGroceriesSubCategoryScreen(String category, String title) {
        dashboard.verifyGroceriesSubCategoryScreen(category, title);
    }

    @And("^Verify Groceries sub Category bottom sheet screen UI$")
    public void verifyGroceriesSubCategoryBottomSheetScreenUI() {
        dashboard.verifyGroceriesSubCategoryBottomSheetScreenUI();
    }

    @Then("Verify Travel {string} sub Category screen {string}")
    public void verifyTravelSubCategoryScreen(String category, String title) {
        dashboard.verifyTravelSubCategoryScreen(category, title);
    }

    @And("^Verify Travel sub Category bottom sheet screen UI$")
    public void verifyTravelSubCategoryBottomSheetScreenUI() {
        dashboard.verifyTravelSubCategoryBottomSheetScreenUI();
    }

    @And("Click on suggested for you {string}")
    public void clickOnSuggestedForYou(String section) {
        dashboard.clickOnSuggestedForYou(section);
    }

    @And("Verify Suggested for you Offers Etihad Airways")
    public void verifySuggestedForYouOffersEtihadAirways() {
        dashboard.verifySuggestedForYouOffersEtihadAirways();
    }
}
