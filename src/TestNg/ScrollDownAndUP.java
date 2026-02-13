package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownAndUP {
	
	@Test
	public void Scrolling() {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement aboutUs =driver.findElement(By.linkText("About Amazon"));
	Point p1 = aboutUs.getLocation();
	int x = p1.getX();
	int y = p1.getY();
	System.out.println(x);
	System.out.println(y);
	
	JavascriptExecutor js1 = driver;
	js1.executeScript("window.scrollBy(0,1200)");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	js1.executeScript("window.scrollBy(0, -500)");
	
}}
