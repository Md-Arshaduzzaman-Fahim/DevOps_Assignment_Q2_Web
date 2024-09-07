package com.qa.ajkerpatrika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ajkerpatrika.utils.ElementUtil;

public class LoginPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	private By loginWithGoogleLink = By.xpath("//div[contains(@class,'google_login')]/a");
	private By registerLink = By.linkText("রেজিস্টার");
	private By forgotPassword = By.linkText("পাসওয়ার্ড ভুলে গেছেন?");
	private By email = By.id("identifierId");
	private By nxtButtonem = By.xpath("//span[contains(text(),'Next')]");
	private By paswd = By.name("Passwd");
	private By nxtButtonps = By.xpath("//span[contains(text(),'Next')]");
	
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public boolean isRegisterLinkExist() {
		return eleUtil.waitForElementToBeClickable(10, registerLink).isDisplayed();
		//return eleUtil.doElementIsDisplayed(registerLink);
	}
	
	public boolean isForgotPswdLinkExist() {
		return eleUtil.waitForElementToBeClickable(10, forgotPassword).isDisplayed();
		//return eleUtil.doElementIsDisplayed(forgotPassword);
	}
	
	public HomePage doLogin(String eml, String pswrd) {
		System.out.println("login with: "+ eml +": "+ pswrd);
		eleUtil.waitForElementToBeClickable(10, loginWithGoogleLink).click();
		eleUtil.doSendKeys(email, eml);
		eleUtil.doClick(nxtButtonem);
		eleUtil.waitForElementToBeClickable(10, paswd).sendKeys(pswrd);
		eleUtil.waitForElementToBeClickable(10,nxtButtonps).click();;
		
		return new HomePage(driver);
	}
	
}
