package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SbiRightClickDisable {

	public static void main(String[] args) throws IOException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	WebElement continueLoginButton = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	continueLoginButton.click();
	
	WebElement userNameField = driver.findElement(By.name("userName"));
	userNameField.sendKeys("ishita");
	
	WebElement passwordField = driver.findElement(By.name("password"));
	passwordField.sendKeys("ishita1");
	
	WebElement cachaField = driver.findElement(By.id("loginCaptchaValue"));
	cachaField.sendKeys("sadsad");
    
	WebElement loginButton = driver.findElement(By.id("Button2"));
	loginButton.click();
	TakesScreenshot t1 = driver;
	File source =t1.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\tc" +Math.random() + ".png");
	FileHandler.copy(source, destination);
	driver.close();
	
	}

}
