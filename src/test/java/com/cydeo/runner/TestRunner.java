package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(  features = "src/test/resources/features" ,
            glue = "com/cydeo/step_definitions",
            plugin = {"pretty","html:target/cucumber.html"},
            //dryRun = true,
            tags="@wip"

    )
    public class TestRunner {
}
