package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty", 
		"html:test-output/MuatterTests-report.html",
		"json:target/cucumber.json"},
features="src/test/resources/features/Muatter.feature",
glue = "stepDefinitions",
dryRun=false)
public class MuattersCukesRunner {

	
}
