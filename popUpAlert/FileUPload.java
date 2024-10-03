package popUpAlert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUPload {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.name("fname")).sendKeys("Sanjia");
		driver.findElement(By.id("lname")).sendKeys("Amreen");
		driver.findElement(By.id("email")).sendKeys("amreenishita@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kdfksjd");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Skills")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("Country")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("Present-Address")).sendKeys("fsfsfsd");
		driver.findElement(By.id("Permanent-Address")).sendKeys("fsdfsfs");
		driver.findElement(By.name("Pincode")).sendKeys("45786");
		driver.findElement(By.name("Relegion")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("Relegion")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("relocate")).click();
		driver.findElement(By.name("Submit")).click();
		WebElement e1 =driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\RC-PC\\Downloads\\String-Methods.pdf");
		
		WebElement e2 = driver.findElement(By.name("Submit"));
		e2.click();
		driver.switchTo().alert().accept();
		driver.close();

	}

}
