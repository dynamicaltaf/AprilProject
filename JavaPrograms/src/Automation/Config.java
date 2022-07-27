package Automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Config {
	
		
		public static void main(String[] args) {
			//set the path of executable browser driver 
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Altaf Muddassar\\Desktop\\Velocity\\Software\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		}
			
}
		


