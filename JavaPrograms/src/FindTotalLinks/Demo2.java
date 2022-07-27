package FindTotalLinks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {   //To check or compare the title
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https:/www.amazon.in");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		try {
			PrintStream ps = new PrintStream(new File("C:\\Data\\DemoFile3.txt"));
			System.setOut(ps);
			ps.print(expTitle);
		}
		
		catch (FileNotFoundException ft)
		{
			System.out.println(ft);
		}
     }
}
