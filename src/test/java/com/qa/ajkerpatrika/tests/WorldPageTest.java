package com.qa.ajkerpatrika.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ajkerpatrika.utils.Constants;

public class WorldPageTest extends BaseTest {
	@BeforeTest
	public void WorldPageSetup()   {
		worldpage = homepage.goToWorldPage();
		
	}
	
	
	
	@Test(priority = 1)
	public void worldPageTitleTest() {
		
		 Assert.assertEquals(worldpage.getWorldPageTitle(), Constants.WORLD_PAGE_TITLE);
	}
	
	
	
	@Test(priority = 2)
	public void worldListTest() {
		
		 Assert.assertEquals(worldpage.worldList(), Constants.getWorldList());
	}

	
	@Test(priority = 3)
	public void getUsAndCanadaPageLinkTest() {
		 usandcanadapage = worldpage.goToUsAndCanadaPage();
		 Assert.assertEquals(usandcanadapage.getUsAndCanadaPageTitle(), Constants.USANDCANADA_PAGE_TITLE);
	}

	
}
