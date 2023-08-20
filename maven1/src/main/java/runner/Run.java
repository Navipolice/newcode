package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/login.feature"},
		dryRun = !true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)


public class Run extends AbstractTestNGCucumberTests{

	
		

	}


