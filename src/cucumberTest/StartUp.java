package cucumberTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartUp {	
	public WebDriver getWebDriver(String browser){
		if(browser.equalsIgnoreCase("Chrome")){
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			return new FirefoxDriver();
		}
		else
			return null;			
	}

}
