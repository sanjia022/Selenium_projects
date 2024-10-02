package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_Search_tagname {
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement a1 = driver.findElement(By.tagName("textarea"));
		a1.sendKeys("Bangladesh" + Keys.ENTER);
	}

}
