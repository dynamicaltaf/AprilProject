package MouseAction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UP_Down {  //homework or self
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.countries-ofthe-world.com/flags-of-the-world.html");
		Thread.sleep(1500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scrolling down by pixel
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(1000);
		
		//Scrolling up by pixel
		js.executeScript("window.scrollBy(0,-2000)", "");
		Thread.sleep(1000);
		
	/*	//Scrolling page till find the element
		WebElement flag = driver.findElement(By.xpath("//img[@src='flags-normal/flag-of-India.png']"));
		js.executeScript("arguments[0].scrollIntoView();", flag);
		
		//Scroll till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); */
	}
}
