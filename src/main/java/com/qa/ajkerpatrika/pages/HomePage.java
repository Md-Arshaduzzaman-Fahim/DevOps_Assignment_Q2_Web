package com.qa.ajkerpatrika.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ajkerpatrika.utils.Constants;
import com.qa.ajkerpatrika.utils.ElementUtil;
import com.qa.ajkerpatrika.utils.JavaScriptUtil;

public class HomePage {
private WebDriver driver;
	
	private ElementUtil eleUtil;
	private JavaScriptUtil j; 
	
	
	private By cancelAd = By.className("cancel");
	private By loginIcon = By.className("profile_link_holder");
	private By loginBtn = By.linkText("লগইন");
	private By mainMenu = By.xpath("//div[@id='main_menu']/ul/li/a");
	private By moreMenuBtn = By.className("more_main_menu");
	private By moreMenLis = By.xpath("//div[@class='big_menu_all']/ul/li/a");
	private By titleBars = By.xpath("//div[contains(@class,'titlebar')]");
	private By mostRed = By.xpath("//div[@class='tabs_content']//ul/li/a/span");
	private By searchBtn = By.xpath("//div[@class='header_search_wrap']/span");
	private By searchBar = By.name("q");
	private By search = By.className("search_button");
	private By division = By.id("division");
	private By district = By.id("district");
	private By worldLink = By.linkText("বিশ্ব");
	private By countryLink = By.linkText("সারা দেশ");
	private By factLink = By.linkText("ফ্যাক্টচেক");
	private By moreMenuBtnClose = By.xpath("//span[contains(@class,'more_main_menu opened')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		j = new JavaScriptUtil(driver);
	}
	
	public void closeAd() {
		eleUtil.waitForElementToBeClickable(2, cancelAd).click();
	}
	
	public String getHomePageTitle() {
		
		return driver.getTitle();
	}
	
	public LoginPage goToLoginPage() throws InterruptedException {
		//eleUtil.waitForElementToBeClickable(2, cancelAd).click();
	
		eleUtil.waitForElementVisible(loginIcon,10).click();
		eleUtil.waitForElementVisible(loginBtn, 10).click();
		
		
		return new LoginPage(driver);
	}
	
	
	public List<String> mainMenuList(){
		List<WebElement> menuList = eleUtil.waitForElementsPresence(mainMenu, 10);
    	List<String> menuListVal = new ArrayList<String>();
		for (WebElement e : menuList) {
			String text = e.getText();
			if(!text.equals("")) {
				menuListVal.add(text);
			}
		}
    	return menuListVal;

	}
	
	
	
	public boolean isMoreMenuBtnExist() {
		return eleUtil.waitForElementToBeClickable(10, moreMenuBtn).isDisplayed();
		
	}

	public int moreMenuListSize() {
		eleUtil.doClick(moreMenuBtn);
		List<WebElement> moreMenuList = eleUtil.waitForElementsPresence(moreMenLis, 10);
    	List<String> moreMenuListSize = new ArrayList<String>();
		for (WebElement e : moreMenuList) {
			String text = e.getText();
			moreMenuListSize.add(text);
		}
		
		
		eleUtil.waitForElementVisible(moreMenuBtnClose, 10).click();
		
    	return moreMenuListSize.size();
	}
	
	
	
	
	public int numOfTitleBars() throws InterruptedException {
		for(int i=0; i<9; i++) {
			j.scrollPageDown();
			Thread.sleep(500);
		}
		
		List<WebElement> titleBar = eleUtil.waitForElementsPresence(titleBars, 10);
    	List<String> titleBarList = new ArrayList<String>();
		for (WebElement e : titleBar) {
			String text = e.getText();
			titleBarList.add(text);
		}
		
		
		
    	return titleBarList.size();
	}
	
	
	
	
	public int mostRedList(){
		List<WebElement> ms = eleUtil.waitForElementsPresence(mostRed, 10);
    	List<String> mostRedList = new ArrayList<String>();
		for (WebElement e : ms) {
			String text = e.getText();
			mostRedList.add(text);
		}
		
				
    	return mostRedList.size();
	}
	
	
	
	
	
	public SearchPage doSearch(String srcTxt) {
		//eleUtil.waitForElementToBeClickable(2, cancelAd).click();
		eleUtil.doClick(searchBtn);
		eleUtil.waitForElementToBeClickable(10, searchBar).sendKeys(srcTxt);
		eleUtil.waitForElementToBeClickable(10, search).click();
		
		return new SearchPage(driver);
	}
	
	
	
	public List<String> divList(){
		return eleUtil.getDropDownOptionsTextList(division);
	}
	
	
	
	
	public List<String> disList(){
		eleUtil.doSelectDropDownByVisibleText(division, Constants.getDivisionList().get(1));
		
		eleUtil.waitForElementsPresence(district, 10);
		
		return eleUtil.getDropDownOptionsTextList(district);
	}
	
	
	
	
	public WorldPage goToWorldPage() {
		eleUtil.waitForElementToBeClickable(2, cancelAd).click();
		eleUtil.doClick(worldLink);
		
		return new WorldPage(driver);
	}
	
	

	public CountryPage goCountryPage() {
		eleUtil.waitForElementToBeClickable(2, cancelAd).click();
		eleUtil.doClick(countryLink);
		
		return new CountryPage(driver);
	}
	
	
	
	public FactCheckPage getFactCheckPageLink() {
		eleUtil.doClick(factLink);
		
		return new FactCheckPage(driver);
	}
	
}

