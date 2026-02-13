package TestNg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    int currentCount = 0;
    int noOfRetry = 1;
	@Override
	public boolean retry(ITestResult result) {
		if(currentCount<noOfRetry) {
			currentCount++;
			return true; /// retry
		}
		return false;// dpnt retry
	}

}
