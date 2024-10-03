package DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestin3 {
	@Test(dataProvider = "inputs")
	public void method(String input) {
	
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.in/");
	WebElement e1 =driver.findElement(By.id("twotabsearchtextbox"));
	
	e1.sendKeys(input);
	driver.close();

}
	@DataProvider(name= "inputs")
	public Object[][] data1(){
		return new Object[][] {{"shoe"},{"bag"},{"mug"},{"laptop"},{"phone"},{"watch"},{"tissue Holder"}};
	
}
	
}