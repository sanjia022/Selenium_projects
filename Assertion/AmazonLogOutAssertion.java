package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogOutAssertion {
	WebDriver driver;
	
	@Test
	
	public void amazonLogout() {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement accountAndSignin = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndSignin).perform();
		
	   WebElement signin = driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));
	   signin.click();
	   
	   WebElement emailAddress = driver.findElement(By.xpath("//input[@id = 'ap_email']"));
	   emailAddress.sendKeys("amreenishita@gmail.com");
	   
	   WebElement continueButton = driver.findElement(By.id("continue"));
	   continueButton.click();
	   
	   WebElement password = driver.findElement(By.xpath("//input[@class = 'a-input-text a-span12 auth-autofocus auth-required-field']"));
	   password.sendKeys("jthfdhcngj");
	   
	   WebElement continueButton2 = driver.findElement(By.id("signInSubmit"));
	   continueButton2.click();
	   
	   WebElement items = driver.findElement(By.xpath("(//div[@class = 'a-section aok-relative s-image-square-aspect'])[1]"));
	   items.click();
	   
	   WebElement addToCart = driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']"));
	   addToCart.click();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
