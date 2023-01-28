package methodsofwebdriver1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtomethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		Thread.sleep(4000);
		
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	      driver.navigate().refresh();
	      Thread.sleep(4000);
	      driver.close();
		
		
		Thread.sleep(4000);
	}

}
