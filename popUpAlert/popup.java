package popUpAlert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class popup {

	public static void main(String[] args) {

		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement clickButton = driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-1912e56 elementor-widget elementor-widget-shortcode']"));
		clickButton.click();
		
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		w1.until(ExpectedConditions.alertIsPresent());
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		
		w1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		//clickButton.click();

	}

}
