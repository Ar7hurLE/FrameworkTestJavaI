package StepsDefinitions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Features", glue={"StepsDefinitions"},
monochrome= true,
plugin = {"pretty","html:target/HtmlReports","json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml"})
public class TestRunner {
}
