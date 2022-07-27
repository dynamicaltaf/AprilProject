package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); 
		
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(chr);
		
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("OKP335");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("WSX12345");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String Aid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
	    String Eid = "OKP335";
	    if (Eid.equals(Aid)) {
	    	System.out.println("Pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
	}
}
