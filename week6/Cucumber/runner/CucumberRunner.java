package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features01",
          glue = "steps01", 
          monochrome = true,
          publish=true,
          //tags = "@smoke and @regression"
          //tags = "@regression or @functional"
          tags = "@file")

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
