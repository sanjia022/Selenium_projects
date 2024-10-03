package WaitClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waitWExplicit {
	
	@Test
	public void methodes() {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("Manish"));
		//w1.until(ExpectedConditions.titleIs("Google"));
		w1.until(ExpectedConditions.titleContains("le"));
		driver.findElement(By.id("APjFqb")).sendKeys("USA");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	}
	

}
