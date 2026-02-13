package locators;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutoSuggestion1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchArea = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		searchArea.sendKeys("shoe");
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("(//div[@class='OBMEnb']/ul/li)"));
		int count = li.size();
		System.out.println(count);
		
		li.get(count-3).click();
		
		TakesScreenshot t1= driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\tc" + Math.random() + ".png");
		FileHandler.copy(source, destination);
		
		driver.close();
		
	}

}
