package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiBank {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.navigate().to("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement continueButton = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		continueButton.click();
		
		WebElement usernameField = driver.findElement(By.cssSelector("#username"));
		usernameField.sendKeys("dshkdhs");
		
		driver.navigate().refresh();
		
		
		
		
		
		driver.close();

	}

}
