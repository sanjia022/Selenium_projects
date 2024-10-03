package Headless;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ChromeBrowserHeadless {
	
	public static void main(String[] args) {
		
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);

}
}