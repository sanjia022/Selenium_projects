package Internet;

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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerLogic.class)

public class foamAuthentication extends ListenerLogic {
	// WebDriver driver;
	@Test(dataProvider = "inputs")
	public void login(String username, String password) {
		driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/login");
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys(username);

		WebElement passowrdField = driver.findElement(By.name("password"));
		passowrdField.sendKeys(password);

		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();
	}

	@DataProvider(name = "inputs")
	public Object[][] foamLogin() throws EncryptedDocumentException, IOException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\r88st\\eclipse-workspace\\Selenium\\DataFetching\\Data.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);

		String username1 = w1.getSheet("internet").getRow(0).getCell(0).getStringCellValue();

		String password1 = w1.getSheet("internet").getRow(0).getCell(1).getStringCellValue();

		String username2 = w1.getSheet("internet").getRow(1).getCell(0).getStringCellValue();

		String password2 = NumberToTextConverter
				.toText(w1.getSheet("internet").getRow(1).getCell(1).getNumericCellValue());

		Object[][] d1 = new Object[2][2];
		d1[0][0] = username1;
		d1[0][1] = password1;

		// login with incorrect credentials
		d1[1][0] = username2;
		d1[1][1] = password2;
		return d1;

	}

}
