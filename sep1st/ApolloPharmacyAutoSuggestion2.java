package sep1st;
/*
 * Assignment 101 -  WAP to launch the Apollo pharmacy and search for "PCM" and select the 
 * fourth option by using AutoSuggestion 
 */
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ApolloPharmacyAutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/?srsltid=AfmBOoq4eoi-EqlZmOTRUlkoKiWbj0vR9gspB1DMCOc-UAjuqRPbh0np");
		WebElement e1 = driver.findElement(By.xpath("//div[@class = 'SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id = 'searchProduct']"));
		e2.sendKeys("PCM");
		Thread.sleep(3000);
	    
		List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		System.out.println(list.size());
		
		list.get(3).click();
		
		TakesScreenshot s1 = driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\RC-PC\\Pictures\\Screenshots\\passTC.png");
	    FileHandler.copy(source, destination);
	
	}

}
