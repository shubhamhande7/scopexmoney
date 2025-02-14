package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"stepDefinitions"}
,monochrome = true,
plugin = {"pretty","html:target/HtmlReport.html"},
tags="@smoke"
		)
public class TRunner {

}
