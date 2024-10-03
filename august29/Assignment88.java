package august29;
/*Assignment 88 Automate Dropdowns Gender and State/Union Territory in the below page 
 * https://grotechminds.com/registeration-form/*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment88 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		WebElement e1 = driver.findElement(By.name("gender"));
		
		Select s1 = new Select (e1);
		s1.selectByVisibleText("Female");
		
		WebElement e2 = driver.findElement(By.name("state"));
		Select s2 = new Select (e2);
		s2.selectByIndex(2);
		
		driver.close();
	}

}
