package com.qa.ajkerpatrika.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ajkerpatrika.utils.ElementUtil;

public class CountryPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By cList = By.xpath("//div[@class='secondary_menu']/ul/li/a");
	private By dhakaLink = By.linkText("ঢাকা");
	
	public CountryPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	public String getCountryPageTitle() {
		return driver.getTitle();
	}
	
	
	public List<String> CountryList(){
		List<WebElement> ctList = eleUtil.waitForElementsPresence(cList, 10);
    	List<String> ctListVal = new ArrayList<String>();
		for(WebElement e: ctList) {
			String text = e.getText();
			ctListVal.add(text);
		}

    	return ctListVal;

	}

	
	
	public DhakaPage goToDhakaPage(){
		eleUtil.doClick(dhakaLink);
		
		return new DhakaPage(driver);
	}
	
	

}
