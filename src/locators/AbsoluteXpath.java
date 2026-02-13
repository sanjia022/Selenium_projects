package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AbsoluteXpath {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/r88st/Downloads/learningHTML1.html");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.manage().window().maximize();
		
		
		WebElement boyButton = driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		boyButton.click();
		
		WebElement submitButton = driver.findElement(By.xpath("(/html/body/form/input)[7]"));
		submitButton.click();
		
		TakesScreenshot t1 =  driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Documents\\AbbuAmmu\\Tc" + new AbsoluteXpath().getClass() + ".png");
		FileHandler.copy(source, destination);
		
		driver.close();

	}

}
