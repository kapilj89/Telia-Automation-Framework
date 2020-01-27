package se.telia.siebel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
tags = {"@RXDODTA-1315"},
		features = {"src/test/resources/se/telia/Data_Prep/Mobile"},
        plugin = {"pretty",
                "json:target/cucumber_report/siebel-api-test-cucumber_report.json"
                 })
public class RunCukesTest {
}
