package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbiBank {
	public static void main(String[] args) {
		
		// here right click is disable so i need to click on F12  and arrow on the inspection 
		//then inspect the element's location.
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement continueButton = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		continueButton.click();
		
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("hdkajka");
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("hdkajka");
		
		WebElement login = driver.findElement(By.xpath("(//input[@class = 'btn btn-default'])[1]"));
		login.click();
		
		driver.quit();
		
	}

}
