package popUpAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaAlert {

	public static void main(String[] args) {
	
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://grotechminds.com/alert/");
		WebElement a1 = driver.findElement(By.xpath("//button[@onclick= 'myFun1()']"));
		
		//WebElement a1 = driver.findElement(By.partialLinkText("Received1"));
		a1.click();
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		//WebDriverWait w1 = new WebDriver
		driver.switchTo().alert().accept();

	}

}
