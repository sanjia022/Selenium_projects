package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataFetchingFromXLSX {
	
	@Test 
	public void dataFormexcel() throws EncryptedDocumentException,IOException 
	{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\RC-PC\\eclipse-workspace\\selenium\\DataFetching\\IshitaExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		System.out.println(username);
		
	}

}
