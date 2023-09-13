package runner;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/Flip.feature"},
		dryRun = !true,
		glue = "steps"
		//snippets = SnippetType.CAMELCASE,
		
		
		
		)


public class Cartrun extends AbstractTestNGCucumberTests {

	

}
