package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriventesting1 {

	@Test(dataProvider = "inputs")
	public void method(String input) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e1= driver.findElement(By.id("APjFqb"));
		
		e1.sendKeys(input +Keys.ENTER);
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		driver.close();
	}
	
	@DataProvider(name= "inputs")
		public Object[][] data1(){
			return new Object[][] {{"bangladesh"},{"USA"}};
		
	}
	
}
