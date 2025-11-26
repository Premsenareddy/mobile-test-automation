package com.appium.stepDefinitions;

import com.appium.screens.KidsDocumentsScreen;
import com.appium.utils.CommonUtils;
import com.appium.utils.JsonUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class KidsDocumentsSteps extends CommonUtils {
    public static final Logger log = Logger.getLogger(KidsDocumentsSteps.class);
    KidsDocumentsScreen kidsDocuments = new KidsDocumentsScreen(appDriver);

    @When("I tap on settings of my child's account for my child {string}")
    public void i_tap_on_settings_of_my_child_s_account_for_my_child(String childName) {
        kidsDocuments.gotoChildProfileSettings(getBacData(childName));
    }
    @Then("verify if My documents option is present in child profile settings")
    public void verify_if_my_documents_option_is_present_in_child_profile_settings() {
        kidsDocuments.verifyMyDocumentsOption();
    }
    @When("I tap on My documents dropdown")
    public void i_tap_on_my_documents_dropdown() {
        kidsDocuments.tapOnDocumentsDropdown();
    }
    @Then("I should see the list of documents for my child")
    public void i_should_see_the_list_of_documents_for_my_child() {
        kidsDocuments.verifyMyDocumentsFrameLayout();
    }
    @Then("{string} document should be present")
    public void document_should_be_present(String documentName) {
        kidsDocuments.verifyKidsDocumentIsPresent(documentName);
    }
    @Then("{string} document should not be present")
    public void document_should_not_be_present(String documentName) {
        kidsDocuments.verifyKidsDocumentNotPresent(documentName);
    }

    @Then("verify if My documents option is not present in child profile settings")
    public void verify_if_my_documents_option_is_not_present_in_child_profile_settings() {
        kidsDocuments.verifyMyDocumentsOptionNotPresent();
    }

    @Then("tap on {string} document and check if option to view or download the documents appear")
    public void tap_on_document_and_check_if_option_to_view_or_download_the_documents_appear(String documentName) {
        kidsDocuments.verifyKidsDocumentViewOrDownloadOption(documentName);
    }

}