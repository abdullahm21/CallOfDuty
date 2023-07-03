package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        features = "src/test/resources/features/Peggie.feature",
        glue = "stepDefinitions",	//where you define the step definitions file: Which has the gherkins methods.
        dryRun = true	//true: runs it in the background, false: runs it regularly.
        //,tags = "@regression"
)
public class PeggiesCukesRunner {

}
