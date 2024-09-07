package com.qa.ajkerpatrika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ajkerpatrika.utils.ElementUtil;

public class UsAndCanadaPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	
	
	public UsAndCanadaPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	
	public String getUsAndCanadaPageTitle() {
		return driver.getTitle();
	}
	
}
