package com.qa.ajkerpatrika.stepdefs;




import org.testng.Assert;

import com.qa.ajkerpatrika.factory.DriverFactory;
import com.qa.ajkerpatrika.pages.HomePage;

import com.qa.ajkerpatrika.utils.Constants;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	
WebDriverContainer container;
	
	public LoginPageStepDef(WebDriverContainer container) {
		this.container = container;
	}

	
	
	
	@Given("I have entered login page")
	public void i_have_entered_login_page() throws InterruptedException {
		
		container.loginpage = container.homepage.goToLoginPage();
		 
	}


	@Then("forgot password link should be there")
	public void forgot_password_link_should_be_there() {
		Assert.assertTrue(container.loginpage.isForgotPswdLinkExist());
	}

	@Then("register link should be there")
	public void register_link_should_be_there() {
		Assert.assertTrue(container.loginpage.isRegisterLinkExist());
	}
	
	
	@When("I enter email and password")
	public void i_enter_email_and_password() throws InterruptedException {
		 container.homepage = container.loginpage.doLogin(container.prop.getProperty("email").trim(), container.prop.getProperty("password").trim());
		 Thread.sleep(5000); 
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals(container.homepage.getHomePageTitle(), Constants.HOME_PAGE_TITTLE);
	}

}
