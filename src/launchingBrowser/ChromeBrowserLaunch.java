package launchingBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowserLaunch {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
         Scanner s1 = new Scanner (System.in);
         System.out.println("Enter 1 for chrome browser");
         System.out.println("Enter 2 for edge browser");
        int ans =  s1.nextInt();
        
        switch(ans) {
        case 1 :driver = new ChromeDriver();
        break;
        case 2 :driver = new EdgeDriver();
        break;
        default:System.out.println("write the right answer");
        }
		
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Thread.sleep(3000);
s1.close();
		driver.close();

	}

}
