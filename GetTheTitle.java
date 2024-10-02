package selenium_Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheTitle {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
