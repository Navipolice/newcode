package run;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/main/Login.feature"},
		dryRun = true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)


public class Crun extends AbstractTestNGCucumberTests {
	

}

	
	



