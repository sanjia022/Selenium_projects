package august29;
/*Assignment 92 In the grotechminds.com/drag-and-drop/,  drag the postman and drop it at droppable zone
 * */
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment92DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1 = driver.findElement(By.xpath("//div[@id ='container-6']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id ='div2']"));
		
		Actions a1 = new Actions (driver);
		a1.dragAndDrop(e1, e2).perform();
		a1.dragAndDrop(e2, e1).perform();
		driver.close();
		
		

	}

}
