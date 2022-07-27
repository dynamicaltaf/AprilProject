package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();   
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Altaf");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Muddassar");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("altaf.shaikh304@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("altaf.shaikh304@gmail.com");
		Thread.sleep(1000);
		
	//	driver.findElement(By.xpath("(//input[@type='text'])[1]")).clear();
		
	//	driver.findElement(By.xpath("(//input[@type='text'])")).getScreenshotAs(null);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("qwerty1234");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("qwerty1234");
		Thread.sleep(1000);
		

	}

}
