package Assertion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearch {
	WebDriver driver;
	@Test
	
	public void searchArea() {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("shoe" + Keys.ENTER);
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@class = 'a-section aok-relative s-image-tall-aspect']"));
		System.out.println(items.size());
		
		Assert.assertTrue(items.size()>2);
	}

}
