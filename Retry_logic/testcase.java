package Retry_logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase {
	
	@Test (retryAnalyzer = Retry_logic.Retry_logic1.class)
	public void searchingOnAmazon() {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.xpath("input[@class = 'Pke_EE' ]"));
		e1.sendKeys("Shoe");
	}

}
