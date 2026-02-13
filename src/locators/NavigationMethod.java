package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class NavigationMethod {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		TakesScreenshot t1 = driver;
		File source =t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\tc" +Math.random() + ".png");
		FileHandler.copy(source, destination);
		driver.close();
		
	}

}
