package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@smoke"
)
public class TestRunner extends TestBase {
}
