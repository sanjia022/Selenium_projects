package selenium_Project;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggingToFacebook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("amreenishita@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sfdsfds");
		driver.findElement(By.name("login")).click();
		driver.close();

	}

}
