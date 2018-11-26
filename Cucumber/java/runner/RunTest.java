package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  
@CucumberOptions(
		// locate the feature file
		features="src/test/java/feature/Login.feature",
		// package where step definitions are available
		glue="steps",
		// to get the snippets
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		// To avoid junks characters in console
		monochrome=true)

public class RunTest {

}






