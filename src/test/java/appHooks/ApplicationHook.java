package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.driverFactory.DriverFactory;
import com.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHook {


	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader  cr;
	public Properties pro;

	@Before(order=0)
	public void getProperty(){
		cr= new ConfigReader();
		pro=cr.init_prop();

	}

	@Before(order=1)
	public void launchBrowser(){


		driverFactory= new DriverFactory();
		driver=driverFactory.driverInit(pro.getProperty("browser"));
		driver.get(pro.getProperty("URL"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After(order=1)
	public void takeScreenshot(io.cucumber.java.Scenario scenario){

		if (scenario.isFailed())
		{
			System.out.println("take the screenshot");
			TakesScreenshot ts=(TakesScreenshot) DriverFactory.getDriver();
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
			
		}
		else {
			System.out.println("take the screenshot");
			TakesScreenshot ts=(TakesScreenshot) DriverFactory.getDriver();
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}
@After(order=0)
	public void tearDown(){
System.out.println("close the driver");
		driver.close();
	}

}
