package TestNgPractise;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GoogleSearch extends LaunchAndQuit {
	 @Test ()
	 
	 public void link() throws InterruptedException, IOException {
	List<WebElement> links =	 driver.findElements(By.tagName("a"));
	
	int countOfLinks = links.size();
	
	
	for(int i = 0; i<countOfLinks; i++) {
		WebElement e1 = links.get(i);	
		String url = e1.getAttribute("href");
		System.out.println("The Total count of links is " + url);
		verifyLinks(url);
	}
	 }
	 
    @Test()
    public void search() {
	WebElement search = 	driver.findElement(By.xpath("//textarea[@class='gLFyf']"));

	search.sendKeys("I am the king");
	//Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> lists =  driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	int count = lists.size();
	System.out.println("The Total count of lists element is " + count);
	lists.get(count -6).click();
	
	
	 }
	 public void verifyLinks(String url) throws IOException {
		 URL u1 = new URL(url);
		 HttpsURLConnection u2 = (HttpsURLConnection) u1.openConnection();
		 if(u2.getResponseCode() == 200) {
			 System.out.println("It is a valid link" + u2.getResponseMessage());
		 }
		 else {
			 System.out.println("It is a invalid link");
		 }
	 }

}
