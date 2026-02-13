package locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertCLass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/alert/");
		driver.manage().window().maximize();
		WebElement alertButton = driver.findElement(By.xpath("(//button[@class= 'bbb'])[1]"));
		alertButton.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement receivedButton = driver.findElement(By.xpath("(//button[@class= 'bbb'])[3]"));
		receivedButton.click();
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Handled it");
			e.printStackTrace();
		}

		finally {
			driver.close();
		}
	}

}
