package TestNgPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutoSugesstion extends GoogleSearch{
	
	@Test(enabled =false)
	public void autoSuggesttion() {
		
		List<WebElement> lists =  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = lists.size();
		System.out.println("The Total count of lists element is " + count);
	}

}
