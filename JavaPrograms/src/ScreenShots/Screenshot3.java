package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot3 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		for (int i =1; i<=5; i++) {		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Screenshots\\SC_"+i+".jpg");
		FileHandler.copy(source, desti);
		
		}		
	}
}

