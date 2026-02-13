package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchArea = driver.findElement(By.name("q"));
		searchArea.sendKeys("shoe");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("form[@class='Hy6F9O header-form-search']/ul/li"));
		Thread.sleep(6000);
		int count = list.size();
		System.out.println(count);

		list.get(count - 5).click();

	}

}
