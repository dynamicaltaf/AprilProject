package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {  //(//input[@type='button'])[2]    ////input[@name='NewTab']
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(1000);
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String>al = new ArrayList<String>(ids);
		String CWID = al.get(1);  //Child Browser(Tab) Address
		driver.switchTo().window(CWID);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//We have to give index zero to go back the focus on main tab
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@value='New Window']")).click();		
	}
}
