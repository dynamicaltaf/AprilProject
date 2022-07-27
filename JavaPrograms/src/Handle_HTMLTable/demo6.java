package Handle_HTMLTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo6 {
	
	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("C:\\Data\\Data2\\A.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("First Sheet");
		
		sh.createRow(0).createCell(0).setCellValue("Age");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			 wb.write(fos);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}		
		
	}

}
