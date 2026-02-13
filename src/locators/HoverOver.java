package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();

	}

}
