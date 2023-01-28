package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementmethod {
	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("");
		 WebElement usernameTextBox = driver.findElement(By.xpath(""));
		 usernameTextBox.sendKeys("");
		 System.out.println(usernameTextBox);
	}

}
