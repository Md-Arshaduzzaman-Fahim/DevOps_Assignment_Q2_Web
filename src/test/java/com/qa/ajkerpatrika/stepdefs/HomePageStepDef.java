package com.qa.ajkerpatrika.stepdefs;

import java.util.List;
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

public class HomePageStepDef {
	DriverFactory df;
	Properties prop;
	WebDriver driver;
	
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	WorldPage worldpage;
	CountryPage countrypage;
	UsAndCanadaPage usandcanadapage;
	FactCheckPage factcheckpage;
	DhakaPage dhakapage;
		
	
	@Before
	public void setup() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		homepage = new HomePage(driver);
	}

	@Then("homepage title should be there")
	public void homepage_title_should_be_there() {
		String actualTitle = homepage.getHomePageTitle();
		Assert.assertEquals(actualTitle, Constants.HOME_PAGE_TITTLE);
	}

	@Then("main menu list should match expected list")
	public void main_menu_list_should_match_expected_list() {
		List<String> mainMenuListVal = homepage.mainMenuList();
		Assert.assertEquals(mainMenuListVal, Constants.getExpectedmenuList());
	}

	@Then("most red number should be same as expected")
	public void most_red_number_should_be_same_as_expected() {
		Assert.assertEquals(homepage.mostRedList(), Constants.MOST_RED_NUMBER);
	}

	@When("I press more menu button")
	public void i_press_more_menu_button() {
		Assert.assertTrue(homepage.isMoreMenuBtnExist());
	}

	@Then("List should match expected list")
	public void list_should_match_expected_list() {
		Assert.assertEquals(homepage.moreMenuListSize(), Constants.MORE_MENU_LIST_SIZE);
	}

	@Then("Div list should match expected list")
	public void div_list_should_match_expected_list() {
		Assert.assertEquals(homepage.divList(), Constants.getDivisionList());
	}

	@Then("title bar number should match expected number")
	public void title_bar_number_should_match_expected_number() throws InterruptedException {
		Assert.assertEquals(homepage.numOfTitleBars(), Constants.TITLE_BAR_NUMBER);
	}
	
	
	
}
