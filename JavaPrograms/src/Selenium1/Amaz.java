package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz {
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
			WebDriver driver = new ChromeDriver ();
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
		driver.findElement(By.xpath("//a[contains(@id,'nav-link-accountList')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		Thread.sleep(2000);

	}

}
