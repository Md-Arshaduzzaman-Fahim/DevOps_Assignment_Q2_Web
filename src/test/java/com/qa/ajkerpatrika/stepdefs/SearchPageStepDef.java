package com.qa.ajkerpatrika.stepdefs;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qa.ajkerpatrika.factory.DriverFactory;
import com.qa.ajkerpatrika.pages.CountryPage;
import com.qa.ajkerpatrika.pages.DhakaPage;
import com.qa.ajkerpatrika.pages.FactCheckPage;
import com.qa.ajkerpatrika.pages.HomePage;
import com.qa.ajkerpatrika.pages.LoginPage;
import com.qa.ajkerpatrika.pages.SearchPage;
import com.qa.ajkerpatrika.pages.UsAndCanadaPage;
import com.qa.ajkerpatrika.pages.WorldPage;
import com.qa.ajkerpatrika.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageStepDef {

	
	WebDriverContainer container;
	
	public SearchPageStepDef(WebDriverContainer container) {
		this.container = container;
	}
	
	
	@Given("I am present on home page")
	public void i_am_present_on_home_page() {
		String actualTitle = container.homepage.getHomePageTitle();
		Assert.assertEquals(actualTitle, Constants.HOME_PAGE_TITTLE);
	}
	
	@When("I search something")
	public void i_search_something() {
		container.searchpage = container.homepage.doSearch(container.prop.getProperty("searchtext").trim());
	}

	@Then("I should go to the search page")
	public void i_should_go_to_the_search_page() {
		Assert.assertTrue(container.searchpage.isSearchPageHeader());
	}

	@Given("I am on search page")
	public void i_am_on_search_page() {
		container.searchpage = container.homepage.doSearch(container.prop.getProperty("searchtext").trim());
	}

	@Then("Web list number should match expected")
	public void web_list_number_should_match_expected() {
		Assert.assertEquals(container.searchpage.webListSize(), Constants.WEB_LIST_NUMBER);
	}

	@Then("there should be an image tab")
	public void there_should_be_an_image_tab() {
		Assert.assertEquals(container.searchpage.secTab(), Constants.SECOND_TAB_NAME);
	}

}
