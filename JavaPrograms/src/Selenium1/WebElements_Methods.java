package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement check = driver.findElement(By.xpath("//div[contains(text(),'Create a new account')]"));
		System.out.println(check.getText());
		System.out.println(check.isDisplayed());
		System.out.println(check.getTagName());
		System.out.println(check.isEnabled());
		System.out.println(check.isSelected());
		System.out.println(check.getAttribute("class"));
	//	driver.close();
	}
}
