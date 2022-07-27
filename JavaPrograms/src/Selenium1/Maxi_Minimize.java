package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maxi_Minimize {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
	}

}
