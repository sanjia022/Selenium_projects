package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class IdLocator {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchField = driver.findElement(By.id("APjFqb"));
		
		searchField.sendKeys(("india")+Keys.ENTER);
		TakesScreenshot t1 = driver;
		File source =t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\tc" +Math.random() + ".png");
		FileHandler.copy(source, destination);
		

	}

}
