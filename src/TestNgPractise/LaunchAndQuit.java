package TestNgPractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuit {
	WebDriver driver ;
	@BeforeMethod()
	@Parameters("browser")
	public void launchTheBrowser(String browser) {
		/*
		 * Scanner s1 = new Scanner(System.in);
		 * System.out.println("Enter 1 for chrome");
		 * System.out.println("Enter 2 for edge");
		 * 
		 * int browser = s1.nextInt(); if(browser ==1) { driver = new ChromeDriver(); }
		 * if(browser == 2) { driver = new EdgeDriver(); } s1.close();
		 */
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
		
	}
	
	@AfterMethod()
	public void tearDownMethod() throws InterruptedException, IOException
	{    
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\r88st\\Desktop\\ManualTesting" + new LaunchAndQuit().getClass() +".png");
		FileHandler.copy(source, destination);
		Thread.sleep(6000);
	    
		driver.quit();
	}
}
