package sept9th;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBroswer {
	WebDriver driver ;
	@Test
	
	public void LaunchBrowser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("type 1 for chrome browser");
		System.out.println("type 2 for edge browser");
		System.out.println("type 3 for firebox browser");
	
		int input =scanner.nextInt();
		if(input ==1) {
	driver = new ChromeDriver();
	}
		if(input ==2) {
			driver = new EdgeDriver();
			}
		if(input ==3) {
			driver = new FirefoxDriver();
			}
		scanner.close();
	}
}
