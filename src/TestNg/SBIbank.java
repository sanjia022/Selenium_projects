package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SBIbank {
WebDriver driver;

	
	@BeforeMethod
	public void launchBrowser(){
		driver = new ChromeDriver() ;
		driver.navigate().to("https://retail.sbi.bank.in/retail/login.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "data") 
	public void loginSBIbank(String username, String password) throws EncryptedDocumentException, IOException {
		
		
		
		
		
		WebElement loginButton =driver.findElement(By.className("login_button"));
		loginButton.click();
		
		
		WebElement user1 = driver.findElement(By.id("username"));
		user1.sendKeys(username);
		
	
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
		
		
	
		
	}
	@DataProvider(name = "data")
	public Object[][] input () throws EncryptedDocumentException, IOException{
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspace-fixed\\Selenium\\DataFetching\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username1 = w1.getSheet("SBIBank").getRow(0).getCell(0).getStringCellValue();
		String password1 = w1.getSheet("SBIBank").getRow(0).getCell(1).getStringCellValue();
		
		String username2 = w1.getSheet("SBIBank").getRow(1).getCell(0).getStringCellValue();
		String password2 = w1.getSheet("SBIBank").getRow(1).getCell(1).getStringCellValue();
		
		String username3 = w1.getSheet("SBIBank").getRow(2).getCell(0).getStringCellValue();
		String password3 = NumberToTextConverter.toText((w1.getSheet("SBIBank").getRow(2).getCell(1).getNumericCellValue()));
		Object[][] d1 = new Object[3][2];
		d1[0][0]= username1;
		d1[0][1] = password1;
		
		d1[1][0]= username2;
		d1[1][1] = password2;
		
		d1[2][0]= username3;
		d1[2][1] = password3;
		return d1;
		
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
