package assignments;

import java.time.Duration;  //how to use parent and child browser

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quention1 {
	public static void main(String[] args) throws InterruptedException { 
	
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
			Thread.sleep(2000);
			
		
			driver.quit();
	
		
	}

}
