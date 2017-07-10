package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(glue = "stepDefs", features = "features/", tags = "@Login")
public class TestRunner {
}
