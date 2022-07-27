package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_F { //Date/Month/Year automate by diff methods

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select d = new Select(date);
		d.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select m = new Select(month);
		m.selectByIndex(7);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select y = new Select(year);
		y.selectByVisibleText("2005");
		
		
	}
}
