package cex.common.helpers;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestDataUtil {

	static Logger log = LogManager.getLogger(TestDataUtil.class.getName());

	public static String GetData(String strKey) throws Exception {
		String strValue = strKey.trim();
		String strPattern = "DP:";
		try {
			if (strKey.contains(strPattern)) {
				String strValue1 = strValue.split(strPattern)[1].toString();
				String DPlength = strValue.split(strValue1)[0];
				int length1 = DPlength.length();

				if (strPattern.equalsIgnoreCase(DPlength)) {
					if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
						strValue = ExcelUtils.getCellData(strValue1);
					} else {
						throw new IOException("sorry invalid Column");
					}
				} else {
					if (length1 > 3) {
						String strValueCol = strValue.split(strPattern)[0];
						int ivalue = Integer.parseInt(strValueCol);
						if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
							strValue = ExcelUtils.getCellData(strValue1, ivalue);
						} else {
							throw new IOException("sorry invalid Column");
						}
					}
				}
			} else {

				if (strValue == "null") {
					strValue = strKey;
				}
				// System.out.println("invalid");
			}
		} catch (Exception e) {
			log.error("GetData", e);
			throw new Exception(e);

		}

		return strValue;

	}

	public static void SetData(String strKey, String sVal) throws Exception {
		String strValue = strKey;
		String strPattern = "DP:";
		try {
			if (strKey.contains(strPattern)) {
				String strValue1 = strKey.split(strPattern)[1].toString();
				String DPlength = strValue.split(strValue1)[0];
				int length1 = DPlength.length();

				if (strPattern.equalsIgnoreCase(DPlength)) {
					if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
						ExcelUtils.setCellData(strValue1, sVal);
					} else {
						throw new IOException("sorry invalid Column");
					}

				} else {
					if (length1 > 3) {
						String strValueCol = strKey.split(strPattern)[0];
						int ivalue = Integer.parseInt(strValueCol);
						if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
							ExcelUtils.setCellData(strValue1, sVal, ivalue);
						} else {
							throw new IOException("sorry invalid Column");
						}
					}
				}
			} else {

				throw new IOException("sorry invalid Column or Pattern");
			}
		} catch (Exception e) {
			log.error("SetData", e);
			throw new Exception(e);
		}

	}

	public static void SetDataList(String strKey, ArrayList<String> strList) throws Exception {
		String strValue = strKey;
		String strPattern = "DP:";
		try {
			if (strKey.contains(strPattern)) {
				String strValue1 = strKey.split(strPattern)[1].toString();
				String DPlength = strValue.split(strValue1)[0];
				int length1 = DPlength.length();
				if (strPattern.equalsIgnoreCase(DPlength)) {
					if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
						// ExcelUtils.setListOfData(strValue1, strList);
						int ivalue = 0;
						for (String w : strList) {
							ivalue++;
							ExcelUtils.setCellData(strValue1, w, ivalue);
						}
					} else {
						throw new IOException("sorry invalid Column");
					}
				} else {
					if (length1 > 3) {
						throw new IOException("Iteration cannot be used");
					}
				}
			} else {
				throw new IOException("sorry invalid Column or Pattern");
			}
		} catch (Exception e) {
			log.error("SetData", e);
			// throw new Exception(e);
		}
	}

	public static WebElement ReplaceParamData(WebDriver driver, String xpath, String... strKey) {

		WebElement element = null;

		String strValue = new StringBuffer(xpath).toString();

		String strPatter1 = "<<";
		String strPatter2 = ">>";
		String adr = null;
		int i = 0;
		int j = 1;

		String strParam = null;
		try {
			String[] split1 = strValue.split(strPatter1);
			for (String w : split1) {
				if (w.contains(strPatter2)) {
					String test = w.split(strPatter2)[0];
					adr = strPatter1.concat(test).concat(strPatter2).toString();
					if (strValue.contains(strPatter1)) {
						if (w == split1[j]) {
							for (String data : strKey) {
								strParam = GetData(data);
								if (data == strKey[i]) {
									strValue = strValue.replace(adr, strParam);
									strValue = strValue.replace(adr, strParam);
								}
							}
						}
					}
					i++;
					j++;
				}
			}

			// System.out.println(strValue);
			element = driver.findElement(By.xpath(strValue));
		} catch (Exception e) {
			log.error("ReplaceParamData", e);

		}

		return element;
	}

	public static String GetDataWithIndex(String strKey, int rows) {
		String strValue = strKey.trim();
		String strPattern = "DP:";
		try {
			if (strKey.contains(strPattern)) {
				String strValue1 = strValue.split(strPattern)[1].toString();
				String DPlength = strValue.split(strValue1)[0];
				int length1 = DPlength.length();

				if (strPattern.equalsIgnoreCase(DPlength)) {
					if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
						strValue = ExcelUtils.getCellData(strValue1, rows);
					} else {
						throw new IOException("sorry invalid Column");
					}
				} else {
					if (length1 > 3) {
						String strValueCol = strValue.split(strPattern)[0];
						int ivalue = Integer.parseInt(strValueCol);
						if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
							strValue = ExcelUtils.getCellData(strValue1, ivalue);
						} else {
							throw new IOException("sorry invalid Column");
						}
					}
				}
			} else {

				if (strValue == "null") {
					strValue = strKey;
				}
				// System.out.println("invalid");
			}
		} catch (Exception e) {
			log.error("GetData", e);
		}
		return strValue;
	}

	public static void SetDataWithIndex(String strKey, String sVal, int rows) throws Exception {
		String strValue = strKey;
		String strPattern = "DP:";
		try {
			if (strKey.contains(strPattern)) {
				String strValue1 = strKey.split(strPattern)[1].toString();
				String DPlength = strValue.split(strValue1)[0];
				int length1 = DPlength.length();

				if (strPattern.equalsIgnoreCase(DPlength)) {
					if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
						ExcelUtils.setCellData(strValue1, sVal, rows);
					} else {
						throw new IOException("sorry invalid Column");
					}

				} else {
					if (length1 > 3) {
						String strValueCol = strKey.split(strPattern)[0];
						int ivalue = Integer.parseInt(strValueCol);
						if (ExcelUtils.VerifyColName(strValue1).equalsIgnoreCase(strValue1)) {
							ExcelUtils.setCellData(strValue1, sVal, ivalue);
						} else {
							throw new IOException("sorry invalid Column");
						}
					}
				}
			} else {

				throw new IOException("sorry invalid Column or Pattern");
				// System.out.println("invalid Column");
			}
		} catch (Exception e) {
			log.error("SetData", e);
			throw new Exception(e);
		}

	}
}
