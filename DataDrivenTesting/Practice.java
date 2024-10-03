package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {
	
	@Test (dataProvider = "inputs")
	public void practice(String number) {
		System.out.println(number);
	}
	
	@DataProvider(name = "inputs")
	
	public Object[][] nameOftheMethode(){
		return new Object[][] {{"1"},{"2"},{"3"},{"4"}};
	}

}
