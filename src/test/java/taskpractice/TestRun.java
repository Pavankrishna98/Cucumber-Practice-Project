package taskpractice;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\FeaturesTask\\task.feature",
		glue = "taskpractice",
		monochrome = true,
		dryRun = false
		
		)

public class TestRun {

}
