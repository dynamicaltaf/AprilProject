package MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html");                              
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement acount = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[2]"));
		Actions act = new Actions(driver);
//		act.moveToElement(dest).clickAndHold().moveToElement(dest).release().build().perform(); //or another way 
		act.dragAndDrop(bank, acount).perform();
		Thread.sleep(1500);
		
		WebElement money = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement amount = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(money, amount).perform();		
		
		
				
	}	
}
