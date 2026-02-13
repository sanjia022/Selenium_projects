package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDTexcelConcept {
	
	@Test
	public void logintest() throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\Desktop\\Eclipse project\\Selenium\\DataFetching\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("").getRow(1).getCell(0).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys(username);

		
	}

}
