package fb_test;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import fb_source.fb_registration;

public class RegistrationTofb {
	
	
	@Test
	public void registration_to_fb() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//fb_loginpage f1 = new fb_loginpage(driver);
		//f1.createAccount();
		
		fb_registration f2 = new fb_registration(driver);
		f2.CreateNewAccount();
		//Thread.sleep(3000);
		
		f2.firstName();
		f2.lastName();
		f2.emailOrphone();
		f2.pwd();
		f2.birthmonth();
		f2.birthday();
		f2.birthYear();
		f2.female();
		f2.signup();
		
	}

}
