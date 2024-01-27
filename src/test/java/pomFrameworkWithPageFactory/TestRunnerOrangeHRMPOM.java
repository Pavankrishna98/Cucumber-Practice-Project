package pomFrameworkWithPageFactory;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featuresUsingPOM\\OragngrHRMUsingPOM.feature", 
glue = "pomFrameworkWithPageFactory", 
dryRun = false, 
monochrome = true
)

public class TestRunnerOrangeHRMPOM {

}
