package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class GrotechMinRegistration {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstNameField = driver.findElement(By.name("First Name"));
		firstNameField.sendKeys("Fayyaz");

		WebElement lastNameField = driver.findElement(By.id("Last Name"));
		lastNameField.sendKeys("Abrar");

		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("fayyaz.abrar@gmail.com");

		WebElement phoneField = driver.findElement(By.xpath("//input[@id='Phone']"));
		phoneField.sendKeys("919393939");

		WebElement genderRadioButton = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
		if (genderRadioButton.isDisplayed() && genderRadioButton.isEnabled()) {
			genderRadioButton.click();
		}

		WebElement skillDropdownMenu = driver.findElement(By.id("Skills"));
		Select s1 = new Select(skillDropdownMenu);
		s1.selectByValue("Manual Testing");

//		to comment out mulitple line we need to control + /
//		skillDropdownMenu.click();
//		skillDropdownMenu.sendKeys(Keys.ARROW_DOWN);
//		skillDropdownMenu.sendKeys(Keys.ARROW_DOWN);
//		skillDropdownMenu.sendKeys(Keys.ENTER);

		WebElement countryField = driver.findElement(By.id("Country"));
		Select s2 = new Select(countryField);
		s2.selectByVisibleText("USA");

		WebElement yearField = driver.findElement(By.id("DOB"));
		Select s3 = new Select(yearField);
		s3.selectByValue("2021");

		WebElement monthField = driver.findElement(By.id("month"));
		Select s4 = new Select(monthField);
		s4.selectByValue("May");

		WebElement dayField = driver.findElement(By.id("day"));
		Select s5 = new Select(dayField);
		s5.selectByValue("04");

		WebElement submitButton = driver.findElement(By.xpath("//button[@name='submit']"));
		submitButton.click();
		
		
		TakesScreenshot t1 = driver;
		File source =t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\tc" +Math.random() + ".png");
		FileHandler.copy(source, destination);
		
		

		driver.navigate().refresh();
		driver.close();

	}

}
