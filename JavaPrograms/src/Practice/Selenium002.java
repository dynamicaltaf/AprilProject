package Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium002 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();   //upcasting
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		/*		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https:/flipkart.com");
		
	Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if (title.equalsIgnoreCase(expTitle)) {
			System.out.println("Navigate to right page");
		}
		else {
			System.out.println("Navigate to wrong page");
		}
		
		//Thread.sleep(2000);
		driver.manage().window().minimize();  //to minimize window
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); //to maximize window
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());*/

	    Point p = new Point (600,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(400, 600));
	}
}
