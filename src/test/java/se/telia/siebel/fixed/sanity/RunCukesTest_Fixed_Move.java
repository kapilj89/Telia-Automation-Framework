package se.telia.siebel.fixed.sanity;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/se/telia/SanityPackage/Fixed"},
		tags = {"@@Sanitymove"},
		        plugin = {"pretty",
		                "json:target/cucumber_report/Move/siebel-api-test-cucumber_report.json"
		                 }
		)

public class RunCukesTest_Fixed_Move {
}
