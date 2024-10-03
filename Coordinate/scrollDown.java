package Coordinate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollDown {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("About Amazon"));
		Point p1 = e1.getLocation();
		int x= p1.getX();
		int y = p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		//Scrolling down 
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,"+y+")");
		

	}

}
