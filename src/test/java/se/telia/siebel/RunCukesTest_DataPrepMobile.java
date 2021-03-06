package se.telia.siebel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/se/telia/Data_Prep/Mobile" }, tags = { "@DataPrep" }, plugin = {
		"pretty", "json:target/cucumber_report/siebel-api-test-cucumber_report.json" })
public class RunCukesTest_DataPrepMobile {
}
