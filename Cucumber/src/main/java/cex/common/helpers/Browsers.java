package cex.common.helpers;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	static Logger log = LogManager.getLogger(Browsers.class.getName());

	private static String configload = Constant.Path_Config + Constant.File_Config;
	private static String DriverPath = Constant.Path_Drivers;

	static {
		ConfigLoader.loadConfig(configload);
	}

	public static WebDriver getBrowser(WebDriver driver) throws IOException {

		String strBrowser = null;
		try {
			strBrowser = MavenProperties.getBrowser();
			if (strBrowser.equalsIgnoreCase("Mozilla")) {
				System.setProperty("webdriver.gecko.driver", DriverPath + Constant.File_Drivers_Mozilla);
				driver = new FirefoxDriver();
			} else if (strBrowser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", DriverPath + Constant.File_Drivers_Chrome);
				driver = new ChromeDriver();
			} else if (strBrowser.equalsIgnoreCase("IE")) {

				System.setProperty("webdriver.ie.driver", DriverPath + Constant.File_Drivers_IE);
				driver = new InternetExplorerDriver();
				/*
				 * DesiredCapabilities ieCap = new DesiredCapabilities();
				 * ieCap.setCapability("ignoreZoomSetting", true);
				 * ieCap.setCapability("requireWindowFocus", true);
				 * ieCap.setCapability("enablePersistentHover", false); driver = new
				 * InternetExplorerDriver(ieCap); driver.manage().window().maximize();
				 */
			}

		} catch (Exception e) {
			log.error("getBrowser", e);
		}
		return driver;
	}

	public static WebDriver getEnviroment(WebDriver driver) throws IOException {

		String strEnvi = null;
		try {
			strEnvi = MavenProperties.getEnvironment();
			if (strEnvi.equalsIgnoreCase("Prod")) {
				driver.get(Constant.URL_PROD);
			} else if (strEnvi.equalsIgnoreCase("Staging")) {
				driver.get(Constant.URL_Stag);
			} else if (strEnvi.equalsIgnoreCase("QA")) {
				driver.get(Constant.URL_QA);
			}

		} catch (Exception e) {
			log.error("getEnviroment", e);
		}
		return driver;
	}
}
