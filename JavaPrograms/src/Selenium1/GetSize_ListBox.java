package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSize_ListBox {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select s = new Select(year);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("size of list box = "+size);
		
	/*	WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select t = new Select(month);
		List<WebElement> options = t.getOptions();
		int size = options.size();
		System.out.println("size of list box = "+size); 
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select d = new Select(day);
		List<WebElement> options = d.getOptions();
		int size = options.size();
		System.out.println("size of list box = "+size); */

		
	}
}
