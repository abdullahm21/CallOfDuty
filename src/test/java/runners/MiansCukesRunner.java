package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        features = "src/test/resources/features/Mian.feature",
        glue = "stepDefinitions",    //where you define the step definitions file: Whcih has the gherkins methods.
        dryRun = true    //true: runs it in the background, false: runs it regularly.
        //,tags = "@regression"    
)
public class MiansCukesRunner {

}