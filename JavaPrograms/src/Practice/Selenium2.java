package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
         
		if (title.equalsIgnoreCase(expTitle)) 
		     {
			System.out.println("Navigate to right page");
	         }
		
		else {
			System.out.println("Navigate to wrong page");
		}
			
	}
}
	

