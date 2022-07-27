package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

		public static void main(String[] args) throws InterruptedException {
			//set the path of executable browser driver 
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();   //upcasting
			driver.get("https://www.amazon.com/");
			
			Thread.sleep(5000);  //5000 milisec = 5 sec (pause)
			
			driver.navigate().to("https://www.flipkart.com/");
			Thread.sleep(3000);
			
			driver.navigate().forward();
			Thread.sleep(4000);
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
			driver.navigate().wait();
			Thread.sleep(2000);
			
			driver.navigate().notify();
			Thread.sleep(2000);
			
			driver.navigate().hashCode();
			Thread.sleep(2000);
			
			driver.getWindowHandle();
			Thread.sleep(2000);
			
			driver.close();
			
			WebDriver driver1 = new ChromeDriver();  
			driver1.get("https://www.whatsapp.com/");
			
			driver.navigate().back();
			Thread.sleep(4000);		
			
		}

	}

