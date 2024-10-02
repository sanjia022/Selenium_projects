package selenium_Project;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launching_Browsers {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Thread.sleep(3000);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.close();
		
		
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("http://www.edge.com");
		driver1.close();
		
		
		FirefoxDriver  driver2 = new FirefoxDriver();
		driver2.get("http://www.firefox.com");
		driver2.close();
		
		


	}

}
