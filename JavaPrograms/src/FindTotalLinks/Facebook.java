package FindTotalLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();  //upcasting
		
		driver.get("https:www.facebook.com/login/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		
		for (int a = 0; a<links.size(); a++) {
			System.out.println(links.get(a).getText()+":"+links.get(a).getAttribute("href"));
		}
		
	}

}
