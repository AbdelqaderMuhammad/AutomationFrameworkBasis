package tests.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@Test
@CucumberOptions(glue = "src/test/java/tests/steps/", features = "src/test/java/tests/features/")
public class googleSearchRunner extends AbstractTestNGCucumberTests {

}
