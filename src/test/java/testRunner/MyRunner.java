package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(features = {"src/test/resources/features"},
		glue= {"stepDefinition","appHooks"},
		plugin = {"pretty", "html:test-output", "json:target/JsonReports/Cucumber-Report.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun=true)
		//tags={"@CRMLoginTest"})
		//tags={"@SanityTest, @RegressionTest"})

public class MyRunner
{

}
