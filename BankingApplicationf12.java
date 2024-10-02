package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingApplicationf12 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement a1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		a1.click();
		driver.close();

	}

}
