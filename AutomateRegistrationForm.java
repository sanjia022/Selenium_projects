package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.findElement(By.id("firstName")).sendKeys("Sanjia");
		driver.findElement(By.name("lastName")).sendKeys("Amreen");
		driver.findElement(By.name("email")).sendKeys("amreenishita@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("4293792");
		driver.findElement(By.name("gender")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
