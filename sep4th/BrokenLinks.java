package sep4th;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
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
		verifyLinks(url);

	}
		}
	
	static void verifyLinks(String url) throws IOException {
		URL n1 = new URL(url);
		HttpsURLConnection n2 = (HttpsURLConnection) n1.openConnection();
		if(n2.getResponseCode() == 200) {
			System.out.println("Valid Link " + n2.getResponseMessage() + " " + n2.getResponseCode() );
		}
		else {
			System.out.println("Invalid Link");
		}
	}

}
