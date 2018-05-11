package cex.project.stepsdefinition;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import java.util.concurrent.TimeUnit;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class LoginSteps {

	//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Supporting Files\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	@When("^I launch the url$")
	public void i_launch_the_url() {
		driver.get("https://staging-digital.feprecisionplus.com/axaiom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Then("^I see the logged in page$")
	public void i_see_the_logged_in_page() {
		String title = driver.getTitle();
		if (title == "+Digital – Fund Centre")
			System.out.println("Logged in Succesfully");
		else
			System.out.println("Login Failed");   
	}
	//		boolean title = driver.getTitle() == "+Digital – Fund Centre";
	//		if (title) 
	//			System.out.println("Logged in Succesfully");
	//		else if(!title) 
	//			System.out.println("Login Failed");


	@And("^I enter (.+) GroupName in login page$")
	public void i_enter_groupname_in_login_page(String groupname) {
		driver.findElement(By.xpath("//input[@id='GroupName']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='GroupName']")).sendKeys("Fiinex");    	
	}

	@And("^I enter (.+) UserName in login page$")
	public void i_enter_username_in_login_page(String username) {
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("Demo");
	}

	@And("^I enter (.+) Password in login page$")
	public void i_enter_password_in_login_page(String password) {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("p4ssw0rD");
	}

	@And("^I click on Log In button$")
	public void i_click_on_log_in_button() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

}