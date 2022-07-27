package ScreenShots;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot4 {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(1000);

	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		
	}

}
