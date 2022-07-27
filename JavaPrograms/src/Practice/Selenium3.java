package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https:/www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		

	}

}
