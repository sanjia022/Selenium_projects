package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_PartialLinkedText {

	public static void main(String[] args) {

    ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.firstcry.com/");
    WebElement girlFashion = driver.findElement(By.partialLinkText("GIRL FASHION"));
    girlFashion.click();
    driver.close();
	}

}
