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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test(dataProvider= "login",retryAnalyzer=TestNg.RetryAnalyzer.class)
	public void Login(String username, String Password) throws EncryptedDocumentException, IOException {
		
		
		 driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
		
		
	WebElement usernameField = driver.findElement(By.id("userName"));	
	usernameField.sendKeys(username);
	
	WebElement passwordField = driver.findElement(By.id("password"));	
	passwordField.sendKeys(Password);	
	
	WebElement loginButton = driver.findElement(By.id("login"));	
	loginButton.click();
	
	
	
	}
	@DataProvider(name ="login")
	public Object[][] data() throws EncryptedDocumentException, IOException{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\Desktop\\Eclipse project\\Selenium\\DataFetching\\Data.xlsx");
		Workbook w1 =WorkbookFactory.create(f1);
		String username1 =w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
	
		String pass1 = w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		
		String username2 = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String pass2 = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
	 Object [][] d1 = new Object[2][2];	
	 
	 d1[0][0] =username1;
	 d1[0][1] =pass1;
	 
	 d1[1][0] =username2;
	 d1[1][1] =pass2;
	 return d1;
	}
	
	
	@AfterMethod()
	public void teatDown() {
		driver.quit();
	}

}
