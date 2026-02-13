package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignleDimention {
	WebDriver driver;
	@Test(dataProvider = "input")
	public void search(int input) {
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));


		
	}
	@DataProvider(name ="input")
	public Object [][] data(){
		return new Object [][] {{67},{12}};
	}


}
