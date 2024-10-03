package Retry_logic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic1 implements IRetryAnalyzer  {
 int currentCount = 0;
 int numberForReTry = 2;
	@Override
	public boolean retry(ITestResult result) {
		if(currentCount<numberForReTry) {
			currentCount++;
			return true;
		}
		return false;
	}
	
	

}
