package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchAndQuit1{
 
	@Test(enabled = false)
	public void login_Searching() {
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoe" + Keys.ENTER);
	}
}
