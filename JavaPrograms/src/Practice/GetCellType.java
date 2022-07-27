package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Data\\DemoParameterization.xlsx");
		Cell a = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1);
		
		CellType CT = a.getCellType();
		
		if(CT == CellType.STRING) {
			System.out.println(a.getStringCellValue());
		}
		else if (CT == CellType.BOOLEAN) {
			System.out.println(a.getBooleanCellValue());
		}
		else if (CT == CellType.NUMERIC) {
			System.out.println(a.getNumericCellValue());
		}

	}

}

