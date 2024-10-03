package sep10th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Parallal {
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void testCase1(String nameOfBrowser) {
		
		if(nameOfBrowser.equals("Chrome")){
			driver = new ChromeDriver();
		}
		if(nameOfBrowser.equals("edge")){
			driver = new EdgeDriver();
		}
		driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    WebElement e1 =driver.findElement(By.xpath("(//div[@class = 'yt-spec-touch-feedback-shape__fill'])[4]"));
        e1.click();
        driver.close();
	    }
	}
	


