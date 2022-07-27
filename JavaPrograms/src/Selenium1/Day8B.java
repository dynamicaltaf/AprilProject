package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8B {   
	                

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login");
			Thread.sleep(1500);
			driver.manage().window().maximize();   
			Thread.sleep(1500);
			
			//xpath by contains using attribute
			// syntax : //tagname[contains[@attribute, attribute value']
			driver.findElement(By.xpath("(//input[contains(@class,'_55r1')])[1]")).sendKeys("altaf.shaikh304@gmail.com");
			Thread.sleep(1500);
			
			//xpath by contains using text
			// syntax : //tagname[contains (text(),'text value')]
			driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
			
			
	}

}
