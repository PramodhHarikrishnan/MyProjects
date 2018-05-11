package cex.common.helpers;

public interface Constant {

	// URL
	public static final String URL_PROD = "https://analytics.financialexpress.net/login.aspx";
	public static final String URL_Stag = "https://staginganalytics.financialexpress.net/login.aspx";
	public static final String URL_QA = "https://qaanalytics.financialexpress.net/login.aspx";

	// TestData
	public static final String Path_TestData = "./test/resources/testdata/";
	public static final String File_TestData = "SampleTest.xlsx";

	// Load INput File
	public static final String File_DevVsQA = "DevVsQA_POSTPOC.xlsx";
	public static final String File_QaVsStaging = "QAVsStaging_POSTPOC.xlsx";

	// Config Files
	public static final String Path_Config = "./test/resources/config/";
	public static final String File_Config = "config.properties";
	public static final String DBFile_Config = "DBConfig.properties";

	// Driver
	public static final String Path_Drivers = "./resources/drivers/";
	public static final String File_Drivers_Chrome = "chromedriver.exe";
	public static final String File_Drivers_Mozilla = "geckodriver.exe";
	public static final String File_Drivers_IE = "IEDriverServer.exe";

	// Wait Condition
	public static final String PAGELOAD_WAIT_TIME = "PAGELOAD_WAIT_TIME";
	public static final String SCRIPT_WAIT_TIME = "SCRIPT_WAIT_TIME";
	public static final String OBJECT_WAIT_TIME = "OBJECT_WAIT_TIME";

	//
	public static final String BROWSER_TYPE = "browsertype";
	public static final String ENVIROMENT_TYPE = "Environment";

}
