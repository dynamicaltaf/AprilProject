package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllTypeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		for (int i = 0; i<=sh.getLastRowNum(); i++) {
			for (int j=0; j<sh.getRow(i).getLastCellNum(); j++) {
				Cell info = sh.getRow(i).getCell(j);
				CellType CT = info.getCellType();
				
				if (CT==CellType.STRING) {
					System.out.print(info.getStringCellValue()+ " ");
				}
				else if (CT==CellType.BOOLEAN) {
					System.out.print(info.getBooleanCellValue()+ " ");
				}
				else if (CT==CellType.NUMERIC) {
					System.out.print(info.getNumericCellValue()+ " ");
				}
			}
			System.out.println();
			
		}

	}

}
