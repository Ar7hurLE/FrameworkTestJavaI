package Runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Features", glue={"StepsDefinitions"}, tags = "@smoke",
monochrome= true,
plugin = {"pretty", "html:target/HtmlReports/report.html","json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml"})
public class TestRunner {
}
