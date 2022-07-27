package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(source);  
	 
	 String td = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
	 File Destination = new File("C:\\Screenshots\\SC_" + td +".jpg");
	 FileHandler.copy(source, Destination);
	 
	}

}
