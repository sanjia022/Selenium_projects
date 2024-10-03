package itestListener_logic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(iTestListenerLogic.class)
public class TestCase1 extends iTestListenerLogic {
	
	@Test
	  
	public void Login_Amazon() {
	    driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.xpath("//span[@class = 'nav-line-2 ']"));
	
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2 =driver.findElement(By.xpath("(//span[@class = 'nav-action-inner'])[1]"));		
		e2.click();
		
		WebElement e3 =driver.findElement(By.id("ap_emai"));
		e3.sendKeys("stbymkt@gmail.com");
		
		WebElement e4 =driver.findElement(By.id("continue"));
		e4.click();
		
		WebElement e5 =driver.findElement(By.id("ap_password"));
		e5.sendKeys("manish" + Keys.ENTER);
		
		
	}

}
