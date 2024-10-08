package selenium_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;


public class AmazonLogout {

	public static void main(String[] args) throws IOException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
	
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 =driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));		
		e2.click();
		
		WebElement e3 =driver.findElement(By.id("ap_email"));
		e3.sendKeys("amreenishita@gmail.com");
		
		WebElement e4 =driver.findElement(By.id("continue"));
		e4.click();
		
		WebElement e5 =driver.findElement(By.id("ap_password"));
		e5.sendKeys("gkgkkh" + Keys.ENTER);
		
	
		
		
		
		
       //WebElement e1 = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
	
		
		a1.moveToElement(e1).perform();
		WebElement logout = driver.findElement(By.className("nav-text"));
		
		
		logout.click();
		//String title = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		TakesScreenshot p1 = (TakesScreenshot) driver;
		File source =p1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\screenshot"+ Math.random()+".png");
		FileHandler.copy(source, destination);
		driver.quit();
	}

	}


