package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium4 {
	
	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "C:\\users\\Altaf Muddassar\\Desktop\\Velocity\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(1500);
		
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select d = new Select(day);
		List<WebElement> options = d.getOptions();
		System.out.println(options.size()); 
		for (int i=0; i<=options.size()-1; i++) {
		System.out.print(options.get(i).getText()+" ");	
		}
		System.out.println();
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select m = new Select(month);
		List<WebElement> options2 = m.getOptions();
		System.out.println(options2.size()); 
		for (int i=0; i<=options2.size()-1; i++) {
		System.out.print(options2.get(i).getText()+" ");
		
		}
		System.out.println();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select y = new Select(year);
		List<WebElement> options3 = y.getOptions();
		System.out.println(options3.size()); 
		for (int i=0; i<=options3.size()-1; i++) {
		System.out.print(options3.get(i).getText()+" ");
	}
		

   }

}

