package methodsofwebdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesourcemethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
         driver.get("\"https://www.instagram.com/");
               String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		Thread.sleep(2000);
		driver.close();
		System.out.println(sourcecode);
		
	}

}
