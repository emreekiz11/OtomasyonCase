package testRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"StepDefinitions","Util"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/FinalReports.html"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
}
