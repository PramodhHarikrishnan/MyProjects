package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Supporting Files\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging-digital.feprecisionplus.com/axaiom");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='GroupName']")).isDisplayed();
		driver.findElement(By.xpath("//input[@id='GroupName']")).isEnabled();
		driver.findElement(By.xpath("//input[@id='GroupName']")).isSelected();
		driver.findElement(By.xpath("//input[@id='GroupName']")).sendKeys("Finex");
		driver.findElement(By.xpath("//input[@id='Name']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("p4ssw0rD");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean title = driver.getTitle() == "+Digital – Fund Centre";
		if (title) 
			System.out.println("Logged in Succesfully");
		else if(!title) 
			System.out.println("Login Failed");
		driver.quit();
	}
}