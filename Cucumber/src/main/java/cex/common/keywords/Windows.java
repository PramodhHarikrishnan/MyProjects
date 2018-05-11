package cex.common.keywords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Windows {

	static Logger log = LogManager.getLogger(Windows.class.getName());

	public static boolean FOCUSWINDOW(WebDriver driver) {
		boolean kywdResult = false;
		try {
			for (String handles : driver.getWindowHandles()) {
				driver.switchTo().window(handles);
			}
			driver.manage().window().maximize();
			kywdResult = true;
		} catch (Exception e) {
			log.error("FOCUSWINDOW", e);
		}
		return kywdResult;
	}

	public static boolean CLOSEWINIDOW(WebDriver driver) {
		boolean kywdResult = false;
		try {
			driver.close();
			FOCUSWINDOW(driver);
			kywdResult = true;
		} catch (Exception e) {
			log.error("CLOSEWINIDOW", e);
		}
		return kywdResult;
	}

	public static boolean PARENTWINDOW(WebDriver driver) {
		boolean kywdResult = false;
		String strWindowHandle = driver.getWindowHandles().toArray()[0].toString();
		try {
			driver.switchTo().window(strWindowHandle);
			driver.manage().window().maximize();
			kywdResult = true;
		} catch (Exception e) {
			log.error("PARENTWINDOW", e);
		}
		return kywdResult;
	}

	public static boolean CLOSEALLOPENWINDOWS(WebDriver driver) {
		boolean kywdResult = false;
		String strMainWindow = driver.getWindowHandles().toArray()[0].toString();
		try {
			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(strMainWindow)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}
			driver.switchTo().window(strMainWindow);
			kywdResult = true;
		} catch (Exception e) {
			log.error("CLOSEALLOPENWINDOWS", e);
		}
		return kywdResult;
	}
}
