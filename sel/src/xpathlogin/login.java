package xpathlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
	WebDriver	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().minimize();
	Thread.sleep(4000);
	}

}
