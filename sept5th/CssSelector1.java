package sept5th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
//		driver.findElement(By.id("APjFqb")).sendKeys("USA");
//		
//		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
//		WebElement e1 = driver.findElement(By.cssSelector(".gLFyf"));
//		e1.sendKeys("USA" + Keys.ENTER);
		
//		WebElement e1 = driver.findElement(By.cssSelector("[name='q']"));
//	    e1.sendKeys("USA" + Keys.ENTER);
		
//		WebElement e1 = driver.findElement(By.cssSelector("textarea[name='q']"));
//	    e1.sendKeys("USA" + Keys.ENTER);
//	    WebElement e1 = driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
//	    e1.sendKeys("USA" + Keys.ENTER);
////		
//	    WebElement e1 = driver.findElement(By.cssSelector("textarea[name^='q']"));
//	    e1.sendKeys("USA" + Keys.ENTER);
		
		WebElement e1 = driver.findElement(By.cssSelector("textarea[name^='q']"));
//	    e1.sendKeys("USA" + Keys.ENTER);
	    
		driver.close();

	}

}
