package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "stepdefinitions", // Path to your step definitions
        plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results/ManualRunnerTest_OctaneGherkinResults.xml"
)
public class TestRunner {
    // This class should be empty, step definitions are in separate classes
}
