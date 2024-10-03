package August28th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Assignment 78 Launch Google.com type india do it with new x path method( tag name)

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    WebElement searchField = driver.findElement(By.xpath("//textarea[@ id = 'APjFqb']"));
	    searchField.sendKeys("India");
	    driver.close();

	}

}
