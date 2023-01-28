package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quention2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.xpath("//a[.='Open a popup window']"));
		 Thread.sleep(4000);	
		 
		  Set<String> allHandles = driver.getWindowHandles();
		 for(String wh:allHandles)
		 {
			 driver.switchTo().window(wh).close();
			 
		 }
	}

}
