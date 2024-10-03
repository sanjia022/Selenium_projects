package sep1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment 98- WAP to launch the Google and search for "Bangalore" and select the first 
 * suggestion by using AutoSuggestion */
public class Assignment98 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Bangalore");
		Thread.sleep(4000);
		
		List<WebElement> li =driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		//System.out.println(li.size());
		//li.get(1).click();
		int count = li.size();
		li.get(count -10).click();
		driver.close();

	}

}
