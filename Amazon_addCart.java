package selenium_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_addCart {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	    WebElement a1 = driver.findElement(By.id("twotabsearchtextbox"));
	    if(a1.isEnabled() && a1.isDisplayed()) {
	    	a1.sendKeys(("shoe")+Keys.ENTER);
	    }
	    
	  WebElement selectitems =   driver.findElement(By.className("a-section aok-relative s-image-tall-aspect"));	
	  selectitems.click();
	  
	  Set <String> windows =  driver.getWindowHandles();
	  Iterator<String> s1 = windows.iterator();
	  String parentid = s1.next();
	  String childid = s1.next();
	  
	  driver.switchTo().window(childid);
		WebElement e3 = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		e3.click();
		WebElement e4 = driver.findElement(By.className("a-button-text"));
	   
	  
	  
	    driver.close();

	}

}
