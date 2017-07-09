package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberTest.StartUp;

public class Login {	
	StartUp st = new StartUp();
	WebDriver driver = st.getWebDriver("Chrome");
	WebElement sign_in = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() {
		driver.get("http://www.gmail.com");
	}
	@When("^User clicks on sign in link$")
	public void user_clicks_on_signin_link(){
		sign_in.click();
	}	
	public void User_enters_username_password(){		
	}
}
