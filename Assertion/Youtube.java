package Assertion;


	import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

	public class Youtube {

	    @Test
	    public void youtubeChannel() {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.youtube.com/");
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	       
	        //driver.close();
	        
	      

	        WebElement e1 = driver.findElement(By.id("search"));
	        e1.sendKeys("hjk" + Keys.ENTER);

	        WebElement e2 = driver.findElement(By.className("yt-spec-touch-feedback-shape_fill"));
	        e2.click();

	        Set<String> li = driver.getWindowHandles();
	        Iterator<String> s1 = li.iterator();

	        String parentid = s1.next();
	        String childiD = s1.next();

	        driver.switchTo().window(childiD);

	        // Wait for the element to be visible and clickable
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correctly pass the WebDriver object
	        WebElement e3 = wait.until(ExpectedConditions.elementToBeClickable(By.className("whsOnd zHQkBf")));

	        Assert.assertEquals(e3.isDisplayed(), "Email or phone");
	    }
	}

