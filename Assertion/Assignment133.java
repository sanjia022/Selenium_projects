package Assertion;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment133 {
	
	@Test
	public void youtubeChannel() throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebElement e1 = driver.findElement(By.xpath("//input[@id = 'search']"));
		e1.sendKeys("groTechMind" + Keys.ENTER);
		WebElement e2 = driver.findElement(By.className("yt-spec-touch-feedback-shape__fill"));
		e2.click();
		
		
		Set <String> li=driver.getWindowHandles();
		Iterator <String> s1 = li.iterator();
		String parentid = s1.next();
		String childiD = s1.next();
		
		driver.switchTo().window(childiD);
		Thread.sleep(3000);
		WebElement e3 =driver.findElement(By.className("whsOnd zHQkBf"));
		Thread.sleep(3000);
		 // Wait for the element to be visible and clickable
        

		Assert.assertEquals(e3.isDisplayed(), "Email or phone");
		
	}

}
