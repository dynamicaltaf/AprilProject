package Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("https://www.amazon.in/");
		Thread.sleep(1500);
		
	//	x.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
	//	Thread.sleep(1000);

    //    x.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
    //    Thread.sleep(1000);
     //   x.findElement(By.xpath("//input[contains(@class,'auth-a')]")).sendKeys("Altaf");
	}

}
