package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.driverFactory.DriverFactory;
import com.pages.SignInPage;
import com.utils.JavaUtilites;
import io.cucumber.java.en.*;

public class SignInPageSteps extends JavaUtilites {
	SignInPage sip = new SignInPage();

	@When("User click on jobseeker login button")
	public void user_click_on_jobseeker_login_button() {
		// wait for clickable jobseekerLoginButton
		JavaUtilites.waitForElements(sip.jobseekerLoginButton, "clickable");
		// click jobseekerlogin button
		DriverFactory.getDriver().findElement(sip.jobseekerLoginButton).click();
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
		JavaUtilites.waitForElements(sip.emailInputBox, "presence");
		JavaUtilites.waitForElements(sip.passwordInputBox, "presence");
		try {
			DriverFactory.getDriver().findElement(sip.emailInputBox).sendKeys(hm.get(0).get("Email"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		try {
			DriverFactory.getDriver().findElement(sip.passwordInputBox).sendKeys(hm.get(0).get("Password"));
		} catch (Exception e) {
			// TODO: handle exception here
			e.printStackTrace();
		}

	}

	@When("User enter enabled login button.")
	public void user_enter_enabled_login_button() {
		// Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver().findElement(sip.blueLoginButton).sendKeys(Keys.ENTER);

		/*
		 * try {
		 * DriverFactory.getDriver().findElement(blueLoginButton).sendKeys(Keys.ENTER);
		 * } catch (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */

	}

	@Given("User is in sign in Page")
	public void user_is_in_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("monster url  launched successfully");
		JavaUtilites.waitForElements(sip.monsterLogo, "presence");
		System.out.println("Monster logo is verified");
	}

}
