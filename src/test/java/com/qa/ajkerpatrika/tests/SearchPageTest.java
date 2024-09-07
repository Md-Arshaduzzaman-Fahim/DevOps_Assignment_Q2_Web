package com.qa.ajkerpatrika.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ajkerpatrika.utils.Constants;

public class SearchPageTest extends BaseTest {
	@BeforeTest
	public void searchPageSetup()   {
		searchpage = homepage.doSearch(prop.getProperty("searchtext").trim());
		
	}
	
	
	
	@Test(priority = 1)
	public void isSearchPageHeaderTest() {
		Assert.assertTrue(searchpage.isSearchPageHeader());
	}
	
	
	
	
	@Test(priority=2)
	public void webListSizeTest() {
		
		Assert.assertEquals(searchpage.webListSize(), Constants.WEB_LIST_NUMBER);
	}
	
	
	@Test(priority=3)
	public void secTabTest() {
		
		Assert.assertEquals(searchpage.secTab(), Constants.SECOND_TAB_NAME);
	}
	
}
