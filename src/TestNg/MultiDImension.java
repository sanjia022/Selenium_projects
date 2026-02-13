                                                                                                                                                                                          package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiDImension {
	
	@Test(dataProvider = "login", retryAnalyzer=TestNg.RetryAnalyzer.class)
	public void amazonLogin(String username, String password) {
		EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement accountAndList =driver.findElement(By.xpath("(//a[@class ='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountAndList).perform();
		WebElement signinButton = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signinButton.click();
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys(username);
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement passwordField = driver.findElement(By.id("ap_password"));
		passwordField.sendKeys(password);
		WebElement signinSubmitButton = driver.findElement(By.id("signInSubmit"));
		signinSubmitButton.click();
		
		
	}
	@DataProvider(name = "login")
	public Object[][] login(){
		Object[][] d1 = new Object[1][2];
		d1[0][0] = "amreenishita@gmail.com";
		d1[0][1] = "Amazon!23";
		return d1;
	}

}
