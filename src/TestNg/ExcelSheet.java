package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg.ListenerLogic.class)
public class ExcelSheet extends ListenerLogic {
	@Test(dataProvider = "input")
	
	public void amzonLogin(String username, String password) {
		driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountAndList =driver.findElement(By.xpath("(//a[@class ='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndList).perform();
		WebElement signinButton = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signinButton.click();
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys(username);
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement passwordField = driver.findElement(By.id("ap_password"));
		passwordField.sendKeys(password);
		WebElement signinSubmitButton = driver.findElement(By.id("signInSubmit"));
		signinSubmitButton.click();
	}
	
	@DataProvider(name = "input")
	
	
	
	public Object[][] login() throws EncryptedDocumentException, IOException{
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-workspace\\Selenium\\DataFetching\\Data.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		
		String usernameCorrect = w1.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String passwordCorrect = w1.getSheet("login").getRow(0).getCell(1).getStringCellValue();
		
		
		
		String usernameIncorrect = w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String passwordIncorrect =NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(1).getNumericCellValue());
		
		
		Object[][] d1 = new Object[2][2];
		
		//Right credential
		d1[0][0] = usernameCorrect;
		d1[0][1] =passwordCorrect;
		
		// Wrong credential
		
		d1[1][0] = usernameIncorrect;
		d1[1][1] = passwordIncorrect;
		return d1;
		
	}

}
