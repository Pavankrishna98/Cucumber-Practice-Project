package usingScenarioOutLineDemoguru99;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\FeaturesUsingScenarioOutline\\guru99.feature",
		glue = "usingScenarioOutLineDemoguru99",
		dryRun = true,
		monochrome = true
		
		)


public class TestRunnerGuru99 {

}
