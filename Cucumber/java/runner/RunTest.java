package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)  
@CucumberOptions(
		features= {
		"src/test/java/feature/Login.feature"},
		glue= {"pages","runHooks"},
		dryRun=false,
		snippets=SnippetType.CAMELCASE,
		monochrome=true,
		plugin= {"pretty","html:CucumberReports"}
//		name="Login"
//		strict=true,
	/*	tags= {"@smoke"}*/)
public class RunTest {

}






