package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleIncognito {

	public static void main(String[] args) throws AWTException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement e1 =driver.findElement(By.linkText("Gmail"));
		
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
//		Actions a1 = new Actions(driver);
//		a1.moveToElement(e1).perform();
		///e1.click();
		
		driver.close();

	}

}
