package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(features = {"./src/test/resources/features"},
		glue= {"stepDefinition","appHooks"},
				plugin = {"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},

						monochrome = true,
						dryRun=false,
						tags="@Smoke")
		//tags={"@CRMLoginTest"})
		//tags={"@SanityTest, @RegressionTest"})

public class MyRunner
{

}


//tags={"@CRMLoginTest"})