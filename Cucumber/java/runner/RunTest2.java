package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  
@CucumberOptions(
		features= {
		"src/test/java/feature/CL.feature"},
		glue="steps",
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		monochrome=true)

public class RunTest2 {

}






