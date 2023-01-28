package methodsofwebdriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.instagram.com/");
                    String currenturl = driver.getCurrentUrl();
	System.out.println(currenturl);
	Thread.sleep(2000);
	driver.close();
}
			
	}


