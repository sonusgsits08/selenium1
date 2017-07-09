package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberTest.StartUp;

public class Login {	
	StartUp st = new StartUp();
	WebDriver driver = st.getWebDriver("Chrome");	
	
	WebElement sign_in = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
			
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() {
		System.out.println("user is on gmail.com page now");
		PageFactory.initElements(driver, this);
		driver.get("http://www.gmail.com");	
	}

	@When("^User clicks on sign in link$")
	public void User_clicks_on_sign_in_link(){
		PageFactory.initElements(driver, this);
		sign_in.click();
	}
}