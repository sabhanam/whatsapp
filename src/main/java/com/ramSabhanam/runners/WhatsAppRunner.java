package com.ramSabhanam.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * 
 * @author RamSabhanam
 *
 *	This runner is a sample cucumber runner file.
 *	It's just like any other Cucumber runner file.
 *
 */
@CucumberOptions(
			glue = {"com.ramSabhanam.steps"},
			features = {"src/main/resources/features"}
		)
public class WhatsAppRunner extends AbstractTestNGCucumberTests{

}
