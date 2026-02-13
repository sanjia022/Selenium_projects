package links;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class multidimention {

	@Test(dataProvider = "input")
	public void multidimantion(String user, String password) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/registration/");
		WebElement fisrtname = driver.findElement(By.id("fname"));
		fisrtname.sendKeys(user);
		
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys(password);

		//WebElement emailaddress = driver.findElement(By.name("email"));
		//emailaddress.sendKeys(email);
	}
	
	@DataProvider(name ="input")
	public Object[][] multi() throws EncryptedDocumentException, IOException {
		
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\r88st\\eclipse-workspace-fixed\\Selenium\\DataFetching\\login.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("info").getRow(1).getCell(0).getStringCellValue();
		String password = NumberToTextConverter
				.toText((w1.getSheet("info").getRow(1).getCell(1).getNumericCellValue()));
		
		Object[][] d1 = new Object[1][2];
		d1[0][0] = username;
		d1[0][1] = password;

		

		return d1;
	}

}
