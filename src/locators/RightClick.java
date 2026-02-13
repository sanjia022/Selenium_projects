package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/rightclick/");
		WebElement link = driver.findElement(By.linkText("Practice Link1"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(link).perform();
		a1.contextClick(link).perform();
		
		

	}

}
