package TestNg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessMode {
	WebDriver driver;
	@Test
	public void headless() {
		
		//Note:if we are using edge driver , we need to use edgeOptions and vice versa
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless")	;	
		driver = new ChromeDriver(options) ;
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		WebElement chickonElement = driver.findElement(By.linkText("Click Here"));
		chickonElement.click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator <String> l1 =windows.iterator();
		String parentiD = l1.next();
		String childId = l1.next();
		
		driver.switchTo().window(childId);
	}

}
