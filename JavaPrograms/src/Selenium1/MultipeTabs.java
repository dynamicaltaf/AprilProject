package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class MultipeTabs {

	   @SuppressWarnings("deprecation")
	      public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		  
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
	      driver.manage().window().maximize();
	      // wait of 5 seconds
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Keys.Chord string
	      String clickl = Keys.chord(Keys.CONTROL,Keys.ENTER);
	      
	      // open the link in new tab, Keys.Chord string passed to sendKeys
	      driver.findElement(By.xpath("//*[text()='Terms of Use']")).sendKeys(clickl);
	      Thread.sleep(2000);
	      
	      // hold all window handles in array list
	      ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      Thread.sleep(2000);
	      
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      
	      System.out.println("Page title of new tab: " + driver.getTitle());
	      Thread.sleep(2000);
	      
	      //switch to parent window
	      driver.switchTo().window(newTb.get(0));
	      System.out.println("Page title of parent window: " + driver.getTitle());
	  //    driver.quit();
	   }
	}