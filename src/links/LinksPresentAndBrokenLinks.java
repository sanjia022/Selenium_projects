package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksPresentAndBrokenLinks {

	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		int count = lists.size();
		System.out.println(count);
		
		for(int i=0; i<count;i++) {
			WebElement e1 = lists.get(i);
			String url = e1.getAttribute("href");
			verifyLink(url);
		}
		

	}
	public static void verifyLink(String url) throws IOException {
		URL u1 = new URL(url);
		HttpURLConnection h1 =  (HttpURLConnection) u1.openConnection();
		if(h1.getResponseCode() ==200) {
			System.out.println("it is a valid link");
		}
		else {
			System.out.println("it is not a valid link");
		}
		
		
		
	}

}
