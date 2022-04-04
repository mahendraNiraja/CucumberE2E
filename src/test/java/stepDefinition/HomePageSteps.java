package stepDefinition;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.driverFactory.DriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {

	private LoginPage loginPage= new LoginPage(DriverFactory.getDriver());
	private HomePage homePage;

	@Given("User is an Home Page")
	public void user_is_an_home_page() {

		System.out.println("user is on Home Page");
		System.out.println("DDDDD"+DriverFactory.getDriver().getTitle());
	}
	@Then("User get Header Sections")
	public void user_get_header_sections(io.cucumber.datatable.DataTable dataTable) {

	List<String>allhead=	homePage.getAllheaders();
	List<String>exp=dataTable.asList();
	Assert.assertEquals(allhead, exp);

	}
	@Then("Header count is {int}")
	public void header_count_is(Integer int1) {
		int count= homePage.getHeaderCount();
		Assert.assertEquals(5, count);

	}

	@Given("User is already logged  into application")
	public void user_is_already_logged_into_application(DataTable dataTable) {
		             List<Map<String,String>>credenatail=dataTable.asMaps();
		           String username=  credenatail.get(0).get("UserName");
		           String paswword=  credenatail.get(0).get("PassWord");
		           String t1=  credenatail.get(1).get("UserName");
		           String t2=  credenatail.get(1).get("PassWord");
		           System.out.println("HHH"+t1);
		           System.out.println("GGG"+t2);
		           homePage=  loginPage.doLogin(username, paswword);

	}
	}
