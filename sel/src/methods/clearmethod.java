package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearmethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=bdd7u2duo1inp");
		         WebElement usernameTextBox = driver.findElement(By.name("username");
		         usernameTextBox.sendKeys("Admin");
		         WebElement passwordTextBox = driver.findElement(By.name("password");
		         passwordTextBox.sendKeys("");
		         Thread.sleep(2000);
		
	}

}
