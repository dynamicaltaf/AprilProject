package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendID_Pass {
	
public static void main(String[] args) throws InterruptedException, Exception   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver ();
		
	//	https://username:password@url   
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String pageMessage = driver.findElement(By.xpath("")).getText();
		System.out.println(pageMessage);
    }
}
