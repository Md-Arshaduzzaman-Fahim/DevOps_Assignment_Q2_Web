package com.qa.ajkerpatrika.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ajkerpatrika.utils.Constants;

public class CountryPageTest extends BaseTest{
	
	@BeforeTest
	public void countryPageSetup() {
		countrypage = homepage.goCountryPage();
	}
	
	
	@Test(priority = 1)
	public void countryPageTitleTest() {
		
		 Assert.assertEquals(countrypage.getCountryPageTitle(), Constants.COUNTRY_PAGE_TITLE);
	}
	
	
	
	@Test(priority = 2)
	public void CountryListTest() {
		
		 Assert.assertEquals(countrypage.CountryList(), Constants.getCountryList());
	}

	
	
	@Test(priority = 3)
	public void getUsAndCanadaPageLinkTest() {
		 dhakapage = countrypage.goToDhakaPage();
		 Assert.assertEquals(dhakapage.getDhakaPageTitle(), Constants.DHAKA_PAGE_TITLE);
	}
	
	
}
