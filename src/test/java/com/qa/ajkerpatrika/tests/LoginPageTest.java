package com.qa.ajkerpatrika.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ajkerpatrika.utils.Constants;

public class LoginPageTest extends BaseTest {
	
	@BeforeTest
	public void loginPageSetup() throws InterruptedException  {
		loginpage = homepage.goToLoginPage();
		
	}
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String actualTitle =  loginpage.getLoginPageTitle();
		 Assert.assertEquals(actualTitle, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test(priority = 2)
	public void loginPageForgotpsswdLinkTest() {
		Assert.assertTrue(loginpage.isForgotPswdLinkExist());
	}
	
	@Test(priority = 3)
	public void loginPageRegisterLinkTest() {
		Assert.assertTrue(loginpage.isRegisterLinkExist());
	}
	
	@Test(priority=4)
	public void loginTest() throws InterruptedException {
	    homepage = loginpage.doLogin(prop.getProperty("email").trim(), prop.getProperty("password").trim());
	    Thread.sleep(8000);
		Assert.assertEquals(homepage.getHomePageTitle(), Constants.HOME_PAGE_TITTLE); 
		
	}
}
