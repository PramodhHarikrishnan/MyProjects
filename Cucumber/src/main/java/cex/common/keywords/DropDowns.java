package cex.common.keywords;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cex.common.helpers.ExcelUtils;
import cex.common.helpers.TestDataUtil;

public class DropDowns {

	static Logger Log = LogManager.getLogger(DropDowns.class.getName());

	public static boolean SELECTTEXT(WebDriver driver, WebElement element, String colName) {
		boolean kywdResult = false;
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					// WaitCondition.WAITFOROPTIONS(driver, element);
					Select select = new Select(element);
					String sValue = TestDataUtil.GetData(colName);
					select.selectByVisibleText(sValue);
					kywdResult = true;
				}
			}
		} catch (Exception e) {
			Log.error("SELECTTEXT", e);

		}
		return kywdResult;
	}

	public static boolean SELECTBYINDEX(WebDriver driver, WebElement element, int iValue) {
		boolean kywdResult = false;
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					Select select = new Select(element);
					select.selectByIndex(iValue);
					kywdResult = true;
				}
			}
		} catch (Exception e) {
			Log.error("SELECTBYINDEX :", e);
		}
		return kywdResult;
	}

	public static boolean VERIFYSELECTEDOPTION(WebDriver driver, WebElement element, String strExptdVal) {
		boolean kywdResult = false;
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					Select select = new Select(element);
					// WaitCondition.WAITFOROPTIONS(driver, element);
					String sValue = TestDataUtil.GetData(strExptdVal);
					// WaitCondition.WAITFORTEXTPRESENT(driver, element, sValue);
					String strActualValue = select.getFirstSelectedOption().getText();
					if (sValue.equals(strActualValue)) {
						System.out.println(sValue + " and " + strActualValue + " Matched");
					} else {
						System.out.println(sValue + " and " + strActualValue + " Not Matched");
					}
					kywdResult = true;
				}
			}
		} catch (Exception e) {
			Log.error("VERIFYSELECTEDOPTION :", e);
		}
		return kywdResult;
	}

	public static boolean VERIFYOPTION(WebDriver driver, WebElement element, String colName) {
		boolean kywdResult = false;
		String strValue = "";
		try {
			if (element.isDisplayed()) {
				if (element.isEnabled()) {
					Select select = new Select(element);
					List<WebElement> options = select.getOptions();
					if (ExcelUtils.VerifyColName(colName).equalsIgnoreCase(colName)) {
						strValue = ExcelUtils.getCellData(colName);
						for (WebElement we : options) {
							we.getText().equalsIgnoreCase(strValue);
						}
						kywdResult = true;
					} else {
						for (WebElement we : options) {
							we.getText().equalsIgnoreCase(colName);
						}
						kywdResult = true;
					}
				}
			}
		} catch (Exception e) {
			Log.error("VERIFYOPTION :", e);
		}
		return kywdResult;
	}

}
