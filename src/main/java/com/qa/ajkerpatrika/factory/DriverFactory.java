package com.qa.ajkerpatrika.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;






public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	
	
	/**
	 * this method is used to initialize the WebDriver
	 * @param browserName
	 * @return this will return the driver
	 */
	public WebDriver init_driver(Properties prop) {
		
		String browserName = prop.getProperty("browser").trim();
		
		System.out.println("browser name is: "+ browserName);
		
		
		
		
		
		if(browserName.equals("chrome")) {
				
          tlDriver.set(new ChromeDriver());
			//driver = new ChromeDriver();
          //driver.manage().window().maximize();
		}
		
		else if(browserName.equals("firefox")) {
			
			 tlDriver.set(new FirefoxDriver());
			//driver = new FirefoxDriver();
			//driver.manage().window().maximize();
		}
		
		else if(browserName.equals("safari")) {
			
			tlDriver.set(new SafariDriver());
			
			//driver = new SafariDriver();
			//driver.manage().window().maximize();
		}
		
		else {
			System.out.println("please pass the right browser name: "+ browserName);
		}
		
		getDriver().manage().window().fullscreen();
		getDriver().manage().deleteAllCookies();
		getDriver().get(prop.getProperty("url"));
		
		return getDriver();
	}
	
	
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	/**
	 * this method is used to initialize the properties
	 * @return this will return properties prop reference
	 */
	public Properties init_prop() {
		prop = new Properties();
		FileInputStream ip = null;
		
			
			try {
				ip = new FileInputStream("./src/test/resources/config/config.properties");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
		
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}
	
}
