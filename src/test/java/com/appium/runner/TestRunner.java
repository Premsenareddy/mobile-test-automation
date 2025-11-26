package com.appium.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/com/appium/features",
		glue = { "com/appium/stepDefinitions" }, // path of step definition
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		tags = "@personalFinance",


		monochrome = true

		//dryRun = false,
		) // check all the steps have the definitions and will not execute



public class TestRunner extends AbstractTestNGCucumberTests {
}
