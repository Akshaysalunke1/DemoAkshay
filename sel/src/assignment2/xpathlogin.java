package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		System.setProperty("\"webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt']")).sendKeys("674739357359");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("569775779");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
