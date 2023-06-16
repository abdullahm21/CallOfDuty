package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
		features = "src/test/resources/features/Abdullah.feature",
		glue = "stepDefinition",	//where you define the step definitions file: Whcih has the gherkins methods.
		dryRun = false	//true: runs it in the background, false: runs it regularly.
		,tags = "@queryTest"	
)
public class AbdullahsCukesRunner {

}