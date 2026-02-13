package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Autosuggestion {

	@Test
	public void autosugesstion() throws IOException {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    
	    WebElement search = driver.findElement(By.xpath("//input[@class ='Pke_EE']"));
	    if(search.isDisplayed() && search.isEnabled()) {
	    	
	    	search.sendKeys("bag");
	    	
	    }
	    else {
	    	System.out.println("Search element is no displayed");
	    }
	    
	   /*WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	   w1.until(ExpectedConditions.visibilityOfAllElements("//form[@class ='_2rslOn header-form-search OpXDaO']/ul/li"));*/
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   List<WebElement> l1 =  driver.findElements(By.xpath("//form[@class ='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = l1.size();
		System.out.println(count);
		
		l1.get(count-1).click();
		
		TakesScreenshot t1 =driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\screenShots\\testcase" +Math.random() + ".png");
		FileHandler.copy(source, destination);
		
		
		driver.quit();
		
	}

}
