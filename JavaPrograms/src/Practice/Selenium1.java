package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();   //upcasting
		driver.get("https://www.amazon.in");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.whatsapp.com/");
		Thread.sleep(4000);
		driver.close();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
