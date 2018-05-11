package cex.common.keywords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cex.common.helpers.ConfigLoader;
import cex.common.helpers.Constant;
import cex.common.helpers.TestDataUtil;

public class WaitCondition {

	static Logger Log = LogManager.getLogger(WaitCondition.class.getName());

	private static String configload = Constant.Path_Config + Constant.File_Config;

	static {
		ConfigLoader.loadConfig(configload);
	}

	public static void WAITFORSECONDS(int secs) {

		try {
			String seconds = Integer.toString(secs);
			Thread.sleep(Integer.parseInt(seconds) * 1000);
			System.out.println("Waited for " + seconds + " seconds");
		} catch (Exception e) {
			Log.error("WAITFORSECONDS :", e);
		}
	}

	public static WebElement WAITFORELEMENT(WebDriver driver, WebElement element) {

		try {
			long WaitTime = Integer.parseInt(ConfigLoader.getValue(Constant.OBJECT_WAIT_TIME));
			element = new WebDriverWait(driver, WaitTime).until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			Log.error("WAITFORELEMENT :", e);
		}
		return element;

	}

	public static String WAITFORDRODWNOPTION(WebDriver driver, String strName) {

		try {
			String strSam = new StringBuilder().append("//option[.='").append("PARA_OPTION").append("']/parent::*")
					.toString();
			String sValue = TestDataUtil.GetData(strName);
			WebElement element = driver.findElement(By.xpath(strSam.replace("PARA_OPTION", sValue)));

			long WaitTime = Integer.parseInt(ConfigLoader.getValue(Constant.OBJECT_WAIT_TIME));
			element = new WebDriverWait(driver, WaitTime).until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			Log.error("WAITFORDRODWNOPTION :", e);
		}
		return strName;

	}

	public static boolean WAITFORTEXTPRESENT(WebDriver driver, WebElement element, String strtext) {
		boolean WAITFORTEXTPRESENT = false;
		try {
			long WaitTime = Integer.parseInt(ConfigLoader.getValue(Constant.OBJECT_WAIT_TIME));

			WAITFORTEXTPRESENT = new WebDriverWait(driver, WaitTime)
					.until(ExpectedConditions.textToBePresentInElement(element, strtext));
			WAITFORTEXTPRESENT = true;
		} catch (Exception e) {

			Log.error("WAITFORTEXTPRESENT :", e);
		}
		return WAITFORTEXTPRESENT;

	}

}
