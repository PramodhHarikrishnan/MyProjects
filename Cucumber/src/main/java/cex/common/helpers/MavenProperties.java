package cex.common.helpers;

public class MavenProperties {

	private static String configload = Constant.Path_Config + Constant.File_Config;

	static {
		ConfigLoader.loadConfig(configload);
	}

	public static String getBrowser() {
		String strBrowser = null;

		try {
			strBrowser = System.getProperties().get(Constant.BROWSER_TYPE).toString();
		} catch (Exception e) {
			strBrowser = ConfigLoader.getValue(Constant.BROWSER_TYPE);
		}

		return strBrowser;
	}

	public static String getEnvironment() {
		String strBrowser = null;

		try {
			strBrowser = System.getProperties().get(Constant.ENVIROMENT_TYPE).toString();
		} catch (Exception e) {
			strBrowser = ConfigLoader.getValue(Constant.ENVIROMENT_TYPE);
		}

		return strBrowser;
	}

}
