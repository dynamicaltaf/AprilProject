package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	//	Thread.sleep(2000);
	//	driver.switchTo().alert().accept();
		
	//	driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	//	Thread.sleep(2000);
	//	driver.switchTo().alert().dismiss();
	//	driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

}
