package assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

   public class quention4 {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		       String ParentHandles = driver.getWindowHandle();
		       System.out.println(ParentHandles);
		       System.out.println("---------------------------------");
		          Set<String> allHandles = driver.getWindowHandles();
		          
		          for (String wh:allHandles)
		          {
		        	  
		          System.out.println(wh);
		        	  if (!ParentHandles.equals(wh))
		        		  
		        	  {
		        		  driver.switchTo().window(wh).close();
		        	  }
		          }
	}
   }
		        	  	        		  
		        	  	


