package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeaturesForPO",
		glue="com.stepDefinitions2",
		plugin = {
//				"pretty","html:target/cucumber-reports.html"
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	})

public class TestRunnerForPO {

	
	}