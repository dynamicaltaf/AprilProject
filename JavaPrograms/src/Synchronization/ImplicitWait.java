package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//debricated = expired(update) it will remove in next version
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN); //keys. to use keyboard buttons R=Enter
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
}
}