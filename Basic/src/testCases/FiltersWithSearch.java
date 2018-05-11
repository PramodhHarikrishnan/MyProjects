package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiltersWithSearch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Supporting Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-digital.feprecisionplus.com/amuk");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		System.out.println("1");
		driver.findElement(By.xpath("//*[@id='advanceSearch']")).click();
		System.out.println("2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='select2-chosen-1']")).click();
		System.out.println("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"s2id_autogen1_search\"]")).sendKeys("Equity"); //Unable to locate textbox with in filter dropdown
		System.out.println("4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"select2-results-1\"]")).click();
		System.out.println("5");
		Thread.sleep(7000);
		String ResultText = driver.findElement(By.xpath("//div[@class='AssetClass fe-section-horizontal-wrap']//span[@class='fe-section-horizontal-val pdfableColumn']")).getText();
		System.out.println(ResultText);
		if(ResultText.equals("Equity")) {
			System.out.println("Asset filter is working as expected");
		}
		else
			System.out.println("Asset filter is not working as expected");
		driver.quit();
	}

}