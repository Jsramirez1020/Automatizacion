package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resource/features",
    glue = "steps"
)

public class Runner {

}
