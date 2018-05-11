package cex.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cex.common.helpers.TestDataUtil;

public class Default_ui {

	protected final WebDriver driver;

	public Default_ui(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Acive List

	@FindBy(how = How.XPATH, using = " //div[not(@class='buttons')]/button[normalize-space(.)='SKIP FOR NOW']")
	protected WebElement B2C_Skip;

	@FindBy(how = How.ID, using = "Universe")
	protected WebElement Univse_drpdwn;

	@FindBy(how = How.ID, using = "ListManager")
	protected WebElement FundGrp_dropdwn;

	@FindBy(how = How.XPATH, using = "//option[.='Anpero Capital Limited']/parent::*")
	protected WebElement FundGrp_Name;

	protected WebElement UnivOptionName(WebDriver driver, String strFundName) {
		// String xpath = "//option[.='P1:']/parent::*/parent::*";
		WebElement element = TestDataUtil.ReplaceParamData(driver, "//option[.='<<P1>>']/parent::*/parent::*",
				strFundName);
		return element;
	}

	protected WebElement FundGrpOptionName(WebDriver driver, String strFundName) {
		String test = "ListManager";
		String test1 = "select";
		WebElement element = TestDataUtil.ReplaceParamData(driver, "//option[.='<<P1>>']/parent::<<P2>>[@id='<<P3>>']",
				strFundName, test1, test);
		return element;
	}

	protected WebElement FundOptionName(WebDriver driver, String strFundName) {
		WebElement element = TestDataUtil.ReplaceParamData(driver,
				"//option[.='<<P1>>']/parent::select[@id='ListFund']", strFundName);
		return element;
	}

	@FindBy(how = How.ID, using = "ListFund")
	protected WebElement Fund_drpdwn;

	@FindBy(how = How.ID, using = "lblInstrAddnew")
	protected WebElement FundAdd_btn;

	@FindBy(how = How.ID, using = "btnRun")
	protected WebElement Go_btn;

	// Table OR
	@FindBy(how = How.XPATH, using = "//a[@id='lkTableMenu']/span")
	protected WebElement Tables_secs;

	@FindBy(how = How.ID, using = "PerformanceTableMenu")
	protected WebElement Perf_table;

	// Chart OR
	@FindBy(how = How.XPATH, using = "//a[@id='lkChartMenu']/span")
	protected WebElement Charts_secs;

	@FindBy(how = How.ID, using = "RollingChartMenu")
	protected WebElement Roll_chart;

}
