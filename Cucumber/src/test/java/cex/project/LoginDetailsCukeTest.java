package cex.project;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cex.project.util.Hooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "test/resources/features/LoginDetails.feature", format = { "pretty",
		"html:target/cucumber/LoginDetails", "json:target/cucumber.json" })
public class LoginDetailsCukeTest {

	@BeforeClass
	public static void Testing1() throws IOException {
		// new BaseClass().getDriver();
		// BaseClass.driver.quit();
		Hooks.openBrowser();
	}

	@AfterClass
	public static void Testing() throws IOException {
		// new BaseClass().destroyDriver();

		Hooks.closebowser();
	}

}
