package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
	//	String result = text.getText();
	//	System.out.println(result);
           
		// or we can use following method to achieve this task
		System.out.println(text.getText());
		
	}

}
