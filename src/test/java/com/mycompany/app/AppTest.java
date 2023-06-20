package com.mycompany.app;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="com.hpe.alm.octane.OctaneGherkinFormatter:gherkin-results/ManualRunnerTest_OctaneGherkinResults.xml",
    features="src/test/resources/feature/manualRunner/")
public class AppTest {
}
