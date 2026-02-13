package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechMindBrokenlinks {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++) {
			WebElement e1 =li.get(i);
			String url = e1.getAttribute("href");
			System.out.println(url);
			varifyLinks(url);
			driver.close();
		}
	}
		public static void varifyLinks(String url) throws IOException {
			URL u1 = new URL(url);
			HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
			if(u2.getResponseCode() ==200) {
				System.out.println("it is a valid link" + u2.getResponseMessage());
			}
			else {
				System.out.println("It is not a valid link");
			}
			
		}
		
		
	}


