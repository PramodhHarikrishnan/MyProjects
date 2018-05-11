package cex.common.keywords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cex.common.helpers.TestDataUtil;

public class Elements {

	static Logger Log = LogManager.getLogger(Elements.class.getName());

	public static boolean VERIFYOBJECT(WebDriver driver, WebElement element) {
		boolean kywdResult = false;
		try {
			element.isDisplayed();
			kywdResult = true;
		} catch (Exception e) {
			Log.error("VERIFYOBJECT :", e);
		}
		return kywdResult;
	}

	public static boolean CLICK(WebDriver driver, WebElement element) {
		boolean kywdResult = false;
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					element.click();
					kywdResult = true;
				}
			}
		} catch (Exception e) {

			Log.error("CLICK :", e);
		}
		return kywdResult;
	}

	public static boolean NOTVERIFYOBJECT(WebDriver driver, WebElement element) {
		boolean kywdResult = true;

		try {
			if (element.isDisplayed()) {
				kywdResult = false;
			}
		} catch (Exception e) {

			Log.error("NOTVERIFYOBJECT :", e);
		}

		return kywdResult;
	}

	public static boolean MOUSECLICK(WebDriver driver, WebElement element) {
		boolean kywdResult = false;
		try {

			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					Actions actions = new Actions(driver);
					actions.moveToElement(element).click(element).build().perform();
					/*
					 * actions.moveToElement(element); actions.click(); actions.perform();
					 */
					kywdResult = true;
				}
			}
		} catch (Exception e) {

			Log.error("MOUSECLICK :", e);
		}
		return kywdResult;
	}

	public static boolean MOUSEHOVER(WebDriver driver, WebElement element) {
		boolean kywdResult = false;
		try {

			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					Actions actions = new Actions(driver);
					actions.moveToElement(element).build().perform();
					kywdResult = true;
				}
			}
		} catch (Exception e) {

			Log.error("MOUSEHOVER :", e);
		}
		return kywdResult;
	}

	public static boolean ENTERVALUE(WebDriver driver, WebElement element, String colName) {
		boolean kywdResult = false;
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					element.clear();
					element.click();
					String sValue = TestDataUtil.GetData(colName);
					element.sendKeys(sValue);
					kywdResult = true;
				}
			}
		} catch (Exception e) {

			Log.error("ENTERVALUE :", e);
		}
		return kywdResult;
	}

	public static String GETVALUE(WebDriver driver, WebElement element) {
		String strValue = "";

		try {
			strValue = element.getText().trim();

		} catch (Exception e) {
			Log.error("GETVALUE :", e);
		}
		return strValue;
	}

	public static boolean GETVALUE(WebDriver driver, WebElement element, String colName) {
		boolean kywdResult = false;
		String strValue = "";
		try {
			strValue = element.getText().trim();
			TestDataUtil.SetData(colName, strValue);
			kywdResult = true;

		} catch (Exception e) {
			Log.error("GETVALUE :", e);
		}
		return kywdResult;
	}

	public static boolean GETVALUES(WebDriver driver, List<WebElement> elements, String colName) throws Exception {
		boolean kywdResult = false;
		ArrayList<String> elementTexts = new ArrayList<String>();
		try {

			Iterator<WebElement> elementsIT = elements.iterator();
			while (elementsIT.hasNext()) {
				WebElement option = elementsIT.next();
				elementTexts.add(option.getText());
			}

			TestDataUtil.SetDataList(colName, elementTexts);
			kywdResult = true;

		} catch (Exception e) {
			Log.error("GETVALUE :", e);

			throw new Exception(e);
		}
		// return elementTexts;
		return kywdResult;
	}

	public static ArrayList<String> GETVALUES(WebDriver driver, List<WebElement> elements) throws Exception {
		ArrayList<String> elementTexts = new ArrayList<String>();
		try {
			Iterator<WebElement> elementsIT = elements.iterator();
			while (elementsIT.hasNext()) {
				WebElement option = elementsIT.next();
				elementTexts.add(option.getText());
			}
			// TestDataUtil.SetDataList(colName, elementTexts);
		} catch (Exception e) {
			Log.error("GETVALUE :", e);
			throw new Exception(e);
		}
		return elementTexts;
	}

	public static String GETTITLE(WebDriver driver) {
		String strValue = "";

		try {
			strValue = driver.getTitle();

		} catch (Exception e) {
			Log.error("GETTITLE :", e);
		}
		return strValue;
	}

	public static boolean VERIFYVALUE(WebDriver driver, WebElement element, String strExpVal) {
		boolean kywdResult = false;
		String strActlVal = "";

		try {
			strActlVal = element.getText().trim();
			// TestDataUtil.SetData(colName,strValue);
			String sValue = TestDataUtil.GetData(strExpVal);
			if (sValue.equals(strActlVal)) {
				System.out.println(sValue + " and " + strActlVal + " Matched");
			} else {
				System.out.println(sValue + " and " + strActlVal + " Not Matched");
			}
			kywdResult = true;
		} catch (Exception e) {
			Log.error("VERIFYVALUE :", e);
		}
		return kywdResult;
	}
}
