package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetString { //WorkbookFactory = class ,   create = method
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
	//	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(10).getCell(1).getStringCellValue();
	//	System.out.println(data);
		
		double data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(6).getCell(5).getNumericCellValue();
        System.out.println(data);
	}


}
