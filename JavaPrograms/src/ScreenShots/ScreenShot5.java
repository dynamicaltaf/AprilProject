package ScreenShots;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot5 {

	public static void main(String[] args) throws InterruptedException, Exception   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		String a = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		File destination = new File("C:\\Screenshots\\SC_" + a + ".jpg");
		FileHandler.copy(source, destination);
		
	}

}
