package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting2 {
	
	@Test(dataProvider = "data1")
	public void method2(int data) {
		System.out.println(data);
		
	}
	@DataProvider(name= "data1")
	public Object[][] datainput(){
		return new Object[][] {{12},{34},{56}};
	}

}
