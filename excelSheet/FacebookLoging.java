package excelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoging {
	WebDriver driver;
	
	@Test(dataProvider = "inputs")
	
	public void fbLogin(String un, String pwd) {
		
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys(un);
		WebElement pwd1 = driver.findElement(By.name("pass"));
		pwd1.sendKeys(pwd);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
	}
	
	
	@DataProvider(name = "inputs")
	
	
	public Object[] method1() throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\RC-PC\\eclipse-workspace\\selenium\\DataFetching\\IshitaExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String pwd = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		
		String un1 = w1.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		String pwd1 = w1.getSheet("Login").getRow(2).getCell(2).getStringCellValue();
		
		
	Object[][] e1 = new Object[2][2];
	
	//1st set of data
	e1[0][0] = un;
	e1[0][1] = pwd;
	
	//2nd set of data
	e1[1][0] = un1;
	e1[1][1] = pwd1;
	return e1;

}
}