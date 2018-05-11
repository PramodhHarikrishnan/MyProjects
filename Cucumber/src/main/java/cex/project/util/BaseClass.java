package cex.project.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cex.common.helpers.Browsers;
import cex.common.helpers.MavenProperties;

public class BaseClass {

	public static WebDriver driver;

	public BaseClass() throws IOException {

		InstanceCheck();

	}

	public void InstanceCheck() throws IOException {

		if (MavenProperties.getBrowser().equalsIgnoreCase("API")) {

		} else {
			if (driver == null)
				createNewDriverInstance();
		}

	}

	public static WebDriver createNewDriverInstance() throws IOException {
		try {
			driver = Browsers.getBrowser(driver);
			driver.manage().deleteAllCookies();
			driver = Browsers.getEnviroment(driver);
			driver.manage().window().maximize();
		} catch (WebDriverException e) {
			System.out.println("WebDriverException: " + e.getMessage());
		}
		return driver;

	}

	public WebDriver getDriver() {

		return driver;
	}

	public void destroyDriver() {
		driver.quit();
		driver = null;
	}

}