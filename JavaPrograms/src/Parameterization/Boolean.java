package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean {//Fetching Boolean Type Data
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
			FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
			 boolean data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getBooleanCellValue();
			 System.out.println(data);
			

		}

	}

