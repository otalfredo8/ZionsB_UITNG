package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json"
        },
        dryRun = false,
        features = "src/test/resources/features",
        glue = "step/definitions",
        tags = "@wip"

)
public class SampleRunner {
}
