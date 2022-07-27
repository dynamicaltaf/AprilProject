package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Log {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login");
			Thread.sleep(1500);
			driver.manage().window().maximize();   
			Thread.sleep(1500);
			
			driver.findElement(By.xpath("//*[@id ='login_form']/div/div[1]/input")).sendKeys("altaf.shaikh304@gmail.com");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id ='login_form']/div/div[2]/div/div/input")).sendKeys("Password");
			driver.findElement(By.xpath("//*[@id='loginform']/div[3]/button")).click();
			
	}

}
