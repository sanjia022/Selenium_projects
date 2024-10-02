package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("USA");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		driver.close();

	}

}
