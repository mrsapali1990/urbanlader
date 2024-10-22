package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	features=".//features/Skill.feature",
			glue="StepDefinations",
			dryRun=false,
			monochrome=true,
			publish=true,
//			tags= "@Regression",
			plugin= {"pretty","html:reports\\reportshtml","json:reports\\reportsjson\\cucumber.json","junit:reports\\reportsjunit\\cucumber.xml"}
	
)
public class TestRunner {
}
