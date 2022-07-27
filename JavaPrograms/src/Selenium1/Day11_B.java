package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day11_B {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y = new Select(year);
		List<WebElement> options = y.getOptions();
		System.out.println(options.size());
		for (int i = 0; i<= options.size()-1; i++) {
			System.out.println(options.get(i).getText());
		}
		
	}
}
