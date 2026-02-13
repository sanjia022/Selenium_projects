package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonBrokenLinks {

	public static void main(String[] args) throws IOException {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	List<WebElement> li = driver.findElements(By.tagName("a"));
	int countOfSize = li.size();
	System.out.println(countOfSize);
	
	for(int i=0;i<countOfSize; i++) {
	WebElement links = li.get(i);
	String url = links.getAttribute("href");
	System.out.println(url);
	verifyLinks(url);
	
	}
	}
    public static void verifyLinks(String url) throws IOException {
    	try{
    		URL url1 = new URL(url);
    	
    	HttpURLConnection  u1 = (HttpURLConnection) url1.openConnection();
    	if(u1.getResponseCode() == 200) {
    		System.out.println("It is valid links." + u1.getResponseMessage() + "  " + u1.getResponseCode());
    	}
    	else {
    		System.out.println("It is not a valid links.");
    	}
    	}
    	catch(MalformedURLException e) {
    		System.out.println("handled it");
    		e.printStackTrace();
    	}

	}

}
