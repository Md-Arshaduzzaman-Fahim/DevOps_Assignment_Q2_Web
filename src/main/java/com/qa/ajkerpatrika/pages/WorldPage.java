package com.qa.ajkerpatrika.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.ajkerpatrika.utils.ElementUtil;

public class WorldPage {
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By wList = By.xpath("//div[@class='secondary_menu']/ul/li/a");
	private By usAndCanadaLink = By.linkText("যুক্তরাষ্ট্র ও কানাডা");

	
	public WorldPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	public String getWorldPageTitle() {
		return driver.getTitle();
	}
	
	
	
	public List<String> worldList(){
		List<WebElement> wlList = eleUtil.waitForElementsPresence(wList, 10);
    	List<String> wlListVal = new ArrayList<String>();
		for(WebElement e: wlList) {
			String text = e.getText();
			wlListVal.add(text);
		}

    	return wlListVal;

	}
	
	
	public UsAndCanadaPage goToUsAndCanadaPage(){
		eleUtil.doClick(usAndCanadaLink);
		
		return new UsAndCanadaPage(driver);
	}

	
}
