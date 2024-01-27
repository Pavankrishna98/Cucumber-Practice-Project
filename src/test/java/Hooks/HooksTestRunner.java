package Hooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\FeaturesHooks\\hooks.feature",
		glue = "Hooks",
		dryRun = false,
		monochrome = true
		
		
		)

public class HooksTestRunner {

}
