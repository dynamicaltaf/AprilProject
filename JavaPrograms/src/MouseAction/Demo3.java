package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop"); 
		 
		   WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
		   Thread.sleep(1500);
		   
		   WebElement dest = driver.findElement(By.xpath("//div[@id='div1']"));
		   Thread.sleep(1500);
		   
		   Actions act=new Actions(driver);
		   act.dragAndDrop(source,dest).perform();
		
	}
}
