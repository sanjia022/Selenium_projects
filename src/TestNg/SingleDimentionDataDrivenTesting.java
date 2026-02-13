package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class SingleDimentionDataDrivenTesting {

	@Test(dataProvider = "input")

	public void dataDriven(String input) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
		search.sendKeys(input + Keys.ENTER);
		Assert.assertTrue(false);
	}

	@DataProvider(name = "input")

	public Object[][] data() {
		return new Object[][] { { "india" }, { "bangladesh" } };

	}

}
