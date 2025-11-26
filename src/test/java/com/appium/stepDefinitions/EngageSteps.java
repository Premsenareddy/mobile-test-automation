package com.appium.stepDefinitions;

import com.appium.base.BaseClass;
import com.appium.screens.MarketPlaceHomeScreen;
import com.appium.utils.CommonUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;

public class EngageSteps extends CommonUtils {
	public static final Logger log = Logger.getLogger(EngageSteps.class);
	MarketPlaceHomeScreen mp = new MarketPlaceHomeScreen(appDriver);

	@Given("^User Opens the App$")
	public void user_Opens_the_App() throws Throwable {
		log.info("-----------------------------New Scenario----------------------------------------");
		log.info("AHB application opens!!");

	}

	@Given("^Successfully registered$")
	public void successfully_registered() throws Throwable {

	}

	@Then("^User is on dashboard$")
	public void user_is_on_dashboard() throws Throwable {
		log.info("User is on dashboard screen");

	}
	//-----------------------------------------------------------------------------
	
	@Given("^Already registered customer$")
	public void already_registered_customer() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		log.info("User is on pin screen!!");
		//BaseClass.getImplicitlyWait();
		mp.enterPin(BaseClass.prop.getProperty("PIN"));//
		Thread.sleep(4000);

	}

	@When("^Click search appearing at the top on home page$")
	public void click_search_appearing_at_the_top_on_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("^I Type \"(.*?)\" in the search edit box to search$")
	public void i_Type_in_the_search_edit_box_to_search(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		log.info("User is on MarketPlace home screen!!");
		mp.searchProduct(BaseClass.prop.getProperty("Product_Name"));
		Thread.sleep(4000);
		BaseClass.getImplicitlyWait();
		log.info("User Successfully searched a product!!");
	}

	@When("^I Click Enter$")
	public void i_Click_Enter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^All \"(.*?)\" products must appear$")
	public void all_products_must_appear(String arg1) throws Throwable {
		log.info("User User has searched the product!!");
	}

	@Then("^User must be re-directed to the product description page$")
	public void user_must_be_re_directed_to_the_product_description_page() throws Throwable {
		log.info("User goes to the product details page!!");
	    mp.clickProduct();
	    Thread.sleep(2000);
	    BaseClass.getImplicitlyWait();
		log.info("User Successfully opened product description!!");
	}

	@Then("^Click the back icon$")
	public void click_the_back_icon() throws Throwable {
		mp.tapBack();
		Thread.sleep(2000);
	    BaseClass.getImplicitlyWait();
		log.info("User clicks on back button!!");
	}

	@Then("^Now again click the back button$")
	public void now_again_click_the_back_button() throws Throwable {
		//mp.tapBack();
		Thread.sleep(2000);
	    BaseClass.getImplicitlyWait();
		log.info("User clicks on back button again!!");
	}

	@Then("^User must be re-directed to the home screen again$")
	public void user_must_be_re_directed_to_the_home_screen_again() throws Throwable {
		//mp.tapBack();
		log.info("User is redirected to marketplace home page!!");
	}
	
	@When("^I Type invalid \"(.*?)\" in the search edit box to search$")
	public void i_Type_invalid_in_the_search_edit_box_to_search(String arg1) throws Throwable {
		log.info("User is on MarketPlace home screen!!");
		mp.searchInvalidProduct(BaseClass.prop.getProperty("Invalid_Product_Name"));
		Thread.sleep(4000);
		BaseClass.getImplicitlyWait();
		log.info("User Successfully searched a product!!");
	}
}
