package Handle_HTMLTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	public static <Xls_Reader> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	List<WebElement> noOfRow = driver.findElements(By.xpath("//table[@id='customers']//tr"));
	
	// No. of Row present in table
	System.out.println("Total No. of Row : " + noOfRow.size());
	for (int i=1; i<noOfRow.size(); i++) {
	List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
	System.out.println("Row No: "+ i + ", No of Cell :" + noOfCell.size());
	
	for (int cell =0; cell<noOfCell.size(); cell++) {
		System.out.print(noOfCell.get(cell).getText()+ ", ");
		
	}
	System.out.println();
	
	}		
  }
}
