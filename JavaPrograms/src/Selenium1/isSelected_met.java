package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_met { //isSelected method   [facebook sign up (female/male/custom)]

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(1500);
			
		 WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		 female.click();              //only use after checked the box 
		 Thread.sleep(1000);
		 boolean result = female.isSelected();
		 System.out.println(result);
		 
		// WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		// male.click();
	    // Thread.sleep(1000);
		// boolean result = male.isSelected();
		// System.out.println(result);

		// WebElement Custom = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		// Thread.sleep(1000);
		// boolean result = Custom.isSelected();
		// System.out.println(result);
		 
		 if (result == true) {
			 System.out.println("Element is selected");
		 }
		 else {
			 System.out.println("Element is not selected");
		 }
			 
		}

	}
