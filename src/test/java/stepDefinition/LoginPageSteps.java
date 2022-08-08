package stepDefinition;
import org.openqa.selenium.By;

import com.utils.JavaUtilites;

import io.cucumber.java.en.*;



public class LoginPageSteps extends JavaUtilites {
	
By monsterLogo= By.xpath("//div[@class='monster-logo primary-logo']/a/img");

	@Given("User is in login Page")
	public void user_is_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("monster url  launched successfully");
	    JavaUtilites.waitForElements(monsterLogo, "presence");
	    System.out.println("Monster logo is verified");
	}



}
