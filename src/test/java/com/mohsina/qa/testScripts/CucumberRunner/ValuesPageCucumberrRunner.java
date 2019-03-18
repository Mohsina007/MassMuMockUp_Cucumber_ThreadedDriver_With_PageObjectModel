package com.mohsina.qa.testScripts.CucumberRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //dryRun = false,
        //strict = true,
        //monochrome = true,
        //tags = { "@debug" },
        //tags = { "@functional","@debug" }, /*AND*/
        //tags = { "@functional,@debug" }, /*OR*/
        //tags = { "@functional,@debug","@debug" }, /*AND-OR*/
        features = "src/test/Resources/features",
        glue = { "com.mohsina.qa.framework","com.mohsina.qa.framework.util"},
        plugin={
                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)

public class ValuesPageCucumberrRunner {
}
