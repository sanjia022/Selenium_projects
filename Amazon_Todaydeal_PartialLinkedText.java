package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Todaydeal_PartialLinkedText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    WebElement a1 = driver.findElement(By.partialLinkText("Deals"));
	    a1.click();
	    driver.close();

	}

}
