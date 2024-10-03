package Group_testNG;

import org.testng.annotations.Test;

public class grouping_testCases {
	
	@Test(groups = {"smoke"})
	
	public void testCase1() {
		
	}
	@Test(groups = {"smoke","system"})
    public void testCase2() {
		
	}
	@Test(groups = {"sanity"})
    public void testCase3() {
		
	}
	@Test(groups = {"smoke", "system"})
    public void testCase4() {
		
	}
	@Test(groups = {"smoke"})
    public void testCase5() {
		
	}

}
