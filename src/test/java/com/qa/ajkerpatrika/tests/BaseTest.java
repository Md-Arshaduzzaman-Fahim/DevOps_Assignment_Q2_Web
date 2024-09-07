package com.qa.ajkerpatrika.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.qa.ajkerpatrika.factory.DriverFactory;
import com.qa.ajkerpatrika.pages.CountryPage;
import com.qa.ajkerpatrika.pages.DhakaPage;
import com.qa.ajkerpatrika.pages.FactCheckPage;
import com.qa.ajkerpatrika.pages.HomePage;
import com.qa.ajkerpatrika.pages.LoginPage;
import com.qa.ajkerpatrika.pages.SearchPage;
import com.qa.ajkerpatrika.pages.UsAndCanadaPage;
import com.qa.ajkerpatrika.pages.WorldPage;


public class BaseTest {
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
	
	SoftAssert softAssert;
	
	@BeforeTest
	public void setup() {
		df = new DriverFactory();
		prop = df.init_prop();
		driver = df.init_driver(prop);
		homepage = new HomePage(driver);
		softAssert = new SoftAssert();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
