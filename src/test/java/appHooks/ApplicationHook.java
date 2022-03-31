package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.driverFactory.DriverFactory;
import com.utils.ConfigReader;

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
		driver.get("https://google.com");
	}
}
