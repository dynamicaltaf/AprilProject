package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo { //div[text()='Orders']

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Actions option = new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
	    WebElement Electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		option.moveToElement(Electronics).perform();
		
	}

}
