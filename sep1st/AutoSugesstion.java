package sep1st;

import java.io.File;
import java.io.IOException;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutoSugesstion {
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		WebElement a1 = driver.findElement(By.className("gLFyf"));
		a1.sendKeys("bangladesh");
		
		
		List<WebElement> e1 = driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		int count = e1.size();
		System.out.println(count);
		
		e1.get(count-1).click();
		
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\screenshot" + new AutoSugesstion().getClass() + ".png" );
		FileHandler.copy(source, destination);
		
		
	}

}
