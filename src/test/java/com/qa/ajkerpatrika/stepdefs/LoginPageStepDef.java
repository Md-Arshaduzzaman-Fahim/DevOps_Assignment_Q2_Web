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

public class LoginPageStepDef {
	
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
		homepage = new HomePage(driver);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Given("I have entered login page")
	public void i_have_entered_login_page() throws InterruptedException {
		loginpage = homepage.goToLoginPage();
		 
	}


	@Then("forgot password link should be there")
	public void forgot_password_link_should_be_there() {
		Assert.assertTrue(loginpage.isForgotPswdLinkExist());
	}

	@Then("register link should be there")
	public void register_link_should_be_there() {
		Assert.assertTrue(loginpage.isRegisterLinkExist());
	}
	
	
	@When("I enter email and password")
	public void i_enter_email_and_password() throws InterruptedException {
		 homepage = loginpage.doLogin(prop.getProperty("email").trim(), prop.getProperty("password").trim());
		 Thread.sleep(5000); 
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals(homepage.getHomePageTitle(), Constants.HOME_PAGE_TITTLE);
	}

}
