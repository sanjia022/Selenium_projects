package seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expandTesting {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("bag");
		List<WebElement> list = driver.findElements(By.xpath("//form[@class='_Bidnv header-form-search XN_jdV']/ul/li"));
		Thread.sleep(1000);
		int count = list.size();
		WebElement fifthelement = list.get(count - 3);
		fifthelement.click();
		
	
		
		
		

	}

}
