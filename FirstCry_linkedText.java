package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_linkedText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.firstcry.com/");
	    WebElement boyFashion = driver.findElement(By.linkText(" BOY FASHION"));
	    boyFashion.click();
	    driver.close();

	}

}
