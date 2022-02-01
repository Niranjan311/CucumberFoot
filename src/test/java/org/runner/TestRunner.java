package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", dryRun = false, tags = {
		"@smoke" }, plugin = { "pretty", "html:src\\test\\resources\\Reports",
				"json:src\\test\\resources\\Reports\\jsonReport.json",
				"junit:src\\test\\resources\\Reports\\junitReport.xml",
				"rerun:src\\test\\resources\\FailedScenario\\failed.txt" }, monochrome = true)
public class TestRunner {
	// FootLocker
	@BeforeClass
	public static void beforeclass() {
		System.out.println("-----------Start-----------");
	}

	@AfterClass
	public static void jsonReport() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\jsonReport.json");
		System.out.println("-----------Report generated-----------");
	}
}
