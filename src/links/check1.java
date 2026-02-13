package links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check1 {

	
		  static  WebDriver driver;
			public static void main(String[] args) throws IOException 
			{
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.xpath("//input[@name='q']"));
			e1.sendKeys("shoe"); 
			List<WebElement> li=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
			int count=li.size();
			System.out.println("Total no.of elements "+count);
			li.get(count-5).click();
		    List<WebElement>l1=driver.findElements(By.tagName("a"));
			 int No_of_links=l1.size();
			System.out.println("Total no of links "+No_of_links ); 
			for(int i=0;i<No_of_links;i++)
			{
				WebElement e3=l1.get(i);
				String url=e3.getAttribute("href");
				String text=e3.getText();
				System.out.println(url);
				System.out.println(text);
				Verify_link(url);
			}
			}
			 public static void Verify_link (String url) throws IOException
			{
				URL u1=new URL(url);
				HttpURLConnection u2= (HttpURLConnection ) u1.openConnection();
				if(u2.getResponseCode()==200)
				{
					System.out.println("Valid link "+ u2.getResponseMessage()+" "+u2.getResponseCode());
				}
				else
				{
					System.out.println("InValid link "+ u2.getResponseMessage()+" "+u2.getResponseCode());
				}
			}
		

	}


