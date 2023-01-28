package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectbyindex {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/DELL/Desktop/automation/dropdown.html");
		
		                  WebElement dropdownelement = driver.findElement(By.id("menu"));
		                  
		                                Select sel = new Select(dropdownelement);
		                                Thread.sleep(3000);
		                                sel.selectByIndex(7);
		                                Thread.sleep(3000);
		                
		                                sel.deselectByIndex(7);
		           
		                               
	}

}
