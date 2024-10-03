package Assertion;

	
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class Amazon {
		
		@Test
		public void method() {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
			
			e1.sendKeys("shoe" + Keys.ENTER);
			
			WebElement e2 = driver.findElement(By.xpath("(//span[@class= 'a-size-base-plus a-color-base a-text-normal'])[1]"));
			e2.click();
			
			Set<String> s1 = driver.getWindowHandles();
			System.out.println(s1);
			
			Iterator<String> i1 = s1.iterator();
		String parentid = i1.next();
		String childiD= i1.next();
		
		driver.switchTo().window(childiD);
		System.out.println(parentid);
		System.out.println(childiD);
		
		driver.switchTo().window(childiD);
		WebElement e3 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		e3.click();
		//WebElement e4 = driver.findElement(By.className("a-button-text"));
//		Assert.assertTrue(e4.isDisplayed());
//		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		driver.close();
	}}


