package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateGroTechRegistration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.name("fname")).sendKeys("Sanjia");
		driver.findElement(By.id("lname")).sendKeys("Amreen");
		driver.findElement(By.id("email")).sendKeys("amreenishita@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kdfksjd");
		driver.findElement(By.id("Female")).click();
		WebElement e2 = driver.findElement(By.id("Skills"));
		Select s1 = new Select (e2);
		s1.selectByIndex(0);
		
		WebElement e4 = driver.findElement(By.id("Country"));
		Select s0 = new Select (e4);
		s0.selectByIndex(0);
		
		driver.findElement(By.id("Present-Address")).sendKeys("fsfsfsd");
		driver.findElement(By.id("Permanent-Address")).sendKeys("fsdfsfs");
		driver.findElement(By.name("Pincode")).sendKeys("45786");
		WebElement e1 = driver.findElement(By.name("Relegion"));
		Select s2 = new Select (e1);
			s2.selectByValue("Muslim");
		
		driver.findElement(By.id("relocate")).click();
		driver.findElement(By.name("Submit")).click();
		driver.close();
		
	}

}
