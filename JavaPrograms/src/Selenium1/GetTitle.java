package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {   //To check or compare the title
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
	//	driver.manage().deleteAllCookies();
		driver.get("https:/www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (title.equalsIgnoreCase(expTitle)) {
		System.out.println("Navigate to write page");
         }
		else {
			System.out.println("Navigate to wrong page");
			
		}
}

}
