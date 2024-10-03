package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataFetching1 {
	
	@Test
	public void login() throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\RC-PC\\eclipse-workspace\\selenium\\DataFetching\\IshitaExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(un);
	String pwd = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
	}

}
