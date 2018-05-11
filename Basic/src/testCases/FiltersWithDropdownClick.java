package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiltersWithDropdownClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Supporting Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-digital.feprecisionplus.com/amuk");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='advanceSearch']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
		Thread.sleep(1000);
		String FilterText = driver.findElement(By.xpath("//ul[@id='select2-results-1']")).getText();
		System.out.println(FilterText);
		driver.findElement(By.xpath("//ul[@id='select2-results-1']")).click();
		Thread.sleep(15000);
		String ResultText = driver.findElement(By.xpath("//div[@class='AssetClass fe-section-horizontal-wrap']//span[@class='fe-section-horizontal-val pdfableColumn']")).getText();
		System.out.println(ResultText);
		if(FilterText==ResultText) {
			System.out.println("Asset filter is working as expected");
			}
		else
			System.out.println("Asset filter is not working as expected");
		driver.quit();
	}
}