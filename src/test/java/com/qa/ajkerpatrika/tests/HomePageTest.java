package com.qa.ajkerpatrika.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.ajkerpatrika.utils.Constants;

public class HomePageTest extends BaseTest {
	
	@BeforeTest
	public void homePageSetup() throws InterruptedException  {
		homepage.closeAd();
		
	}

	
	
		
	@Test(priority=1)
	public void getHomePageTitleTest()  {
		
		String actualTitle = homepage.getHomePageTitle();
		Assert.assertEquals(actualTitle, Constants.HOME_PAGE_TITTLE);
		
	}
	
	
	@Test(priority=2)
	public void mainMenuListTest() {
		List<String> mainMenuListVal = homepage.mainMenuList();
		Assert.assertEquals(mainMenuListVal, Constants.getExpectedmenuList());
	}
	
	
	@Test(priority=3)
	public void isMoreMenuBtnExistTest() {
		Assert.assertTrue(homepage.isMoreMenuBtnExist());
	}
	
	
	
	@Test(priority=4)
	public void mostRedListTest() {
		
		Assert.assertEquals(homepage.mostRedList(), Constants.MOST_RED_NUMBER);
	}
	
	
	
	
	
	@Test(priority=5)
	public void divListTest()  {
		Assert.assertEquals(homepage.divList(), Constants.getDivisionList());
	}
	
	
	
	


	
	
	
	@Test(priority=7)
	public void numOfTitleBarsTest() throws InterruptedException {
		Assert.assertEquals(homepage.numOfTitleBars(), Constants.TITLE_BAR_NUMBER);
	}

	
	
	
	
	@Test(priority=8)
	public void moreMenuListSizeTest() {
		Assert.assertEquals(homepage.moreMenuListSize(), Constants.MORE_MENU_LIST_SIZE);
	}
	
	
	@Test(priority=9)
	public void getFactCheckPageLinkTest() {
		factcheckpage = homepage.getFactCheckPageLink();
		Assert.assertEquals(factcheckpage.getFactCheckPageTitle(), Constants.FACTCHECK_PAGETITLE);
	}

}
