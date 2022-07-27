package Selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_Position {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.amazon.com");
		Thread.sleep(2000);
		
		Dimension d = new Dimension(300,600);  
		driver.manage().window().setSize(d);  //set size
		Thread.sleep(2000);
		
		Point p = new Point(400,200);
		driver.manage().window().setPosition(p);
		
		
		
		
	}

}
