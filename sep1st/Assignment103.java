package sep1st;
/*Assignment 103- Launch Google and Right Click on Gmail*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment103 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement e1 = driver.findElement(By.xpath("//a[@class = 'gb_Sa gb_wd gb_nd gb_F gb_ed']"));
		
		Actions a1 = new Actions (driver);
		a1.contextClick(e1).perform();

	}

}
