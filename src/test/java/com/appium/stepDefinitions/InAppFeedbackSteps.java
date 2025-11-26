package com.appium.stepDefinitions;

import com.appium.screens.InAppFeedbackScreen;
import com.appium.screens.MoreScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import java.io.IOException;

public class InAppFeedbackSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(InAppFeedbackSteps.class);
    MoreScreen more = new MoreScreen(appDriver);
    InAppFeedbackScreen InApp= new InAppFeedbackScreen(appDriver);

    @Then("^User Clicks More Option$")
    public void user_clicks_more_option() throws Throwable {
        InApp.iLandMoreTab();
        log.info("User Successfully landed to More tab");
    }
    @And("^User should see Rate us option with 5 start being empty$")
    public void user_should_see_rate_us_option_with_5_start_being_empty() throws Throwable {
        InApp.firstTimeRateUsFiveStarsIsEmpty();
        log.info("Rate us options is Empty");

    }
    @And("^User Clicks on one of five star as rating for the app$")
    public void user_clicks_on_one_of_five_star_as_rating_for_the_app() throws Throwable {
        InApp.verifyEmptyFiveStar();
        log.info("User Is able to see the Empty five start");
    }
    @And("^User succesfully able to submit the comments (.+)$")
    public void user_succesfully_able_to_submit_the_comments(String comment) throws Throwable {
        InApp.submitComment(comment);
        log.info("User Is able to Enter  the Comment in comment box");
    }

    @And("^Verify the submit button in the application$")
    public void verify_the_submit_button_in_the_application() throws Throwable {
        InApp.verifySubmitBtn();
        log.info("Submit button is getting displayed on the popup");
    }

    @And("^Verify the maximum character limit$")
    public void verify_the_maximum_character_limit() throws Throwable {
        InApp.verifyCharacterLimit();
        log.info("User Is able to see the label as Maximum character limit is 500");
    }


    @And("^Click on submit button$")
    public void click_on_submit_button() throws Throwable {
        InApp.clickSubmitButton();
        log.info("User Is Able to submit succesfully");

    }

    @And("^Verify the success Screen$")
    public void verify_the_success_screen() throws Throwable {
        InApp.verifySuccessScreen();
        log.info("User Is Able to submit succesfully and getting Success Screen");

    }

    @And("^User should be able to close Comments popup screen if needed$")
    public void user_should_be_able_to_close_comments_popup_screen_if_needed() throws Throwable {
        InApp.verifyCloseButton();
        log.info("Suuccesfully able to close the Application");

    }

    @And("^Verify selected rating should be reset to previous rating in More screen$")
    public void verify_selected_rating_should_be_reset_to_previous_rating_in_more_screen() throws Throwable {
        InApp.verifySelectedStar();
        log.info("Suuccesfully able to see the same selected Star in the application");
    }

        @And("^User can enter the allowed special characters (.+)$")
        public void user_can_enter_the_allowed_special_characters(String comment) throws Throwable {
            InApp.submitComment(comment);
            log.info("Suuccesfully entered the special characters");
        }
}