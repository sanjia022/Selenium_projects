package AmazonTestCases;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase3 extends LaunchAndQuit1 {
	
	@Test
	public void searchingItemsFromDropDown() {
		WebElement e1 =  driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("mug");
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class = 'two-pane-results-container']/div/div"));
		int listOfElements = li.size();
		System.out.println(listOfElements);
		WebElement e2 = li.get(0);
		e2.click(); 
		
		
		
		
	}

}
