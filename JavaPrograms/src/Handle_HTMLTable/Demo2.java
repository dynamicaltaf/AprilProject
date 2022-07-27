package Handle_HTMLTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.spi.XmlReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		String beforeXpath_Company = "//*[@id='customers']/tbody/tr[";
		String afterXpath_Company = "]/td[1]";
		
		String beforeXpath_Contact = "//*[@id='customers']/tbody/tr[";
		String afterXpath_Contact = "]/td[2]";
		
		List<WebElement> rows = driver.findElements(By.xpath("\\table[@id='customers']//tr"));
		System.out.println("Total number of rows :"+ (rows.size()-1));
		int rowCount = rows.size();
		
	//	XmlReader reader = new XmlReader("C:\\Data\Data2\\A.xlsx");
		
		for (int i=2; i<=rowCount; i++) {
			String actualXpath_Company = beforeXpath_Company + i + afterXpath_Company;
			String companyName = driver.findElement(By.xpath(actualXpath_Company)).getText();
			System.out.println(companyName);
			
			String actualXpath_Contact = beforeXpath_Contact + i + afterXpath_Contact;
			String contactName = driver.findElement(By.xpath(actualXpath_Contact)).getText();
			System.out.println(contactName);
			
			
		}
	}

}
