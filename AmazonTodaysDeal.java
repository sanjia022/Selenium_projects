package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTodaysDeal {
	static  WebDriver driver;
	public static void main(String[] args) {

     
      driver = new ChromeDriver();
      driver.get("https://www.amazon.com/");
      WebElement part = driver.findElement(By.partialLinkText("Today's "));
      part.click();
      driver.quit();
	}

}
