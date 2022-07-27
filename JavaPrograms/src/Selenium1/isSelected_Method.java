package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isSelected_Method {   //to check the listbox is multi selectable or not
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y = new Select(year);
		boolean result = y.isMultiple();
		System.out.println(result);
		if (result == true) {
			System.out.println("listbox is multi selectable");}
		else {
			System.out.println("listbox is not multi selectable");
		}
		
	}
}
