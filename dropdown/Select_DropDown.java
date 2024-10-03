package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement selectitems = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(selectitems);
		//s1.selectByIndex(0);

		//s1.selectByVisibleText("Amazon Fresh");
		s1.selectByValue("search-alias=nowstore");
	}

}
