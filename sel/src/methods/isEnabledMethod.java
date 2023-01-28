package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabledMethod {

	public static void main(String[] args, WebElement loginButton) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("akshay123");
		driver.findElement(By.name("password")).sendKeys("idontknow");
		    loginButton = driver.findElement(By.xpath(""))
		    		   status = loginButton.isEnabled();
		     System.out.println(status);
	}

}
