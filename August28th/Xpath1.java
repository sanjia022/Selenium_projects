package August28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 79 write the xpath with help of text message search mobile on the flip kart.

public class Xpath1 {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement mobileLink = driver.findElement(By.xpath("(//span[. = 'Mobiles'])[1]"));
		mobileLink.click();
		driver.close();
		
	}

}
