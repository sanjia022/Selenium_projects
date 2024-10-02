package selenium_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebElement a1 = driver.findElement(By.xpath("//a[@id ='u_0_0_wG']"));
		WebElement userField = driver.findElement(By.xpath("(//input)[3]"));
		userField.sendKeys("fgjdsgfj" + Keys.ENTER);
		
		WebElement pwdField = driver.findElement(By.xpath("(//input)[4]"));
		pwdField.sendKeys("fgjdsgfj" + Keys.ENTER);
		
		WebElement loginField = driver.findElement(By.xpath("//button"));
		loginField.click();
		
		//driver.close();

	}

}
