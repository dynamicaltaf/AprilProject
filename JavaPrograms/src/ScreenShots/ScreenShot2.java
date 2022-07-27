package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String random = RandomString.make(3);
	
	File desti = new File("C:\\Screenshots\\SC_" +random+".jpg");
	FileHandler.copy(source, desti);
	driver.close();
	}
}
