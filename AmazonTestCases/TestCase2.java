package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchAndQuit1{
		 
		@Test(enabled =false)
		public void login_Searching() {
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("Shoe" + Keys.ENTER);
			
			WebElement e2 = driver.findElement(By.xpath("(//div[@class = 'a-section aok-relative s-image-tall-aspect'])[1]"));
			e2.click();
}
}
