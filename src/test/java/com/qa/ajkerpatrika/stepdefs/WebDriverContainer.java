package com.qa.ajkerpatrika.stepdefs;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.ajkerpatrika.factory.DriverFactory;
import com.qa.ajkerpatrika.pages.CountryPage;
import com.qa.ajkerpatrika.pages.DhakaPage;
import com.qa.ajkerpatrika.pages.FactCheckPage;
import com.qa.ajkerpatrika.pages.HomePage;
import com.qa.ajkerpatrika.pages.LoginPage;
import com.qa.ajkerpatrika.pages.SearchPage;
import com.qa.ajkerpatrika.pages.UsAndCanadaPage;
import com.qa.ajkerpatrika.pages.WorldPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class WebDriverContainer {
	DriverFactory df;
	Properties prop;
	WebDriver driver;
	
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	WorldPage worldpage;
	CountryPage countrypage;
	UsAndCanadaPage usandcanadapage;
	FactCheckPage factcheckpage;
	DhakaPage dhakapage;
	
	
	@Before
	public void setup() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		homepage = new HomePage(driver);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	
}
