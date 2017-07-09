package cucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartUp {	
	public WebDriver getWebDriver(String browser){
		String CHROME_LOC ="selenium1/chromedriver";		
		if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("this is Chrome");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+CHROME_LOC);
			System.out.println("webdriver property name"+System.getProperty("webdriver.chrome.driver"));
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			return new FirefoxDriver();
		}
		else
			return null;			
	}

}
