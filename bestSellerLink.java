package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bestSellerLink {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.com/");
	//WebElement clickBestSeller = driver.findElement(By.linkText("Best Sellers"));
	WebElement clickBestSeller = driver.findElement(By.partialLinkText(" Sellers"));
	clickBestSeller.click();
	driver.quit();
	

	}

}
