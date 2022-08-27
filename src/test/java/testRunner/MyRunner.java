package testRunner;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentTest;

import appHooks.ApplicationHook;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//"pretty",
@RunWith(Cucumber.class)
@CucumberOptions
		(features = {"./src/test/resources/features"},
		glue= {"stepDefinition","appHooks"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

						monochrome = true,
						dryRun=false,
						tags="@Smoke")
		//tags={"@CRMLoginTest"})
		//tags={"@SanityTest, @RegressionTest"})

public class MyRunner extends ApplicationHook
{
	
	
/*	@AfterClass
	public static void writeExtentReport() {
		
		Reporter.loadXMLConfig(new File("C:/Users/suranjan banerjee/Mahesh/CucumberE2E/src/test/resources/config/extent-config.xml"));
	}*/

}


//tags={"@CRMLoginTest"})