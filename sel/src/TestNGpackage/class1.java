package TestNGpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 {
	@Test(enabled = true)
	public void sql() {

		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("sql");
		Reporter.log("method of class 1", true);

	}
}
