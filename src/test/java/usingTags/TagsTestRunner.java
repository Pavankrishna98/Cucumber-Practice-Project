package usingTags;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatutresUsingTags\\tagsFeatures.feature", glue = "usingTags", dryRun = false,
	monochrome = true,
 //tags = "@smoketest and  @retest"
// tags = "@retest or not @regressiontest"
// tags = "(@sanitytest and @regressiontest"
tags = "(@smoketest and @retest) or not  @regressiontest "
)
public class TagsTestRunner {

}
