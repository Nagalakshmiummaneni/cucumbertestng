package StepDefinition;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features",
glue = "StepDefinition",
plugin = { "pretty", "json:target/cucumber-reports.json" ,
		"junit:target/cucumber-reports.xml",
		"html:target/cucumber-reports.html"},
monochrome = true)
public class testrunning extends AbstractTestNGCucumberTests  {

}
