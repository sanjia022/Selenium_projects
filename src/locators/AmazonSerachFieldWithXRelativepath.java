package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSerachFieldWithXRelativepath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.com/");
		WebElement searchArea = driver.findElement(By.xpath("(//input)[5]"));
		searchArea.sendKeys(("shoe") + Keys.ENTER);

	}

}
