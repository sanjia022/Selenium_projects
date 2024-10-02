package selenium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment 74 On Youtube application Click on the sign in button*/
public class Assignment74 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    WebElement e1 =driver.findElement(By.xpath("(//div[@class = 'yt-spec-touch-feedback-shape__fill'])[4]"));
        e1.click();
        driver.close();
	}

}
