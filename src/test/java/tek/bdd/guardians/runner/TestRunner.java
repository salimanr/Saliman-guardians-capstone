package tek.bdd.guardians.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

	
@RunWith (Cucumber.class)
@CucumberOptions(

		tags = "@verifySideBar",
		features = ("classpath:features"),
		glue="tek.bdd.guardians",
		dryRun = true,
		plugin = {
        "pretty",
        "html:target/htmlReports/cucumber-pretty.html",
        "json:target/jsonReports/cucumber.json"
},
		snippets = CAMELCASE,
		monochrome = true)

public class TestRunner {
	
}
