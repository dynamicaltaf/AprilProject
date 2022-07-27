package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quite {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();   //upcasting
			driver.get("https://www.amazon.in");
			
			driver.switchTo().newWindow(WindowType.TAB);  //To open new window in browser
			driver.get("https://www.whatsapp.com/");
			Thread.sleep(4000);
			
			driver.close();       //tab close
			Thread.sleep(3000);
			
			driver.quit();   //browser close
		}

	}
