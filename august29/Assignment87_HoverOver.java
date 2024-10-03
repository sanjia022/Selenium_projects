package august29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*Assignment 97 Launch amazon, hover over account & list and click on sign in*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment87_HoverOver {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement e1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        
        Actions a1 = new Actions(driver);
        a1.moveToElement(e1).perform();
        
        WebElement e2 = driver.findElement(By.xpath("(//span[. = 'Sign in'])[1]"));
        e2.click();
        
	}

}
