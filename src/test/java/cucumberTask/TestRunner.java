package cucumberTask;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src\\test\\resources\\FeaturesDataTables\\datatable.feature",
		glue = "dataTable",
		monochrome = true,
		dryRun = false
		
		)



public class TestRunner {

}
