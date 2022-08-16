package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.driverFactory.DriverFactory;
import com.utils.JavaUtilites;
import io.cucumber.java.en.*;

public class SignInPage extends JavaUtilites {

	By jobseekerLoginButton = By
			.xpath("//li[label[a[@data-check='menutab']]]/following::a/span[contains(text(),'Jobseeker Login')]");
	By emailInputBox = By.xpath("//input[@id='signInName']");
	By passwordInputBox = By.xpath("//input[@id='password']");
	By blueLoginButton = By.xpath("//input[@value='Login']");

	@When("User click on jobseeker login button")
	public void user_click_on_jobseeker_login_button() {
		// wait for clickable jobseekerLoginButton
		JavaUtilites.waitForElements(jobseekerLoginButton, "clickable");
		// click jobseekerlogin button
		DriverFactory.getDriver().findElement(jobseekerLoginButton).click();
	}

	@When("User enter credential")
	public void user_enter_credential(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<Map<String, String>> hm = dataTable.asMaps();
		System.out.println(hm.get(0).get("Email"));
		System.out.println(hm.get(0).get("Password"));
		JavaUtilites.waitForElements(emailInputBox, "presence");
		JavaUtilites.waitForElements(passwordInputBox, "presence");
		try {
			DriverFactory.getDriver().findElement(emailInputBox).sendKeys(hm.get(0).get("Email"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			DriverFactory.getDriver().findElement(passwordInputBox).sendKeys(hm.get(0).get("Password"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@When("User enter enabled login button.")
	public void user_enter_enabled_login_button() {
		// Write code here that turns the phrase above into concrete actions
		try {
			DriverFactory.getDriver().findElement(blueLoginButton).sendKeys(Keys.ENTER);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
