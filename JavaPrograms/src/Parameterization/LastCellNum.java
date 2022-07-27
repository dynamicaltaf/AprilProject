package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastCellNum {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
	short data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(6).getLastCellNum();
	System.out.println(data);

   }
}

