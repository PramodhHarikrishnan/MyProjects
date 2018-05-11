package cex.project.modules;

import org.openqa.selenium.WebDriver;

import cex.common.keywords.Elements;
import cex.common.keywords.WaitCondition;
import cex.project.pageobjects.Login_ui;

public class Logindetails_action extends Login_ui {

	public Logindetails_action(WebDriver driver) {
		super(driver);
	}

	public boolean EnterGroupName(String sGroup) throws Exception {

		WaitCondition.WAITFORELEMENT(driver, Group_txt);
		WaitCondition.WAITFORSECONDS(2);

		return Elements.ENTERVALUE(driver, Group_txt, sGroup);
	}

	public boolean EnterUserName(String sUser) throws Exception {

		return Elements.ENTERVALUE(driver, user_txt, sUser);
	}

	public boolean EnterPassword(String sPass) throws Exception {

		return Elements.ENTERVALUE(driver, Password_txt, sPass);
	}

	public boolean ClickLogin() throws Exception {

		// Login_button.click();
		return Elements.CLICK(driver, Login_button);
	}

	public boolean DefaultPage(String sdisplay) throws Exception {

		WaitCondition.WAITFORELEMENT(driver, DisplayName);
		Elements.GETVALUE(driver, DisplayName, sdisplay);

		return Elements.VERIFYVALUE(driver, DisplayName, sdisplay);
	}

	public static void Logout(WebDriver driver) {
		try {
			if (Elements.VERIFYOBJECT(driver, Logout_button)) {

				Elements.CLICK(driver, Logout_button);
				System.out.println("Logout Happend");
			}
		} catch (Exception e) {

			System.out.println("No Failure to logout");
		}
	}

}
