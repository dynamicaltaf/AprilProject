package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();   
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("altaf.shaikh304@gmail.com");
                                                                //sendKeys = username/email/etc
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value = '1']")).click();
		driver.findElement(By.xpath("//div[@id='mount_0_0_Cr']")).click();

	}

}
