package Assertion;


	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class naukri {
		@Test
		public void method() throws InterruptedException {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement e1 =driver.findElement(By.xpath("//span[@class='google-text']"));
		e1.click();
		
		
		Thread.sleep(4000);
		
		Set <String> s1 = driver.getWindowHandles();
		Iterator<String> ids = s1.iterator();
		String parentid = ids.next();
	    String childid = ids.next();
	    driver.switchTo().window(childid);
		//WebElement createAccountLinkText =  driver.findElement(By.xpath("(//div[@class ='VfPpkd-RLmnJb'])[1]"));
		Assert.assertEquals(driver.getTitle(), "Sign in - Google Accounts");
		driver.close();
//		
//		
//		

	}
	}


