package com.qa.ajkerpatrika.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ajkerpatrika.utils.ElementUtil;

public class SearchPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By searchHeader = By.xpath("//a/span[text()='অনুসন্ধান']");
	private By webList = By.xpath("//div[@class='tag_title_holder']/h2");
	private By secondTab = By.xpath("//div[@aria-label='refinement'][2]");
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	public boolean isSearchPageHeader() {
		eleUtil.waitForElementVisible(searchHeader, 10);
		return eleUtil.doElementIsDisplayed(searchHeader);
	}
	
	
	
	
	public int webListSize() {
		List<WebElement> wl = eleUtil.waitForElementsPresence(webList, 10);
    	List<String> webListSiz = new ArrayList<String>();
		for (WebElement e : wl) {
			String text = e.getText();
			webListSiz.add(text);
		}
		
				
    	return webListSiz.size();
	}
	
	
	
	public String secTab() {
		return eleUtil.waitForElementVisible(secondTab,10).getText();
	}
	
	
}
