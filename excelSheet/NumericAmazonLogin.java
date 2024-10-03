package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class NumericAmazonLogin {
	@Test 
	public void LoginAmazonWithNumeric() throws EncryptedDocumentException,IOException 
	{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\RC-PC\\eclipse-workspace\\selenium\\DataFetching\\IshitaExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(un);
		
		String pwd = NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(1).getNumericCellValue());
		//String pwd = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(pwd);
		
		
	}

}
