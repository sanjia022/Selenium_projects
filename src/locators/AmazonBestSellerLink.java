package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBestSellerLink {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		//WebElement searchArea = driver.findElement(By.id("twotabsearchtextbox"));
		//searchArea.sendKeys(("shoe") + Keys.ENTER);
		
		WebElement bestSellerLink = driver.findElement(By.linkText("Best Sellers"));
		bestSellerLink.click();
		driver.close();
		
		

	}

}
