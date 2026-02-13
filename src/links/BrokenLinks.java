package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	List<WebElement> li = driver.findElements(By.tagName("a"));
	int countOfSize = li.size();
	System.out.println(countOfSize);
	
	for(int i=0;i<countOfSize; i++) {
	WebElement links = li.get(i);
	String linksValue = links.getAttribute("href");
	System.out.println(linksValue);
	verifyLinks(linksValue);
	
	}
	}
    public static void verifyLinks(String linksValue) throws IOException {
    	URL url = new URL(linksValue);
    	HttpURLConnection  u1 = (HttpURLConnection) url.openConnection();
    	if(u1.getResponseCode() == 200) {
    		System.out.println("It is valid links." + u1.getResponseMessage() + "  " + u1.getResponseCode());
    	}
    	else {
    		System.out.println("It is not a valid links.");
    	}
    	
    }
}
