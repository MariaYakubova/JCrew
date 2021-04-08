package com.cybertek.jcrew.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"

        },
    features = "src/test/resources/features",
        glue = "com/cybertek/jcrew/step_definitions",
        dryRun = false,
        tags =  "@G24-175"//"@G24-41"
                //"@API"



)

public class CukesRunner {
}
