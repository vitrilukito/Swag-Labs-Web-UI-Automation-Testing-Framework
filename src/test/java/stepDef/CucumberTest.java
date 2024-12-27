package stepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepDef"},
        features = {"src/test/resources"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"},
        tags = "@web",
        monochrome = true
)
public class CucumberTest {
}