package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = {"src/test/resources/features/Login.feature"}, glue = {"StepDefinitionAddTask"},
        tags = "@PlaceOrder"  , plugin = {})

public class TestRunner extends AbstractTestNGCucumberTests {

}