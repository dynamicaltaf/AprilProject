package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 { //to navigate or backward or forward

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in");
		Thread.sleep(2000);  
		
		driver.navigate().to("https:/www.flipkart.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();
		
		driver.get("https:/www.facebook.com");
		Thread.sleep(2000);
		driver.quit();
	
	
		
		
		
		

	}

}
