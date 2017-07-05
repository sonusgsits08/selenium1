package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(tags = { "@Login" })
public class TestRunner {	
}
