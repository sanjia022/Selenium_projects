package selenium_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Amazon_enableandDisplayed {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		
		if(searchField.isDisplayed() && searchField.isEnabled()) {
			searchField.sendKeys("Shoe"  + Keys.ENTER);
		}
		
	   /* driver.navigate().to("https://www.amazon.in/");
	    WebElement a1 = driver.findElement(By.id("twotabsearchtextbox"));
	    if(a1.isEnabled() && a1.isDisplayed()) {
	    	a1.sendKeys(("shoe")+Keys.ENTER);
	    }*/
		
		TakesScreenshot f1 = driver;
		File sources = f1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots" + Math.random() + ".png");
		FileHandler.copy(sources, destination);
		
	    driver.close();
         
	}

}
