package actionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mausehvoer {
	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		System.setProperty("\"webdriver.chrome.driver","./drivers/chromedriver.exe");

				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.get("https://www.selenium.dev/downloads/");
			
				            
		
			}
	}


