package sep1st;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


/*Assignment 100 -  WAP to launch the flipkart and search for "Shoe" and 
 * select the second option by using AutoSuggestion */

public class Assignment100 {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@class = 'Pke_EE' ]"));
		e1.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//form[@class ='_2rslOn header-form-search OpXDaO']/ul/li"));
		Thread.sleep(2000);
		int count = li.size();	
		
		System.out.println(count);
		li.get(count - 5).click();
		
		//Take ScreenShot
		TakesScreenshot s1 = driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\screenshot.png");
		
		// One way to take unique screen shot
		//File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\screenshot"+ Math.random()+".png");
		
		// second way to take unique screen shot
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\screenshot"+ new Assignment100 ().getClass()+".png");
		FileHandler.copy(source, destination);
		driver.close();
		//

	}

}
