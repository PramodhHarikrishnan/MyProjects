package cex.project.util;

import java.io.IOException;

import cex.project.modules.Login_action;
import cex.project.modules.Logindetails_action;

public class ActionContainer extends BaseClass {

	public Login_action loginaction;
	public Logindetails_action logindetail;

	public ActionContainer() throws IOException {
		super();
		initPages();
	}

	private void initPages() {
		loginaction = new Login_action(driver);
		logindetail = new Logindetails_action(driver);
	}

}
