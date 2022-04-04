package stepDefinition;

import org.junit.Assert;

import com.driverFactory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageSteps {

	LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	public String titleofPage;

	@Given("User is in login Page")
	public void user_is_in_login_page() {
	System.out.println("User is on login page...");
	}

	@When("User get Title of Page")
	public void user_get_title_of_page() {
		titleofPage=DriverFactory.getDriver().getTitle();
       System.out.println("kkkkkkkkkkkk"  +titleofPage);
	}

	@Then("Page title shoul be {string}")
	public void page_title_shoul_be(String TitleOfPage) {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals(TitleOfPage, titleofPage);
	}

	@When("User enter Username {string}")
	public void user_enter_username(String Username) {
		loginPage.enterUserName(Username);


	}

	@When("user enter password {string}")
	public void user_enter_password(String password) {

		loginPage.enterPassword(password);
	}



	@When("Click on login button")
	public void click_on_login_button() {
		loginPage.clickOnSingInBtn();
	}
	@When("User click on Login Button")
	public void user_click_on_login_button() {
		loginPage.clickOnJobSeekerLoginBtn();
	}



}
