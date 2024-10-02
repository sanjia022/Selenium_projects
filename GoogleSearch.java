package selenium_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		//Another way  to launch any browser besides driver.get()
		driver.navigate().to("http://www.google.com");
		
		
		// use of navigate method to go back, forward and refresh
		driver.navigate().back();
		driver.navigate().forward();
		
		// implicit wait using driver.manage.timeout.implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().refresh();
		/*driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.id("APjFqb")).sendKeys("USA");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);*/
		
		
		// closing the browser which has the control 
		driver.close();
		

	}

}
