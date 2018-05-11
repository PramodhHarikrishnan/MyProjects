package cex.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_ui {

	protected final WebDriver driver;

	public Login_ui(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Create every webelement in protected(which will not allow other actions to
	// use this webelements),
	// if your what any webelement to be used in other actions or stepdef make it as
	// protected static

	@FindBy(how = How.ID, using = "txtGroup")
	protected WebElement Group_txt;

	@FindBy(how = How.ID, using = "txtUser")
	protected WebElement user_txt;

	@FindBy(how = How.ID, using = "txtPassword")
	protected WebElement Password_txt;

	@FindBy(how = How.XPATH, using = "//*[@class='user-name']")
	protected WebElement DisplayName;

	@FindBy(how = How.ID, using = "btnAction")
	public static WebElement Login_button;

	@FindBy(how = How.XPATH, using = "//a[@title='Logout']/img")
	public static WebElement Logout_button;

}
