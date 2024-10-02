package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonXpathSearch {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	    WebElement a1 = driver.findElement(By.xpath("(//input)[2]"));

	}

}
