package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",

		glue = {"com.qa.ajkerpatrika.stepdefs"},
				 plugin = {
			                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
			        },
		monochrome = true
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
//	@DataProvider(parallel = true)
//	public Object [][] scenario(){
//		return super.scenarios();
//	}

}
