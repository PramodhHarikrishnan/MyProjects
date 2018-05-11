package cex.project.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Hooks {

	public static WebDriver driver;

	/**
	 * @Before Delete all cookies at the start of each scenario to avoid shared
	 *         state between tests
	 * 
	 * @throws IOException
	 */

	public static void openBrowser() throws IOException {
		System.out.println("Called openBrowser");
		driver = new BaseClass().getDriver();
	}

	/*
	 * @After Embed a screenshot in test report if test is marked as failed
	 */

	public static void closebowser() throws IOException {
		new BaseClass().destroyDriver();
		System.out.println("Closed the browser");

	}

}