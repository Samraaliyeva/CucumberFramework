package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/test/resources/login.feature",
        glue = {"StepDefinitions"}
)
public class CukesRunner extends AbstractTestNGCucumberTests {

}
