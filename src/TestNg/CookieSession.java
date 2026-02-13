package TestNg;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CookieSession {
	@Test
	public void getCookieName() 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Cookie c1 = new Cookie("Fruit" , "Mango");  
		// this line create a new cookie object named c1. Cookie is small data 
		//that store by the website in user's web browser.
		// here name of the cookie is fruit and value is mango.
		
		driver.manage().addCookie(c1);// add cookie to current session for website currently open which is here is google.com
		System.out.println(driver.manage().getCookies());
		// it will get get all the cookies that this current website have including this fruite = mango
		System.out.println(driver.manage().getCookieNamed("Fruit"));// it will reteive a specific cookie named "fruit" and print in console		
		System.out.println(driver.manage().getCookieNamed("expires"));
		
		
		
	}
}
