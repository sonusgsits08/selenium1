package stepDefs;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumberTest.StartUp;

public class Login {	
	StartUp st = new StartUp();
	WebDriver wd = st.getWebDriver("Chrome");
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() {
		wd.get("www.gmail.com");
	}
}
