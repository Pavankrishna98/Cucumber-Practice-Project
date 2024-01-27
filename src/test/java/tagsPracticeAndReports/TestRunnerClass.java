package tagsPracticeAndReports;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\cucumberPracticeTags\\tagsPractice.feature", glue = "tagsPracticeAndReports", dryRun = false, monochrome = true, tags = "@valid_test",
		// tags = "@invalid_test or not @null_test"
		// tags = "@null_test"
		// plugin={"pretty","html:target/tagcucumber/report"}
		// plugin= {"pretty","junit:target/junit/report.junit"}
		plugin = { "pretty", "json:target/json/report.json" }

)

public class TestRunnerClass {

}
