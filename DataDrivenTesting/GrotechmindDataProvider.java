package DataDrivenTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GrotechmindDataProvider {
	
	@Test(dataProvider = "inputs")
	
	public void method1(String fname,String lname, String email, String password, String address1, String address2, String zipCode) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.name("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//textarea[@class = 'Present-Address form-control']")).sendKeys(address1);
		driver.findElement(By.className("Permanent-Address form-control")).sendKeys(address2);
		driver.findElement(By.name("Pincode")).sendKeys(zipCode);
		driver.findElement(By.name("Submit")).click();
		
		driver.close();

		
		
		
		
	}
	@DataProvider(name = "inputs")
	public Object[] method1() {
	Object[][] e1 = new Object[5][7];
	
	//1st set of data
	e1[0][0] = "sanjia";
	e1[0][1] = "amreen";
	e1[0][2] = "sanjia.amreen@gmail.com";
	e1[0][3] = "";
	e1[0][4] = "918 cgahrj";
	e1[0][5] = "hdskl12";
	e1[0][6] = "28098";		
	//2nd set of data
	e1[1][0] = "";
	e1[1][1] = "";
	e1[1][2] = "";
	e1[1][3] = "";
	e1[1][4] = "";
	e1[1][5] = "";
	e1[1][6] = "";
	////3rd set of data
	e1[2][0] = "";
	e1[2][1] = "";
	e1[2][2] = "";
	e1[2][3] = "";
	e1[2][4] = "";
	e1[2][5] = "";
	e1[2][6] = "";
  //4th set of data
	e1[3][0] = "";
	e1[3][1] = "";
	e1[3][2] = "";
	e1[3][3] = "";
	e1[3][4] = "";
	e1[3][5] = "";
	e1[3][6] = "";
   //5th set of data
	e1[4][0] = "";
	e1[4][1] = "";
	e1[4][2] = "";
	e1[4][3] = "";
	e1[4][4] = "";
	e1[4][5] = "";
	e1[4][6] = "";
	return e1;
	}
}
