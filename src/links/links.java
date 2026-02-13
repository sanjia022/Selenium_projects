package links;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	static ChromeDriver driver = new ChromeDriver();

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		
	
		
		int numberofLinks = lists.size();
		System.out.println("The number of links present in the website is:" + numberofLinks);
		
		
		for(int i =0;i<numberofLinks; i++) {
		WebElement e1= lists.get(i);
		String url=e1.getAttribute("href");
		System.out.println(url);
		verifyLink(url);
		
		}
	}
		public static void verifyLink(String url) throws IOException {
			URL u1 = new URL(url);
			HttpsURLConnection c1 = (HttpsURLConnection) u1.openConnection();
			if(c1.getResponseCode()==200) {
				System.out.println("it is a valid link" + c1.getResponseMessage() );
			}
			else {
				System.out.println("it is a invalid link" );
			}
		
		}
		
		

	}


