package TestNGpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class2 {
  @Test
  public void selnium() {
	  
 	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://www.google.com/");
			driver.switchTo().activeElement().sendKeys("selenium");
			Reporter.log("method of class 2",true);
  }
}
