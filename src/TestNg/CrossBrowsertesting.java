package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestNg.ListenerLogic.class)

public class CrossBrowsertesting extends ListenerLogic {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void googleSearch(String browser) {

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		}
		if (browser.equals("edge")) {
			driver = new EdgeDriver();

		}

		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		search.sendKeys("india" + Keys.ENTER);

	}

}
