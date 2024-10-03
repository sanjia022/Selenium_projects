package august29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Assignment 90 On  https://grotechminds.com/automate-me/, hoverover flight application*/
public class Assignment90 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		WebElement e1 = driver.findElement(By.className("elementor-flip-box__layer__overlay"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement a2 = driver.findElement(By.xpath("(//a[@class = 'elementor-flip-box__button elementor-button elementor-size-sm'])[2]"));
		a2.click();
		driver.close();

	}

}
