package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksPresents {
	
	@Test 
	public void links() throws IOException  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		int count = l1.size();
		
		
		for(int i=0; i<count; i++) {
			WebElement w1 = l1.get(i);
			String url = w1.getAttribute("href");
			System.out.println(url);
			verifyLinks(url);
		}
		
		
		driver.quit();
		
	}
	public static void verifyLinks(String url) throws IOException {
		URL u1 = new URL(url);
		HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
		
		if(u2.getResponseCode()==200) {
			System.out.println("It is valid link" + " " +u2.getResponseMessage());
		}
		else {
			System.out.println("It is a invalid link.");
		}
	}

}
