package timeoutparameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class timeoutParameter {
	
	@Test(timeOut = 5000)
	public void method() {
	 ChromeDriver driver = new ChromeDriver ();
     driver.get("https://www.amazon.in/");
     WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
     Select s1 = new Select(e1);
     //s1.selectByVisibleText("Books");
     s1.selectByValue("search-alias=stripbooks");
    // s1.selectByIndex(10);
     driver.close();
}
}