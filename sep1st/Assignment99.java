package sep1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

/*Assignment 99 - WAP to launch the Amazon and search for "Shoe" and select the 
 * fourth option by using AutoSuggestion */
public class Assignment99 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
		
		e1.sendKeys("Shoes");
		//Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int count = li.size();
        
        System.out.println(count);
		li.get(count-6).click();
	}

}
