package cex.project.stepsdefinition;

import cucumber.api.CucumberOptions;
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
@CucumberOptions(features="Features",glue={"StepDefinition"})
public class DigitalFIlter {

	//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Supporting Files\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	@When("^I launch the (.+) url$")
	public void i_launch_the_url(String url) {
		driver.get("https://staging-digital.feprecisionplus.com/amuk");
		driver.manage().window().maximize();
	}

	@Then("^I validate the first result contains search text (.+)$")
	public void i_validate_the_first_result_contains_search_text(String searchtext) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String ResultText = driver.findElement(By.xpath("//div[@class='AssetClass fe-section-horizontal-wrap']//span[@class='fe-section-horizontal-val pdfableColumn']")).getText();
		System.out.println(ResultText);
		if(ResultText.equals("Equity"))
			System.out.println("Asset filter is working as expected");
		else
			System.out.println("Asset filter is not working as expected");
	}

	@And("^I enter (.+) SearchText in the search text box$")
	public void i_enter_searchtext_in_the_search_text_box(String searchtext) {
		driver.findElement(By.xpath("//*[@id='advanceSearch']")).click();
		System.out.println("2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
		System.out.println("3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1_search\"]")).sendKeys("Equity"); //Unable to locate textbox with in filter dropdown
		System.out.println("4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"select2-results-1\"]")).click();
	}
}