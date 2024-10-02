package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraMenCorner {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.myntra.com/");
	    WebElement z1 = driver.findElement(By.linkText("MEN"));
	    z1.click();
	    driver.close();
        // right click disable here. so we need to click F12 button to bring the inspect mode on. then click arrow button on inspect 
	    //mode area on left side then click on the major tab where you want to work on 
	}

}
