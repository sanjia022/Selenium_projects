package AmazonTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase4 extends LaunchAndQuit1{
	
	@Test
	
	public void SelectingFirstProduct() {
		WebElement e1 =  driver.findElement(By.className("a-section aok-relative s-image-square-aspect"));
		e1.click();
	}
	

}
