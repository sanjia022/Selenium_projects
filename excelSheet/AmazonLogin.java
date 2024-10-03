package excelSheet;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin {
	WebDriver driver;
	Actions a1 = new Actions(driver);
	@Test
	
	public void Amazon() throws EncryptedDocumentException,IOException {
		
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\RC-PC\\eclipse-workspace\\selenium\\DataFetching\\IshitaExcelSheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String un = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		//System.out.println(un);
		String pwd = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(pwd);
		
		
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
	
		
		a1.moveToElement(e1).perform();
		
		WebElement e2 =driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));		
		e2.click();
		
		WebElement e3 =driver.findElement(By.id("ap_email"));
		e3.sendKeys(un);
		
		WebElement e4 =driver.findElement(By.id("continue"));
		e4.click();
		
		WebElement e5 =driver.findElement(By.id("ap_password"));
		e5.sendKeys(pwd + Keys.ENTER);
	}

}
