package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberTest.StartUp;

public class Login {	
	StartUp st = new StartUp();
	WebDriver driver = st.getWebDriver("Chrome");		
		
	@Before
	public void setUp(){	
	}

	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() {		
		driver.get("https://www.google.com/gmail/about/");	
		driver.manage().window().maximize();
	}

	@When("^User clicks on sign in link$")
	public void User_clicks_on_sign_in_link(){		
	WebElement sign_in = driver.findElement(By.xpath("html/body/nav/div/a[2]"));
	sign_in.click();
	}
	@After
	public void cleanUp(){
		//driver.quit();
	}
}