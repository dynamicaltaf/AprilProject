package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {
		public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twitter.com");
		Thread.sleep(1500);   
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//span[contains(text(),'Sign up with p')]")).click();
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Altaf Muddassar");
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8483858395");
		driver.findElement(By.xpath("//select[@id='SELECTOR_1']/option[9]")).click();
		driver.findElement(By.xpath("//select[@id='SELECTOR_2']/option[31]")).click();
		driver.findElement(By.xpath("//select[@id='SELECTOR_3']/option[29]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input")).sendKeys("12345");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	
	}
}

