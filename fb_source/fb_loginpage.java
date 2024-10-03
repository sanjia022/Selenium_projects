package fb_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_loginpage {
WebDriver driver;
	//Step1
	
	@FindBy(id = "email")
	WebElement username;
	
	@FindBy(id = "pass")
	WebElement password;
	 
	@FindBy(name = "login")
	WebElement login;
	
	@FindBy (xpath =("//a[. = \'Create new Account \']"))
	WebElement createnewaccount;
	
	//Step 2
	
	public void uname() {
		username.sendKeys("gsakka@gmail.com");
	}
	
	public void pwd() {
		password.sendKeys("gkhkjljl");
	}
	public void login() {
		login.click();
	}
	
	public void createAccount() {
		createnewaccount.click();
		
	}
	
	// Step 3 
	public fb_loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
			
}
}