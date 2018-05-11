package cex.project.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cex.common.helpers.ConfigLoader;
import cex.common.helpers.Constant;
import cex.common.helpers.MavenProperties;
import cex.common.keywords.Elements;
import cex.common.keywords.WaitCondition;
import cex.common.keywords.Windows;
import cex.project.pageobjects.Login_ui;

public class Login_action extends Login_ui {

	private static String configload = Constant.Path_Config + Constant.File_Config;

	public Login_action(WebDriver driver) {
		super(driver);
		ConfigLoader.loadConfig(configload);
	}

	public void LoginDetails() throws Exception {

		WaitCondition.WAITFORELEMENT(driver, Group_txt);
		System.out.println(Elements.GETTITLE(driver));

		Elements.ENTERVALUE(driver, Group_txt, "DP:GroupName");
		Elements.ENTERVALUE(driver, user_txt, "DP:UserName");
		Elements.ENTERVALUE(driver, Password_txt, "DP:Password");

		Elements.CLICK(driver, Login_button);
	}

	public void LogoutDetails() throws Exception {

		WaitCondition.WAITFORELEMENT(driver, DisplayName);
		Elements.GETVALUE(driver, DisplayName, "DP:DisplayText");
		/*
		 * String a = Elements.GETVALUE(driver, DisplayName);
		 * Elements.MOUSEHOVER(driver, Default_ui.Charts_secs);
		 * Elements.MOUSECLICK(driver, Default_ui.Roll_chart);
		 * Elements.CLICK(driver,Logout_button);
		 * WaitCondition.WAITFORELEMENT(driver,Login_button);
		 * Elements.VERIFYOBJECT(driver, Login_button);
		 */
	}

	public void Logout() {

		if ((MavenProperties.getBrowser()).equalsIgnoreCase("API")) {

			System.out.println("API Testing Completed");
		} else {

			try {
				Windows.CLOSEALLOPENWINDOWS(driver);
				Elements.VERIFYOBJECT(driver, Logout_button);
				Elements.CLICK(driver, Logout_button);
				WaitCondition.WAITFORELEMENT(driver, Login_button);
				Elements.VERIFYOBJECT(driver, Login_button);
				System.out.println("Logout Happend");

			} catch (WebDriverException e) {

				System.out.println("WebDriverException: " + e.getMessage());
			}
		}
	}

}
