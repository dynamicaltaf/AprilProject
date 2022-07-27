package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, Throwable {
		 
		FileInputStream file = new FileInputStream("C:\\Data2\\Abc.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(chr);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		//username input
		String userid = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(userid);
		Thread.sleep(1000);
		
		String pwd = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String pin = sh.getRow(2).getCell(0).getStringCellValue();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
                                       

}
}