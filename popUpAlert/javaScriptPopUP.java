package popUpAlert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptPopUP {

	public static void main(String[] args) {
	
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("C:/Users/RC-PC/Downloads/learningHTML1%20(1).html");
		
		//need to handle the javascript pop up
		driver.switchTo().alert().accept();
		WebElement e1 = driver.findElement(By.id("1"));
		e1.sendKeys("manish");

	}

}
