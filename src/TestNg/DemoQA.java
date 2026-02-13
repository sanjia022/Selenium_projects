package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoQA {
	WebDriver driver;
	@BeforeMethod()
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		if(browser.equals("chrome")) {
		driver = new ChromeDriver();}
		if(browser.equals("edge")) {
		driver= new EdgeDriver();
		
		}
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@Test(dataProvider= "login",retryAnalyzer=TestNg.RetryAnalyzer.class)
	public void Login(String username, String password) {
		
		
	WebElement usernameField = driver.findElement(By.id("userName"));	
	usernameField.sendKeys(username);
	
	WebElement passwordField = driver.findElement(By.id("password"));	
	passwordField.sendKeys(password);	
	
	WebElement loginButton = driver.findElement(By.id("login"));	
	loginButton.click();
	
	
	
	}
	
	@DataProvider(name = "login")
	public Object[][] loginFUnction (){
		
		Object[][] d1 = new Object[2][2];
		
		// 1st Set
		d1[0][0]="samreen";
		d1[0][1]="samreen1";
		
		
		//2nd Set
		d1[1][0]="hjk";
		d1[1][1]="samreen34";
		return d1;
		
	}
	
	@AfterMethod()
	public void teatDown() {
		driver.quit();
	}
	

}
