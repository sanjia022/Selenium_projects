package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class htmlMKT {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new EdgeDriver();
		
		 driver.get("file:///C:/Users/RC-PC/Desktop/learningHTML1.html");
		 WebElement user = driver.findElement(By.xpath("(/html/body/input)[1]"));
		 user.sendKeys("shkdhs");
		 
		 WebElement linkTag = driver.findElement(By.tagName("a"));
		 linkTag.click(); 
		 
		// WebElement boyfield = driver.findElement(By.linkText("((html/body/form)[2]/input)[1]"));
		// boyfield.click();
		 
		
	}

}
