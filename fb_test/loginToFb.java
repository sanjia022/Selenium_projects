package fb_test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source.fb_loginpage;

public class loginToFb {
	
	WebDriver driver;
	@Test 
	public void login_with_correct_cred() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fb_loginpage n1 = new fb_loginpage(driver);
		n1.uname();
		n1.pwd();
		n1.login();
		n1.createAccount();
		
	}

}
