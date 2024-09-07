package com.qa.ajkerpatrika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ajkerpatrika.utils.Constants;
import com.qa.ajkerpatrika.utils.ElementUtil;

public class FactCheckPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	

	
	public FactCheckPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	public String getFactCheckPageTitle() {
		return eleUtil.waitForTitleIsAndFetch(10, Constants.FACTCHECK_PAGETITLE);
		
	}
	
	
}
