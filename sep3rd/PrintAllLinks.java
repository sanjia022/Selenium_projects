package sep3rd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i = 0; i<=list.size(); i++) {
			
		WebElement e1 =  list.get(i);
		String url = e1.getAttribute("href");
		String text = e1.getText();
		System.out.println(url);
		System.out.println(text);
		}

	}

}
