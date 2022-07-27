package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowNum {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
		int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(data+1);

	}

}

